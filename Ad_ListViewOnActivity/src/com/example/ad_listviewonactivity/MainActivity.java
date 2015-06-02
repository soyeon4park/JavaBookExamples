package com.example.ad_listviewonactivity;

import android.app.Activity; 
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//implements 2 interfaces
//selected doesn't really do anythign why bother implementing this?

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

	//first initialize data as string array
	String[] datas={"rabbit", "tiger", "turtle","lion","zebra","giraff","bird","pig","dog","cat"};
	ListView list;
	
	//now write methods
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		list = (ListView) findViewById (R.id.list); 
		list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datas));
		
		//callback method
		list.setOnItemClickListener(this);
//		list.setOnItemSelectedListener(this);
	}

	//@Override
	//public void onItemSelected(AdapterView<?> parent, View view, int position,
//			long id) {
		// TODO Auto-generated method stub
		//Toast.makeText(this, datas[position]+" chosen", Toast.LENGTH_SHORT).show(); 
	//}

	//@Override
//	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
	//}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Toast.makeText(this, datas[position]+" chosen", Toast.LENGTH_SHORT).show(); 
		//what if i don't implement this? shouldn't item selected be sufficient for shwoing toast?
	}
}
