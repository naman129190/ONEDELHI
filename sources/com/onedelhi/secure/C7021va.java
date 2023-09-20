package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/va;", "Lcom/onedelhi/secure/ey3;", "", "hasNext", "", "b", "", "array", "<init>", "([S)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.va */
public final class C7021va extends ey3 {
    @vr2

    /* renamed from: a */
    public final short[] f36467a;

    /* renamed from: n */
    public int f36468n;

    public C7021va(@vr2 short[] sArr) {
        jt1.m53777p(sArr, "array");
        this.f36467a = sArr;
    }

    /* renamed from: b */
    public short mo35674b() {
        try {
            short[] sArr = this.f36467a;
            int i = this.f36468n;
            this.f36468n = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f36468n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f36468n < this.f36467a.length;
    }
}
