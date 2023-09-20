package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public class oh2 implements pz2, ti1 {

    /* renamed from: a */
    public final Path f17959a = new Path();

    /* renamed from: a */
    public final nh2 f17960a;

    /* renamed from: a */
    public final String f17961a;

    /* renamed from: a */
    public final List<pz2> f17962a = new ArrayList();

    /* renamed from: b */
    public final Path f17963b = new Path();

    /* renamed from: c */
    public final Path f17964c = new Path();

    /* renamed from: com.onedelhi.secure.oh2$a */
    public static /* synthetic */ class C3061a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17965a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.nh2$a[] r0 = com.onedelhi.secure.nh2.C2980a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17965a = r0
                com.onedelhi.secure.nh2$a r1 = com.onedelhi.secure.nh2.C2980a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17965a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.nh2$a r1 = com.onedelhi.secure.nh2.C2980a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17965a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.nh2$a r1 = com.onedelhi.secure.nh2.C2980a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17965a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.nh2$a r1 = com.onedelhi.secure.nh2.C2980a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17965a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.nh2$a r1 = com.onedelhi.secure.nh2.C2980a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oh2.C3061a.<clinit>():void");
        }
    }

    public oh2(nh2 nh2) {
        this.f17961a = nh2.mo21271c();
        this.f17960a = nh2;
    }

    /* renamed from: a */
    public final void mo21926a() {
        for (int i = 0; i < this.f17962a.size(); i++) {
            this.f17964c.addPath(this.f17962a.get(i).mo17060e());
        }
    }

    @TargetApi(19)
    /* renamed from: c */
    public final void mo21927c(Path.Op op) {
        this.f17963b.reset();
        this.f17959a.reset();
        for (int size = this.f17962a.size() - 1; size >= 1; size--) {
            pz2 pz2 = this.f17962a.get(size);
            if (pz2 instanceof z60) {
                z60 z60 = (z60) pz2;
                List<pz2> j = z60.mo27813j();
                for (int size2 = j.size() - 1; size2 >= 0; size2--) {
                    Path e = j.get(size2).mo17060e();
                    e.transform(z60.mo27814k());
                    this.f17963b.addPath(e);
                }
            } else {
                this.f17963b.addPath(pz2.mo17060e());
            }
        }
        pz2 pz22 = this.f17962a.get(0);
        if (pz22 instanceof z60) {
            z60 z602 = (z60) pz22;
            List<pz2> j2 = z602.mo27813j();
            for (int i = 0; i < j2.size(); i++) {
                Path e2 = j2.get(i).mo17060e();
                e2.transform(z602.mo27814k());
                this.f17959a.addPath(e2);
            }
        } else {
            this.f17959a.set(pz22.mo17060e());
        }
        this.f17964c.op(this.f17959a, this.f17963b, op);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20419d(java.util.ListIterator<com.onedelhi.secure.y60> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            com.onedelhi.secure.y60 r0 = (com.onedelhi.secure.y60) r0
            boolean r1 = r0 instanceof com.onedelhi.secure.pz2
            if (r1 == 0) goto L_0x000d
            java.util.List<com.onedelhi.secure.pz2> r1 = r2.f17962a
            com.onedelhi.secure.pz2 r0 = (com.onedelhi.secure.pz2) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oh2.mo20419d(java.util.ListIterator):void");
    }

    /* renamed from: e */
    public Path mo17060e() {
        Path.Op op;
        this.f17964c.reset();
        if (this.f17960a.mo21272d()) {
            return this.f17964c;
        }
        int i = C3061a.f17965a[this.f17960a.mo21270b().ordinal()];
        if (i != 1) {
            if (i == 2) {
                op = Path.Op.UNION;
            } else if (i == 3) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (i == 4) {
                op = Path.Op.INTERSECT;
            } else if (i == 5) {
                op = Path.Op.XOR;
            }
            mo21927c(op);
        } else {
            mo21926a();
        }
        return this.f17964c;
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        for (int i = 0; i < this.f17962a.size(); i++) {
            this.f17962a.get(i).mo14994g(list, list2);
        }
    }

    public String getName() {
        return this.f17961a;
    }
}
