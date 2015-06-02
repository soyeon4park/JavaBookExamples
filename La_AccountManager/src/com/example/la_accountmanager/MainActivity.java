package com.example.la_accountmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	AcountUtility au = new AcountUtility(); 		//new constructor
	
	EditText Name;
	

	//now connect all the functionality with layout
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Name = (EditText) findViewById(R.id.create); 
	}

}
