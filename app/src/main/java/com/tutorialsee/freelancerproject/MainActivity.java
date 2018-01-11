package com.tutorialsee.freelancerproject;

import com.tutorialsee.freelancerproject.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener,OnItemClickListener {

	public static DrawerLayout mDrawerLayout;
	public static RelativeLayout mDrawerList;
	public static ActionBarDrawerToggle mDrawerToggle;
	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	Context context;
	public static int lp = 0;
	int flag = 1;
	static ActionBar actionBar;
	RelativeLayout lin2;
	LinearLayout lin28,lin29,lin27,lin285,lin265,lin2652;
	ImageView home,postproject,getproject;
	public static String CUR_PAGE_TITLE = "Title";
	
	@SuppressWarnings("unused")
	private Handler mHandler = new Handler();
	@Override
	public void onResume() {
		Log.v("DEBUG", "onResume of LoginFragment");

		super.onResume();
	}

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
		setContentView(R.layout.activity_main);
		context = this;		
		/*actionBar = getSupportActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.white)));
	    actionBar.setCustomView(R.layout.row);
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(false);
		actionBar.setHomeButtonEnabled(true);*/
		//actionBar.setIcon(R.drawable.listicon);
		
		initMenu();
		mTitle = mDrawerTitle = getTitle();
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		
		mDrawerList = (RelativeLayout) findViewById(R.id.left_drawer);
		lin28 = (LinearLayout) findViewById(R.id.lin28);
		lin29 = (LinearLayout) findViewById(R.id.lin29);
		lin27 = (LinearLayout) findViewById(R.id.lin27);
		lin285 = (LinearLayout) findViewById(R.id.lin285);
		lin265 = (LinearLayout) findViewById(R.id.lin265);
		lin2652 = (LinearLayout) findViewById(R.id.lin2652);
		home = (ImageView) findViewById(R.id.home);
		postproject = (ImageView) findViewById(R.id.postproject);
		getproject = (ImageView) findViewById(R.id.getproject);
		
		getproject.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Fragment newContent = new GetProject();
				if (newContent != null) {
					switchFragment(newContent);
				}
				
			}
		});
		
		postproject.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent ii=new Intent(getApplicationContext(),PostActivity.class);
				 ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                 startActivity(ii);
				/*Fragment newContent = new TransactionalHistory();
				if (newContent != null) {
					switchFragment(newContent);
				}*/
				
			}
		});
		
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Fragment newContent = new HomeActivity();
				if (newContent != null) {
					switchFragment(newContent);
				}
				
			}
		});
		lin2652.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Fragment newContent = new TransactionalHistory();
				if (newContent != null) {
					switchFragment(newContent);
				}
				
			}
		});
		lin265.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			/*	Fragment newContent = new Pricing();
				if (newContent != null) {
					switchFragment(newContent);
				}*/
				
			}
		});
		lin285.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				/*Fragment newContent = new ProfileActivity();
				if (newContent != null) {
					switchFragment(newContent);
				}*/
				
			}
		});
		lin27.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				/*Fragment newContent = new Services();
				if (newContent != null) {
					switchFragment(newContent);
				}*/
				
			}
		});
		lin29.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				/*Fragment newContent = new ContactUs();
				if (newContent != null) {
					switchFragment(newContent);
				}
				*/
			}
		});
		lin28.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				/*Fragment newContent = new AboutUs();
				if (newContent != null) {
					switchFragment(newContent);
				}*/
				
			}
		});

		// set a custom shadow that overlays the main content when the drawer
		// opens
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,GravityCompat.START);

		// enable ActionBar app icon to behave as action to toggle nav drawer
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//getSupportActionBar().setHomeButtonEnabled(true);

		// ActionBarDrawerToggle ties together the the proper interactions
		// between the sliding drawer and the action bar app icon
		mDrawerToggle = new ActionBarDrawerToggle(this, // host Activity
				mDrawerLayout, // DrawerLayout object
				// nav drawer image to replace 'Up' image
				R.string.drawer_open, // "open drawer" description for
				// accessibility
				R.string.drawer_close // "close drawer" description for
				// accessibility
				) {
			public void onDrawerClosed(View view) {
				
				//getSupportActionBar().setTitle(mTitle);
				invalidateOptionsMenu(); // creates call to
				// onPrepareOptionsMenu()
			}

			public void onDrawerOpened(View drawerView) {
				
				//getSupportActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu(); // creates call to
				//onPrepareOptionsMenu()
			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);

		if (savedInstanceState == null) {
			switchFragment(new HomeActivity());
			setSelected(lin2);

		}
	}


	private void initMenu() {
		lin2 = (RelativeLayout) findViewById(R.id.lin2);
		
		lin2.setOnClickListener(this);
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
				mDrawerLayout.closeDrawer(mDrawerList);
			} else {
				mDrawerLayout.openDrawer(mDrawerList);
			}
		}
		return true;

	}

	@Override
	public void onClick(View v) {
		Fragment newContent = null;
		Bundle bundle = new Bundle();

		if (v.getId() == R.id.lin2) {
			newContent = new HomeActivity();
		}
		if (newContent != null) {
			newContent.setArguments(bundle);
			switchFragment(newContent);
		}

	}

	// switching fragment
	private void switchFragment(Fragment fragment) {

		mDrawerLayout.closeDrawer(mDrawerList);

		FragmentManager fragmentManager = getSupportFragmentManager();
		// fragmentManager.beginTransaction().replace(R.id.content_frame,
		// fragment).commit();
		fragmentManager.beginTransaction()
		.replace(R.id.content_frame, fragment)
		.addToBackStack("my_fragment").commit();
	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getSupportActionBar().setTitle(mTitle);
	}

	// set the selected option as enabled
	private void setSelected(RelativeLayout rl) {

		lin2.setSelected(false);
		
		
		rl.setSelected(true); // set current selection

	}

	// When using the ActionBarDrawerToggle, you must call it during
	// onPostCreate() and onConfigurationChanged()
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggles
		mDrawerToggle.onConfigurationChanged(newConfig);
	}



	@Override
	public void onBackPressed() {

		if (MainActivity.lp == 1) {

			Log.v("MainActivity", "" + MainActivity.lp);

		} else {
			Log.v("MainActivity", "" + MainActivity.lp);
			super.onBackPressed();
		}
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (MainActivity.lp == 1) {
			if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				finish();
				System.exit(0);
				return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
}