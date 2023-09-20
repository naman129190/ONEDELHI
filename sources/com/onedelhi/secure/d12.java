package com.onedelhi.secure;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/d12;", "R", "Lcom/onedelhi/secure/dd1;", "Ljava/io/Serializable;", "", "toString", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class d12<R> implements dd1<R>, Serializable {
    private final int arity;

    public d12(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    @vr2
    public String toString() {
        String x = ah3.m38701x(this);
        jt1.m53776o(x, "renderLambdaToString(this)");
        return x;
    }
}
