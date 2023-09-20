package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u000b2\u00020\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0011"}, d2 = {"", "", "c", "a", "R", "", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/IOException;", "IOException", "okio"}, k = 2, mv = {1, 4, 0})
@uw1(name = "-Platform")
/* renamed from: com.onedelhi.secure.k */
public final class C5857k {
    @vr2
    /* renamed from: a */
    public static final byte[] m53899a(@vr2 String str) {
        jt1.m53777p(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C5604hx.f29888a);
        jt1.m53776o(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final <R> R m53900b(@vr2 Object obj, @vr2 cc1<? extends R> cc1) {
        R invoke;
        jt1.m53777p(obj, "lock");
        jt1.m53777p(cc1, "block");
        synchronized (obj) {
            try {
                invoke = cc1.invoke();
                uq1.m67403d(1);
            } catch (Throwable th) {
                uq1.m67403d(1);
                uq1.m67402c(1);
                throw th;
            }
        }
        uq1.m67402c(1);
        return invoke;
    }

    @vr2
    /* renamed from: c */
    public static final String m53901c(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "$this$toUtf8String");
        return new String(bArr, C5604hx.f29888a);
    }
}
