package com.example.volumecalculatormath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //each item in the grid view is represented by a layout

    //1. Adpater: GridView
    GridView gridView;
    //2. Data Source
    ArrayList<Shape> shapeArrayList;
    //3: Adapter(My Custom adapter
    AbuCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // S1
        gridView = findViewById(R.id.sampleGridView);
        // S2
        shapeArrayList = new ArrayList<>();
        Shape s1 = new Shape(R.drawable.sphere,"Sphere");
        Shape s2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape s3 = new Shape(R.drawable.rectangularprism,"Rect Prism");
        Shape s4 = new Shape(R.drawable.cube, "Cube");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        //S3
        adapter = new AbuCustomAdapter(shapeArrayList,getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);//this to make 2 columns could also do it in xml file attributes;

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                // the position parameter refer to the order we filled our arraylist and start at 0
                if(position == 0)
                {
                    //getcontext we could have also use "this" keyword in place
                    Intent sphereI = new Intent(getApplicationContext(),sphere_calc_pg.class);
                    startActivity(sphereI);

                }
                if(position == 1)
                {
                    //getcontext we could have also use "this" keyword in place
                    Intent cylinderI = new Intent(getApplicationContext(), cylinder_calc_pg.class);
                    startActivity(cylinderI);

                }
                if(position == 2)
                {
                    //getcontext we could have also use "this" keyword in place
                    Intent rectPrismI = new Intent(getApplicationContext(), rect_prism_calc_pg.class);
                    startActivity(rectPrismI);

                }
                if(position == 3)
                {
                    //getcontext we could have also use "this" keyword in place
                    Intent cubeI = new Intent(getApplicationContext(), cube_calc_pg.class);
                    startActivity(cubeI);

                }
            }
        });

    }
}