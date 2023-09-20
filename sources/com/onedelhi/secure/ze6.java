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

public final class ze6 implements of6 {

    /* renamed from: a */
    public static final String[] f23594a = {"key", "value"};
    @mj1("ConfigurationContentLoader.class")

    /* renamed from: b */
    public static final Map f23595b = new C3042oa();

    /* renamed from: a */
    public final ContentResolver f23596a;

    /* renamed from: a */
    public final ContentObserver f23597a;

    /* renamed from: a */
    public final Uri f23598a;

    /* renamed from: a */
    public final Object f23599a = new Object();

    /* renamed from: a */
    public final Runnable f23600a;
    @mj1("this")

    /* renamed from: a */
    public final List f23601a = new ArrayList();

    /* renamed from: a */
    public volatile Map f23602a;

    public ze6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        we6 we6 = new we6(this, (Handler) null);
        this.f23597a = we6;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f23596a = contentResolver;
        this.f23598a = uri;
        this.f23600a = runnable;
        contentResolver.registerContentObserver(uri, false, we6);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.ze6 m33095b(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.onedelhi.secure.ze6> r0 = com.onedelhi.secure.ze6.class
            monitor-enter(r0)
            java.util.Map r1 = f23595b     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.onedelhi.secure.ze6 r2 = (com.onedelhi.secure.ze6) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.onedelhi.secure.ze6 r3 = new com.onedelhi.secure.ze6     // Catch:{ SecurityException -> 0x0016 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ze6.m33095b(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.onedelhi.secure.ze6");
    }

    /* renamed from: e */
    public static synchronized void m33096e() {
        synchronized (ze6.class) {
            for (ze6 ze6 : f23595b.values()) {
                ze6.f23596a.unregisterContentObserver(ze6.f23597a);
            }
            f23595b.clear();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16663a(String str) {
        return (String) mo27959c().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final Map mo27959c() {
        Map map;
        Map map2 = this.f23602a;
        if (map2 == null) {
            synchronized (this.f23599a) {
                map2 = this.f23602a;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) if6.m17516a(new te6(this));
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
                    this.f23602a = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* renamed from: d */
    public final /* synthetic */ Map mo27960d() {
        Cursor query = this.f23596a.query(this.f23598a, f23594a, (String) null, (String[]) null, (String) null);
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

    /* renamed from: f */
    public final void mo27961f() {
        synchronized (this.f23599a) {
            this.f23602a = null;
            this.f23600a.run();
        }
        synchronized (this) {
            for (cf6 a : this.f23601a) {
                a.mo14139a();
            }
        }
    }
}
