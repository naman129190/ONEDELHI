package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public abstract class uj5 {

    /* renamed from: a */
    public final List f21412a = new ArrayList();

    /* renamed from: a */
    public abstract qh5 mo14315a(String str, w96 w96, List list);

    /* renamed from: b */
    public final qh5 mo25645b(String str) {
        if (this.f21412a.contains(sd6.m27477e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
