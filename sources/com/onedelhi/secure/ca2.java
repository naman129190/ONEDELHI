package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/ca2;", "Lcom/onedelhi/secure/y92;", "", "hasNext", "", "b", "step", "J", "d", "()J", "first", "last", "<init>", "(JJJ)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ca2 extends y92 {

    /* renamed from: b */
    public final long f26709b;

    /* renamed from: b */
    public boolean f26710b;

    /* renamed from: c */
    public final long f26711c;

    /* renamed from: d */
    public long f26712d;

    public ca2(long j, long j2, long j3) {
        this.f26709b = j3;
        this.f26711c = j2;
        boolean z = true;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.f26710b = z;
        this.f26712d = !z ? j2 : j;
    }

    /* renamed from: b */
    public long mo17159b() {
        long j = this.f26712d;
        if (j != this.f26711c) {
            this.f26712d = this.f26709b + j;
        } else if (this.f26710b) {
            this.f26710b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    /* renamed from: d */
    public final long mo32280d() {
        return this.f26709b;
    }

    public boolean hasNext() {
        return this.f26710b;
    }
}
