package com.lbt.yunsu.fa0;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.lbt.yunsu.R;

/**
 * ����˵����<br>
 * ��ϸ˵����
 * 
 */
public class MinsuDetailsFActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			MinsuDetailsFragment fragment = new MinsuDetailsFragment();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, fragment).commit();
		}

	}
}
