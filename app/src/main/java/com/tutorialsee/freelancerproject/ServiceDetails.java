package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ServiceDetails extends Activity {
	TextView text1,text2,text3,text4,text5;
	RelativeLayout imagebackgroundcolor;
	ImageView image1,image2,image3,image4,image5;
	TextView wordtext1,wordtext2,wordtext3,wordtext4,wordtext5;
	ImageView back;
	String BannerId;
	
	
	String ser1 = "1";
	String ser2 = "2";
	String ser3 = "3";
	String ser4 = "4";
	String ser5 = "5";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.service_details);
		
		Intent intent = getIntent();
		BannerId= intent.getStringExtra("KEY");
		Log.v("BannerId", BannerId);
		
		text1 = (TextView) findViewById(R.id.text1);
		text2 = (TextView) findViewById(R.id.text2);
		text3 = (TextView) findViewById(R.id.text3);
		text4 = (TextView) findViewById(R.id.text4);
		text5 = (TextView) findViewById(R.id.text5);
		wordtext1 = (TextView) findViewById(R.id.wordtext1);
		wordtext2 = (TextView) findViewById(R.id.wordtext2);
		wordtext3 = (TextView) findViewById(R.id.wordtext3);
		wordtext4 = (TextView) findViewById(R.id.wordtext4);
		wordtext5 = (TextView) findViewById(R.id.wordtext5);
		image1 = (ImageView) findViewById(R.id.image1);
		image2 = (ImageView) findViewById(R.id.image2);
		image3 = (ImageView) findViewById(R.id.image3);
		image4 = (ImageView) findViewById(R.id.image4);
		image5 = (ImageView) findViewById(R.id.image5);
		imagebackgroundcolor = (RelativeLayout) findViewById(R.id.imagebackgroundcolor);
		
		
		if(BannerId.equals(ser1)){
			Log.v("aaaaaaaaaaaaa", "1111111111111111");
			text1.setVisibility(View.VISIBLE);
			text2.setVisibility(View.GONE);
			text3.setVisibility(View.GONE);
			text4.setVisibility(View.GONE);
			text5.setVisibility(View.GONE);
			wordtext1.setVisibility(View.VISIBLE);
			wordtext2.setVisibility(View.GONE);
			wordtext3.setVisibility(View.GONE);
			wordtext4.setVisibility(View.GONE);
			wordtext5.setVisibility(View.GONE);
			image1.setVisibility(View.VISIBLE);
			image2.setVisibility(View.GONE);
			image3.setVisibility(View.GONE);
			image4.setVisibility(View.GONE);
			image5.setVisibility(View.GONE);
			imagebackgroundcolor.setBackgroundColor(Color.parseColor("#ffffff"));
		}else if(BannerId.equals(ser2)){
			Log.v("bbbbbbbbbbbbbb", "2222222222222222222");
			text1.setVisibility(View.GONE);
			text2.setVisibility(View.VISIBLE);
			text3.setVisibility(View.GONE);
			text4.setVisibility(View.GONE);
			text5.setVisibility(View.GONE);
			wordtext1.setVisibility(View.GONE);
			wordtext2.setVisibility(View.VISIBLE);
			wordtext3.setVisibility(View.GONE);
			wordtext4.setVisibility(View.GONE);
			wordtext5.setVisibility(View.GONE);
			image1.setVisibility(View.GONE);
			image2.setVisibility(View.VISIBLE);
			image3.setVisibility(View.GONE);
			image4.setVisibility(View.GONE);
			image5.setVisibility(View.GONE);
			imagebackgroundcolor.setBackgroundColor(Color.parseColor("#3CBCC3"));
		}else if(BannerId.equals(ser3)){
			Log.v("cccccccccccccccc", "3333333333333333333");
			text1.setVisibility(View.GONE);
			text2.setVisibility(View.GONE);
			text3.setVisibility(View.VISIBLE);
			text4.setVisibility(View.GONE);
			text5.setVisibility(View.GONE);
			wordtext1.setVisibility(View.GONE);
			wordtext2.setVisibility(View.GONE);
			wordtext3.setVisibility(View.VISIBLE);
			wordtext4.setVisibility(View.GONE);
			wordtext5.setVisibility(View.GONE);
			image1.setVisibility(View.GONE);
			image2.setVisibility(View.GONE);
			image3.setVisibility(View.VISIBLE);
			image4.setVisibility(View.GONE);
			image5.setVisibility(View.GONE);
			imagebackgroundcolor.setBackgroundColor(Color.parseColor("#FAFAFA"));
		}else if(BannerId.equals(ser4)){
			Log.v("ddddddddddddd", "44444444444444444");
			text1.setVisibility(View.GONE);
			text2.setVisibility(View.GONE);
			text3.setVisibility(View.GONE);
			text4.setVisibility(View.VISIBLE);
			text5.setVisibility(View.GONE);
			wordtext1.setVisibility(View.GONE);
			wordtext2.setVisibility(View.GONE);
			wordtext3.setVisibility(View.GONE);
			wordtext4.setVisibility(View.VISIBLE);
			wordtext5.setVisibility(View.GONE);
			image1.setVisibility(View.GONE);
			image2.setVisibility(View.GONE);
			image3.setVisibility(View.GONE);
			image4.setVisibility(View.VISIBLE);
			image5.setVisibility(View.GONE);
			imagebackgroundcolor.setBackgroundColor(Color.parseColor("#ffffff"));
		}else if(BannerId.equals(ser5)){
			Log.v("eeeeeeeeeeeeeeee", "5555555555555555555");
			text1.setVisibility(View.GONE);
			text2.setVisibility(View.GONE);
			text3.setVisibility(View.GONE);
			text4.setVisibility(View.GONE);
			text5.setVisibility(View.VISIBLE);
			wordtext1.setVisibility(View.GONE);
			wordtext2.setVisibility(View.GONE);
			wordtext3.setVisibility(View.GONE);
			wordtext4.setVisibility(View.GONE);
			wordtext5.setVisibility(View.VISIBLE);
			image1.setVisibility(View.GONE);
			image2.setVisibility(View.GONE);
			image3.setVisibility(View.GONE);
			image4.setVisibility(View.GONE);
			image5.setVisibility(View.VISIBLE);
			imagebackgroundcolor.setBackgroundColor(Color.parseColor("#A8A8B2"));
		}
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
