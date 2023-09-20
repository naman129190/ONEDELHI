package com.onedelhi.secure;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13187b})
public class fr1 implements View.OnTouchListener {
    @mr2

    /* renamed from: a */
    public final Dialog f12281a;

    /* renamed from: n */
    public final int f12282n;

    /* renamed from: o */
    public final int f12283o;

    /* renamed from: p */
    public final int f12284p;

    public fr1(@mr2 Dialog dialog, @mr2 Rect rect) {
        this.f12281a = dialog;
        this.f12282n = rect.left;
        this.f12283o = rect.top;
        this.f12284p = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(@mr2 View view, @mr2 MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f12282n + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f12283o + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f12284p;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f12281a.onTouchEvent(obtain);
    }
}
