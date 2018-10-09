package com.example.razausman_k.quizpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class maths extends AppCompatActivity {
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
        quest.setText("              What is 9*32");

    }

    public  void  onclick (View view)
    {

        answer = findViewById(R.id.answer1);



        question++;
        if ( question == 1 )
        {
            if ( answer.getText().toString().equals("288"))
                counter++ ;
            quest.setText("          what is 21 divided by 4 ");

        }
        else if (question == 2)
        {
            if ( answer.getText().toString().equals("5.25"))
                counter++ ;
            quest.setText("                   what is 329 - 71");
        }
        else if (question == 3 )
        {

            if ( answer.getText().toString().equals("258"))
                counter++ ;
            quest.setText("     What is 4 multiply by 5 multiply by 4");
        }
        else if (question == 4 )
        {

            if ( answer.getText().toString().equals("80"))
                counter++ ;
            quest.setText("                   what is 21 divided by 7 ");
        }
        else if (question == 5)
        {

            if ( answer.getText().toString().equals("3"))
                counter++ ;

            quest.setText("              Your Score is " + counter );
        }

        answer.setText("");


    }
}
