package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/hs1;", "Lcom/onedelhi/secure/ds1;", "", "hasNext", "", "b", "step", "I", "d", "()I", "first", "last", "<init>", "(III)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class hs1 extends ds1 {

    /* renamed from: b */
    public boolean f29778b;

    /* renamed from: n */
    public final int f29779n;

    /* renamed from: o */
    public final int f29780o;

    /* renamed from: p */
    public int f29781p;

    public hs1(int i, int i2, int i3) {
        this.f29779n = i3;
        this.f29780o = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f29778b = z;
        this.f29781p = !z ? i2 : i;
    }

    /* renamed from: b */
    public int mo19249b() {
        int i = this.f29781p;
        if (i != this.f29780o) {
            this.f29781p = this.f29779n + i;
        } else if (this.f29778b) {
            this.f29778b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    /* renamed from: d */
    public final int mo37528d() {
        return this.f29779n;
    }

    public boolean hasNext() {
        return this.f29778b;
    }
}
