package com.dxball.ashiq.mydxballgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        b1=(Button)findViewById(R.id.PLAY);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),GameCanvas.class);
                startActivity(i);
            }
        });

        b2=(Button)findViewById(R.id.EXIT);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);

            }
        });
    }
}
