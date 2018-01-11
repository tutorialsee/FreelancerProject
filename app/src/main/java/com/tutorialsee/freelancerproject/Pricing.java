package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Pricing extends Activity {
	Context context;
	ImageView back;
	LinearLayout payment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pricing_new);
		context= this;
		
		
		payment  = (LinearLayout) findViewById(R.id.payment);
		payment.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent ii=new Intent(getApplicationContext(),PricingTable.class);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);

				
			}
		});
		
		back  = (ImageView) findViewById(R.id.back);
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
		super.onBackPressed();  
	}
}
