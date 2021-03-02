package com.samsul.aplikasiresepmakanan.ui.loading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.samsul.aplikasiresepmakanan.R;
import com.samsul.aplikasiresepmakanan.ui.home.MainActivity;

public class LoadingActivity extends AppCompatActivity {

    private int waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(() -> {
            Intent home=new Intent(LoadingActivity.this, MainActivity.class);
            startActivity(home);
            finish();
        },waktu_loading);
    }
}