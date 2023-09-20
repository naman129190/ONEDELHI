package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.e */
public class C0872e {

    /* renamed from: a */
    public static final String f4864a = "ChildrenHelper";

    /* renamed from: a */
    public static final boolean f4865a = false;

    /* renamed from: a */
    public final C0873a f4866a = new C0873a();

    /* renamed from: a */
    public final C0874b f4867a;

    /* renamed from: a */
    public final List<View> f4868a = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    public static class C0873a {

        /* renamed from: a */
        public static final int f4869a = 64;

        /* renamed from: b */
        public static final long f4870b = Long.MIN_VALUE;

        /* renamed from: a */
        public long f4871a = 0;

        /* renamed from: a */
        public C0873a f4872a;

        /* renamed from: a */
        public void mo6221a(int i) {
            if (i >= 64) {
                C0873a aVar = this.f4872a;
                if (aVar != null) {
                    aVar.mo6221a(i - 64);
                    return;
                }
                return;
            }
            this.f4871a &= ~(1 << i);
        }

        /* renamed from: b */
        public int mo6222b(int i) {
            C0873a aVar = this.f4872a;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f4871a) : Long.bitCount(this.f4871a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f4871a & ((1 << i) - 1)) : aVar.mo6222b(i - 64) + Long.bitCount(this.f4871a);
        }

        /* renamed from: c */
        public final void mo6223c() {
            if (this.f4872a == null) {
                this.f4872a = new C0873a();
            }
        }

        /* renamed from: d */
        public boolean mo6224d(int i) {
            if (i < 64) {
                return (this.f4871a & (1 << i)) != 0;
            }
            mo6223c();
            return this.f4872a.mo6224d(i - 64);
        }

        /* renamed from: e */
        public void mo6225e(int i, boolean z) {
            if (i >= 64) {
                mo6223c();
                this.f4872a.mo6225e(i - 64, z);
                return;
            }
            long j = this.f4871a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f4871a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo6228h(i);
            } else {
                mo6221a(i);
            }
            if (z2 || this.f4872a != null) {
                mo6223c();
                this.f4872a.mo6225e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean mo6226f(int i) {
            if (i >= 64) {
                mo6223c();
                return this.f4872a.mo6226f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4871a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f4871a = j3;
            long j4 = j - 1;
            this.f4871a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C0873a aVar = this.f4872a;
            if (aVar != null) {
                if (aVar.mo6224d(0)) {
                    mo6228h(63);
                }
                this.f4872a.mo6226f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void mo6227g() {
            this.f4871a = 0;
            C0873a aVar = this.f4872a;
            if (aVar != null) {
                aVar.mo6227g();
            }
        }

        /* renamed from: h */
        public void mo6228h(int i) {
            if (i >= 64) {
                mo6223c();
                this.f4872a.mo6228h(i - 64);
                return;
            }
            this.f4871a |= 1 << i;
        }

        public String toString() {
            if (this.f4872a == null) {
                return Long.toBinaryString(this.f4871a);
            }
            return this.f4872a.toString() + "xx" + Long.toBinaryString(this.f4871a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public interface C0874b {
        /* renamed from: a */
        View mo5627a(int i);

        /* renamed from: b */
        int mo5628b();

        /* renamed from: c */
        int mo5629c(View view);

        /* renamed from: d */
        void mo5630d(int i);

        /* renamed from: e */
        void mo5631e(View view);

        /* renamed from: f */
        void mo5632f(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: g */
        void mo5633g();

        /* renamed from: h */
        void mo5634h(View view, int i);

        /* renamed from: i */
        void mo5635i(int i);

        /* renamed from: j */
        void mo5636j(View view);

        /* renamed from: k */
        RecyclerView.C0803f0 mo5637k(View view);
    }

    public C0872e(C0874b bVar) {
        this.f4867a = bVar;
    }

    /* renamed from: a */
    public void mo6200a(View view, int i, boolean z) {
        int b = i < 0 ? this.f4867a.mo5628b() : mo6207h(i);
        this.f4866a.mo6225e(b, z);
        if (z) {
            mo6211l(view);
        }
        this.f4867a.mo5634h(view, b);
    }

    /* renamed from: b */
    public void mo6201b(View view, boolean z) {
        mo6200a(view, -1, z);
    }

    /* renamed from: c */
    public void mo6202c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b = i < 0 ? this.f4867a.mo5628b() : mo6207h(i);
        this.f4866a.mo6225e(b, z);
        if (z) {
            mo6211l(view);
        }
        this.f4867a.mo5632f(view, b, layoutParams);
    }

    /* renamed from: d */
    public void mo6203d(int i) {
        int h = mo6207h(i);
        this.f4866a.mo6226f(h);
        this.f4867a.mo5630d(h);
    }

    /* renamed from: e */
    public View mo6204e(int i) {
        int size = this.f4868a.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4868a.get(i2);
            RecyclerView.C0803f0 k = this.f4867a.mo5637k(view);
            if (k.mo5686p() == i && !k.mo5695x() && !k.mo5697z()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View mo6205f(int i) {
        return this.f4867a.mo5627a(mo6207h(i));
    }

    /* renamed from: g */
    public int mo6206g() {
        return this.f4867a.mo5628b() - this.f4868a.size();
    }

    /* renamed from: h */
    public final int mo6207h(int i) {
        if (i < 0) {
            return -1;
        }
        int b = this.f4867a.mo5628b();
        int i2 = i;
        while (i2 < b) {
            int b2 = i - (i2 - this.f4866a.mo6222b(i2));
            if (b2 == 0) {
                while (this.f4866a.mo6224d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    /* renamed from: i */
    public View mo6208i(int i) {
        return this.f4867a.mo5627a(i);
    }

    /* renamed from: j */
    public int mo6209j() {
        return this.f4867a.mo5628b();
    }

    /* renamed from: k */
    public void mo6210k(View view) {
        int c = this.f4867a.mo5629c(view);
        if (c >= 0) {
            this.f4866a.mo6228h(c);
            mo6211l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: l */
    public final void mo6211l(View view) {
        this.f4868a.add(view);
        this.f4867a.mo5636j(view);
    }

    /* renamed from: m */
    public int mo6212m(View view) {
        int c = this.f4867a.mo5629c(view);
        if (c != -1 && !this.f4866a.mo6224d(c)) {
            return c - this.f4866a.mo6222b(c);
        }
        return -1;
    }

    /* renamed from: n */
    public boolean mo6213n(View view) {
        return this.f4868a.contains(view);
    }

    /* renamed from: o */
    public void mo6214o() {
        this.f4866a.mo6227g();
        for (int size = this.f4868a.size() - 1; size >= 0; size--) {
            this.f4867a.mo5631e(this.f4868a.get(size));
            this.f4868a.remove(size);
        }
        this.f4867a.mo5633g();
    }

    /* renamed from: p */
    public void mo6215p(View view) {
        int c = this.f4867a.mo5629c(view);
        if (c >= 0) {
            if (this.f4866a.mo6226f(c)) {
                mo6219t(view);
            }
            this.f4867a.mo5635i(c);
        }
    }

    /* renamed from: q */
    public void mo6216q(int i) {
        int h = mo6207h(i);
        View a = this.f4867a.mo5627a(h);
        if (a != null) {
            if (this.f4866a.mo6226f(h)) {
                mo6219t(a);
            }
            this.f4867a.mo5635i(h);
        }
    }

    /* renamed from: r */
    public boolean mo6217r(View view) {
        int c = this.f4867a.mo5629c(view);
        if (c == -1) {
            mo6219t(view);
            return true;
        } else if (!this.f4866a.mo6224d(c)) {
            return false;
        } else {
            this.f4866a.mo6226f(c);
            mo6219t(view);
            this.f4867a.mo5635i(c);
            return true;
        }
    }

    /* renamed from: s */
    public void mo6218s(View view) {
        int c = this.f4867a.mo5629c(view);
        if (c < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4866a.mo6224d(c)) {
            this.f4866a.mo6221a(c);
            mo6219t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: t */
    public final boolean mo6219t(View view) {
        if (!this.f4868a.remove(view)) {
            return false;
        }
        this.f4867a.mo5631e(view);
        return true;
    }

    public String toString() {
        return this.f4866a.toString() + ", hidden list:" + this.f4868a.size();
    }
}
