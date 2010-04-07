package com.medialets.funnyquotes;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class funnyquotes extends Activity {
    /** Called when the activity is first created. */
    
    String BUILD_NUMBER_STRING = "1.0.3";

    
    String[] quotes =  {"Friendship is like peeing on yourself: everyone can see it, but only you get the warm feeling that it brings.",
            "The man who smiles when things go wrong has thought of someone to blame it on. - Robert Bloch",
            "The only way to keep your health is to eat what you don't want, drink what you don't like, and do what you'd rather not. - Mark Twain",
            "I told my wife that a husband is like a fine wine; he gets better with age. The next day, she locked me in the cellar.",
            "When I die, I want to go peacefully like my Grandfather did, in his sleep -- not screaming, like the passengers in his car.",
            "Last night I lay in bed looking up at the stars in the sky and I thought to myself, where the heck is the ceiling?",
            "You tried your best and you failed miserably. The lesson is 'never try'. -Homer Simpson",
            "Fragile. Do not drop. -- Posted on a Boeing 757",
            "Money doesn't make you happy. I now have $50 million but I was just as happy when I had $48 million.",
            "I think animal testing is a terrible idea; they get all nervous and give the wrong answers.",
            "Guys: No Shirt, No Service - Gals: No Shirt, No Charge.",
            "There are no stupid questions, just stupid people.",
            "Everyone needs to believe in something. I believe I'll have another beer.",
            "When I was kidnapped, my parents snapped into action. They rented out my room.",
            "A computer once beat me at chess, but it was no match for me at kick boxing.",
            "Everyone is entitled to their own opinion. It's just that yours is stupid.",
            "I am not a vegetarian because I love animals; I am a vegetarian because I hate plants.",
            "Marriage is give and take. You'd better give it to her or she'll take it anyway.",
            "Everyone has photographic memory; some just don't have the film.",
            "Always remember you're unique, just like everyone else.",
            "I think animal testing is a terrible idea; they get all nervous and give the wrong answers.",
            "The road to success is always under construction."};
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textCreate();
		//setContentView(R.layout.main);
    }
    
    public void textCreate() {
    	Random random = new Random();
    	TextView tv = new TextView(this);
		String quote = quotes[random.nextInt(quotes.length)];
		tv.setText(quote);
		tv.setGravity(Gravity.CENTER);
		tv.setTextSize(30);
		setContentView(tv);
		
		new Handler().postDelayed(new Runnable() {
			public void run() {
				openOptionsMenu();
			}
		}, 500);
	}
    
    public boolean onCreateOptionsMenu (Menu menu) {
    	menu.add(0, 1, 0, "New Quote");
    	return true;
    }
 
    public boolean onOptionsItemSelected(MenuItem item) {
    	Random random = new Random();
    	
    	switch (item.getItemId()) {
    	case 1:
    		textCreate();
    	}
    	return true;
    }
    
    public void foo() {
        int x = 3;
        x = x;
      }
    
    //this is a test bah
}