package com.lbt.yunsu.fa4;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.lbt.yunsu.R;

public class PagerInfoAboutFActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			PagerInfoAboutFragment pagerInfoAboutFragment = new PagerInfoAboutFragment();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, pagerInfoAboutFragment).commit();
		}

	}
}
