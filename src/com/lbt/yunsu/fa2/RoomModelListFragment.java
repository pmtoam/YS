package com.lbt.yunsu.fa2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lbt.yunsu.R;
import com.lbt.yunsu.util.MyLog;
import com.lbt.yunsu.widget.XListView;

/**
 * 功能说明：房型列表碎片<br>
 * 详细说明：
 * 
 * @since 2014年4月2日
 */
public class RoomModelListFragment extends Fragment {

	private String TAG = getClass().getName().replace(MyLog.PACKAGE_NAME, "");

	OnItemSelectedListener mCallback;

	public interface OnItemSelectedListener {
		public void onItemSelected(String str);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		MyLog.i(TAG, "onCreateView()");
		return inflater.inflate(R.layout.city_list_fragment, container, false);
	}

	@Override
	public void onStart() {
		super.onStart();
		MyLog.i(TAG, "onStart()");
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		MyLog.i(TAG, "onAttach()");

		try {
			mCallback = (OnItemSelectedListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnItemSelectedListener");
		}
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		MyLog.i(TAG, "onActivityCreated()");

		TextView tv_dialog_title = (TextView) getActivity().findViewById(
				R.id.tv_dialog_title);
		tv_dialog_title.setText("房型");

		XListView xlistview = (XListView) getActivity().findViewById(
				R.id.city_list_xlistview);
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

		String[] cities = { "全部", "一人房", "两人房", "三人房", "四人房", "五人房", "五人以上" };

		public MyAdapter() {
		}

		public int getCount() {
			return cities.length;
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
						R.layout.city_list_fragment_xlistview_item, null);
				holder = new ViewHolder();
				holder.rl = (RelativeLayout) convertView.findViewById(R.id.rl);
				holder.tv = (TextView) convertView.findViewById(R.id.tv);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			holder.rl.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					MyLog.i(TAG, "" + position);
					getActivity().onBackPressed();

					mCallback.onItemSelected(cities[position]);
				}
			});

			holder.tv.setText(cities[position]);

			return convertView;
		}

		class ViewHolder {
			RelativeLayout rl;
			TextView tv;
		}

	}

}
