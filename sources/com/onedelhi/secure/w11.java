package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.lang.reflect.Field;

public final class w11 implements Comparable<w11> {

    /* renamed from: a */
    public final g21 f36808a;

    /* renamed from: a */
    public final uv2 f36809a;

    /* renamed from: a */
    public final vs1.C7083e f36810a;

    /* renamed from: a */
    public final Class<?> f36811a;

    /* renamed from: a */
    public final Object f36812a;

    /* renamed from: a */
    public final Field f36813a;

    /* renamed from: b */
    public final Class<?> f36814b;

    /* renamed from: b */
    public final Field f36815b;

    /* renamed from: b */
    public final boolean f36816b;

    /* renamed from: c */
    public final Field f36817c;

    /* renamed from: c */
    public final boolean f36818c;

    /* renamed from: n */
    public final int f36819n;

    /* renamed from: o */
    public final int f36820o;

    /* renamed from: com.onedelhi.secure.w11$a */
    public static /* synthetic */ class C7116a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36821a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onedelhi.secure.g21[] r0 = com.onedelhi.secure.g21.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36821a = r0
                com.onedelhi.secure.g21 r1 = com.onedelhi.secure.g21.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36821a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.g21 r1 = com.onedelhi.secure.g21.GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36821a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.g21 r1 = com.onedelhi.secure.g21.MESSAGE_LIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36821a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.g21 r1 = com.onedelhi.secure.g21.GROUP_LIST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.w11.C7116a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.w11$b */
    public static final class C7117b {

        /* renamed from: a */
        public int f36822a;

        /* renamed from: a */
        public g21 f36823a;

        /* renamed from: a */
        public uv2 f36824a;

        /* renamed from: a */
        public vs1.C7083e f36825a;

        /* renamed from: a */
        public Class<?> f36826a;

        /* renamed from: a */
        public Object f36827a;

        /* renamed from: a */
        public Field f36828a;

        /* renamed from: a */
        public boolean f36829a;

        /* renamed from: b */
        public int f36830b;

        /* renamed from: b */
        public Field f36831b;

        /* renamed from: b */
        public boolean f36832b;

        /* renamed from: c */
        public Field f36833c;

        public C7117b() {
        }

        public /* synthetic */ C7117b(C7116a aVar) {
            this();
        }

        /* renamed from: a */
        public w11 mo46481a() {
            uv2 uv2 = this.f36824a;
            if (uv2 != null) {
                return w11.m68687q(this.f36822a, this.f36823a, uv2, this.f36826a, this.f36832b, this.f36825a);
            }
            Object obj = this.f36827a;
            if (obj != null) {
                return w11.m68686l(this.f36828a, this.f36822a, obj, this.f36825a);
            }
            Field field = this.f36831b;
            if (field != null) {
                boolean z = this.f36829a;
                Field field2 = this.f36828a;
                int i = this.f36822a;
                g21 g21 = this.f36823a;
                int i2 = this.f36830b;
                boolean z2 = this.f36832b;
                vs1.C7083e eVar = this.f36825a;
                return z ? w11.m68691u(field2, i, g21, field, i2, z2, eVar) : w11.m68690t(field2, i, g21, field, i2, z2, eVar);
            }
            vs1.C7083e eVar2 = this.f36825a;
            if (eVar2 != null) {
                Field field3 = this.f36833c;
                return field3 == null ? w11.m68685g(this.f36828a, this.f36822a, this.f36823a, eVar2) : w11.m68689s(this.f36828a, this.f36822a, this.f36823a, eVar2, field3);
            }
            Field field4 = this.f36833c;
            return field4 == null ? w11.m68684e(this.f36828a, this.f36822a, this.f36823a, this.f36832b) : w11.m68688r(this.f36828a, this.f36822a, this.f36823a, field4);
        }

        /* renamed from: b */
        public C7117b mo46482b(Field field) {
            this.f36833c = field;
            return this;
        }

        /* renamed from: c */
        public C7117b mo46483c(boolean z) {
            this.f36832b = z;
            return this;
        }

        /* renamed from: d */
        public C7117b mo46484d(vs1.C7083e eVar) {
            this.f36825a = eVar;
            return this;
        }

        /* renamed from: e */
        public C7117b mo46485e(Field field) {
            if (this.f36824a == null) {
                this.f36828a = field;
                return this;
            }
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }

        /* renamed from: f */
        public C7117b mo46486f(int i) {
            this.f36822a = i;
            return this;
        }

        /* renamed from: g */
        public C7117b mo46487g(Object obj) {
            this.f36827a = obj;
            return this;
        }

        /* renamed from: h */
        public C7117b mo46488h(uv2 uv2, Class<?> cls) {
            if (this.f36828a == null && this.f36831b == null) {
                this.f36824a = uv2;
                this.f36826a = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        /* renamed from: i */
        public C7117b mo46489i(Field field, int i) {
            this.f36831b = (Field) vs1.m68433e(field, "presenceField");
            this.f36830b = i;
            return this;
        }

        /* renamed from: j */
        public C7117b mo46490j(boolean z) {
            this.f36829a = z;
            return this;
        }

        /* renamed from: k */
        public C7117b mo46491k(g21 g21) {
            this.f36823a = g21;
            return this;
        }
    }

    public w11(Field field, int i, g21 g21, Class<?> cls, Field field2, int i2, boolean z, boolean z2, uv2 uv2, Class<?> cls2, Object obj, vs1.C7083e eVar, Field field3) {
        this.f36813a = field;
        this.f36808a = g21;
        this.f36811a = cls;
        this.f36819n = i;
        this.f36815b = field2;
        this.f36820o = i2;
        this.f36816b = z;
        this.f36818c = z2;
        this.f36809a = uv2;
        this.f36814b = cls2;
        this.f36812a = obj;
        this.f36810a = eVar;
        this.f36817c = field3;
    }

    /* renamed from: J */
    public static boolean m68681J(int i) {
        return i != 0 && (i & (i + -1)) == 0;
    }

    /* renamed from: L */
    public static C7117b m68682L() {
        return new C7117b((C7116a) null);
    }

    /* renamed from: a */
    public static void m68683a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("fieldNumber must be positive: " + i);
        }
    }

    /* renamed from: e */
    public static w11 m68684e(Field field, int i, g21 g21, boolean z) {
        g21 g212 = g21;
        m68683a(i);
        Field field2 = field;
        vs1.m68433e(field, "field");
        vs1.m68433e(g212, "fieldType");
        if (g212 != g21.MESSAGE_LIST && g212 != g21.GROUP_LIST) {
            return new w11(field, i, g21, (Class<?>) null, (Field) null, 0, false, z, (uv2) null, (Class<?>) null, (Object) null, (vs1.C7083e) null, (Field) null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: g */
    public static w11 m68685g(Field field, int i, g21 g21, vs1.C7083e eVar) {
        m68683a(i);
        vs1.m68433e(field, "field");
        return new w11(field, i, g21, (Class<?>) null, (Field) null, 0, false, false, (uv2) null, (Class<?>) null, (Object) null, eVar, (Field) null);
    }

    /* renamed from: l */
    public static w11 m68686l(Field field, int i, Object obj, vs1.C7083e eVar) {
        Object obj2 = obj;
        vs1.m68433e(obj2, "mapDefaultEntry");
        m68683a(i);
        vs1.m68433e(field, "field");
        return new w11(field, i, g21.MAP, (Class<?>) null, (Field) null, 0, false, true, (uv2) null, (Class<?>) null, obj2, eVar, (Field) null);
    }

    /* renamed from: q */
    public static w11 m68687q(int i, g21 g21, uv2 uv2, Class<?> cls, boolean z, vs1.C7083e eVar) {
        g21 g212 = g21;
        m68683a(i);
        vs1.m68433e(g212, "fieldType");
        vs1.m68433e(uv2, "oneof");
        vs1.m68433e(cls, "oneofStoredType");
        if (g21.mo36541t()) {
            return new w11((Field) null, i, g21, (Class<?>) null, (Field) null, 0, false, z, uv2, cls, (Object) null, eVar, (Field) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Oneof is only supported for scalar fields. Field ");
        int i2 = i;
        sb.append(i);
        sb.append(" is of type ");
        sb.append(g212);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: r */
    public static w11 m68688r(Field field, int i, g21 g21, Field field2) {
        g21 g212 = g21;
        m68683a(i);
        Field field3 = field;
        vs1.m68433e(field, "field");
        vs1.m68433e(g212, "fieldType");
        if (g212 != g21.MESSAGE_LIST && g212 != g21.GROUP_LIST) {
            return new w11(field, i, g21, (Class<?>) null, (Field) null, 0, false, false, (uv2) null, (Class<?>) null, (Object) null, (vs1.C7083e) null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: s */
    public static w11 m68689s(Field field, int i, g21 g21, vs1.C7083e eVar, Field field2) {
        m68683a(i);
        vs1.m68433e(field, "field");
        return new w11(field, i, g21, (Class<?>) null, (Field) null, 0, false, false, (uv2) null, (Class<?>) null, (Object) null, eVar, field2);
    }

    /* renamed from: t */
    public static w11 m68690t(Field field, int i, g21 g21, Field field2, int i2, boolean z, vs1.C7083e eVar) {
        Field field3 = field2;
        m68683a(i);
        Field field4 = field;
        vs1.m68433e(field, "field");
        vs1.m68433e(g21, "fieldType");
        vs1.m68433e(field3, "presenceField");
        if (field3 == null || m68681J(i2)) {
            int i3 = i2;
            return new w11(field, i, g21, (Class<?>) null, field2, i2, false, z, (uv2) null, (Class<?>) null, (Object) null, eVar, (Field) null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    /* renamed from: u */
    public static w11 m68691u(Field field, int i, g21 g21, Field field2, int i2, boolean z, vs1.C7083e eVar) {
        Field field3 = field2;
        m68683a(i);
        Field field4 = field;
        vs1.m68433e(field, "field");
        vs1.m68433e(g21, "fieldType");
        vs1.m68433e(field3, "presenceField");
        if (field3 == null || m68681J(i2)) {
            int i3 = i2;
            return new w11(field, i, g21, (Class<?>) null, field2, i2, true, z, (uv2) null, (Class<?>) null, (Object) null, eVar, (Field) null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    /* renamed from: v */
    public static w11 m68692v(Field field, int i, g21 g21, Class<?> cls) {
        m68683a(i);
        vs1.m68433e(field, "field");
        g21 g212 = g21;
        vs1.m68433e(g212, "fieldType");
        Class<?> cls2 = cls;
        vs1.m68433e(cls2, "messageClass");
        return new w11(field, i, g212, cls2, (Field) null, 0, false, false, (uv2) null, (Class<?>) null, (Object) null, (vs1.C7083e) null, (Field) null);
    }

    /* renamed from: A */
    public Class<?> mo46465A() {
        return this.f36811a;
    }

    /* renamed from: B */
    public Object mo46466B() {
        return this.f36812a;
    }

    /* renamed from: C */
    public Class<?> mo46467C() {
        int i = C7116a.f36821a[this.f36808a.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f36813a;
            return field != null ? field.getType() : this.f36814b;
        } else if (i == 3 || i == 4) {
            return this.f36811a;
        } else {
            return null;
        }
    }

    /* renamed from: D */
    public uv2 mo46468D() {
        return this.f36809a;
    }

    /* renamed from: E */
    public Class<?> mo46469E() {
        return this.f36814b;
    }

    /* renamed from: F */
    public Field mo46470F() {
        return this.f36815b;
    }

    /* renamed from: G */
    public int mo46471G() {
        return this.f36820o;
    }

    /* renamed from: H */
    public g21 mo46472H() {
        return this.f36808a;
    }

    /* renamed from: I */
    public boolean mo46473I() {
        return this.f36818c;
    }

    /* renamed from: K */
    public boolean mo46474K() {
        return this.f36816b;
    }

    /* renamed from: b */
    public int compareTo(w11 w11) {
        return this.f36819n - w11.f36819n;
    }

    /* renamed from: w */
    public Field mo46477w() {
        return this.f36817c;
    }

    /* renamed from: x */
    public vs1.C7083e mo46478x() {
        return this.f36810a;
    }

    /* renamed from: y */
    public Field mo46479y() {
        return this.f36813a;
    }

    /* renamed from: z */
    public int mo46480z() {
        return this.f36819n;
    }
}
