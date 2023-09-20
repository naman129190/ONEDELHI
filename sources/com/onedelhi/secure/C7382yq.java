package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0005\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/yq;", "", "", "a", "()Ljava/lang/Byte;", "g", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.yq */
public abstract class C7382yq implements Iterator<Byte>, nx1 {
    @vr2
    /* renamed from: a */
    public final Byte mo47916a() {
        return Byte.valueOf(mo34612g());
    }

    /* renamed from: g */
    public abstract byte mo34612g();

    public /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(mo34612g());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
