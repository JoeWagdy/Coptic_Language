package com.joewagdy.copticlanguage;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void letterClicked(View view) {
        Intent intent = new Intent(this,letterActivity.class);
        intent.putExtra("tag", view.getTag().toString());
        startActivity(intent);
    }
}
