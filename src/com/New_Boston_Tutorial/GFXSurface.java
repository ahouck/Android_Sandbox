package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class GFXSurface extends Activity implements OnTouchListener{
	
	SurfaceAnimation ourSurfaceView;
	float x,y;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		x = 0;
		y = 0;
		ourSurfaceView = new SurfaceAnimation(this);
		ourSurfaceView.setOnTouchListener(this);
		setContentView(ourSurfaceView);
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSurfaceView.pause();
		
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		ourSurfaceView.resume();
	}


	@Override
	public boolean onTouch(View v, MotionEvent event) {
		x = event.getX();
		y = event.getY();
		return false;
		
		
	}
	
	

}
