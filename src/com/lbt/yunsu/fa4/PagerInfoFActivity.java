package com.lbt.yunsu.fa4;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.lbt.yunsu.R;

public class PagerInfoFActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			PagerInfoFragment pagerInfoFragment = new PagerInfoFragment();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, pagerInfoFragment).commit();
		}

	}
}
