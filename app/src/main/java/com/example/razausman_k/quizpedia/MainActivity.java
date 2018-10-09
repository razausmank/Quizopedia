package com.example.razausman_k.quizpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start( View view )
    {
        startActivity( new Intent(this , QuizList.class ));
       // Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
    }


}
