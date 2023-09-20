package com.onedelhi.secure;

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

public class lu4 implements qu4 {

    /* renamed from: a */
    public C2784a f15625a;

    /* renamed from: com.onedelhi.secure.lu4$a */
    public static class C2784a extends ViewGroup {

        /* renamed from: a */
        public static Method f15626a;

        /* renamed from: a */
        public View f15627a;

        /* renamed from: a */
        public ViewGroup f15628a;

        /* renamed from: a */
        public lu4 f15629a;

        /* renamed from: a */
        public ArrayList<Drawable> f15630a = null;

        /* renamed from: b */
        public boolean f15631b;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f15626a = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public C2784a(Context context, ViewGroup viewGroup, View view, lu4 lu4) {
            super(context);
            this.f15628a = viewGroup;
            this.f15627a = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f15629a = lu4;
        }

        /* renamed from: a */
        public void mo19886a(Drawable drawable) {
            mo19888c();
            if (this.f15630a == null) {
                this.f15630a = new ArrayList<>();
            }
            if (!this.f15630a.contains(drawable)) {
                this.f15630a.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo19887b(View view) {
            mo19888c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f15628a || viewGroup.getParent() == null || !jt4.m18896O0(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f15628a.getLocationOnScreen(iArr2);
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
        public final void mo19888c() {
            if (this.f15631b) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        public final void mo19889d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f15630a;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f15631b = true;
                    this.f15628a.removeView(this);
                }
            }
        }

        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f15628a.getLocationOnScreen(iArr);
            this.f15627a.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f15627a.getWidth(), this.f15627a.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f15630a;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f15630a.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public final void mo19892e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f15628a.getLocationOnScreen(iArr2);
            this.f15627a.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
        /* renamed from: f */
        public ViewParent mo19893f(int i, int i2, Rect rect) {
            if (!(this.f15628a instanceof ViewGroup) || f15626a == null) {
                return null;
            }
            try {
                mo19892e(new int[2]);
                f15626a.invoke(this.f15628a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), rect});
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
        public void mo19894g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f15630a;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                mo19889d();
            }
        }

        /* renamed from: h */
        public void mo19895h(View view) {
            super.removeView(view);
            mo19889d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f15628a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f15628a instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                mo19892e(iArr2);
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
            r0 = r1.f15630a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(@com.onedelhi.secure.mr2 android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f15630a
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
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lu4.C2784a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public lu4(Context context, ViewGroup viewGroup, View view) {
        this.f15625a = new C2784a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    public static lu4 m20990e(View view) {
        ViewGroup f = m20991f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C2784a) {
                return ((C2784a) childAt).f15629a;
            }
        }
        return new rt4(f.getContext(), f, view);
    }

    /* renamed from: f */
    public static ViewGroup m20991f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo19884b(@mr2 Drawable drawable) {
        this.f15625a.mo19886a(drawable);
    }

    /* renamed from: c */
    public void mo19885c(@mr2 Drawable drawable) {
        this.f15625a.mo19894g(drawable);
    }
}
