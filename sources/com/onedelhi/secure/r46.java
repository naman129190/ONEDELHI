package com.onedelhi.secure;

import android.util.Log;

public final class r46 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ a56 f19608a;

    /* renamed from: a */
    public final /* synthetic */ Object f19609a;

    /* renamed from: b */
    public final /* synthetic */ Object f19610b;

    /* renamed from: b */
    public final /* synthetic */ String f19611b;

    /* renamed from: c */
    public final /* synthetic */ Object f19612c;

    /* renamed from: n */
    public final /* synthetic */ int f19613n;

    public r46(a56 a56, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f19608a = a56;
        this.f19613n = i;
        this.f19611b = str;
        this.f19609a = obj;
        this.f19610b = obj2;
        this.f19612c = obj3;
    }

    public final void run() {
        char c;
        a56 a56;
        q76 F = this.f19608a.f11205a.mo27864F();
        if (F.mo17204n()) {
            a56 a562 = this.f19608a;
            if (a562.f8746a == 0) {
                if (a562.f11205a.mo27891z().mo14116H()) {
                    a56 = this.f19608a;
                    a56.f11205a.mo15134c();
                    c = 'C';
                } else {
                    a56 = this.f19608a;
                    a56.f11205a.mo15134c();
                    c = 'c';
                }
                a56.f8746a = c;
            }
            a56 a563 = this.f19608a;
            if (a563.f8747a < 0) {
                a563.f11205a.mo27891z().mo14124q();
                a563.f8747a = 76003;
            }
            char charAt = "01VDIWEA?".charAt(this.f19613n);
            a56 a564 = this.f19608a;
            String str = mx0.f16744n2 + charAt + a564.f8746a + a564.f8747a + ar4.f25981a + a56.m10795A(true, this.f19611b, this.f19609a, this.f19610b, this.f19612c);
            if (str.length() > 1024) {
                str = this.f19611b.substring(0, 1024);
            }
            k76 k76 = F.f18944a;
            if (k76 != null) {
                k76.mo18944b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f19608a.mo12722D(), "Persisted config not initialized. Not logging error/warn");
    }
}
