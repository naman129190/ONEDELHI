package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/z9;", "Lcom/onedelhi/secure/yq;", "", "hasNext", "", "g", "", "array", "<init>", "([B)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.z9 */
public final class C7455z9 extends C7382yq {
    @vr2

    /* renamed from: a */
    public final byte[] f38284a;

    /* renamed from: n */
    public int f38285n;

    public C7455z9(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "array");
        this.f38284a = bArr;
    }

    /* renamed from: g */
    public byte mo34612g() {
        try {
            byte[] bArr = this.f38284a;
            int i = this.f38285n;
            this.f38285n = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f38285n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f38285n < this.f38284a.length;
    }
}
