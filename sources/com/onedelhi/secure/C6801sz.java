package com.onedelhi.secure;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import com.onedelhi.secure.C6723rz;
import com.onedelhi.secure.rd2;
import com.onedelhi.secure.th1;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.onedelhi.secure.sz */
public class C6801sz<T extends C6723rz> implements th1.C3610d, th1.C3623q, th1.C3617k {

    /* renamed from: a */
    public CameraPosition f35245a;

    /* renamed from: a */
    public C6088m4<T> f35246a;

    /* renamed from: a */
    public final rd2.C6670a f35247a;

    /* renamed from: a */
    public final rd2 f35248a;

    /* renamed from: a */
    public C6801sz<T>.b f35249a;

    /* renamed from: a */
    public C6804c<T> f35250a;

    /* renamed from: a */
    public C6805d<T> f35251a;

    /* renamed from: a */
    public C6806e<T> f35252a;

    /* renamed from: a */
    public C6807f<T> f35253a;

    /* renamed from: a */
    public th1 f35254a;

    /* renamed from: a */
    public C6909tz<T> f35255a;

    /* renamed from: a */
    public final ReadWriteLock f35256a;

    /* renamed from: b */
    public final rd2.C6670a f35257b;

    /* renamed from: b */
    public final ReadWriteLock f35258b;

    /* renamed from: com.onedelhi.secure.sz$b */
    public class C6803b extends AsyncTask<Float, Void, Set<? extends C6622qz<T>>> {
        public C6803b() {
        }

        /* renamed from: a */
        public Set<? extends C6622qz<T>> doInBackground(Float... fArr) {
            C6801sz.this.f35256a.readLock().lock();
            try {
                return C6801sz.this.f35246a.mo39423f((double) fArr[0].floatValue());
            } finally {
                C6801sz.this.f35256a.readLock().unlock();
            }
        }

        /* renamed from: b */
        public void onPostExecute(Set<? extends C6622qz<T>> set) {
            C6801sz.this.f35255a.mo44997d(set);
        }
    }

    /* renamed from: com.onedelhi.secure.sz$c */
    public interface C6804c<T extends C6723rz> {
        /* renamed from: a */
        boolean mo44647a(C6622qz<T> qzVar);
    }

    /* renamed from: com.onedelhi.secure.sz$d */
    public interface C6805d<T extends C6723rz> {
        /* renamed from: a */
        void mo44648a(C6622qz<T> qzVar);
    }

    /* renamed from: com.onedelhi.secure.sz$e */
    public interface C6806e<T extends C6723rz> {
        /* renamed from: a */
        boolean mo44649a(T t);
    }

    /* renamed from: com.onedelhi.secure.sz$f */
    public interface C6807f<T extends C6723rz> {
        /* renamed from: a */
        void mo44650a(T t);
    }

    public C6801sz(Context context, th1 th1) {
        this(context, th1, new rd2(th1));
    }

    public C6801sz(Context context, th1 th1, rd2 rd2) {
        this.f35256a = new ReentrantReadWriteLock();
        this.f35258b = new ReentrantReadWriteLock();
        this.f35254a = th1;
        this.f35248a = rd2;
        this.f35257b = rd2.mo43853k();
        this.f35247a = rd2.mo43853k();
        this.f35255a = new tg0(context, th1, this);
        this.f35246a = new y33(new kr2());
        this.f35249a = new C6803b();
        this.f35255a.mo44994a();
    }

    /* renamed from: a */
    public void mo25005a(od2 od2) {
        mo44634n().mo25005a(od2);
    }

    /* renamed from: b */
    public void mo24997b() {
        C6909tz<T> tzVar = this.f35255a;
        if (tzVar instanceof th1.C3610d) {
            ((th1.C3610d) tzVar).mo24997b();
        }
        CameraPosition k = this.f35254a.mo24978k();
        CameraPosition cameraPosition = this.f35245a;
        if (cameraPosition == null || cameraPosition.f7554a != k.f7554a) {
            this.f35245a = this.f35254a.mo24978k();
            mo44630j();
        }
    }

    /* renamed from: f */
    public void mo44627f(T t) {
        this.f35256a.writeLock().lock();
        try {
            this.f35246a.mo39420c(t);
        } finally {
            this.f35256a.writeLock().unlock();
        }
    }

    /* renamed from: g */
    public boolean mo25011g(od2 od2) {
        return mo44634n().mo25011g(od2);
    }

    /* renamed from: h */
    public void mo44628h(Collection<T> collection) {
        this.f35256a.writeLock().lock();
        try {
            this.f35246a.mo39424g(collection);
        } finally {
            this.f35256a.writeLock().unlock();
        }
    }

    /* renamed from: i */
    public void mo44629i() {
        this.f35256a.writeLock().lock();
        try {
            this.f35246a.mo39422e();
        } finally {
            this.f35256a.writeLock().unlock();
        }
    }

    /* renamed from: j */
    public void mo44630j() {
        this.f35258b.writeLock().lock();
        try {
            this.f35249a.cancel(true);
            C6801sz<T>.b bVar = new C6803b();
            this.f35249a = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Float[]{Float.valueOf(this.f35254a.mo24978k().f7554a)});
        } finally {
            this.f35258b.writeLock().unlock();
        }
    }

    /* renamed from: k */
    public C6088m4<T> mo44631k() {
        return this.f35246a;
    }

    /* renamed from: l */
    public rd2.C6670a mo44632l() {
        return this.f35257b;
    }

    /* renamed from: m */
    public rd2.C6670a mo44633m() {
        return this.f35247a;
    }

    /* renamed from: n */
    public rd2 mo44634n() {
        return this.f35248a;
    }

    /* renamed from: o */
    public C6909tz<T> mo44635o() {
        return this.f35255a;
    }

    /* renamed from: p */
    public void mo44636p(T t) {
        this.f35256a.writeLock().lock();
        try {
            this.f35246a.mo39421d(t);
        } finally {
            this.f35256a.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: q */
    public void mo44637q(C6088m4<T> m4Var) {
        this.f35256a.writeLock().lock();
        try {
            C6088m4<T> m4Var2 = this.f35246a;
            if (m4Var2 != null) {
                m4Var.mo39424g(m4Var2.mo39419b());
            }
            this.f35246a = new y33(m4Var);
            this.f35256a.writeLock().unlock();
            mo44630j();
        } catch (Throwable th) {
            this.f35256a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: r */
    public void mo44638r(C6804c<T> cVar) {
        this.f35250a = cVar;
        this.f35255a.mo44998e(cVar);
    }

    /* renamed from: s */
    public void mo44639s(C6805d<T> dVar) {
        this.f35251a = dVar;
        this.f35255a.mo44996c(dVar);
    }

    /* renamed from: t */
    public void mo44640t(C6806e<T> eVar) {
        this.f35252a = eVar;
        this.f35255a.mo44995b(eVar);
    }

    /* renamed from: u */
    public void mo44641u(C6807f<T> fVar) {
        this.f35253a = fVar;
        this.f35255a.mo44999f(fVar);
    }

    /* renamed from: v */
    public void mo44642v(C6909tz<T> tzVar) {
        this.f35255a.mo44998e((C6804c) null);
        this.f35255a.mo44995b((C6806e) null);
        this.f35257b.mo43857f();
        this.f35247a.mo43857f();
        this.f35255a.mo45000g();
        this.f35255a = tzVar;
        tzVar.mo44994a();
        this.f35255a.mo44998e(this.f35250a);
        this.f35255a.mo44996c(this.f35251a);
        this.f35255a.mo44995b(this.f35252a);
        this.f35255a.mo44999f(this.f35253a);
        mo44630j();
    }
}
