package com.New_Boston_Tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends Activity {
	int total = 0;
	Button btnAdd, btnSub;
	TextView txtDisplay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starting_point);

		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnSub = (Button) findViewById(R.id.btnSubtract);
		txtDisplay = (TextView) findViewById(R.id.txtDisplay);

		// Onclick Event
		btnAdd.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				total++;
				txtDisplay.setText("Total = " + total);
			}
		});
		// Onclick Event
		btnSub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				total--;
				txtDisplay.setText("Total = " + total);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_starting_point, menu);
		return true;
	}

}
