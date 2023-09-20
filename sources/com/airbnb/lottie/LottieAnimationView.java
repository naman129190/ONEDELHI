package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.C1160a;
import com.onedelhi.secure.ab2;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.fb2;
import com.onedelhi.secure.h02;
import com.onedelhi.secure.hb2;
import com.onedelhi.secure.hi3;
import com.onedelhi.secure.j13;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.la2;
import com.onedelhi.secure.mf3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n91;
import com.onedelhi.secure.na2;
import com.onedelhi.secure.p92;
import com.onedelhi.secure.qa2;
import com.onedelhi.secure.ra2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uo1;
import com.onedelhi.secure.uy3;
import com.onedelhi.secure.va4;
import com.onedelhi.secure.wy1;
import com.onedelhi.secure.xa2;
import com.onedelhi.secure.yq4;
import com.onedelhi.secure.za2;
import com.onedelhi.secure.zy3;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: c */
    public static final String f6006c = LottieAnimationView.class.getSimpleName();

    /* renamed from: d */
    public static final xa2<Throwable> f6007d = new C1153a();
    @ts2

    /* renamed from: a */
    public fb2<la2> f6008a;

    /* renamed from: a */
    public hi3 f6009a = hi3.AUTOMATIC;
    @ts2

    /* renamed from: a */
    public la2 f6010a;

    /* renamed from: a */
    public final qa2 f6011a = new qa2();

    /* renamed from: a */
    public final xa2<la2> f6012a = new C1154b();

    /* renamed from: a */
    public Set<za2> f6013a = new HashSet();

    /* renamed from: b */
    public final xa2<Throwable> f6014b = new C1155c();

    /* renamed from: b */
    public String f6015b;
    @ts2

    /* renamed from: c */
    public xa2<Throwable> f6016c;

    /* renamed from: c */
    public boolean f6017c;

    /* renamed from: d */
    public boolean f6018d = false;

    /* renamed from: e */
    public boolean f6019e = false;

    /* renamed from: f */
    public boolean f6020f = false;

    /* renamed from: g */
    public boolean f6021g = false;

    /* renamed from: h */
    public boolean f6022h = true;
    @dp0

    /* renamed from: n */
    public int f6023n = 0;
    @mf3

    /* renamed from: o */
    public int f6024o;

    /* renamed from: p */
    public int f6025p = 0;

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C1153a implements xa2<Throwable> {
        /* renamed from: a */
        public void onResult(Throwable th) {
            if (yq4.m32608k(th)) {
                p92.m24545f("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public class C1154b implements xa2<la2> {
        public C1154b() {
        }

        /* renamed from: a */
        public void onResult(la2 la2) {
            LottieAnimationView.this.setComposition(la2);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public class C1155c implements xa2<Throwable> {
        public C1155c() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f6023n != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f6023n);
            }
            (LottieAnimationView.this.f6016c == null ? LottieAnimationView.f6007d : LottieAnimationView.this.f6016c).onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    public class C1156d extends hb2<T> {

        /* renamed from: a */
        public final /* synthetic */ zy3 f6029a;

        public C1156d(zy3 zy3) {
            this.f6029a = zy3;
        }

        /* renamed from: a */
        public T mo7444a(ra2<T> ra2) {
            return this.f6029a.mo28193a(ra2);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$e */
    public static /* synthetic */ class C1157e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6030a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.hi3[] r0 = com.onedelhi.secure.hi3.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6030a = r0
                com.onedelhi.secure.hi3 r1 = com.onedelhi.secure.hi3.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6030a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.hi3 r1 = com.onedelhi.secure.hi3.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6030a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.hi3 r1 = com.onedelhi.secure.hi3.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C1157e.<clinit>():void");
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$f */
    public static class C1158f extends View.BaseSavedState {
        public static final Parcelable.Creator<C1158f> CREATOR = new C1159a();

        /* renamed from: a */
        public float f6031a;

        /* renamed from: b */
        public String f6032b;

        /* renamed from: b */
        public boolean f6033b;

        /* renamed from: c */
        public String f6034c;

        /* renamed from: n */
        public int f6035n;

        /* renamed from: o */
        public int f6036o;

        /* renamed from: p */
        public int f6037p;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$f$a */
        public class C1159a implements Parcelable.Creator<C1158f> {
            /* renamed from: a */
            public C1158f createFromParcel(Parcel parcel) {
                return new C1158f(parcel, (C1153a) null);
            }

            /* renamed from: b */
            public C1158f[] newArray(int i) {
                return new C1158f[i];
            }
        }

        public C1158f(Parcel parcel) {
            super(parcel);
            this.f6032b = parcel.readString();
            this.f6031a = parcel.readFloat();
            this.f6033b = parcel.readInt() != 1 ? false : true;
            this.f6034c = parcel.readString();
            this.f6036o = parcel.readInt();
            this.f6037p = parcel.readInt();
        }

        public /* synthetic */ C1158f(Parcel parcel, C1153a aVar) {
            this(parcel);
        }

        public C1158f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6032b);
            parcel.writeFloat(this.f6031a);
            parcel.writeInt(this.f6033b ? 1 : 0);
            parcel.writeString(this.f6034c);
            parcel.writeInt(this.f6036o);
            parcel.writeInt(this.f6037p);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        mo7396s((AttributeSet) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo7396s(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo7396s(attributeSet);
    }

    private void setCompositionTask(fb2<la2> fb2) {
        mo7385m();
        mo7384l();
        this.f6008a = fb2.mo15936f(this.f6012a).mo15935e(this.f6014b);
    }

    /* renamed from: A */
    public void mo7356A() {
        this.f6011a.mo22988V();
    }

    /* renamed from: B */
    public void mo7357B(Animator.AnimatorListener animatorListener) {
        this.f6011a.mo22989W(animatorListener);
    }

    /* renamed from: C */
    public boolean mo7358C(@mr2 za2 za2) {
        return this.f6013a.remove(za2);
    }

    /* renamed from: D */
    public void mo7359D(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6011a.mo22990X(animatorUpdateListener);
    }

    /* renamed from: E */
    public List<wy1> mo7360E(wy1 wy1) {
        return this.f6011a.mo22991Y(wy1);
    }

    @bc2
    /* renamed from: F */
    public void mo7361F() {
        if (isShown()) {
            this.f6011a.mo22992Z();
            mo7393p();
            return;
        }
        this.f6018d = false;
        this.f6019e = true;
    }

    /* renamed from: G */
    public void mo7362G() {
        this.f6011a.mo22993a0();
    }

    @ts2
    /* renamed from: H */
    public Bitmap mo7363H(String str, @ts2 Bitmap bitmap) {
        return this.f6011a.mo22966B0(str, bitmap);
    }

    public void buildDrawingCache(boolean z) {
        h02.m16420a("buildDrawingCache");
        this.f6025p++;
        super.buildDrawingCache(z);
        if (this.f6025p == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(hi3.HARDWARE);
        }
        this.f6025p--;
        h02.m16421b("buildDrawingCache");
    }

    /* renamed from: f */
    public void mo7365f(Animator.AnimatorListener animatorListener) {
        this.f6011a.mo22999f(animatorListener);
    }

    /* renamed from: g */
    public void mo7366g(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6011a.mo23001g(animatorUpdateListener);
    }

    @ts2
    public la2 getComposition() {
        return this.f6010a;
    }

    public long getDuration() {
        la2 la2 = this.f6010a;
        if (la2 != null) {
            return (long) la2.mo19375d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f6011a.mo23046w();
    }

    @ts2
    public String getImageAssetsFolder() {
        return this.f6011a.mo23052z();
    }

    public float getMaxFrame() {
        return this.f6011a.mo22963A();
    }

    public float getMinFrame() {
        return this.f6011a.mo22967C();
    }

    @ts2
    public j13 getPerformanceTracker() {
        return this.f6011a.mo22969D();
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    public float getProgress() {
        return this.f6011a.mo22971E();
    }

    public int getRepeatCount() {
        return this.f6011a.mo22972F();
    }

    public int getRepeatMode() {
        return this.f6011a.mo22973G();
    }

    public float getScale() {
        return this.f6011a.mo22974H();
    }

    public float getSpeed() {
        return this.f6011a.mo22975I();
    }

    /* renamed from: h */
    public boolean mo7379h(@mr2 za2 za2) {
        la2 la2 = this.f6010a;
        if (la2 != null) {
            za2.mo27856a(la2);
        }
        return this.f6013a.add(za2);
    }

    /* renamed from: i */
    public <T> void mo7380i(wy1 wy1, T t, hb2<T> hb2) {
        this.f6011a.mo23007h(wy1, t, hb2);
    }

    public void invalidateDrawable(@mr2 Drawable drawable) {
        Drawable drawable2 = getDrawable();
        qa2 qa2 = this.f6011a;
        if (drawable2 == qa2) {
            super.invalidateDrawable(qa2);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public <T> void mo7382j(wy1 wy1, T t, zy3<T> zy3) {
        this.f6011a.mo23007h(wy1, t, new C1156d(zy3));
    }

    @bc2
    /* renamed from: k */
    public void mo7383k() {
        this.f6020f = false;
        this.f6019e = false;
        this.f6018d = false;
        this.f6011a.mo23016k();
        mo7393p();
    }

    /* renamed from: l */
    public final void mo7384l() {
        fb2<la2> fb2 = this.f6008a;
        if (fb2 != null) {
            fb2.mo15941k(this.f6012a);
            this.f6008a.mo15940j(this.f6014b);
        }
    }

    /* renamed from: m */
    public final void mo7385m() {
        this.f6010a = null;
        this.f6011a.mo23018l();
    }

    /* renamed from: n */
    public void mo7386n() {
        this.f6011a.mo23020m();
    }

    /* renamed from: o */
    public void mo7387o(boolean z) {
        this.f6011a.mo23028q(z);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6021g || this.f6020f) {
            mo7437x();
            this.f6021g = false;
            this.f6020f = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void onDetachedFromWindow() {
        if (mo7433t()) {
            mo7383k();
            this.f6020f = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1158f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1158f fVar = (C1158f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        String str = fVar.f6032b;
        this.f6015b = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f6015b);
        }
        int i = fVar.f6035n;
        this.f6024o = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(fVar.f6031a);
        if (fVar.f6033b) {
            mo7437x();
        }
        this.f6011a.mo23002g0(fVar.f6034c);
        setRepeatMode(fVar.f6036o);
        setRepeatCount(fVar.f6037p);
    }

    public Parcelable onSaveInstanceState() {
        C1158f fVar = new C1158f(super.onSaveInstanceState());
        fVar.f6032b = this.f6015b;
        fVar.f6035n = this.f6024o;
        fVar.f6031a = this.f6011a.mo22971E();
        fVar.f6033b = this.f6011a.mo22980N() || (!jt4.m18896O0(this) && this.f6020f);
        fVar.f6034c = this.f6011a.mo23052z();
        fVar.f6036o = this.f6011a.mo22973G();
        fVar.f6037p = this.f6011a.mo22972F();
        return fVar;
    }

    public void onVisibilityChanged(@mr2 View view, int i) {
        if (this.f6017c) {
            if (isShown()) {
                if (this.f6019e) {
                    mo7361F();
                } else if (this.f6018d) {
                    mo7437x();
                }
                this.f6019e = false;
                this.f6018d = false;
            } else if (mo7433t()) {
                mo7436w();
                this.f6019e = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3 != false) goto L_0x0036;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7393p() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C1157e.f6030a
            com.onedelhi.secure.hi3 r1 = r5.f6009a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0036
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = 1
            goto L_0x0036
        L_0x0015:
            com.onedelhi.secure.la2 r0 = r5.f6010a
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo19389r()
            if (r0 == 0) goto L_0x0027
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0027
            goto L_0x0034
        L_0x0027:
            com.onedelhi.secure.la2 r0 = r5.f6010a
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mo19384m()
            r4 = 4
            if (r0 <= r4) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            if (r3 == 0) goto L_0x0013
        L_0x0036:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x0040
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.mo7393p():void");
    }

    /* renamed from: q */
    public boolean mo7394q() {
        return this.f6011a.mo22978L();
    }

    /* renamed from: r */
    public boolean mo7395r() {
        return this.f6011a.mo22979M();
    }

    /* renamed from: s */
    public final void mo7396s(@ts2 AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1160a.C1172l.LottieAnimationView);
        boolean z = false;
        if (!isInEditMode()) {
            this.f6022h = obtainStyledAttributes.getBoolean(C1160a.C1172l.LottieAnimationView_lottie_cacheComposition, true);
            int i = C1160a.C1172l.LottieAnimationView_lottie_rawRes;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            int i2 = C1160a.C1172l.LottieAnimationView_lottie_fileName;
            boolean hasValue2 = obtainStyledAttributes.hasValue(i2);
            int i3 = C1160a.C1172l.LottieAnimationView_lottie_url;
            boolean hasValue3 = obtainStyledAttributes.hasValue(i3);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(i, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(i2);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(i3)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(C1160a.C1172l.LottieAnimationView_lottie_fallbackRes, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(C1160a.C1172l.LottieAnimationView_lottie_autoPlay, false)) {
            this.f6020f = true;
            this.f6021g = true;
        }
        if (obtainStyledAttributes.getBoolean(C1160a.C1172l.LottieAnimationView_lottie_loop, false)) {
            this.f6011a.mo23040t0(-1);
        }
        int i4 = C1160a.C1172l.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i4)) {
            setRepeatMode(obtainStyledAttributes.getInt(i4, 1));
        }
        int i5 = C1160a.C1172l.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatCount(obtainStyledAttributes.getInt(i5, -1));
        }
        int i6 = C1160a.C1172l.LottieAnimationView_lottie_speed;
        if (obtainStyledAttributes.hasValue(i6)) {
            setSpeed(obtainStyledAttributes.getFloat(i6, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C1160a.C1172l.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(C1160a.C1172l.LottieAnimationView_lottie_progress, 0.0f));
        mo7387o(obtainStyledAttributes.getBoolean(C1160a.C1172l.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i7 = C1160a.C1172l.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i7)) {
            uy3 uy3 = new uy3(obtainStyledAttributes.getColor(i7, 0));
            mo7380i(new wy1("**"), ab2.f8954a, new hb2(uy3));
        }
        int i8 = C1160a.C1172l.LottieAnimationView_lottie_scale;
        if (obtainStyledAttributes.hasValue(i8)) {
            this.f6011a.mo23047w0(obtainStyledAttributes.getFloat(i8, 1.0f));
        }
        int i9 = C1160a.C1172l.LottieAnimationView_lottie_renderMode;
        if (obtainStyledAttributes.hasValue(i9)) {
            hi3 hi3 = hi3.AUTOMATIC;
            int i10 = obtainStyledAttributes.getInt(i9, hi3.ordinal());
            if (i10 >= hi3.values().length) {
                i10 = hi3.ordinal();
            }
            setRenderMode(hi3.values()[i10]);
        }
        if (getScaleType() != null) {
            this.f6011a.mo23049x0(getScaleType());
        }
        obtainStyledAttributes.recycle();
        qa2 qa2 = this.f6011a;
        if (yq4.m32603f(getContext()) != 0.0f) {
            z = true;
        }
        qa2.mo23053z0(Boolean.valueOf(z));
        mo7393p();
        this.f6017c = true;
    }

    public void setAnimation(@mf3 int i) {
        this.f6024o = i;
        this.f6015b = null;
        setCompositionTask(this.f6022h ? na2.m22558s(getContext(), i) : na2.m22559t(getContext(), i, (String) null));
    }

    public void setAnimation(InputStream inputStream, @ts2 String str) {
        setCompositionTask(na2.m22549j(inputStream, str));
    }

    public void setAnimation(String str) {
        this.f6015b = str;
        this.f6024o = 0;
        setCompositionTask(this.f6022h ? na2.m22544e(getContext(), str) : na2.m22545f(getContext(), str, (String) null));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromJson(String str, @ts2 String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f6022h ? na2.m22562w(getContext(), str) : na2.m22563x(getContext(), str, (String) null));
    }

    public void setAnimationFromUrl(String str, @ts2 String str2) {
        setCompositionTask(na2.m22563x(getContext(), str, str2));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f6011a.mo22994b0(z);
    }

    public void setCacheComposition(boolean z) {
        this.f6022h = z;
    }

    public void setComposition(@mr2 la2 la2) {
        if (h02.f12851a) {
            String str = f6006c;
            Log.v(str, "Set Composition \n" + la2);
        }
        this.f6011a.setCallback(this);
        this.f6010a = la2;
        boolean c0 = this.f6011a.mo22995c0(la2);
        mo7393p();
        if (getDrawable() != this.f6011a || c0) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (za2 a : this.f6013a) {
                a.mo27856a(la2);
            }
        }
    }

    public void setFailureListener(@ts2 xa2<Throwable> xa2) {
        this.f6016c = xa2;
    }

    public void setFallbackResource(@dp0 int i) {
        this.f6023n = i;
    }

    public void setFontAssetDelegate(n91 n91) {
        this.f6011a.mo22996d0(n91);
    }

    public void setFrame(int i) {
        this.f6011a.mo22998e0(i);
    }

    public void setImageAssetDelegate(uo1 uo1) {
        this.f6011a.mo23000f0(uo1);
    }

    public void setImageAssetsFolder(String str) {
        this.f6011a.mo23002g0(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        mo7384l();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        mo7384l();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        mo7384l();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f6011a.mo23008h0(i);
    }

    public void setMaxFrame(String str) {
        this.f6011a.mo23010i0(str);
    }

    public void setMaxProgress(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f6011a.mo23015j0(f);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f6011a.mo23017k0(i, i2);
    }

    public void setMinAndMaxFrame(String str) {
        this.f6011a.mo23019l0(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f6011a.mo23021m0(str, str2, z);
    }

    public void setMinAndMaxProgress(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
        this.f6011a.mo23023n0(f, f2);
    }

    public void setMinFrame(int i) {
        this.f6011a.mo23025o0(i);
    }

    public void setMinFrame(String str) {
        this.f6011a.mo23027p0(str);
    }

    public void setMinProgress(float f) {
        this.f6011a.mo23029q0(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f6011a.mo23031r0(z);
    }

    public void setProgress(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f6011a.mo23033s0(f);
    }

    public void setRenderMode(hi3 hi3) {
        this.f6009a = hi3;
        mo7393p();
    }

    public void setRepeatCount(int i) {
        this.f6011a.mo23040t0(i);
    }

    public void setRepeatMode(int i) {
        this.f6011a.mo23042u0(i);
    }

    public void setSafeMode(boolean z) {
        this.f6011a.mo23045v0(z);
    }

    public void setScale(float f) {
        this.f6011a.mo23047w0(f);
        if (getDrawable() == this.f6011a) {
            setImageDrawable((Drawable) null);
            setImageDrawable(this.f6011a);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        qa2 qa2 = this.f6011a;
        if (qa2 != null) {
            qa2.mo23049x0(scaleType);
        }
    }

    public void setSpeed(float f) {
        this.f6011a.mo23051y0(f);
    }

    public void setTextDelegate(va4 va4) {
        this.f6011a.mo22964A0(va4);
    }

    /* renamed from: t */
    public boolean mo7433t() {
        return this.f6011a.mo22980N();
    }

    /* renamed from: u */
    public boolean mo7434u() {
        return this.f6011a.mo22983Q();
    }

    @Deprecated
    /* renamed from: v */
    public void mo7435v(boolean z) {
        this.f6011a.mo23040t0(z ? -1 : 0);
    }

    @bc2
    /* renamed from: w */
    public void mo7436w() {
        this.f6021g = false;
        this.f6020f = false;
        this.f6019e = false;
        this.f6018d = false;
        this.f6011a.mo22985S();
        mo7393p();
    }

    @bc2
    /* renamed from: x */
    public void mo7437x() {
        if (isShown()) {
            this.f6011a.mo22986T();
            mo7393p();
            return;
        }
        this.f6018d = true;
    }

    /* renamed from: y */
    public void mo7438y() {
        this.f6011a.mo22987U();
    }

    /* renamed from: z */
    public void mo7439z() {
        this.f6013a.clear();
    }
}
