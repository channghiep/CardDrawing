package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Deck mydeck = new Deck();
    String[] realDeck = mydeck.createdeck();
    List<String> cardList = new ArrayList<String>(Arrays.asList(realDeck));
    Integer num = 0;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        Collections.shuffle(cardList);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = this.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView cardInfo  = findViewById(R.id.textView);
                TextView cardNumber  = findViewById(R.id.textView2);

                if(num < realDeck.length){
                    Integer count = realDeck.length-num-1;
                    cardNumber.setText(count.toString());
                    cardInfo.setText(cardList.get(num));
                    num = num +1;

                }
                else{
                    num = 0;
                    cardNumber.setText("Card remaining: "+ realDeck.length);
                    cardInfo.setText("Draw a card");
                    Collections.shuffle(cardList);
                }
            }
        });
    }
}
