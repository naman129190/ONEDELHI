package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class rk6 implements Iterator {
    @CheckForNull

    /* renamed from: a */
    public Object f19922a;

    /* renamed from: n */
    public int f19923n = 2;

    @CheckForNull
    /* renamed from: a */
    public abstract Object mo20863a();

    @CheckForNull
    @C7277xt
    /* renamed from: b */
    public final Object mo23930b() {
        this.f19923n = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f19923n;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f19923n = 4;
                    this.f19922a = mo20863a();
                    if (this.f19923n != 3) {
                        this.f19923n = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f19923n = 2;
            Object obj = this.f19922a;
            this.f19922a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
