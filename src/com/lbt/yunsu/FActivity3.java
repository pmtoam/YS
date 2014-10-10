package com.lbt.yunsu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * ����˵����Ӧ����ҳ -FragmentActivity3<br>
 * ��ϸ˵����Ӧ����ҳ�������Activity������RadioGroup�л���
 * 
 * @since 2014��4��1��
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
