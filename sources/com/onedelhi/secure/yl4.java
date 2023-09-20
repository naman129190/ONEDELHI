package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\"\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/yl4;", "", "Lcom/onedelhi/secure/tl4;", "", "hasNext", "a", "()J", "first", "last", "", "step", "<init>", "(JJJLcom/onedelhi/secure/wg0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class yl4 implements Iterator<tl4>, nx1 {

    /* renamed from: b */
    public final long f37995b;

    /* renamed from: b */
    public boolean f37996b;

    /* renamed from: c */
    public final long f37997c;

    /* renamed from: d */
    public long f37998d;

    public yl4(long j, long j2, long j3) {
        this.f37995b = j2;
        boolean z = true;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int g = mo4.m57481g(j, j2);
        if (i <= 0 ? g < 0 : g > 0) {
            z = false;
        }
        this.f37996b = z;
        this.f37997c = tl4.m66012s(j3);
        this.f37998d = !this.f37996b ? j2 : j;
    }

    public /* synthetic */ yl4(long j, long j2, long j3, wg0 wg0) {
        this(j, j2, j3);
    }

    /* renamed from: a */
    public long mo47852a() {
        long j = this.f37998d;
        if (j != this.f37995b) {
            this.f37998d = tl4.m66012s(this.f37997c + j);
        } else if (this.f37996b) {
            this.f37996b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public boolean hasNext() {
        return this.f37996b;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return tl4.m65991b(mo47852a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
