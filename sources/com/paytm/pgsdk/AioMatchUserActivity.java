package com.paytm.pgsdk;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.onedelhi.secure.a13;
import com.onedelhi.secure.h60;
import com.onedelhi.secure.n62;
import com.onedelhi.secure.pg4;
import com.onedelhi.secure.ts2;
import com.paytm.pgsdk.C7546a;

public class AioMatchUserActivity extends AppCompatActivity {

    /* renamed from: e */
    public static final String f38525e = "check_user_login_only";

    /* renamed from: o */
    public final int f38526o = 12;

    /* renamed from: p */
    public final int f38527p = 13;

    /* renamed from: e1 */
    public final void mo48481e1() {
        if (a13.m35951i(this)) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(pg4.f33656d, "net.one97.paytm.AJRUserLoggedInCheckActivity"));
                a13.m35943a("Launching Paytm App");
                startActivityForResult(intent, 13);
                return;
            } catch (ActivityNotFoundException | Exception e) {
                a13.m35953k(e);
            }
        }
        mo48484h1(false, false);
    }

    /* renamed from: f1 */
    public final boolean mo48482f1(Intent intent) {
        if (a13.m35951i(this)) {
            try {
                Intent intent2 = new Intent();
                intent2.putExtras(intent);
                intent2.setComponent(new ComponentName(pg4.f33656d, "net.one97.paytm.AJRUserPhoneMatchActivity"));
                a13.m35943a("Launching Paytm App");
                startActivityForResult(intent2, 12);
                return true;
            } catch (Exception e) {
                a13.m35953k(e);
            }
        }
        return false;
    }

    /* renamed from: g1 */
    public final void mo48483g1(boolean z) {
        Intent intent = new Intent();
        intent.setAction(h60.f29489H);
        intent.putExtra(h60.f29491J, z);
        n62.m22447b(getApplicationContext()).mo20962d(intent);
        finish();
    }

    /* renamed from: h1 */
    public final void mo48484h1(boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setAction(h60.f29490I);
        intent.putExtra(h60.f29492K, z2);
        intent.putExtra(h60.f29493L, z);
        n62.m22447b(getApplicationContext()).mo20962d(intent);
        finish();
    }

    public void onActivityResult(int i, int i2, @ts2 Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        if (i == 12 && intent != null) {
            if (i2 == -1 && intent.getExtras() != null) {
                z = intent.getExtras().getBoolean("IF_USER_MATCHES", false);
            }
            mo48483g1(z);
        } else if (i == 13 && intent != null) {
            if (i2 == -1 && intent.getExtras() != null) {
                z = intent.getExtras().getBoolean(h60.f29492K, false);
            }
            mo48484h1(true, z);
        }
    }

    public void onCreate(@ts2 Bundle bundle) {
        setTheme(C7546a.C7559m.TransparentActivityTheme);
        super.onCreate(bundle);
        setRequestedOrientation(Build.VERSION.SDK_INT == 26 ? -1 : 1);
        if (getIntent().getBooleanExtra(f38525e, false)) {
            mo48481e1();
        } else if (!mo48482f1(getIntent())) {
            mo48483g1(false);
        }
    }
}
