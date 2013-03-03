package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends Activity implements View.OnClickListener{

	EditText txtSend;
	Button btnStartAct, btnStartActforResult;
	TextView txtViewGet;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		initialize();
		
	}
	
	private void initialize(){
		txtSend = (EditText) findViewById(R.id.txtSend);
		btnStartAct = (Button) findViewById(R.id.btnStartAct);
		btnStartAct = (Button) findViewById(R.id.btnStartActforResult);
		txtViewGet = (TextView) findViewById(R.id.txtViewGet);
		//On Click Listeners
		btnStartAct.setOnClickListener(this);
		btnStartActforResult.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}

