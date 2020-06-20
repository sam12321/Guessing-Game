package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    Button bt;
    Random rnd=new Random();
    int randomNumber=rnd.nextInt(20)+1;

    public void guess(View view){

        int numberGuessed=Integer.parseInt(ed.getText().toString());
        if(numberGuessed==randomNumber){
            Toast.makeText(MainActivity.this, "YOU GUESSED IT!!TRY AGAIN", Toast.LENGTH_SHORT).show();
            int n=randomNumber;
            randomNumber=rnd.nextInt(20)+1;
            while(randomNumber==n){
                randomNumber=rnd.nextInt(20)+1;
            }
        }
        else if (numberGuessed<randomNumber){
            Toast.makeText(MainActivity.this, "HIGHER", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "LOWER", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText)findViewById(R.id.editText);
        bt=(Button)findViewById(R.id.button);


    }
}
