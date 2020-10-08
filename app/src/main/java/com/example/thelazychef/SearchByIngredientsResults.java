package com.example.thelazychef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SearchByIngredientsResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide upper action bar
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){
            System.out.println("Textbox could not be concealed.");
        }
        setContentView(R.layout.activity_search_by_ingredients_results);
    }

    public void onClickBtn(View v)
    {
        Toast.makeText(this, "Functionality not added", Toast.LENGTH_SHORT).show();
    }

    // on click handler for back button
    public void backButtonClickHandler(View v) {
        Intent searchByIngredientsPageOpener = new Intent(SearchByIngredientsResults.this, SearchByIngredients.class);
        startActivity(searchByIngredientsPageOpener);
    }
}