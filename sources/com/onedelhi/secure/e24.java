package com.onedelhi.secure;

import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import com.onedelhi.secure.xg0;
import java.sql.Timestamp;
import java.util.Date;

public final class e24 {

    /* renamed from: a */
    public static final dj4 f27675a;

    /* renamed from: a */
    public static final xg0.C7251b<? extends Date> f27676a;

    /* renamed from: a */
    public static final boolean f27677a;

    /* renamed from: b */
    public static final dj4 f27678b;

    /* renamed from: b */
    public static final xg0.C7251b<? extends Date> f27679b;

    /* renamed from: c */
    public static final dj4 f27680c;

    /* renamed from: com.onedelhi.secure.e24$a */
    public class C5071a extends xg0.C7251b<java.sql.Date> {
        public C5071a(Class cls) {
            super(cls);
        }

        /* renamed from: g */
        public java.sql.Date mo34776f(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* renamed from: com.onedelhi.secure.e24$b */
    public class C5072b extends xg0.C7251b<Timestamp> {
        public C5072b(Class cls) {
            super(cls);
        }

        /* renamed from: g */
        public Timestamp mo34776f(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        dj4 dj4;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f27677a = z;
        if (z) {
            f27676a = new C5071a(java.sql.Date.class);
            f27679b = new C5072b(Timestamp.class);
            f27675a = SqlDateTypeAdapter.f25575a;
            f27678b = SqlTimeTypeAdapter.f25577a;
            dj4 = SqlTimestampTypeAdapter.f25579a;
        } else {
            dj4 = null;
            f27676a = null;
            f27679b = null;
            f27675a = null;
            f27678b = null;
        }
        f27680c = dj4;
    }
}
