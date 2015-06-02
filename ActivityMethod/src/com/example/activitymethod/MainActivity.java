package com.example.activitymethod;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.Button; 


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("ActivityMethodActivity", "created");

		Button btn = (Button)findViewById(R.id.btn); 	//why casting?
		btn.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		Log.i("ActivityMethodActivity", "Start");
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		Log.i("ActivityMethodactivity", "Resume");
	}
	
	@Override
	protected void onStop(){
		super.onStop();
		Log.i("ActivityMethodActivity", "Stop");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
