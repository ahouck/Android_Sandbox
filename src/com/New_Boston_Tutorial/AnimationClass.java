package com.New_Boston_Tutorial;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class AnimationClass extends View {

	Bitmap pic;
	
	public AnimationClass(Context context) {
		super(context);
		
		//Just ising the picture I used for the button
		pic = BitmapFactory.decodeResource(getResources(), R.drawable.btn);
		
		
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		canvas.drawColor(Color.RED);
		canvas.drawBitmap(pic, canvas.getWidth()/2,canvas.getHeight()/2, null);
		
		
	}

}
