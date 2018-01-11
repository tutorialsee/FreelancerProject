package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ContactUs extends Activity {
	Context context;
	ImageView back;
	Button contact;
	Dialog dialog;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_us);
		context= this;
		
		back  = (ImageView) findViewById(R.id.back);
		contact  = (Button) findViewById(R.id.contact);
		
		contact.setOnClickListener(new OnClickListener() {
			
			

			@Override
			public void onClick(View arg0) {
				ViewDialog alert = new ViewDialog();
				alert.showDialog(context, "Error de conexi�n al servidor");
				
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
			final ImageView contactimage = (ImageView) someLayoutView.findViewById(R.id.contactimage);
			contactimage.setBackgroundResource(R.drawable.contactselect);
			
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
					/*Intent ii=new Intent(getApplicationContext(),ContactUs.class);
					ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
					startActivity(ii);
					overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
*/
					

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
	

	


	public class ViewDialog {
		public <AddListAddressd> void showDialog(Context context,
				String msg) {
			dialog = new Dialog(getApplicationContext());
			dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
			dialog.setCancelable(false);
			dialog.setContentView(R.layout.contactform);
			 Button save = (Button) dialog.findViewById(R.id.save);
	            TextView cancel = (TextView) dialog.findViewById(R.id.cancle);
				//email = (EditText) dialog.findViewById(R.id.email);
				save.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						//Add();
					}
				});
				cancel.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						dialog.dismiss();
					}
				});
			dialog.show();
			WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
			lp.copyFrom(dialog.getWindow().getAttributes());
			lp.width = WindowManager.LayoutParams.MATCH_PARENT;
			lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
			dialog.getWindow().setAttributes(lp);
		}
	}
	
	@Override
	public void onBackPressed()
	{
		super.onBackPressed();  
	}
}
