package com.onedelhi.secure;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a\"\u0010\n\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\b8BX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/ey1;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "jClass", "", "Lcom/onedelhi/secure/hy1;", "arguments", "e", "type", "", "j", "f", "(Lcom/onedelhi/secure/ey1;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lcom/onedelhi/secure/ey1;)V", "javaType", "g", "(Lcom/onedelhi/secure/hy1;)Ljava/lang/reflect/Type;", "(Lcom/onedelhi/secure/hy1;)V", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class sk4 {

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.sk4$a */
    public /* synthetic */ class C6780a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35135a;

        static {
            int[] iArr = new int[iy1.values().length];
            iArr[iy1.IN.ordinal()] = 1;
            iArr[iy1.INVARIANT.ordinal()] = 2;
            iArr[iy1.OUT.ordinal()] = 3;
            f35135a = iArr;
        }
    }

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.sk4$b */
    public /* synthetic */ class C6781b extends hd1 implements ec1<Class<?>, Class<?>> {

        /* renamed from: a */
        public static final C6781b f35136a = new C6781b();

        public C6781b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* renamed from: G0 */
        public final Class<?> mo17094X(@vr2 Class<?> cls) {
            jt1.m53777p(cls, "p0");
            return cls.getComponentType();
        }
    }

    @ly0
    /* renamed from: c */
    public static final Type m64686c(ey1 ey1, boolean z) {
        kx1 m0 = ey1.mo35664m0();
        if (m0 instanceof gy1) {
            return new uj4((gy1) m0);
        }
        if (m0 instanceof hx1) {
            hx1 hx1 = (hx1) m0;
            Class g = z ? nw1.m58843g(hx1) : nw1.m58840d(hx1);
            List<hy1> j0 = ey1.mo35663j0();
            if (j0.isEmpty()) {
                return g;
            }
            if (!g.isArray()) {
                return m64688e(g, j0);
            }
            if (g.getComponentType().isPrimitive()) {
                return g;
            }
            hy1 hy1 = (hy1) a10.m35843f5(j0);
            if (hy1 != null) {
                iy1 a = hy1.mo37669a();
                ey1 b = hy1.mo37670b();
                int i = a == null ? -1 : C6780a.f35135a[a.ordinal()];
                if (i == -1 || i == 1) {
                    return g;
                }
                if (i == 2 || i == 3) {
                    jt1.m53774m(b);
                    Type d = m64687d(b, false, 1, (Object) null);
                    return d instanceof Class ? g : new se1(d);
                }
                throw new gr2();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + ey1);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + ey1);
    }

    /* renamed from: d */
    public static /* synthetic */ Type m64687d(ey1 ey1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m64686c(ey1, z);
    }

    @ly0
    /* renamed from: e */
    public static final Type m64688e(Class<?> cls, List<hy1> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(t00.m65073Z(list, 10));
            for (hy1 g : list) {
                arrayList.add(m64690g(g));
            }
            return new jy2(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(t00.m65073Z(list, 10));
            for (hy1 g2 : list) {
                arrayList2.add(m64690g(g2));
            }
            return new jy2(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e = m64688e(declaringClass, list.subList(length, list.size()));
            List<hy1> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(t00.m65073Z(subList, 10));
            for (hy1 g3 : subList) {
                arrayList3.add(m64690g(g3));
            }
            return new jy2(cls, e, arrayList3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = ((com.onedelhi.secure.fy1) r3).mo36398w();
     */
    @com.onedelhi.secure.vr2
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Type m64689f(@com.onedelhi.secure.vr2 com.onedelhi.secure.ey1 r3) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            boolean r0 = r3 instanceof com.onedelhi.secure.fy1
            if (r0 == 0) goto L_0x0013
            r0 = r3
            com.onedelhi.secure.fy1 r0 = (com.onedelhi.secure.fy1) r0
            java.lang.reflect.Type r0 = r0.mo36398w()
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.reflect.Type r3 = m64687d(r3, r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sk4.m64689f(com.onedelhi.secure.ey1):java.lang.reflect.Type");
    }

    /* renamed from: g */
    public static final Type m64690g(hy1 hy1) {
        iy1 h = hy1.mo37674h();
        if (h == null) {
            return jx4.f30997a.mo38926a();
        }
        ey1 g = hy1.mo37673g();
        jt1.m53774m(g);
        int i = C6780a.f35135a[h.ordinal()];
        if (i == 1) {
            return new jx4((Type) null, m64686c(g, true));
        }
        if (i == 2) {
            return m64686c(g, true);
        }
        if (i == 3) {
            return new jx4(m64686c(g, true), (Type) null);
        }
        throw new gr2();
    }

    @gz3(version = "1.4")
    @ib2
    @ly0
    /* renamed from: h */
    public static /* synthetic */ void m64691h(ey1 ey1) {
    }

    @ly0
    /* renamed from: i */
    public static /* synthetic */ void m64692i(hy1 hy1) {
    }

    /* renamed from: j */
    public static final String m64693j(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            zt3 n = fu3.m48496n(type, C6781b.f35136a);
            str = ((Class) hu3.m51021f1(n)).getName() + t54.m65438g2(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, hu3.m51024g0(n));
        } else {
            str = cls.getName();
        }
        jt1.m53776o(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}
