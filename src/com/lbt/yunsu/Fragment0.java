package com.lbt.yunsu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.lbt.yunsu.fa0.MinsuDetailsFActivity;
import com.lbt.yunsu.util.MyLog;
import com.lbt.yunsu.widget.XListView;

/**
 * 功能说明：应用主页 -FragmentActivity0的默认碎片。<br>
 * 详细说明：
 * 
 * @since 2014年4月1日
 */
public class Fragment0 extends Fragment {

	private String TAG = "Fragment0";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		MyLog.i(TAG, "onCreateView()");
		return inflater.inflate(R.layout.fragment0, container, false);
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

		XListView xlistview = (XListView) getActivity().findViewById(
				R.id.xlistview);
		xlistview.setPullLoadEnable(false);
		xlistview.setPullRefreshEnable(false);
		xlistview.setAdapter(new MyAdapter());
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

	public class MyAdapter extends BaseAdapter {

		int count = 10;

		public MyAdapter() {
		}

		public int getCount() {
			return count;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(final int position, View convertView,
				ViewGroup parent) {

			final ViewHolder holder;

			if (convertView == null) {
				convertView = LayoutInflater.from(getActivity()).inflate(
						R.layout.fragment0_xlistview_item, null);
				holder = new ViewHolder();
				holder.iv = (ImageView) convertView.findViewById(R.id.iv);
				holder.rl = (RelativeLayout) convertView.findViewById(R.id.rl);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

//			holder.iv.setImageResource(R.drawable.minsu_pic_000);
			holder.rl.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MyLog.i(TAG, "" + position);
					Intent intent = new Intent(getActivity(), MinsuDetailsFActivity.class);
					startActivity(intent);
				}
			});

			return convertView;
		}

		class ViewHolder {
			RelativeLayout rl;
			ImageView iv;
		}

	}
}
