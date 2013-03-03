package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements View.OnClickListener, OnCheckedChangeListener  {

	TextView txtViewQuestions, txtViewTest;
	Button btnReturn;
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
		btnReturn = (Button) findViewById(R.id.btnReturn);
		btnReturn.setOnClickListener(this);
		rdogAnsers.setOnCheckedChangeListener(this);
	
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch(checkedId)
		{
		case R.id.rdo1:
			break;
		case R.id.rdo2:
			break;
		case R.id.rdo3:
			break;
		}
	}

}
