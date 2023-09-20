package com.onedelhi.secure;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/it0;", "", "", "", "hasNext", "hasPrevious", "", "nextIndex", "previousIndex", "b", "d", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class it0 implements ListIterator, nx1 {
    @vr2

    /* renamed from: a */
    public static final it0 f30457a = new it0();

    /* renamed from: a */
    public void mo38218a(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @vr2
    /* renamed from: b */
    public Void next() {
        throw new NoSuchElementException();
    }

    @vr2
    /* renamed from: d */
    public Void previous() {
        throw new NoSuchElementException();
    }

    /* renamed from: f */
    public void mo38222f(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
