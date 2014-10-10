package com.lbt.yunsu.fa2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.lbt.yunsu.R;

/**
 * ����˵���������б�FragmentActivity<br>
 * ��ϸ˵����
 * 
 */
public class MinsuListFActivity extends FragmentActivity implements
		SortListFragment.OnItemSelectedListener,
		RoomModelListFragment.OnItemSelectedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			MinsuListFragment fragment = new MinsuListFragment();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, fragment).commit();
		}

	}

	@Override
	public void onItemSelected(String str) {
		// TODO Auto-generated method stub

	}
}
