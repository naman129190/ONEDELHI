package com.onedelhi.secure;

import com.onedelhi.secure.z24;
import java.util.Iterator;

public class at4 extends C3664tv {

    /* renamed from: com.onedelhi.secure.at4$a */
    public static /* synthetic */ class C1734a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9532a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.z24$b[] r0 = com.onedelhi.secure.z24.C4040b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9532a = r0
                com.onedelhi.secure.z24$b r1 = com.onedelhi.secure.z24.C4040b.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9532a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.z24$b r1 = com.onedelhi.secure.z24.C4040b.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9532a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.z24$b r1 = com.onedelhi.secure.z24.C4040b.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.at4.C1734a.<clinit>():void");
        }
    }

    public at4(z24 z24) {
        super(z24, z24.C4043e.VERTICAL_CHAIN);
    }

    public void apply() {
        n60 o;
        n60 C0;
        Iterator<Object> it = this.f14963a.iterator();
        while (it.hasNext()) {
            this.f14964b.mo27766e(it.next()).mo20947v();
        }
        Iterator<Object> it2 = this.f14963a.iterator();
        n60 n60 = null;
        n60 n602 = null;
        while (it2.hasNext()) {
            n60 e = this.f14964b.mo27766e(it2.next());
            if (n602 == null) {
                Object obj = this.f17153j;
                if (obj != null) {
                    C0 = e.mo20877D0(obj);
                } else {
                    Object obj2 = this.f17156k;
                    if (obj2 != null) {
                        C0 = e.mo20875C0(obj2);
                    } else {
                        e.mo20877D0(z24.f23382a);
                        n602 = e;
                    }
                }
                C0.mo15963b0(this.f17143g).mo20911d0(this.f17161m);
                n602 = e;
            }
            if (n60 != null) {
                n60.mo20935p(e.getKey());
                e.mo20875C0(n60.getKey());
            }
            n60 = e;
        }
        if (n60 != null) {
            Object obj3 = this.f17159l;
            if (obj3 != null) {
                o = n60.mo20935p(obj3);
            } else {
                Object obj4 = this.f17162m;
                if (obj4 != null) {
                    o = n60.mo20933o(obj4);
                } else {
                    n60.mo20933o(z24.f23382a);
                }
            }
            o.mo15963b0(this.f17146h).mo20911d0(this.f17164n);
        }
        if (n602 != null) {
            float f = this.f21142r;
            if (f != 0.5f) {
                n602.mo20887I0(f);
            }
            int i = C1734a.f9532a[this.f21141a.ordinal()];
            if (i == 1) {
                n602.mo20946u0(0);
            } else if (i == 2) {
                n602.mo20946u0(1);
            } else if (i == 3) {
                n602.mo20946u0(2);
            }
        }
    }
}
