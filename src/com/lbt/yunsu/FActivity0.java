package com.lbt.yunsu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * ����˵����Ӧ����ҳ -FragmentActivity0<br>
 * ��ϸ˵����Ӧ����ҳ�������Activity������RadioGroup�л���
 * 
 * @since 2014��4��1��
 */
public class FActivity0 extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);

		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null)
				return;

			Fragment0 fragment0 = new Fragment0();
			getSupportFragmentManager().beginTransaction()
					.add(R.id.fragment_container, fragment0).commit();
		}

	}
}
