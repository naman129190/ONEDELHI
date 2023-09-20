package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/fa;", "Lcom/onedelhi/secure/ho0;", "", "hasNext", "", "b", "", "array", "<init>", "([D)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.fa */
public final class C5226fa extends ho0 {
    @vr2

    /* renamed from: a */
    public final double[] f28211a;

    /* renamed from: n */
    public int f28212n;

    public C5226fa(@vr2 double[] dArr) {
        jt1.m53777p(dArr, "array");
        this.f28211a = dArr;
    }

    /* renamed from: b */
    public double mo35799b() {
        try {
            double[] dArr = this.f28211a;
            int i = this.f28212n;
            this.f28212n = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28212n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28212n < this.f28211a.length;
    }
}
