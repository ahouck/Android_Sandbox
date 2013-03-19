package com.New_Boston_Tutorial;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SurfaceAnimation extends SurfaceView implements Runnable{

	SurfaceHolder surfaceHolder;
	Thread animationThread;
	boolean isRunning = false;
	
	public SurfaceAnimation(Context context) {
		super(context);
		
		surfaceHolder = getHolder();
		//"this" refering to having it use our run method below

	}

	@Override
	public void run() {
		
		while(isRunning){
			if(!surfaceHolder.getSurface().isValid())
			{
				continue;
			}
			Canvas canvas = surfaceHolder.lockCanvas();
			canvas.drawRGB(80, 80, 80);
			surfaceHolder.unlockCanvasAndPost(canvas);
			 
		}
	}
	
	public void pause(){
		isRunning = false;
		while(true)
		{
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

	public void resume(){
		isRunning = true;
		animationThread = new Thread(this);
		animationThread.start();
	}
	
}
