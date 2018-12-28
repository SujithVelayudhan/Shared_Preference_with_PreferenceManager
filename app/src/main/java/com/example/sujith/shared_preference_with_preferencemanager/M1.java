package com.example.sujith.shared_preference_with_preferencemanager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class M1 extends AppCompatActivity {
    EditText ed1p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);
        ed1p=findViewById(R.id.ed1);

    }

    public void share(View view)
    {
        String ed1j=ed1p.getText().toString();
        SharedPreferences spm=PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor edm=spm.edit();
        edm.putString("key",ed1j);
        edm.apply();
        SharedPreferences sp=getApplicationContext().getSharedPreferences("spk",MODE_PRIVATE);
        SharedPreferences.Editor edit=sp.edit();
        edit.putString("k",ed1j);
        edit.apply();
        Intent i=new Intent(M1.this,M2.class);
        startActivity(i);


    }

    @Override
    protected void onResume()
    {
        SharedPreferences spm=PreferenceManager.getDefaultSharedPreferences(this);
        ed1p.setText(spm.getString("key",null));
        super.onResume();
    }
}
