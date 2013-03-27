package com.New_Boston_Tutorial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;

public class GFXSurface extends Activity implements OnTouchListener {

	SurfaceAnimation ourSurfaceView;
	float x, y, sX, sY, fX, fY, dX, dY, animateX, animateY, scaleX, scaleY = 0;
	Bitmap tester, secondImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		tester = BitmapFactory.decodeResource(getResources(), R.drawable.btn);
		secondImage = BitmapFactory.decodeResource(getResources(),
				R.drawable.btn_selected);

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

		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			sX = event.getX();
			sY = event.getY();
			fX = fY = dX = dY = animateX = animateY = scaleX = scaleY = 0;
			break;
		case MotionEvent.ACTION_UP:
			fX = event.getX();
			fY = event.getX();
			dX = fX - sX;
			dY = fY - sY;
			scaleX = dX / 30;
			scaleY = dY / 30;
			x = 0;
			y = 0;
			break;
		}
		return true;

	}

	public class SurfaceAnimation extends SurfaceView implements Runnable {

		SurfaceHolder surfaceHolder;
		Thread animationThread;
		boolean isRunning = false;

		public SurfaceAnimation(Context context) {
			super(context);

			surfaceHolder = getHolder();
			// "this" refering to having it use our run method below

		}

		@Override
		public void run() {

			while (isRunning) {
				if (!surfaceHolder.getSurface().isValid()) {
					continue;
				}

				Canvas canvas = surfaceHolder.lockCanvas();
				canvas.drawRGB(80, 80, 80);
				if (x != 0 && y != 0) {

					canvas.drawBitmap(tester, (x - (tester.getWidth() / 2)),
							(y - (tester.getHeight() / 2)), null);

				}
				if (sX != 0 && sY != 0) {
					canvas.drawBitmap(secondImage,
							(sX - (secondImage.getWidth() / 2)),
							(sY - (secondImage.getHeight() / 2)), null);
				}
				if (fX != 0 && fY != 0) {
					canvas.drawBitmap(secondImage,
							(fX - (secondImage.getWidth() / 2) - animateX),
							(fY - (secondImage.getHeight() / 2) - animateY),
							null);
					canvas.drawBitmap(tester, (fX - (tester.getWidth() / 2)),
							(fY - (tester.getHeight() / 2)), null);
				}
				animateX = animateX + scaleX;
				animateY = animateY + scaleY;
				surfaceHolder.unlockCanvasAndPost(canvas);

			}
		}

		public void pause() {
			isRunning = false;
			while (true) {
				try {
					animationThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}

			animationThread = null;

		}

		public void resume() {
			isRunning = true;
			animationThread = new Thread(this);
			animationThread.start();
		}

	}

}
