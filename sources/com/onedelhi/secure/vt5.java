package com.onedelhi.secure;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class vt5 implements pu5 {

    /* renamed from: a */
    public static final String[] f21949a = {"key", "value"};
    @mj1("ConfigurationContentLoader.class")

    /* renamed from: b */
    public static final Map f21950b = new C3042oa();

    /* renamed from: a */
    public final ContentResolver f21951a;

    /* renamed from: a */
    public final ContentObserver f21952a;

    /* renamed from: a */
    public final Uri f21953a;

    /* renamed from: a */
    public final Object f21954a = new Object();

    /* renamed from: a */
    public final Runnable f21955a;
    @mj1("this")

    /* renamed from: a */
    public final List f21956a = new ArrayList();

    /* renamed from: a */
    public volatile Map f21957a;

    public vt5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        rt5 rt5 = new rt5(this, (Handler) null);
        this.f21952a = rt5;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f21951a = contentResolver;
        this.f21953a = uri;
        this.f21955a = runnable;
        contentResolver.registerContentObserver(uri, false, rt5);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.vt5 m30443b(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.onedelhi.secure.vt5> r0 = com.onedelhi.secure.vt5.class
            monitor-enter(r0)
            java.util.Map r1 = f21950b     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.onedelhi.secure.vt5 r2 = (com.onedelhi.secure.vt5) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.onedelhi.secure.vt5 r3 = new com.onedelhi.secure.vt5     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vt5.m30443b(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.onedelhi.secure.vt5");
    }

    /* renamed from: d */
    public static synchronized void m30444d() {
        synchronized (vt5.class) {
            for (vt5 vt5 : f21950b.values()) {
                vt5.f21951a.unregisterContentObserver(vt5.f21952a);
            }
            f21950b.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13831a(String str) {
        Map map;
        Map map2 = this.f21957a;
        if (map2 == null) {
            synchronized (this.f21954a) {
                map2 = this.f21957a;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) hu5.m16941a(new nt5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f21957a = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return (String) map2.get(str);
    }

    /* renamed from: c */
    public final /* synthetic */ Map mo26329c() {
        Cursor query = this.f21951a.query(this.f21953a, f21949a, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map oaVar = count <= 256 ? new C3042oa(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                oaVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return oaVar;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void mo26330e() {
        synchronized (this.f21954a) {
            this.f21957a = null;
            iy5.m18041d();
        }
        synchronized (this) {
            for (zt5 a : this.f21956a) {
                a.mo28136a();
            }
        }
    }
}
