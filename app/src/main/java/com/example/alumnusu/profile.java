package com.example.alumnusu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void editProfil(View view) {
        Intent i = new Intent(getApplicationContext(), edit_profile.class);
        startActivity(i);
    }
}