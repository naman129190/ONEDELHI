package com.onedelhi.secure;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/ga;", "Lcom/onedelhi/secure/y71;", "", "hasNext", "", "b", "", "array", "<init>", "([F)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.ga */
public final class C5396ga extends y71 {
    @vr2

    /* renamed from: a */
    public final float[] f29096a;

    /* renamed from: n */
    public int f29097n;

    public C5396ga(@vr2 float[] fArr) {
        jt1.m53777p(fArr, "array");
        this.f29096a = fArr;
    }

    /* renamed from: b */
    public float mo36585b() {
        try {
            float[] fArr = this.f29096a;
            int i = this.f29097n;
            this.f29097n = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f29097n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f29097n < this.f29096a.length;
    }
}
