package com.lbt.yunsu.fa0;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.lbt.yunsu.R;
import com.lbt.yunsu.util.MyLog;

/**
 * 功能说明：民宿服务热线碎片<br>
 * 详细说明：
 * 
 * @since 2014年4月2日
 */
public class HotlineFragment extends Fragment {

	private String TAG = getClass().getName().replace(MyLog.PACKAGE_NAME, "");

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		MyLog.i(TAG, "onCreateView()");
		return inflater.inflate(R.layout.hotline_fragment, container, false);
	}

	@Override
	public void onStart() {
		super.onStart();
		MyLog.i(TAG, "onStart()");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		MyLog.i(TAG, "onActivityCreated()");

		Button btn_call_ok = (Button) getActivity().findViewById(
				R.id.btn_call_ok);
		Button btn_call_cancel = (Button) getActivity().findViewById(
				R.id.btn_call_cancel);
		btn_call_ok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent phoneIntent = new Intent("android.intent.action.CALL",
						Uri.parse("tel:4008886868"));
				startActivity(phoneIntent);
				getActivity().onBackPressed();
			}
		});
		btn_call_cancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyLog.i(TAG, "btn_call_cancel.setOnClickListener()");
				getActivity().onBackPressed();
			}
		});
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MyLog.i(TAG, "onCreate()");
	}

	@Override
	public void onStop() {
		super.onStop();
		MyLog.i(TAG, "onStop()");
	}

	@Override
	public void onResume() {
		super.onResume();
		MyLog.i(TAG, "onResume()");
	}

	@Override
	public void onPause() {
		super.onPause();
		MyLog.i(TAG, "onPause()");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		MyLog.i(TAG, "onDestroy()");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		MyLog.i(TAG, "onDetach()");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		MyLog.i(TAG, "onDestroyView()");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		MyLog.i(TAG, "onSaveInstanceState()");
	}

}
