package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1050a;
import androidx.transition.C1060e;
import androidx.transition.Transition;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qv4;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wt4;
import com.onedelhi.secure.xj4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class Visibility extends Transition {

    /* renamed from: a */
    public static final String[] f5625a = {f5626h, f5627i};

    /* renamed from: h */
    public static final String f5626h = "android:visibility:visibility";

    /* renamed from: i */
    public static final String f5627i = "android:visibility:parent";

    /* renamed from: j */
    public static final String f5628j = "android:visibility:screenLocation";

    /* renamed from: v */
    public static final int f5629v = 1;

    /* renamed from: w */
    public static final int f5630w = 2;

    /* renamed from: u */
    public int f5631u = 3;

    /* renamed from: androidx.transition.Visibility$a */
    public class C1046a extends C1085i {

        /* renamed from: a */
        public final /* synthetic */ View f5632a;

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f5633a;

        /* renamed from: b */
        public final /* synthetic */ View f5635b;

        public C1046a(ViewGroup viewGroup, View view, View view2) {
            this.f5633a = viewGroup;
            this.f5632a = view;
            this.f5635b = view2;
        }

        /* renamed from: b */
        public void mo6830b(@mr2 Transition transition) {
            if (this.f5632a.getParent() == null) {
                wt4.m31099b(this.f5633a).mo24083a(this.f5632a);
            } else {
                Visibility.this.cancel();
            }
        }

        /* renamed from: d */
        public void mo6832d(@mr2 Transition transition) {
            wt4.m31099b(this.f5633a).mo24084d(this.f5632a);
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            this.f5635b.setTag(C1060e.C1065e.save_overlay_view, (Object) null);
            wt4.m31099b(this.f5633a).mo24084d(this.f5632a);
            transition.mo6926h0(this);
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    public static class C1047b extends AnimatorListenerAdapter implements Transition.C1043h, C1050a.C1051a {

        /* renamed from: a */
        public final int f5636a;

        /* renamed from: a */
        public final View f5637a;

        /* renamed from: a */
        public final ViewGroup f5638a;

        /* renamed from: a */
        public final boolean f5639a;

        /* renamed from: b */
        public boolean f5640b;

        /* renamed from: c */
        public boolean f5641c = false;

        public C1047b(View view, int i, boolean z) {
            this.f5637a = view;
            this.f5636a = i;
            this.f5638a = (ViewGroup) view.getParent();
            this.f5639a = z;
            mo6995g(true);
        }

        /* renamed from: a */
        public void mo6964a(@mr2 Transition transition) {
        }

        /* renamed from: b */
        public void mo6830b(@mr2 Transition transition) {
            mo6995g(true);
        }

        /* renamed from: c */
        public void mo6831c(@mr2 Transition transition) {
        }

        /* renamed from: d */
        public void mo6832d(@mr2 Transition transition) {
            mo6995g(false);
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            mo6994f();
            transition.mo6926h0(this);
        }

        /* renamed from: f */
        public final void mo6994f() {
            if (!this.f5641c) {
                qv4.m26204i(this.f5637a, this.f5636a);
                ViewGroup viewGroup = this.f5638a;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo6995g(false);
        }

        /* renamed from: g */
        public final void mo6995g(boolean z) {
            ViewGroup viewGroup;
            if (this.f5639a && this.f5640b != z && (viewGroup = this.f5638a) != null) {
                this.f5640b = z;
                wt4.m31101d(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f5641c = true;
        }

        public void onAnimationEnd(Animator animator) {
            mo6994f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f5641c) {
                qv4.m26204i(this.f5637a, this.f5636a);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f5641c) {
                qv4.m26204i(this.f5637a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.Visibility$c */
    public @interface C1048c {
    }

    /* renamed from: androidx.transition.Visibility$d */
    public static class C1049d {

        /* renamed from: a */
        public int f5642a;

        /* renamed from: a */
        public ViewGroup f5643a;

        /* renamed from: a */
        public boolean f5644a;

        /* renamed from: b */
        public int f5645b;

        /* renamed from: b */
        public ViewGroup f5646b;

        /* renamed from: b */
        public boolean f5647b;
    }

    public Visibility() {
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5681e);
        int k = xj4.m31494k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            mo6993I0(k);
        }
    }

    /* renamed from: A0 */
    public final void mo6987A0(th4 th4) {
        th4.f20846a.put(f5626h, Integer.valueOf(th4.f20844a.getVisibility()));
        th4.f20846a.put(f5627i, th4.f20844a.getParent());
        int[] iArr = new int[2];
        th4.f20844a.getLocationOnScreen(iArr);
        th4.f20846a.put(f5628j, iArr);
    }

    /* renamed from: B0 */
    public int mo6988B0() {
        return this.f5631u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f5643a == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f5642a == 0) goto L_0x0093;
     */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.transition.Visibility.C1049d mo6989C0(com.onedelhi.secure.th4 r8, com.onedelhi.secure.th4 r9) {
        /*
            r7 = this;
            androidx.transition.Visibility$d r0 = new androidx.transition.Visibility$d
            r0.<init>()
            r1 = 0
            r0.f5644a = r1
            r0.f5647b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f20846a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f20846a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f5642a = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f20846a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f5643a = r6
            goto L_0x0037
        L_0x0033:
            r0.f5642a = r4
            r0.f5643a = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f20846a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f20846a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f5645b = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f20846a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f5646b = r2
            goto L_0x005e
        L_0x005a:
            r0.f5645b = r4
            r0.f5646b = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f5642a
            int r9 = r0.f5645b
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f5643a
            android.view.ViewGroup r4 = r0.f5646b
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f5646b
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f5643a
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f5645b
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f5647b = r2
        L_0x008a:
            r0.f5644a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f5642a
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f5647b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo6989C0(com.onedelhi.secure.th4, com.onedelhi.secure.th4):androidx.transition.Visibility$d");
    }

    /* renamed from: D0 */
    public boolean mo6990D0(th4 th4) {
        if (th4 == null) {
            return false;
        }
        return ((Integer) th4.f20846a.get(f5626h)).intValue() == 0 && ((View) th4.f20846a.get(f5627i)) != null;
    }

    /* renamed from: E0 */
    public Animator mo6878E0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        return null;
    }

    /* renamed from: F0 */
    public Animator mo6991F0(ViewGroup viewGroup, th4 th4, int i, th4 th42, int i2) {
        if ((this.f5631u & 1) != 1 || th42 == null) {
            return null;
        }
        if (th4 == null) {
            View view = (View) th42.f20844a.getParent();
            if (mo6989C0(mo6899J(view, false), mo6908U(view, false)).f5644a) {
                return null;
            }
        }
        return mo6878E0(viewGroup, th42.f20844a, th4, th42);
    }

    /* renamed from: G0 */
    public Animator mo6879G0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f5584b != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo6992H0(android.view.ViewGroup r18, com.onedelhi.secure.th4 r19, int r20, com.onedelhi.secure.th4 r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f5631u
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f20844a
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f20844a
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = androidx.transition.C1060e.C1065e.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            com.onedelhi.secure.th4 r14 = r0.mo6908U(r13, r12)
            com.onedelhi.secure.th4 r15 = r0.mo6899J(r13, r12)
            androidx.transition.Visibility$d r14 = r0.mo6989C0(r14, r15)
            boolean r14 = r14.f5644a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = androidx.transition.C1089k.m7199a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f5584b
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f20846a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            com.onedelhi.secure.vt4 r4 = com.onedelhi.secure.wt4.m31099b(r18)
            r4.mo24083a(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo6879G0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            com.onedelhi.secure.vt4 r1 = com.onedelhi.secure.wt4.m31099b(r18)
            r1.mo24084d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            androidx.transition.Visibility$a r3 = new androidx.transition.Visibility$a
            r3.<init>(r1, r10, r5)
            r0.mo6912a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            com.onedelhi.secure.qv4.m26204i(r8, r11)
            android.animation.Animator r1 = r0.mo6879G0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            androidx.transition.Visibility$b r2 = new androidx.transition.Visibility$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            androidx.transition.C1050a.m7118a(r1, r2)
            r0.mo6912a(r2)
            goto L_0x0106
        L_0x0103:
            com.onedelhi.secure.qv4.m26204i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo6992H0(android.view.ViewGroup, com.onedelhi.secure.th4, int, com.onedelhi.secure.th4, int):android.animation.Animator");
    }

    /* renamed from: I0 */
    public void mo6993I0(int i) {
        if ((i & -4) == 0) {
            this.f5631u = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @ts2
    /* renamed from: T */
    public String[] mo6799T() {
        return f5625a;
    }

    /* renamed from: V */
    public boolean mo6909V(th4 th4, th4 th42) {
        if (th4 == null && th42 == null) {
            return false;
        }
        if (th4 != null && th42 != null && th42.f20846a.containsKey(f5626h) != th4.f20846a.containsKey(f5626h)) {
            return false;
        }
        C1049d C0 = mo6989C0(th4, th42);
        if (C0.f5644a) {
            return C0.f5642a == 0 || C0.f5645b == 0;
        }
        return false;
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        mo6987A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        mo6987A0(th4);
    }

    @ts2
    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, @ts2 th4 th4, @ts2 th4 th42) {
        C1049d C0 = mo6989C0(th4, th42);
        if (!C0.f5644a) {
            return null;
        }
        if (C0.f5643a == null && C0.f5646b == null) {
            return null;
        }
        if (C0.f5647b) {
            return mo6991F0(viewGroup, th4, C0.f5642a, th42, C0.f5645b);
        }
        return mo6992H0(viewGroup, th4, C0.f5642a, th42, C0.f5645b);
    }
}
