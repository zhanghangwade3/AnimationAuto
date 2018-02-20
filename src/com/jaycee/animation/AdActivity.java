package com.jaycee.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class AdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final View view = View.inflate(this, R.layout.activity_ad, null);
		setContentView(view);

		// 渐变展示广告
		AlphaAnimation animation = new AlphaAnimation(0.8f, 1.0f);
		animation.setDuration(1000);
		view.startAnimation(animation);
		animation.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationEnd(Animation arg0) {
				AlarmHelper.AlarmAfter2Second(AdActivity.this);
			}
			@Override
			public void onAnimationRepeat(Animation animation) {}
			@Override
			public void onAnimationStart(Animation animation) {}

		});
	}

	@Override
	protected void onPause() {
		super.onPause();
		AdActivity.this.finish();
	}
	
}
