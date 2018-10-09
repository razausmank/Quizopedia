package com.example.razausman_k.quizpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Harrypotter extends AppCompatActivity {
    EditText answer ;
    int counter ;
    int question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harrypotter);
            counter = 0 ;
            question = 0 ;
    }

    public  void  onclick (View view)
    {

        answer = findViewById(R.id.answer1);

        String answerq = "harry";
        TextView quest = findViewById(R.id.question);
        question++;
        if ( question == 1 )
        {
            if ( answer.getText().toString().equals("harry"))
            counter++ ;
            quest.setText("Who was harry's best Friend");

        }
        else if (question == 2)
        {
            if ( answer.getText().toString().equals("ron"))
                counter++ ;
            quest.setText("what was harry's owl name");
        }
        else if (question == 3 )
        {

            if ( answer.getText().toString().equals("hedwig"))
                counter++ ;
            quest.setText("what was hogwarts professor name");
        }
        else if (question == 4 )
        {

            if ( answer.getText().toString().equals("dumbledore"))
                counter++ ;
            quest.setText("what was draco's father name");
        }
        else if (question == 5)
        {

            if ( answer.getText().toString().equals("lucius"))
                counter++ ;

            quest.setText("Your Score is " + counter );
        }

        answer.setText("");


    }
}
