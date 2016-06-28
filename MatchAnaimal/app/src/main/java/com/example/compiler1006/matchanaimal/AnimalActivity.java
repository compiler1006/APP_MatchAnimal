package com.example.compiler1006.matchanaimal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity {

    private EditText boy_year_animal;
    private EditText girl_year_animal;
    private Button counter;
    private TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal);

        boy_year_animal = (EditText) findViewById(R.id.boy_year_animal);
        girl_year_animal = (EditText) findViewById(R.id.girl_year_animal);
        txtresult = (TextView) findViewById(R.id.txtresult);
        counter = (Button) findViewById(R.id.counter);
        counter.setOnClickListener(new View.OnClickListener() {//onclick點一下動作//(v)Android Studio把東西收起來
            @Override//去覆寫爸爸的那個方法，下面的onClick的方法
            public void onClick(View v) {
                String boy_value = boy_year_animal.getText().toString();
                String girl_value = girl_year_animal.getText().toString();
                String boy_result = guessAnimal(Integer.valueOf(boy_value));
                String girl_result = guessAnimal(Integer.valueOf(girl_value));
                int result_int = matchAnimal(boy_result, girl_result);
                String result_str = "男生是" + boy_result + "\n女生是" + girl_result + "\n結果為：";
                String result = "";
                if (result_int == 1)
                    result += "合";
                else if (result_int == 0)
                    result += "不合";
                else
                    result += "普通";
                txtresult.setText(result_str + result);


            }




        });
    }

    private String guessAnimal(int value) {
        String result = "";
        switch (value % 12) {

            case 0:
                result = "猴";
                break;

            case 1:
                result = "雞";
                break;

            case 2:
                result = "狗";
                break;

            case 3:
                result = "豬";
                break;

            case 4:
                result = "鼠";
                break;

            case 5:
                result = "牛";
                break;

            case 6:
                result = "虎";
                break;

            case 7:
                result = "兔";
                break;

            case 8:
                result = "龍";
                break;

            case 9:
                result = "蛇";
                break;

            case 10:
                result = "馬";

                break;

            case 11:
                result = "羊";
                break;
        }
        return result;
    }

    private int matchAnimal(String boy_animal, String girl_animal) {
        int result = 0;
        switch (boy_animal) {
            case "鼠":
                if (girl_animal.equals("羊") || girl_animal.equals("馬") || girl_animal.equals("兔") || girl_animal.equals("雞"))
                    result = 0;
                else if (girl_animal.equals("龍") || girl_animal.equals("猴") || girl_animal.equals("牛"))
                    result = 1;
                else
                    result = 3;
                break;
            case "牛":
                if (girl_animal.equals("龍") || girl_animal.equals("馬") || girl_animal.equals("羊") || girl_animal.equals("狗"))
                    result = 0;
                else if (girl_animal.equals("鼠") || girl_animal.equals("蛇") || girl_animal.equals("雞"))
                    result = 1;
                else
                    result = 3;
                break;
            case "虎":
                if (girl_animal.equals("鼠") || girl_animal.equals("猴"))
                    result = 0;
                else if (girl_animal.equals("馬") || girl_animal.equals("狗") || girl_animal.equals("豬"))
                    result = 1;
                else
                    result = 3;
                break;
            case "兔":
                if (girl_animal.equals("鼠") || girl_animal.equals("牛") || girl_animal.equals("龍") || girl_animal.equals("雞"))
                    result = 0;
                else if (girl_animal.equals("羊") || girl_animal.equals("狗") || girl_animal.equals("豬"))
                    result = 1;
                else
                    result = 3;
                break;
            case "龍":
                if (girl_animal.equals("牛") || girl_animal.equals("兔") || girl_animal.equals("狗") || girl_animal.equals("龍"))
                    result = 0;
                else if (girl_animal.equals("鼠") || girl_animal.equals("猴") || girl_animal.equals("雞"))
                    result = 1;
                else
                    result = 3;
                break;
            case "蛇":
                if (girl_animal.equals("虎") || girl_animal.equals("猴") || girl_animal.equals("豬"))
                    result = 0;
                else if (girl_animal.equals("牛") || girl_animal.equals("雞"))
                    result = 1;
                else
                    result = 3;
                break;
            case "馬":
                if (girl_animal.equals("鼠") || girl_animal.equals("牛") || girl_animal.equals("兔") || girl_animal.equals("馬"))
                    result = 0;
                else if (girl_animal.equals("虎") || girl_animal.equals("羊") || girl_animal.equals("狗"))
                    result = 1;
                else
                    result = 3;
                break;
            case "羊":
                if (girl_animal.equals("鼠") || girl_animal.equals("牛") || girl_animal.equals("狗"))
                    result = 0;
                else if (girl_animal.equals("兔") || girl_animal.equals("馬") || girl_animal.equals("豬"))
                    result = 1;
                else
                    result = 3;
                break;

            case "猴":
                if (girl_animal.equals("虎") || girl_animal.equals("蛇") || girl_animal.equals("豬"))
                    result = 0;
                else if (girl_animal.equals("鼠") || girl_animal.equals("龍"))
                    result = 1;
                else
                    result = 3;
                break;
            case "雞":
                if (girl_animal.equals("鼠") || girl_animal.equals("兔") || girl_animal.equals("雞") || girl_animal.equals("狗"))
                    result = 0;
                else if (girl_animal.equals("牛") || girl_animal.equals("龍") || girl_animal.equals("蛇"))
                    result = 1;
                else
                    result = 3;
                break;
            case "狗":
                if (girl_animal.equals("牛") || girl_animal.equals("龍") || girl_animal.equals("羊") || girl_animal.equals("雞"))
                    result = 0;
                else if (girl_animal.equals("虎") || girl_animal.equals("兔") || girl_animal.equals("馬"))
                    result = 1;
                else
                    result = 3;
                break;
            case "豬":
                if (girl_animal.equals("蛇") || girl_animal.equals("猴") || girl_animal.equals("豬"))
                    result = 0;
                else if (girl_animal.equals("羊") || girl_animal.equals("兔") || girl_animal.equals("虎"))
                    result = 1;
                else
                    result = 3;
                break;

        }

        return result;
    }
}