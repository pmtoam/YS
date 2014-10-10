package com.lbt.yunsu;

import com.lbt.yunsu.fa4.PagerInfoAcountManagerOrderFActivity;
import com.lbt.yunsu.util.MyLog;
import com.lbt.yunsu.widget.XListView;
import com.lbt.yunsu.widget.XListView.IXListViewListener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;

/**
 * 功能说明：应用主页 -FragmentActivity3的默认碎片。<br>
 * 详细说明：
 * 
 * @since 2014年4月1日
 */
public class Fragment3 extends Fragment implements IXListViewListener, OnClickListener{

	private String TAG = "Fragment3";

	private RelativeLayout stay_sure, stay_reside, alredy_reside, alredy_cancle;
	private XListView mListView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		MyLog.i(TAG, "onCreateView()");
		return inflater.inflate(R.layout.fragment3, container, false);
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

		mListView.setAdapter(new PagerInfoAcountManagerAdapter());
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MyLog.i(TAG, "onCreate()");
	}

	public void setView() {
			
			
			  stay_sure = (RelativeLayout) getView().findViewById(R.id.stay_sure);
		        stay_reside = (RelativeLayout) getView().findViewById(R.id.stay_reside);
		        alredy_reside = (RelativeLayout) getView().findViewById(R.id.alredy_reside);
		        alredy_cancle = (RelativeLayout) getView().findViewById(R.id.alredy_cancle);
		        
	
		        mListView = (XListView) getView().findViewById(R.id.listview);
		        
		        mListView.setPullLoadEnable(false);
		        mListView.setPullRefreshEnable(false);
		        mListView.setXListViewListener(this);
		        
		        stay_sure.setOnClickListener(this);
		        stay_reside.setOnClickListener(this);
		        alredy_reside.setOnClickListener(this);
		        alredy_cancle.setOnClickListener(this);
	
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
	        case R.id.stay_sure:
	            if (change(0)) 
	            {
	            	mListView.setAdapter(new PagerInfoAcountManagerAdapter());
	            }
	            
	            break;
	        case R.id.stay_reside:
	            if (change(1)) 
	            {
	            	mListView.setAdapter(new PagerInfoAcountManagerAdapter());
	            }
	            
	            break;
	        case R.id.alredy_reside:
	            if (change(2)) 
	            {
	            	mListView.setAdapter(new PagerInfoAcountManagerAdapter());
	            }
	            
	            break;
	        case R.id.alredy_cancle:
	            if (change(3)) 
	            {
	            	mListView.setAdapter(new PagerInfoAcountManagerAdapter());
	            }
	            break;
	        default:
	            break;
	        }
	}
	
	public class PagerInfoAcountManagerAdapter extends BaseAdapter {

		int count = 10;

		public PagerInfoAcountManagerAdapter() {
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
						R.layout.pager_info_acount_manager_fragment_item, null);
				holder = new ViewHolder();
				holder.rl_acount_manager = (RelativeLayout) convertView.findViewById(R.id.rl_acount_manager);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

//			holder.iv.setImageResource(R.drawable.minsu_pic_000);
			holder.rl_acount_manager.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MyLog.i(TAG, "" + position);
					Intent intent = new Intent();
					intent.setClass(getActivity(), PagerInfoAcountManagerOrderFActivity.class);
					startActivity(intent);
				}
			});

			return convertView;
		}

		class ViewHolder {
			RelativeLayout rl_acount_manager;
		}

	}
	
	private int currPage = 1;
	private int index = 0;
	private boolean change(int indexchange) {
    	mListView.setPullLoadEnable(false);
    	currPage = 1;
        if (indexchange == index) 
        {
            return false;
        } 
        else 
        {
            index = indexchange;
            return true;
        }
    }

	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoadMore() {
		// TODO Auto-generated method stub
		
	}

}
