package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.onedelhi.secure.za3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class qp0 extends ListView {

    /* renamed from: s */
    public static final int f19276s = -1;

    /* renamed from: t */
    public static final int f19277t = -1;

    /* renamed from: a */
    public final Rect f19278a = new Rect();

    /* renamed from: a */
    public k42 f19279a;

    /* renamed from: a */
    public C3316c f19280a;

    /* renamed from: a */
    public C3317d f19281a;

    /* renamed from: a */
    public vu4 f19282a;

    /* renamed from: a */
    public Field f19283a;

    /* renamed from: b */
    public boolean f19284b;

    /* renamed from: c */
    public boolean f19285c;

    /* renamed from: d */
    public boolean f19286d;

    /* renamed from: n */
    public int f19287n = 0;

    /* renamed from: o */
    public int f19288o = 0;

    /* renamed from: p */
    public int f19289p = 0;

    /* renamed from: q */
    public int f19290q = 0;

    /* renamed from: r */
    public int f19291r;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.qp0$a */
    public static class C3314a {
        @pn0
        /* renamed from: a */
        public static void m25888a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.qp0$b */
    public static class C3315b {

        /* renamed from: a */
        public static Method f19292a;

        /* renamed from: a */
        public static boolean f19293a = true;

        /* renamed from: b */
        public static Method f19294b;

        /* renamed from: c */
        public static Method f19295c;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f19292a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f19294b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f19295c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m25889a() {
            return f19293a;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static void m25890b(qp0 qp0, int i, View view) {
            try {
                f19292a.invoke(qp0, new Object[]{Integer.valueOf(i), view, Boolean.FALSE, -1, -1});
                f19294b.invoke(qp0, new Object[]{Integer.valueOf(i)});
                f19295c.invoke(qp0, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.qp0$c */
    public static class C3316c extends mp0 {

        /* renamed from: b */
        public boolean f19296b = true;

        public C3316c(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: c */
        public void mo23292c(boolean z) {
            this.f19296b = z;
        }

        public void draw(Canvas canvas) {
            if (this.f19296b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f19296b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f19296b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f19296b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f19296b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.qp0$d */
    public class C3317d implements Runnable {
        public C3317d() {
        }

        /* renamed from: a */
        public void mo23293a() {
            qp0 qp0 = qp0.this;
            qp0.f19281a = null;
            qp0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo23294b() {
            qp0.this.post(this);
        }

        public void run() {
            qp0 qp0 = qp0.this;
            qp0.f19281a = null;
            qp0.drawableStateChanged();
        }
    }

    public qp0(@mr2 Context context, boolean z) {
        super(context, (AttributeSet) null, za3.C4057b.dropDownListViewStyle);
        this.f19285c = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f19283a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo23278a() {
        this.f19286d = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f19291r - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        vu4 vu4 = this.f19282a;
        if (vu4 != null) {
            vu4.mo26356d();
            this.f19282a = null;
        }
    }

    /* renamed from: b */
    public final void mo23279b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void mo23280c(Canvas canvas) {
        Drawable selector;
        if (!this.f19278a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f19278a);
            selector.draw(canvas);
        }
    }

    /* renamed from: d */
    public int mo2091d(int i, boolean z) {
        int i2;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    i2 = Math.max(0, i);
                    while (i2 < count && !adapter.isEnabled(i2)) {
                        i2++;
                    }
                } else {
                    int min = Math.min(i, count - 1);
                    while (i2 >= 0 && !adapter.isEnabled(i2)) {
                        min = i2 - 1;
                    }
                }
                if (i2 < 0 || i2 >= count) {
                    return -1;
                }
                return i2;
            } else if (i < 0 || i >= count) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    public void dispatchDraw(Canvas canvas) {
        mo23280c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f19281a == null) {
            super.drawableStateChanged();
            mo23287k(true);
            mo23289m();
        }
    }

    /* renamed from: e */
    public int mo2092e(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2093f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.mo23286j(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.mo23279b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.mo23278a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            com.onedelhi.secure.k42 r9 = r7.f19279a
            if (r9 != 0) goto L_0x005a
            com.onedelhi.secure.k42 r9 = new com.onedelhi.secure.k42
            r9.<init>(r7)
            r7.f19279a = r9
        L_0x005a:
            com.onedelhi.secure.k42 r9 = r7.f19279a
            r9.mo21180o(r2)
            com.onedelhi.secure.k42 r9 = r7.f19279a
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            com.onedelhi.secure.k42 r8 = r7.f19279a
            if (r8 == 0) goto L_0x006c
            r8.mo21180o(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qp0.mo2093f(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: g */
    public final void mo23283g(int i, View view) {
        Rect rect = this.f19278a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f19287n;
        rect.top -= this.f19288o;
        rect.right += this.f19289p;
        rect.bottom += this.f19290q;
        try {
            boolean z = this.f19283a.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f19283a.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public final void mo23284h(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        mo23283g(i, view);
        if (z2) {
            Rect rect = this.f19278a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            wo0.m30982k(selector, exactCenterX, exactCenterY);
        }
    }

    public boolean hasFocus() {
        return this.f19285c || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f19285c || super.hasWindowFocus();
    }

    /* renamed from: i */
    public final void mo23285i(int i, View view, float f, float f2) {
        mo23284h(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            wo0.m30982k(selector, f, f2);
        }
    }

    public boolean isFocused() {
        return this.f19285c || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f19285c && this.f19284b) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final void mo23286j(View view, int i, float f, float f2) {
        View childAt;
        this.f19286d = true;
        C3314a.m25888a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f19291r;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f19291r = i;
        C3314a.m25888a(view, f - ((float) view.getLeft()), f2 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        mo23285i(i, view, f, f2);
        mo23287k(false);
        refreshDrawableState();
    }

    /* renamed from: k */
    public final void mo23287k(boolean z) {
        C3316c cVar = this.f19280a;
        if (cVar != null) {
            cVar.mo23292c(z);
        }
    }

    /* renamed from: l */
    public final boolean mo23288l() {
        return this.f19286d;
    }

    /* renamed from: m */
    public final void mo23289m() {
        Drawable selector = getSelector();
        if (selector != null && mo23288l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void onDetachedFromWindow() {
        this.f19281a = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(@mr2 MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f19281a == null) {
            C3317d dVar = new C3317d();
            this.f19281a = dVar;
            dVar.mo23294b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C3315b.m25889a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C3315b.m25890b(this, pointToPosition, childAt);
                    }
                }
                mo23289m();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f19291r = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C3317d dVar = this.f19281a;
        if (dVar != null) {
            dVar.mo23293a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f19284b = z;
    }

    public void setSelector(Drawable drawable) {
        C3316c cVar = drawable != null ? new C3316c(drawable) : null;
        this.f19280a = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f19287n = rect.left;
        this.f19288o = rect.top;
        this.f19289p = rect.right;
        this.f19290q = rect.bottom;
    }
}
