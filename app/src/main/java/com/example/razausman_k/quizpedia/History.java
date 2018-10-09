package com.example.razausman_k.quizpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class History extends AppCompatActivity {

    EditText answer ;
    int counter ;
    int question;
    TextView quest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harrypotter);
        counter = 0 ;
        question = 0 ;
        quest= findViewById(R.id.question);
        quest.setText("When did pakistan got Independence");

    }

    public  void  onclick (View view)
    {

        answer = findViewById(R.id.answer1);



        question++;
        if ( question == 1 )
        {
            if ( answer.getText().toString().equals("1947"))
                counter++ ;
            quest.setText("Who is the founder of Pakistan");

        }
        else if (question == 2)
        {
            if ( answer.getText().toString().equals("jinnah"))
                counter++ ;
            quest.setText("What was the part of zuljinnah in creating pakistan");
        }
        else if (question == 3 )
        {

            if ( answer.getText().toString().equals("really important part"))
                counter++ ;
            quest.setText("Who is a nepali momin");
        }
        else if (question == 4 )
        {

            if ( answer.getText().toString().equals("laddan jafri"))
                counter++ ;
            quest.setText("Where are people reborn after sunset ");
        }
        else if (question == 5)
        {

            if ( answer.getText().toString().equals("Nepal"))
                counter++ ;

            quest.setText("Your Score is " + counter );
        }

        answer.setText("");


    }

    }
