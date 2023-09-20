package com.onedelhi.secure;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J \u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/pm3;", "T", "Lcom/onedelhi/secure/b1;", "", "index", "get", "(I)Ljava/lang/Object;", "Lcom/onedelhi/secure/un4;", "clear", "f", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "b", "()I", "size", "", "delegate", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class pm3<T> extends C4607b1<T> {
    @vr2

    /* renamed from: a */
    public final List<T> f33739a;

    public pm3(@vr2 List<T> list) {
        jt1.m53777p(list, "delegate");
        this.f33739a = list;
    }

    public void add(int i, T t) {
        this.f33739a.add(y00.m71009Z0(this, i), t);
    }

    /* renamed from: b */
    public int mo31300b() {
        return this.f33739a.size();
    }

    public void clear() {
        this.f33739a.clear();
    }

    /* renamed from: f */
    public T mo31301f(int i) {
        return this.f33739a.remove(y00.m71008Y0(this, i));
    }

    public T get(int i) {
        return this.f33739a.get(y00.m71008Y0(this, i));
    }

    public T set(int i, T t) {
        return this.f33739a.set(y00.m71008Y0(this, i), t);
    }
}
