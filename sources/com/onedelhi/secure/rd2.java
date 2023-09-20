package com.onedelhi.secure;

import android.view.View;
import com.onedelhi.secure.th1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class rd2 implements th1.C3617k, th1.C3623q, th1.C3624r, th1.C3608b {

    /* renamed from: a */
    public final th1 f34580a;

    /* renamed from: a */
    public final Map<String, C6670a> f34581a = new HashMap();

    /* renamed from: b */
    public final Map<od2, C6670a> f34582b = new HashMap();

    /* renamed from: com.onedelhi.secure.rd2$a */
    public class C6670a {

        /* renamed from: a */
        public th1.C3608b f34584a;

        /* renamed from: a */
        public th1.C3617k f34585a;

        /* renamed from: a */
        public th1.C3623q f34586a;

        /* renamed from: a */
        public th1.C3624r f34587a;

        /* renamed from: a */
        public final Set<od2> f34588a = new HashSet();

        public C6670a() {
        }

        /* renamed from: e */
        public od2 mo43856e(sd2 sd2) {
            od2 c = rd2.this.f34580a.mo24962c(sd2);
            this.f34588a.add(c);
            rd2.this.f34582b.put(c, this);
            return c;
        }

        /* renamed from: f */
        public void mo43857f() {
            for (od2 next : this.f34588a) {
                next.mo21885n();
                rd2.this.f34582b.remove(next);
            }
            this.f34588a.clear();
        }

        /* renamed from: g */
        public Collection<od2> mo43858g() {
            return Collections.unmodifiableCollection(this.f34588a);
        }

        /* renamed from: h */
        public boolean mo43859h(od2 od2) {
            if (!this.f34588a.remove(od2)) {
                return false;
            }
            rd2.this.f34582b.remove(od2);
            od2.mo21885n();
            return true;
        }

        /* renamed from: i */
        public void mo43860i(th1.C3608b bVar) {
            this.f34584a = bVar;
        }

        /* renamed from: j */
        public void mo43861j(th1.C3617k kVar) {
            this.f34585a = kVar;
        }

        /* renamed from: k */
        public void mo43862k(th1.C3623q qVar) {
            this.f34586a = qVar;
        }

        /* renamed from: l */
        public void mo43863l(th1.C3624r rVar) {
            this.f34587a = rVar;
        }
    }

    public rd2(th1 th1) {
        this.f34580a = th1;
    }

    /* renamed from: a */
    public void mo25005a(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        if (aVar != null && aVar.f34585a != null) {
            aVar.f34585a.mo25005a(od2);
        }
    }

    /* renamed from: b */
    public View mo7564b(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        if (aVar == null || aVar.f34584a == null) {
            return null;
        }
        return aVar.f34584a.mo7564b(od2);
    }

    /* renamed from: c */
    public void mo25012c(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        if (aVar != null && aVar.f34587a != null) {
            aVar.f34587a.mo25012c(od2);
        }
    }

    /* renamed from: d */
    public void mo25013d(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        if (aVar != null && aVar.f34587a != null) {
            aVar.f34587a.mo25013d(od2);
        }
    }

    /* renamed from: e */
    public void mo25014e(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        if (aVar != null && aVar.f34587a != null) {
            aVar.f34587a.mo25014e(od2);
        }
    }

    /* renamed from: f */
    public View mo7565f(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        if (aVar == null || aVar.f34584a == null) {
            return null;
        }
        return aVar.f34584a.mo7565f(od2);
    }

    /* renamed from: g */
    public boolean mo25011g(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        if (aVar == null || aVar.f34586a == null) {
            return false;
        }
        return aVar.f34586a.mo25011g(od2);
    }

    /* renamed from: j */
    public C6670a mo43852j(String str) {
        return this.f34581a.get(str);
    }

    /* renamed from: k */
    public C6670a mo43853k() {
        return new C6670a();
    }

    /* renamed from: l */
    public C6670a mo43854l(String str) {
        if (this.f34581a.get(str) == null) {
            C6670a aVar = new C6670a();
            this.f34581a.put(str, aVar);
            return aVar;
        }
        throw new IllegalArgumentException("collection id is not unique: " + str);
    }

    /* renamed from: m */
    public boolean mo43855m(od2 od2) {
        C6670a aVar = this.f34582b.get(od2);
        return aVar != null && aVar.mo43859h(od2);
    }
}
