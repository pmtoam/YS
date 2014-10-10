package com.lbt.yunsu.fa4;

import com.lbt.yunsu.R;
import com.lbt.yunsu.Fragment0.MyAdapter;
import com.lbt.yunsu.util.MyLog;
import com.lbt.yunsu.widget.XListView;
import com.lbt.yunsu.widget.XListView.IXListViewListener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class PagerInfoAcountManagerOrderFragment extends Fragment implements OnClickListener{
	
	private String TAG = "PagerInfoAcountManagerOrderFragment";
	
	private ImageButton f_back;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		MyLog.i(TAG, "onCreateView()");
		return inflater.inflate(R.layout.pager_info_acount_manager_order_fragment, container, false);
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
		
		setView();

	}

	public void setView() {
		
		f_back = (ImageButton) getView().findViewById(R.id.back);
		f_back.setOnClickListener(this);

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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 switch (v.getId()) {
	        case R.id.back:
				getActivity().finish();
				break;
	        default:
	            break;
	        }
	}
	
	

}
