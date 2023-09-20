package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.it2;
import com.onedelhi.secure.j63;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.og3;
import com.onedelhi.secure.qv4;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wt4;
import com.onedelhi.secure.xj4;
import java.util.Map;

public class ChangeBounds extends Transition {

    /* renamed from: a */
    public static final Property<Drawable, PointF> f5437a = new C1004b(PointF.class, "boundsOrigin");

    /* renamed from: a */
    public static og3 f5438a = new og3();

    /* renamed from: a */
    public static final String[] f5439a = {f5445h, f5446i, f5447j, f5448k, f5449l};

    /* renamed from: b */
    public static final Property<C1013k, PointF> f5440b = new C1005c(PointF.class, "topLeft");

    /* renamed from: c */
    public static final Property<C1013k, PointF> f5441c = new C1006d(PointF.class, "bottomRight");

    /* renamed from: d */
    public static final Property<View, PointF> f5442d = new C1007e(PointF.class, "bottomRight");

    /* renamed from: e */
    public static final Property<View, PointF> f5443e = new C1008f(PointF.class, "topLeft");

    /* renamed from: f */
    public static final Property<View, PointF> f5444f = new C1009g(PointF.class, "position");

    /* renamed from: h */
    public static final String f5445h = "android:changeBounds:bounds";

    /* renamed from: i */
    public static final String f5446i = "android:changeBounds:clip";

    /* renamed from: j */
    public static final String f5447j = "android:changeBounds:parent";

    /* renamed from: k */
    public static final String f5448k = "android:changeBounds:windowX";

    /* renamed from: l */
    public static final String f5449l = "android:changeBounds:windowY";

    /* renamed from: c */
    public int[] f5450c = new int[2];

    /* renamed from: f */
    public boolean f5451f = false;

    /* renamed from: g */
    public boolean f5452g = false;

    /* renamed from: androidx.transition.ChangeBounds$a */
    public class C1003a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f5453a;

        /* renamed from: a */
        public final /* synthetic */ BitmapDrawable f5454a;

        /* renamed from: a */
        public final /* synthetic */ View f5455a;

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f5456a;

        public C1003a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f5456a = viewGroup;
            this.f5454a = bitmapDrawable;
            this.f5455a = view;
            this.f5453a = f;
        }

        public void onAnimationEnd(Animator animator) {
            qv4.m26197b(this.f5456a).mo19885c(this.f5454a);
            qv4.m26203h(this.f5455a, this.f5453a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    public static class C1004b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f5458a = new Rect();

        public C1004b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5458a);
            Rect rect = this.f5458a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5458a);
            this.f5458a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5458a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    public static class C1005c extends Property<C1013k, PointF> {
        public C1005c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1013k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1013k kVar, PointF pointF) {
            kVar.mo6836c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    public static class C1006d extends Property<C1013k, PointF> {
        public C1006d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1013k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1013k kVar, PointF pointF) {
            kVar.mo6834a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    public static class C1007e extends Property<View, PointF> {
        public C1007e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            qv4.m26202g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    public static class C1008f extends Property<View, PointF> {
        public C1008f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            qv4.m26202g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    public static class C1009g extends Property<View, PointF> {
        public C1009g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            qv4.m26202g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    public class C1010h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1013k f5459a;
        private C1013k mViewBounds;

        public C1010h(C1013k kVar) {
            this.f5459a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    public class C1011i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f5461a;

        /* renamed from: a */
        public final /* synthetic */ Rect f5462a;

        /* renamed from: a */
        public final /* synthetic */ View f5463a;

        /* renamed from: a */
        public boolean f5465a;

        /* renamed from: b */
        public final /* synthetic */ int f5466b;

        /* renamed from: c */
        public final /* synthetic */ int f5467c;

        /* renamed from: d */
        public final /* synthetic */ int f5468d;

        public C1011i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f5463a = view;
            this.f5462a = rect;
            this.f5461a = i;
            this.f5466b = i2;
            this.f5467c = i3;
            this.f5468d = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5465a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5465a) {
                jt4.m18891M1(this.f5463a, this.f5462a);
                qv4.m26202g(this.f5463a, this.f5461a, this.f5466b, this.f5467c, this.f5468d);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    public class C1012j extends C1085i {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f5469a;

        /* renamed from: a */
        public boolean f5471a = false;

        public C1012j(ViewGroup viewGroup) {
            this.f5469a = viewGroup;
        }

        /* renamed from: b */
        public void mo6830b(@mr2 Transition transition) {
            wt4.m31101d(this.f5469a, true);
        }

        /* renamed from: c */
        public void mo6831c(@mr2 Transition transition) {
            wt4.m31101d(this.f5469a, false);
            this.f5471a = true;
        }

        /* renamed from: d */
        public void mo6832d(@mr2 Transition transition) {
            wt4.m31101d(this.f5469a, false);
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            if (!this.f5471a) {
                wt4.m31101d(this.f5469a, false);
            }
            transition.mo6926h0(this);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    public static class C1013k {

        /* renamed from: a */
        public int f5472a;

        /* renamed from: a */
        public View f5473a;

        /* renamed from: b */
        public int f5474b;

        /* renamed from: c */
        public int f5475c;

        /* renamed from: d */
        public int f5476d;

        /* renamed from: e */
        public int f5477e;

        /* renamed from: f */
        public int f5478f;

        public C1013k(View view) {
            this.f5473a = view;
        }

        /* renamed from: a */
        public void mo6834a(PointF pointF) {
            this.f5475c = Math.round(pointF.x);
            this.f5476d = Math.round(pointF.y);
            int i = this.f5478f + 1;
            this.f5478f = i;
            if (this.f5477e == i) {
                mo6835b();
            }
        }

        /* renamed from: b */
        public final void mo6835b() {
            qv4.m26202g(this.f5473a, this.f5472a, this.f5474b, this.f5475c, this.f5476d);
            this.f5477e = 0;
            this.f5478f = 0;
        }

        /* renamed from: c */
        public void mo6836c(PointF pointF) {
            this.f5472a = Math.round(pointF.x);
            this.f5474b = Math.round(pointF.y);
            int i = this.f5477e + 1;
            this.f5477e = i;
            if (i == this.f5478f) {
                mo6835b();
            }
        }
    }

    public ChangeBounds() {
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5680d);
        boolean e = xj4.m31488e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo6798D0(e);
    }

    /* renamed from: A0 */
    public final void mo6795A0(th4 th4) {
        View view = th4.f20844a;
        if (jt4.m18914U0(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            th4.f20846a.put(f5445h, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            th4.f20846a.put(f5447j, th4.f20844a.getParent());
            if (this.f5452g) {
                th4.f20844a.getLocationInWindow(this.f5450c);
                th4.f20846a.put(f5448k, Integer.valueOf(this.f5450c[0]));
                th4.f20846a.put(f5449l, Integer.valueOf(this.f5450c[1]));
            }
            if (this.f5451f) {
                th4.f20846a.put(f5446i, jt4.m18898P(view));
            }
        }
    }

    /* renamed from: B0 */
    public boolean mo6796B0() {
        return this.f5451f;
    }

    /* renamed from: C0 */
    public final boolean mo6797C0(View view, View view2) {
        if (!this.f5452g) {
            return true;
        }
        th4 J = mo6899J(view, true);
        if (J == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == J.f20844a) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    public void mo6798D0(boolean z) {
        this.f5451f = z;
    }

    @ts2
    /* renamed from: T */
    public String[] mo6799T() {
        return f5439a;
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        mo6795A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        mo6795A0(th4);
    }

    @ts2
    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, @ts2 th4 th4, @ts2 th4 th42) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        th4 th43 = th4;
        th4 th44 = th42;
        if (th43 == null || th44 == null) {
            return null;
        }
        Map<String, Object> map = th43.f20846a;
        Map<String, Object> map2 = th44.f20846a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f5447j);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f5447j);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = th44.f20844a;
        if (mo6797C0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) th43.f20846a.get(f5445h);
            Rect rect3 = (Rect) th44.f20846a.get(f5445h);
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) th43.f20846a.get(f5446i);
            Rect rect5 = (Rect) th44.f20846a.get(f5446i);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f5451f) {
                view = view3;
                qv4.m26202g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo6901L().mo6787a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f5444f;
                    } else {
                        C1013k kVar = new C1013k(view);
                        ObjectAnimator a = it2.m17833a(kVar, f5440b, mo6901L().mo6787a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = it2.m17833a(kVar, f5441c, mo6901L().mo6787a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C1010h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo6901L().mo6787a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f5442d;
                } else {
                    path = mo6901L().mo6787a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f5443e;
                }
                animator = it2.m17833a(view, property, path);
            } else {
                view = view3;
                qv4.m26202g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : it2.m17833a(view, f5444f, mo6901L().mo6787a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    jt4.m18891M1(view, rect);
                    og3 og3 = f5438a;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", og3, objArr);
                    ofObject.addListener(new C1011i(view, rect6, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = C1089k.m7201c(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                wt4.m31101d(viewGroup4, true);
                mo6912a(new C1012j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) th43.f20846a.get(f5448k)).intValue();
        int intValue2 = ((Integer) th43.f20846a.get(f5449l)).intValue();
        int intValue3 = ((Integer) th44.f20846a.get(f5448k)).intValue();
        int intValue4 = ((Integer) th44.f20846a.get(f5449l)).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f5450c);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = qv4.m26198c(view2);
        qv4.m26203h(view2, 0.0f);
        qv4.m26197b(viewGroup).mo19884b(bitmapDrawable);
        PathMotion L = mo6901L();
        int[] iArr = this.f5450c;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{j63.m18184a(f5437a, L.mo6787a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C1003a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
