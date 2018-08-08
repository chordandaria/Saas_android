package com.chord.saas_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chord.saas_android.login_part.LoginActivity;

public class IndexActivity extends AppCompatActivity implements View.OnClickListener{
    private Button login;
    private Button shop;
    private Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        login=findViewById(R.id.btn_tologin);
        shop=findViewById(R.id.btn_toshop);
        info=findViewById(R.id.btn_toinfo);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId())
        {
            case R.id.btn_tologin:
                intent=new Intent(IndexActivity.this, LoginActivity.class);
                break;
        }
        startActivity(intent);
    }
}
