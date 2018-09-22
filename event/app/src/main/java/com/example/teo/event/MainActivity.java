package com.example.teo.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSum;
    private TextView soA,soB,tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soA = findViewById(R.id.soA);
        soB = findViewById(R.id.soB);
        tvKQ = findViewById(R.id.tvKQ);


        btnSum = findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int a = Integer.parseInt(soA.getText().toString());
//                int b = Integer.parseInt(soB.getText().toString());
//                int sum;
//
//                sum = a+b;
//                tvKQ.setText(" " + sum);
            }
        });
        btnSum.setOnClickListener(this);
    }

    public void tong(View view) {
//        int a = Integer.parseInt(soA.getText().toString());
//        int b = Integer.parseInt(soB.getText().toString());
//        int sum;
//
//        sum = a+b;
//        tvKQ.setText(" " + sum) ;
    }

    @Override
    public void onClick(View view) {
        int a = Integer.parseInt(soA.getText().toString());
        int b = Integer.parseInt(soB.getText().toString());
        int sum ;

        sum = a+b;
        tvKQ.setText(" " + sum);
    }
}
