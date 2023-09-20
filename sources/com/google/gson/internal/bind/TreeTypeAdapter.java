package com.google.gson.internal.bind;

import com.onedelhi.secure.C4453a;
import com.onedelhi.secure.bw1;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.cw1;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.m44;
import com.onedelhi.secure.mv1;
import com.onedelhi.secure.nv1;
import com.onedelhi.secure.ov1;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.tv1;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends cj4<T> {

    /* renamed from: a */
    public final TreeTypeAdapter<T>.b f25484a = new C4396b();

    /* renamed from: a */
    public volatile cj4<T> f25485a;

    /* renamed from: a */
    public final cw1<T> f25486a;

    /* renamed from: a */
    public final dj4 f25487a;

    /* renamed from: a */
    public final fj1 f25488a;

    /* renamed from: a */
    public final nv1<T> f25489a;

    /* renamed from: a */
    public final tj4<T> f25490a;

    public static final class SingleTypeFactory implements dj4 {

        /* renamed from: a */
        public final cw1<?> f25491a;

        /* renamed from: a */
        public final nv1<?> f25492a;

        /* renamed from: a */
        public final tj4<?> f25493a;

        /* renamed from: a */
        public final Class<?> f25494a;

        /* renamed from: b */
        public final boolean f25495b;

        public SingleTypeFactory(Object obj, tj4<?> tj4, boolean z, Class<?> cls) {
            nv1<?> nv1 = null;
            cw1<?> cw1 = obj instanceof cw1 ? (cw1) obj : null;
            this.f25491a = cw1;
            nv1 = obj instanceof nv1 ? (nv1) obj : nv1;
            this.f25492a = nv1;
            C4453a.m35636a((cw1 == null && nv1 == null) ? false : true);
            this.f25493a = tj4;
            this.f25495b = z;
            this.f25494a = cls;
        }

        /* renamed from: a */
        public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
            tj4<?> tj42 = this.f25493a;
            if (tj42 != null ? tj42.equals(tj4) || (this.f25495b && this.f25493a.getType() == tj4.getRawType()) : this.f25494a.isAssignableFrom(tj4.getRawType())) {
                return new TreeTypeAdapter(this.f25491a, this.f25492a, fj1, tj4, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$b */
    public final class C4396b implements bw1, mv1 {
        public C4396b() {
        }

        /* renamed from: a */
        public ov1 mo30167a(Object obj) {
            return TreeTypeAdapter.this.f25488a.mo36001G(obj);
        }

        /* renamed from: b */
        public ov1 mo30168b(Object obj, Type type) {
            return TreeTypeAdapter.this.f25488a.mo36002H(obj, type);
        }

        /* renamed from: c */
        public <R> R mo30169c(ov1 ov1, Type type) throws tv1 {
            return TreeTypeAdapter.this.f25488a.mo36008j(ov1, type);
        }
    }

    public TreeTypeAdapter(cw1<T> cw1, nv1<T> nv1, fj1 fj1, tj4<T> tj4, dj4 dj4) {
        this.f25486a = cw1;
        this.f25489a = nv1;
        this.f25488a = fj1;
        this.f25490a = tj4;
        this.f25487a = dj4;
    }

    /* renamed from: k */
    public static dj4 m35353k(tj4<?> tj4, Object obj) {
        return new SingleTypeFactory(obj, tj4, false, (Class<?>) null);
    }

    /* renamed from: l */
    public static dj4 m35354l(tj4<?> tj4, Object obj) {
        return new SingleTypeFactory(obj, tj4, tj4.getType() == tj4.getRawType(), (Class<?>) null);
    }

    /* renamed from: m */
    public static dj4 m35355m(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, (tj4<?>) null, false, cls);
    }

    /* renamed from: e */
    public T mo30144e(xv1 xv1) throws IOException {
        if (this.f25489a == null) {
            return mo30166j().mo30144e(xv1);
        }
        ov1 a = m44.m56909a(xv1);
        if (a.mo42282z()) {
            return null;
        }
        return this.f25489a.mo41493a(a, this.f25490a.getType(), this.f25484a);
    }

    /* renamed from: i */
    public void mo30145i(lw1 lw1, T t) throws IOException {
        cw1<T> cw1 = this.f25486a;
        if (cw1 == null) {
            mo30166j().mo30145i(lw1, t);
        } else if (t == null) {
            lw1.mo37582M();
        } else {
            m44.m56910b(cw1.mo33951a(t, this.f25490a.getType(), this.f25484a), lw1);
        }
    }

    /* renamed from: j */
    public final cj4<T> mo30166j() {
        cj4<T> cj4 = this.f25485a;
        if (cj4 != null) {
            return cj4;
        }
        cj4<T> r = this.f25488a.mo36016r(this.f25487a, this.f25490a);
        this.f25485a = r;
        return r;
    }
}
