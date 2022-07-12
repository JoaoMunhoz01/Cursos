package com.cusroandroid.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setNumSelected(View view){
        TextView txtNumSel = findViewById(R.id.lblSelectedNum);
        Random random = new Random();
        String numSel = "O número selecionado: " + random.nextInt(10);
        txtNumSel.setText(numSel);
    }
}