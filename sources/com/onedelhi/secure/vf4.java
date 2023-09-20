package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

public final class vf4 {
    @hw4

    /* renamed from: a */
    public static final String f36534a = "com.google.android.gms.appid";
    @mj1("TopicsStore.class")

    /* renamed from: a */
    public static WeakReference<vf4> f36535a = null;
    @hw4

    /* renamed from: b */
    public static final String f36536b = "topic_operation_queue";

    /* renamed from: c */
    public static final String f36537c = ",";

    /* renamed from: a */
    public final SharedPreferences f36538a;

    /* renamed from: a */
    public xx3 f36539a;

    /* renamed from: a */
    public final Executor f36540a;

    public vf4(SharedPreferences sharedPreferences, Executor executor) {
        this.f36540a = executor;
        this.f36538a = sharedPreferences;
    }

    @hw4
    /* renamed from: b */
    public static synchronized void m68065b() {
        synchronized (vf4.class) {
            WeakReference<vf4> weakReference = f36535a;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    @ly4
    /* renamed from: d */
    public static synchronized vf4 m68066d(Context context, Executor executor) {
        vf4 vf4;
        synchronized (vf4.class) {
            vf4 = null;
            WeakReference<vf4> weakReference = f36535a;
            if (weakReference != null) {
                vf4 = (vf4) weakReference.get();
            }
            if (vf4 == null) {
                vf4 = new vf4(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                vf4.mo46144g();
                f36535a = new WeakReference<>(vf4);
            }
        }
        return vf4;
    }

    /* renamed from: a */
    public synchronized boolean mo46140a(uf4 uf4) {
        return this.f36539a.mo47439b(uf4.mo45582e());
    }

    /* renamed from: c */
    public synchronized void mo46141c() {
        this.f36539a.mo47444g();
    }

    @ts2
    /* renamed from: e */
    public synchronized uf4 mo46142e() {
        return uf4.m67009a(this.f36539a.mo47448l());
    }

    @mr2
    /* renamed from: f */
    public synchronized List<uf4> mo46143f() {
        ArrayList arrayList;
        List<String> t = this.f36539a.mo47456t();
        arrayList = new ArrayList(t.size());
        for (String a : t) {
            arrayList.add(uf4.m67009a(a));
        }
        return arrayList;
    }

    @ly4
    /* renamed from: g */
    public final synchronized void mo46144g() {
        this.f36539a = xx3.m70913j(this.f36538a, f36536b, f36537c, this.f36540a);
    }

    @ts2
    /* renamed from: h */
    public synchronized uf4 mo46145h() {
        try {
        } catch (NoSuchElementException unused) {
            Log.e("FirebaseMessaging", "Polling operation queue failed");
            return null;
        }
        return uf4.m67009a(this.f36539a.mo47449m());
    }

    /* renamed from: i */
    public synchronized boolean mo46146i(uf4 uf4) {
        return this.f36539a.mo47450n(uf4.mo45582e());
    }
}
