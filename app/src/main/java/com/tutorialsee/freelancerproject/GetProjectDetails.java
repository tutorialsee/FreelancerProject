package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GetProjectDetails extends Fragment {
	Context context;
	ImageView back;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MainActivity.lp = 2;
	}
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.get_project_details, container, false);
		//MainActivity.actionBar.hide();
		context = container.getContext();
	back  = (ImageView) v.findViewById(R.id.back);
	back.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			onBackPressed();
			
		}
	});
	

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
			Intent ii=new Intent(getActivity(),HomeActivity.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);


		}
	});
	
	services.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent ii=new Intent(getActivity(),Services.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);

		}
	});
	
	postproject.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent ii=new Intent(getActivity(),PostActivity.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);

		}
	});
	
	contact.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent ii=new Intent(getActivity(),ContactUs.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);


		}
	});
	
	usersetting.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent ii=new Intent(getActivity(),ProfileActivity.class);
			ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(ii);
			getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);


		}
	});
	
//*************************************************************************************************************

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
