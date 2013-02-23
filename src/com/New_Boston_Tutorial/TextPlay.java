package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
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
		final ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
		final EditText input = (EditText) findViewById(R.id.txtEdit);
		final TextView display = (TextView) findViewById(R.id.btnResults);
		
		passTog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(passTog.isChecked())
				{
					input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}
				else
				{
					input.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
		// END TOGGLE ONCLICK LISTENER
		
		chkCommand.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String check = input.getText().toString();
				
				if(check.contentEquals("left")){
					display.setGravity(Gravity.LEFT);
				}else if(check.contentEquals("center")){
					display.setGravity(Gravity.CENTER);					
				}else if(check.contentEquals("right")){
					display.setGravity(Gravity.RIGHT);					
				}else if(check.contentEquals("blue"))
				{
					
				}
				
			}
		});
	}

}
