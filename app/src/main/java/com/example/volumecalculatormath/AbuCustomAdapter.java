package com.example.volumecalculatormath;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

//using a custom adapter since we need the image and text and basic adapter wont work with our need
public class AbuCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList;
    Context context;// represent the current state and enviro  to ur app
                    // provides access to resources n srvices i need to interact with
                    // in the case its creating our inflating view


    public AbuCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) //i edited the parameters
    {
        //super here is referring to the parent of this class the arrayadapter since its extending
        super(context, R.layout.grid_layout,shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    //View Holder: Used to cache references to the view with an item layout
    private static class MyViewHolder{

        TextView shapeName;
        ImageView shapeImg;
    }

    //GetView(): Used to create and return the view for a specific item in grid
    //             This method will check if a recycled view view that went off the screen is available
    //             If it is not, you inflate a new layout and create a Viewholder instance.
    //              If a recycled view is available, you simply update the data in the existing view holder and reuse it.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //1-Get shape object for curr pos
        Shape shapes = getItem(position);

        //2- Inflating Layout
        MyViewHolder myViewHolder;

        if(convertView == null)
        {
            //so no view on screen therefore make one
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            //create the xml file and assign it to our inflate mehtod and turns it to heiracy veiw object we can interact with

            convertView = inflater.inflate(
                    R.layout.grid_layout,
                    parent,false
            );
            //finding the views
            myViewHolder.shapeName = (TextView)convertView.findViewById(R.id.sampleTextView);
            myViewHolder.shapeImg = (ImageView)convertView.findViewById(R.id.sampleImageView);

            //settag:attachs custom data object(tag: can be any object/model/id etc) to a view
            convertView.setTag(myViewHolder);

        }
        else
        {
            //a view off-screen so we reuse it
            //get tag: use to retireve tag associated with a view allow us to access data
            //from set tag later
            myViewHolder = (MyViewHolder) convertView.getTag();

        }

        //getting the data from model class
        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeImg());

        return convertView;


    }
}
