package com.lbt.yunsu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * 功能说明：应用主页 -FragmentActivity3<br>
 * 详细说明：应用主页包含多个Activity，利用RadioGroup切换。
 * 
 * @since 2014年4月1日
 */
public class FActivity3 extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			Fragment3 fragment3 = new Fragment3();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, fragment3).commit();
		}

	}
}
