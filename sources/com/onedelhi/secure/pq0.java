package com.onedelhi.secure;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.onedelhi.secure.C1853c7;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.pq0;
import java.util.ArrayList;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

public abstract class pq0<T extends pq0<T>> implements C1853c7.C1855b {

    /* renamed from: a */
    public static final C3180s f18643a = new C3168g("translationX");

    /* renamed from: b */
    public static final C3180s f18644b = new C3169h("translationY");

    /* renamed from: c */
    public static final C3180s f18645c = new C3170i("translationZ");

    /* renamed from: d */
    public static final C3180s f18646d = new C3171j("scaleX");

    /* renamed from: e */
    public static final C3180s f18647e = new C3172k("scaleY");

    /* renamed from: f */
    public static final float f18648f = 1.0f;

    /* renamed from: f */
    public static final C3180s f18649f = new C3173l(ly1.f15667d);

    /* renamed from: g */
    public static final float f18650g = 0.1f;

    /* renamed from: g */
    public static final C3180s f18651g = new C3174m("rotationX");

    /* renamed from: h */
    public static final float f18652h = 0.00390625f;

    /* renamed from: h */
    public static final C3180s f18653h = new C3175n("rotationY");

    /* renamed from: i */
    public static final float f18654i = 0.002f;

    /* renamed from: i */
    public static final C3180s f18655i = new C3176o("x");

    /* renamed from: j */
    public static final float f18656j = Float.MAX_VALUE;

    /* renamed from: j */
    public static final C3180s f18657j = new C3162a("y");

    /* renamed from: k */
    public static final float f18658k = 0.75f;

    /* renamed from: k */
    public static final C3180s f18659k = new C3163b(CompressorStreamFactory.f38881Z);

    /* renamed from: l */
    public static final C3180s f18660l = new C3164c("alpha");

    /* renamed from: m */
    public static final C3180s f18661m = new C3165d("scrollX");

    /* renamed from: n */
    public static final C3180s f18662n = new C3166e("scrollY");

    /* renamed from: a */
    public float f18663a;

    /* renamed from: a */
    public long f18664a;

    /* renamed from: a */
    public final c81 f18665a;

    /* renamed from: a */
    public final Object f18666a;

    /* renamed from: a */
    public final ArrayList<C3178q> f18667a;

    /* renamed from: a */
    public boolean f18668a;

    /* renamed from: b */
    public float f18669b;

    /* renamed from: b */
    public final ArrayList<C3179r> f18670b;

    /* renamed from: b */
    public boolean f18671b;

    /* renamed from: c */
    public float f18672c;

    /* renamed from: d */
    public float f18673d;

    /* renamed from: e */
    public float f18674e;

    /* renamed from: com.onedelhi.secure.pq0$a */
    public static class C3162a extends C3180s {
        public C3162a(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getY();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$b */
    public static class C3163b extends C3180s {
        public C3163b(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return jt4.m18864F0(view);
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            jt4.m18850B2(view, f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$c */
    public static class C3164c extends C3180s {
        public C3164c(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getAlpha();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$d */
    public static class C3165d extends C3180s {
        public C3165d(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$e */
    public static class C3166e extends C3180s {
        public C3166e(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$f */
    public class C3167f extends c81 {

        /* renamed from: a */
        public final /* synthetic */ h81 f18675a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3167f(String str, h81 h81) {
            super(str);
            this.f18675a = h81;
        }

        /* renamed from: b */
        public float mo14062b(Object obj) {
            return this.f18675a.mo17151a();
        }

        /* renamed from: c */
        public void mo14063c(Object obj, float f) {
            this.f18675a.mo17152b(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$g */
    public static class C3168g extends C3180s {
        public C3168g(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getTranslationX();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$h */
    public static class C3169h extends C3180s {
        public C3169h(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getTranslationY();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$i */
    public static class C3170i extends C3180s {
        public C3170i(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return jt4.m18844A0(view);
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            jt4.m19022w2(view, f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$j */
    public static class C3171j extends C3180s {
        public C3171j(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getScaleX();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$k */
    public static class C3172k extends C3180s {
        public C3172k(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getScaleY();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$l */
    public static class C3173l extends C3180s {
        public C3173l(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getRotation();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$m */
    public static class C3174m extends C3180s {
        public C3174m(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getRotationX();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$n */
    public static class C3175n extends C3180s {
        public C3175n(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getRotationY();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$o */
    public static class C3176o extends C3180s {
        public C3176o(String str) {
            super(str, (C3168g) null);
        }

        /* renamed from: d */
        public float mo14062b(View view) {
            return view.getX();
        }

        /* renamed from: e */
        public void mo14063c(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: com.onedelhi.secure.pq0$p */
    public static class C3177p {

        /* renamed from: a */
        public float f18677a;

        /* renamed from: b */
        public float f18678b;
    }

    /* renamed from: com.onedelhi.secure.pq0$q */
    public interface C3178q {
        /* renamed from: a */
        void mo22577a(pq0 pq0, boolean z, float f, float f2);
    }

    /* renamed from: com.onedelhi.secure.pq0$r */
    public interface C3179r {
        /* renamed from: a */
        void mo22578a(pq0 pq0, float f, float f2);
    }

    /* renamed from: com.onedelhi.secure.pq0$s */
    public static abstract class C3180s extends c81<View> {
        public C3180s(String str) {
            super(str);
        }

        public /* synthetic */ C3180s(String str, C3168g gVar) {
            this(str);
        }
    }

    public pq0(h81 h81) {
        this.f18663a = 0.0f;
        this.f18669b = Float.MAX_VALUE;
        this.f18668a = false;
        this.f18671b = false;
        this.f18672c = Float.MAX_VALUE;
        this.f18673d = -Float.MAX_VALUE;
        this.f18664a = 0;
        this.f18667a = new ArrayList<>();
        this.f18670b = new ArrayList<>();
        this.f18666a = null;
        this.f18665a = new C3167f("FloatValueHolder", h81);
        this.f18674e = 1.0f;
    }

    public <K> pq0(K k, c81<K> c81) {
        float f;
        this.f18663a = 0.0f;
        this.f18669b = Float.MAX_VALUE;
        this.f18668a = false;
        this.f18671b = false;
        this.f18672c = Float.MAX_VALUE;
        this.f18673d = -Float.MAX_VALUE;
        this.f18664a = 0;
        this.f18667a = new ArrayList<>();
        this.f18670b = new ArrayList<>();
        this.f18666a = k;
        this.f18665a = c81;
        if (c81 == f18649f || c81 == f18651g || c81 == f18653h) {
            f = 0.1f;
        } else if (c81 == f18660l || c81 == f18646d || c81 == f18647e) {
            this.f18674e = 0.00390625f;
            return;
        } else {
            f = 1.0f;
        }
        this.f18674e = f;
    }

    /* renamed from: m */
    public static <T> void m24857m(ArrayList<T> arrayList, T t) {
        int indexOf = arrayList.indexOf(t);
        if (indexOf >= 0) {
            arrayList.set(indexOf, (Object) null);
        }
    }

    /* renamed from: n */
    public static <T> void m24858n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: a */
    public boolean mo14041a(long j) {
        long j2 = this.f18664a;
        if (j2 == 0) {
            this.f18664a = j;
            mo22545s(this.f18669b);
            return false;
        }
        this.f18664a = j;
        boolean y = mo12667y(j - j2);
        float min = Math.min(this.f18669b, this.f18672c);
        this.f18669b = min;
        float max = Math.max(min, this.f18673d);
        this.f18669b = max;
        mo22545s(max);
        if (y) {
            mo22535e(false);
        }
        return y;
    }

    /* renamed from: b */
    public T mo22532b(C3178q qVar) {
        if (!this.f18667a.contains(qVar)) {
            this.f18667a.add(qVar);
        }
        return this;
    }

    /* renamed from: c */
    public T mo22533c(C3179r rVar) {
        if (!mo22539k()) {
            if (!this.f18670b.contains(rVar)) {
                this.f18670b.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: d */
    public void mo22534d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f18671b) {
            mo22535e(true);
        }
    }

    /* renamed from: e */
    public final void mo22535e(boolean z) {
        this.f18671b = false;
        C1853c7.m12357e().mo14038h(this);
        this.f18664a = 0;
        this.f18668a = false;
        for (int i = 0; i < this.f18667a.size(); i++) {
            if (this.f18667a.get(i) != null) {
                this.f18667a.get(i).mo22577a(this, z, this.f18669b, this.f18663a);
            }
        }
        m24858n(this.f18667a);
    }

    /* renamed from: f */
    public abstract float mo12663f(float f, float f2);

    /* renamed from: g */
    public float mo22536g() {
        return this.f18674e;
    }

    /* renamed from: h */
    public final float mo22537h() {
        return this.f18665a.mo14062b(this.f18666a);
    }

    /* renamed from: i */
    public float mo22538i() {
        return this.f18674e * 0.75f;
    }

    /* renamed from: j */
    public abstract boolean mo12664j(float f, float f2);

    /* renamed from: k */
    public boolean mo22539k() {
        return this.f18671b;
    }

    /* renamed from: l */
    public void mo22540l(C3178q qVar) {
        m24857m(this.f18667a, qVar);
    }

    /* renamed from: o */
    public void mo22541o(C3179r rVar) {
        m24857m(this.f18670b, rVar);
    }

    /* renamed from: p */
    public T mo22542p(float f) {
        this.f18672c = f;
        return this;
    }

    /* renamed from: q */
    public T mo22543q(float f) {
        this.f18673d = f;
        return this;
    }

    /* renamed from: r */
    public T mo22544r(@d81(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f18674e = f;
            mo12665v(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    /* renamed from: s */
    public void mo22545s(float f) {
        this.f18665a.mo14063c(this.f18666a, f);
        for (int i = 0; i < this.f18670b.size(); i++) {
            if (this.f18670b.get(i) != null) {
                this.f18670b.get(i).mo22578a(this, this.f18669b, this.f18663a);
            }
        }
        m24858n(this.f18670b);
    }

    /* renamed from: t */
    public T mo22546t(float f) {
        this.f18669b = f;
        this.f18668a = true;
        return this;
    }

    /* renamed from: u */
    public T mo22547u(float f) {
        this.f18663a = f;
        return this;
    }

    /* renamed from: v */
    public abstract void mo12665v(float f);

    /* renamed from: w */
    public void mo12666w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f18671b) {
            mo22548x();
        }
    }

    /* renamed from: x */
    public final void mo22548x() {
        if (!this.f18671b) {
            this.f18671b = true;
            if (!this.f18668a) {
                this.f18669b = mo22537h();
            }
            float f = this.f18669b;
            if (f > this.f18672c || f < this.f18673d) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C1853c7.m12357e().mo14033a(this, 0);
        }
    }

    /* renamed from: y */
    public abstract boolean mo12667y(long j);
}
