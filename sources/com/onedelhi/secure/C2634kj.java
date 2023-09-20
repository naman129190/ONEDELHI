package com.onedelhi.secure;

import com.onedelhi.secure.k33;
import java.util.Queue;

/* renamed from: com.onedelhi.secure.kj */
public abstract class C2634kj<T extends k33> {

    /* renamed from: a */
    public static final int f14908a = 20;

    /* renamed from: a */
    public final Queue<T> f14909a = oq4.m24018f(20);

    /* renamed from: a */
    public abstract T mo14607a();

    /* renamed from: b */
    public T mo19085b() {
        T t = (k33) this.f14909a.poll();
        return t == null ? mo14607a() : t;
    }

    /* renamed from: c */
    public void mo19086c(T t) {
        if (this.f14909a.size() < 20) {
            this.f14909a.offer(t);
        }
    }
}
