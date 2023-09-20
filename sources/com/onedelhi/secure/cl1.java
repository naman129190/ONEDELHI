package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class cl1 {

    /* renamed from: a */
    public static final int f26881a = 30;

    /* renamed from: a */
    public static cl1 f26882a = null;

    /* renamed from: a */
    public static final String f26883a = "fire-global";

    /* renamed from: b */
    public static final String f26884b = "FirebaseAppHeartBeat";

    /* renamed from: c */
    public static final String f26885c = "FirebaseHeartBeat";

    /* renamed from: d */
    public static final String f26886d = "fire-count";

    /* renamed from: e */
    public static final String f26887e = "last-used-date";

    /* renamed from: a */
    public final SharedPreferences f26888a;

    public cl1(Context context, String str) {
        this.f26888a = context.getSharedPreferences(f26885c + str, 0);
    }

    @hw4
    @hl3({hl3.C2354a.TESTS})
    public cl1(SharedPreferences sharedPreferences) {
        this.f26888a = sharedPreferences;
    }

    /* renamed from: a */
    public final synchronized void mo33778a() {
        long j = this.f26888a.getLong(f26886d, 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f26888a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f26888a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f26888a.edit().putStringSet(str2, hashSet).putLong(f26886d, j - 1).commit();
    }

    /* renamed from: b */
    public synchronized void mo33779b() {
        SharedPreferences.Editor edit = this.f26888a.edit();
        for (Map.Entry next : this.f26888a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove(f26886d);
        edit.commit();
    }

    /* renamed from: c */
    public synchronized List<dl1> mo33780c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f26888a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(dl1.m45347a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo33791n(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String mo33781d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    @hw4
    @hl3({hl3.C2354a.TESTS})
    /* renamed from: e */
    public int mo33782e() {
        return (int) this.f26888a.getLong(f26886d, 0);
    }

    /* renamed from: f */
    public synchronized long mo33783f() {
        return this.f26888a.getLong(f26883a, -1);
    }

    /* renamed from: g */
    public final synchronized String mo33784g(String str) {
        for (Map.Entry next : this.f26888a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: h */
    public synchronized boolean mo33785h(long j, long j2) {
        return mo33781d(j).equals(mo33781d(j2));
    }

    /* renamed from: i */
    public synchronized void mo33786i() {
        String d = mo33781d(System.currentTimeMillis());
        this.f26888a.edit().putString(f26887e, d).commit();
        mo33787j(d);
    }

    /* renamed from: j */
    public final synchronized void mo33787j(String str) {
        String g = mo33784g(str);
        if (g != null) {
            HashSet hashSet = new HashSet(this.f26888a.getStringSet(g, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f26888a.edit().remove(g) : this.f26888a.edit().putStringSet(g, hashSet)).commit();
        }
    }

    /* renamed from: k */
    public synchronized boolean mo33788k(long j) {
        return mo33789l(f26883a, j);
    }

    /* renamed from: l */
    public synchronized boolean mo33789l(String str, long j) {
        if (!this.f26888a.contains(str)) {
            this.f26888a.edit().putLong(str, j).commit();
            return true;
        } else if (mo33785h(this.f26888a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f26888a.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* renamed from: m */
    public synchronized void mo33790m(long j, String str) {
        String d = mo33781d(j);
        if (this.f26888a.getString(f26887e, "").equals(d)) {
            String g = mo33784g(d);
            if (g != null) {
                if (!g.equals(str)) {
                    mo33792o(str, d);
                    return;
                }
                return;
            }
            return;
        }
        long j2 = this.f26888a.getLong(f26886d, 0);
        if (j2 + 1 == 30) {
            mo33778a();
            j2 = this.f26888a.getLong(f26886d, 0);
        }
        HashSet hashSet = new HashSet(this.f26888a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.f26888a.edit().putStringSet(str, hashSet).putLong(f26886d, j2 + 1).putString(f26887e, d).commit();
    }

    /* renamed from: n */
    public synchronized void mo33791n(long j) {
        this.f26888a.edit().putLong(f26883a, j).commit();
    }

    /* renamed from: o */
    public final synchronized void mo33792o(String str, String str2) {
        mo33787j(str2);
        HashSet hashSet = new HashSet(this.f26888a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f26888a.edit().putStringSet(str, hashSet).commit();
    }
}
