package com.bruna.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edMin, edMax;
    TextView textResultado1, textViewResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edMin = findViewById(R.ed.minimo);
        edMax = findViewById(R.id.maximo);
        textResultado1 = findViewById(R.id.txt1);
        textResultado2 = findViewById(R.id.txt2);
    }
    public void sorteiaNumero(View v){
        int min = Integer.parseInt(edMin.getText().toString);
        int max = Integer.parseInt(edMax.getText().toString);


         int ramdomNumber = (int) Math.random()* (max-min+1)+min;
         txtResultado1.setText(Integer.toString(ramdonNumber));

         Ramdon ultiRandom.nextInt(max - min+ 1) +min;
         textResultado2.setText(Integer.toString(randomNumber));
    }
}