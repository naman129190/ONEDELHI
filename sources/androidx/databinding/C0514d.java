package androidx.databinding;

import androidx.databinding.C0512c;
import androidx.databinding.C0523i;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n33;

/* renamed from: androidx.databinding.d */
public class C0514d extends C0512c<C0523i.C0524a, C0523i, C0516b> {

    /* renamed from: a */
    public static final n33.C2924c<C0516b> f3429a = new n33.C2924c<>(10);

    /* renamed from: b */
    public static final C0512c.C0513a<C0523i.C0524a, C0523i, C0516b> f3430b = new C0515a();

    /* renamed from: o */
    public static final int f3431o = 0;

    /* renamed from: p */
    public static final int f3432p = 1;

    /* renamed from: q */
    public static final int f3433q = 2;

    /* renamed from: r */
    public static final int f3434r = 3;

    /* renamed from: s */
    public static final int f3435s = 4;

    /* renamed from: androidx.databinding.d$a */
    public static class C0515a extends C0512c.C0513a<C0523i.C0524a, C0523i, C0516b> {
        /* renamed from: b */
        public void mo3938a(C0523i.C0524a aVar, C0523i iVar, int i, C0516b bVar) {
            if (i == 1) {
                aVar.mo3954f(iVar, bVar.f3436a, bVar.f3437b);
            } else if (i == 2) {
                aVar.mo3955g(iVar, bVar.f3436a, bVar.f3437b);
            } else if (i == 3) {
                aVar.mo3956h(iVar, bVar.f3436a, bVar.f3438c, bVar.f3437b);
            } else if (i != 4) {
                aVar.mo3953b(iVar);
            } else {
                aVar.mo3957i(iVar, bVar.f3436a, bVar.f3437b);
            }
        }
    }

    /* renamed from: androidx.databinding.d$b */
    public static class C0516b {

        /* renamed from: a */
        public int f3436a;

        /* renamed from: b */
        public int f3437b;

        /* renamed from: c */
        public int f3438c;
    }

    public C0514d() {
        super(f3430b);
    }

    /* renamed from: p */
    public static C0516b m3940p(int i, int i2, int i3) {
        C0516b b = f3429a.mo20818b();
        if (b == null) {
            b = new C0516b();
        }
        b.f3436a = i;
        b.f3438c = i2;
        b.f3437b = i3;
        return b;
    }

    /* renamed from: q */
    public synchronized void mo3982h(@mr2 C0523i iVar, int i, C0516b bVar) {
        super.mo3982h(iVar, i, bVar);
        if (bVar != null) {
            f3429a.mo20817a(bVar);
        }
    }

    /* renamed from: r */
    public void mo3991r(@mr2 C0523i iVar) {
        mo3982h(iVar, 0, (C0516b) null);
    }

    /* renamed from: s */
    public void mo3992s(@mr2 C0523i iVar, int i, int i2) {
        mo3982h(iVar, 1, m3940p(i, 0, i2));
    }

    /* renamed from: t */
    public void mo3993t(@mr2 C0523i iVar, int i, int i2) {
        mo3982h(iVar, 2, m3940p(i, 0, i2));
    }

    /* renamed from: u */
    public void mo3994u(@mr2 C0523i iVar, int i, int i2, int i3) {
        mo3982h(iVar, 3, m3940p(i, i2, i3));
    }

    /* renamed from: v */
    public void mo3995v(@mr2 C0523i iVar, int i, int i2) {
        mo3982h(iVar, 4, m3940p(i, 0, i2));
    }
}
