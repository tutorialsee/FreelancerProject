package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterFreelancers extends Activity {
	Context context;
	TextView skip;
	ImageView back;
	Button btndLogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_freelancers);
		context = this;

		skip = (TextView) findViewById(R.id.skip);
		back = (ImageView) findViewById(R.id.back);
		  
		btndLogin = (Button) findViewById(R.id.btndLogin);
		  
		btndLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent ii=new Intent(getBaseContext(),MainActivity.class);
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
		skip.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent ii=new Intent(getBaseContext(),MainActivity.class);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);

			}
		});
	}
	 @Override
		public void onBackPressed()
		{
		 super.onBackPressed();  
		}
}
