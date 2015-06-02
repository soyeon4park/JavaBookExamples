package com.example.ad_gridview;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	GridView grid1;

	//could also use string array
	ArrayList<String> list = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		grid1 = (GridView) findViewById(R.id.grid);
		list.add("apple");
		list.add("banana");
		list.add("pear");
		list.add("peach");
		list.add("lemon");
		list.add("melon");
		list.add("cantalope");
		list.add("blueberry");
		list.add("rasberry");
		list.add("cherry");

		ArrayAdapter<String> adapter = new ArrayAdapter<String> 
		(this, android.R.layout.simple_list_item_1, list);
		grid1.setAdapter(adapter);

		grid1.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}
}
