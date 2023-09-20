package com.onedelhi.secure;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.C4367b;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@C3568t7
public class h50 {
    @mj1("ConfigStorageClient.class")

    /* renamed from: a */
    public static final Map<String, h50> f29455a = new HashMap();

    /* renamed from: b */
    public static final String f29456b = "UTF-8";

    /* renamed from: a */
    public final Context f29457a;

    /* renamed from: a */
    public final String f29458a;

    public h50(Context context, String str) {
        this.f29457a = context;
        this.f29458a = str;
    }

    @hw4
    /* renamed from: b */
    public static synchronized void m50226b() {
        synchronized (h50.class) {
            f29455a.clear();
        }
    }

    /* renamed from: d */
    public static synchronized h50 m50227d(Context context, String str) {
        h50 h50;
        synchronized (h50.class) {
            Map<String, h50> map = f29455a;
            if (!map.containsKey(str)) {
                map.put(str, new h50(context, str));
            }
            h50 = map.get(str);
        }
        return h50;
    }

    /* renamed from: a */
    public synchronized Void mo37185a() {
        this.f29457a.deleteFile(this.f29458a);
        return null;
    }

    /* renamed from: c */
    public String mo37186c() {
        return this.f29458a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[SYNTHETIC, Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }] */
    @javax.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.C4367b mo37187e() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f29457a     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.lang.String r2 = r6.f29458a     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            com.google.firebase.remoteconfig.internal.b r0 = com.google.firebase.remoteconfig.internal.C4367b.m35163b(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r0
        L_0x0029:
            r0 = move-exception
            goto L_0x002f
        L_0x002b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x0034:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r1 = r0
        L_0x0036:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x003f:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h50.mo37187e():com.google.firebase.remoteconfig.internal.b");
    }

    /* renamed from: f */
    public synchronized Void mo37188f(C4367b bVar) throws IOException {
        FileOutputStream openFileOutput = this.f29457a.openFileOutput(this.f29458a, 0);
        try {
            openFileOutput.write(bVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
