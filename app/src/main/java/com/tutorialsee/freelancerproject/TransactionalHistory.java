package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TransactionalHistory extends Fragment {
	Context context;
	ImageView back;
	TextView total;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MainActivity.lp = 2;
	}


	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.transactional_history_activity, container, false);
		//MainActivity.actionBar.hide();
		context = container.getContext();
		back  = (ImageView) v.findViewById(R.id.back);
		total  = (TextView) v.findViewById(R.id.total);

//***************************************************************************************************
		// including layout coding
		View someLayoutView = v.findViewById(R.id.footer);
		LinearLayout home = (LinearLayout) someLayoutView.findViewById(R.id.home);
		LinearLayout services = (LinearLayout) someLayoutView.findViewById(R.id.services);
		ImageView postproject = (ImageView) someLayoutView.findViewById(R.id.postproject);
		LinearLayout contact = (LinearLayout) someLayoutView.findViewById(R.id.contact);
		LinearLayout usersetting = (LinearLayout) someLayoutView.findViewById(R.id.usersetting);

		home.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getActivity(), "home activtiy",Toast.LENGTH_LONG).show();

			}
		});
		
		services.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getActivity(), "home activtiy",Toast.LENGTH_LONG).show();

			}
		});
		
		postproject.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getActivity(), "home activtiy",Toast.LENGTH_LONG).show();

			}
		});
		
		contact.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getActivity(), "home activtiy",Toast.LENGTH_LONG).show();

			}
		});
		
		usersetting.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getActivity(), "home activtiy",Toast.LENGTH_LONG).show();

			}
		});
		
//*************************************************************************************************************
		
		
		
		
		
		
		
		
		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				onBackPressed();

			}
		});


		return v;
	}





	private void switchFragment(Fragment fragment) {
		getActivity(). getSupportFragmentManager().beginTransaction()
		.replace(R.id.content_frame, fragment)
		.addToBackStack("my_fragment").commitAllowingStateLoss();
	}

	public void onBackPressed() {
		if (getFragmentManager().getBackStackEntryCount() > 0) {
			getFragmentManager().popBackStack();
		} 
	}
}
