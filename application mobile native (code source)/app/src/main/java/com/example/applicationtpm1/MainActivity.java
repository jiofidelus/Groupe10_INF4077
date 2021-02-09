package com.example.applicationtpm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.button);
        LinearLayout layout = findViewById(R.id.gopagevideo);
        LinearLayout layout2 = findViewById(R.id.gopagevideo33);
        LinearLayout layout3 = findViewById(R.id.gopagevideo2);
        LinearLayout layout4 = findViewById(R.id.gopagevideo4);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });


        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitysms();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


    public void openActivity4() {
        Intent intent = new Intent(this, MainsmsActivity.class);
        startActivity(intent);
    }
    public void openActivity5() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, Mainsong3Activity.class);
        startActivity(intent);
    }


    public void openActivitysms() {
        Intent intent = new Intent(this, MainsmsActivity.class);
        startActivity(intent);
    }

}
