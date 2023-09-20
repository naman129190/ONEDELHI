package com.delhitransport.onedelhi.activities;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w62;

public abstract class BaseActivity extends AppCompatActivity {
    public void attachBaseContext(Context context) {
        super.attachBaseContext(w62.m30702d(context));
    }

    /* renamed from: e1 */
    public void mo7532e1() {
        try {
            int i = getPackageManager().getActivityInfo(getComponentName(), 128).labelRes;
            if (i != 0) {
                setTitle(i);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onCreate(@ts2 Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        mo7532e1();
    }
}
