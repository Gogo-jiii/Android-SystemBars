package com.example.systembars;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnShowStatusbar, btnShowNavigationbar, btnHideStatusbar, btnHideNavigationbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowStatusbar = findViewById(R.id.btnShowStatusbar);
        btnShowNavigationbar = findViewById(R.id.btnShowNavigationbar);

        btnHideStatusbar = findViewById(R.id.btnHideStatusbar);
        btnHideNavigationbar = findViewById(R.id.btnHideNavigationbar);

        btnShowStatusbar.setOnClickListener(this);
        btnShowNavigationbar.setOnClickListener(this);
        btnHideStatusbar.setOnClickListener(this);
        btnHideNavigationbar.setOnClickListener(this);
    }

    @Override public void onClick(View v) {
        View decorView = this.getWindow().getDecorView();
        int uiOptions;

        switch (v.getId()) {
            case R.id.btnShowStatusbar:
                decorView.setSystemUiVisibility(0);
                break;

            case R.id.btnHideStatusbar:
                uiOptions = View.SYSTEM_UI_FLAG_LOW_PROFILE;
                decorView.setSystemUiVisibility(uiOptions);
                break;

            case R.id.btnShowNavigationbar:
                uiOptions = View.SYSTEM_UI_FLAG_VISIBLE;
                decorView.setSystemUiVisibility(uiOptions);
                break;

            case R.id.btnHideNavigationbar:
                uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView.setSystemUiVisibility(uiOptions);
                break;
        }
    }
}