package com.example.guanghuili.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spBeer;
    private Button btnFindBeer;
    private TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        spBeer = (Spinner)findViewById(R.id.spBeerID);
        btnFindBeer = (Button)findViewById(R.id.btnFindBeerID);
        tvDescription = (TextView)findViewById(R.id.tvDescriptionID);
        BeerExpert expert = new BeerExpert();

        String beerType = String.valueOf(spBeer.getSelectedItem());

        List<String>brandsList = expert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand:brandsList){
            brandsFormatted.append(brand).append("\n");
        }
        tvDescription.setText(brandsFormatted);
    }
}
