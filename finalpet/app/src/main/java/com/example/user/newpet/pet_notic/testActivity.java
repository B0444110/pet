package com.example.user.newpet.pet_notic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.user.newpet.R;
import com.example.user.newpet.dummy.question;

import java.util.Random;

public class testActivity extends AppCompatActivity {
    RadioButton an1, an2, an3, an4;
    TextView score,questionn;
    private question mquestions=new question();

    private String manswer;
    private int mscore=0;
    private int mquestionsLength=mquestions.mquestions.length;
    Random r;
    private void updateQuestion(int num){
        questionn.setText(mquestions.getquestion(num));
        an1.setText(mquestions.getchoice1(num));
        an2.setText(mquestions.getchoice2(num));
        an3.setText(mquestions.getchoice3(num));
        an4.setText(mquestions.getchoice4(num));
        manswer=mquestions.getcorrect(num);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        r=new Random();


        an1= (RadioButton) findViewById(R.id.an1);
        an2 = (RadioButton) findViewById(R.id.an2);
        an3 = (RadioButton) findViewById(R.id.an3);
        an4= (RadioButton) findViewById(R.id.an4);

        score=(TextView)findViewById(R.id.score);
        questionn=(TextView)findViewById(R.id.question);
        score.setText("score" + mscore);


        updateQuestion(r.nextInt(mquestionsLength));

        an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (an1.getText() == manswer) {
                    mscore+=1;
                    score.setText("score" + mscore);

                    updateQuestion(r.nextInt(mquestionsLength));

                    if(mscore>5)
                    {Intent intent = new Intent(testActivity.this, successActivity.class);
                        startActivity(intent);}

                } else {
                    updateQuestion(r.nextInt(mquestionsLength));
                }

            }
        });


        an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (an2.getText() == manswer) {
                    mscore+=1;
                    score.setText("score" + mscore);

                    updateQuestion(r.nextInt(mquestionsLength));
                    if(mscore>5)
                    {Intent intent = new Intent(testActivity.this, successActivity.class);
                        startActivity(intent);}

                } else {
                    updateQuestion(r.nextInt(mquestionsLength));
                }
            }
        });

        an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (an3.getText() == manswer) {
                    mscore+=1;
                    score.setText("score" + mscore);

                    updateQuestion(r.nextInt(mquestionsLength));

                    if(mscore>5)
                    {Intent intent = new Intent(testActivity.this, successActivity.class);
                        startActivity(intent);}

                } else {
                    updateQuestion(r.nextInt(mquestionsLength));
                }
            }
        });


        an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (an4.getText() == manswer) {
                    mscore+=1;
                    score.setText("score" + mscore);

                    updateQuestion(r.nextInt(mquestionsLength));

                    if(mscore>5)
                    {Intent intent = new Intent(testActivity.this, successActivity.class);
                        startActivity(intent);}


                } else {
                    updateQuestion(r.nextInt(mquestionsLength));
                }
            }
        });
        ;





    }
}
