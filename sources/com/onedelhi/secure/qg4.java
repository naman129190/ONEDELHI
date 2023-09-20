package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public class qg4 {

    /* renamed from: a */
    public final List<C3302a<?, ?>> f19161a = new ArrayList();

    /* renamed from: com.onedelhi.secure.qg4$a */
    public static final class C3302a<Z, R> {

        /* renamed from: a */
        public final xk3<Z, R> f19162a;

        /* renamed from: a */
        public final Class<Z> f19163a;

        /* renamed from: b */
        public final Class<R> f19164b;

        public C3302a(@mr2 Class<Z> cls, @mr2 Class<R> cls2, @mr2 xk3<Z, R> xk3) {
            this.f19163a = cls;
            this.f19164b = cls2;
            this.f19162a = xk3;
        }

        /* renamed from: a */
        public boolean mo23175a(@mr2 Class<?> cls, @mr2 Class<?> cls2) {
            return this.f19163a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f19164b);
        }
    }

    @mr2
    /* renamed from: a */
    public synchronized <Z, R> xk3<Z, R> mo23172a(@mr2 Class<Z> cls, @mr2 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return yn4.m32556b();
        }
        for (C3302a next : this.f19161a) {
            if (next.mo23175a(cls, cls2)) {
                return next.f19162a;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @mr2
    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo23173b(@mr2 Class<Z> cls, @mr2 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C3302a<?, ?> a : this.f19161a) {
            if (a.mo23175a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo23174c(@mr2 Class<Z> cls, @mr2 Class<R> cls2, @mr2 xk3<Z, R> xk3) {
        this.f19161a.add(new C3302a(cls, cls2, xk3));
    }
}
