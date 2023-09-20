package com.onedelhi.secure;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class nj3 {

    /* renamed from: a */
    public static final String f17470a = "RequestTracker";

    /* renamed from: a */
    public final List<si3> f17471a = new ArrayList();

    /* renamed from: a */
    public final Set<si3> f17472a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public boolean f17473a;

    @hw4
    /* renamed from: a */
    public void mo21337a(si3 si3) {
        this.f17472a.add(si3);
    }

    /* renamed from: b */
    public boolean mo21338b(@ts2 si3 si3) {
        boolean z = true;
        if (si3 == null) {
            return true;
        }
        boolean remove = this.f17472a.remove(si3);
        if (!this.f17471a.remove(si3) && !remove) {
            z = false;
        }
        if (z) {
            si3.clear();
        }
        return z;
    }

    /* renamed from: c */
    public void mo21339c() {
        for (T b : oq4.m24023k(this.f17472a)) {
            mo21338b(b);
        }
        this.f17471a.clear();
    }

    /* renamed from: d */
    public boolean mo21340d() {
        return this.f17473a;
    }

    /* renamed from: e */
    public void mo21341e() {
        this.f17473a = true;
        for (T t : oq4.m24023k(this.f17472a)) {
            if (t.isRunning() || t.mo19960h()) {
                t.clear();
                this.f17471a.add(t);
            }
        }
    }

    /* renamed from: f */
    public void mo21342f() {
        this.f17473a = true;
        for (T t : oq4.m24023k(this.f17472a)) {
            if (t.isRunning()) {
                t.mo19974u0();
                this.f17471a.add(t);
            }
        }
    }

    /* renamed from: g */
    public void mo21343g() {
        for (T t : oq4.m24023k(this.f17472a)) {
            if (!t.mo19960h() && !t.mo19964k()) {
                t.clear();
                if (!this.f17473a) {
                    t.mo19957d();
                } else {
                    this.f17471a.add(t);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo21344h() {
        this.f17473a = false;
        for (T t : oq4.m24023k(this.f17472a)) {
            if (!t.mo19960h() && !t.isRunning()) {
                t.mo19957d();
            }
        }
        this.f17471a.clear();
    }

    /* renamed from: i */
    public void mo21345i(@mr2 si3 si3) {
        this.f17472a.add(si3);
        if (!this.f17473a) {
            si3.mo19957d();
            return;
        }
        si3.clear();
        if (Log.isLoggable(f17470a, 2)) {
            Log.v(f17470a, "Paused, delaying request");
        }
        this.f17471a.add(si3);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f17472a.size() + ", isPaused=" + this.f17473a + "}";
    }
}
