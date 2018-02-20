package com.jaycee.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/**
 * 应用程序启动类：显示欢迎界面并跳转到主界面
 * @author jaycee
 * @version 1.0
 * @created 2013-07-05
 */
public class AppStartActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = View.inflate(this, R.layout.activity_start, null);
		setContentView(view);
        
		//渐变展示启动屏
		AlphaAnimation animation = new AlphaAnimation(0.6f,1.0f);
		animation.setDuration(1500);
		view.startAnimation(animation);
		animation.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationEnd(Animation arg0) {
				redirectTo();
			}
			@Override
			public void onAnimationRepeat(Animation animation) {}
			@Override
			public void onAnimationStart(Animation animation) {}
			
		});
		
    }
    
    /**
     * 跳转到...
     */
    private void redirectTo(){        
        Intent intent = new Intent(this, AdActivity.class);
        startActivity(intent);
        finish();
    }
}