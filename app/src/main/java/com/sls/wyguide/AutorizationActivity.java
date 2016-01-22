package com.sls.wyguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class AutorizationActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_autorization;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initButtons();

    }

    private void initButtons()
    {

        ImageView btnGhost = (ImageView) findViewById(R.id.autorButtonGhost);
        btnGhost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
