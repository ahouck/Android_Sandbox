package com.New_Boston_Tutorial;

import android.app.ListActivity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenu extends ListActivity {
	String classes[] = { StartingPoint.class.getName(),
			TextPlay.class.getName(), Email.class.getName(),
			TestCamera.class.getName(), Data.class.getName(), GraphicAnimations.class.getName(),
			GFXSurface.class.getName()};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//set window to be fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		
		setListAdapter(new ArrayAdapter<String>(MainMenu.this,
				android.R.layout.simple_list_item_1, classes));		
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater mnuInflator = getMenuInflater();
		mnuInflator.inflate(R.menu.second_menu, menu);
		return true;

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);

		try {
			Intent menuIntent = new Intent(MainMenu.this,
					Class.forName(classes[position]));
			startActivity(menuIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.aboutUs:
			startActivity(new Intent("com.New_Boston_Tutorial.ABOUT"));
			break;
		case R.id.preferences:
			startActivity(new Intent("com.New_Boston_Tutorial.PREFS"));
			break;
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}

}
