/**
 * 
 */
package com.example.tiger_android_for_6.context;


import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

import com.example.tiger_android_for_6.base.BaseApplication;

/**
 * @author tiger
 *
 */
public class AppContext extends BaseApplication {

	private static AppContext instance;
	
	private int loginUid;

    private boolean login;
	
	/**
     * 获得当前app运行的AppContext
     * 
     * @return
     */
    public static AppContext getInstance() {
        return instance;
    }
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		instance = this;
		
		init();
	}
	
	/**
	 * 初始化网络,用户登录信息,第三方服务等上下文可能用到的
	 */
	private void init() {
		
	}
	
	private void initLogin() {
		
	}
	
	public int getLoginUid() {
        return loginUid;
    }

    public boolean isLogin() {
        return login;
    }
    
    /**
     * 保存登录成功后的用户信息
     * @param user
     */
    public void saveUserInfo(final Object user) {
    	
    }
    
    /**
     * 更新用户信息
     * @param user
     */
    public void updateUserInfo(final Object user) {
    	
    }
    
    /**
     * 获得登录用户的信息
     * @return
     */
    public Object getLoginUser(){
    	return null;
    }
    
    /**
     * 用户注销
     */
    public void Logout() {
    	
    }
    
    /**
     * 清除登录信息
     */
    public void cleanLoginInfo() {
    	
    }
	
	/**
     * 获取App安装包信息
     * 
     * @return
     */
    public PackageInfo getPackageInfo() {
        PackageInfo info = null;
        try {
            info = getPackageManager().getPackageInfo(getPackageName(), 0);
        } catch (NameNotFoundException e) {
            e.printStackTrace(System.err);
        }
        if (info == null)
            info = new PackageInfo();
        return info;
    }
}
