package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/ww;", "Lcom/onedelhi/secure/uw;", "", "hasNext", "", "b", "", "step", "I", "d", "()I", "first", "last", "<init>", "(CCI)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.ww */
public final class C7191ww extends C6980uw {

    /* renamed from: b */
    public boolean f37148b;

    /* renamed from: n */
    public final int f37149n;

    /* renamed from: o */
    public final int f37150o;

    /* renamed from: p */
    public int f37151p;

    public C7191ww(char c, char c2, int i) {
        this.f37149n = i;
        this.f37150o = c2;
        boolean z = true;
        if (i <= 0 ? jt1.m53781t(c, c2) < 0 : jt1.m53781t(c, c2) > 0) {
            z = false;
        }
        this.f37148b = z;
        this.f37151p = !z ? c2 : c;
    }

    /* renamed from: b */
    public char mo32266b() {
        int i = this.f37151p;
        if (i != this.f37150o) {
            this.f37151p = this.f37149n + i;
        } else if (this.f37148b) {
            this.f37148b = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    /* renamed from: d */
    public final int mo46900d() {
        return this.f37149n;
    }

    public boolean hasNext() {
        return this.f37148b;
    }
}
