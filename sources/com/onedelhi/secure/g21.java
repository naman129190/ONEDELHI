package com.onedelhi.secure;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public enum g21 {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, C5358b.MAP, mu1.VOID);
    

    /* renamed from: a */
    public static final g21[] f28890a = null;

    /* renamed from: a */
    public static final Type[] f28891a = null;

    /* renamed from: a */
    public final C5358b f28918a;

    /* renamed from: a */
    public final mu1 f28919a;

    /* renamed from: a */
    public final Class<?> f28920a;

    /* renamed from: b */
    public final boolean f28921b;

    /* renamed from: n */
    public final int f28922n;

    /* renamed from: com.onedelhi.secure.g21$a */
    public static /* synthetic */ class C5357a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28923a = null;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28924b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.onedelhi.secure.mu1[] r0 = com.onedelhi.secure.mu1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28924b = r0
                r1 = 1
                com.onedelhi.secure.mu1 r2 = com.onedelhi.secure.mu1.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f28924b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.mu1 r3 = com.onedelhi.secure.mu1.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f28924b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.mu1 r4 = com.onedelhi.secure.mu1.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.onedelhi.secure.g21$b[] r3 = com.onedelhi.secure.g21.C5358b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f28923a = r3
                com.onedelhi.secure.g21$b r4 = com.onedelhi.secure.g21.C5358b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f28923a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.onedelhi.secure.g21$b r3 = com.onedelhi.secure.g21.C5358b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f28923a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.onedelhi.secure.g21$b r1 = com.onedelhi.secure.g21.C5358b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g21.C5357a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.g21$b */
    public enum C5358b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: b */
        public final boolean f28930b;

        /* access modifiers changed from: public */
        C5358b(boolean z) {
            this.f28930b = z;
        }

        /* renamed from: a */
        public boolean mo36544a() {
            return this.f28930b;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        f28891a = new Type[0];
        g21[] values = values();
        f28890a = new g21[values.length];
        for (g21 g21 : values) {
            f28890a[g21.f28922n] = g21;
        }
    }

    /* access modifiers changed from: public */
    g21(int i, C5358b bVar, mu1 mu1) {
        int i2;
        this.f28922n = i;
        this.f28918a = bVar;
        this.f28919a = mu1;
        int i3 = C5357a.f28923a[bVar.ordinal()];
        boolean z = true;
        this.f28920a = (i3 == 1 || i3 == 2) ? mu1.mo40785a() : null;
        this.f28921b = (bVar != C5358b.SCALAR || (i2 = C5357a.f28924b[mu1.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    /* renamed from: a */
    public static g21 m49034a(int i) {
        if (i < 0) {
            return null;
        }
        g21[] g21Arr = f28890a;
        if (i >= g21Arr.length) {
            return null;
        }
        return g21Arr[i];
    }

    /* renamed from: b */
    public static Type m49035b(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                if (List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                    return type;
                }
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        if (List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    /* renamed from: g */
    public static Type m49036g(Class<?> cls, Type[] typeArr) {
        Class<? super Object> cls2;
        boolean z;
        while (true) {
            int i = 0;
            Class<? super Object> cls3 = cls;
            if (cls3 != List.class) {
                Type b = m49035b(cls3);
                if (!(b instanceof ParameterizedType)) {
                    typeArr = f28891a;
                    Class<? super Object>[] interfaces = cls3.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i >= length) {
                            cls2 = cls3.getSuperclass();
                            break;
                        }
                        Class<? super Object> cls4 = interfaces[i];
                        if (List.class.isAssignableFrom(cls4)) {
                            cls2 = cls4;
                            break;
                        }
                        i++;
                    }
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) b;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable[] typeParameters = cls3.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= typeParameters.length) {
                                        z = false;
                                        break;
                                    } else if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                        z = true;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (!z) {
                                    throw new RuntimeException("Unable to find replacement for " + type);
                                }
                            } else {
                                throw new RuntimeException("Type array mismatch");
                            }
                        }
                    }
                    typeArr = actualTypeArguments;
                    cls2 = (Class) parameterizedType.getRawType();
                }
                cls3 = cls2;
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    /* renamed from: e */
    public mu1 mo36535e() {
        return this.f28919a;
    }

    /* renamed from: i */
    public boolean mo36536i() {
        return C5358b.PACKED_VECTOR.equals(this.f28918a);
    }

    /* renamed from: l */
    public int mo36537l() {
        return this.f28922n;
    }

    /* renamed from: q */
    public boolean mo36538q() {
        return this.f28918a.mo36544a();
    }

    /* renamed from: r */
    public boolean mo36539r() {
        return this.f28918a == C5358b.MAP;
    }

    /* renamed from: s */
    public boolean mo36540s() {
        return this.f28921b;
    }

    /* renamed from: t */
    public boolean mo36541t() {
        return this.f28918a == C5358b.SCALAR;
    }

    /* renamed from: u */
    public boolean mo36542u(Field field) {
        return C5358b.VECTOR.equals(this.f28918a) ? mo36543v(field) : this.f28919a.mo40787e().isAssignableFrom(field.getType());
    }

    /* renamed from: v */
    public final boolean mo36543v(Field field) {
        Class<?> type = field.getType();
        if (!this.f28919a.mo40787e().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = f28891a;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type g = m49036g(type, typeArr);
        if (!(g instanceof Class)) {
            return true;
        }
        return this.f28920a.isAssignableFrom((Class) g);
    }
}
