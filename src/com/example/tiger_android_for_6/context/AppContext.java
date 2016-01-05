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
     * ��õ�ǰapp���е�AppContext
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
	 * ��ʼ������,�û���¼��Ϣ,����������������Ŀ����õ���
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
     * �����¼�ɹ�����û���Ϣ
     * @param user
     */
    public void saveUserInfo(final Object user) {
    	
    }
    
    /**
     * �����û���Ϣ
     * @param user
     */
    public void updateUserInfo(final Object user) {
    	
    }
    
    /**
     * ��õ�¼�û�����Ϣ
     * @return
     */
    public Object getLoginUser(){
    	return null;
    }
    
    /**
     * �û�ע��
     */
    public void Logout() {
    	
    }
    
    /**
     * �����¼��Ϣ
     */
    public void cleanLoginInfo() {
    	
    }
	
	/**
     * ��ȡApp��װ����Ϣ
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
