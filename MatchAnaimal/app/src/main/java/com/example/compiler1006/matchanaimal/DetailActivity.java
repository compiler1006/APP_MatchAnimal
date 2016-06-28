package com.example.compiler1006.matchanaimal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView txtMessage;
    private Button   btn_animal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtMessage = (TextView) findViewById(R.id.txtMessage);
        Bundle bundle=this.getIntent().getExtras();
        String accountId=bundle.getString("accountId");
        txtMessage.setText(accountId+"登入成功");


        btn_animal = (Button) findViewById(R.id.btn_animal);
        btn_animal.setOnClickListener(new View.OnClickListener() {//onclick點一下動作
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(DetailActivity.this, AnimalActivity.class);
                startActivity(intent);
            }

        });




    }

  /*  @Override
    protected void onResume() {
        super.onResume();*/

    }
//}
