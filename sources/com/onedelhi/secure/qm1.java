package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.q51;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/qm1;", "", "", "method", "", "e", "b", "a", "d", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class qm1 {

    /* renamed from: a */
    public static final qm1 f34314a = new qm1();

    @zw1
    /* renamed from: b */
    public static final boolean m63083b(@vr2 String str) {
        jt1.m53777p(str, FirebaseAnalytics.C4305d.f24992v);
        return !jt1.m53768g(str, "GET") && !jt1.m53768g(str, q51.C6513a.f34004x);
    }

    @zw1
    /* renamed from: e */
    public static final boolean m63084e(@vr2 String str) {
        jt1.m53777p(str, FirebaseAnalytics.C4305d.f24992v);
        return jt1.m53768g(str, q51.C6513a.f34002v) || jt1.m53768g(str, q51.C6513a.f34001u) || jt1.m53768g(str, q51.C6513a.f34005y) || jt1.m53768g(str, "PROPPATCH") || jt1.m53768g(str, "REPORT");
    }

    /* renamed from: a */
    public final boolean mo43680a(@vr2 String str) {
        jt1.m53777p(str, FirebaseAnalytics.C4305d.f24992v);
        return jt1.m53768g(str, q51.C6513a.f34002v) || jt1.m53768g(str, q51.C6513a.f34005y) || jt1.m53768g(str, q51.C6513a.f34001u) || jt1.m53768g(str, q51.C6513a.f34003w) || jt1.m53768g(str, "MOVE");
    }

    /* renamed from: c */
    public final boolean mo43681c(@vr2 String str) {
        jt1.m53777p(str, FirebaseAnalytics.C4305d.f24992v);
        return !jt1.m53768g(str, "PROPFIND");
    }

    /* renamed from: d */
    public final boolean mo43682d(@vr2 String str) {
        jt1.m53777p(str, FirebaseAnalytics.C4305d.f24992v);
        return jt1.m53768g(str, "PROPFIND");
    }
}
