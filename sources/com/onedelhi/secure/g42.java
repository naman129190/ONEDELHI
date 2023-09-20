package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import java.util.List;
import java.util.Queue;

public class g42<T> implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final int f12414a;

    /* renamed from: a */
    public final fj3 f12415a;

    /* renamed from: a */
    public final C2212a<T> f12416a;

    /* renamed from: a */
    public final C2213b<T> f12417a;

    /* renamed from: a */
    public final C2215d f12418a;

    /* renamed from: a */
    public boolean f12419a = true;

    /* renamed from: b */
    public int f12420b;

    /* renamed from: c */
    public int f12421c;

    /* renamed from: d */
    public int f12422d = -1;

    /* renamed from: e */
    public int f12423e;

    /* renamed from: com.onedelhi.secure.g42$a */
    public interface C2212a<U> {
        @ts2
        /* renamed from: a */
        ti3<?> mo16330a(@mr2 U u);

        @mr2
        /* renamed from: b */
        List<U> mo16331b(int i);
    }

    /* renamed from: com.onedelhi.secure.g42$b */
    public interface C2213b<T> {
        @ts2
        /* renamed from: a */
        int[] mo16332a(@mr2 T t, int i, int i2);
    }

    /* renamed from: com.onedelhi.secure.g42$c */
    public static final class C2214c implements s94<Object> {
        @ts2

        /* renamed from: a */
        public si3 f12424a;

        /* renamed from: n */
        public int f12425n;

        /* renamed from: o */
        public int f12426o;

        /* renamed from: a */
        public void mo16333a(@ts2 si3 si3) {
            this.f12424a = si3;
        }

        /* renamed from: b */
        public void mo16019b(@ts2 Drawable drawable) {
        }

        /* renamed from: c */
        public void mo15993c() {
        }

        /* renamed from: d */
        public void mo15995d() {
        }

        /* renamed from: e */
        public void mo14955e(@mr2 uz3 uz3) {
            uz3.mo19958e(this.f12426o, this.f12425n);
        }

        /* renamed from: g */
        public void mo15999g() {
        }

        /* renamed from: h */
        public void mo16334h(@ts2 Drawable drawable) {
        }

        @ts2
        /* renamed from: m */
        public si3 mo16335m() {
            return this.f12424a;
        }

        /* renamed from: p */
        public void mo16336p(@ts2 Drawable drawable) {
        }

        /* renamed from: r */
        public void mo14956r(@mr2 uz3 uz3) {
        }

        /* renamed from: s */
        public void mo16021s(@mr2 Object obj, @ts2 jh4<? super Object> jh4) {
        }
    }

    /* renamed from: com.onedelhi.secure.g42$d */
    public static final class C2215d {

        /* renamed from: a */
        public final Queue<C2214c> f12427a;

        public C2215d(int i) {
            this.f12427a = oq4.m24018f(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f12427a.offer(new C2214c());
            }
        }

        /* renamed from: a */
        public C2214c mo16337a(int i, int i2) {
            C2214c poll = this.f12427a.poll();
            this.f12427a.offer(poll);
            poll.f12426o = i;
            poll.f12425n = i2;
            return poll;
        }
    }

    public g42(@mr2 fj3 fj3, @mr2 C2212a<T> aVar, @mr2 C2213b<T> bVar, int i) {
        this.f12415a = fj3;
        this.f12416a = aVar;
        this.f12417a = bVar;
        this.f12414a = i;
        this.f12418a = new C2215d(i + 1);
    }

    /* renamed from: a */
    public final void mo16323a() {
        for (int i = 0; i < this.f12418a.f12427a.size(); i++) {
            this.f12415a.mo15967C(this.f12418a.mo16337a(0, 0));
        }
    }

    /* renamed from: b */
    public final void mo16324b(int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            i3 = Math.max(this.f12420b, i);
            i4 = i2;
        } else {
            i4 = Math.min(this.f12421c, i);
            i3 = i2;
        }
        int min = Math.min(this.f12423e, i4);
        int min2 = Math.min(this.f12423e, Math.max(0, i3));
        if (i < i2) {
            for (int i5 = min2; i5 < min; i5++) {
                mo16326d(this.f12416a.mo16331b(i5), i5, true);
            }
        } else {
            for (int i6 = min - 1; i6 >= min2; i6--) {
                mo16326d(this.f12416a.mo16331b(i6), i6, false);
            }
        }
        this.f12421c = min2;
        this.f12420b = min;
    }

    /* renamed from: c */
    public final void mo16325c(int i, boolean z) {
        if (this.f12419a != z) {
            this.f12419a = z;
            mo16323a();
        }
        mo16324b(i, (z ? this.f12414a : -this.f12414a) + i);
    }

    /* renamed from: d */
    public final void mo16326d(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                mo16327e(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            mo16327e(list.get(i3), i, i3);
        }
    }

    /* renamed from: e */
    public final void mo16327e(@ts2 T t, int i, int i2) {
        int[] a;
        ti3<?> a2;
        if (t != null && (a = this.f12417a.mo16332a(t, i, i2)) != null && (a2 = this.f12416a.mo16330a(t)) != null) {
            a2.mo25098h1(this.f12418a.mo16337a(a[0], a[1]));
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f12423e = i3;
        int i4 = this.f12422d;
        if (i > i4) {
            mo16325c(i2 + i, true);
        } else if (i < i4) {
            mo16325c(i, false);
        }
        this.f12422d = i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
