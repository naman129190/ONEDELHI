package com.onedelhi.secure;

@Deprecated
public enum oj3 {
    REGISTER("u2f_register_request"),
    SIGN("u2f_sign_request");
    

    /* renamed from: b */
    public final String f17990b;

    /* renamed from: com.onedelhi.secure.oj3$a */
    public static class C3068a extends Exception {
        public C3068a(@mr2 String str) {
            super("Unsupported request type ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: public */
    oj3(String str) {
        this.f17990b = str;
    }

    @mr2
    /* renamed from: a */
    public static oj3 m23835a(@mr2 String str) throws C3068a {
        for (oj3 oj3 : values()) {
            if (str.equals(oj3.f17990b)) {
                return oj3;
            }
        }
        throw new C3068a(str);
    }

    @mr2
    public String toString() {
        return this.f17990b;
    }
}
