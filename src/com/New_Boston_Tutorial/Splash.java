package com.New_Boston_Tutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		// new thread for parallel activity 
		Thread timer = new Thread()
			{
				public void run()
				{
					try{
						sleep(2000);
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
					finally{
						Intent openStartingPoint = new Intent("com.New_Boston_Tutorial.STARTINGPOINT");
						startActivity(openStartingPoint);
						
					}
				}
			};
			
			timer.start();
			
	}

}
