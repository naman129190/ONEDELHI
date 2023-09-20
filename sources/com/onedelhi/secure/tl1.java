package com.onedelhi.secure;

import com.onedelhi.secure.z24;
import java.util.Iterator;

public class tl1 extends C3664tv {

    /* renamed from: com.onedelhi.secure.tl1$a */
    public static /* synthetic */ class C3645a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20960a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.z24$b[] r0 = com.onedelhi.secure.z24.C4040b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20960a = r0
                com.onedelhi.secure.z24$b r1 = com.onedelhi.secure.z24.C4040b.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20960a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.z24$b r1 = com.onedelhi.secure.z24.C4040b.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20960a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.z24$b r1 = com.onedelhi.secure.z24.C4040b.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.tl1.C3645a.<clinit>():void");
        }
    }

    public tl1(z24 z24) {
        super(z24, z24.C4043e.HORIZONTAL_CHAIN);
    }

    public void apply() {
        n60 z;
        n60 b0;
        int i;
        n60 z2;
        n60 z0;
        n60 b02;
        int i2;
        n60 z02;
        Iterator<Object> it = this.f14963a.iterator();
        while (it.hasNext()) {
            this.f14964b.mo27766e(it.next()).mo20945u();
        }
        Iterator<Object> it2 = this.f14963a.iterator();
        n60 n60 = null;
        n60 n602 = null;
        while (it2.hasNext()) {
            n60 e = this.f14964b.mo27766e(it2.next());
            if (n602 == null) {
                Object obj = this.f17141f;
                if (obj != null) {
                    z02 = e.mo20871A0(obj);
                } else {
                    Object obj2 = this.f17144g;
                    if (obj2 != null) {
                        z02 = e.mo20956z0(obj2);
                    } else {
                        Object obj3 = this.f17128b;
                        if (obj3 != null) {
                            z0 = e.mo20871A0(obj3);
                        } else {
                            Object obj4 = this.f17132c;
                            if (obj4 != null) {
                                z0 = e.mo20956z0(obj4);
                            } else {
                                e.mo20871A0(z24.f23382a);
                                n602 = e;
                            }
                        }
                        b02 = z0.mo15963b0(this.f17131c);
                        i2 = this.f17149i;
                        b02.mo20911d0(i2);
                        n602 = e;
                    }
                }
                b02 = z02.mo15963b0(this.f17137e);
                i2 = this.f17155k;
                b02.mo20911d0(i2);
                n602 = e;
            }
            if (n60 != null) {
                n60.mo20870A(e.getKey());
                e.mo20956z0(n60.getKey());
            }
            n60 = e;
        }
        if (n60 != null) {
            Object obj5 = this.f17147h;
            if (obj5 != null) {
                z2 = n60.mo20870A(obj5);
            } else {
                Object obj6 = this.f17150i;
                if (obj6 != null) {
                    z2 = n60.mo20955z(obj6);
                } else {
                    Object obj7 = this.f17135d;
                    if (obj7 != null) {
                        z = n60.mo20870A(obj7);
                    } else {
                        Object obj8 = this.f17138e;
                        if (obj8 != null) {
                            z = n60.mo20955z(obj8);
                        } else {
                            n60.mo20955z(z24.f23382a);
                        }
                    }
                    b0 = z.mo15963b0(this.f17134d);
                    i = this.f17152j;
                    b0.mo20911d0(i);
                }
            }
            b0 = z2.mo15963b0(this.f17140f);
            i = this.f17158l;
            b0.mo20911d0(i);
        }
        if (n602 != null) {
            float f = this.f21142r;
            if (f != 0.5f) {
                n602.mo20904X(f);
            }
            int i3 = C3645a.f20960a[this.f21141a.ordinal()];
            if (i3 == 1) {
                n602.mo20940r0(0);
            } else if (i3 == 2) {
                n602.mo20940r0(1);
            } else if (i3 == 3) {
                n602.mo20940r0(2);
            }
        }
    }
}
