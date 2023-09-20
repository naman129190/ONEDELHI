package com.onedelhi.secure;

public enum fa2 {
    DEFAULT {
        /* renamed from: a */
        public ov1 mo35801a(Long l) {
            return l == null ? rv1.f34755a : new vv1((Number) l);
        }
    },
    STRING {
        /* renamed from: a */
        public ov1 mo35801a(Long l) {
            return l == null ? rv1.f34755a : new vv1(l.toString());
        }
    };

    /* renamed from: a */
    public abstract ov1 mo35801a(Long l);
}
