package com.micky.it.quiz1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button5);
        btn2 = (Button)findViewById(R.id.button6);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);

                Context context = getApplicationContext();
                SharedPreferences share = context.getSharedPreferences("share",context.MODE_PRIVATE);

                //Write a shared data
                SharedPreferences.Editor editor = share.edit();
                editor.putInt("Need Register Fist",100);
                editor.commit();

                //Read
                int highscore = share.getInt("Need Register Fist",-1);

                Toast toast = Toast.makeText(context,""+highscore,Toast.LENGTH_LONG);
                toast.show();
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(intent);

            }
        });
    }

}


