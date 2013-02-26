package com.New_Boston_Tutorial;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.*;

public class camera extends Activity implements View.OnClickListener {

	ImageButton ib;
	Button b;
	ImageView iv;
	Intent intent;
	Bitmap bmp;
	final static int cameraData = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.photo);
		initialize();
		InputStream inputStream = getResources().openRawResource(R.drawable.ic_launcher);
		bmp = BitmapFactory.decodeStream(inputStream); 
	}
	
	private void initialize(){
		iv = (ImageView) findViewById(R.id.ivReturnPic);
		ib = (ImageButton) findViewById(R.id.imgbtnTakePic);
		b = (Button) findViewById(R.id.btnSetWallpaper);
		b.setOnClickListener(this);
		ib.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		case R.id.imgbtnTakePic:
			intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(intent, cameraData);
			break;
		case R.id.btnSetWallpaper:
			try {
				WallpaperManager.getInstance(getApplicationContext()).setBitmap(bmp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == RESULT_OK)
		{
			Bundle extras = data.getExtras();
			bmp = (Bitmap) extras.get("data");
			iv.setImageBitmap(bmp);
		}
	}
	


}
