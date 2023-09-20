package com.onedelhi.secure;

import java.util.Objects;
import javax.annotation.Nullable;

public class km1 extends RuntimeException {

    /* renamed from: a */
    public final transient el3<?> f31252a;

    /* renamed from: b */
    public final String f31253b;

    /* renamed from: n */
    public final int f31254n;

    public km1(el3<?> el3) {
        super(m54562b(el3));
        this.f31254n = el3.mo35469b();
        this.f31253b = el3.mo35473h();
        this.f31252a = el3;
    }

    /* renamed from: b */
    public static String m54562b(el3<?> el3) {
        Objects.requireNonNull(el3, "response == null");
        return "HTTP " + el3.mo35469b() + " " + el3.mo35473h();
    }

    /* renamed from: a */
    public int mo39334a() {
        return this.f31254n;
    }

    /* renamed from: c */
    public String mo39335c() {
        return this.f31253b;
    }

    @Nullable
    /* renamed from: d */
    public el3<?> mo39336d() {
        return this.f31252a;
    }
}
