package com.lbt.yunsu;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;

/**
 * 功能说明：应用主页 <br>
 * 详细说明：应用主页包含多个Activity，利用RadioGroup切换。
 * 
 * @since 2014年4月1日
 */
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity implements OnCheckedChangeListener 
{

	private RadioGroup mRadioGroup;
	private TabHost mTabHost;
	private Intent intent0;
	private Intent intent1;
	private Intent intent2;
	private Intent intent3;
	private Intent intent4;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		mRadioGroup = (RadioGroup) findViewById(R.id.main_tab);
		mRadioGroup.setOnCheckedChangeListener(this);
		mTabHost = getTabHost();

		intent0 = new Intent(this, FActivity0.class);
		mTabHost.addTab(mTabHost.newTabSpec("id0").setIndicator("", null)
				.setContent(intent0));

		intent1 = new Intent(this, FActivity1.class);
		mTabHost.addTab(mTabHost.newTabSpec("id1").setIndicator("", null)
				.setContent(intent1));

		intent2 = new Intent(this, FActivity2.class);
		mTabHost.addTab(mTabHost.newTabSpec("id2").setIndicator("", null)
				.setContent(intent2));

		intent3 = new Intent(this, FActivity3.class);
		mTabHost.addTab(mTabHost.newTabSpec("id3").setIndicator("", null)
				.setContent(intent3));

		intent4 = new Intent(this, FActivity4.class);
		mTabHost.addTab(mTabHost.newTabSpec("id4").setIndicator("", null)
				.setContent(intent4));
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rb0:
			this.mTabHost.setCurrentTabByTag("id0");
			break;
		case R.id.rb1:
			this.mTabHost.setCurrentTabByTag("id1");
			break;
		case R.id.rb2:
			this.mTabHost.setCurrentTabByTag("id2");
			break;
		case R.id.rb3:
			this.mTabHost.setCurrentTabByTag("id3");
			break;
		case R.id.rb4:
			this.mTabHost.setCurrentTabByTag("id4");
			break;
		}
	}

}