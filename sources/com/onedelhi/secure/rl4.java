package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\"\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/rl4;", "", "Lcom/onedelhi/secure/il4;", "", "hasNext", "a", "()I", "first", "last", "", "step", "<init>", "(IIILcom/onedelhi/secure/wg0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class rl4 implements Iterator<il4>, nx1 {

    /* renamed from: b */
    public boolean f34678b;

    /* renamed from: n */
    public final int f34679n;

    /* renamed from: o */
    public final int f34680o;

    /* renamed from: p */
    public int f34681p;

    public rl4(int i, int i2, int i3) {
        this.f34679n = i2;
        boolean z = true;
        int c = mo4.m57477c(i, i2);
        if (i3 <= 0 ? c < 0 : c > 0) {
            z = false;
        }
        this.f34678b = z;
        this.f34680o = il4.m52435s(i3);
        this.f34681p = !this.f34678b ? i2 : i;
    }

    public /* synthetic */ rl4(int i, int i2, int i3, wg0 wg0) {
        this(i, i2, i3);
    }

    /* renamed from: a */
    public int mo43942a() {
        int i = this.f34681p;
        if (i != this.f34679n) {
            this.f34681p = il4.m52435s(this.f34680o + i);
        } else if (this.f34678b) {
            this.f34678b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f34678b;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return il4.m52414b(mo43942a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
