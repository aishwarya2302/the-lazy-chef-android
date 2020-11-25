package com.example.thelazychef;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.content.Intent;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class AdvancedSearch extends AppCompatActivity {

    Button goButton;
    TextView enterCuisine, enterDiet, enterExcludeIngredients, enterIntrolerances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_search);

        enterCuisine = findViewById(R.id.enterCuisine);
        enterDiet = findViewById(R.id.enterDiet);
        enterExcludeIngredients = findViewById(R.id.enterExcludeIngredients);
        enterIntrolerances = findViewById(R.id.enterIntrolerances);

        goButton = findViewById(R.id.goButton);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if query is valid
                String cuisineQuery = enterCuisine.getText().toString().trim();
                String dietQuery = enterDiet.getText().toString().trim();
                String excludeIngredientsQuery = enterExcludeIngredients.getText().toString().trim();
                String intolerancesQuery = enterIntrolerances.getText().toString().trim();

                if (!cuisineQuery.isEmpty() || !dietQuery.isEmpty() || !excludeIngredientsQuery.isEmpty() || !intolerancesQuery.isEmpty()) {
                    Intent AdvancedSearchResultsPageOpener = new Intent(AdvancedSearch.this, AdvancedSearchResults.class);
                    // pass the custom query to the results page
                    AdvancedSearchResultsPageOpener.putExtra("CUISINE_QUERY", cuisineQuery);
                    AdvancedSearchResultsPageOpener.putExtra("DIET_QUERY", dietQuery);
                    AdvancedSearchResultsPageOpener.putExtra("EXCLUDE_INGREDIENTS_QUERY", excludeIngredientsQuery);
                    AdvancedSearchResultsPageOpener.putExtra("INTOLERANCES_QUERY", intolerancesQuery);
                    startActivity(AdvancedSearchResultsPageOpener);
                } else {
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