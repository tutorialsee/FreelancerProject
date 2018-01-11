package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SettingActivity extends Activity implements OnClickListener {
	ImageView setting;
	Context context;
	String BannerId;
	String a = "1";
	String b = "2";
	String c = "3";
	
	 static int sa1 = 1;
	 static int sa2 = 2;
	 static int sa3 = 3;
	 static int sa4 = 4;
	 static int sa5 = 5;
	
	LinearLayout service,post,pricing,myprofile,aboutus,work,contactus,home;
	RelativeLayout service1,service2,service3,service4,service5;



	static LinearLayout slidersecond,sliderfirsy;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		context = this;

		Intent intent = getIntent();
		BannerId= intent.getStringExtra("KEY");
		Log.v("BannerId", BannerId);


		slidersecond = (LinearLayout) findViewById(R.id.slidersecond);
		sliderfirsy = (LinearLayout) findViewById(R.id.sliderfirsy);
		service = (LinearLayout) findViewById(R.id.service);
		service1 = (RelativeLayout) findViewById(R.id.service1);
		service2 = (RelativeLayout) findViewById(R.id.service2);
		service3 = (RelativeLayout) findViewById(R.id.service3);
		service4 = (RelativeLayout) findViewById(R.id.service4);
		service5 = (RelativeLayout) findViewById(R.id.service5);
		post = (LinearLayout) findViewById(R.id.post);
		pricing = (LinearLayout) findViewById(R.id.pricing);
		myprofile = (LinearLayout) findViewById(R.id.myprofile);
		aboutus = (LinearLayout) findViewById(R.id.aboutus);
		work = (LinearLayout) findViewById(R.id.work);
		setting = (ImageView) findViewById(R.id.setting);
		contactus = (LinearLayout) findViewById(R.id.contactus);
		home = (LinearLayout) findViewById(R.id.home);
		
		
		home.setOnClickListener(this);
		contactus.setOnClickListener(this);
		setting.setOnClickListener(this);
		work.setOnClickListener(this);
		aboutus.setOnClickListener(this);
		pricing.setOnClickListener(this);
		post.setOnClickListener(this);
		myprofile.setOnClickListener(this);
		service.setOnClickListener(this);
		service1.setOnClickListener(this);
		service2.setOnClickListener(this);
		service3.setOnClickListener(this);
		service4.setOnClickListener(this);
		service5.setOnClickListener(this);






		if(BannerId.equals(a)){
			Log.v("aaaaaaaaaaaaa", "1111111111111111");
			sliderfirsy.setVisibility(View.GONE);
			slidersecond.setVisibility(View.VISIBLE);
		}else if(BannerId.equals(b)){
			Log.v("bbbbbbbbbbbbbbbbbb", "22222222222222222222");
			sliderfirsy.setVisibility(View.VISIBLE);
			slidersecond.setVisibility(View.GONE);
		}else if(BannerId.equals(c)){
			Log.v("ccccccccccccccccccccc", "3333333333333333333");
			sliderfirsy.setVisibility(View.GONE);
			slidersecond.setVisibility(View.VISIBLE);
		}



	}

	@Override
	public void onBackPressed()
	{
		super.onBackPressed();  
	}


	@Override
	public void onClick(View v) {
		if (v == service) {
			Intent ii=new Intent(getApplicationContext(),Services.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == service1) {
			String ia = Long.toString(1);
			Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
			ii.putExtra("KEY", ia);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == service2) {
			String ib = Long.toString(2);
			Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
			ii.putExtra("KEY", ib);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == service3) {
			String ic = Long.toString(3);
			Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
			ii.putExtra("KEY", ic);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == service4) {
			String id = Long.toString(4);
			Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
			ii.putExtra("KEY", id);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == service5) {
			String ie = Long.toString(5);
			Intent ii=new Intent(getApplicationContext(),ServiceDetails.class);
			ii.putExtra("KEY", ie);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == post) {
			Intent ii=new Intent(getApplicationContext(),PostActivity.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == pricing) {
			Intent ii=new Intent(getApplicationContext(),Pricing.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == myprofile) {
			Intent ii=new Intent(getApplicationContext(),ProfileActivity.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == aboutus) {
			Intent ii=new Intent(getApplicationContext(),AboutUs.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == work) {
			Intent ii=new Intent(getApplicationContext(),HowItWork.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == setting) {
			overridePendingTransition(R.anim.abc_slide_out_bottom, R.anim.abc_slide_in_top);
			onBackPressed();
		} else if (v == contactus) {
			Intent ii=new Intent(getApplicationContext(),ContactUs.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == home) {
			overridePendingTransition(R.anim.abc_slide_out_bottom, R.anim.abc_slide_in_top);
			onBackPressed();
		}


	}
	
}
