package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.onedelhi.secure.hl3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class mu4 implements pu4 {

    /* renamed from: a */
    public C6144a f32284a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* renamed from: com.onedelhi.secure.mu4$a */
    public static class C6144a extends ViewGroup {

        /* renamed from: a */
        public static Method f32285a;

        /* renamed from: a */
        public View f32286a;

        /* renamed from: a */
        public ViewGroup f32287a;

        /* renamed from: a */
        public mu4 f32288a;

        /* renamed from: a */
        public ArrayList<Drawable> f32289a = null;

        /* renamed from: b */
        public boolean f32290b;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f32285a = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public C6144a(Context context, ViewGroup viewGroup, View view, mu4 mu4) {
            super(context);
            this.f32287a = viewGroup;
            this.f32286a = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f32288a = mu4;
        }

        /* renamed from: a */
        public void mo40794a(Drawable drawable) {
            mo40796c();
            if (this.f32289a == null) {
                this.f32289a = new ArrayList<>();
            }
            if (!this.f32289a.contains(drawable)) {
                this.f32289a.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo40795b(View view) {
            mo40796c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f32287a || viewGroup.getParent() == null || !jt4.m18896O0(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f32287a.getLocationOnScreen(iArr2);
                    jt4.m18949e1(view, iArr[0] - iArr2[0]);
                    jt4.m18953f1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* renamed from: c */
        public final void mo40796c() {
            if (this.f32290b) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        public final void mo40797d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f32289a;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f32290b = true;
                    this.f32287a.removeView(this);
                }
            }
        }

        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f32287a.getLocationOnScreen(iArr);
            this.f32286a.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f32286a.getWidth(), this.f32286a.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f32289a;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f32289a.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public final void mo40800e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f32287a.getLocationOnScreen(iArr2);
            this.f32286a.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
        /* renamed from: f */
        public ViewParent mo40801f(int i, int i2, Rect rect) {
            if (this.f32287a == null || f32285a == null) {
                return null;
            }
            try {
                mo40800e(new int[2]);
                f32285a.invoke(this.f32287a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), rect});
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* renamed from: g */
        public void mo40802g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f32289a;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                mo40797d();
            }
        }

        /* renamed from: h */
        public void mo40803h(View view) {
            super.removeView(view);
            mo40797d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f32287a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f32287a != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                mo40800e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(@mr2 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f32289a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(@com.onedelhi.secure.mr2 android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f32289a
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mu4.C6144a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public mu4(Context context, ViewGroup viewGroup, View view) {
        this.f32284a = new C6144a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    public static mu4 m57567e(View view) {
        ViewGroup g = pv4.m61667g(view);
        if (g == null) {
            return null;
        }
        int childCount = g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = g.getChildAt(i);
            if (childAt instanceof C6144a) {
                return ((C6144a) childAt).f32288a;
            }
        }
        return new qt4(g.getContext(), g, view);
    }

    /* renamed from: b */
    public void mo40792b(@mr2 Drawable drawable) {
        this.f32284a.mo40794a(drawable);
    }

    /* renamed from: c */
    public void mo40793c(@mr2 Drawable drawable) {
        this.f32284a.mo40802g(drawable);
    }
}
