package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\n\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/ey3;", "", "", "a", "()Ljava/lang/Short;", "b", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class ey3 implements Iterator<Short>, nx1 {
    @vr2
    /* renamed from: a */
    public final Short mo35673a() {
        return Short.valueOf(mo35674b());
    }

    /* renamed from: b */
    public abstract short mo35674b();

    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(mo35674b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
