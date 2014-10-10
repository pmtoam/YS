package com.lbt.yunsu.fa0;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.lbt.yunsu.R;
import com.lbt.yunsu.fa2.RoomModelListFragment;
import com.lbt.yunsu.util.MyLog;

/**
 * 功能说明：民宿详情碎片<br>
 * 详细说明：
 * 
 * @since 2014年4月2日
 */
public class MinsuDetailsFragment extends Fragment {

	private String TAG = getClass().getName().replace(MyLog.PACKAGE_NAME, "");

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		MyLog.i(TAG, "onCreateView()");
		return inflater.inflate(R.layout.minsu_details_fragment, container,
				false);
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

		ImageButton imgbtn_back = (ImageButton) getActivity().findViewById(
				R.id.imgbtn_back);
		ImageButton imgbtn_tel = (ImageButton) getActivity().findViewById(
				R.id.imgbtn_tel);
		LinearLayout ll_server_feature = (LinearLayout) getActivity()
				.findViewById(R.id.ll_server_feature);
		LinearLayout ll_minsu_address = (LinearLayout) getActivity()
				.findViewById(R.id.ll_minsu_address);
		LinearLayout ll_comment = (LinearLayout) getActivity().findViewById(
				R.id.ll_comment);
		ImageButton img_btn_0 = (ImageButton) getActivity().findViewById(
				R.id.img_btn_0);
		ImageButton img_btn_1 = (ImageButton) getActivity().findViewById(
				R.id.img_btn_1);
		imgbtn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				getActivity().finish();
			}
		});
		imgbtn_tel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				FragmentTransaction transaction = getActivity()
						.getSupportFragmentManager().beginTransaction();
				HotlineFragment fragment = new HotlineFragment();
				transaction.add(R.id.fragment_container, fragment);
				transaction.addToBackStack(null);
				transaction.commit();
			}
		});
		ll_server_feature.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				MyLog.i(TAG, "ll_server_feature.setOnClickListener()");
				
				FragmentTransaction transaction = getActivity()
						.getSupportFragmentManager().beginTransaction();
				ServerFeatureFragment fragment = new ServerFeatureFragment();
				transaction.add(R.id.fragment_container, fragment);
				transaction.addToBackStack(null);
				transaction.commit();
			}
		});
		ll_minsu_address.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyLog.i(TAG, "ll_minsu_address.setOnClickListener()");
			}
		});
		ll_comment.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyLog.i(TAG, "ll_comment.setOnClickListener()");
			}
		});
		img_btn_0.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

//				startActivity(new Intent(getActivity(),
//						BookingMinsuFActivity.class));
				FragmentTransaction transaction = getActivity()
						.getSupportFragmentManager().beginTransaction();
				BookingMinsuFragment fragment = new BookingMinsuFragment();
				transaction.add(R.id.fragment_container, fragment);
				transaction.addToBackStack(null);
				transaction.commit();
			}
		});
		img_btn_1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

//				startActivity(new Intent(getActivity(),
//						BookingMinsuFActivity.class));
				
				FragmentTransaction transaction = getActivity()
						.getSupportFragmentManager().beginTransaction();
				BookingMinsuFragment fragment = new BookingMinsuFragment();
				transaction.add(R.id.fragment_container, fragment);
				transaction.addToBackStack(null);
				transaction.commit();
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
