package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/ha;", "Lcom/onedelhi/secure/ds1;", "", "hasNext", "", "b", "", "array", "<init>", "([I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.ha */
public final class C5494ha extends ds1 {
    @vr2

    /* renamed from: a */
    public final int[] f29566a;

    /* renamed from: n */
    public int f29567n;

    public C5494ha(@vr2 int[] iArr) {
        jt1.m53777p(iArr, "array");
        this.f29566a = iArr;
    }

    /* renamed from: b */
    public int mo19249b() {
        try {
            int[] iArr = this.f29566a;
            int i = this.f29567n;
            this.f29567n = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f29567n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f29567n < this.f29566a.length;
    }
}
