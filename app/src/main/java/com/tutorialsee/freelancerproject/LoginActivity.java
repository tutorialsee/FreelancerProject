package com.tutorialsee.freelancerproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

import com.tutorialsee.freelancerproject.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener {

TextView signup,skip,txtUsername;
Dialog dialog;
Button btnlogin;
Context context;
ImageView facebook,googleplus;

public SharedPreferences mPrefs;
String pid = "0";

	int pidtest;
	int quatest;
	String size_name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		context = this;
		

		
		skip = (TextView) findViewById(R.id.skip);
		signup = (TextView) findViewById(R.id.signup);
		txtUsername = (TextView) findViewById(R.id.txtUsername);
		btnlogin = (Button) findViewById(R.id.btnLogin);
		facebook = (ImageView) findViewById(R.id.facebook);
		googleplus = (ImageView) findViewById(R.id.googleplus);
		
		skip.setOnClickListener(this);
		signup.setOnClickListener(this);
		btnlogin.setOnClickListener(this);
		facebook.setOnClickListener(this);
		googleplus.setOnClickListener(this);
		
		
		
		
	
	}
	@Override
	public void onClick(View v) {
		if (v == skip) {
			Intent ii=new Intent(getApplicationContext(),MainActivity.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == signup) {
			Intent ii=new Intent(getApplicationContext(),ResigterActivityFirst.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		}  else if (v == btnlogin) {
			Intent ii=new Intent(getApplicationContext(),LoginNewActivity.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			overridePendingTransition(R.anim.left_slide_in, R.anim.right_slide_out);
		} else if (v == facebook) {
			
		} else if (v == googleplus) {
			

		} 
		
	}
	

	/*class SentDataFacebook extends AsyncTask<String, Void, String> {
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			MyProgressDialog.show(context);
		}

		@Override
		protected String doInBackground(String... params) {
			arraylist = new ArrayList<HashMap<String, String>>();
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
			nameValuePairs.add(new BasicNameValuePair("email",
					PrefernceSettings.getFBEMAIL()));
			nameValuePairs.add(new BasicNameValuePair("username",
					PrefernceSettings.getUserName()));
			Log.v("aaaaaaaaaaaaaaaaaaa", PrefernceSettings.getUserName());
			String res = BaseActivity.getJson(nameValuePairs, getActivity(),
					Constant.SOCIALLOGIN());
			try {
				JSONObject jObject = new JSONObject(res);
				msg = jObject.getString("success");
				if (ZZZ.msg.trim().equals("success")) {
					userid = jObject.getString("user_id");
				} else {
					userid = jObject.getString("user_id");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		protected void onPostExecute(String args) {
			MyProgressDialog.close(context);
			final Fragment activity = wrActivity.get();
			if (msg.trim().equals("true")) {
				PrefernceSettings.openDataBase(context);
				PrefernceSettings.setRegFlag(flg);
				PrefernceSettings.setUserId(userid);
				MainActivity._ordd.setText("Logout");
				sycart();
				msg = "";
				Fragment newContent = new HomeActivtiy();
				if (newContent != null) {
					if (activity != null
							&& !activity.getActivity().isFinishing()) {
						switchFragment(newContent);
					}
				}
			} else {
				if (msg.trim().equals("User Exist")) {
					PrefernceSettings.openDataBase(context);
					PrefernceSettings.setRegFlag(flg);
					PrefernceSettings.setUserId(userid);
					MainActivity._ordd.setText("Logout");
					sycart();
					msg = "";
					Fragment newContent = new HomeActivtiy();
					if (newContent != null) {
						if (activity != null
								&& !activity.getActivity().isFinishing()) {
							switchFragment(newContent);
						}
					}
					;
				} else {
					Toast toast = Toast.makeText(context,
							"Please check your Username or password",
							Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();
				}
			}
		}
	}
	*/
}
