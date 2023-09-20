package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/ca;", "Lcom/onedelhi/secure/uw;", "", "hasNext", "", "b", "", "array", "<init>", "([C)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.ca */
public final class C4743ca extends C6980uw {
    @vr2

    /* renamed from: a */
    public final char[] f26697a;

    /* renamed from: n */
    public int f26698n;

    public C4743ca(@vr2 char[] cArr) {
        jt1.m53777p(cArr, "array");
        this.f26697a = cArr;
    }

    /* renamed from: b */
    public char mo32266b() {
        try {
            char[] cArr = this.f26697a;
            int i = this.f26698n;
            this.f26698n = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f26698n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f26698n < this.f26697a.length;
    }
}
