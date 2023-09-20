package com.onedelhi.secure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class ed0 {

    /* renamed from: a */
    public static DataBindingComponent f11196a = null;

    /* renamed from: a */
    public static dd0 f11197a = new DataBinderMapperImpl();

    @ts2
    /* renamed from: a */
    public static <T extends ViewDataBinding> T m13686a(@mr2 View view) {
        return m13687b(view, f11196a);
    }

    @ts2
    /* renamed from: b */
    public static <T extends ViewDataBinding> T m13687b(@mr2 View view, DataBindingComponent dataBindingComponent) {
        T h = m13693h(view);
        if (h != null) {
            return h;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            int e = f11197a.mo3904e((String) tag);
            if (e != 0) {
                return f11197a.mo3902c(dataBindingComponent, view, e);
            }
            throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    /* renamed from: c */
    public static <T extends ViewDataBinding> T m13688c(DataBindingComponent dataBindingComponent, View view, int i) {
        return f11197a.mo3902c(dataBindingComponent, view, i);
    }

    /* renamed from: d */
    public static <T extends ViewDataBinding> T m13689d(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        return f11197a.mo3903d(dataBindingComponent, viewArr, i);
    }

    /* renamed from: e */
    public static <T extends ViewDataBinding> T m13690e(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return m13688c(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return m13689d(dataBindingComponent, viewArr, i2);
    }

    @ts2
    /* renamed from: f */
    public static String m13691f(int i) {
        return f11197a.mo3901b(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r3 == -1) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.indexOf(47, r3 + 1) == -1) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004c A[SYNTHETIC] */
    @com.onedelhi.secure.ts2
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends androidx.databinding.ViewDataBinding> T m13692g(@com.onedelhi.secure.mr2 android.view.View r9) {
        /*
        L_0x0000:
            r0 = 0
            if (r9 == 0) goto L_0x005a
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.m3766B(r9)
            if (r1 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.Object r1 = r9.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x004d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "layout"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "_0"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x004d
            r2 = 6
            char r2 = r1.charAt(r2)
            r3 = 7
            r4 = 47
            int r3 = r1.indexOf(r4, r3)
            r5 = 1
            r6 = -1
            r7 = 0
            if (r2 != r4) goto L_0x003b
            if (r3 != r6) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            r7 = r5
            goto L_0x004a
        L_0x003b:
            r8 = 45
            if (r2 != r8) goto L_0x004a
            if (r3 == r6) goto L_0x004a
            int r3 = r3 + 1
            int r1 = r1.indexOf(r4, r3)
            if (r1 != r6) goto L_0x0038
            goto L_0x0039
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            return r0
        L_0x004d:
            android.view.ViewParent r9 = r9.getParent()
            boolean r1 = r9 instanceof android.view.View
            if (r1 == 0) goto L_0x0058
            android.view.View r9 = (android.view.View) r9
            goto L_0x0000
        L_0x0058:
            r9 = r0
            goto L_0x0000
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ed0.m13692g(android.view.View):androidx.databinding.ViewDataBinding");
    }

    @ts2
    /* renamed from: h */
    public static <T extends ViewDataBinding> T m13693h(@mr2 View view) {
        return ViewDataBinding.m3766B(view);
    }

    @ts2
    /* renamed from: i */
    public static DataBindingComponent m13694i() {
        return f11196a;
    }

    /* renamed from: j */
    public static <T extends ViewDataBinding> T m13695j(@mr2 LayoutInflater layoutInflater, int i, @ts2 ViewGroup viewGroup, boolean z) {
        return m13696k(layoutInflater, i, viewGroup, z, f11196a);
    }

    /* renamed from: k */
    public static <T extends ViewDataBinding> T m13696k(@mr2 LayoutInflater layoutInflater, int i, @ts2 ViewGroup viewGroup, boolean z, @ts2 DataBindingComponent dataBindingComponent) {
        int i2 = 0;
        boolean z2 = viewGroup != null && z;
        if (z2) {
            i2 = viewGroup.getChildCount();
        }
        return z2 ? m13690e(dataBindingComponent, viewGroup, i2, i) : m13688c(dataBindingComponent, layoutInflater.inflate(i, viewGroup, z), i);
    }

    /* renamed from: l */
    public static <T extends ViewDataBinding> T m13697l(@mr2 Activity activity, int i) {
        return m13698m(activity, i, f11196a);
    }

    /* renamed from: m */
    public static <T extends ViewDataBinding> T m13698m(@mr2 Activity activity, int i, @ts2 DataBindingComponent dataBindingComponent) {
        activity.setContentView(i);
        return m13690e(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i);
    }

    /* renamed from: n */
    public static void m13699n(@ts2 DataBindingComponent dataBindingComponent) {
        f11196a = dataBindingComponent;
    }
}
