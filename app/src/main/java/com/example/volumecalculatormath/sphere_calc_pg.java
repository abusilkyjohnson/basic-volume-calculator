package com.example.volumecalculatormath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sphere_calc_pg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_calc_pg);

        int radius;
        Button submit = findViewById(R.id.submitButtSphere);
        EditText userInputXml = findViewById(R.id.userInputSphere);
        TextView resultXML = findViewById(R.id.resultSphere);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userInputXmlString = userInputXml.getText().toString();
                double userInputNum = Double.parseDouble(userInputXmlString);
                double resultNum = (4.0/3.0)*(Math.PI)*(Math.pow(userInputNum,3));

                resultXML.setText(" " + resultNum);

                Toast.makeText(sphere_calc_pg.this,"The sphere volume is "+ resultNum ,Toast.LENGTH_SHORT).show();

            }
        });
    }
}