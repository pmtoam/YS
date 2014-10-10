package com.lbt.yunsu.util;

import android.util.Log;

public class MyLog {

	public static final CharSequence PACKAGE_NAME = "com.lbt.yunsu.";

	public static void i(String tag, String msg) {
		Log.i(tag, "--->" + msg);
	}
}
