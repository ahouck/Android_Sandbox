package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;

public class GFXSurface extends Activity {
	
	SurfaceAnimation ourSurfaceView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		ourSurfaceView = new SurfaceAnimation(this);
		setContentView(ourSurfaceView);
	}
	
	

}
