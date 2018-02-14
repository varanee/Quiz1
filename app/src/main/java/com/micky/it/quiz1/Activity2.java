package com.micky.it.quiz1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    NumberPicker np2;
    NumberPicker np3;
    NumberPicker np4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        np2 = (NumberPicker) findViewById(R.id.numberPicker2);
        np3 = (NumberPicker) findViewById(R.id.numberPicker3);
        np4 = (NumberPicker) findViewById(R.id.numberPicker4);
        btn = (Button)findViewById(R.id.button3);

        final String[] data2 = {"1"};
        final String[] data3 = {"2"};
        final String[] data4 = {"3"};

        np2.setMinValue(0);

        np2.setMaxValue(data2.length - 1);

        np2.setDisplayedValues(data2);

        np3.setMinValue(0);

        np3.setMaxValue(data2.length - 1);

        np3.setDisplayedValues(data3);


        np4.setMinValue(0);

        np4.setMaxValue(data2.length - 1);

        np4.setDisplayedValues(data4);


        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker NumberPicker, int i, int i1) {
                int value = NumberPicker.getValue();

                int number = 0;

                if (value == 0) {
                    number = 1;

                } else {

                }

            }

        });
        np3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker NumberPicker, int i, int i1) {

                int value = NumberPicker.getValue();

                int number = 0;

                if (value == 0) {
                    number = 2;

                } else {

                }

            }

        });

        np4.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker NumberPicker, int i, int i1) {

                int value = NumberPicker.getValue();

                int number = 0;

                if (value == 0) {
                    number = 3;

                } else {

                }

            }

        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                Intent intent = new Intent(getApplicationContext(), Activity4.class);
                startActivity(intent);

            }
        });


    }
}
