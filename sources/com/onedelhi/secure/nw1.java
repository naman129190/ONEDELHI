package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00068G¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\t\"+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t\"+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\";\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068Ç\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0017\u0010\t\"'\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0019*\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"5\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000e\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001d*\u00028\u00008Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"", "T", "", "", "l", "([Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/hx1;", "Ljava/lang/Class;", "d", "(Lcom/onedelhi/secure/hx1;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lcom/onedelhi/secure/hx1;)V", "java", "h", "javaPrimitiveType", "g", "javaObjectType", "i", "(Ljava/lang/Class;)Lcom/onedelhi/secure/hx1;", "kotlin", "e", "(Ljava/lang/Object;)Ljava/lang/Class;", "javaClass", "j", "getRuntimeClassOfKClassInstance$annotations", "", "a", "(Ljava/lang/annotation/Annotation;)Lcom/onedelhi/secure/hx1;", "annotationClass", "", "E", "b", "(Ljava/lang/Enum;)Ljava/lang/Class;", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "declaringJavaClass", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "JvmClassMappingKt")
public final class nw1 {
    @vr2
    /* renamed from: a */
    public static final <T extends Annotation> hx1<? extends T> m58837a(@vr2 T t) {
        jt1.m53777p(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        jt1.m53776o(annotationType, "this as java.lang.annota…otation).annotationType()");
        hx1<? extends T> i = m58845i(annotationType);
        jt1.m53775n(i, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i;
    }

    /* renamed from: b */
    public static final <E extends Enum<E>> Class<E> m58838b(E e) {
        jt1.m53777p(e, "<this>");
        Class<E> declaringClass = e.getDeclaringClass();
        jt1.m53776o(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @gz3(version = "1.7")
    @xq1
    /* renamed from: c */
    public static /* synthetic */ void m58839c(Enum enumR) {
    }

    @uw1(name = "getJavaClass")
    @vr2
    /* renamed from: d */
    public static final <T> Class<T> m58840d(@vr2 hx1<T> hx1) {
        jt1.m53777p(hx1, "<this>");
        Class<?> p = ((C6068ly) hx1).mo40308p();
        jt1.m53775n(p, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return p;
    }

    @vr2
    /* renamed from: e */
    public static final <T> Class<T> m58841e(@vr2 T t) {
        jt1.m53777p(t, "<this>");
        Class<?> cls = t.getClass();
        jt1.m53775n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    /* renamed from: f */
    public static /* synthetic */ void m58842f(hx1 hx1) {
    }

    @vr2
    /* renamed from: g */
    public static final <T> Class<T> m58843g(@vr2 hx1<T> hx1) {
        jt1.m53777p(hx1, "<this>");
        Class p = ((C6068ly) hx1).mo40308p();
        if (!p.isPrimitive()) {
            jt1.m53775n(p, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return p;
        }
        String name = p.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    p = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    p = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    p = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    p = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    p = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    p = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(ak4.C1709b.f9169f)) {
                    p = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(ak4.C1709b.f9163c)) {
                    p = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    p = Short.class;
                    break;
                }
                break;
        }
        jt1.m53775n(p, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return p;
    }

    @ss2
    /* renamed from: h */
    public static final <T> Class<T> m58844h(@vr2 hx1<T> hx1) {
        jt1.m53777p(hx1, "<this>");
        Class<?> p = ((C6068ly) hx1).mo40308p();
        if (p.isPrimitive()) {
            jt1.m53775n(p, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return p;
        }
        String name = p.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    @uw1(name = "getKotlinClass")
    @vr2
    /* renamed from: i */
    public static final <T> hx1<T> m58845i(@vr2 Class<T> cls) {
        jt1.m53777p(cls, "<this>");
        return ah3.m38681d(cls);
    }

    @uw1(name = "getRuntimeClassOfKClassInstance")
    @vr2
    /* renamed from: j */
    public static final <T> Class<hx1<T>> m58846j(@vr2 hx1<T> hx1) {
        jt1.m53777p(hx1, "<this>");
        Class<?> cls = hx1.getClass();
        jt1.m53775n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @xj0(level = ak0.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @oi3(expression = "(this as Any).javaClass", imports = {}))
    /* renamed from: k */
    public static /* synthetic */ void m58847k(hx1 hx1) {
    }

    /* renamed from: l */
    public static final /* synthetic */ boolean m58848l(Object[] objArr) {
        jt1.m53777p(objArr, "<this>");
        jt1.m53786y(4, mx0.f16794s2);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
