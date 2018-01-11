package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;
import com.tutorialsee.freelancerproject.MyVerticalSeekBar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ResigterActivityFirst extends Activity {
	Context context;
	ImageView back;
	LinearLayout b1,b2,b3;
    MyVerticalSeekBar vertical_Seekbar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resigter_activity_first);
		context = this;

		back = (ImageView) findViewById(R.id.back);
		   b1 = (LinearLayout) findViewById(R.id.btn1);
	        b2 = (LinearLayout) findViewById(R.id.btn2);
	        b3 = (LinearLayout) findViewById(R.id.btn3);

	        
	        vertical_Seekbar = (MyVerticalSeekBar) findViewById(R.id.vertical_Seekbar);
	        vertical_Seekbar.setProgress(100);
	        vertical_Seekbar.progress = new MyVerticalSeekBar.Progress() {
	            @Override
	            public void getProgress(int progress) {
	                if(progress >= 0 && progress <=30) {
	                    changeButtonColor(b3);
	                } else if(progress > 30 && progress <= 60) {
	                    changeButtonColor(b2);
	                } else if(progress > 60 && progress <= 100) {
	                    changeButtonColor(b1);
	                }
	            }
	        };
	        
		
		
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
		final ImageView homeimage = (ImageView) someLayoutView.findViewById(R.id.homeimage);
		homeimage.setBackgroundResource(R.drawable.homeselect);
		
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
	
	 private void changeButtonColor(View view) {

	       // b1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
	      //  b2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
	       // b3.setBackgroundColor(getResources().getColor(R.color.colorAccent));

	        if (view.getId() == R.id.btn1) {
	        	Intent ii=new Intent(getBaseContext(),PostActivity.class);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);
	            //b1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
	        } else if (view.getId() == R.id.btn2) {
	        	Intent ii=new Intent(getBaseContext(),RegisterFreelancers.class);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);
	           // b2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
	        } else if (view.getId() == R.id.btn3) {
	        	Intent ii=new Intent(getBaseContext(),RegisterCompany.class);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);
	            //b3.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
	        }
	    }
	 
	 @Override
		public void onBackPressed()
		{
		 super.onBackPressed();  
		}
}
