package com.onedelhi.secure;

import java.io.PrintStream;

public class vy1 {

    /* renamed from: com.onedelhi.secure.vy1$a */
    public interface C3817a {
        /* renamed from: a */
        int mo26384a(int i);
    }

    /* renamed from: com.onedelhi.secure.vy1$b */
    public interface C3818b {
        /* renamed from: a */
        int mo26385a(String str);
    }

    /* renamed from: a */
    public static void m30539a(String[] strArr) {
        m30541c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    /* renamed from: b */
    public static yj4 m30540b(String str, C3818b bVar, C3817a aVar) {
        PrintStream printStream;
        String str2;
        yj4 yj4 = new yj4();
        try {
            C3652tr d = C3736ur.m29530d(str);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                C3450rr rrVar = (C3450rr) d.mo22582C(i);
                String e = rrVar.mo23405e();
                C3336qr k0 = rrVar.mo24058k0();
                int a = bVar.mo26385a(e);
                if (a == -1) {
                    System.err.println("unknown type " + e);
                } else {
                    int a2 = aVar.mo26384a(a);
                    if (a2 != 1) {
                        if (a2 == 2) {
                            yj4.mo27512b(a, k0.mo23410k());
                            printStream = System.out;
                            str2 = "parse " + e + " INT_MASK > " + k0.mo23410k();
                        } else if (a2 == 4) {
                            yj4.mo27511a(a, k0.mo23409j());
                            printStream = System.out;
                            str2 = "parse " + e + " FLOAT_MASK > " + k0.mo23409j();
                        } else if (a2 == 8) {
                            yj4.mo27513c(a, k0.mo23405e());
                            printStream = System.out;
                            str2 = "parse " + e + " STRING_MASK > " + k0.mo23405e();
                        }
                        printStream.println(str2);
                    } else {
                        yj4.mo27514d(a, d.mo22602d(i));
                    }
                }
            }
        } catch (C3805vr e2) {
            e2.printStackTrace();
        }
        return yj4;
    }

    /* renamed from: c */
    public static yj4 m30541c(String str) {
        return m30540b(str, uy1.f36337a, ty1.f35838a);
    }
}
