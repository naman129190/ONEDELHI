package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/na;", "Lcom/onedelhi/secure/y92;", "", "hasNext", "", "b", "", "array", "<init>", "([J)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.na */
public final class C6179na extends y92 {
    @vr2

    /* renamed from: a */
    public final long[] f32468a;

    /* renamed from: n */
    public int f32469n;

    public C6179na(@vr2 long[] jArr) {
        jt1.m53777p(jArr, "array");
        this.f32468a = jArr;
    }

    /* renamed from: b */
    public long mo17159b() {
        try {
            long[] jArr = this.f32468a;
            int i = this.f32469n;
            this.f32469n = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f32469n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f32469n < this.f32468a.length;
    }
}
