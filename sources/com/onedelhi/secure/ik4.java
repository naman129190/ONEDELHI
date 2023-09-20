package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.z91;
import com.onedelhi.secure.zk3;

public class ik4 {

    /* renamed from: a */
    public static final mb2<String, Typeface> f13724a = new mb2<>(16);

    /* renamed from: a */
    public static final ok4 f13725a;

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: com.onedelhi.secure.ik4$a */
    public static class C2449a extends aa1.C1676d {
        @ts2

        /* renamed from: a */
        public zk3.C4109g f13726a;

        public C2449a(@ts2 zk3.C4109g gVar) {
            this.f13726a = gVar;
        }

        /* renamed from: a */
        public void mo12881a(int i) {
            zk3.C4109g gVar = this.f13726a;
            if (gVar != null) {
                gVar.m33224f(i);
            }
        }

        /* renamed from: b */
        public void mo12882b(@mr2 Typeface typeface) {
            zk3.C4109g gVar = this.f13726a;
            if (gVar != null) {
                gVar.m33225g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f13725a = i >= 29 ? new nk4() : i >= 28 ? new mk4() : i >= 26 ? new lk4() : (i < 24 || !kk4.m19876m()) ? new jk4() : new kk4();
    }

    @hw4
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m17649a() {
        f13724a.mo20266d();
    }

    @mr2
    /* renamed from: b */
    public static Typeface m17650b(@mr2 Context context, @ts2 Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public static Typeface m17651c(@mr2 Context context, @ts2 CancellationSignal cancellationSignal, @mr2 aa1.C1675c[] cVarArr, int i) {
        return f13725a.mo18466c(context, cancellationSignal, cVarArr, i);
    }

    @ts2
    @Deprecated
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public static Typeface m17652d(@mr2 Context context, @mr2 z91.C4051b bVar, @mr2 Resources resources, int i, int i2, @ts2 zk3.C4109g gVar, @ts2 Handler handler, boolean z) {
        return m17653e(context, bVar, resources, i, (String) null, 0, i2, gVar, handler, z);
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: e */
    public static Typeface m17653e(@mr2 Context context, @mr2 z91.C4051b bVar, @mr2 Resources resources, int i, @ts2 String str, int i2, int i3, @ts2 zk3.C4109g gVar, @ts2 Handler handler, boolean z) {
        Typeface typeface;
        z91.C4051b bVar2 = bVar;
        zk3.C4109g gVar2 = gVar;
        Handler handler2 = handler;
        if (bVar2 instanceof z91.C4055f) {
            z91.C4055f fVar = (z91.C4055f) bVar2;
            Typeface l = m17660l(fVar.mo27852c());
            if (l != null) {
                if (gVar2 != null) {
                    gVar2.mo28033d(l, handler2);
                }
                return l;
            }
            typeface = aa1.m10956f(context, fVar.mo27851b(), i3, !z ? gVar2 == null : fVar.mo27850a() == 0, z ? fVar.mo27853d() : -1, zk3.C4109g.m33223e(handler), new C2449a(gVar2));
            Resources resources2 = resources;
            int i4 = i3;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f13725a.mo18465b(context, (z91.C4053d) bVar2, resources, i3);
            if (gVar2 != null) {
                if (typeface != null) {
                    gVar2.mo28033d(typeface, handler2);
                } else {
                    gVar2.mo28032c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f13724a.mo20272j(m17656h(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    @ts2
    @Deprecated
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public static Typeface m17654f(@mr2 Context context, @mr2 Resources resources, int i, String str, int i2) {
        return m17655g(context, resources, i, str, 0, i2);
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: g */
    public static Typeface m17655g(@mr2 Context context, @mr2 Resources resources, int i, String str, int i2, int i3) {
        Typeface e = f13725a.mo19657e(context, resources, i, str, i3);
        if (e != null) {
            f13724a.mo20272j(m17656h(resources, i, str, i2, i3), e);
        }
        return e;
    }

    /* renamed from: h */
    public static String m17656h(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @ts2
    @Deprecated
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: i */
    public static Typeface m17657i(@mr2 Resources resources, int i, int i2) {
        return m17658j(resources, i, (String) null, 0, i2);
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: j */
    public static Typeface m17658j(@mr2 Resources resources, int i, @ts2 String str, int i2, int i3) {
        return f13724a.mo20268f(m17656h(resources, i, str, i2, i3));
    }

    @ts2
    /* renamed from: k */
    public static Typeface m17659k(Context context, Typeface typeface, int i) {
        ok4 ok4 = f13725a;
        z91.C4053d i2 = ok4.mo21967i(typeface);
        if (i2 == null) {
            return null;
        }
        return ok4.mo18465b(context, i2, context.getResources(), i);
    }

    /* renamed from: l */
    public static Typeface m17660l(@ts2 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
