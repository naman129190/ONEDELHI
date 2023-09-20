package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\n2(\u0010\u000e\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\rH\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "collection", "", "", "a", "(Ljava/util/Collection;)[Ljava/lang/Object;", "b", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "Lkotlin/Function0;", "empty", "Lkotlin/Function1;", "", "alloc", "Lkotlin/Function2;", "trim", "c", "(Ljava/util/Collection;Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/sc1;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "CollectionToArray")
public final class o00 {

    /* renamed from: a */
    public static final int f32852a = 2147483645;
    @vr2

    /* renamed from: a */
    public static final Object[] f32853a = new Object[0];

    @uw1(name = "toArray")
    @vr2
    /* renamed from: a */
    public static final Object[] m58878a(@vr2 Collection<?> collection) {
        jt1.m53777p(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = f32852a;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        jt1.m53776o(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        jt1.m53776o(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f32853a;
    }

    @uw1(name = "toArray")
    @vr2
    /* renamed from: b */
    public static final Object[] m58879b(@vr2 Collection<?> collection, @ss2 Object[] objArr) {
        Object[] objArr2;
        jt1.m53777p(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    jt1.m53775n(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = f32852a;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        jt1.m53776o(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        jt1.m53776o(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.cc1<java.lang.Object[]>, com.onedelhi.secure.cc1] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.onedelhi.secure.sc1<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]>, com.onedelhi.secure.sc1] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object[] m58880c(java.util.Collection<?> r2, com.onedelhi.secure.cc1<java.lang.Object[]> r3, com.onedelhi.secure.ec1<? super java.lang.Integer, java.lang.Object[]> r4, com.onedelhi.secure.sc1<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> r5) {
        /*
            int r0 = r2.size()
            if (r0 != 0) goto L_0x000d
        L_0x0006:
            java.lang.Object r2 = r3.invoke()
        L_0x000a:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        L_0x000d:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L_0x0018
            goto L_0x0006
        L_0x0018:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.mo17094X(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L_0x0023:
            int r0 = r4 + 1
            java.lang.Object r1 = r2.next()
            r3[r4] = r1
            int r4 = r3.length
            if (r0 < r4) goto L_0x0056
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0035
            return r3
        L_0x0035:
            int r4 = r0 * 3
            int r4 = r4 + 1
            int r4 = r4 >>> 1
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r4 > r0) goto L_0x004c
            if (r0 >= r1) goto L_0x0046
            r4 = 2147483645(0x7ffffffd, float:NaN)
            goto L_0x004c
        L_0x0046:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError
            r2.<init>()
            throw r2
        L_0x004c:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r4 = "copyOf(result, newSize)"
            com.onedelhi.secure.jt1.m53776o(r3, r4)
            goto L_0x0065
        L_0x0056:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0065
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r5.mo21054h0(r3, r2)
            goto L_0x000a
        L_0x0065:
            r4 = r0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o00.m58880c(java.util.Collection, com.onedelhi.secure.cc1, com.onedelhi.secure.ec1, com.onedelhi.secure.sc1):java.lang.Object[]");
    }
}
