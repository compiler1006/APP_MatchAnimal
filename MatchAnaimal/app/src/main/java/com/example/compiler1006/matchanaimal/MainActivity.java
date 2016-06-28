package com.example.compiler1006.matchanaimal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtLogin;
    private EditText txtId;
    private EditText txtPassword;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLogin = (TextView) findViewById(R.id.txtLogin);
        txtId    = (EditText) findViewById(R.id.txtId);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        txtLogin.setText("請登入：");
        btnLogin.setOnClickListener(new View.OnClickListener() {//onclick點一下動作
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("accountId", txtId.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);


            }

        });
    }

}

