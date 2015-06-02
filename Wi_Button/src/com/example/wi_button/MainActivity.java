package com.example.wi_button;

import android.app.Activity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{	
	Button btn_a;
	Button btn_b;
	Button btn_c;
	TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
				//casting.function.call result in class R
		result=(TextView)findViewById(R.id.result); 
		btn_a=(Button)findViewById(R.id.btn_a);
		btn_b=(Button)findViewById(R.id.btn_b);
		btn_c=(Button)findViewById(R.id.btn_c);
		
		btn_a.setOnClickListener(this);
		btn_b.setOnClickListener(this);
		btn_c.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//this method shows the selected button
		 
		String msg="";
				
		if(v.getId() == R.id.btn_a) {
			msg="Your hometown is New York";
		}
		else if (v.getId() == R.id.btn_b) {
			msg = "Your hometown is Nevada";
		}
		else if (v.getId() == R.id.btn_c) {
			msg = "Your hometown is New Jersey";
		}
	
		result.setText(msg); 	//setting the result to the chosen message
	}
	
	

}
