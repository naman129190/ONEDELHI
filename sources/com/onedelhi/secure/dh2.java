package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class dh2 {

    /* renamed from: a */
    public final Runnable f10745a;

    /* renamed from: a */
    public final Map<kh2, C1975a> f10746a = new HashMap();

    /* renamed from: a */
    public final CopyOnWriteArrayList<kh2> f10747a = new CopyOnWriteArrayList<>();

    /* renamed from: com.onedelhi.secure.dh2$a */
    public static class C1975a {

        /* renamed from: a */
        public final C0690e f10748a;

        /* renamed from: a */
        public C0694f f10749a;

        public C1975a(@mr2 C0690e eVar, @mr2 C0694f fVar) {
            this.f10748a = eVar;
            this.f10749a = fVar;
            eVar.mo4958a(fVar);
        }

        /* renamed from: a */
        public void mo14666a() {
            this.f10748a.mo4960c(this.f10749a);
            this.f10749a = null;
        }
    }

    public dh2(@mr2 Runnable runnable) {
        this.f10745a = runnable;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m13114f(kh2 kh2, a32 a32, C0690e.C0692b bVar) {
        if (bVar == C0690e.C0692b.ON_DESTROY) {
            mo14665l(kh2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m13115g(C0690e.C0693c cVar, kh2 kh2, a32 a32, C0690e.C0692b bVar) {
        if (bVar == C0690e.C0692b.m4794l(cVar)) {
            mo14658c(kh2);
        } else if (bVar == C0690e.C0692b.ON_DESTROY) {
            mo14665l(kh2);
        } else if (bVar == C0690e.C0692b.m4791a(cVar)) {
            this.f10747a.remove(kh2);
            this.f10745a.run();
        }
    }

    /* renamed from: c */
    public void mo14658c(@mr2 kh2 kh2) {
        this.f10747a.add(kh2);
        this.f10745a.run();
    }

    /* renamed from: d */
    public void mo14659d(@mr2 kh2 kh2, @mr2 a32 a32) {
        mo14658c(kh2);
        C0690e lifecycle = a32.getLifecycle();
        C1975a remove = this.f10746a.remove(kh2);
        if (remove != null) {
            remove.mo14666a();
        }
        this.f10746a.put(kh2, new C1975a(lifecycle, new ch2(this, kh2)));
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public void mo14660e(@mr2 kh2 kh2, @mr2 a32 a32, @mr2 C0690e.C0693c cVar) {
        C0690e lifecycle = a32.getLifecycle();
        C1975a remove = this.f10746a.remove(kh2);
        if (remove != null) {
            remove.mo14666a();
        }
        this.f10746a.put(kh2, new C1975a(lifecycle, new bh2(this, cVar, kh2)));
    }

    /* renamed from: h */
    public void mo14661h(@mr2 Menu menu, @mr2 MenuInflater menuInflater) {
        Iterator<kh2> it = this.f10747a.iterator();
        while (it.hasNext()) {
            it.next().mo19067c(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void mo14662i(@mr2 Menu menu) {
        Iterator<kh2> it = this.f10747a.iterator();
        while (it.hasNext()) {
            it.next().mo19066b(menu);
        }
    }

    /* renamed from: j */
    public boolean mo14663j(@mr2 MenuItem menuItem) {
        Iterator<kh2> it = this.f10747a.iterator();
        while (it.hasNext()) {
            if (it.next().mo19068d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo14664k(@mr2 Menu menu) {
        Iterator<kh2> it = this.f10747a.iterator();
        while (it.hasNext()) {
            it.next().mo19065a(menu);
        }
    }

    /* renamed from: l */
    public void mo14665l(@mr2 kh2 kh2) {
        this.f10747a.remove(kh2);
        C1975a remove = this.f10746a.remove(kh2);
        if (remove != null) {
            remove.mo14666a();
        }
        this.f10745a.run();
    }
}
