package com.New_Boston_Tutorial;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	MediaPlayer soundFile;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		//Tutorial 17
		soundFile = MediaPlayer.create(Splash.this, R.raw.beat);
		soundFile.start();
		
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
						Intent openStartingPoint = new Intent(Splash.this, MainMenu.class);
						startActivity(openStartingPoint);
						
					}
				}
			};
			
			timer.start();
			
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		soundFile.release();
		finish();
	}

}
