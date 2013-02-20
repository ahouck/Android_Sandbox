package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		Button chkCommand = (Button) findViewById(R.id.btnResults);
		ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
		EditText input = (EditText) findViewById(R.id.txtEdit);
		TextView display = (TextView) findViewById(R.id.btnResults);
	}

}
