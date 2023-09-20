package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C0512c;
import androidx.databinding.C0519f;
import androidx.databinding.C0523i;
import androidx.databinding.C0525j;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0697h;
import androidx.lifecycle.LiveData;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.bv2;
import com.onedelhi.secure.ed0;
import com.onedelhi.secure.ga2;
import com.onedelhi.secure.gt4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qa3;
import com.onedelhi.secure.st1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.z22;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

public abstract class ViewDataBinding extends C0509a implements gt4 {

    /* renamed from: a */
    public static final View.OnAttachStateChangeListener f3377a = new C0497f();

    /* renamed from: a */
    public static final C0500i f3378a = new C0492a();

    /* renamed from: a */
    public static final C0512c.C0513a<bv2, ViewDataBinding, Void> f3379a = new C0496e();

    /* renamed from: a */
    public static final ReferenceQueue<ViewDataBinding> f3380a = new ReferenceQueue<>();

    /* renamed from: b */
    public static final C0500i f3381b = new C0493b();

    /* renamed from: b */
    public static final String f3382b = "binding_";

    /* renamed from: c */
    public static final C0500i f3383c = new C0494c();

    /* renamed from: d */
    public static final C0500i f3384d = new C0495d();

    /* renamed from: f */
    public static final boolean f3385f = true;

    /* renamed from: n */
    public static int f3386n = Build.VERSION.SDK_INT;

    /* renamed from: o */
    public static final int f3387o = 1;

    /* renamed from: p */
    public static final int f3388p = 2;

    /* renamed from: q */
    public static final int f3389q = 3;

    /* renamed from: r */
    public static final int f3390r = 8;

    /* renamed from: a */
    public Handler f3391a;

    /* renamed from: a */
    public final Choreographer.FrameCallback f3392a;

    /* renamed from: a */
    public Choreographer f3393a;

    /* renamed from: a */
    public final View f3394a;

    /* renamed from: a */
    public final DataBindingComponent f3395a;

    /* renamed from: a */
    public OnStartListener f3396a;

    /* renamed from: a */
    public ViewDataBinding f3397a;

    /* renamed from: a */
    public C0512c<bv2, ViewDataBinding, Void> f3398a;

    /* renamed from: a */
    public a32 f3399a;

    /* renamed from: a */
    public final Runnable f3400a;

    /* renamed from: a */
    public C0506o[] f3401a;

    /* renamed from: b */
    public boolean f3402b;

    /* renamed from: c */
    public boolean f3403c;

    /* renamed from: d */
    public boolean f3404d;

    /* renamed from: e */
    public boolean f3405e;

    public static class OnStartListener implements z22 {

        /* renamed from: a */
        public final WeakReference<ViewDataBinding> f3406a;

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.f3406a = new WeakReference<>(viewDataBinding);
        }

        public /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, C0492a aVar) {
            this(viewDataBinding);
        }

        @C0697h(C0690e.C0692b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f3406a.get();
            if (viewDataBinding != null) {
                viewDataBinding.mo3934w();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    public static class C0492a implements C0500i {
        /* renamed from: a */
        public C0506o mo3937a(ViewDataBinding viewDataBinding, int i) {
            return new C0508q(viewDataBinding, i).mo3947c();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    public static class C0493b implements C0500i {
        /* renamed from: a */
        public C0506o mo3937a(ViewDataBinding viewDataBinding, int i) {
            return new C0505n(viewDataBinding, i).mo3947c();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    public static class C0494c implements C0500i {
        /* renamed from: a */
        public C0506o mo3937a(ViewDataBinding viewDataBinding, int i) {
            return new C0507p(viewDataBinding, i).mo3947c();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    public static class C0495d implements C0500i {
        /* renamed from: a */
        public C0506o mo3937a(ViewDataBinding viewDataBinding, int i) {
            return new C0502k(viewDataBinding, i).mo3947c();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    public static class C0496e extends C0512c.C0513a<bv2, ViewDataBinding, Void> {
        /* renamed from: b */
        public void mo3938a(bv2 bv2, ViewDataBinding viewDataBinding, int i, Void voidR) {
            if (i != 1) {
                if (i == 2) {
                    bv2.mo13824b(viewDataBinding);
                } else if (i == 3) {
                    bv2.mo13823a(viewDataBinding);
                }
            } else if (!bv2.mo13825c(viewDataBinding)) {
                boolean unused = viewDataBinding.f3403c = true;
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    public static class C0497f implements View.OnAttachStateChangeListener {
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m3766B(view).f3400a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    public class C0498g implements Runnable {
        public C0498g() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.f3402b = false;
            }
            ViewDataBinding.m3833s0();
            if (!ViewDataBinding.this.f3394a.isAttachedToWindow()) {
                ViewDataBinding.this.f3394a.removeOnAttachStateChangeListener(ViewDataBinding.f3377a);
                ViewDataBinding.this.f3394a.addOnAttachStateChangeListener(ViewDataBinding.f3377a);
                return;
            }
            ViewDataBinding.this.mo3934w();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    public class C0499h implements Choreographer.FrameCallback {
        public C0499h() {
        }

        public void doFrame(long j) {
            ViewDataBinding.this.f3400a.run();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$i */
    public interface C0500i {
        /* renamed from: a */
        C0506o mo3937a(ViewDataBinding viewDataBinding, int i);
    }

    /* renamed from: androidx.databinding.ViewDataBinding$j */
    public static class C0501j {

        /* renamed from: a */
        public final int[][] f3409a;

        /* renamed from: a */
        public final String[][] f3410a;

        /* renamed from: b */
        public final int[][] f3411b;

        public C0501j(int i) {
            this.f3410a = new String[i][];
            this.f3409a = new int[i][];
            this.f3411b = new int[i][];
        }

        /* renamed from: a */
        public void mo3944a(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f3410a[i] = strArr;
            this.f3409a[i] = iArr;
            this.f3411b[i] = iArr2;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$k */
    public static class C0502k implements bu2, C0503l<LiveData<?>> {

        /* renamed from: a */
        public final C0506o<LiveData<?>> f3412a;

        /* renamed from: a */
        public a32 f3413a;

        public C0502k(ViewDataBinding viewDataBinding, int i) {
            this.f3412a = new C0506o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo3945a(a32 a32) {
            LiveData b = this.f3412a.mo3961b();
            if (b != null) {
                if (this.f3413a != null) {
                    b.mo4931o(this);
                }
                if (a32 != null) {
                    b.mo4926j(a32, this);
                }
            }
            this.f3413a = a32;
        }

        /* renamed from: b */
        public void mo3946b(@ts2 Object obj) {
            ViewDataBinding a = this.f3412a.mo3960a();
            if (a != null) {
                C0506o<LiveData<?>> oVar = this.f3412a;
                a.mo3914a0(oVar.f3416a, oVar.mo3961b(), 0);
            }
        }

        /* renamed from: c */
        public C0506o<LiveData<?>> mo3947c() {
            return this.f3412a;
        }

        /* renamed from: f */
        public void mo3949e(LiveData<?> liveData) {
            a32 a32 = this.f3413a;
            if (a32 != null) {
                liveData.mo4926j(a32, this);
            }
        }

        /* renamed from: g */
        public void mo3948d(LiveData<?> liveData) {
            liveData.mo4931o(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$l */
    public interface C0503l<T> {
        /* renamed from: a */
        void mo3945a(a32 a32);

        /* renamed from: c */
        C0506o<T> mo3947c();

        /* renamed from: d */
        void mo3948d(T t);

        /* renamed from: e */
        void mo3949e(T t);
    }

    /* renamed from: androidx.databinding.ViewDataBinding$m */
    public static abstract class C0504m extends C0519f.C0520a implements st1 {

        /* renamed from: a */
        public final int f3414a;

        public C0504m(int i) {
            this.f3414a = i;
        }

        /* renamed from: f */
        public void mo3952f(C0519f fVar, int i) {
            if (i == this.f3414a || i == 0) {
                mo24536b();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$n */
    public static class C0505n extends C0523i.C0524a implements C0503l<C0523i> {

        /* renamed from: a */
        public final C0506o<C0523i> f3415a;

        public C0505n(ViewDataBinding viewDataBinding, int i) {
            this.f3415a = new C0506o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo3945a(a32 a32) {
        }

        /* renamed from: b */
        public void mo3953b(C0523i iVar) {
            C0523i b;
            ViewDataBinding a = this.f3415a.mo3960a();
            if (a != null && (b = this.f3415a.mo3961b()) == iVar) {
                a.mo3914a0(this.f3415a.f3416a, b, 0);
            }
        }

        /* renamed from: c */
        public C0506o<C0523i> mo3947c() {
            return this.f3415a;
        }

        /* renamed from: f */
        public void mo3954f(C0523i iVar, int i, int i2) {
            mo3953b(iVar);
        }

        /* renamed from: g */
        public void mo3955g(C0523i iVar, int i, int i2) {
            mo3953b(iVar);
        }

        /* renamed from: h */
        public void mo3956h(C0523i iVar, int i, int i2, int i3) {
            mo3953b(iVar);
        }

        /* renamed from: i */
        public void mo3957i(C0523i iVar, int i, int i2) {
            mo3953b(iVar);
        }

        /* renamed from: j */
        public void mo3949e(C0523i iVar) {
            iVar.mo3999N0(this);
        }

        /* renamed from: k */
        public void mo3948d(C0523i iVar) {
            iVar.mo4000Y(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$o */
    public static class C0506o<T> extends WeakReference<ViewDataBinding> {

        /* renamed from: a */
        public final int f3416a;

        /* renamed from: a */
        public final C0503l<T> f3417a;

        /* renamed from: a */
        public T f3418a;

        public C0506o(ViewDataBinding viewDataBinding, int i, C0503l<T> lVar) {
            super(viewDataBinding, ViewDataBinding.f3380a);
            this.f3416a = i;
            this.f3417a = lVar;
        }

        /* renamed from: a */
        public ViewDataBinding mo3960a() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                mo3964e();
            }
            return viewDataBinding;
        }

        /* renamed from: b */
        public T mo3961b() {
            return this.f3418a;
        }

        /* renamed from: c */
        public void mo3962c(a32 a32) {
            this.f3417a.mo3945a(a32);
        }

        /* renamed from: d */
        public void mo3963d(T t) {
            mo3964e();
            this.f3418a = t;
            if (t != null) {
                this.f3417a.mo3949e(t);
            }
        }

        /* renamed from: e */
        public boolean mo3964e() {
            boolean z;
            T t = this.f3418a;
            if (t != null) {
                this.f3417a.mo3948d(t);
                z = true;
            } else {
                z = false;
            }
            this.f3418a = null;
            return z;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$p */
    public static class C0507p extends C0525j.C0526a implements C0503l<C0525j> {

        /* renamed from: a */
        public final C0506o<C0525j> f3419a;

        public C0507p(ViewDataBinding viewDataBinding, int i) {
            this.f3419a = new C0506o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo3945a(a32 a32) {
        }

        /* renamed from: b */
        public void mo3965b(C0525j jVar, Object obj) {
            ViewDataBinding a = this.f3419a.mo3960a();
            if (a != null && jVar == this.f3419a.mo3961b()) {
                a.mo3914a0(this.f3419a.f3416a, jVar, 0);
            }
        }

        /* renamed from: c */
        public C0506o<C0525j> mo3947c() {
            return this.f3419a;
        }

        /* renamed from: f */
        public void mo3949e(C0525j jVar) {
            jVar.mo4012a(this);
        }

        /* renamed from: g */
        public void mo3948d(C0525j jVar) {
            jVar.mo4013b(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$q */
    public static class C0508q extends C0519f.C0520a implements C0503l<C0519f> {

        /* renamed from: a */
        public final C0506o<C0519f> f3420a;

        public C0508q(ViewDataBinding viewDataBinding, int i) {
            this.f3420a = new C0506o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo3945a(a32 a32) {
        }

        /* renamed from: c */
        public C0506o<C0519f> mo3947c() {
            return this.f3420a;
        }

        /* renamed from: f */
        public void mo3952f(C0519f fVar, int i) {
            ViewDataBinding a = this.f3420a.mo3960a();
            if (a != null && this.f3420a.mo3961b() == fVar) {
                a.mo3914a0(this.f3420a.f3416a, fVar, i);
            }
        }

        /* renamed from: g */
        public void mo3949e(C0519f fVar) {
            fVar.mo3971b(this);
        }

        /* renamed from: h */
        public void mo3948d(C0519f fVar) {
            fVar.mo3970a(this);
        }
    }

    public ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i) {
        this.f3400a = new C0498g();
        this.f3402b = false;
        this.f3403c = false;
        this.f3395a = dataBindingComponent;
        this.f3401a = new C0506o[i];
        this.f3394a = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f3385f) {
            this.f3393a = Choreographer.getInstance();
            this.f3392a = new C0499h();
        } else {
            this.f3392a = null;
            this.f3391a = new Handler(Looper.myLooper());
        }
    }

    public ViewDataBinding(Object obj, View view, int i) {
        this(m3831r(obj), view, i);
    }

    /* renamed from: A0 */
    public static int m3765A0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: B */
    public static ViewDataBinding m3766B(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(qa3.C3270e.dataBinding);
        }
        return null;
    }

    /* renamed from: B0 */
    public static long m3767B0(Long l) {
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: C */
    public static int m3768C() {
        return f3386n;
    }

    /* renamed from: C0 */
    public static short m3769C0(Short sh) {
        if (sh == null) {
            return 0;
        }
        return sh.shortValue();
    }

    /* renamed from: D */
    public static int m3770D(View view, int i) {
        return Build.VERSION.SDK_INT >= 23 ? view.getContext().getColor(i) : view.getResources().getColor(i);
    }

    /* renamed from: D0 */
    public static boolean m3771D0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: E */
    public static ColorStateList m3772E(View view, int i) {
        return Build.VERSION.SDK_INT >= 23 ? view.getContext().getColorStateList(i) : view.getResources().getColorStateList(i);
    }

    /* renamed from: E0 */
    public static void m3773E0(ViewDataBinding viewDataBinding, st1 st1, C0504m mVar) {
        if (st1 != mVar) {
            if (st1 != null) {
                viewDataBinding.mo3970a((C0504m) st1);
            }
            if (mVar != null) {
                viewDataBinding.mo3971b(mVar);
            }
        }
    }

    /* renamed from: F */
    public static Drawable m3774F(View view, int i) {
        return view.getContext().getDrawable(i);
    }

    /* renamed from: G */
    public static <K, T> T m3775G(Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    /* renamed from: H */
    public static byte m3776H(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return 0;
        }
        return bArr[i];
    }

    /* renamed from: I */
    public static char m3777I(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return 0;
        }
        return cArr[i];
    }

    /* renamed from: J */
    public static double m3778J(double[] dArr, int i) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return 0.0d;
        }
        return dArr[i];
    }

    @TargetApi(16)
    /* renamed from: J0 */
    public static <T> void m3779J0(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray != null && i >= 0 && i < longSparseArray.size()) {
            longSparseArray.put((long) i, t);
        }
    }

    /* renamed from: K */
    public static float m3780K(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    /* renamed from: K0 */
    public static <T> void m3781K0(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray != null && i >= 0 && i < sparseArray.size()) {
            sparseArray.put(i, t);
        }
    }

    /* renamed from: L */
    public static int m3782L(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    /* renamed from: L0 */
    public static void m3783L0(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray != null && i >= 0 && i < sparseBooleanArray.size()) {
            sparseBooleanArray.put(i, z);
        }
    }

    /* renamed from: M */
    public static long m3784M(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0;
        }
        return jArr[i];
    }

    /* renamed from: N */
    public static <T> T m3785N(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: N0 */
    public static void m3786N0(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray != null && i >= 0 && i < sparseIntArray.size()) {
            sparseIntArray.put(i, i2);
        }
    }

    /* renamed from: O */
    public static short m3787O(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return 0;
        }
        return sArr[i];
    }

    @TargetApi(18)
    /* renamed from: O0 */
    public static void m3788O0(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray != null && i >= 0 && i < sparseLongArray.size()) {
            sparseLongArray.put(i, j);
        }
    }

    /* renamed from: P */
    public static boolean m3789P(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    /* renamed from: P0 */
    public static <T> void m3790P0(ga2<T> ga2, int i, T t) {
        if (ga2 != null && i >= 0 && i < ga2.mo16433w()) {
            ga2.mo16423n((long) i, t);
        }
    }

    /* renamed from: Q */
    public static int m3791Q(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    /* renamed from: Q0 */
    public static <T> void m3792Q0(List<T> list, int i, T t) {
        if (list != null && i >= 0 && i < list.size()) {
            list.set(i, t);
        }
    }

    @TargetApi(18)
    /* renamed from: R */
    public static long m3793R(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0;
        }
        return sparseLongArray.get(i);
    }

    /* renamed from: R0 */
    public static <K, T> void m3794R0(Map<K, T> map, K k, T t) {
        if (map != null) {
            map.put(k, t);
        }
    }

    @TargetApi(16)
    /* renamed from: S */
    public static <T> T m3795S(LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get((long) i);
    }

    /* renamed from: S0 */
    public static void m3796S0(byte[] bArr, int i, byte b) {
        if (bArr != null && i >= 0 && i < bArr.length) {
            bArr[i] = b;
        }
    }

    /* renamed from: T */
    public static <T> T m3797T(SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    /* renamed from: T0 */
    public static void m3798T0(char[] cArr, int i, char c) {
        if (cArr != null && i >= 0 && i < cArr.length) {
            cArr[i] = c;
        }
    }

    /* renamed from: U */
    public static <T> T m3799U(ga2<T> ga2, int i) {
        if (ga2 == null || i < 0) {
            return null;
        }
        return ga2.mo16417h((long) i);
    }

    /* renamed from: U0 */
    public static void m3800U0(double[] dArr, int i, double d) {
        if (dArr != null && i >= 0 && i < dArr.length) {
            dArr[i] = d;
        }
    }

    /* renamed from: V */
    public static <T> T m3801V(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: V0 */
    public static void m3802V0(float[] fArr, int i, float f) {
        if (fArr != null && i >= 0 && i < fArr.length) {
            fArr[i] = f;
        }
    }

    /* renamed from: W */
    public static boolean m3803W(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    /* renamed from: W0 */
    public static void m3804W0(int[] iArr, int i, int i2) {
        if (iArr != null && i >= 0 && i < iArr.length) {
            iArr[i] = i2;
        }
    }

    /* renamed from: X0 */
    public static void m3805X0(long[] jArr, int i, long j) {
        if (jArr != null && i >= 0 && i < jArr.length) {
            jArr[i] = j;
        }
    }

    /* renamed from: Y0 */
    public static <T> void m3806Y0(T[] tArr, int i, T t) {
        if (tArr != null && i >= 0 && i < tArr.length) {
            tArr[i] = t;
        }
    }

    /* renamed from: Z0 */
    public static void m3807Z0(short[] sArr, int i, short s) {
        if (sArr != null && i >= 0 && i < sArr.length) {
            sArr[i] = s;
        }
    }

    /* renamed from: a1 */
    public static void m3808a1(boolean[] zArr, int i, boolean z) {
        if (zArr != null && i >= 0 && i < zArr.length) {
            zArr[i] = z;
        }
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: c0 */
    public static <T extends ViewDataBinding> T m3809c0(@mr2 LayoutInflater layoutInflater, int i, @ts2 ViewGroup viewGroup, boolean z, @ts2 Object obj) {
        return ed0.m13696k(layoutInflater, i, viewGroup, z, m3831r(obj));
    }

    /* renamed from: e0 */
    public static boolean m3810e0(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b A[SYNTHETIC] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3812f0(androidx.databinding.DataBindingComponent r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.C0501j r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            r6 = r16
            r0 = r17
            r7 = r19
            r8 = r20
            androidx.databinding.ViewDataBinding r1 = m3766B(r17)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r17.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r9 = "layout"
            r2 = -1
            r11 = 1
            if (r21 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            boolean r3 = r1.startsWith(r9)
            if (r3 == 0) goto L_0x004b
            r3 = 95
            int r3 = r1.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0047
            int r3 = r3 + r11
            boolean r4 = m3810e0(r1, r3)
            if (r4 == 0) goto L_0x0047
            int r1 = m3832r0(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0042
            r18[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            r1 = -1
        L_0x0045:
            r3 = 1
            goto L_0x0049
        L_0x0047:
            r1 = -1
            r3 = 0
        L_0x0049:
            r12 = r1
            goto L_0x0069
        L_0x004b:
            if (r1 == 0) goto L_0x0067
            java.lang.String r3 = "binding_"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0067
            int r3 = f3390r
            int r1 = m3832r0(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0061
            r18[r1] = r0
        L_0x0061:
            if (r7 != 0) goto L_0x0064
            r1 = -1
        L_0x0064:
            r12 = r1
            r3 = 1
            goto L_0x0069
        L_0x0067:
            r3 = 0
            r12 = -1
        L_0x0069:
            if (r3 != 0) goto L_0x007f
            int r1 = r17.getId()
            if (r1 <= 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            int r1 = r8.get(r1, r2)
            if (r1 < 0) goto L_0x007f
            r2 = r18[r1]
            if (r2 != 0) goto L_0x007f
            r18[r1] = r0
        L_0x007f:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0113
            r13 = r0
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L_0x008c:
            if (r0 >= r14) goto L_0x0113
            android.view.View r2 = r13.getChildAt(r0)
            if (r12 < 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00f9
            boolean r4 = r3.startsWith(r9)
            if (r4 == 0) goto L_0x00f9
            r4 = 47
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00f9
            int r3 = m3836x(r3, r1, r7, r12)
            if (r3 < 0) goto L_0x00f9
            int r1 = r3 + 1
            int[][] r4 = r7.f3409a
            r4 = r4[r12]
            r4 = r4[r3]
            int[][] r5 = r7.f3411b
            r5 = r5[r12]
            r3 = r5[r3]
            int r5 = m3838y(r13, r0)
            if (r5 != r0) goto L_0x00dc
            androidx.databinding.ViewDataBinding r3 = com.onedelhi.secure.ed0.m13688c(r6, r2, r3)
            r18[r4] = r3
        L_0x00d8:
            r10 = r0
            r11 = r1
            r0 = 1
            goto L_0x00fc
        L_0x00dc:
            int r5 = r5 - r0
            int r5 = r5 + r11
            android.view.View[] r15 = new android.view.View[r5]
            r10 = 0
        L_0x00e1:
            if (r10 >= r5) goto L_0x00ef
            int r11 = r0 + r10
            android.view.View r11 = r13.getChildAt(r11)
            r15[r10] = r11
            int r10 = r10 + 1
            r11 = 1
            goto L_0x00e1
        L_0x00ef:
            androidx.databinding.ViewDataBinding r3 = com.onedelhi.secure.ed0.m13689d(r6, r15, r3)
            r18[r4] = r3
            int r5 = r5 + -1
            int r0 = r0 + r5
            goto L_0x00d8
        L_0x00f9:
            r10 = r0
            r11 = r1
            r0 = 0
        L_0x00fc:
            if (r0 != 0) goto L_0x010b
            r5 = 0
            r0 = r16
            r1 = r2
            r2 = r18
            r3 = r19
            r4 = r20
            m3812f0(r0, r1, r2, r3, r4, r5)
        L_0x010b:
            r0 = 1
            int r1 = r10 + 1
            r0 = r1
            r1 = r11
            r11 = 1
            goto L_0x008c
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.m3812f0(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$j, android.util.SparseIntArray, boolean):void");
    }

    /* renamed from: g0 */
    public static Object[] m3813g0(DataBindingComponent dataBindingComponent, View view, int i, C0501j jVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m3812f0(dataBindingComponent, view, objArr, jVar, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: h0 */
    public static Object[] m3815h0(DataBindingComponent dataBindingComponent, View[] viewArr, int i, C0501j jVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View f0 : viewArr) {
            m3812f0(dataBindingComponent, f0, objArr, jVar, sparseIntArray, true);
        }
        return objArr;
    }

    /* renamed from: j0 */
    public static byte m3818j0(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    /* renamed from: k0 */
    public static char m3820k0(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    /* renamed from: l0 */
    public static double m3821l0(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* renamed from: m0 */
    public static float m3823m0(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    /* renamed from: n0 */
    public static int m3825n0(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: o0 */
    public static long m3827o0(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: p0 */
    public static short m3828p0(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    /* renamed from: q */
    public static ViewDataBinding m3829q(Object obj, View view, int i) {
        return ed0.m13688c(m3831r(obj), view, i);
    }

    /* renamed from: q0 */
    public static boolean m3830q0(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    /* renamed from: r */
    public static DataBindingComponent m3831r(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* renamed from: r0 */
    public static int m3832r0(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* renamed from: s0 */
    public static void m3833s0() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f3380a.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C0506o) {
                ((C0506o) poll).mo3964e();
            }
        }
    }

    /* renamed from: v */
    public static void m3834v(ViewDataBinding viewDataBinding) {
        viewDataBinding.mo3931u();
    }

    /* renamed from: w0 */
    public static byte m3835w0(Byte b) {
        if (b == null) {
            return 0;
        }
        return b.byteValue();
    }

    /* renamed from: x */
    public static int m3836x(String str, int i, C0501j jVar, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = jVar.f3410a[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: x0 */
    public static char m3837x0(Character ch) {
        if (ch == null) {
            return 0;
        }
        return ch.charValue();
    }

    /* renamed from: y */
    public static int m3838y(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (m3810e0(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: y0 */
    public static double m3839y0(Double d) {
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* renamed from: z0 */
    public static float m3840z0(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* renamed from: F0 */
    public void mo3908F0(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f3397a = this;
        }
    }

    @bc2
    /* renamed from: G0 */
    public void mo3909G0(@ts2 a32 a32) {
        a32 a322 = this.f3399a;
        if (a322 != a32) {
            if (a322 != null) {
                a322.getLifecycle().mo4960c(this.f3396a);
            }
            this.f3399a = a32;
            if (a32 != null) {
                if (this.f3396a == null) {
                    this.f3396a = new OnStartListener(this, (C0492a) null);
                }
                a32.getLifecycle().mo4958a(this.f3396a);
            }
            for (C0506o oVar : this.f3401a) {
                if (oVar != null) {
                    oVar.mo3962c(a32);
                }
            }
        }
    }

    /* renamed from: H0 */
    public void mo3910H0(View view) {
        view.setTag(qa3.C3270e.dataBinding, this);
    }

    /* renamed from: I0 */
    public void mo3911I0(View[] viewArr) {
        for (View tag : viewArr) {
            tag.setTag(qa3.C3270e.dataBinding, this);
        }
    }

    @ts2
    /* renamed from: X */
    public a32 mo3912X() {
        return this.f3399a;
    }

    /* renamed from: Y */
    public Object mo3913Y(int i) {
        C0506o oVar = this.f3401a[i];
        if (oVar == null) {
            return null;
        }
        return oVar.mo3961b();
    }

    /* renamed from: a0 */
    public final void mo3914a0(int i, Object obj, int i2) {
        if (!this.f3405e && mo3924i0(i, obj, i2)) {
            mo3933v0();
        }
    }

    /* renamed from: b0 */
    public abstract boolean mo3915b0();

    /* renamed from: b1 */
    public abstract boolean mo3916b1(int i, @ts2 Object obj);

    @mr2
    /* renamed from: c */
    public View mo3917c() {
        return this.f3394a;
    }

    /* renamed from: c1 */
    public void mo3918c1() {
        for (C0506o oVar : this.f3401a) {
            if (oVar != null) {
                oVar.mo3964e();
            }
        }
    }

    /* renamed from: d0 */
    public abstract void mo3919d0();

    /* renamed from: d1 */
    public boolean mo3920d1(int i) {
        C0506o oVar = this.f3401a[i];
        if (oVar != null) {
            return oVar.mo3964e();
        }
        return false;
    }

    /* renamed from: e1 */
    public boolean mo3921e1(int i, LiveData<?> liveData) {
        this.f3405e = true;
        try {
            return mo3926j1(i, liveData, f3384d);
        } finally {
            this.f3405e = false;
        }
    }

    /* renamed from: f1 */
    public boolean mo3922f1(int i, C0519f fVar) {
        return mo3926j1(i, fVar, f3378a);
    }

    /* renamed from: g1 */
    public boolean mo3923g1(int i, C0523i iVar) {
        return mo3926j1(i, iVar, f3381b);
    }

    /* renamed from: i0 */
    public abstract boolean mo3924i0(int i, Object obj, int i2);

    /* renamed from: i1 */
    public boolean mo3925i1(int i, C0525j jVar) {
        return mo3926j1(i, jVar, f3383c);
    }

    /* renamed from: j1 */
    public final boolean mo3926j1(int i, Object obj, C0500i iVar) {
        if (obj == null) {
            return mo3920d1(i);
        }
        C0506o oVar = this.f3401a[i];
        if (oVar == null) {
            mo3930t0(i, obj, iVar);
            return true;
        } else if (oVar.mo3961b() == obj) {
            return false;
        } else {
            mo3920d1(i);
            mo3930t0(i, obj, iVar);
            return true;
        }
    }

    /* renamed from: p */
    public void mo3927p(@mr2 bv2 bv2) {
        if (this.f3398a == null) {
            this.f3398a = new C0512c<>(f3379a);
        }
        this.f3398a.mo3974a(bv2);
    }

    /* renamed from: s */
    public void mo3928s(Class<?> cls) {
        if (this.f3395a == null) {
            throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
        }
    }

    /* renamed from: t */
    public abstract void mo3929t();

    /* renamed from: t0 */
    public void mo3930t0(int i, Object obj, C0500i iVar) {
        if (obj != null) {
            C0506o oVar = this.f3401a[i];
            if (oVar == null) {
                oVar = iVar.mo3937a(this, i);
                this.f3401a[i] = oVar;
                a32 a32 = this.f3399a;
                if (a32 != null) {
                    oVar.mo3962c(a32);
                }
            }
            oVar.mo3963d(obj);
        }
    }

    /* renamed from: u */
    public final void mo3931u() {
        if (this.f3404d) {
            mo3933v0();
        } else if (mo3915b0()) {
            this.f3404d = true;
            this.f3403c = false;
            C0512c<bv2, ViewDataBinding, Void> cVar = this.f3398a;
            if (cVar != null) {
                cVar.mo3982h(this, 1, null);
                if (this.f3403c) {
                    this.f3398a.mo3982h(this, 2, null);
                }
            }
            if (!this.f3403c) {
                mo3929t();
                C0512c<bv2, ViewDataBinding, Void> cVar2 = this.f3398a;
                if (cVar2 != null) {
                    cVar2.mo3982h(this, 3, null);
                }
            }
            this.f3404d = false;
        }
    }

    /* renamed from: u0 */
    public void mo3932u0(@mr2 bv2 bv2) {
        C0512c<bv2, ViewDataBinding, Void> cVar = this.f3398a;
        if (cVar != null) {
            cVar.mo3987m(bv2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (f3385f == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f3393a.postFrameCallback(r2.f3392a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.f3391a.post(r2.f3400a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3933v0() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.f3397a
            if (r0 == 0) goto L_0x0008
            r0.mo3933v0()
            goto L_0x003b
        L_0x0008:
            com.onedelhi.secure.a32 r0 = r2.f3399a
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.e r0 = r0.getLifecycle()
            androidx.lifecycle.e$c r0 = r0.mo4959b()
            androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.STARTED
            boolean r0 = r0.mo4962a(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f3402b     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f3402b = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = f3385f
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f3393a
            android.view.Choreographer$FrameCallback r1 = r2.f3392a
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.f3391a
            java.lang.Runnable r1 = r2.f3400a
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mo3933v0():void");
    }

    /* renamed from: w */
    public void mo3934w() {
        ViewDataBinding viewDataBinding = this.f3397a;
        if (viewDataBinding == null) {
            mo3931u();
        } else {
            viewDataBinding.mo3934w();
        }
    }

    /* renamed from: z */
    public void mo3935z() {
        mo3929t();
    }
}
