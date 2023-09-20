package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;

public class wh1 extends GoogleApi<GoogleSignInOptions> {
    @hw4

    /* renamed from: a */
    public static int f22130a = 1;

    /* renamed from: a */
    public static final r65 f22131a = new r65((l55) null);

    public wh1(@mr2 Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C2326hc.f13040c, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public wh1(@mr2 Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C2326hc.f13040c, googleSignInOptions, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    @mr2
    /* renamed from: V */
    public Intent mo26534V() {
        Context applicationContext = getApplicationContext();
        int Y = mo26537Y();
        int i = Y - 1;
        if (Y != 0) {
            return i != 2 ? i != 3 ? h85.m16534b(applicationContext, (GoogleSignInOptions) getApiOptions()) : h85.m16535c(applicationContext, (GoogleSignInOptions) getApiOptions()) : h85.m16533a(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        throw null;
    }

    @mr2
    /* renamed from: W */
    public w94<Void> mo26535W() {
        return PendingResultUtil.toVoidTask(h85.m16538f(asGoogleApiClient(), getApplicationContext(), mo26537Y() == 3));
    }

    @mr2
    /* renamed from: X */
    public w94<GoogleSignInAccount> mo26536X() {
        return PendingResultUtil.toTask(h85.m16537e(asGoogleApiClient(), getApplicationContext(), (GoogleSignInOptions) getApiOptions(), mo26537Y() == 3), f22131a);
    }

    /* renamed from: Y */
    public final synchronized int mo26537Y() {
        int i;
        i = f22130a;
        if (i == 1) {
            Context applicationContext = getApplicationContext();
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (isGooglePlayServicesAvailable == 0) {
                f22130a = 4;
                i = 4;
            } else if (instance.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, (String) null) != null || DynamiteModule.m8889a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                f22130a = 2;
                i = 2;
            } else {
                f22130a = 3;
                i = 3;
            }
        }
        return i;
    }

    @mr2
    /* renamed from: h */
    public w94<Void> mo26538h() {
        return PendingResultUtil.toVoidTask(h85.m16539g(asGoogleApiClient(), getApplicationContext(), mo26537Y() == 3));
    }
}
