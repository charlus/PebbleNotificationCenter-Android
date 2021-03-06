package com.matejdro.pebblenotificationcenter;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

import com.matejdro.pebblenotificationcenter.util.SettingsMemoryStorage;

public class PebbleNotificationCenter extends android.app.Application {
    public static final String APP_INCLUSION_MODE = "includeMode";
    public static final String SELECTED_PACKAGES = "CheckedApps";
    public static final String REGEX_INCLUSION_MODE = "regexMode";
    public static final String REGEX_LIST = "BlacklistRegexes";
    public static final String REPLACING_KEYS_LIST = "ReplacingKeys";
    public static final String REPLACING_VALUES_LIST = "ReplacingValues";
    public static final String FONT_TITLE = "fontTitle";
    public static final String FONT_SUBTITLE = "fontSubtitle";
    public static final String FONT_BODY = "fontBody";
    public static final String LIGHT_SCREEN_ON_NOTIFICATIONS = "lightScreenNotifications";
    public static final String VIBRATION_MODE = "vibrateMode";    
    public static final String CLOSE_TO_LAST_APP = "closeToLastApp";
    public static final String DONT_VIBRATE_WHEN_CHARGING = "noVibrateCharge";
    public static final String SHAKE_ACTION = "shakeAction";
    public static final String NO_NOTIFY_VIBRATE = "noNotificationsSilent";
    
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String ALTITUDE = "altitude";
    
    
    private static SettingsMemoryStorage settingsMemoryStorage;
    
    @Override public void onCreate() {
        super.onCreate();
        Timber.plant(new DebugTree());
        Timber.d("Timber.plant()");
        
		settingsMemoryStorage = new SettingsMemoryStorage(this);
    }
    	
	public static SettingsMemoryStorage getInMemorySettings()
	{		
		return settingsMemoryStorage;
	}
}
