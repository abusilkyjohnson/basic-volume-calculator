package com.example.volumecalculatormath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class rect_prism_calc_pg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rect_prism_calc_pg);

        Button submit = findViewById(R.id.submitButtRectPrism);
        EditText lengthXML = findViewById(R.id.lengthRectPrism);
        EditText widthXML = findViewById(R.id.widthRectPrism);
        EditText heightXML = findViewById(R.id.hieghtRectPrism);
        TextView resultXML = findViewById(R.id.resultRectPrism);

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

                Toast.makeText(rect_prism_calc_pg.this,"The rectangular prism volume is "+ resultNum ,Toast.LENGTH_SHORT).show();

            }
        });
    }
}