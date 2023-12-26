package com.example.volumecalculatormath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cylinder_calc_pg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_calc_pg);

        Button submit = findViewById(R.id.submitButtCylinder);
        EditText heightXML = findViewById(R.id.heightCylinder);
        EditText radiusXML = findViewById(R.id.radiusCylinder);
        TextView resultXML = findViewById(R.id.resultCylinder);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String radiusInputXmlString = radiusXML.getText().toString();
                String hieghInputXmlString = heightXML.getText().toString();
                double radiusInputNum = Double.parseDouble(radiusInputXmlString);
                double heightInputNum = Double.parseDouble(hieghInputXmlString);

                double resultNum = heightInputNum * Math.PI * Math.pow(2,radiusInputNum);

                resultXML.setText(" " + resultNum);

                Toast.makeText(cylinder_calc_pg.this,"The cube volume is "+ resultNum ,Toast.LENGTH_SHORT).show();

            }
        });


    }
}