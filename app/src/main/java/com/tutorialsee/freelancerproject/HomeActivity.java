package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;
import com.tutorialsee.freelancerproject.viewpager.CardFragmentPagerAdapter;
import com.tutorialsee.freelancerproject.viewpager.ShadowTransformer;

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
import android.widget.LinearLayout;
import android.widget.Toast;


public class HomeActivity extends Fragment {
	Context context;
	ImageView setting;
	Button client;
	Dialog dialog;
	static int c = 1;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MainActivity.lp = 1;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.home_activity, container, false);
		//MainActivity.actionBar.hide();
				context = container.getContext();

				//MainActivity.mDrawerLayout.closeDrawer(MainActivity.mDrawerList);

				//MainActivity.mDrawerList.setVisibility(View.GONE);
				//MainActivity.mDrawerLayout.setVisibility(View.GONE);
	
				//MainActivity.mDrawerToggle.onDrawerClosed(v);
				client  = (Button) v.findViewById(R.id.client);
				setting = (ImageView) v.findViewById(R.id.setting);
				
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

						String i = Long.toString(1);
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

				
				
				
				
				
				//***************************************************************************************************
				// including layout coding
				View someLayoutView = v.findViewById(R.id.footer);
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
						/*Intent ii=new Intent(getActivity(),HomeActivity.class);
						ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(ii);
						getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
*/
						
						

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

			public static float dpToPixels(int dp, HomeActivity homeactivity) {
				return dp * (homeactivity.getResources().getDisplayMetrics().density);
			}

			
	public void onBackPressed() {
		MainActivity.lp = 1;
	}

	@Override
	public void onResume() {
		MainActivity.lp = 1;
		super.onResume();
	}

	// switching fragment
	@SuppressWarnings("unused")
	private void switchFragment(Fragment fragment) {

		// mDrawerLayout.closeDrawer(mDrawerList);
		getActivity().getSupportFragmentManager().beginTransaction()
				.replace(R.id.content_frame, fragment)
				.addToBackStack("my_fragment").commit();
	}
}