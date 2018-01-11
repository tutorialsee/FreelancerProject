package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginNewActivity extends Activity {
	Context context;
	TextView forgetpassword,skip;
	Dialog dialog;
	ImageView back;
	Button btnLogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_new);
		context = this;
		skip = (TextView) findViewById(R.id.skip);
		forgetpassword = (TextView) findViewById(R.id.forgetpassword);
		back = (ImageView) findViewById(R.id.back);
		btnLogin = (Button) findViewById(R.id.btnLogin);
		forgetpassword.setPaintFlags(forgetpassword.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
		btnLogin.setOnClickListener(new OnClickListener() {
			
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
		forgetpassword.setOnClickListener(new OnClickListener() {
		
		

		@Override
		public void onClick(View arg0) {
			ViewDialog alert = new ViewDialog();
			alert.showDialog(context, "Error de conexi�n al servidor");
			
		}
	});
	
	}
	
	
	

	public class ViewDialog {
		public <AddListAddressd> void showDialog(Context context,
				String msg) {
			dialog = new Dialog(LoginNewActivity.this);
			dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
			dialog.setCancelable(false);
			dialog.setContentView(R.layout.forgotpass_popup);
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
