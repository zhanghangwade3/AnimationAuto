package com.jaycee.animation;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class AlarmHelper {
	
	public static void AlarmAfter2Second(Context context) {
		AlarmAfter(context, 2*1000);
	}
	
	public static void AlarmAfter(Context context, long ms) {
		Intent intent = new Intent(context, MainActivity.class);  
		PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT); 
		AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
	    alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP , SystemClock.elapsedRealtime() + ms, pendingIntent);
	    
	}
}
