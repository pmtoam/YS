package com.lbt.yunsu;

import com.lbt.yunsu.fa2.CityListFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * ����˵����Ӧ����ҳ -FragmentActivity2<br>
 * ��ϸ˵����Ӧ����ҳ�������Activity������RadioGroup�л���
 * 
 * @since 2014��4��1��
 */
public class FActivity2 extends FragmentActivity implements
		CityListFragment.OnItemSelectedListener {

	Fragment2 fragment2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			fragment2 = new Fragment2();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, fragment2).commit();
		}

	}

	@Override
	public void onItemSelected(String str) {
		if (fragment2 != null && fragment2.tv_city_name != null)
			fragment2.tv_city_name.setText(str);
	}
}
