package com.example.thelazychef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class SearchByIngredients extends AppCompatActivity {

    Button goButton;
    TextView enterIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_ingredients);

        // initialise text view
        enterIngredients = findViewById(R.id.enterIngredients);

        // move to wine pairings results page on pressing goButton
        goButton = findViewById(R.id.goButton);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if query is valid
                String ingredientsQuery = enterIngredients.getText().toString().trim();
                if (ingredientsQuery.length() > 0){
                    Intent searchByIngredientsResultsOpener = new Intent(SearchByIngredients.this, SearchByIngredientsResults.class);

                    // pass the nutrition query to the results page
                    searchByIngredientsResultsOpener.putExtra("INGREDIENTS_QUERY", ingredientsQuery);
                    startActivity(searchByIngredientsResultsOpener);
                } else {

                    // shake box if no query is entered
                    YoYo.with(Techniques.Shake)
                            .duration(700)
                            .repeat(0)
                            .playOn(findViewById(R.id.enterIngredients));
                    Toast.makeText(getApplicationContext(), "Please enter a valid query!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onClickBtn(View v)
    {
        Toast.makeText(this, "Functionality not added", Toast.LENGTH_SHORT).show();
    }

    // on click handler for back button
    public void backButtonClickHandler(View v) {
        finish();
    }
}