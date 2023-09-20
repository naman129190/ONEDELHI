package com.onedelhi.secure;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.C4370c;
import com.google.firebase.remoteconfig.internal.C4374d;
import com.google.firebase.remoteconfig.internal.C4377e;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class f50 {

    /* renamed from: a */
    public final Context f28167a;

    /* renamed from: a */
    public final C4370c f28168a;

    /* renamed from: a */
    public final C4374d f28169a;
    @mj1("this")

    /* renamed from: a */
    public final C4377e f28170a;

    /* renamed from: a */
    public final o41 f28171a;

    /* renamed from: a */
    public final u40 f28172a;

    /* renamed from: a */
    public final w31 f28173a;

    /* renamed from: a */
    public final String f28174a;
    @mj1("this")

    /* renamed from: a */
    public final Set<j50> f28175a;

    /* renamed from: a */
    public final ScheduledExecutorService f28176a;

    /* renamed from: com.onedelhi.secure.f50$a */
    public class C5213a implements k50 {

        /* renamed from: a */
        public final j50 f28178a;

        public C5213a(j50 j50) {
            this.f28178a = j50;
        }

        public void remove() {
            f50.this.mo35780d(this.f28178a);
        }
    }

    public f50(w31 w31, o41 o41, C4370c cVar, u40 u40, Context context, String str, C4374d dVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f28175a = linkedHashSet;
        this.f28170a = new C4377e(w31, o41, cVar, u40, context, str, linkedHashSet, dVar, scheduledExecutorService);
        this.f28173a = w31;
        this.f28168a = cVar;
        this.f28171a = o41;
        this.f28172a = u40;
        this.f28167a = context;
        this.f28174a = str;
        this.f28169a = dVar;
        this.f28176a = scheduledExecutorService;
    }

    @mr2
    /* renamed from: b */
    public synchronized k50 mo35778b(@mr2 j50 j50) {
        this.f28175a.add(j50);
        mo35779c();
        return new C5213a(j50);
    }

    /* renamed from: c */
    public final synchronized void mo35779c() {
        if (!this.f28175a.isEmpty()) {
            this.f28170a.mo30093D();
        }
    }

    /* renamed from: d */
    public final synchronized void mo35780d(j50 j50) {
        this.f28175a.remove(j50);
    }

    /* renamed from: e */
    public synchronized void mo35781e(boolean z) {
        this.f28170a.mo30090A(z);
        if (!z) {
            mo35779c();
        }
    }
}
