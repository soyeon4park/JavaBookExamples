package com.example.wi_checkbox;

import android.app.Activity;  
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView; 
import android.widget.CompoundButton; 


public class MainActivity extends Activity {

	//first initialize everything
	TextView result;
	CheckBox movie;
	CheckBox guitar;
	CheckBox reading;
	String msg = "Your hobby is";

	//first method
	//as soon as the app opens up, action starts
	//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);			//always need this
		result = (TextView) findViewById(R.id.result);
		movie = (CheckBox)findViewById(R.id.movie);
		guitar = (CheckBox)findViewById(R.id.guitar);
		reading = (CheckBox)findViewById(R.id.reading);

		//always this format
		//create a checker for all of the options
		movie.setOnCheckedChangeListener(new 
				CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, 
					boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					msg = msg+buttonView.getText().toString()+" ";
				} else {
					//make the messsage into null
					//but why is this necessary? msg doesn't have 
					//watching movie component to begin with
					msg = msg.replace("Watching movie", "");
				}
				result.setText(msg); 		//needs to be updated every time
			}
		});

		guitar.setOnCheckedChangeListener (new 
				CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked) {
					msg = msg+buttonView.getText().toString()+"";
				} else {
					msg = msg.replace("Playing guitar", "");
				}
				result.setText(msg); 
			}

		}); 

		reading.setOnCheckedChangeListener (new
				CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					msg = msg+buttonView.getText().toString()+"";
				}else{
					
					//delete msg if it is deselected
					msg = msg.replace("Reading", "");
				}
				result.setText(msg); 
			}
		});
	}
}
