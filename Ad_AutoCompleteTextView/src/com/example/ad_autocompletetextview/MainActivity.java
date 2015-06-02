package com.example.ad_autocompletetextview;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;



public class MainActivity extends Activity implements TextWatcher{

	//define all the ids before going into methods
	EditText name;
	TextView country;			//this can't be edited
	AutoCompleteTextView auto;
	ArrayList<String> data= new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		name = (EditText) findViewById(R.id.name);
		country =(TextView) findViewById(R.id.country);
		auto=(AutoCompleteTextView) findViewById(R.id.auto);
		
		data.add("Korea");
		data.add("Japan");
		data.add("USA");
		data.add("Turkey");
		data.add("Greece");
		data.add("China");
		data.add("Russia");
		data.add("Canada");
		data.add("Spain");
		data.add("France");
		
		//listener for text change
		auto.addTextChangedListener(this);		//since this implements textwatcher
		auto.setAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line, data));
		auto.setHint("put country");
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		country.setText(name.getText().toString()+"'s country is "+auto.getText().toString());
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		
	}
}
