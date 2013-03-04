package com.New_Boston_Tutorial;

import android.app.Activity;
import android.content.Intent;
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
	String inputData, sendData;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		
		initialize();
		inputData = getData();
		txtViewQuestions.setText(inputData);
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
		Intent newIntent = new Intent();
		Bundle newBundle = new Bundle();
		
		newBundle.putString("key", sendData);
		newIntent.putExtras(newBundle);
		
		setResult(RESULT_OK, newIntent);
		finish();
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch(checkedId)
		{
		case R.id.rdo1:
			sendData="choice 1";
			break;
		case R.id.rdo2:
			sendData = "choice 2";
			break;
		case R.id.rdo3:
			sendData = "choice 3";
			break;
		}
		txtViewTest.setText(sendData);
	}
	
	private String getData(){
		try {
			Bundle inputBundle = getIntent().getExtras();
			return inputBundle.getString("key");
		} catch (Exception e) {
			return "";
		}

	}

}
