package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001YB\u0013\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\bW\u0010XJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e0\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020+0#8VX\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010&R \u00103\u001a\b\u0012\u0004\u0012\u0002000#8VX\u0004¢\u0006\f\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010&R(\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010#8VX\u0004¢\u0006\f\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010&R\u001c\u0010;\u001a\u0004\u0018\u0001078VX\u0004¢\u0006\f\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\u001a\u0010?\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\b>\u0010.\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bA\u0010.\u001a\u0004\b@\u0010=R\u001a\u0010D\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bC\u0010.\u001a\u0004\bB\u0010=R\u001a\u0010G\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bF\u0010.\u001a\u0004\bE\u0010=R\u001a\u0010J\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bI\u0010.\u001a\u0004\bH\u0010=R\u001a\u0010M\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bL\u0010.\u001a\u0004\bK\u0010=R\u001a\u0010P\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bO\u0010.\u001a\u0004\bN\u0010=R\u001a\u0010S\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bR\u0010.\u001a\u0004\bQ\u0010=R\u001a\u0010V\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\bU\u0010.\u001a\u0004\bT\u0010=¨\u0006Z"}, d2 = {"Lcom/onedelhi/secure/oy;", "Lcom/onedelhi/secure/hx1;", "", "Lcom/onedelhi/secure/ly;", "", "Q", "value", "", "M", "other", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "jClass", "Ljava/lang/Class;", "p", "()Ljava/lang/Class;", "G", "()Ljava/lang/String;", "simpleName", "b0", "qualifiedName", "", "Lcom/onedelhi/secure/gx1;", "e", "()Ljava/util/Collection;", "members", "Lcom/onedelhi/secure/mx1;", "r0", "constructors", "C", "nestedClasses", "", "", "l", "()Ljava/util/List;", "annotations", "d0", "()Ljava/lang/Object;", "objectInstance", "Lcom/onedelhi/secure/gy1;", "b", "getTypeParameters$annotations", "()V", "typeParameters", "Lcom/onedelhi/secure/ey1;", "n", "getSupertypes$annotations", "supertypes", "A", "getSealedSubclasses$annotations", "sealedSubclasses", "Lcom/onedelhi/secure/jy1;", "c", "()Lcom/onedelhi/secure/jy1;", "getVisibility$annotations", "visibility", "f", "()Z", "isFinal$annotations", "isFinal", "isOpen", "isOpen$annotations", "d", "isAbstract$annotations", "isAbstract", "k0", "isSealed$annotations", "isSealed", "i0", "isData$annotations", "isData", "e0", "isInner$annotations", "isInner", "J", "isCompanion$annotations", "isCompanion", "N", "isFun$annotations", "isFun", "q", "isValue$annotations", "isValue", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.oy */
public final class C6349oy implements hx1<Object>, C6068ly {
    @vr2

    /* renamed from: a */
    public static final C6350a f33381a = new C6350a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final HashMap<String, String> f33382a;
    @vr2

    /* renamed from: a */
    public static final Map<Class<? extends tc1<?>>, Integer> f33383a;
    @vr2

    /* renamed from: b */
    public static final HashMap<String, String> f33384b;
    @vr2

    /* renamed from: b */
    public static final Map<String, String> f33385b;
    @vr2

    /* renamed from: c */
    public static final HashMap<String, String> f33386c;
    @vr2

    /* renamed from: a */
    public final Class<?> f33387a;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R,\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0002\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/oy$a;", "", "Ljava/lang/Class;", "jClass", "", "b", "a", "value", "", "c", "", "Lcom/onedelhi/secure/tc1;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.oy$a */
    public static final class C6350a {
        public C6350a() {
        }

        public /* synthetic */ C6350a(wg0 wg0) {
            this();
        }

        @ss2
        /* renamed from: a */
        public final String mo42306a(@vr2 Class<?> cls) {
            String str;
            jt1.m53777p(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C6349oy.f33386c.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "kotlin.Array" : str2;
            }
            String str3 = (String) C6349oy.f33386c.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }

        @ss2
        /* renamed from: b */
        public final String mo42307b(@vr2 Class<?> cls) {
            String str;
            jt1.m53777p(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        jt1.m53776o(simpleName, "name");
                        String p5 = u54.m66665p5(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (p5 != null) {
                            return p5;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    jt1.m53776o(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return u54.m66662o5(simpleName, '$', (String) null, 2, (Object) null);
                    }
                    return u54.m66665p5(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) C6349oy.f33385b.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) C6349oy.f33385b.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }

        /* renamed from: c */
        public final boolean mo42308c(@ss2 Object obj, @vr2 Class<?> cls) {
            jt1.m53777p(cls, "jClass");
            Map u = C6349oy.f33383a;
            jt1.m53775n(u, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) u.get(cls);
            if (num != null) {
                return lj4.m55674B(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = nw1.m58843g(nw1.m58845i(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        int i = 0;
        List M = s00.m64044M(cc1.class, ec1.class, sc1.class, uc1.class, vc1.class, wc1.class, xc1.class, yc1.class, zc1.class, ad1.class, dc1.class, fc1.class, gc1.class, hc1.class, ic1.class, jc1.class, kc1.class, lc1.class, mc1.class, nc1.class, pc1.class, qc1.class, rc1.class);
        ArrayList arrayList = new ArrayList(t00.m65073Z(M, 10));
        for (Object next : M) {
            int i2 = i + 1;
            if (i < 0) {
                s00.m64055X();
            }
            arrayList.add(yi4.m71797a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f33383a = id2.m52094D0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(ak4.C1709b.f9169f, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(ak4.C1709b.f9163c, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f33382a = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f33384b = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        jt1.m53776o(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            jt1.m53776o(str, "kotlinName");
            sb.append(u54.m66674s5(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            ey2 a = yi4.m71797a(sb2, str + ".Companion");
            hashMap3.put(a.mo35668e(), a.mo35670f());
        }
        for (Map.Entry next2 : f33383a.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f33386c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hd2.m50458j(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), u54.m66674s5((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f33385b = linkedHashMap;
    }

    public C6349oy(@vr2 Class<?> cls) {
        jt1.m53777p(cls, "jClass");
        this.f33387a = cls;
    }

    @gz3(version = "1.3")
    /* renamed from: R */
    public static /* synthetic */ void m60305R() {
    }

    @gz3(version = "1.1")
    /* renamed from: V */
    public static /* synthetic */ void m60306V() {
    }

    @gz3(version = "1.1")
    /* renamed from: W */
    public static /* synthetic */ void m60307W() {
    }

    @gz3(version = "1.1")
    /* renamed from: X */
    public static /* synthetic */ void m60308X() {
    }

    @gz3(version = "1.1")
    /* renamed from: a0 */
    public static /* synthetic */ void m60309a0() {
    }

    @gz3(version = "1.1")
    /* renamed from: c0 */
    public static /* synthetic */ void m60310c0() {
    }

    @gz3(version = "1.1")
    /* renamed from: h0 */
    public static /* synthetic */ void m60311h0() {
    }

    @gz3(version = "1.1")
    /* renamed from: l0 */
    public static /* synthetic */ void m60312l0() {
    }

    @gz3(version = "1.4")
    /* renamed from: o0 */
    public static /* synthetic */ void m60313o0() {
    }

    @gz3(version = "1.1")
    /* renamed from: p0 */
    public static /* synthetic */ void m60314p0() {
    }

    @gz3(version = "1.1")
    /* renamed from: q0 */
    public static /* synthetic */ void m60315q0() {
    }

    @gz3(version = "1.1")
    /* renamed from: v0 */
    public static /* synthetic */ void m60318v0() {
    }

    @gz3(version = "1.5")
    /* renamed from: w0 */
    public static /* synthetic */ void m60319w0() {
    }

    @vr2
    /* renamed from: A */
    public List<hx1<? extends Object>> mo37602A() {
        mo42304Q();
        throw new b02();
    }

    @vr2
    /* renamed from: C */
    public Collection<hx1<?>> mo37603C() {
        mo42304Q();
        throw new b02();
    }

    @ss2
    /* renamed from: G */
    public String mo37604G() {
        return f33381a.mo42307b(mo40308p());
    }

    /* renamed from: J */
    public boolean mo37605J() {
        mo42304Q();
        throw new b02();
    }

    @gz3(version = "1.1")
    /* renamed from: M */
    public boolean mo37606M(@ss2 Object obj) {
        return f33381a.mo42308c(obj, mo40308p());
    }

    /* renamed from: N */
    public boolean mo37607N() {
        mo42304Q();
        throw new b02();
    }

    /* renamed from: Q */
    public final Void mo42304Q() {
        throw new e02();
    }

    @vr2
    /* renamed from: b */
    public List<gy1> mo37608b() {
        mo42304Q();
        throw new b02();
    }

    @ss2
    /* renamed from: b0 */
    public String mo37609b0() {
        return f33381a.mo42306a(mo40308p());
    }

    @ss2
    /* renamed from: c */
    public jy1 mo37610c() {
        mo42304Q();
        throw new b02();
    }

    /* renamed from: d */
    public boolean mo37611d() {
        mo42304Q();
        throw new b02();
    }

    @ss2
    /* renamed from: d0 */
    public Object mo37612d0() {
        mo42304Q();
        throw new b02();
    }

    @vr2
    /* renamed from: e */
    public Collection<gx1<?>> mo37613e() {
        mo42304Q();
        throw new b02();
    }

    /* renamed from: e0 */
    public boolean mo37614e0() {
        mo42304Q();
        throw new b02();
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof C6349oy) && jt1.m53768g(nw1.m58843g(this), nw1.m58843g((hx1) obj));
    }

    /* renamed from: f */
    public boolean mo37616f() {
        mo42304Q();
        throw new b02();
    }

    public int hashCode() {
        return nw1.m58843g(this).hashCode();
    }

    /* renamed from: i0 */
    public boolean mo37618i0() {
        mo42304Q();
        throw new b02();
    }

    public boolean isOpen() {
        mo42304Q();
        throw new b02();
    }

    /* renamed from: k0 */
    public boolean mo37620k0() {
        mo42304Q();
        throw new b02();
    }

    @vr2
    /* renamed from: l */
    public List<Annotation> mo36334l() {
        mo42304Q();
        throw new b02();
    }

    @vr2
    /* renamed from: n */
    public List<ey1> mo37621n() {
        mo42304Q();
        throw new b02();
    }

    @vr2
    /* renamed from: p */
    public Class<?> mo40308p() {
        return this.f33387a;
    }

    /* renamed from: q */
    public boolean mo37622q() {
        mo42304Q();
        throw new b02();
    }

    @vr2
    /* renamed from: r0 */
    public Collection<mx1<Object>> mo37623r0() {
        mo42304Q();
        throw new b02();
    }

    @vr2
    public String toString() {
        return mo40308p().toString() + ah3.f25851a;
    }
}
