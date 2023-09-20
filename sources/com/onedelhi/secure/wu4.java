package com.onedelhi.secure;

import android.view.View;
import android.view.animation.Interpolator;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.Iterator;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class wu4 {

    /* renamed from: a */
    public long f22298a = -1;

    /* renamed from: a */
    public Interpolator f22299a;

    /* renamed from: a */
    public xu4 f22300a;

    /* renamed from: a */
    public final yu4 f22301a = new C3875a();

    /* renamed from: a */
    public final ArrayList<vu4> f22302a = new ArrayList<>();

    /* renamed from: a */
    public boolean f22303a;

    /* renamed from: com.onedelhi.secure.wu4$a */
    public class C3875a extends yu4 {

        /* renamed from: a */
        public int f22304a = 0;

        /* renamed from: a */
        public boolean f22306a = false;

        public C3875a() {
        }

        /* renamed from: a */
        public void mo1068a(View view) {
            int i = this.f22304a + 1;
            this.f22304a = i;
            if (i == wu4.this.f22302a.size()) {
                xu4 xu4 = wu4.this.f22300a;
                if (xu4 != null) {
                    xu4.mo1068a((View) null);
                }
                mo26698d();
            }
        }

        /* renamed from: b */
        public void mo1069b(View view) {
            if (!this.f22306a) {
                this.f22306a = true;
                xu4 xu4 = wu4.this.f22300a;
                if (xu4 != null) {
                    xu4.mo1069b((View) null);
                }
            }
        }

        /* renamed from: d */
        public void mo26698d() {
            this.f22304a = 0;
            this.f22306a = false;
            wu4.this.mo26691b();
        }
    }

    /* renamed from: a */
    public void mo26690a() {
        if (this.f22303a) {
            Iterator<vu4> it = this.f22302a.iterator();
            while (it.hasNext()) {
                it.next().mo26356d();
            }
            this.f22303a = false;
        }
    }

    /* renamed from: b */
    public void mo26691b() {
        this.f22303a = false;
    }

    /* renamed from: c */
    public wu4 mo26692c(vu4 vu4) {
        if (!this.f22303a) {
            this.f22302a.add(vu4);
        }
        return this;
    }

    /* renamed from: d */
    public wu4 mo26693d(vu4 vu4, vu4 vu42) {
        this.f22302a.add(vu4);
        vu42.mo26374w(vu4.mo26357e());
        this.f22302a.add(vu42);
        return this;
    }

    /* renamed from: e */
    public wu4 mo26694e(long j) {
        if (!this.f22303a) {
            this.f22298a = j;
        }
        return this;
    }

    /* renamed from: f */
    public wu4 mo26695f(Interpolator interpolator) {
        if (!this.f22303a) {
            this.f22299a = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public wu4 mo26696g(xu4 xu4) {
        if (!this.f22303a) {
            this.f22300a = xu4;
        }
        return this;
    }

    /* renamed from: h */
    public void mo26697h() {
        if (!this.f22303a) {
            Iterator<vu4> it = this.f22302a.iterator();
            while (it.hasNext()) {
                vu4 next = it.next();
                long j = this.f22298a;
                if (j >= 0) {
                    next.mo26370s(j);
                }
                Interpolator interpolator = this.f22299a;
                if (interpolator != null) {
                    next.mo26371t(interpolator);
                }
                if (this.f22300a != null) {
                    next.mo26372u(this.f22301a);
                }
                next.mo26376y();
            }
            this.f22303a = true;
        }
    }
}
