package com.tutorialsee.freelancerproject;

import java.util.ArrayList;
import java.util.List;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class PostActivity extends Activity {
	Context context;
	ImageView back;
	Button btndLogin;
	 Spinner category,providers;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_post);
		context = this;

		providers = (Spinner) findViewById(R.id.providers);
		category = (Spinner) findViewById(R.id.category);
		back = (ImageView) findViewById(R.id.back);
		btndLogin = (Button) findViewById(R.id.btndLogin);
		btndLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent ii=new Intent(getBaseContext(),ResigterActivity.class);
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
		
		
		
		
		List<String> lists = new ArrayList<String>();
		          
		lists.add("Local Area");
		lists.add("Any where from india");
		lists.add("Any wher from World");
		lists.add("Providers From");
		final int listsizes = lists.size() - 1;
		ArrayAdapter<String> dataAdapters = new ArrayAdapter<String>(this,R.layout.spinner_item, lists) {
		 @Override
		public int getCount() {
		    return(listsizes); // Truncate the list
		}
		};
		dataAdapters.setDropDownViewResource(R.layout.spinner_item);
		providers.setAdapter(dataAdapters);

		providers.setSelection(listsizes); // Hidden item to appear in the spinner
		
		List<String> list = new ArrayList<String>();
		list.add("WEBSITE & SOFTWARE DEVELOPMENT");
		list.add("OTHER SERVICES");
		list.add("MOBILE APPLICATION DEVLOPMENT");
		list.add("IT SERVICES");
		list.add("DIGITAL MARKETING & SALES");
		list.add("DESIGN AND MULTIMEDIA");
		list.add("DATA ENTRY");
		list.add("CONTENT WRITING");
		list.add("Select The Category");
		final int listsize = list.size() - 1;
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,R.layout.spinner_item, list) {
		 @Override
		public int getCount() {
		    return(listsize); // Truncate the list
		}
		};
		dataAdapter.setDropDownViewResource(R.layout.spinner_item);
		category.setAdapter(dataAdapter);

		category.setSelection(listsize); // Hidden item to appear in the spinner
		
		
		
		
		
		
		
		
		
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
						/*Intent ii=new Intent(getApplicationContext(),ProfileActivity.class);
						ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(ii);
						overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
*/
						

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
