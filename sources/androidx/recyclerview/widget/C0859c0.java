package androidx.recyclerview.widget;

import android.view.View;
import com.onedelhi.secure.C3155pk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.recyclerview.widget.c0 */
public class C0859c0 {

    /* renamed from: a */
    public static final int f4806a = 1;

    /* renamed from: b */
    public static final int f4807b = 2;

    /* renamed from: c */
    public static final int f4808c = 4;

    /* renamed from: d */
    public static final int f4809d = 0;

    /* renamed from: e */
    public static final int f4810e = 1;

    /* renamed from: f */
    public static final int f4811f = 2;

    /* renamed from: g */
    public static final int f4812g = 4;

    /* renamed from: h */
    public static final int f4813h = 4;

    /* renamed from: i */
    public static final int f4814i = 16;

    /* renamed from: j */
    public static final int f4815j = 32;

    /* renamed from: k */
    public static final int f4816k = 64;

    /* renamed from: l */
    public static final int f4817l = 8;

    /* renamed from: m */
    public static final int f4818m = 256;

    /* renamed from: n */
    public static final int f4819n = 512;

    /* renamed from: o */
    public static final int f4820o = 1024;

    /* renamed from: p */
    public static final int f4821p = 12;

    /* renamed from: q */
    public static final int f4822q = 4096;

    /* renamed from: r */
    public static final int f4823r = 8192;

    /* renamed from: s */
    public static final int f4824s = 16384;

    /* renamed from: t */
    public static final int f4825t = 7;

    /* renamed from: a */
    public C0860a f4826a = new C0860a();

    /* renamed from: a */
    public final C0861b f4827a;

    /* renamed from: androidx.recyclerview.widget.c0$a */
    public static class C0860a {

        /* renamed from: a */
        public int f4828a = 0;

        /* renamed from: b */
        public int f4829b;

        /* renamed from: c */
        public int f4830c;

        /* renamed from: d */
        public int f4831d;

        /* renamed from: e */
        public int f4832e;

        /* renamed from: a */
        public void mo6162a(int i) {
            this.f4828a = i | this.f4828a;
        }

        /* renamed from: b */
        public boolean mo6163b() {
            int i = this.f4828a;
            if ((i & 7) != 0 && (i & (mo6164c(this.f4831d, this.f4829b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4828a;
            if ((i2 & 112) != 0 && (i2 & (mo6164c(this.f4831d, this.f4830c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4828a;
            if ((i3 & C3155pk.C3157b.f18593c) != 0 && (i3 & (mo6164c(this.f4832e, this.f4829b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4828a;
            return (i4 & 28672) == 0 || (i4 & (mo6164c(this.f4832e, this.f4830c) << 12)) != 0;
        }

        /* renamed from: c */
        public int mo6164c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void mo6165d() {
            this.f4828a = 0;
        }

        /* renamed from: e */
        public void mo6166e(int i, int i2, int i3, int i4) {
            this.f4829b = i;
            this.f4830c = i2;
            this.f4831d = i3;
            this.f4832e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.c0$b */
    public interface C0861b {
        /* renamed from: a */
        View mo5906a(int i);

        /* renamed from: b */
        int mo5907b(View view);

        /* renamed from: c */
        int mo5908c();

        /* renamed from: d */
        int mo5909d();

        /* renamed from: e */
        int mo5910e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.recyclerview.widget.c0$c */
    public @interface C0862c {
    }

    public C0859c0(C0861b bVar) {
        this.f4827a = bVar;
    }

    /* renamed from: a */
    public View mo6160a(int i, int i2, int i3, int i4) {
        int c = this.f4827a.mo5908c();
        int d = this.f4827a.mo5909d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f4827a.mo5906a(i);
            this.f4826a.mo6166e(c, d, this.f4827a.mo5907b(a), this.f4827a.mo5910e(a));
            if (i3 != 0) {
                this.f4826a.mo6165d();
                this.f4826a.mo6162a(i3);
                if (this.f4826a.mo6163b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f4826a.mo6165d();
                this.f4826a.mo6162a(i4);
                if (this.f4826a.mo6163b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean mo6161b(View view, int i) {
        this.f4826a.mo6166e(this.f4827a.mo5908c(), this.f4827a.mo5909d(), this.f4827a.mo5907b(view), this.f4827a.mo5910e(view));
        if (i == 0) {
            return false;
        }
        this.f4826a.mo6165d();
        this.f4826a.mo6162a(i);
        return this.f4826a.mo6163b();
    }
}
