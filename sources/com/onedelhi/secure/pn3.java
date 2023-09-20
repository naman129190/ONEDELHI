package com.onedelhi.secure;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.Route;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/pn3;", "", "Lokhttp3/Route;", "failedRoute", "Lcom/onedelhi/secure/un4;", "b", "route", "a", "", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class pn3 {

    /* renamed from: a */
    public final Set<Route> f33742a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo42830a(@vr2 Route route) {
        jt1.m53777p(route, "route");
        this.f33742a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void mo42831b(@vr2 Route route) {
        jt1.m53777p(route, "failedRoute");
        this.f33742a.add(route);
    }

    /* renamed from: c */
    public final synchronized boolean mo42832c(@vr2 Route route) {
        jt1.m53777p(route, "route");
        return this.f33742a.contains(route);
    }
}
