package com.onedelhi.secure;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002\u001a\u001b\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f*\u00020\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/ij;", "Ljava/lang/StackTraceElement;", "e", "(Lcom/onedelhi/secure/ij;)Ljava/lang/StackTraceElement;", "Lcom/onedelhi/secure/cf0;", "b", "", "c", "expected", "actual", "Lcom/onedelhi/secure/un4;", "a", "", "", "d", "(Lcom/onedelhi/secure/ij;)[Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class df0 {

    /* renamed from: a */
    public static final int f27396a = 1;

    /* renamed from: a */
    public static final void m45061a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    public static final cf0 m45062b(C5729ij ijVar) {
        return (cf0) ijVar.getClass().getAnnotation(cf0.class);
    }

    /* renamed from: c */
    public static final int m45063c(C5729ij ijVar) {
        try {
            Field declaredField = ijVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(ijVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @gz3(version = "1.3")
    @uw1(name = "getSpilledVariableFieldMapping")
    @ss2
    /* renamed from: d */
    public static final String[] m45064d(@vr2 C5729ij ijVar) {
        jt1.m53777p(ijVar, "<this>");
        cf0 b = m45062b(ijVar);
        if (b == null) {
            return null;
        }
        m45061a(1, b.mo32333v());
        ArrayList arrayList = new ArrayList();
        int c = m45063c(ijVar);
        int[] i = b.mo32328i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i[i2] == c) {
                arrayList.add(b.mo32332s()[i2]);
                arrayList.add(b.mo32331n()[i2]);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        jt1.m53775n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    @gz3(version = "1.3")
    @uw1(name = "getStackTraceElement")
    @ss2
    /* renamed from: e */
    public static final StackTraceElement m45065e(@vr2 C5729ij ijVar) {
        String str;
        jt1.m53777p(ijVar, "<this>");
        cf0 b = m45062b(ijVar);
        if (b == null) {
            return null;
        }
        m45061a(1, b.mo32333v());
        int c = m45063c(ijVar);
        int i = c < 0 ? -1 : b.mo32329l()[c];
        String b2 = bk2.f26398a.mo31915b(ijVar);
        if (b2 == null) {
            str = b.mo32326c();
        } else {
            str = b2 + '/' + b.mo32326c();
        }
        return new StackTraceElement(str, b.mo32330m(), b.mo32327f(), i);
    }
}
