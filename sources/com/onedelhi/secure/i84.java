package com.onedelhi.secure;

import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0010J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/i84;", "Lcom/onedelhi/secure/e80;", "Lcom/onedelhi/secure/dd1;", "", "Lcom/onedelhi/secure/g84;", "", "toString", "", "arity", "I", "getArity", "()I", "Lcom/onedelhi/secure/b80;", "completion", "<init>", "(ILcom/onedelhi/secure/b80;)V", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class i84 extends e80 implements dd1<Object>, g84 {

    /* renamed from: n */
    public final int f30102n;

    public i84(int i) {
        this(i, (b80<Object>) null);
    }

    public i84(int i, @ss2 b80<Object> b80) {
        super(b80);
        this.f30102n = i;
    }

    public int getArity() {
        return this.f30102n;
    }

    @vr2
    public String toString() {
        if (mo38113C() != null) {
            return super.toString();
        }
        String w = ah3.m38700w(this);
        jt1.m53776o(w, "renderLambdaToString(this)");
        return w;
    }
}
