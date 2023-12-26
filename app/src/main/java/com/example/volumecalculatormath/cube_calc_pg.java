package com.example.volumecalculatormath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cube_calc_pg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_calc_pg);

        Button submit = findViewById(R.id.submitButtCube);
        EditText lengthXML = findViewById(R.id.lengthCube);
        EditText widthXML = findViewById(R.id.widthCube);
        EditText heightXML = findViewById(R.id.hieghtCuube);
        TextView resultXML = findViewById(R.id.resultCube);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lengthInputXmlString = lengthXML.getText().toString();
                String widthInputXmlString = widthXML.getText().toString();
                String hieghInputXmlString = heightXML.getText().toString();
                double lengthInputNum = Double.parseDouble(lengthInputXmlString);
                double widthInputNum = Double.parseDouble(widthInputXmlString);
                double heightInputNum = Double.parseDouble(hieghInputXmlString);

                double resultNum = heightInputNum * lengthInputNum * widthInputNum;

                resultXML.setText(" " + resultNum);

                Toast.makeText(cube_calc_pg.this,"The cube volume is "+ resultNum ,Toast.LENGTH_SHORT).show();

            }
        });
    }
}