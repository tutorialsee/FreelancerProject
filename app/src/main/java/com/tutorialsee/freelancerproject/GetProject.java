package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.LoginNewActivity.ViewDialog;
import com.tutorialsee.freelancerproject.viewpager.CardFragmentPagerAdapter;
import com.tutorialsee.freelancerproject.viewpager.ShadowTransformer;
import com.tutorialsee.freelancerproject.R;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GetProject extends Fragment {
	Context context;
	ImageView back,setting;
	Button client;
	Dialog dialog;
	static int c = 3;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MainActivity.lp = 2;
	}


	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.get_project_demo, container, false);
		//MainActivity.actionBar.hide();
		context = container.getContext();

		client  = (Button) v.findViewById(R.id.client);
		setting = (ImageView) v.findViewById(R.id.setting);
		back  = (ImageView) v.findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				onBackPressed();

			}
		});
		client.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Fragment newContent = new GetProjectDetails();
				if (newContent != null) {
					switchFragment(newContent);
				}

			}
		});
		setting.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String i = Long.toString(3);
				Intent ii=new Intent(getActivity(),SettingActivity.class);
				ii.putExtra("KEY", i);
				ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ii);
				getActivity().overridePendingTransition(R.anim.abc_slide_in_top, R.anim.abc_slide_out_bottom);


			}
		});


		ViewPager viewPager = (ViewPager) v.findViewById(R.id.viewPager);

		CardFragmentPagerAdapter pagerAdapter = new CardFragmentPagerAdapter(getActivity().getSupportFragmentManager(), dpToPixels(2, this));
		ShadowTransformer fragmentCardShadowTransformer = new ShadowTransformer(viewPager, pagerAdapter);
		fragmentCardShadowTransformer.enableScaling(true);

		viewPager.setAdapter(pagerAdapter);
		viewPager.setPageTransformer(false, fragmentCardShadowTransformer);
		viewPager.setOffscreenPageLimit(3);

		return v;
	}

	public static float dpToPixels(int dp, GetProject getProject) {
		return dp * (getProject.getResources().getDisplayMetrics().density);
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
