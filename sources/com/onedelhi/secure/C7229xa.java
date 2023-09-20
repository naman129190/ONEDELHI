package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\b\u001a(\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\tH\b¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0001\u001a#\u0010\u0014\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "", "d", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "Ljava/nio/charset/Charset;", "charset", "", "e", "", "f", "(Ljava/util/Collection;)[Ljava/lang/Object;", "reference", "", "size", "a", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "toIndex", "Lcom/onedelhi/secure/un4;", "c", "b", "([Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/ArraysKt")
/* renamed from: com.onedelhi.secure.xa */
public class C7229xa {
    @vr2
    /* renamed from: a */
    public static final <T> T[] m70110a(@vr2 T[] tArr, int i) {
        jt1.m53777p(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        jt1.m53775n(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    @uw1(name = "contentDeepHashCode")
    @z73
    @gz3(version = "1.3")
    /* renamed from: b */
    public static final <T> int m70111b(@ss2 T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @gz3(version = "1.3")
    /* renamed from: c */
    public static final void m70112c(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ <T> T[] m70113d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        jt1.m53786y(0, "T?");
        return new Object[0];
    }

    @xq1
    /* renamed from: e */
    public static final String m70114e(byte[] bArr, Charset charset) {
        jt1.m53777p(bArr, "<this>");
        jt1.m53777p(charset, "charset");
        return new String(bArr, charset);
    }

    /* renamed from: f */
    public static final /* synthetic */ <T> T[] m70115f(Collection<? extends T> collection) {
        jt1.m53777p(collection, "<this>");
        jt1.m53786y(0, "T?");
        T[] array = collection.toArray(new Object[0]);
        jt1.m53775n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return array;
    }
}
