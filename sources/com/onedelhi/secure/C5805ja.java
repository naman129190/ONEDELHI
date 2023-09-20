package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/ja;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "array", "[Ljava/lang/Object;", "a", "()[Ljava/lang/Object;", "<init>", "([Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.ja */
public final class C5805ja<T> implements Iterator<T>, nx1 {
    @vr2

    /* renamed from: a */
    public final T[] f30716a;

    /* renamed from: n */
    public int f30717n;

    public C5805ja(@vr2 T[] tArr) {
        jt1.m53777p(tArr, "array");
        this.f30716a = tArr;
    }

    @vr2
    /* renamed from: a */
    public final T[] mo38507a() {
        return this.f30716a;
    }

    public boolean hasNext() {
        return this.f30717n < this.f30716a.length;
    }

    public T next() {
        try {
            T[] tArr = this.f30716a;
            int i = this.f30717n;
            this.f30717n = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f30717n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
