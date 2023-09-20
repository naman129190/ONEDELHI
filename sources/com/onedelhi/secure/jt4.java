package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nd3;
import com.onedelhi.secure.px4;
import com.onedelhi.secure.sx4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class jt4 {

    /* renamed from: A */
    public static final int f14501A = 1;

    /* renamed from: B */
    public static final int f14502B = 2;

    /* renamed from: C */
    public static final int f14503C = 4;

    /* renamed from: D */
    public static final int f14504D = 8;

    /* renamed from: E */
    public static final int f14505E = 16;

    /* renamed from: F */
    public static final int f14506F = 32;
    @Deprecated

    /* renamed from: a */
    public static final int f14507a = 0;

    /* renamed from: a */
    public static final dv2 f14508a = it4.f30458a;

    /* renamed from: a */
    public static final C2554e f14509a = new C2554e();

    /* renamed from: a */
    public static final String f14510a = "ViewCompat";

    /* renamed from: a */
    public static ThreadLocal<Rect> f14511a = null;

    /* renamed from: a */
    public static Field f14512a = null;

    /* renamed from: a */
    public static Method f14513a = null;

    /* renamed from: a */
    public static WeakHashMap<View, String> f14514a = null;

    /* renamed from: a */
    public static final AtomicInteger f14515a = new AtomicInteger(1);

    /* renamed from: a */
    public static boolean f14516a = false;

    /* renamed from: a */
    public static final int[] f14517a = {nd3.C2969e.accessibility_custom_action_0, nd3.C2969e.accessibility_custom_action_1, nd3.C2969e.accessibility_custom_action_2, nd3.C2969e.accessibility_custom_action_3, nd3.C2969e.accessibility_custom_action_4, nd3.C2969e.accessibility_custom_action_5, nd3.C2969e.accessibility_custom_action_6, nd3.C2969e.accessibility_custom_action_7, nd3.C2969e.accessibility_custom_action_8, nd3.C2969e.accessibility_custom_action_9, nd3.C2969e.accessibility_custom_action_10, nd3.C2969e.accessibility_custom_action_11, nd3.C2969e.accessibility_custom_action_12, nd3.C2969e.accessibility_custom_action_13, nd3.C2969e.accessibility_custom_action_14, nd3.C2969e.accessibility_custom_action_15, nd3.C2969e.accessibility_custom_action_16, nd3.C2969e.accessibility_custom_action_17, nd3.C2969e.accessibility_custom_action_18, nd3.C2969e.accessibility_custom_action_19, nd3.C2969e.accessibility_custom_action_20, nd3.C2969e.accessibility_custom_action_21, nd3.C2969e.accessibility_custom_action_22, nd3.C2969e.accessibility_custom_action_23, nd3.C2969e.accessibility_custom_action_24, nd3.C2969e.accessibility_custom_action_25, nd3.C2969e.accessibility_custom_action_26, nd3.C2969e.accessibility_custom_action_27, nd3.C2969e.accessibility_custom_action_28, nd3.C2969e.accessibility_custom_action_29, nd3.C2969e.accessibility_custom_action_30, nd3.C2969e.accessibility_custom_action_31};
    @Deprecated

    /* renamed from: b */
    public static final int f14518b = 1;

    /* renamed from: b */
    public static Field f14519b = null;

    /* renamed from: b */
    public static Method f14520b = null;

    /* renamed from: b */
    public static WeakHashMap<View, vu4> f14521b = null;

    /* renamed from: b */
    public static boolean f14522b = false;
    @Deprecated

    /* renamed from: c */
    public static final int f14523c = 2;

    /* renamed from: c */
    public static Field f14524c = null;

    /* renamed from: c */
    public static Method f14525c = null;

    /* renamed from: c */
    public static boolean f14526c = false;

    /* renamed from: d */
    public static final int f14527d = 0;

    /* renamed from: d */
    public static boolean f14528d = false;

    /* renamed from: e */
    public static final int f14529e = 1;

    /* renamed from: f */
    public static final int f14530f = 2;

    /* renamed from: g */
    public static final int f14531g = 4;

    /* renamed from: h */
    public static final int f14532h = 0;

    /* renamed from: i */
    public static final int f14533i = 1;

    /* renamed from: j */
    public static final int f14534j = 2;
    @Deprecated

    /* renamed from: k */
    public static final int f14535k = 0;
    @Deprecated

    /* renamed from: l */
    public static final int f14536l = 1;
    @Deprecated

    /* renamed from: m */
    public static final int f14537m = 2;

    /* renamed from: n */
    public static final int f14538n = 0;

    /* renamed from: o */
    public static final int f14539o = 1;

    /* renamed from: p */
    public static final int f14540p = 2;

    /* renamed from: q */
    public static final int f14541q = 3;
    @Deprecated

    /* renamed from: r */
    public static final int f14542r = 16777215;
    @Deprecated

    /* renamed from: s */
    public static final int f14543s = -16777216;
    @Deprecated

    /* renamed from: t */
    public static final int f14544t = 16;
    @Deprecated

    /* renamed from: u */
    public static final int f14545u = 16777216;

    /* renamed from: v */
    public static final int f14546v = 0;

    /* renamed from: w */
    public static final int f14547w = 1;

    /* renamed from: x */
    public static final int f14548x = 2;

    /* renamed from: y */
    public static final int f14549y = 0;

    /* renamed from: z */
    public static final int f14550z = 1;

    /* renamed from: com.onedelhi.secure.jt4$a */
    public class C2547a extends C2555f<Boolean> {
        public C2547a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @sj3(28)
        /* renamed from: i */
        public Boolean mo18626d(@mr2 View view) {
            return Boolean.valueOf(C2567q.m19179d(view));
        }

        @sj3(28)
        /* renamed from: j */
        public void mo18627e(@mr2 View view, Boolean bool) {
            C2567q.m19184i(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean mo18628h(Boolean bool, Boolean bool2) {
            return !mo18655a(bool, bool2);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jt4$a0 */
    public @interface C2548a0 {
    }

    /* renamed from: com.onedelhi.secure.jt4$b */
    public class C2549b extends C2555f<CharSequence> {
        public C2549b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @sj3(28)
        /* renamed from: i */
        public CharSequence mo18626d(View view) {
            return C2567q.m19177b(view);
        }

        @sj3(28)
        /* renamed from: j */
        public void mo18627e(View view, CharSequence charSequence) {
            C2567q.m19183h(view, charSequence);
        }

        /* renamed from: k */
        public boolean mo18628h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jt4$b0 */
    public @interface C2550b0 {
    }

    /* renamed from: com.onedelhi.secure.jt4$c */
    public class C2551c extends C2555f<CharSequence> {
        public C2551c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @sj3(30)
        /* renamed from: i */
        public CharSequence mo18626d(View view) {
            return C2569s.m19189a(view);
        }

        @sj3(30)
        /* renamed from: j */
        public void mo18627e(View view, CharSequence charSequence) {
            C2569s.m19191c(view, charSequence);
        }

        /* renamed from: k */
        public boolean mo18628h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: com.onedelhi.secure.jt4$c0 */
    public static class C2552c0 {

        /* renamed from: a */
        public static final ArrayList<WeakReference<View>> f14551a = new ArrayList<>();

        /* renamed from: a */
        public SparseArray<WeakReference<View>> f14552a = null;

        /* renamed from: a */
        public WeakReference<KeyEvent> f14553a = null;
        @ts2

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f14554a = null;

        /* renamed from: a */
        public static C2552c0 m19053a(View view) {
            int i = nd3.C2969e.tag_unhandled_key_event_manager;
            C2552c0 c0Var = (C2552c0) view.getTag(i);
            if (c0Var != null) {
                return c0Var;
            }
            C2552c0 c0Var2 = new C2552c0();
            view.setTag(i, c0Var2);
            return c0Var2;
        }

        /* renamed from: h */
        public static void m19054h(View view) {
            ArrayList<WeakReference<View>> arrayList = f14551a;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f14551a.add(new WeakReference(view));
            }
        }

        /* renamed from: i */
        public static void m19055i(View view) {
            synchronized (f14551a) {
                int i = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f14551a;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i).get() == view) {
                        arrayList.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }

        /* renamed from: b */
        public boolean mo18638b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                mo18643g();
            }
            View c = mo18639c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    mo18640d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        @ts2
        /* renamed from: c */
        public final View mo18639c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f14554a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = mo18639c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (mo18641e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> mo18640d() {
            if (this.f14552a == null) {
                this.f14552a = new SparseArray<>();
            }
            return this.f14552a;
        }

        /* renamed from: e */
        public final boolean mo18641e(@mr2 View view, @mr2 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(nd3.C2969e.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C2576z) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo18642f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f14553a;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f14553a = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = mo18640d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && jt4.m18896O0(view)) {
                mo18641e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void mo18643g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f14554a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f14551a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f14554a == null) {
                        this.f14554a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f14551a;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f14554a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f14554a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.jt4$d */
    public class C2553d extends C2555f<Boolean> {
        public C2553d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @sj3(28)
        /* renamed from: i */
        public Boolean mo18626d(View view) {
            return Boolean.valueOf(C2567q.m19178c(view));
        }

        @sj3(28)
        /* renamed from: j */
        public void mo18627e(View view, Boolean bool) {
            C2567q.m19182g(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean mo18628h(Boolean bool, Boolean bool2) {
            return !mo18655a(bool, bool2);
        }
    }

    /* renamed from: com.onedelhi.secure.jt4$e */
    public static class C2554e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap<View, Boolean> f14555a = new WeakHashMap<>();

        @sj3(19)
        /* renamed from: a */
        public void mo18647a(View view) {
            this.f14555a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (C2560k.m19116b(view)) {
                mo18649c(view);
            }
        }

        @sj3(19)
        /* renamed from: b */
        public final void mo18648b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                jt4.m18945d1(view, z2 ? 16 : 32);
                this.f14555a.put(view, Boolean.valueOf(z2));
            }
        }

        @sj3(19)
        /* renamed from: c */
        public final void mo18649c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @sj3(19)
        /* renamed from: d */
        public void mo18650d(View view) {
            this.f14555a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            mo18651e(view);
        }

        @sj3(19)
        /* renamed from: e */
        public final void mo18651e(View view) {
            C2557h.m19096o(view.getViewTreeObserver(), this);
        }

        @sj3(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f14555a.entrySet()) {
                    mo18648b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        @sj3(19)
        public void onViewAttachedToWindow(View view) {
            mo18649c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.onedelhi.secure.jt4$f */
    public static abstract class C2555f<T> {

        /* renamed from: a */
        public final int f14556a;

        /* renamed from: a */
        public final Class<T> f14557a;

        /* renamed from: b */
        public final int f14558b;

        /* renamed from: c */
        public final int f14559c;

        public C2555f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public C2555f(int i, Class<T> cls, int i2, int i3) {
            this.f14556a = i;
            this.f14557a = cls;
            this.f14559c = i2;
            this.f14558b = i3;
        }

        /* renamed from: a */
        public boolean mo18655a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public final boolean mo18656b() {
            return true;
        }

        /* renamed from: c */
        public final boolean mo18657c() {
            return Build.VERSION.SDK_INT >= this.f14558b;
        }

        /* renamed from: d */
        public abstract T mo18626d(View view);

        /* renamed from: e */
        public abstract void mo18627e(View view, T t);

        /* renamed from: f */
        public T mo18658f(View view) {
            if (mo18657c()) {
                return mo18626d(view);
            }
            if (!mo18656b()) {
                return null;
            }
            T tag = view.getTag(this.f14556a);
            if (this.f14557a.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: g */
        public void mo18659g(View view, T t) {
            if (mo18657c()) {
                mo18627e(view, t);
            } else if (mo18656b() && mo18628h(mo18658f(view), t)) {
                jt4.m18851C(view);
                view.setTag(this.f14556a, t);
                jt4.m18945d1(view, this.f14559c);
            }
        }

        /* renamed from: h */
        public boolean mo18628h(T t, T t2) {
            return !t2.equals(t);
        }
    }

    @sj3(15)
    /* renamed from: com.onedelhi.secure.jt4$g */
    public static class C2556g {
        private C2556g() {
        }

        @pn0
        /* renamed from: a */
        public static boolean m19081a(@mr2 View view) {
            return view.hasOnClickListeners();
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.jt4$h */
    public static class C2557h {
        private C2557h() {
        }

        @pn0
        /* renamed from: a */
        public static AccessibilityNodeProvider m19082a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @pn0
        /* renamed from: b */
        public static boolean m19083b(View view) {
            return view.getFitsSystemWindows();
        }

        @pn0
        /* renamed from: c */
        public static int m19084c(View view) {
            return view.getImportantForAccessibility();
        }

        @pn0
        /* renamed from: d */
        public static int m19085d(View view) {
            return view.getMinimumHeight();
        }

        @pn0
        /* renamed from: e */
        public static int m19086e(View view) {
            return view.getMinimumWidth();
        }

        @pn0
        /* renamed from: f */
        public static ViewParent m19087f(View view) {
            return view.getParentForAccessibility();
        }

        @pn0
        /* renamed from: g */
        public static int m19088g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @pn0
        /* renamed from: h */
        public static boolean m19089h(View view) {
            return view.hasOverlappingRendering();
        }

        @pn0
        /* renamed from: i */
        public static boolean m19090i(View view) {
            return view.hasTransientState();
        }

        @pn0
        /* renamed from: j */
        public static boolean m19091j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        @pn0
        /* renamed from: k */
        public static void m19092k(View view) {
            view.postInvalidateOnAnimation();
        }

        @pn0
        /* renamed from: l */
        public static void m19093l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @pn0
        /* renamed from: m */
        public static void m19094m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @pn0
        /* renamed from: n */
        public static void m19095n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @pn0
        /* renamed from: o */
        public static void m19096o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @pn0
        /* renamed from: p */
        public static void m19097p(View view) {
            view.requestFitSystemWindows();
        }

        @pn0
        /* renamed from: q */
        public static void m19098q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @pn0
        /* renamed from: r */
        public static void m19099r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @pn0
        /* renamed from: s */
        public static void m19100s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    @sj3(17)
    /* renamed from: com.onedelhi.secure.jt4$i */
    public static class C2558i {
        private C2558i() {
        }

        @pn0
        /* renamed from: a */
        public static int m19101a() {
            return View.generateViewId();
        }

        @pn0
        /* renamed from: b */
        public static Display m19102b(@mr2 View view) {
            return view.getDisplay();
        }

        @pn0
        /* renamed from: c */
        public static int m19103c(View view) {
            return view.getLabelFor();
        }

        @pn0
        /* renamed from: d */
        public static int m19104d(View view) {
            return view.getLayoutDirection();
        }

        @pn0
        /* renamed from: e */
        public static int m19105e(View view) {
            return view.getPaddingEnd();
        }

        @pn0
        /* renamed from: f */
        public static int m19106f(View view) {
            return view.getPaddingStart();
        }

        @pn0
        /* renamed from: g */
        public static boolean m19107g(View view) {
            return view.isPaddingRelative();
        }

        @pn0
        /* renamed from: h */
        public static void m19108h(View view, int i) {
            view.setLabelFor(i);
        }

        @pn0
        /* renamed from: i */
        public static void m19109i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @pn0
        /* renamed from: j */
        public static void m19110j(View view, int i) {
            view.setLayoutDirection(i);
        }

        @pn0
        /* renamed from: k */
        public static void m19111k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    @sj3(18)
    /* renamed from: com.onedelhi.secure.jt4$j */
    public static class C2559j {
        private C2559j() {
        }

        @pn0
        /* renamed from: a */
        public static Rect m19112a(@mr2 View view) {
            return view.getClipBounds();
        }

        @pn0
        /* renamed from: b */
        public static boolean m19113b(@mr2 View view) {
            return view.isInLayout();
        }

        @pn0
        /* renamed from: c */
        public static void m19114c(@mr2 View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.jt4$k */
    public static class C2560k {
        private C2560k() {
        }

        @pn0
        /* renamed from: a */
        public static int m19115a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @pn0
        /* renamed from: b */
        public static boolean m19116b(@mr2 View view) {
            return view.isAttachedToWindow();
        }

        @pn0
        /* renamed from: c */
        public static boolean m19117c(@mr2 View view) {
            return view.isLaidOut();
        }

        @pn0
        /* renamed from: d */
        public static boolean m19118d(@mr2 View view) {
            return view.isLayoutDirectionResolved();
        }

        @pn0
        /* renamed from: e */
        public static void m19119e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        @pn0
        /* renamed from: f */
        public static void m19120f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        @pn0
        /* renamed from: g */
        public static void m19121g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @sj3(20)
    /* renamed from: com.onedelhi.secure.jt4$l */
    public static class C2561l {
        private C2561l() {
        }

        @pn0
        /* renamed from: a */
        public static WindowInsets m19122a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @pn0
        /* renamed from: b */
        public static WindowInsets m19123b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @pn0
        /* renamed from: c */
        public static void m19124c(View view) {
            view.requestApplyInsets();
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.jt4$m */
    public static class C2562m {

        /* renamed from: com.onedelhi.secure.jt4$m$a */
        public class C2563a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public final /* synthetic */ View f14560a;

            /* renamed from: a */
            public final /* synthetic */ ju2 f14561a;

            /* renamed from: a */
            public sx4 f14562a = null;

            public C2563a(View view, ju2 ju2) {
                this.f14560a = view;
                this.f14561a = ju2;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                sx4 L = sx4.m27880L(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C2562m.m19125a(windowInsets, this.f14560a);
                    if (L.equals(this.f14562a)) {
                        return this.f14561a.mo1063a(view, L).mo24585J();
                    }
                }
                this.f14562a = L;
                sx4 a = this.f14561a.mo1063a(view, L);
                if (i >= 30) {
                    return a.mo24585J();
                }
                jt4.m19017v1(view);
                return a.mo24585J();
            }
        }

        private C2562m() {
        }

        @pn0
        /* renamed from: a */
        public static void m19125a(@mr2 WindowInsets windowInsets, @mr2 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(nd3.C2969e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @pn0
        /* renamed from: b */
        public static sx4 m19126b(@mr2 View view, @mr2 sx4 sx4, @mr2 Rect rect) {
            WindowInsets J = sx4.mo24585J();
            if (J != null) {
                return sx4.m27880L(view.computeSystemWindowInsets(J, rect), view);
            }
            rect.setEmpty();
            return sx4;
        }

        @pn0
        /* renamed from: c */
        public static boolean m19127c(@mr2 View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @pn0
        /* renamed from: d */
        public static boolean m19128d(@mr2 View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @pn0
        /* renamed from: e */
        public static boolean m19129e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @pn0
        /* renamed from: f */
        public static boolean m19130f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @pn0
        /* renamed from: g */
        public static ColorStateList m19131g(View view) {
            return view.getBackgroundTintList();
        }

        @pn0
        /* renamed from: h */
        public static PorterDuff.Mode m19132h(View view) {
            return view.getBackgroundTintMode();
        }

        @pn0
        /* renamed from: i */
        public static float m19133i(View view) {
            return view.getElevation();
        }

        @pn0
        @ts2
        /* renamed from: j */
        public static sx4 m19134j(@mr2 View view) {
            return sx4.C3547a.m27917a(view);
        }

        @pn0
        /* renamed from: k */
        public static String m19135k(View view) {
            return view.getTransitionName();
        }

        @pn0
        /* renamed from: l */
        public static float m19136l(View view) {
            return view.getTranslationZ();
        }

        @pn0
        /* renamed from: m */
        public static float m19137m(@mr2 View view) {
            return view.getZ();
        }

        @pn0
        /* renamed from: n */
        public static boolean m19138n(View view) {
            return view.hasNestedScrollingParent();
        }

        @pn0
        /* renamed from: o */
        public static boolean m19139o(View view) {
            return view.isImportantForAccessibility();
        }

        @pn0
        /* renamed from: p */
        public static boolean m19140p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @pn0
        /* renamed from: q */
        public static void m19141q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @pn0
        /* renamed from: r */
        public static void m19142r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @pn0
        /* renamed from: s */
        public static void m19143s(View view, float f) {
            view.setElevation(f);
        }

        @pn0
        /* renamed from: t */
        public static void m19144t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @pn0
        /* renamed from: u */
        public static void m19145u(@mr2 View view, @ts2 ju2 ju2) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(nd3.C2969e.tag_on_apply_window_listener, ju2);
            }
            if (ju2 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(nd3.C2969e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C2563a(view, ju2));
            }
        }

        @pn0
        /* renamed from: v */
        public static void m19146v(View view, String str) {
            view.setTransitionName(str);
        }

        @pn0
        /* renamed from: w */
        public static void m19147w(View view, float f) {
            view.setTranslationZ(f);
        }

        @pn0
        /* renamed from: x */
        public static void m19148x(@mr2 View view, float f) {
            view.setZ(f);
        }

        @pn0
        /* renamed from: y */
        public static boolean m19149y(View view, int i) {
            return view.startNestedScroll(i);
        }

        @pn0
        /* renamed from: z */
        public static void m19150z(View view) {
            view.stopNestedScroll();
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.jt4$n */
    public static class C2564n {
        private C2564n() {
        }

        @ts2
        /* renamed from: a */
        public static sx4 m19151a(@mr2 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            sx4 K = sx4.m27879K(rootWindowInsets);
            K.mo24583H(K);
            K.mo24589d(view.getRootView());
            return K;
        }

        @pn0
        /* renamed from: b */
        public static int m19152b(@mr2 View view) {
            return view.getScrollIndicators();
        }

        @pn0
        /* renamed from: c */
        public static void m19153c(@mr2 View view, int i) {
            view.setScrollIndicators(i);
        }

        @pn0
        /* renamed from: d */
        public static void m19154d(@mr2 View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.jt4$o */
    public static class C2565o {
        private C2565o() {
        }

        @pn0
        /* renamed from: a */
        public static void m19155a(@mr2 View view) {
            view.cancelDragAndDrop();
        }

        @pn0
        /* renamed from: b */
        public static void m19156b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @pn0
        /* renamed from: c */
        public static void m19157c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @pn0
        /* renamed from: d */
        public static void m19158d(@mr2 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @pn0
        /* renamed from: e */
        public static boolean m19159e(@mr2 View view, @ts2 ClipData clipData, @mr2 View.DragShadowBuilder dragShadowBuilder, @ts2 Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        @pn0
        /* renamed from: f */
        public static void m19160f(@mr2 View view, @mr2 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.jt4$p */
    public static class C2566p {
        private C2566p() {
        }

        @pn0
        /* renamed from: a */
        public static void m19161a(@mr2 View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @pn0
        /* renamed from: b */
        public static int m19162b(View view) {
            return view.getImportantForAutofill();
        }

        @pn0
        /* renamed from: c */
        public static int m19163c(@mr2 View view) {
            return view.getNextClusterForwardId();
        }

        @pn0
        /* renamed from: d */
        public static boolean m19164d(@mr2 View view) {
            return view.hasExplicitFocusable();
        }

        @pn0
        /* renamed from: e */
        public static boolean m19165e(@mr2 View view) {
            return view.isFocusedByDefault();
        }

        @pn0
        /* renamed from: f */
        public static boolean m19166f(View view) {
            return view.isImportantForAutofill();
        }

        @pn0
        /* renamed from: g */
        public static boolean m19167g(@mr2 View view) {
            return view.isKeyboardNavigationCluster();
        }

        @pn0
        /* renamed from: h */
        public static View m19168h(@mr2 View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @pn0
        /* renamed from: i */
        public static boolean m19169i(@mr2 View view) {
            return view.restoreDefaultFocus();
        }

        @pn0
        /* renamed from: j */
        public static void m19170j(@mr2 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @pn0
        /* renamed from: k */
        public static void m19171k(@mr2 View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @pn0
        /* renamed from: l */
        public static void m19172l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @pn0
        /* renamed from: m */
        public static void m19173m(@mr2 View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @pn0
        /* renamed from: n */
        public static void m19174n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @pn0
        /* renamed from: o */
        public static void m19175o(@mr2 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.jt4$q */
    public static class C2567q {
        private C2567q() {
        }

        @pn0
        /* renamed from: a */
        public static void m19176a(@mr2 View view, @mr2 C2576z zVar) {
            int i = nd3.C2969e.tag_unhandled_key_listeners;
            ty3 ty3 = (ty3) view.getTag(i);
            if (ty3 == null) {
                ty3 = new ty3();
                view.setTag(i, ty3);
            }
            Objects.requireNonNull(zVar);
            kt4 kt4 = new kt4(zVar);
            ty3.put(zVar, kt4);
            view.addOnUnhandledKeyEventListener(kt4);
        }

        @pn0
        /* renamed from: b */
        public static CharSequence m19177b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @pn0
        /* renamed from: c */
        public static boolean m19178c(View view) {
            return view.isAccessibilityHeading();
        }

        @pn0
        /* renamed from: d */
        public static boolean m19179d(View view) {
            return view.isScreenReaderFocusable();
        }

        @pn0
        /* renamed from: e */
        public static void m19180e(@mr2 View view, @mr2 C2576z zVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            ty3 ty3 = (ty3) view.getTag(nd3.C2969e.tag_unhandled_key_listeners);
            if (ty3 != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) ty3.get(zVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        @pn0
        /* renamed from: f */
        public static <T> T m19181f(View view, int i) {
            return view.requireViewById(i);
        }

        @pn0
        /* renamed from: g */
        public static void m19182g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @pn0
        /* renamed from: h */
        public static void m19183h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @pn0
        /* renamed from: i */
        public static void m19184i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.jt4$r */
    public static class C2568r {
        private C2568r() {
        }

        @pn0
        /* renamed from: a */
        public static View.AccessibilityDelegate m19185a(View view) {
            return view.getAccessibilityDelegate();
        }

        @pn0
        /* renamed from: b */
        public static List<Rect> m19186b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @pn0
        /* renamed from: c */
        public static void m19187c(@mr2 View view, @mr2 Context context, @mr2 int[] iArr, @ts2 AttributeSet attributeSet, @mr2 TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @pn0
        /* renamed from: d */
        public static void m19188d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.jt4$s */
    public static class C2569s {
        private C2569s() {
        }

        @pn0
        /* renamed from: a */
        public static CharSequence m19189a(View view) {
            return view.getStateDescription();
        }

        @ts2
        /* renamed from: b */
        public static ux4 m19190b(@mr2 View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return ux4.m29682l(windowInsetsController);
            }
            return null;
        }

        @pn0
        /* renamed from: c */
        public static void m19191c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.jt4$t */
    public static final class C2570t {
        private C2570t() {
        }

        @pn0
        @ts2
        /* renamed from: a */
        public static String[] m19192a(@mr2 View view) {
            return view.getReceiveContentMimeTypes();
        }

        @pn0
        @ts2
        /* renamed from: b */
        public static b70 m19193b(@mr2 View view, @mr2 b70 b70) {
            ContentInfo l = b70.mo13489l();
            ContentInfo performReceiveContent = view.performReceiveContent(l);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == l ? b70 : b70.m11597m(performReceiveContent);
        }

        @pn0
        /* renamed from: c */
        public static void m19194c(@mr2 View view, @ts2 String[] strArr, @ts2 cv2 cv2) {
            if (cv2 == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C2575y(cv2));
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jt4$u */
    public @interface C2571u {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jt4$v */
    public @interface C2572v {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jt4$w */
    public @interface C2573w {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jt4$x */
    public @interface C2574x {
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.jt4$y */
    public static final class C2575y implements OnReceiveContentListener {
        @mr2

        /* renamed from: a */
        public final cv2 f14563a;

        public C2575y(@mr2 cv2 cv2) {
            this.f14563a = cv2;
        }

        @ts2
        public ContentInfo onReceiveContent(@mr2 View view, @mr2 ContentInfo contentInfo) {
            b70 m = b70.m11597m(contentInfo);
            b70 a = this.f14563a.mo14391a(view, m);
            if (a == null) {
                return null;
            }
            return a == m ? contentInfo : a.mo13489l();
        }
    }

    /* renamed from: com.onedelhi.secure.jt4$z */
    public interface C2576z {
        boolean onUnhandledKeyEvent(@mr2 View view, @mr2 KeyEvent keyEvent);
    }

    @hn4
    /* renamed from: A */
    public static boolean m18843A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2552c0.m19053a(view).mo18642f(keyEvent);
    }

    /* renamed from: A0 */
    public static float m18844A0(@mr2 View view) {
        return C2562m.m19136l(view);
    }

    /* renamed from: A1 */
    public static C2555f<Boolean> m18845A1() {
        return new C2547a(nd3.C2969e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    @Deprecated
    /* renamed from: A2 */
    public static void m18846A2(View view, float f) {
        view.setY(f);
    }

    /* renamed from: B */
    public static void m18847B(@mr2 View view) {
        m18851C(view);
    }

    @ts2
    @Deprecated
    /* renamed from: B0 */
    public static ux4 m18848B0(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C2569s.m19190b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return lx4.m21044a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: B1 */
    public static void m18849B1(@mr2 View view, @ts2 C3884x1 x1Var) {
        if (x1Var == null && (m18863F(view) instanceof C3884x1.C3885a)) {
            x1Var = new C3884x1();
        }
        view.setAccessibilityDelegate(x1Var == null ? null : x1Var.mo26736d());
    }

    /* renamed from: B2 */
    public static void m18850B2(@mr2 View view, float f) {
        C2562m.m19148x(view, f);
    }

    /* renamed from: C */
    public static void m18851C(@mr2 View view) {
        C3884x1 E = m18859E(view);
        if (E == null) {
            E = new C3884x1();
        }
        m18849B1(view, E);
    }

    @Deprecated
    /* renamed from: C0 */
    public static int m18852C0(@mr2 View view) {
        return C2557h.m19088g(view);
    }

    @hn4
    /* renamed from: C1 */
    public static void m18853C1(@mr2 View view, boolean z) {
        m18935b().mo18659g(view, Boolean.valueOf(z));
    }

    /* renamed from: C2 */
    public static boolean m18854C2(@mr2 View view, @ts2 ClipData clipData, @mr2 View.DragShadowBuilder dragShadowBuilder, @ts2 Object obj, int i) {
        return Build.VERSION.SDK_INT >= 24 ? C2565o.m19159e(view, clipData, dragShadowBuilder, obj, i) : view.startDrag(clipData, dragShadowBuilder, obj, i);
    }

    /* renamed from: D */
    public static int m18855D() {
        return C2558i.m19101a();
    }

    @Deprecated
    /* renamed from: D0 */
    public static float m18856D0(View view) {
        return view.getX();
    }

    /* renamed from: D1 */
    public static void m18857D1(@mr2 View view, int i) {
        C2560k.m19120f(view, i);
    }

    /* renamed from: D2 */
    public static boolean m18858D2(@mr2 View view, int i) {
        return C2562m.m19149y(view, i);
    }

    @ts2
    /* renamed from: E */
    public static C3884x1 m18859E(@mr2 View view) {
        View.AccessibilityDelegate F = m18863F(view);
        if (F == null) {
            return null;
        }
        return F instanceof C3884x1.C3885a ? ((C3884x1.C3885a) F).f22375a : new C3884x1(F);
    }

    @Deprecated
    /* renamed from: E0 */
    public static float m18860E0(View view) {
        return view.getY();
    }

    @hn4
    /* renamed from: E1 */
    public static void m18861E1(@mr2 View view, @ts2 CharSequence charSequence) {
        m18973k1().mo18659g(view, charSequence);
        if (charSequence != null) {
            f14509a.mo18647a(view);
        } else {
            f14509a.mo18650d(view);
        }
    }

    /* renamed from: E2 */
    public static boolean m18862E2(@mr2 View view, int i, int i2) {
        if (view instanceof zn2) {
            return ((zn2) view).mo3844e(i, i2);
        }
        if (i2 == 0) {
            return m18858D2(view, i);
        }
        return false;
    }

    @ts2
    /* renamed from: F */
    public static View.AccessibilityDelegate m18863F(@mr2 View view) {
        return Build.VERSION.SDK_INT >= 29 ? C2568r.m19185a(view) : m18867G(view);
    }

    /* renamed from: F0 */
    public static float m18864F0(@mr2 View view) {
        return C2562m.m19137m(view);
    }

    @Deprecated
    /* renamed from: F1 */
    public static void m18865F1(View view, boolean z) {
        view.setActivated(z);
    }

    /* renamed from: F2 */
    public static C2555f<CharSequence> m18866F2() {
        return new C2551c(nd3.C2969e.tag_state_description, CharSequence.class, 64, 30);
    }

    @ts2
    /* renamed from: G */
    public static View.AccessibilityDelegate m18867G(@mr2 View view) {
        if (f14528d) {
            return null;
        }
        if (f14524c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f14524c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f14528d = true;
                return null;
            }
        }
        try {
            Object obj = f14524c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f14528d = true;
            return null;
        }
    }

    /* renamed from: G0 */
    public static boolean m18868G0(@mr2 View view) {
        return m18863F(view) != null;
    }

    @Deprecated
    /* renamed from: G1 */
    public static void m18869G1(View view, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        view.setAlpha(f);
    }

    /* renamed from: G2 */
    public static void m18870G2(@mr2 View view) {
        C2562m.m19150z(view);
    }

    /* renamed from: H */
    public static int m18871H(@mr2 View view) {
        return C2560k.m19115a(view);
    }

    /* renamed from: H0 */
    public static boolean m18872H0(@mr2 View view) {
        return Build.VERSION.SDK_INT >= 26 ? C2566p.m19164d(view) : view.hasFocusable();
    }

    /* renamed from: H1 */
    public static void m18873H1(@mr2 View view, @ts2 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2566p.m19170j(view, strArr);
        }
    }

    /* renamed from: H2 */
    public static void m18874H2(@mr2 View view, int i) {
        if (view instanceof zn2) {
            ((zn2) view).mo3851h(i);
        } else if (i == 0) {
            m18870G2(view);
        }
    }

    @ts2
    /* renamed from: I */
    public static C1740b2 m18875I(@mr2 View view) {
        AccessibilityNodeProvider a = C2557h.m19082a(view);
        if (a != null) {
            return new C1740b2(a);
        }
        return null;
    }

    /* renamed from: I0 */
    public static boolean m18876I0(@mr2 View view) {
        return C2562m.m19138n(view);
    }

    /* renamed from: I1 */
    public static void m18877I1(@mr2 View view, @ts2 Drawable drawable) {
        C2557h.m19098q(view, drawable);
    }

    /* renamed from: I2 */
    public static void m18878I2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @hn4
    @ts2
    /* renamed from: J */
    public static CharSequence m18879J(@mr2 View view) {
        return m18973k1().mo18658f(view);
    }

    /* renamed from: J0 */
    public static boolean m18880J0(@mr2 View view, int i) {
        if (view instanceof zn2) {
            ((zn2) view).mo3845f(i);
            return false;
        } else if (i == 0) {
            return m18876I0(view);
        } else {
            return false;
        }
    }

    /* renamed from: J1 */
    public static void m18881J1(@mr2 View view, @ts2 ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        C2562m.m19141q(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C2562m.m19131g(view) == null && C2562m.m19132h(view) == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C2557h.m19098q(view, background);
            }
        }
    }

    /* renamed from: J2 */
    public static void m18882J2(@mr2 View view, @mr2 View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2565o.m19160f(view, dragShadowBuilder);
        }
    }

    /* renamed from: K */
    public static List<C1638a2.C1639a> m18883K(View view) {
        int i = nd3.C2969e.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: K0 */
    public static boolean m18884K0(@mr2 View view) {
        return C2556g.m19081a(view);
    }

    /* renamed from: K1 */
    public static void m18885K1(@mr2 View view, @ts2 PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        C2562m.m19142r(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C2562m.m19131g(view) == null && C2562m.m19132h(view) == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C2557h.m19098q(view, background);
            }
        }
    }

    @Deprecated
    /* renamed from: L */
    public static float m18886L(View view) {
        return view.getAlpha();
    }

    /* renamed from: L0 */
    public static boolean m18887L0(@mr2 View view) {
        return C2557h.m19089h(view);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    /* renamed from: L1 */
    public static void m18888L1(ViewGroup viewGroup, boolean z) {
        if (f14525c == null) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                f14525c = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException e) {
                Log.e(f14510a, "Unable to find childrenDrawingOrderEnabled", e);
            }
            f14525c.setAccessible(true);
        }
        try {
            f14525c.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.e(f14510a, "Unable to invoke childrenDrawingOrderEnabled", e2);
        }
    }

    /* renamed from: M */
    public static int m18889M(View view, @mr2 CharSequence charSequence) {
        List<C1638a2.C1639a> K = m18883K(view);
        for (int i = 0; i < K.size(); i++) {
            if (TextUtils.equals(charSequence, K.get(i).mo12637c())) {
                return K.get(i).mo12636b();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f14517a;
            if (i2 >= iArr.length || i3 != -1) {
                return i3;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < K.size(); i5++) {
                z &= K.get(i5).mo12636b() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: M0 */
    public static boolean m18890M0(@mr2 View view) {
        return C2557h.m19090i(view);
    }

    /* renamed from: M1 */
    public static void m18891M1(@mr2 View view, @ts2 Rect rect) {
        C2559j.m19114c(view, rect);
    }

    @ts2
    /* renamed from: N */
    public static ColorStateList m18892N(@mr2 View view) {
        return C2562m.m19131g(view);
    }

    @hn4
    /* renamed from: N0 */
    public static boolean m18893N0(@mr2 View view) {
        Boolean f = m18935b().mo18658f(view);
        return f != null && f.booleanValue();
    }

    /* renamed from: N1 */
    public static void m18894N1(@mr2 View view, float f) {
        C2562m.m19143s(view, f);
    }

    @ts2
    /* renamed from: O */
    public static PorterDuff.Mode m18895O(@mr2 View view) {
        return C2562m.m19132h(view);
    }

    /* renamed from: O0 */
    public static boolean m18896O0(@mr2 View view) {
        return C2560k.m19116b(view);
    }

    @Deprecated
    /* renamed from: O1 */
    public static void m18897O1(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @ts2
    /* renamed from: P */
    public static Rect m18898P(@mr2 View view) {
        return C2559j.m19112a(view);
    }

    /* renamed from: P0 */
    public static boolean m18899P0(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2566p.m19165e(view);
        }
        return false;
    }

    /* renamed from: P1 */
    public static void m18900P1(@mr2 View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2566p.m19171k(view, z);
        }
    }

    @ts2
    /* renamed from: Q */
    public static Display m18901Q(@mr2 View view) {
        return C2558i.m19102b(view);
    }

    /* renamed from: Q0 */
    public static boolean m18902Q0(@mr2 View view) {
        return C2562m.m19139o(view);
    }

    /* renamed from: Q1 */
    public static void m18903Q1(@mr2 View view, boolean z) {
        C2557h.m19099r(view, z);
    }

    /* renamed from: R */
    public static float m18904R(@mr2 View view) {
        return C2562m.m19133i(view);
    }

    /* renamed from: R0 */
    public static boolean m18905R0(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2566p.m19166f(view);
        }
        return true;
    }

    @hn4
    /* renamed from: R1 */
    public static void m18906R1(@mr2 View view, int i) {
        C2557h.m19100s(view, i);
    }

    /* renamed from: S */
    public static Rect m18907S() {
        if (f14511a == null) {
            f14511a = new ThreadLocal<>();
        }
        Rect rect = f14511a.get();
        if (rect == null) {
            rect = new Rect();
            f14511a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: S0 */
    public static boolean m18908S0(@mr2 View view) {
        return C2559j.m19113b(view);
    }

    /* renamed from: S1 */
    public static void m18909S1(@mr2 View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2566p.m19172l(view, i);
        }
    }

    /* renamed from: T */
    public static dv2 m18910T(@mr2 View view) {
        return view instanceof dv2 ? (dv2) view : f14508a;
    }

    /* renamed from: T0 */
    public static boolean m18911T0(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2566p.m19167g(view);
        }
        return false;
    }

    /* renamed from: T1 */
    public static void m18912T1(@mr2 View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2566p.m19173m(view, z);
        }
    }

    /* renamed from: U */
    public static boolean m18913U(@mr2 View view) {
        return C2557h.m19083b(view);
    }

    /* renamed from: U0 */
    public static boolean m18914U0(@mr2 View view) {
        return C2560k.m19117c(view);
    }

    /* renamed from: U1 */
    public static void m18915U1(@mr2 View view, @mo1 int i) {
        C2558i.m19108h(view, i);
    }

    /* renamed from: V */
    public static int m18916V(@mr2 View view) {
        return C2557h.m19084c(view);
    }

    /* renamed from: V0 */
    public static boolean m18917V0(@mr2 View view) {
        return C2560k.m19118d(view);
    }

    /* renamed from: V1 */
    public static void m18918V1(@mr2 View view, @ts2 Paint paint) {
        C2558i.m19109i(view, paint);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: W */
    public static int m18919W(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2566p.m19162b(view);
        }
        return 0;
    }

    /* renamed from: W0 */
    public static boolean m18920W0(@mr2 View view) {
        return C2562m.m19140p(view);
    }

    @Deprecated
    /* renamed from: W1 */
    public static void m18921W1(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: X */
    public static int m18922X(@mr2 View view) {
        return C2558i.m19103c(view);
    }

    @Deprecated
    /* renamed from: X0 */
    public static boolean m18923X0(View view) {
        return view.isOpaque();
    }

    /* renamed from: X1 */
    public static void m18924X1(@mr2 View view, int i) {
        C2558i.m19110j(view, i);
    }

    @Deprecated
    /* renamed from: Y */
    public static int m18925Y(View view) {
        return view.getLayerType();
    }

    /* renamed from: Y0 */
    public static boolean m18926Y0(@mr2 View view) {
        return C2558i.m19107g(view);
    }

    /* renamed from: Y1 */
    public static void m18927Y1(@mr2 View view, boolean z) {
        C2562m.m19144t(view, z);
    }

    /* renamed from: Z */
    public static int m18928Z(@mr2 View view) {
        return C2558i.m19104d(view);
    }

    @hn4
    /* renamed from: Z0 */
    public static boolean m18929Z0(@mr2 View view) {
        Boolean f = m18845A1().mo18658f(view);
        return f != null && f.booleanValue();
    }

    /* renamed from: Z1 */
    public static void m18930Z1(@mr2 View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2566p.m19174n(view, i);
        }
    }

    @ts2
    @Deprecated
    /* renamed from: a0 */
    public static Matrix m18932a0(View view) {
        return view.getMatrix();
    }

    @Deprecated
    /* renamed from: a1 */
    public static void m18933a1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    /* renamed from: a2 */
    public static void m18934a2(@mr2 View view, @ts2 ju2 ju2) {
        C2562m.m19145u(view, ju2);
    }

    /* renamed from: b */
    public static C2555f<Boolean> m18935b() {
        return new C2553d(nd3.C2969e.tag_accessibility_heading, Boolean.class, 28);
    }

    @Deprecated
    /* renamed from: b0 */
    public static int m18936b0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @ts2
    /* renamed from: b1 */
    public static View m18937b1(@mr2 View view, @ts2 View view2, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2566p.m19168h(view, view2, i);
        }
        return null;
    }

    /* renamed from: b2 */
    public static void m18938b2(@mr2 View view, @ts2 String[] strArr, @ts2 cv2 cv2) {
        if (Build.VERSION.SDK_INT >= 31) {
            C2570t.m19194c(view, strArr, cv2);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        if (cv2 != null) {
            k43.m19445b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            k43.m19445b(!z, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(nd3.C2969e.tag_on_receive_content_mime_types, strArr);
        view.setTag(nd3.C2969e.tag_on_receive_content_listener, cv2);
    }

    /* renamed from: c */
    public static int m18939c(@mr2 View view, @mr2 CharSequence charSequence, @mr2 C2018e2 e2Var) {
        int M = m18889M(view, charSequence);
        if (M != -1) {
            m18943d(view, new C1638a2.C1639a(M, charSequence, e2Var));
        }
        return M;
    }

    @Deprecated
    /* renamed from: c0 */
    public static int m18940c0(View view) {
        return view.getMeasuredState();
    }

    /* renamed from: c1 */
    public static /* synthetic */ b70 m18941c1(b70 b70) {
        return b70;
    }

    @Deprecated
    /* renamed from: c2 */
    public static void m18942c2(View view, int i) {
        view.setOverScrollMode(i);
    }

    /* renamed from: d */
    public static void m18943d(@mr2 View view, @mr2 C1638a2.C1639a aVar) {
        m18851C(view);
        m19005s1(aVar.mo12636b(), view);
        m18883K(view).add(aVar);
        m18945d1(view, 0);
    }

    @Deprecated
    /* renamed from: d0 */
    public static int m18944d0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @sj3(19)
    /* renamed from: d1 */
    public static void m18945d1(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m18879J(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (m18871H(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                C2560k.m19121g(obtain, i);
                if (z) {
                    obtain.getText().add(m18879J(view));
                    m19026x2(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C2560k.m19121g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m18879J(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C2560k.m19119e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e(f14510a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: d2 */
    public static void m18946d2(@mr2 View view, @e83 int i, @e83 int i2, @e83 int i3, @e83 int i4) {
        C2558i.m19111k(view, i, i2, i3, i4);
    }

    /* renamed from: e */
    public static void m18947e(@mr2 View view, @mr2 Collection<View> collection, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2566p.m19161a(view, collection, i);
        }
    }

    /* renamed from: e0 */
    public static int m18948e0(@mr2 View view) {
        return C2557h.m19085d(view);
    }

    /* renamed from: e1 */
    public static void m18949e1(@mr2 View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect S = m18907S();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            S.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !S.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m18979m(view, i);
        if (z && S.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(S);
        }
    }

    @Deprecated
    /* renamed from: e2 */
    public static void m18950e2(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: f */
    public static void m18951f(@mr2 View view, @mr2 C2576z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            C2567q.m19176a(view, zVar);
            return;
        }
        int i = nd3.C2969e.tag_unhandled_key_listeners;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i, arrayList);
        }
        arrayList.add(zVar);
        if (arrayList.size() == 1) {
            C2552c0.m19054h(view);
        }
    }

    /* renamed from: f0 */
    public static int m18952f0(@mr2 View view) {
        return C2557h.m19086e(view);
    }

    /* renamed from: f1 */
    public static void m18953f1(@mr2 View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect S = m18907S();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            S.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !S.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m18983n(view, i);
        if (z && S.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(S);
        }
    }

    @Deprecated
    /* renamed from: f2 */
    public static void m18954f2(View view, float f) {
        view.setPivotY(f);
    }

    @mr2
    /* renamed from: g */
    public static vu4 m18955g(@mr2 View view) {
        if (f14521b == null) {
            f14521b = new WeakHashMap<>();
        }
        vu4 vu4 = f14521b.get(view);
        if (vu4 != null) {
            return vu4;
        }
        vu4 vu42 = new vu4(view);
        f14521b.put(view, vu42);
        return vu42;
    }

    /* renamed from: g0 */
    public static int m18956g0(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2566p.m19163c(view);
        }
        return -1;
    }

    @mr2
    /* renamed from: g1 */
    public static sx4 m18957g1(@mr2 View view, @mr2 sx4 sx4) {
        WindowInsets J = sx4.mo24585J();
        if (J != null) {
            WindowInsets b = C2561l.m19123b(view, J);
            if (!b.equals(J)) {
                return sx4.m27880L(b, view);
            }
        }
        return sx4;
    }

    /* renamed from: g2 */
    public static void m18958g2(@mr2 View view, @ts2 b33 b33) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2565o.m19158d(view, (PointerIcon) (b33 != null ? b33.mo13395b() : null));
        }
    }

    /* renamed from: h */
    public static void m18959h() {
        try {
            f14513a = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f14520b = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e(f14510a, "Couldn't find method", e);
        }
        f14526c = true;
    }

    @ts2
    /* renamed from: h0 */
    public static String[] m18960h0(@mr2 View view) {
        return Build.VERSION.SDK_INT >= 31 ? C2570t.m19192a(view) : (String[]) view.getTag(nd3.C2969e.tag_on_receive_content_mime_types);
    }

    @Deprecated
    /* renamed from: h1 */
    public static void m18961h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    /* renamed from: h2 */
    public static void m18962h2(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m18963i(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    /* renamed from: i0 */
    public static int m18964i0(View view) {
        return view.getOverScrollMode();
    }

    /* renamed from: i1 */
    public static void m18965i1(@mr2 View view, @mr2 C1638a2 a2Var) {
        view.onInitializeAccessibilityNodeInfo(a2Var.mo12549W1());
    }

    @Deprecated
    /* renamed from: i2 */
    public static void m18966i2(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m18967j(View view, int i) {
        return view.canScrollVertically(i);
    }

    @e83
    /* renamed from: j0 */
    public static int m18968j0(@mr2 View view) {
        return C2558i.m19105e(view);
    }

    @Deprecated
    /* renamed from: j1 */
    public static void m18969j1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    /* renamed from: j2 */
    public static void m18970j2(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: k */
    public static void m18971k(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2565o.m19155a(view);
        }
    }

    @e83
    /* renamed from: k0 */
    public static int m18972k0(@mr2 View view) {
        return C2558i.m19106f(view);
    }

    /* renamed from: k1 */
    public static C2555f<CharSequence> m18973k1() {
        return new C2549b(nd3.C2969e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Deprecated
    /* renamed from: k2 */
    public static void m18974k2(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @Deprecated
    /* renamed from: l */
    public static int m18975l(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    @ts2
    /* renamed from: l0 */
    public static ViewParent m18976l0(@mr2 View view) {
        return C2557h.m19087f(view);
    }

    /* renamed from: l1 */
    public static boolean m18977l1(@mr2 View view, int i, @ts2 Bundle bundle) {
        return C2557h.m19091j(view, i, bundle);
    }

    @Deprecated
    /* renamed from: l2 */
    public static void m18978l2(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: m */
    public static void m18979m(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m18878I2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m18878I2((View) parent);
            }
        }
    }

    @Deprecated
    /* renamed from: m0 */
    public static float m18980m0(View view) {
        return view.getPivotX();
    }

    @ts2
    /* renamed from: m1 */
    public static b70 m18981m1(@mr2 View view, @mr2 b70 b70) {
        if (Log.isLoggable(f14510a, 3)) {
            Log.d(f14510a, "performReceiveContent: " + b70 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C2570t.m19193b(view, b70);
        }
        cv2 cv2 = (cv2) view.getTag(nd3.C2969e.tag_on_receive_content_listener);
        if (cv2 == null) {
            return m18910T(view).mo1785a(b70);
        }
        b70 a = cv2.mo14391a(view, b70);
        if (a == null) {
            return null;
        }
        return m18910T(view).mo1785a(a);
    }

    @Deprecated
    /* renamed from: m2 */
    public static void m18982m2(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: n */
    public static void m18983n(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m18878I2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m18878I2((View) parent);
            }
        }
    }

    @Deprecated
    /* renamed from: n0 */
    public static float m18984n0(View view) {
        return view.getPivotY();
    }

    /* renamed from: n1 */
    public static void m18985n1(@mr2 View view) {
        C2557h.m19092k(view);
    }

    @hn4
    /* renamed from: n2 */
    public static void m18986n2(@mr2 View view, boolean z) {
        m18845A1().mo18659g(view, Boolean.valueOf(z));
    }

    @mr2
    /* renamed from: o */
    public static sx4 m18987o(@mr2 View view, @mr2 sx4 sx4, @mr2 Rect rect) {
        return C2562m.m19126b(view, sx4, rect);
    }

    @ts2
    /* renamed from: o0 */
    public static sx4 m18988o0(@mr2 View view) {
        return Build.VERSION.SDK_INT >= 23 ? C2564n.m19151a(view) : C2562m.m19134j(view);
    }

    /* renamed from: o1 */
    public static void m18989o1(@mr2 View view, int i, int i2, int i3, int i4) {
        C2557h.m19093l(view, i, i2, i3, i4);
    }

    /* renamed from: o2 */
    public static void m18990o2(@mr2 View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C2564n.m19153c(view, i);
        }
    }

    @mr2
    /* renamed from: p */
    public static sx4 m18991p(@mr2 View view, @mr2 sx4 sx4) {
        WindowInsets J = sx4.mo24585J();
        if (J != null) {
            WindowInsets a = C2561l.m19122a(view, J);
            if (!a.equals(J)) {
                return sx4.m27880L(a, view);
            }
        }
        return sx4;
    }

    @Deprecated
    /* renamed from: p0 */
    public static float m18992p0(View view) {
        return view.getRotation();
    }

    /* renamed from: p1 */
    public static void m18993p1(@mr2 View view, @mr2 Runnable runnable) {
        C2557h.m19094m(view, runnable);
    }

    /* renamed from: p2 */
    public static void m18994p2(@mr2 View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C2564n.m19154d(view, i, i2);
        }
    }

    /* renamed from: q */
    public static void m18995q(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2565o.m19156b(view);
            return;
        }
        if (!f14526c) {
            m18959h();
        }
        Method method = f14520b;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d(f14510a, "Error calling dispatchFinishTemporaryDetach", e);
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    @Deprecated
    /* renamed from: q0 */
    public static float m18996q0(View view) {
        return view.getRotationX();
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: q1 */
    public static void m18997q1(@mr2 View view, @mr2 Runnable runnable, long j) {
        C2557h.m19095n(view, runnable, j);
    }

    @hn4
    /* renamed from: q2 */
    public static void m18998q2(@mr2 View view, @ts2 CharSequence charSequence) {
        m18866F2().mo18659g(view, charSequence);
    }

    /* renamed from: r */
    public static boolean m18999r(@mr2 View view, float f, float f2, boolean z) {
        return C2562m.m19127c(view, f, f2, z);
    }

    @Deprecated
    /* renamed from: r0 */
    public static float m19000r0(View view) {
        return view.getRotationY();
    }

    /* renamed from: r1 */
    public static void m19001r1(@mr2 View view, int i) {
        m19005s1(i, view);
        m18945d1(view, 0);
    }

    /* renamed from: r2 */
    public static void m19002r2(@mr2 View view, @mr2 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2568r.m19188d(view, list);
        }
    }

    /* renamed from: s */
    public static boolean m19003s(@mr2 View view, float f, float f2) {
        return C2562m.m19128d(view, f, f2);
    }

    @Deprecated
    /* renamed from: s0 */
    public static float m19004s0(View view) {
        return view.getScaleX();
    }

    /* renamed from: s1 */
    public static void m19005s1(int i, View view) {
        List<C1638a2.C1639a> K = m18883K(view);
        for (int i2 = 0; i2 < K.size(); i2++) {
            if (K.get(i2).mo12636b() == i) {
                K.remove(i2);
                return;
            }
        }
    }

    /* renamed from: s2 */
    public static void m19006s2(@mr2 View view, @ts2 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2566p.m19175o(view, charSequence);
        }
    }

    /* renamed from: t */
    public static boolean m19007t(@mr2 View view, int i, int i2, @ts2 int[] iArr, @ts2 int[] iArr2) {
        return C2562m.m19129e(view, i, i2, iArr, iArr2);
    }

    @Deprecated
    /* renamed from: t0 */
    public static float m19008t0(View view) {
        return view.getScaleY();
    }

    /* renamed from: t1 */
    public static void m19009t1(@mr2 View view, @mr2 C2576z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            C2567q.m19180e(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(nd3.C2969e.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(zVar);
            if (arrayList.size() == 0) {
                C2552c0.m19055i(view);
            }
        }
    }

    /* renamed from: t2 */
    public static void m19010t2(@mr2 View view, @ts2 String str) {
        C2562m.m19146v(view, str);
    }

    /* renamed from: u */
    public static boolean m19011u(@mr2 View view, int i, int i2, @ts2 int[] iArr, @ts2 int[] iArr2, int i3) {
        if (view instanceof zn2) {
            return ((zn2) view).mo3837d(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return m19007t(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    /* renamed from: u0 */
    public static int m19012u0(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C2564n.m19152b(view);
        }
        return 0;
    }

    /* renamed from: u1 */
    public static void m19013u1(@mr2 View view, @mr2 C1638a2.C1639a aVar, @ts2 CharSequence charSequence, @ts2 C2018e2 e2Var) {
        if (e2Var == null && charSequence == null) {
            m19001r1(view, aVar.mo12636b());
        } else {
            m18943d(view, aVar.mo12635a(charSequence, e2Var));
        }
    }

    @Deprecated
    /* renamed from: u2 */
    public static void m19014u2(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: v */
    public static void m19015v(@mr2 View view, int i, int i2, int i3, int i4, @ts2 int[] iArr, int i5, @mr2 int[] iArr2) {
        View view2 = view;
        if (view2 instanceof ao2) {
            ((ao2) view2).mo3829c(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            m19023x(view, i, i2, i3, i4, iArr, i5);
        }
    }

    @hn4
    @ts2
    /* renamed from: v0 */
    public static CharSequence m19016v0(@mr2 View view) {
        return m18866F2().mo18658f(view);
    }

    /* renamed from: v1 */
    public static void m19017v1(@mr2 View view) {
        C2561l.m19124c(view);
    }

    @Deprecated
    /* renamed from: v2 */
    public static void m19018v2(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: w */
    public static boolean m19019w(@mr2 View view, int i, int i2, int i3, int i4, @ts2 int[] iArr) {
        return C2562m.m19130f(view, i, i2, i3, i4, iArr);
    }

    @mr2
    /* renamed from: w0 */
    public static List<Rect> m19020w0(@mr2 View view) {
        return Build.VERSION.SDK_INT >= 29 ? C2568r.m19186b(view) : Collections.emptyList();
    }

    @mr2
    /* renamed from: w1 */
    public static <T extends View> T m19021w1(@mr2 View view, @mo1 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C2567q.m19181f(view, i);
        }
        T findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* renamed from: w2 */
    public static void m19022w2(@mr2 View view, float f) {
        C2562m.m19147w(view, f);
    }

    /* renamed from: x */
    public static boolean m19023x(@mr2 View view, int i, int i2, int i3, int i4, @ts2 int[] iArr, int i5) {
        if (view instanceof zn2) {
            return ((zn2) view).mo3824a(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return m19019w(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    @ts2
    /* renamed from: x0 */
    public static String m19024x0(@mr2 View view) {
        return C2562m.m19135k(view);
    }

    @Deprecated
    /* renamed from: x1 */
    public static int m19025x1(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    /* renamed from: x2 */
    public static void m19026x2(View view) {
        if (m18916V(view) == 0) {
            m18906R1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m18916V((View) parent) == 4) {
                m18906R1(view, 2);
                return;
            }
        }
    }

    /* renamed from: y */
    public static void m19027y(@mr2 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2565o.m19157c(view);
            return;
        }
        if (!f14526c) {
            m18959h();
        }
        Method method = f14513a;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d(f14510a, "Error calling dispatchStartTemporaryDetach", e);
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    @Deprecated
    /* renamed from: y0 */
    public static float m19028y0(View view) {
        return view.getTranslationX();
    }

    /* renamed from: y1 */
    public static boolean m19029y1(@mr2 View view) {
        return Build.VERSION.SDK_INT >= 26 ? C2566p.m19169i(view) : view.requestFocus();
    }

    /* renamed from: y2 */
    public static void m19030y2(@mr2 View view, @ts2 px4.C3199b bVar) {
        px4.m25075h(view, bVar);
    }

    @hn4
    /* renamed from: z */
    public static boolean m19031z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2552c0.m19053a(view).mo18638b(view, keyEvent);
    }

    @Deprecated
    /* renamed from: z0 */
    public static float m19032z0(View view) {
        return view.getTranslationY();
    }

    /* renamed from: z1 */
    public static void m19033z1(@mr2 View view, @mr2 @SuppressLint({"ContextFirst"}) Context context, @mr2 int[] iArr, @ts2 AttributeSet attributeSet, @mr2 TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2568r.m19187c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @Deprecated
    /* renamed from: z2 */
    public static void m19034z2(View view, float f) {
        view.setX(f);
    }
}
