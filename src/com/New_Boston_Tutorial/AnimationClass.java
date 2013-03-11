package com.New_Boston_Tutorial;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

public class AnimationClass extends View {

	Bitmap pic;
	
	public AnimationClass(Context context) {
		super(context);
		
		//Just ising the picture I used for the button
		pic = BitmapFactory.decodeResource(getResources(), R.drawable.btn);
		
		
		
	}

}
