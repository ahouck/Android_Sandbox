package com.New_Boston_Tutorial;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class AnimationClass extends View {

	Bitmap pic;
	float changingY;
	Rect middleRect = new Rect();
	
	public AnimationClass(Context context) {
		super(context);
		
		//Just ising the picture I used for the button
		pic = BitmapFactory.decodeResource(getResources(), R.drawable.btn);
		changingY = 0;
		
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		canvas.drawColor(Color.WHITE);
		canvas.drawBitmap(pic, canvas.getWidth()/2,changingY, null);
		
		if (changingY < (canvas.getHeight() - 10)) {
			changingY += 5;
		}
		else {
			changingY = 0;
		}

		middleRect.set(0, 400 ,canvas.getWidth(),500);
		Paint rectBlue = new Paint();
		rectBlue.setColor(Color.BLUE);
		canvas.drawRect(middleRect, rectBlue);
		invalidate();
	}

}
