/**
 * 
 */
package com.example.tiger_android_for_6.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/**
 * @author tiger
 *
 */
public class BaseApplication extends Application {

	static Context _context;
    static Resources _resource;
    
    @Override
    public void onCreate() {
    	// TODO Auto-generated method stub
    	super.onCreate();
    	_context = getApplicationContext();
    	_resource = _context.getResources();
    }
    
    public static synchronized BaseApplication context() {
    	return (BaseApplication) _context;
    }
    
    public static Resources resources() {
    	return _resource;
    }
    
    public static String string(int id) {
    	return _resource.getString(id);
    }

    public static String string(int id, Object... args) {
    	return _resource.getString(id, args);
    }
}
