package com.New_Boston_Tutorial;

import android.app.Activity;
import android.os.Bundle;

public class GraphicAnimations extends Activity {
	
	
	AnimationClass animationView;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		animationView = new AnimationClass(this);
		setContentView(animationView);
		
		
	}
	
	
	
	

}
