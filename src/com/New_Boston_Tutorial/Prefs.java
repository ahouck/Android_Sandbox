package com.New_Boston_Tutorial;

import android.annotation.TargetApi;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Prefs extends PreferenceActivity {

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		Class thisClass = Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB ? Prefs.class
				: Pref_Frag.class;
		Intent i = new Intent(this, thisClass);
		startActivity(i);
/*
		Pref_Frag p = new Pref_Frag();
		FragmentTransaction frag_man = getFragmentManager().beginTransaction();
		frag_man.replace(android.R.id.content, p);
		frag_man.commit();*/
	}
}
