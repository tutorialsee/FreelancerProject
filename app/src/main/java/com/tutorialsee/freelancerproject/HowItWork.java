package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HowItWork extends Activity {
	Button post,get;
	Context context;
	ImageView back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_how_it_work);
		 
		post = (Button) findViewById(R.id.post);
		get = (Button) findViewById(R.id.get);
		back  = (ImageView) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				onBackPressed();
				
			}
		});
		
		post.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent ii=new Intent(getBaseContext(),HowItWorkPostProject.class);
				 ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		            startActivity(ii);
				
			}
		});
		get.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent ii=new Intent(getBaseContext(),HowItWorkGetProject.class);
				 ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		            startActivity(ii);
				
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
						Intent ii=new Intent(getApplicationContext(),HomeActivity.class);
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
		
	     super.onBackPressed();  // optional depending on your needs
	}
}
