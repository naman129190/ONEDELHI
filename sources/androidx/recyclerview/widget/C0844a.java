package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0940s;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.n33;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
public final class C0844a implements C0940s.C0941a {

    /* renamed from: a */
    public static final String f4768a = "AHT";

    /* renamed from: b */
    public static final int f4769b = 0;

    /* renamed from: b */
    public static final boolean f4770b = false;

    /* renamed from: c */
    public static final int f4771c = 1;

    /* renamed from: a */
    public int f4772a;

    /* renamed from: a */
    public final C0845a f4773a;

    /* renamed from: a */
    public final C0940s f4774a;

    /* renamed from: a */
    public n33.C2922a<C0846b> f4775a;

    /* renamed from: a */
    public Runnable f4776a;

    /* renamed from: a */
    public final ArrayList<C0846b> f4777a;

    /* renamed from: a */
    public final boolean f4778a;

    /* renamed from: b */
    public final ArrayList<C0846b> f4779b;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface C0845a {
        /* renamed from: a */
        void mo5645a(int i, int i2);

        /* renamed from: b */
        void mo5646b(int i, int i2);

        /* renamed from: c */
        void mo5647c(int i, int i2);

        /* renamed from: d */
        void mo5648d(int i, int i2, Object obj);

        /* renamed from: e */
        void mo5649e(C0846b bVar);

        /* renamed from: f */
        RecyclerView.C0803f0 mo5650f(int i);

        /* renamed from: g */
        void mo5651g(C0846b bVar);

        /* renamed from: h */
        void mo5652h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class C0846b {

        /* renamed from: d */
        public static final int f4780d = 1;

        /* renamed from: e */
        public static final int f4781e = 2;

        /* renamed from: f */
        public static final int f4782f = 4;

        /* renamed from: g */
        public static final int f4783g = 8;

        /* renamed from: h */
        public static final int f4784h = 30;

        /* renamed from: a */
        public int f4785a;

        /* renamed from: a */
        public Object f4786a;

        /* renamed from: b */
        public int f4787b;

        /* renamed from: c */
        public int f4788c;

        public C0846b(int i, int i2, int i3, Object obj) {
            this.f4785a = i;
            this.f4787b = i2;
            this.f4788c = i3;
            this.f4786a = obj;
        }

        /* renamed from: a */
        public String mo6142a() {
            int i = this.f4785a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0846b)) {
                return false;
            }
            C0846b bVar = (C0846b) obj;
            int i = this.f4785a;
            if (i != bVar.f4785a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4788c - this.f4787b) == 1 && this.f4788c == bVar.f4787b && this.f4787b == bVar.f4788c) {
                return true;
            }
            if (this.f4788c != bVar.f4788c || this.f4787b != bVar.f4787b) {
                return false;
            }
            Object obj2 = this.f4786a;
            Object obj3 = bVar.f4786a;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4785a * 31) + this.f4787b) * 31) + this.f4788c;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo6142a() + ",s:" + this.f4787b + "c:" + this.f4788c + ",p:" + this.f4786a + "]";
        }
    }

    public C0844a(C0845a aVar) {
        this(aVar, false);
    }

    public C0844a(C0845a aVar, boolean z) {
        this.f4775a = new n33.C2923b(30);
        this.f4777a = new ArrayList<>();
        this.f4779b = new ArrayList<>();
        this.f4772a = 0;
        this.f4773a = aVar;
        this.f4778a = z;
        this.f4774a = new C0940s(this);
    }

    /* renamed from: A */
    public final int mo6115A(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f4779b.size() - 1; size >= 0; size--) {
            C0846b bVar = this.f4779b.get(size);
            int i9 = bVar.f4785a;
            if (i9 == 8) {
                int i10 = bVar.f4787b;
                int i11 = bVar.f4788c;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f4787b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f4787b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f4788c = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f4788c = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f4787b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f4787b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f4787b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f4788c;
                } else if (i9 == 2) {
                    i += bVar.f4788c;
                }
            }
        }
        for (int size2 = this.f4779b.size() - 1; size2 >= 0; size2--) {
            C0846b bVar2 = this.f4779b.get(size2);
            if (bVar2.f4785a == 8) {
                int i13 = bVar2.f4788c;
                if (i13 != bVar2.f4787b && i13 >= 0) {
                }
            } else if (bVar2.f4788c > 0) {
            }
            this.f4779b.remove(size2);
            mo6117b(bVar2);
        }
        return i;
    }

    /* renamed from: a */
    public C0846b mo6116a(int i, int i2, int i3, Object obj) {
        C0846b b = this.f4775a.mo20818b();
        if (b == null) {
            return new C0846b(i, i2, i3, obj);
        }
        b.f4785a = i;
        b.f4787b = i2;
        b.f4788c = i3;
        b.f4786a = obj;
        return b;
    }

    /* renamed from: b */
    public void mo6117b(C0846b bVar) {
        if (!this.f4778a) {
            bVar.f4786a = null;
            this.f4775a.mo20817a(bVar);
        }
    }

    /* renamed from: c */
    public C0844a mo6118c(C0846b... bVarArr) {
        Collections.addAll(this.f4777a, bVarArr);
        return this;
    }

    /* renamed from: d */
    public final void mo6119d(C0846b bVar) {
        mo6138w(bVar);
    }

    /* renamed from: e */
    public final void mo6120e(C0846b bVar) {
        mo6138w(bVar);
    }

    /* renamed from: f */
    public int mo6121f(int i) {
        int size = this.f4777a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0846b bVar = this.f4777a.get(i2);
            int i3 = bVar.f4785a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f4787b;
                    if (i4 <= i) {
                        int i5 = bVar.f4788c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f4787b;
                    if (i6 == i) {
                        i = bVar.f4788c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f4788c <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f4787b <= i) {
                i += bVar.f4788c;
            }
        }
        return i;
    }

    /* renamed from: g */
    public final void mo6122g(C0846b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f4787b;
        int i2 = bVar.f4788c + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f4773a.mo5650f(i3) != null || mo6124i(i3)) {
                if (c2 == 0) {
                    mo6127l(mo6116a(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    mo6138w(mo6116a(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f4788c) {
            mo6117b(bVar);
            bVar = mo6116a(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            mo6127l(bVar);
        } else {
            mo6138w(bVar);
        }
    }

    /* renamed from: h */
    public final void mo6123h(C0846b bVar) {
        int i = bVar.f4787b;
        int i2 = bVar.f4788c + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f4773a.mo5650f(i) != null || mo6124i(i)) {
                if (c == 0) {
                    mo6127l(mo6116a(4, i3, i4, bVar.f4786a));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    mo6138w(mo6116a(4, i3, i4, bVar.f4786a));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f4788c) {
            Object obj = bVar.f4786a;
            mo6117b(bVar);
            bVar = mo6116a(4, i3, i4, obj);
        }
        if (c == 0) {
            mo6127l(bVar);
        } else {
            mo6138w(bVar);
        }
    }

    /* renamed from: i */
    public final boolean mo6124i(int i) {
        int size = this.f4779b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0846b bVar = this.f4779b.get(i2);
            int i3 = bVar.f4785a;
            if (i3 == 8) {
                if (mo6130o(bVar.f4788c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f4787b;
                int i5 = bVar.f4788c + i4;
                while (i4 < i5) {
                    if (mo6130o(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo6125j() {
        int size = this.f4779b.size();
        for (int i = 0; i < size; i++) {
            this.f4773a.mo5649e(this.f4779b.get(i));
        }
        mo6140y(this.f4779b);
        this.f4772a = 0;
    }

    /* renamed from: k */
    public void mo6126k() {
        mo6125j();
        int size = this.f4777a.size();
        for (int i = 0; i < size; i++) {
            C0846b bVar = this.f4777a.get(i);
            int i2 = bVar.f4785a;
            if (i2 == 1) {
                this.f4773a.mo5649e(bVar);
                this.f4773a.mo5646b(bVar.f4787b, bVar.f4788c);
            } else if (i2 == 2) {
                this.f4773a.mo5649e(bVar);
                this.f4773a.mo5647c(bVar.f4787b, bVar.f4788c);
            } else if (i2 == 4) {
                this.f4773a.mo5649e(bVar);
                this.f4773a.mo5648d(bVar.f4787b, bVar.f4788c, bVar.f4786a);
            } else if (i2 == 8) {
                this.f4773a.mo5649e(bVar);
                this.f4773a.mo5652h(bVar.f4787b, bVar.f4788c);
            }
            Runnable runnable = this.f4776a;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo6140y(this.f4777a);
        this.f4772a = 0;
    }

    /* renamed from: l */
    public final void mo6127l(C0846b bVar) {
        int i;
        int i2 = bVar.f4785a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A = mo6115A(bVar.f4787b, i2);
        int i3 = bVar.f4787b;
        int i4 = bVar.f4785a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f4788c; i6++) {
            int A2 = mo6115A(bVar.f4787b + (i * i6), bVar.f4785a);
            int i7 = bVar.f4785a;
            if (i7 == 2 ? A2 == A : i7 == 4 && A2 == A + 1) {
                i5++;
            } else {
                C0846b a = mo6116a(i7, A, i5, bVar.f4786a);
                mo6128m(a, i3);
                mo6117b(a);
                if (bVar.f4785a == 4) {
                    i3 += i5;
                }
                A = A2;
                i5 = 1;
            }
        }
        Object obj = bVar.f4786a;
        mo6117b(bVar);
        if (i5 > 0) {
            C0846b a2 = mo6116a(bVar.f4785a, A, i5, obj);
            mo6128m(a2, i3);
            mo6117b(a2);
        }
    }

    /* renamed from: m */
    public void mo6128m(C0846b bVar, int i) {
        this.f4773a.mo5651g(bVar);
        int i2 = bVar.f4785a;
        if (i2 == 2) {
            this.f4773a.mo5647c(i, bVar.f4788c);
        } else if (i2 == 4) {
            this.f4773a.mo5648d(i, bVar.f4788c, bVar.f4786a);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: n */
    public int mo6129n(int i) {
        return mo6130o(i, 0);
    }

    /* renamed from: o */
    public int mo6130o(int i, int i2) {
        int size = this.f4779b.size();
        while (i2 < size) {
            C0846b bVar = this.f4779b.get(i2);
            int i3 = bVar.f4785a;
            if (i3 == 8) {
                int i4 = bVar.f4787b;
                if (i4 == i) {
                    i = bVar.f4788c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f4788c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f4787b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f4788c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f4788c;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: p */
    public boolean mo6131p(int i) {
        return (i & this.f4772a) != 0;
    }

    /* renamed from: q */
    public boolean mo6132q() {
        return this.f4777a.size() > 0;
    }

    /* renamed from: r */
    public boolean mo6133r() {
        return !this.f4779b.isEmpty() && !this.f4777a.isEmpty();
    }

    /* renamed from: s */
    public boolean mo6134s(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f4777a.add(mo6116a(4, i, i2, obj));
        this.f4772a |= 4;
        return this.f4777a.size() == 1;
    }

    /* renamed from: t */
    public boolean mo6135t(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4777a.add(mo6116a(1, i, i2, (Object) null));
        this.f4772a |= 1;
        return this.f4777a.size() == 1;
    }

    /* renamed from: u */
    public boolean mo6136u(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f4777a.add(mo6116a(8, i, i2, (Object) null));
            this.f4772a |= 8;
            return this.f4777a.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: v */
    public boolean mo6137v(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4777a.add(mo6116a(2, i, i2, (Object) null));
        this.f4772a |= 2;
        return this.f4777a.size() == 1;
    }

    /* renamed from: w */
    public final void mo6138w(C0846b bVar) {
        this.f4779b.add(bVar);
        int i = bVar.f4785a;
        if (i == 1) {
            this.f4773a.mo5646b(bVar.f4787b, bVar.f4788c);
        } else if (i == 2) {
            this.f4773a.mo5645a(bVar.f4787b, bVar.f4788c);
        } else if (i == 4) {
            this.f4773a.mo5648d(bVar.f4787b, bVar.f4788c, bVar.f4786a);
        } else if (i == 8) {
            this.f4773a.mo5652h(bVar.f4787b, bVar.f4788c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: x */
    public void mo6139x() {
        this.f4774a.mo6497b(this.f4777a);
        int size = this.f4777a.size();
        for (int i = 0; i < size; i++) {
            C0846b bVar = this.f4777a.get(i);
            int i2 = bVar.f4785a;
            if (i2 == 1) {
                mo6119d(bVar);
            } else if (i2 == 2) {
                mo6122g(bVar);
            } else if (i2 == 4) {
                mo6123h(bVar);
            } else if (i2 == 8) {
                mo6120e(bVar);
            }
            Runnable runnable = this.f4776a;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4777a.clear();
    }

    /* renamed from: y */
    public void mo6140y(List<C0846b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo6117b(list.get(i));
        }
        list.clear();
    }

    /* renamed from: z */
    public void mo6141z() {
        mo6140y(this.f4777a);
        mo6140y(this.f4779b);
        this.f4772a = 0;
    }
}
