package com.example.sujith.shared_preference_with_preferencemanager;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class M2 extends AppCompatActivity {

    TextView tvp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_m2);
            tvp=findViewById(R.id.tv);
        SharedPreferences sp=getApplicationContext().getSharedPreferences("spk",MODE_PRIVATE);
        String tve=sp.getString("k",null);
        tvp.setText(tve);
    }
}
