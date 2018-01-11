package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HowItWorkPostProject extends Activity {
	Context context;
	ImageView back;
	LinearLayout button1,button2,button3,post,service,complete;
	TextView text1, text2, text3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.how_it_work_post_project);
		back  = (ImageView) findViewById(R.id.back);
		
		button1  = (LinearLayout) findViewById(R.id.button1);
		button2  = (LinearLayout) findViewById(R.id.button2);
		button3  = (LinearLayout) findViewById(R.id.button3);
		post  = (LinearLayout) findViewById(R.id.post);
		service  = (LinearLayout) findViewById(R.id.service);
		complete  = (LinearLayout) findViewById(R.id.complete);
		text1  = (TextView) findViewById(R.id.text1);
		text2  = (TextView) findViewById(R.id.text2);
		text3  = (TextView) findViewById(R.id.text3);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				service.setVisibility(View.GONE);
				complete.setVisibility(View.GONE);
				post.setVisibility(View.VISIBLE);
				text1.setBackgroundColor(Color.parseColor("#0084D0"));
				text2.setBackgroundColor(Color.parseColor("#EDEDED"));
				text3.setBackgroundColor(Color.parseColor("#EDEDED"));
				text1.setTextColor(getResources().getColor(R.color.white));
				text2.setTextColor(getResources().getColor(R.color.black));
				text3.setTextColor(getResources().getColor(R.color.black));
				
			}
		});
		button2.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				post.setVisibility(View.GONE);
				complete.setVisibility(View.GONE);
				service.setVisibility(View.VISIBLE);
				text1.setBackgroundColor(Color.parseColor("#EDEDED"));
				text2.setBackgroundColor(Color.parseColor("#0084D0"));
				text3.setBackgroundColor(Color.parseColor("#EDEDED"));
				text1.setTextColor(getResources().getColor(R.color.black));
				text2.setTextColor(getResources().getColor(R.color.white));
				text3.setTextColor(getResources().getColor(R.color.black));
			}
		});
		button3.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				post.setVisibility(View.GONE);
				service.setVisibility(View.GONE);
				complete.setVisibility(View.VISIBLE);
				text1.setBackgroundColor(Color.parseColor("#EDEDED"));
				text2.setBackgroundColor(Color.parseColor("#EDEDED"));
				text3.setBackgroundColor(Color.parseColor("#0084D0"));
				text1.setTextColor(getResources().getColor(R.color.black));
				text2.setTextColor(getResources().getColor(R.color.black));
				text3.setTextColor(getResources().getColor(R.color.white));
			}
		});
		
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				onBackPressed();
				
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
