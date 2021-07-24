package com.example.ooap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.Function;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    OLD Code 17/7/2021
    String msg = "PNRU : ";
    String name = "Chattongchai Logging";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Console.log
        Log.d(name, "loop Check");
//        Log.e(name, "e");
//        Log.i(name, "i");
//        Log.v(name, "v");
//        Log.w(name, "W");
//        MakeText Example
//        Implements Toast via Lifecycle Event
        Context context = getApplicationContext();
        CharSequence txt = "Hello Chattongchai";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context,txt, duration).show();
//

//    24 / 7 / 2021 การใช้ Implement, การสร้างปุ่ม, การกำหนด Function onClick 3 แบบ
//    Generate Global Button Component
        Button btn5, btn6, btn7, btn8, btn9, btn10;

// Create Button Property and Casting
//        Onclick มี 3แบบ 1 จากหน้า Design, 2 จากหน้า Main, 3 จากการ Impletments


        //    Onclick แบบที่ 1
//        onClickButton(v);

        //    Onclick แบบที่ 2
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn5.setText("Submit NewYork");
        btn5.setBackgroundColor(getColor(R.color.teal_700));
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Hello New York",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Manila",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Taipei",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });

//        แบบที่ 3
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String ans = button.getText().toString();
//        if(v.getId() == R.id.button8) {
//            ans = button.getText().toString();
//        } else if (v.getId() == R.id.button9) {
//            ans = button.getText().toString();
//        } else  {
//            ans = button.getText().toString();
//        }
        Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_SHORT).show();
    }

    public void onClickButton (View v) {
//        แบบที่ 1
        String ans = "";
        switch (v.getId()) {
            case R.id.button1: ans = "New York";
                break;
            case R.id.button2: ans = "Manila";
                break;
            case R.id.button3: ans = "Taipei";
                break;
            default: ans = "Please Try again";
        }
        Toast.makeText(MainActivity.this, ans, Toast.LENGTH_SHORT).show();
    }

//    onClick Handler Example
    public void clickFx(View view) {
        Toast.makeText(getApplicationContext(), "Hello",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "onPause()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "onResume()");
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Toast.makeText(MainActivity.this, "Are you soure ?", Toast.LENGTH_LONG).show();
    }
//
//    @Override
//    public void onClick(View v) {
//Toast.makeText(MainActivity.this, "Hello Implements", Toast.LENGTH_SHORT).show();
//    }
}