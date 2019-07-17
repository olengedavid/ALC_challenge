package com.exam.alc_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button button;
//    private Toolbar myTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.Alc_page);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityB();

            }
        });

        button = findViewById(R.id.profile_C);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityC();
            }
        });

     //   Toolbar molar=findViewById(R.id.toolbar1);
     //   setActionBar(molar);
     //   getSupportActionBar().setTitle(Html.fromHtml("font face\"serif-monospace\">"
     //   +getString(R.string.app_name)+"</font>"));

    }
        public void openActivityC () {
            Intent intent = new Intent(this, ActivityC.class);
            startActivity(intent);
        }
        public void openActivityB () {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
        }


}


