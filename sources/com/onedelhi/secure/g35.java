package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import jmjou.C7601c;
import jmjou.C7606e;

public class g35 implements C7606e {

    /* renamed from: a */
    public Context f28934a;

    /* renamed from: a */
    public w25 f28935a;

    /* renamed from: a */
    public C7601c f28936a;

    /* renamed from: a */
    public Context mo36562a() {
        if (this.f28934a == null) {
            this.f28936a.getClass();
            this.f28934a = C7601c.f38776a;
        }
        return this.f28934a;
    }

    /* renamed from: b */
    public String mo36563b() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = mo36562a().getPackageManager().getApplicationInfo(mo36562a().getPackageName(), 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle.getString("com.phonepe.android.sdk.AppId");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            m05.m56771b("getAppId", "Failed to get appId");
        }
        return "";
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        cVar.getClass();
        this.f28934a = C7601c.f38776a;
        this.f28935a = (w25) cVar.mo48873i(w25.class);
        this.f28936a = cVar;
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
