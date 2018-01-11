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

public class Services extends Activity implements OnClickListener {
	Context context;
	ImageView back;
	LinearLayout image1,image2,image3,image4,image5;
	 static int sa1 = 1;
	 static int sa2 = 2;
	 static int sa3 = 3;
	 static int sa4 = 4;
	 static int sa5 = 5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.services_activity);
		context= this;
		
		image1  = (LinearLayout) findViewById(R.id.image1);
		image2  = (LinearLayout) findViewById(R.id.image2);
		image3  = (LinearLayout) findViewById(R.id.image3);
		image4  = (LinearLayout) findViewById(R.id.image4);
		image5  = (LinearLayout) findViewById(R.id.image5);
		image1.setOnClickListener(this);
		image2.setOnClickListener(this);
		image3.setOnClickListener(this);
		image4.setOnClickListener(this);
		image5.setOnClickListener(this);
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
		final ImageView serviceimage = (ImageView) someLayoutView.findViewById(R.id.serviceimage);
		
		serviceimage.setBackgroundResource(R.drawable.serviceselect);
		
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
				/*Intent ii=new Intent(getApplicationContext(),Services.class);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);
			overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
*/
				
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

	@Override
	public void onClick(View v) {
	if (v == image1) {
		String ia = Long.toString(1);
		Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
		ii.putExtra("KEY", ia);
		ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(ii);
		overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
	} else if (v == image2) {
		String ib = Long.toString(2);
		Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
		ii.putExtra("KEY", ib);
		ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(ii);
		overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
	} else if (v == image3) {
		String ic = Long.toString(3);
		Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
		ii.putExtra("KEY", ic);
		ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(ii);
		overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
	} else if (v == image4) {
		String id = Long.toString(4);
		Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
		ii.putExtra("KEY", id);
		ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(ii);
		overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
	} else if (v == image5) {
		String ie = Long.toString(5);
		Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
		ii.putExtra("KEY", ie);
		ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(ii);
		overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
	}
		
	}
}
