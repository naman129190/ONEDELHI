package com.onedelhi.secure;

import java.util.List;
import java.util.concurrent.Callable;

public final class v27 extends ef5 {

    /* renamed from: a */
    public final Callable f21637a;

    public v27(String str, Callable callable) {
        super("internal.appMetadata");
        this.f21637a = callable;
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        try {
            return jh6.m18591b(this.f21637a.call());
        } catch (Exception unused) {
            return qh5.f19182a;
        }
    }
}
