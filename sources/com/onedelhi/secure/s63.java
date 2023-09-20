package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

public final class s63 implements lt2 {

    /* renamed from: a */
    public static final v11 f34922a = v11.m67579a("key").mo45928b(C6526qb.m62358b().mo43286d(1).mo43284a()).mo45927a();

    /* renamed from: a */
    public static final Charset f34923a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final kt2<Map.Entry<Object, Object>> f34924b = r63.f34540a;

    /* renamed from: b */
    public static final v11 f34925b = v11.m67579a("value").mo45928b(C6526qb.m62358b().mo43286d(2).mo43284a()).mo45927a();

    /* renamed from: a */
    public final kt2<Object> f34926a;

    /* renamed from: a */
    public final w63 f34927a = new w63(this);

    /* renamed from: a */
    public OutputStream f34928a;

    /* renamed from: a */
    public final Map<Class<?>, kt2<?>> f34929a;

    /* renamed from: b */
    public final Map<Class<?>, fs4<?>> f34930b;

    /* renamed from: com.onedelhi.secure.s63$a */
    public static /* synthetic */ class C6750a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34931a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.o63$a[] r0 = com.onedelhi.secure.o63.C6247a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34931a = r0
                com.onedelhi.secure.o63$a r1 = com.onedelhi.secure.o63.C6247a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34931a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.o63$a r1 = com.onedelhi.secure.o63.C6247a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34931a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.o63$a r1 = com.onedelhi.secure.o63.C6247a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.s63.C6750a.<clinit>():void");
        }
    }

    public s63(OutputStream outputStream, Map<Class<?>, kt2<?>> map, Map<Class<?>, fs4<?>> map2, kt2<Object> kt2) {
        this.f34928a = outputStream;
        this.f34929a = map;
        this.f34930b = map2;
        this.f34926a = kt2;
    }

    /* renamed from: D */
    public static o63 m64213D(v11 v11) {
        o63 o63 = (o63) v11.mo45923c(o63.class);
        if (o63 != null) {
            return o63;
        }
        throw new iu0("Field has no @Protobuf config");
    }

    /* renamed from: E */
    public static int m64214E(v11 v11) {
        o63 o63 = (o63) v11.mo45923c(o63.class);
        if (o63 != null) {
            return o63.tag();
        }
        throw new iu0("Field has no @Protobuf config");
    }

    /* renamed from: F */
    public static /* synthetic */ void m64215F(Map.Entry entry, lt2 lt2) throws IOException {
        lt2.mo39575r(f34922a, entry.getKey());
        lt2.mo39575r(f34925b, entry.getValue());
    }

    /* renamed from: y */
    public static ByteBuffer m64217y(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: A */
    public final <T> s63 mo44207A(kt2<T> kt2, v11 v11, T t, boolean z) throws IOException {
        long z2 = mo44221z(kt2, t);
        if (z && z2 == 0) {
            return this;
        }
        mo44210G((m64214E(v11) << 3) | 2);
        mo44211H(z2);
        kt2.mo17710a(t, this);
        return this;
    }

    /* renamed from: B */
    public final <T> s63 mo44208B(fs4<T> fs4, v11 v11, T t, boolean z) throws IOException {
        this.f34927a.mo46560c(v11, z);
        fs4.mo17710a(t, this.f34927a);
        return this;
    }

    /* renamed from: C */
    public s63 mo44209C(@ts2 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        kt2 kt2 = this.f34929a.get(obj.getClass());
        if (kt2 != null) {
            kt2.mo17710a(obj, this);
            return this;
        }
        throw new iu0("No encoder for " + obj.getClass());
    }

    /* renamed from: G */
    public final void mo44210G(int i) throws IOException {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f34928a;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    /* renamed from: H */
    public final void mo44211H(long j) throws IOException {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f34928a;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    @mr2
    /* renamed from: a */
    public lt2 mo39565a(@mr2 v11 v11, double d) throws IOException {
        return mo44212f(v11, d, true);
    }

    @mr2
    /* renamed from: d */
    public lt2 mo39567d(@mr2 v11 v11) throws IOException {
        throw new iu0("nested() is not implemented for protobuf encoding.");
    }

    @mr2
    /* renamed from: e */
    public lt2 mo39568e(@mr2 v11 v11, float f) throws IOException {
        return mo44213g(v11, f, true);
    }

    /* renamed from: f */
    public lt2 mo44212f(@mr2 v11 v11, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        mo44210G((m64214E(v11) << 3) | 1);
        this.f34928a.write(m64217y(8).putDouble(d).array());
        return this;
    }

    /* renamed from: g */
    public lt2 mo44213g(@mr2 v11 v11, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        mo44210G((m64214E(v11) << 3) | 5);
        this.f34928a.write(m64217y(4).putFloat(f).array());
        return this;
    }

    /* renamed from: h */
    public lt2 mo44214h(@mr2 v11 v11, @ts2 Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo44210G((m64214E(v11) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f34923a);
            mo44210G(bytes.length);
            this.f34928a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object h : (Collection) obj) {
                mo44214h(v11, h, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry A : ((Map) obj).entrySet()) {
                mo44207A(f34924b, v11, A, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo44212f(v11, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo44213g(v11, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo44218v(v11, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo44220x(v11, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                mo44210G((m64214E(v11) << 3) | 2);
                mo44210G(bArr.length);
                this.f34928a.write(bArr);
                return this;
            }
            kt2 kt2 = this.f34929a.get(obj.getClass());
            if (kt2 != null) {
                return mo44207A(kt2, v11, obj, z);
            }
            fs4 fs4 = this.f34930b.get(obj.getClass());
            return fs4 != null ? mo44208B(fs4, v11, obj, z) : obj instanceof m63 ? mo39571k(v11, ((m63) obj).mo12867j()) : obj instanceof Enum ? mo39571k(v11, ((Enum) obj).ordinal()) : mo44207A(this.f34926a, v11, obj, z);
        }
    }

    @mr2
    /* renamed from: i */
    public lt2 mo39569i(@mr2 String str, double d) throws IOException {
        return mo39565a(v11.m67580d(str), d);
    }

    @mr2
    /* renamed from: j */
    public lt2 mo39570j(@mr2 String str, @ts2 Object obj) throws IOException {
        return mo39575r(v11.m67580d(str), obj);
    }

    @mr2
    /* renamed from: l */
    public s63 mo39571k(@mr2 v11 v11, int i) throws IOException {
        return mo44216o(v11, i, true);
    }

    @mr2
    /* renamed from: m */
    public lt2 mo39572m(@ts2 Object obj) throws IOException {
        return mo44209C(obj);
    }

    @mr2
    /* renamed from: n */
    public lt2 mo39573n(@mr2 String str, boolean z) throws IOException {
        return mo39566c(v11.m67580d(str), z);
    }

    /* renamed from: o */
    public s63 mo44216o(@mr2 v11 v11, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        o63 D = m64213D(v11);
        int i2 = C6750a.f34931a[D.intEncoding().ordinal()];
        if (i2 == 1) {
            mo44210G(D.tag() << 3);
            mo44210G(i);
        } else if (i2 == 2) {
            mo44210G(D.tag() << 3);
            mo44210G((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            mo44210G((D.tag() << 3) | 5);
            this.f34928a.write(m64217y(4).putInt(i).array());
        }
        return this;
    }

    @mr2
    /* renamed from: p */
    public lt2 mo39574p(@mr2 String str, int i) throws IOException {
        return mo39571k(v11.m67580d(str), i);
    }

    @mr2
    /* renamed from: q */
    public s63 mo39577t(@mr2 v11 v11, long j) throws IOException {
        return mo44218v(v11, j, true);
    }

    @mr2
    /* renamed from: r */
    public lt2 mo39575r(@mr2 v11 v11, @ts2 Object obj) throws IOException {
        return mo44214h(v11, obj, true);
    }

    @mr2
    /* renamed from: s */
    public lt2 mo39576s(@mr2 String str) throws IOException {
        return mo39567d(v11.m67580d(str));
    }

    @mr2
    /* renamed from: u */
    public lt2 mo39578u(@mr2 String str, long j) throws IOException {
        return mo39577t(v11.m67580d(str), j);
    }

    /* renamed from: v */
    public s63 mo44218v(@mr2 v11 v11, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        o63 D = m64213D(v11);
        int i = C6750a.f34931a[D.intEncoding().ordinal()];
        if (i == 1) {
            mo44210G(D.tag() << 3);
            mo44211H(j);
        } else if (i == 2) {
            mo44210G(D.tag() << 3);
            mo44211H((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            mo44210G((D.tag() << 3) | 1);
            this.f34928a.write(m64217y(8).putLong(j).array());
        }
        return this;
    }

    @mr2
    /* renamed from: w */
    public s63 mo39566c(@mr2 v11 v11, boolean z) throws IOException {
        return mo44220x(v11, z, true);
    }

    /* renamed from: x */
    public s63 mo44220x(@mr2 v11 v11, boolean z, boolean z2) throws IOException {
        return mo44216o(v11, z ? 1 : 0, z2);
    }

    /* renamed from: z */
    public final <T> long mo44221z(kt2<T> kt2, T t) throws IOException {
        OutputStream outputStream;
        q22 q22 = new q22();
        try {
            outputStream = this.f34928a;
            this.f34928a = q22;
            kt2.mo17710a(t, this);
            this.f34928a = outputStream;
            long a = q22.mo43095a();
            q22.close();
            return a;
        } catch (Throwable th) {
            try {
                q22.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
