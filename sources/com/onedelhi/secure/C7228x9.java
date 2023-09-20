package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/x9;", "Lcom/onedelhi/secure/on;", "", "hasNext", "b", "", "array", "<init>", "([Z)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.x9 */
public final class C7228x9 extends C6284on {
    @vr2

    /* renamed from: a */
    public final boolean[] f37371a;

    /* renamed from: n */
    public int f37372n;

    public C7228x9(@vr2 boolean[] zArr) {
        jt1.m53777p(zArr, "array");
        this.f37371a = zArr;
    }

    /* renamed from: b */
    public boolean mo20040b() {
        try {
            boolean[] zArr = this.f37371a;
            int i = this.f37372n;
            this.f37372n = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f37372n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f37372n < this.f37371a.length;
    }
}
