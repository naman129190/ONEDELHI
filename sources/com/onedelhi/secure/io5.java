package com.onedelhi.secure;

import java.util.List;

public final class io5 extends uj5 {
    /* renamed from: a */
    public final qh5 mo14315a(String str, w96 w96, List list) {
        if (str == null || str.isEmpty() || !w96.mo26471h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        qh5 d = w96.mo26467d(str);
        if (d instanceof ef5) {
            return ((ef5) d).mo14991a(w96, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
