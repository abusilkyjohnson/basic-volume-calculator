package com.example.volumecalculatormath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

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
        Shape s1 = new Shape(R.drawable.cube, "Cube");
        Shape s2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape s3 = new Shape(R.drawable.rectangularprism,"Rect Prism");
        Shape s4 = new Shape(R.drawable.sphere,"Sphere");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        //S3
        adapter = new AbuCustomAdapter(shapeArrayList,getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);//this to make 2 colums could also do it in xml file attributes;
    }
}