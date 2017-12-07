package xyz.corentinfiloche.remisenoel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /**
     * Variables
     */
    private EditText ETprice;
    private EditText ETremise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Récupération des champs de texte
        ETprice = (EditText) findViewById(R.id.ETPrice);
        ETremise = (EditText) findViewById(R.id.ETRemise);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button CalculRemiseButton = (Button) findViewById(R.id.BTNCalcRemise);
        CalculRemiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(MainActivity.this, ResultActivity.class);
                // Calcul de la remise
                int price = Integer.parseInt(ETprice.getText().toString());
                int remise = Integer.parseInt(ETremise.getText().toString());
                myIntent.putExtra("value", price - remise);
                startActivity(myIntent);
            }
        });
    }
}

