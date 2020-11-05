package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 =(EditText) findViewById(R.id.val1txt);
        val2 =(EditText) findViewById(R.id.val2txt);
    }
   public void suma(View view){
        int res =0;
        String valor1s = val1.getText().toString();
        String valor2s = val2.getText().toString();
        if(valor1s.isEmpty()||valor2s.isEmpty()){
            if(valor1s.isEmpty())
                    val1.setError("valor no ingresado");
            if(valor2s.isEmpty())
                    val2.setError("valor no ingresado");
        }
        else{
            int valor1i = Integer.valueOf(valor1s);

            int valor2i = Integer.valueOf(valor2s);

        }
   }

}