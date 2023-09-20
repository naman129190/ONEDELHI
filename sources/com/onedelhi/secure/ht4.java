package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ra3;

@C2065el({@C1983dl(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @C1983dl(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @C1983dl(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @C1983dl(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @C1983dl(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @C1983dl(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @C1983dl(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @C1983dl(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @C1983dl(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @C1983dl(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @C1983dl(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @C1983dl(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @C1983dl(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @C1983dl(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @C1983dl(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @C1983dl(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @C1983dl(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @C1983dl(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @C1983dl(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @C1983dl(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @C1983dl(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @C1983dl(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @C1983dl(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @C1983dl(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @C1983dl(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @C1983dl(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
@hl3({hl3.C2354a.LIBRARY})
public class ht4 {

    /* renamed from: a */
    public static final int f13252a = 0;

    /* renamed from: b */
    public static final int f13253b = 1;

    /* renamed from: c */
    public static final int f13254c = 2;

    /* renamed from: com.onedelhi.secure.ht4$a */
    public static class C2362a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C2363b f13255a;

        /* renamed from: a */
        public final /* synthetic */ C2364c f13256a;

        public C2362a(C2363b bVar, C2364c cVar) {
            this.f13255a = bVar;
            this.f13256a = cVar;
        }

        public void onViewAttachedToWindow(View view) {
            C2363b bVar = this.f13255a;
            if (bVar != null) {
                bVar.onViewAttachedToWindow(view);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            C2364c cVar = this.f13256a;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(view);
            }
        }
    }

    @TargetApi(12)
    /* renamed from: com.onedelhi.secure.ht4$b */
    public interface C2363b {
        void onViewAttachedToWindow(View view);
    }

    @TargetApi(12)
    /* renamed from: com.onedelhi.secure.ht4$c */
    public interface C2364c {
        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: a */
    public static int m16921a(float f) {
        int i = (int) (0.5f + f);
        if (i != 0) {
            return i;
        }
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        return i2 > 0 ? 1 : -1;
    }

    @C1717al({"android:background"})
    /* renamed from: b */
    public static void m16922b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @C1717al({"android:onClickListener", "android:clickable"})
    /* renamed from: c */
    public static void m16923c(View view, View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    @C1717al(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    /* renamed from: d */
    public static void m16924d(View view, C2364c cVar, C2363b bVar) {
        C2362a aVar = (cVar == null && bVar == null) ? null : new C2362a(bVar, cVar);
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) n42.m22335b(view, aVar, ra3.C3391g.onAttachStateChangeListener);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @C1717al({"android:onClick", "android:clickable"})
    /* renamed from: e */
    public static void m16925e(View view, View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    @C1717al({"android:onLayoutChange"})
    /* renamed from: f */
    public static void m16926f(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @C1717al({"android:onLongClick", "android:longClickable"})
    /* renamed from: g */
    public static void m16927g(View view, View.OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    @C1717al({"android:onLongClickListener", "android:longClickable"})
    /* renamed from: h */
    public static void m16928h(View view, View.OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    @C1717al({"android:padding"})
    /* renamed from: i */
    public static void m16929i(View view, float f) {
        int a = m16921a(f);
        view.setPadding(a, a, a, a);
    }

    @C1717al({"android:paddingBottom"})
    /* renamed from: j */
    public static void m16930j(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), m16921a(f));
    }

    @C1717al({"android:paddingEnd"})
    /* renamed from: k */
    public static void m16931k(View view, float f) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), m16921a(f), view.getPaddingBottom());
    }

    @C1717al({"android:paddingLeft"})
    /* renamed from: l */
    public static void m16932l(View view, float f) {
        view.setPadding(m16921a(f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @C1717al({"android:paddingRight"})
    /* renamed from: m */
    public static void m16933m(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), m16921a(f), view.getPaddingBottom());
    }

    @C1717al({"android:paddingStart"})
    /* renamed from: n */
    public static void m16934n(View view, float f) {
        view.setPaddingRelative(m16921a(f), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @C1717al({"android:paddingTop"})
    /* renamed from: o */
    public static void m16935o(View view, float f) {
        view.setPadding(view.getPaddingLeft(), m16921a(f), view.getPaddingRight(), view.getPaddingBottom());
    }

    @C1717al({"android:requiresFadingEdge"})
    /* renamed from: p */
    public static void m16936p(View view, int i) {
        boolean z = false;
        boolean z2 = (i & 2) != 0;
        if ((i & 1) != 0) {
            z = true;
        }
        view.setVerticalFadingEdgeEnabled(z2);
        view.setHorizontalFadingEdgeEnabled(z);
    }
}
