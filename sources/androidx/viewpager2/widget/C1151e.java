package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.onedelhi.secure.C4045z6;
import com.onedelhi.secure.mr2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
public final class C1151e extends RecyclerView.C0827t {

    /* renamed from: e */
    public static final int f5984e = 0;

    /* renamed from: f */
    public static final int f5985f = 1;

    /* renamed from: g */
    public static final int f5986g = 2;

    /* renamed from: h */
    public static final int f5987h = 3;

    /* renamed from: i */
    public static final int f5988i = 4;

    /* renamed from: j */
    public static final int f5989j = -1;

    /* renamed from: a */
    public int f5990a;
    @mr2

    /* renamed from: a */
    public final LinearLayoutManager f5991a;
    @mr2

    /* renamed from: a */
    public final RecyclerView f5992a;

    /* renamed from: a */
    public ViewPager2.C1134j f5993a;
    @mr2

    /* renamed from: a */
    public final ViewPager2 f5994a;

    /* renamed from: a */
    public C1152a f5995a = new C1152a();

    /* renamed from: a */
    public boolean f5996a;

    /* renamed from: b */
    public int f5997b;

    /* renamed from: b */
    public boolean f5998b;

    /* renamed from: c */
    public int f5999c;

    /* renamed from: c */
    public boolean f6000c;

    /* renamed from: d */
    public int f6001d;

    /* renamed from: d */
    public boolean f6002d;

    /* renamed from: androidx.viewpager2.widget.e$a */
    public static final class C1152a {

        /* renamed from: a */
        public float f6003a;

        /* renamed from: a */
        public int f6004a;

        /* renamed from: b */
        public int f6005b;

        /* renamed from: a */
        public void mo7355a() {
            this.f6004a = -1;
            this.f6003a = 0.0f;
            this.f6005b = 0;
        }
    }

    public C1151e(@mr2 ViewPager2 viewPager2) {
        this.f5994a = viewPager2;
        RecyclerView recyclerView = viewPager2.f5943a;
        this.f5992a = recyclerView;
        this.f5991a = (LinearLayoutManager) recyclerView.getLayoutManager();
        mo7351q();
    }

    /* renamed from: a */
    public void mo5915a(@mr2 RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f5990a == 1 && this.f5997b == 1) && i == 1) {
            mo7353s(false);
        } else if (!mo7346l() || i != 2) {
            if (mo7346l() && i == 0) {
                mo7354t();
                if (!this.f5998b) {
                    int i2 = this.f5995a.f6004a;
                    if (i2 != -1) {
                        mo7337c(i2, 0.0f, 0);
                    }
                } else {
                    C1152a aVar = this.f5995a;
                    if (aVar.f6005b == 0) {
                        int i3 = this.f5999c;
                        int i4 = aVar.f6004a;
                        if (i3 != i4) {
                            mo7338d(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    mo7339e(0);
                    mo7351q();
                }
            }
            if (this.f5990a == 2 && i == 0 && this.f6000c) {
                mo7354t();
                C1152a aVar2 = this.f5995a;
                if (aVar2.f6005b == 0) {
                    int i5 = this.f6001d;
                    int i6 = aVar2.f6004a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        mo7338d(i6);
                    }
                    mo7339e(0);
                    mo7351q();
                }
            }
        } else if (this.f5998b) {
            mo7339e(2);
            this.f5996a = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r3.f5999c != r5) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f5994a.mo7265k()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5916b(@com.onedelhi.secure.mr2 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5998b = r4
            r3.mo7354t()
            boolean r0 = r3.f5996a
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            r3.f5996a = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f5994a
            boolean r6 = r6.mo7265k()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.e$a r5 = r3.f5995a
            int r6 = r5.f6005b
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f6004a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.e$a r5 = r3.f5995a
            int r5 = r5.f6004a
        L_0x0033:
            r3.f6001d = r5
            int r6 = r3.f5999c
            if (r6 == r5) goto L_0x0048
            goto L_0x0045
        L_0x003a:
            int r5 = r3.f5990a
            if (r5 != 0) goto L_0x0048
            androidx.viewpager2.widget.e$a r5 = r3.f5995a
            int r5 = r5.f6004a
            if (r5 != r1) goto L_0x0045
            r5 = 0
        L_0x0045:
            r3.mo7338d(r5)
        L_0x0048:
            androidx.viewpager2.widget.e$a r5 = r3.f5995a
            int r6 = r5.f6004a
            if (r6 != r1) goto L_0x004f
            r6 = 0
        L_0x004f:
            float r0 = r5.f6003a
            int r5 = r5.f6005b
            r3.mo7337c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f5995a
            int r6 = r5.f6004a
            int r0 = r3.f6001d
            if (r6 == r0) goto L_0x0060
            if (r0 != r1) goto L_0x006e
        L_0x0060:
            int r5 = r5.f6005b
            if (r5 != 0) goto L_0x006e
            int r5 = r3.f5997b
            if (r5 == r4) goto L_0x006e
            r3.mo7339e(r2)
            r3.mo7351q()
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1151e.mo5916b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: c */
    public final void mo7337c(int i, float f, int i2) {
        ViewPager2.C1134j jVar = this.f5993a;
        if (jVar != null) {
            jVar.mo7313b(i, f, i2);
        }
    }

    /* renamed from: d */
    public final void mo7338d(int i) {
        ViewPager2.C1134j jVar = this.f5993a;
        if (jVar != null) {
            jVar.mo7241c(i);
        }
    }

    /* renamed from: e */
    public final void mo7339e(int i) {
        if ((this.f5990a != 3 || this.f5997b != 0) && this.f5997b != i) {
            this.f5997b = i;
            ViewPager2.C1134j jVar = this.f5993a;
            if (jVar != null) {
                jVar.mo7240a(i);
            }
        }
    }

    /* renamed from: f */
    public final int mo7340f() {
        return this.f5991a.mo5328x2();
    }

    /* renamed from: g */
    public double mo7341g() {
        mo7354t();
        C1152a aVar = this.f5995a;
        return ((double) aVar.f6004a) + ((double) aVar.f6003a);
    }

    /* renamed from: h */
    public int mo7342h() {
        return this.f5997b;
    }

    /* renamed from: i */
    public boolean mo7343i() {
        return this.f5997b == 1;
    }

    /* renamed from: j */
    public boolean mo7344j() {
        return this.f6002d;
    }

    /* renamed from: k */
    public boolean mo7345k() {
        return this.f5997b == 0;
    }

    /* renamed from: l */
    public final boolean mo7346l() {
        int i = this.f5990a;
        return i == 1 || i == 4;
    }

    /* renamed from: m */
    public void mo7347m() {
        this.f5990a = 4;
        mo7353s(true);
    }

    /* renamed from: n */
    public void mo7348n() {
        this.f6000c = true;
    }

    /* renamed from: o */
    public void mo7349o() {
        if (!mo7343i() || this.f6002d) {
            this.f6002d = false;
            mo7354t();
            C1152a aVar = this.f5995a;
            if (aVar.f6005b == 0) {
                int i = aVar.f6004a;
                if (i != this.f5999c) {
                    mo7338d(i);
                }
                mo7339e(0);
                mo7351q();
                return;
            }
            mo7339e(2);
        }
    }

    /* renamed from: p */
    public void mo7350p(int i, boolean z) {
        this.f5990a = z ? 2 : 3;
        boolean z2 = false;
        this.f6002d = false;
        if (this.f6001d != i) {
            z2 = true;
        }
        this.f6001d = i;
        mo7339e(2);
        if (z2) {
            mo7338d(i);
        }
    }

    /* renamed from: q */
    public final void mo7351q() {
        this.f5990a = 0;
        this.f5997b = 0;
        this.f5995a.mo7355a();
        this.f5999c = -1;
        this.f6001d = -1;
        this.f5996a = false;
        this.f5998b = false;
        this.f6002d = false;
        this.f6000c = false;
    }

    /* renamed from: r */
    public void mo7352r(ViewPager2.C1134j jVar) {
        this.f5993a = jVar;
    }

    /* renamed from: s */
    public final void mo7353s(boolean z) {
        this.f6002d = z;
        this.f5990a = z ? 4 : 1;
        int i = this.f6001d;
        if (i != -1) {
            this.f5999c = i;
            this.f6001d = -1;
        } else if (this.f5999c == -1) {
            this.f5999c = mo7340f();
        }
        mo7339e(1);
    }

    /* renamed from: t */
    public final void mo7354t() {
        int i;
        C1152a aVar = this.f5995a;
        int x2 = this.f5991a.mo5328x2();
        aVar.f6004a = x2;
        if (x2 == -1) {
            aVar.mo7355a();
            return;
        }
        View J = this.f5991a.mo5266J(x2);
        if (J == null) {
            aVar.mo7355a();
            return;
        }
        int j0 = this.f5991a.mo5878j0(J);
        int u0 = this.f5991a.mo5895u0(J);
        int x0 = this.f5991a.mo5899x0(J);
        int O = this.f5991a.mo5822O(J);
        ViewGroup.LayoutParams layoutParams = J.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            j0 += marginLayoutParams.leftMargin;
            u0 += marginLayoutParams.rightMargin;
            x0 += marginLayoutParams.topMargin;
            O += marginLayoutParams.bottomMargin;
        }
        int height = J.getHeight() + x0 + O;
        int width = J.getWidth() + j0 + u0;
        if (this.f5991a.mo5270M2() == 0) {
            i = (J.getLeft() - j0) - this.f5992a.getPaddingLeft();
            if (this.f5994a.mo7265k()) {
                i = -i;
            }
            height = width;
        } else {
            i = (J.getTop() - x0) - this.f5992a.getPaddingTop();
        }
        int i2 = -i;
        aVar.f6005b = i2;
        if (i2 >= 0) {
            aVar.f6003a = height == 0 ? 0.0f : ((float) i2) / ((float) height);
        } else if (new C4045z6(this.f5991a).mo27810d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f6005b)}));
        }
    }
}
