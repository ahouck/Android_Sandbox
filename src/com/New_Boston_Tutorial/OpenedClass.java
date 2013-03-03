package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class OpenedClass extends Activity implements View.OnClickListener  {

	TextView txtViewQuestions, txtViewTest;
	RadioGroup rdogAnsers;
	RadioButton rdo1, rdo2, rdo3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
	}

	private void initialize(){
		txtViewQuestions = (TextView) findViewById(R.id.txtViewQuestion);
		txtViewTest = (TextView) findViewById(R.id.txtViewTest);
		rdogAnsers = (RadioGroup) findViewById(R.id.rdogAnswers);
	
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
