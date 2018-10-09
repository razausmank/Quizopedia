package com.example.razausman_k.quizpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Science extends AppCompatActivity {
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
        quest.setText("What is the value of gravity");

    }

    public  void  onclick (View view)
    {

        answer = findViewById(R.id.answer1);



        question++;
        if ( question == 1 )
        {
            if ( answer.getText().toString().equals("9.8"))
                counter++ ;
            quest.setText("who discovered relativety");

        }
        else if (question == 2)
        {
            if ( answer.getText().toString().equals("5.25"))
                counter++ ;
            quest.setText("einstein");
        }
        else if (question == 3 )
        {

            if ( answer.getText().toString().equals("258"))
                counter++ ;
            quest.setText("Who discovered gravity?");
        }
        else if (question == 4 )
        {

            if ( answer.getText().toString().equals("newton"))
                counter++ ;
            quest.setText("What is the opposite of black hole");
        }
        else if (question == 5)
        {

            if ( answer.getText().toString().equals("wormhole"))
                counter++ ;

            quest.setText("Your Score is " + counter );
        }

        answer.setText("");


    }
}
