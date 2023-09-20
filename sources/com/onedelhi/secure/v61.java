package com.onedelhi.secure;

import com.onedelhi.secure.ak4;

public class v61 implements u61 {

    /* renamed from: b */
    public static final String f36438b = "[Value: %s] cannot be converted to a %s.";

    /* renamed from: a */
    public final int f36439a;

    /* renamed from: a */
    public final String f36440a;

    public v61(String str, int i) {
        this.f36440a = str;
        this.f36439a = i;
    }

    /* renamed from: a */
    public boolean mo45428a() throws IllegalArgumentException {
        if (this.f36439a == 0) {
            return false;
        }
        String g = mo46018g();
        if (e50.f27695a.matcher(g).matches()) {
            return true;
        }
        if (e50.f27696b.matcher(g).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(f36438b, new Object[]{g, ak4.C1709b.f9169f}));
    }

    /* renamed from: b */
    public double mo45429b() {
        if (this.f36439a == 0) {
            return 0.0d;
        }
        String g = mo46018g();
        try {
            return Double.valueOf(g).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(f36438b, new Object[]{g, "double"}), e);
        }
    }

    /* renamed from: c */
    public int mo45430c() {
        return this.f36439a;
    }

    /* renamed from: d */
    public long mo45431d() {
        if (this.f36439a == 0) {
            return 0;
        }
        String g = mo46018g();
        try {
            return Long.valueOf(g).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(f36438b, new Object[]{g, "long"}), e);
        }
    }

    /* renamed from: e */
    public byte[] mo45432e() {
        return this.f36439a == 0 ? n61.f32428a : this.f36440a.getBytes(e50.f27694a);
    }

    /* renamed from: f */
    public String mo45433f() {
        if (this.f36439a == 0) {
            return "";
        }
        mo46019h();
        return this.f36440a;
    }

    /* renamed from: g */
    public final String mo46018g() {
        return mo45433f().trim();
    }

    /* renamed from: h */
    public final void mo46019h() {
        if (this.f36440a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }
}
