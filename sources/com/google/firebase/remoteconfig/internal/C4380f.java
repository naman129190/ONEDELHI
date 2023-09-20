package com.google.firebase.remoteconfig.internal;

import com.onedelhi.secure.r61;
import com.onedelhi.secure.t61;

/* renamed from: com.google.firebase.remoteconfig.internal.f */
public class C4380f implements r61 {

    /* renamed from: a */
    public final int f25424a;

    /* renamed from: a */
    public final long f25425a;

    /* renamed from: a */
    public final t61 f25426a;

    /* renamed from: com.google.firebase.remoteconfig.internal.f$b */
    public static class C4382b {

        /* renamed from: a */
        public int f25427a;

        /* renamed from: a */
        public long f25428a;

        /* renamed from: a */
        public t61 f25429a;

        public C4382b() {
        }

        /* renamed from: a */
        public C4380f mo30122a() {
            return new C4380f(this.f25428a, this.f25427a, this.f25429a);
        }

        /* renamed from: b */
        public C4382b mo30123b(t61 t61) {
            this.f25429a = t61;
            return this;
        }

        /* renamed from: c */
        public C4382b mo30124c(int i) {
            this.f25427a = i;
            return this;
        }

        /* renamed from: d */
        public C4382b mo30125d(long j) {
            this.f25428a = j;
            return this;
        }
    }

    public C4380f(long j, int i, t61 t61) {
        this.f25425a = j;
        this.f25424a = i;
        this.f25426a = t61;
    }

    /* renamed from: d */
    public static C4382b m35276d() {
        return new C4382b();
    }

    /* renamed from: a */
    public int mo30119a() {
        return this.f25424a;
    }

    /* renamed from: b */
    public t61 mo30120b() {
        return this.f25426a;
    }

    /* renamed from: c */
    public long mo30121c() {
        return this.f25425a;
    }
}
