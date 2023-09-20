package com.onedelhi.secure;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class j62 {

    /* renamed from: com.onedelhi.secure.j62$a */
    public interface C2476a<D> {
        @bc2
        @mr2
        /* renamed from: a */
        i62<D> mo17156a(int i, @ts2 Bundle bundle);

        @bc2
        /* renamed from: b */
        void mo17157b(@mr2 i62<D> i62);

        @bc2
        /* renamed from: c */
        void mo17158c(@mr2 i62<D> i62, D d);
    }

    /* renamed from: c */
    public static void m18172c(boolean z) {
        k62.f14752a = z;
    }

    @mr2
    /* renamed from: d */
    public static <T extends a32 & hu4> j62 m18173d(@mr2 T t) {
        return new k62(t, ((hu4) t).getViewModelStore());
    }

    @bc2
    /* renamed from: a */
    public abstract void mo18147a(int i);

    @Deprecated
    /* renamed from: b */
    public abstract void mo18148b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @ts2
    /* renamed from: e */
    public abstract <D> i62<D> mo18149e(int i);

    /* renamed from: f */
    public boolean mo18150f() {
        return false;
    }

    @bc2
    @mr2
    /* renamed from: g */
    public abstract <D> i62<D> mo18151g(int i, @ts2 Bundle bundle, @mr2 C2476a<D> aVar);

    /* renamed from: h */
    public abstract void mo18152h();

    @bc2
    @mr2
    /* renamed from: i */
    public abstract <D> i62<D> mo18153i(int i, @ts2 Bundle bundle, @mr2 C2476a<D> aVar);
}
