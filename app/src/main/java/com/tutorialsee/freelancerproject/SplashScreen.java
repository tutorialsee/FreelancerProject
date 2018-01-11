package com.tutorialsee.freelancerproject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.tutorialsee.freelancerproject.R;
import com.tutorialsee.freelancerproject.FlipAnimation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashScreen extends Activity {
private static final String TAG = null;
Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.splash_screen);
		context = this;
		  initFlip();
		  
		
		  
	}
	
	 
	private void initFlip(){

	        final ImageView flipImage = (ImageView)findViewById(R.id.flip);

	        FlipAnimation.create().with(flipImage)
	                .setDuration(3600)
	                .setRepeatCount(FlipAnimation.INFINITE)
	                .start();

	    }
	public void onStart() {
	super.onStart();

	new Thread(new Runnable() {
		public void run() {
			try {

					Thread.sleep(5000);
					 Intent ii=new Intent(getBaseContext(),LoginActivity.class);
					 ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
	                    startActivity(ii);


			}
			catch (Throwable t) {
			}
		}
	}).start();
}




}
