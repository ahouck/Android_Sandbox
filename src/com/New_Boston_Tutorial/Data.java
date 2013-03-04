package com.New_Boston_Tutorial;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
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
		btnStartActforResult = (Button) findViewById(R.id.btnStartActforResult);
		txtViewGet = (TextView) findViewById(R.id.txtViewGet);
		//On Click Listeners
		btnStartAct.setOnClickListener(this);
		btnStartActforResult.setOnClickListener(this);
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == RESULT_OK){
			Bundle recievedBundle = data.getExtras();
			txtViewGet.setText(recievedBundle.getString("key"));
			
		}
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		case R.id.btnStartAct:
		String strPassing = txtSend.getText().toString();
		Bundle bndlPackageBundle = new Bundle();
		bndlPackageBundle.putString("key",strPassing);
		
		//Start up the activity
		Intent intentOpenedClass = new Intent(Data.this, OpenedClass.class);
		//send over the data
		intentOpenedClass.putExtras(bndlPackageBundle);
		startActivity(intentOpenedClass);
		break;
		case R.id.btnStartActforResult:
			
			startActivityForResult(new Intent(Data.this, OpenedClass.class),0);
			
		break;
			
		}
	}
	
	

}

