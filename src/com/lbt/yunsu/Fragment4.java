package com.lbt.yunsu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lbt.yunsu.fa4.PagerInfoAboutFActivity;
import com.lbt.yunsu.fa4.PagerInfoAcountManagerFActivity;
import com.lbt.yunsu.fa4.PagerInfoCommentFActivity;
import com.lbt.yunsu.fa4.PagerInfoFActivity;
import com.lbt.yunsu.fa4.PagerInfoRecommendFActivity;
import com.lbt.yunsu.fa4.PagerInfoUpdatePwdFActivity;
import com.lbt.yunsu.util.MyLog;

/**
 * 功能说明：应用主页 -FragmentActivity4的默认碎片。<br>
 * 详细说明：
 * 
 * @since 2014年4月1日 update 2014年4月2日 杨青
 */
public class Fragment4 extends Fragment implements OnClickListener{

	private ImageView user_info_head_avatar;
	private RelativeLayout pageinfo;
	private RelativeLayout acount_manager;
	private RelativeLayout comment;
	private RelativeLayout recommend;
	private RelativeLayout update_pwd;
	private RelativeLayout about;

	private TextView name, tv_share_code;
	private RatingBar ratingBar;

	private Button btn_share, exit_login;

	private String TAG = "Fragment4";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		MyLog.i(TAG, "onCreateView()");
		return inflater.inflate(R.layout.fragment4, container, false);
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
		user_info_head_avatar = (ImageView) getView().findViewById(
				R.id.user_info_head_avatar);

		pageinfo = (RelativeLayout) getView().findViewById(R.id.pageinfo);
		acount_manager = (RelativeLayout) getView().findViewById(
				R.id.acount_manager);
		comment = (RelativeLayout) getView().findViewById(R.id.comment);
		recommend = (RelativeLayout) getView().findViewById(R.id.recommend);
		update_pwd = (RelativeLayout) getView().findViewById(R.id.update_pwd);
		about = (RelativeLayout) getView().findViewById(R.id.about);

		name = (TextView) getView().findViewById(R.id.name);
		tv_share_code = (TextView) getView().findViewById(R.id.tv_share_code);
		
		ratingBar = (RatingBar) getView().findViewById(R.id.ratingBar);
		
		btn_share =  (Button) getView().findViewById(R.id.btn_share);
		exit_login =  (Button) getView().findViewById(R.id.exit_login);
		
		user_info_head_avatar.setOnClickListener(this);
		pageinfo.setOnClickListener(this);
		acount_manager.setOnClickListener(this);
		comment.setOnClickListener(this);
		recommend.setOnClickListener(this);
		update_pwd.setOnClickListener(this);
		about.setOnClickListener(this);
		btn_share.setOnClickListener(this);
		exit_login.setOnClickListener(this);
		
		
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
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.user_info_head_avatar:
			
			break;
		case R.id.pageinfo:
			intent.setClass(getActivity(), PagerInfoFActivity.class);
			startActivity(intent);
			break;
		case R.id.acount_manager:
			intent.setClass(getActivity(), PagerInfoAcountManagerFActivity.class);
			startActivity(intent);
			break;
		case R.id.comment:
			intent.setClass(getActivity(), PagerInfoCommentFActivity.class);
			startActivity(intent);
			break;
		case R.id.recommend:
			intent.setClass(getActivity(), PagerInfoRecommendFActivity.class);
			startActivity(intent);
			break;
		case R.id.update_pwd:
			intent.setClass(getActivity(), PagerInfoUpdatePwdFActivity.class);
			startActivity(intent);
			break;
		case R.id.about:
			intent.setClass(getActivity(), PagerInfoAboutFActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}
