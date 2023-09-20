package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C3087os;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.fy2;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.me0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.ts2;
import java.util.Calendar;
import java.util.Iterator;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f8204a;

    /* renamed from: b */
    public final boolean f8205b;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C1562a extends C3884x1 {
        public C1562a() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12553Y0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8204a = fq4.m15213v();
        if (C1590g.m10177d0(getContext())) {
            setNextFocusLeftId(fd3.C2158h.cancel_button);
            setNextFocusRightId(fd3.C2158h.confirm_button);
        }
        this.f8205b = C1590g.m10178e0(getContext());
        jt4.m18849B1(this, new C1562a());
    }

    /* renamed from: d */
    public static int m10081d(@mr2 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    public static boolean m10082e(@ts2 Long l, @ts2 Long l2, @ts2 Long l3, @ts2 Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: a */
    public final void mo11977a(int i, Rect rect) {
        int b;
        if (i == 33) {
            b = getAdapter().mo12115i();
        } else if (i == 130) {
            b = getAdapter().mo12103b();
        } else {
            super.onFocusChanged(true, i, rect);
            return;
        }
        setSelection(b);
    }

    @mr2
    /* renamed from: b */
    public C1598h getAdapter() {
        return (C1598h) super.getAdapter();
    }

    /* renamed from: c */
    public final View mo11979c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(@mr2 Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C1598h b = getAdapter();
        me0<?> me0 = b.f8336a;
        C3087os osVar = b.f8337a;
        int max = Math.max(b.mo12103b(), getFirstVisiblePosition());
        int min = Math.min(b.mo12115i(), getLastVisiblePosition());
        Long c = b.getItem(max);
        Long c2 = b.getItem(min);
        Iterator<fy2<Long, Long>> it = me0.mo18820V1().iterator();
        while (it.hasNext()) {
            fy2 next = it.next();
            F f = next.f12385a;
            if (f == null) {
                materialCalendarGridView = this;
            } else if (next.f12386b != null) {
                long longValue = ((Long) f).longValue();
                long longValue2 = ((Long) next.f12386b).longValue();
                if (!m10082e(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean l = pv4.m61672l(this);
                    if (longValue < c.longValue()) {
                        if (b.mo12107f(max)) {
                            i8 = 0;
                        } else {
                            View c3 = materialCalendarGridView.mo11979c(max - 1);
                            i8 = !l ? c3.getRight() : c3.getLeft();
                        }
                        i = i8;
                        i2 = max;
                    } else {
                        materialCalendarGridView.f8204a.setTimeInMillis(longValue);
                        i2 = b.mo12102a(materialCalendarGridView.f8204a.get(5));
                        i = m10081d(materialCalendarGridView.mo11979c(i2));
                    }
                    if (longValue2 > c2.longValue()) {
                        if (b.mo12108g(min)) {
                            i7 = getWidth();
                        } else {
                            View c4 = materialCalendarGridView.mo11979c(min);
                            i7 = !l ? c4.getRight() : c4.getLeft();
                        }
                        i3 = i7;
                        i4 = min;
                    } else {
                        materialCalendarGridView.f8204a.setTimeInMillis(longValue2);
                        i4 = b.mo12102a(materialCalendarGridView.f8204a.get(5));
                        i3 = m10081d(materialCalendarGridView.mo11979c(i4));
                    }
                    int itemId = (int) b.getItemId(i2);
                    int i9 = max;
                    int i10 = min;
                    int itemId2 = (int) b.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        C1598h hVar = b;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c5 = materialCalendarGridView.mo11979c(numColumns);
                        int top = c5.getTop() + osVar.f18085a.mo19184e();
                        Iterator<fy2<Long, Long>> it2 = it;
                        int bottom = c5.getBottom() - osVar.f18085a.mo19181b();
                        if (!l) {
                            i5 = numColumns > i2 ? 0 : i;
                            i6 = i4 > numColumns2 ? getWidth() : i3;
                        } else {
                            int i11 = i4 > numColumns2 ? 0 : i3;
                            int width = numColumns > i2 ? getWidth() : i;
                            i5 = i11;
                            i6 = width;
                        }
                        canvas.drawRect((float) i5, (float) top, (float) i6, (float) bottom, osVar.f18084a);
                        itemId++;
                        materialCalendarGridView = this;
                        itemId2 = itemId2;
                        b = hVar;
                        it = it2;
                    }
                    materialCalendarGridView = this;
                    max = i9;
                    min = i10;
                }
            }
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            mo11977a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo12103b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo12103b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f8205b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(jt4.f14542r, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C1598h) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C1598h.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo12103b()) {
            i = getAdapter().mo12103b();
        }
        super.setSelection(i);
    }
}
