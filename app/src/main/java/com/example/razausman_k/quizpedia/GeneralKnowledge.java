package com.example.razausman_k.quizpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GeneralKnowledge extends AppCompatActivity {
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
        quest.setText("Who invaded Afghanistan?");

    }

    public  void  onclick (View view)
    {

        answer = findViewById(R.id.answer1);



        question++;
        if ( question == 1 )
        {
            if ( answer.getText().toString().equals("America"))
                counter++ ;
            quest.setText("What is the capital of India");

        }
        else if (question == 2)
        {
            if ( answer.getText().toString().equals("dehli"))
                counter++ ;
            quest.setText("Who was flying a kite in Karbala");
        }
        else if (question == 3 )
        {

            if ( answer.getText().toString().equals("laddan jafri"))
                counter++ ;
            quest.setText("Who created Pakistan ( hint : Ghora )");
        }
        else if (question == 4 )
        {

            if ( answer.getText().toString().equals("zuljinnah"))
                counter++ ;
            quest.setText("Who is shameem ( hint : laddan jafri ) ");
        }
        else if (question == 5)
        {

            if ( answer.getText().toString().equals("laddan jafri's son "))
                counter++ ;

            quest.setText("Your Score is " + counter );
        }

        answer.setText("");


    }
}
