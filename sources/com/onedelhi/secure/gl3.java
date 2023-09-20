package com.onedelhi.secure;

import com.onedelhi.secure.oj3;

@Deprecated
public enum gl3 {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");
    

    /* renamed from: b */
    public final String f12662b;

    /* access modifiers changed from: public */
    gl3(String str) {
        this.f12662b = str;
    }

    @mr2
    /* renamed from: a */
    public static gl3 m15929a(@mr2 oj3 oj3) throws oj3.C3068a {
        if (oj3 != null) {
            int ordinal = oj3.ordinal();
            if (ordinal == 0) {
                return REGISTER;
            }
            if (ordinal == 1) {
                return SIGN;
            }
            throw new oj3.C3068a(oj3.toString());
        }
        throw new oj3.C3068a((String) null);
    }

    @mr2
    public String toString() {
        return this.f12662b;
    }
}
