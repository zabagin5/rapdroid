package com.rapdroid.nyilehkamera;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by M. HILMI PRASETYA on 5/10/2017.
 */

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    private static PrefManager mInstance;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "Hello NyiKamers";

    private static final String ceklogin = "Logged_In";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void login() {
        editor.putString(ceklogin, "1");
    }

    public void logout() {
        editor.putString(ceklogin, "0");
    }
    public String getCeklogin (){
        SharedPreferences sharedPreferences = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(ceklogin, null);
    }
    public static synchronized PrefManager getInstance(Context context){
        if(mInstance == null){
            mInstance = new PrefManager(context);
        }
        return mInstance;
    }
}
