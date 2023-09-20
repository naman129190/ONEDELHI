package com.onedelhi.secure;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/qm3;", "T", "Lcom/onedelhi/secure/t0;", "", "index", "get", "(I)Ljava/lang/Object;", "b", "()I", "size", "", "delegate", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class qm3<T> extends C6809t0<T> {
    @vr2

    /* renamed from: a */
    public final List<T> f34315a;

    public qm3(@vr2 List<? extends T> list) {
        jt1.m53777p(list, "delegate");
        this.f34315a = list;
    }

    /* renamed from: b */
    public int mo34341b() {
        return this.f34315a.size();
    }

    public T get(int i) {
        return this.f34315a.get(y00.m71008Y0(this, i));
    }
}
