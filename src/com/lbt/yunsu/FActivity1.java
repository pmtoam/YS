package com.lbt.yunsu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.lbt.yunsu.fa2.CityListFragment;
import com.lbt.yunsu.fa2.SortListFragment;

/**
 * 功能说明：应用主页 -FragmentActivity1<br>
 * 详细说明：应用主页包含多个Activity，利用RadioGroup切换。
 * 
 * @since 2014年4月1日
 */
public class FActivity1 extends FragmentActivity implements
		CityListFragment.OnItemSelectedListener,
		SortListFragment.OnItemSelectedListener {

	Fragment1 fragment1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			fragment1 = new Fragment1();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, fragment1).commit();
		}

	}

	@Override
	public void onItemSelected(String str) {
		if (fragment1 != null && fragment1.tv_city_total_minsu != null) {
//			fragment1.tv_city_total_minsu.setText(str);
		}
	}
}
