package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;
import com.tutorialsee.freelancerproject.PulsatorLayout;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SignUpClient extends Activity {
	Context context;
	ImageView back,post,setting;
	 private PulsatorLayout mPulsator;
	 static int b = 2;
	
	//LinearLayout post,get;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up_client_new);
		context = this;

		setting = (ImageView) findViewById(R.id.setting);
		back = (ImageView) findViewById(R.id.back);
		post = (ImageView) findViewById(R.id.post);
		 mPulsator = (PulsatorLayout) findViewById(R.id.pulsator);
		 // start pulsator
	        mPulsator.start();
	        post.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					Intent ii=new Intent(getBaseContext(),ThankYou.class);
					ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
					startActivity(ii);

				}
			});
		
		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				onBackPressed();  

			}
		});
		
		setting.setOnClickListener(new OnClickListener() {

			@Override  
			public void onClick(View arg0) {
				
				
				String i = Long.toString(2);
				Intent ii=new Intent(getBaseContext(),SettingActivity.class);
				ii.putExtra("KEY", i);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);
				overridePendingTransition(R.anim.abc_slide_in_top, R.anim.abc_slide_out_bottom);
				
			}
		});
		
		
		//***************************************************************************************************
				// including layout coding
				View someLayoutView = findViewById(R.id.footer);
				LinearLayout home = (LinearLayout) someLayoutView.findViewById(R.id.home);
				LinearLayout services = (LinearLayout) someLayoutView.findViewById(R.id.services);
				ImageView postproject = (ImageView) someLayoutView.findViewById(R.id.postproject);
				LinearLayout contact = (LinearLayout) someLayoutView.findViewById(R.id.contact);
				LinearLayout usersetting = (LinearLayout) someLayoutView.findViewById(R.id.usersetting);

				home.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent ii=new Intent(getApplicationContext(),MainActivity.class);
						ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(ii);
						overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);


					}
				});
				
				services.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent ii=new Intent(getApplicationContext(),Services.class);
						ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(ii);
					overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);

					}
				});
				
				postproject.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent ii=new Intent(getApplicationContext(),PostActivity.class);
						ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(ii);
						overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);

					}
				});
				
				contact.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent ii=new Intent(getApplicationContext(),ContactUs.class);
						ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(ii);
						overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);


					}
				});
				
				usersetting.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent ii=new Intent(getApplicationContext(),ProfileActivity.class);
						ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(ii);
						overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);


					}
				});
				
		//*************************************************************************************************************
			
			
		
	}
	
	
	 @Override
		public void onBackPressed()
		{
		 super.onBackPressed();  
		}
}
