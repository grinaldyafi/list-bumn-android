package com.grinaldyafi.daftarbumn;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;

import androidx.appcompat.app.AppCompatActivity;




public class splashscreen extends AppCompatActivity {

    private Intent MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);




        int SPLASH_SCREEN_TIME = 3000; //3 detik

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,MainActivity.class);
                splashscreen.this.startActivity(intent);
                splashscreen.this.finish();
            }
        }, SPLASH_SCREEN_TIME);
    }
}
