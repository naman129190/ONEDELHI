package com.onedelhi.secure;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class xx3 {

    /* renamed from: a */
    public final SharedPreferences f37682a;

    /* renamed from: a */
    public final String f37683a;
    @mj1("internalQueue")
    @hw4

    /* renamed from: a */
    public final ArrayDeque<String> f37684a = new ArrayDeque<>();

    /* renamed from: a */
    public final Executor f37685a;
    @mj1("internalQueue")

    /* renamed from: a */
    public boolean f37686a = false;

    /* renamed from: b */
    public final String f37687b;

    public xx3(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f37682a = sharedPreferences;
        this.f37683a = str;
        this.f37687b = str2;
        this.f37685a = executor;
    }

    @ly4
    /* renamed from: j */
    public static xx3 m70913j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        xx3 xx3 = new xx3(sharedPreferences, str, str2, executor);
        xx3.mo47447k();
        return xx3;
    }

    /* renamed from: b */
    public boolean mo47439b(@mr2 String str) {
        boolean f;
        if (TextUtils.isEmpty(str) || str.contains(this.f37687b)) {
            return false;
        }
        synchronized (this.f37684a) {
            f = mo47443f(this.f37684a.add(str));
        }
        return f;
    }

    @mj1("internalQueue")
    /* renamed from: c */
    public void mo47440c() {
        this.f37686a = true;
    }

    @hw4
    /* renamed from: d */
    public void mo47441d() {
        synchronized (this.f37684a) {
            mo47440c();
        }
    }

    @mj1("internalQueue")
    /* renamed from: e */
    public final String mo47442e(String str) {
        mo47443f(str != null);
        return str;
    }

    @mj1("internalQueue")
    /* renamed from: f */
    public final boolean mo47443f(boolean z) {
        if (z && !this.f37686a) {
            mo47455s();
        }
        return z;
    }

    /* renamed from: g */
    public void mo47444g() {
        synchronized (this.f37684a) {
            this.f37684a.clear();
            mo47443f(true);
        }
    }

    @mj1("internalQueue")
    /* renamed from: h */
    public void mo47445h() {
        this.f37686a = false;
        mo47455s();
    }

    @hw4
    /* renamed from: i */
    public void mo47446i() {
        synchronized (this.f37684a) {
            mo47445h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    @com.onedelhi.secure.ly4
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47447k() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f37684a
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f37684a     // Catch:{ all -> 0x004a }
            r1.clear()     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences r1 = r6.f37682a     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r6.f37683a     // Catch:{ all -> 0x004a }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x004a }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r6.f37687b     // Catch:{ all -> 0x004a }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0021
            goto L_0x0048
        L_0x0021:
            java.lang.String r2 = r6.f37687b     // Catch:{ all -> 0x004a }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x004a }
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x004a }
        L_0x0032:
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            r3 = 0
        L_0x0034:
            if (r3 >= r2) goto L_0x0046
            r4 = r1[r3]     // Catch:{ all -> 0x004a }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x0043
            java.util.ArrayDeque<java.lang.String> r5 = r6.f37684a     // Catch:{ all -> 0x004a }
            r5.add(r4)     // Catch:{ all -> 0x004a }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xx3.mo47447k():void");
    }

    @ts2
    /* renamed from: l */
    public String mo47448l() {
        String peek;
        synchronized (this.f37684a) {
            peek = this.f37684a.peek();
        }
        return peek;
    }

    /* renamed from: m */
    public String mo47449m() {
        String e;
        synchronized (this.f37684a) {
            e = mo47442e(this.f37684a.remove());
        }
        return e;
    }

    /* renamed from: n */
    public boolean mo47450n(@ts2 Object obj) {
        boolean f;
        synchronized (this.f37684a) {
            f = mo47443f(this.f37684a.remove(obj));
        }
        return f;
    }

    @mj1("internalQueue")
    @mr2
    /* renamed from: o */
    public String mo47451o() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f37684a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f37687b);
        }
        return sb.toString();
    }

    @hw4
    /* renamed from: p */
    public String mo47452p() {
        String o;
        synchronized (this.f37684a) {
            o = mo47451o();
        }
        return o;
    }

    /* renamed from: q */
    public int mo47453q() {
        int size;
        synchronized (this.f37684a) {
            size = this.f37684a.size();
        }
        return size;
    }

    @ly4
    /* renamed from: r */
    public final void mo47454r() {
        synchronized (this.f37684a) {
            this.f37682a.edit().putString(this.f37683a, mo47451o()).commit();
        }
    }

    /* renamed from: s */
    public final void mo47455s() {
        this.f37685a.execute(new wx3(this));
    }

    @mr2
    /* renamed from: t */
    public List<String> mo47456t() {
        ArrayList arrayList;
        synchronized (this.f37684a) {
            arrayList = new ArrayList(this.f37684a);
        }
        return arrayList;
    }
}
