package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.onedelhi.secure.C2018e2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nd3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.onedelhi.secure.a2 */
public class C1638a2 {

    /* renamed from: A */
    public static final int f8564A = 1048576;

    /* renamed from: B */
    public static final int f8565B = 2097152;

    /* renamed from: C */
    public static final int f8566C = 1;

    /* renamed from: D */
    public static final int f8567D = 2;

    /* renamed from: E */
    public static final int f8568E = 1;

    /* renamed from: F */
    public static final int f8569F = 2;

    /* renamed from: G */
    public static final int f8570G = 4;

    /* renamed from: H */
    public static final int f8571H = 8;

    /* renamed from: I */
    public static final int f8572I = 16;

    /* renamed from: J */
    public static int f8573J = 0;

    /* renamed from: a */
    public static final String f8574a = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: b */
    public static final String f8575b = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: c */
    public static final int f8576c = 1;

    /* renamed from: c */
    public static final String f8577c = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: d */
    public static final int f8578d = 2;

    /* renamed from: d */
    public static final String f8579d = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: e */
    public static final int f8580e = 4;

    /* renamed from: e */
    public static final String f8581e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: f */
    public static final int f8582f = 8;

    /* renamed from: f */
    public static final String f8583f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: g */
    public static final int f8584g = 1;

    /* renamed from: g */
    public static final String f8585g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: h */
    public static final int f8586h = 2;

    /* renamed from: h */
    public static final String f8587h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: i */
    public static final int f8588i = 4;

    /* renamed from: i */
    public static final String f8589i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: j */
    public static final int f8590j = 8;

    /* renamed from: j */
    public static final String f8591j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: k */
    public static final int f8592k = 16;

    /* renamed from: k */
    public static final String f8593k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* renamed from: l */
    public static final int f8594l = 32;

    /* renamed from: l */
    public static final String f8595l = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* renamed from: m */
    public static final int f8596m = 64;

    /* renamed from: m */
    public static final String f8597m = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* renamed from: n */
    public static final int f8598n = 128;

    /* renamed from: n */
    public static final String f8599n = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* renamed from: o */
    public static final int f8600o = 256;

    /* renamed from: o */
    public static final String f8601o = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* renamed from: p */
    public static final int f8602p = 512;

    /* renamed from: p */
    public static final String f8603p = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* renamed from: q */
    public static final int f8604q = 1024;

    /* renamed from: q */
    public static final String f8605q = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* renamed from: r */
    public static final int f8606r = 2048;

    /* renamed from: r */
    public static final String f8607r = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* renamed from: s */
    public static final int f8608s = 4096;

    /* renamed from: s */
    public static final String f8609s = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* renamed from: t */
    public static final int f8610t = 8192;

    /* renamed from: t */
    public static final String f8611t = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: u */
    public static final int f8612u = 16384;

    /* renamed from: u */
    public static final String f8613u = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* renamed from: v */
    public static final int f8614v = 32768;

    /* renamed from: v */
    public static final String f8615v = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* renamed from: w */
    public static final int f8616w = 65536;
    @SuppressLint({"ActionValue"})

    /* renamed from: w */
    public static final String f8617w = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* renamed from: x */
    public static final int f8618x = 131072;

    /* renamed from: y */
    public static final int f8619y = 262144;

    /* renamed from: z */
    public static final int f8620z = 524288;
    @hl3({hl3.C2354a.f13188c})

    /* renamed from: a */
    public int f8621a = -1;

    /* renamed from: a */
    public final AccessibilityNodeInfo f8622a;

    /* renamed from: b */
    public int f8623b = -1;

    /* renamed from: com.onedelhi.secure.a2$a */
    public static class C1639a {

        /* renamed from: A */
        public static final C1639a f8624A;

        /* renamed from: B */
        public static final C1639a f8625B;
        @mr2

        /* renamed from: C */
        public static final C1639a f8626C;
        @mr2

        /* renamed from: D */
        public static final C1639a f8627D;
        @mr2

        /* renamed from: E */
        public static final C1639a f8628E;
        @mr2

        /* renamed from: F */
        public static final C1639a f8629F;

        /* renamed from: G */
        public static final C1639a f8630G;

        /* renamed from: H */
        public static final C1639a f8631H;

        /* renamed from: I */
        public static final C1639a f8632I;

        /* renamed from: J */
        public static final C1639a f8633J;

        /* renamed from: K */
        public static final C1639a f8634K;
        @mr2

        /* renamed from: L */
        public static final C1639a f8635L;
        @mr2

        /* renamed from: M */
        public static final C1639a f8636M;

        /* renamed from: a */
        public static final C1639a f8637a = new C1639a(1, (CharSequence) null);

        /* renamed from: a */
        public static final String f8638a = "A11yActionCompat";

        /* renamed from: b */
        public static final C1639a f8639b = new C1639a(2, (CharSequence) null);

        /* renamed from: c */
        public static final C1639a f8640c = new C1639a(4, (CharSequence) null);

        /* renamed from: d */
        public static final C1639a f8641d = new C1639a(8, (CharSequence) null);

        /* renamed from: e */
        public static final C1639a f8642e = new C1639a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C1639a f8643f = new C1639a(32, (CharSequence) null);

        /* renamed from: g */
        public static final C1639a f8644g = new C1639a(64, (CharSequence) null);

        /* renamed from: h */
        public static final C1639a f8645h = new C1639a(128, (CharSequence) null);

        /* renamed from: i */
        public static final C1639a f8646i;

        /* renamed from: j */
        public static final C1639a f8647j;

        /* renamed from: k */
        public static final C1639a f8648k;

        /* renamed from: l */
        public static final C1639a f8649l;

        /* renamed from: m */
        public static final C1639a f8650m = new C1639a(4096, (CharSequence) null);

        /* renamed from: n */
        public static final C1639a f8651n = new C1639a(8192, (CharSequence) null);

        /* renamed from: o */
        public static final C1639a f8652o = new C1639a(16384, (CharSequence) null);

        /* renamed from: p */
        public static final C1639a f8653p = new C1639a(32768, (CharSequence) null);

        /* renamed from: q */
        public static final C1639a f8654q = new C1639a(65536, (CharSequence) null);

        /* renamed from: r */
        public static final C1639a f8655r = new C1639a(131072, (CharSequence) null, (Class<? extends C2018e2.C2019a>) C2018e2.C2025g.class);

        /* renamed from: s */
        public static final C1639a f8656s = new C1639a(262144, (CharSequence) null);

        /* renamed from: t */
        public static final C1639a f8657t = new C1639a(524288, (CharSequence) null);

        /* renamed from: u */
        public static final C1639a f8658u = new C1639a(1048576, (CharSequence) null);

        /* renamed from: v */
        public static final C1639a f8659v = new C1639a(2097152, (CharSequence) null, (Class<? extends C2018e2.C2019a>) C2018e2.C2026h.class);

        /* renamed from: w */
        public static final C1639a f8660w;

        /* renamed from: x */
        public static final C1639a f8661x;

        /* renamed from: y */
        public static final C1639a f8662y;

        /* renamed from: z */
        public static final C1639a f8663z;

        /* renamed from: a */
        public final int f8664a;
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: a */
        public final C2018e2 f8665a;

        /* renamed from: a */
        public final Class<? extends C2018e2.C2019a> f8666a;

        /* renamed from: a */
        public final Object f8667a;

        static {
            Class<C2018e2.C2021c> cls = C2018e2.C2021c.class;
            Class<C2018e2.C2020b> cls2 = C2018e2.C2020b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f8646i = new C1639a(256, (CharSequence) null, (Class<? extends C2018e2.C2019a>) cls2);
            f8647j = new C1639a(512, (CharSequence) null, (Class<? extends C2018e2.C2019a>) cls2);
            f8648k = new C1639a(1024, (CharSequence) null, (Class<? extends C2018e2.C2019a>) cls);
            f8649l = new C1639a(2048, (CharSequence) null, (Class<? extends C2018e2.C2019a>) cls);
            int i = Build.VERSION.SDK_INT;
            f8660w = new C1639a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8661x = new C1639a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C2018e2) null, C2018e2.C2023e.class);
            f8662y = new C1639a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8663z = new C1639a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8624A = new C1639a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8625B = new C1639a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8626C = new C1639a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8627D = new C1639a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8628E = new C1639a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8629F = new C1639a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8630G = new C1639a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8631H = new C1639a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C2018e2) null, C2018e2.C2024f.class);
            f8632I = new C1639a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C2018e2) null, C2018e2.C2022d.class);
            f8633J = new C1639a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8634K = new C1639a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            f8635L = new C1639a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f8636M = new C1639a(accessibilityAction, 16908372, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
        }

        public C1639a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
        }

        @hl3({hl3.C2354a.f13188c})
        public C1639a(int i, CharSequence charSequence, C2018e2 e2Var) {
            this((Object) null, i, charSequence, e2Var, (Class<? extends C2018e2.C2019a>) null);
        }

        public C1639a(int i, CharSequence charSequence, Class<? extends C2018e2.C2019a> cls) {
            this((Object) null, i, charSequence, (C2018e2) null, cls);
        }

        public C1639a(Object obj) {
            this(obj, 0, (CharSequence) null, (C2018e2) null, (Class<? extends C2018e2.C2019a>) null);
        }

        public C1639a(Object obj, int i, CharSequence charSequence, C2018e2 e2Var, Class<? extends C2018e2.C2019a> cls) {
            this.f8664a = i;
            this.f8665a = e2Var;
            this.f8667a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f8666a = cls;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: a */
        public C1639a mo12635a(CharSequence charSequence, C2018e2 e2Var) {
            return new C1639a((Object) null, this.f8664a, charSequence, e2Var, this.f8666a);
        }

        /* renamed from: b */
        public int mo12636b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f8667a).getId();
        }

        /* renamed from: c */
        public CharSequence mo12637c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f8667a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        @com.onedelhi.secure.hl3({com.onedelhi.secure.hl3.C2354a.f13188c})
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo12638d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                com.onedelhi.secure.e2 r0 = r4.f8665a
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends com.onedelhi.secure.e2$a> r2 = r4.f8666a
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                com.onedelhi.secure.e2$a r1 = (com.onedelhi.secure.C2018e2.C2019a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo14978a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends com.onedelhi.secure.e2$a> r1 = r4.f8666a
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                com.onedelhi.secure.e2 r6 = r4.f8665a
                boolean r5 = r6.mo4110a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C1638a2.C1639a.mo12638d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(@ts2 Object obj) {
            if (obj == null || !(obj instanceof C1639a)) {
                return false;
            }
            Object obj2 = this.f8667a;
            Object obj3 = ((C1639a) obj).f8667a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f8667a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: com.onedelhi.secure.a2$b */
    public static class C1640b {

        /* renamed from: a */
        public static final int f8668a = 0;

        /* renamed from: b */
        public static final int f8669b = 1;

        /* renamed from: c */
        public static final int f8670c = 2;

        /* renamed from: a */
        public final Object f8671a;

        public C1640b(Object obj) {
            this.f8671a = obj;
        }

        /* renamed from: e */
        public static C1640b m10702e(int i, int i2, boolean z) {
            return new C1640b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: f */
        public static C1640b m10703f(int i, int i2, boolean z, int i3) {
            return new C1640b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        /* renamed from: a */
        public int mo12641a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f8671a).getColumnCount();
        }

        /* renamed from: b */
        public int mo12642b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f8671a).getRowCount();
        }

        /* renamed from: c */
        public int mo12643c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f8671a).getSelectionMode();
        }

        /* renamed from: d */
        public boolean mo12644d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f8671a).isHierarchical();
        }
    }

    /* renamed from: com.onedelhi.secure.a2$c */
    public static class C1641c {

        /* renamed from: a */
        public final Object f8672a;

        public C1641c(Object obj) {
            this.f8672a = obj;
        }

        /* renamed from: g */
        public static C1641c m10708g(int i, int i2, int i3, int i4, boolean z) {
            return new C1641c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        /* renamed from: h */
        public static C1641c m10709h(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C1641c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        /* renamed from: a */
        public int mo12645a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8672a).getColumnIndex();
        }

        /* renamed from: b */
        public int mo12646b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8672a).getColumnSpan();
        }

        /* renamed from: c */
        public int mo12647c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8672a).getRowIndex();
        }

        /* renamed from: d */
        public int mo12648d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8672a).getRowSpan();
        }

        @Deprecated
        /* renamed from: e */
        public boolean mo12649e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8672a).isHeading();
        }

        /* renamed from: f */
        public boolean mo12650f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8672a).isSelected();
        }
    }

    /* renamed from: com.onedelhi.secure.a2$d */
    public static class C1642d {

        /* renamed from: a */
        public static final int f8673a = 0;

        /* renamed from: b */
        public static final int f8674b = 1;

        /* renamed from: c */
        public static final int f8675c = 2;

        /* renamed from: a */
        public final Object f8676a;

        public C1642d(Object obj) {
            this.f8676a = obj;
        }

        /* renamed from: e */
        public static C1642d m10716e(int i, float f, float f2, float f3) {
            return new C1642d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        /* renamed from: a */
        public float mo12651a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f8676a).getCurrent();
        }

        /* renamed from: b */
        public float mo12652b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f8676a).getMax();
        }

        /* renamed from: c */
        public float mo12653c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f8676a).getMin();
        }

        /* renamed from: d */
        public int mo12654d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f8676a).getType();
        }
    }

    /* renamed from: com.onedelhi.secure.a2$e */
    public static final class C1643e {

        /* renamed from: a */
        public final AccessibilityNodeInfo.TouchDelegateInfo f8677a;

        public C1643e(@mr2 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f8677a = touchDelegateInfo;
        }

        public C1643e(@mr2 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f8677a = new AccessibilityNodeInfo.TouchDelegateInfo(map);
            } else {
                this.f8677a = null;
            }
        }

        @ts2
        /* renamed from: a */
        public Region mo12655a(@js1(from = 0) int i) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f8677a.getRegionAt(i);
            }
            return null;
        }

        @js1(from = 0)
        /* renamed from: b */
        public int mo12656b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f8677a.getRegionCount();
            }
            return 0;
        }

        @ts2
        /* renamed from: c */
        public C1638a2 mo12657c(@mr2 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f8677a.getTargetForRegion(region)) == null) {
                return null;
            }
            return C1638a2.m10547X1(targetForRegion);
        }
    }

    public C1638a2(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f8622a = accessibilityNodeInfo;
    }

    @Deprecated
    public C1638a2(Object obj) {
        this.f8622a = (AccessibilityNodeInfo) obj;
    }

    /* renamed from: C0 */
    public static C1638a2 m10543C0() {
        return m10547X1(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: D0 */
    public static C1638a2 m10544D0(View view) {
        return m10547X1(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: E0 */
    public static C1638a2 m10545E0(View view, int i) {
        return m10548Y1(AccessibilityNodeInfo.obtain(view, i));
    }

    /* renamed from: F0 */
    public static C1638a2 m10546F0(C1638a2 a2Var) {
        return m10547X1(AccessibilityNodeInfo.obtain(a2Var.f8622a));
    }

    /* renamed from: X1 */
    public static C1638a2 m10547X1(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1638a2(accessibilityNodeInfo);
    }

    /* renamed from: Y1 */
    public static C1638a2 m10548Y1(Object obj) {
        if (obj != null) {
            return new C1638a2(obj);
        }
        return null;
    }

    /* renamed from: o */
    public static String m10549o(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: x */
    public static ClickableSpan[] m10550x(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public CharSequence mo12485A() {
        return this.f8622a.getContentDescription();
    }

    /* renamed from: A0 */
    public boolean mo12486A0() {
        return Build.VERSION.SDK_INT >= 29 ? this.f8622a.isTextEntryKey() : mo12608r(8);
    }

    /* renamed from: A1 */
    public void mo12487A1(View view, int i) {
        this.f8621a = i;
        this.f8622a.setParent(view, i);
    }

    /* renamed from: B */
    public int mo12488B() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f8622a.getDrawingOrder();
        }
        return 0;
    }

    /* renamed from: B0 */
    public boolean mo12489B0() {
        return this.f8622a.isVisibleToUser();
    }

    /* renamed from: B1 */
    public void mo12490B1(boolean z) {
        this.f8622a.setPassword(z);
    }

    /* renamed from: C */
    public CharSequence mo12491C() {
        return this.f8622a.getError();
    }

    /* renamed from: C1 */
    public void mo12492C1(C1642d dVar) {
        this.f8622a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f8676a);
    }

    /* renamed from: D */
    public Bundle mo12493D() {
        return this.f8622a.getExtras();
    }

    /* renamed from: D1 */
    public void mo12494D1(@ts2 CharSequence charSequence) {
        this.f8622a.getExtras().putCharSequence(f8574a, charSequence);
    }

    @ts2
    /* renamed from: E */
    public CharSequence mo12495E() {
        return Build.VERSION.SDK_INT >= 26 ? this.f8622a.getHintText() : this.f8622a.getExtras().getCharSequence(f8579d);
    }

    /* renamed from: E1 */
    public void mo12496E1(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8622a.setScreenReaderFocusable(z);
        } else {
            mo12530Q0(1, z);
        }
    }

    @Deprecated
    /* renamed from: F */
    public Object mo12497F() {
        return this.f8622a;
    }

    /* renamed from: F1 */
    public void mo12498F1(boolean z) {
        this.f8622a.setScrollable(z);
    }

    /* renamed from: G */
    public int mo12499G() {
        return this.f8622a.getInputType();
    }

    /* renamed from: G0 */
    public boolean mo12500G0(int i) {
        return this.f8622a.performAction(i);
    }

    /* renamed from: G1 */
    public void mo12501G1(boolean z) {
        this.f8622a.setSelected(z);
    }

    /* renamed from: H */
    public C1638a2 mo12502H() {
        return m10548Y1(this.f8622a.getLabelFor());
    }

    /* renamed from: H0 */
    public boolean mo12503H0(int i, Bundle bundle) {
        return this.f8622a.performAction(i, bundle);
    }

    /* renamed from: H1 */
    public void mo12504H1(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8622a.setShowingHintText(z);
        } else {
            mo12530Q0(4, z);
        }
    }

    /* renamed from: I */
    public C1638a2 mo12505I() {
        return m10548Y1(this.f8622a.getLabeledBy());
    }

    /* renamed from: I0 */
    public void mo12506I0() {
        this.f8622a.recycle();
    }

    /* renamed from: I1 */
    public void mo12507I1(View view) {
        this.f8623b = -1;
        this.f8622a.setSource(view);
    }

    /* renamed from: J */
    public int mo12508J() {
        return this.f8622a.getLiveRegion();
    }

    /* renamed from: J0 */
    public boolean mo12509J0() {
        return this.f8622a.refresh();
    }

    /* renamed from: J1 */
    public void mo12510J1(View view, int i) {
        this.f8623b = i;
        this.f8622a.setSource(view, i);
    }

    /* renamed from: K */
    public int mo12511K() {
        return this.f8622a.getMaxTextLength();
    }

    /* renamed from: K0 */
    public boolean mo12512K0(C1639a aVar) {
        return this.f8622a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f8667a);
    }

    /* renamed from: K1 */
    public void mo12513K1(@ts2 CharSequence charSequence) {
        if (C3730uo.m29479h()) {
            this.f8622a.setStateDescription(charSequence);
        } else {
            this.f8622a.getExtras().putCharSequence(f8593k, charSequence);
        }
    }

    /* renamed from: L */
    public int mo12514L() {
        return this.f8622a.getMovementGranularities();
    }

    /* renamed from: L0 */
    public boolean mo12515L0(View view) {
        return this.f8622a.removeChild(view);
    }

    /* renamed from: L1 */
    public void mo12516L1(CharSequence charSequence) {
        this.f8622a.setText(charSequence);
    }

    /* renamed from: M */
    public final SparseArray<WeakReference<ClickableSpan>> mo12517M(View view) {
        SparseArray<WeakReference<ClickableSpan>> S = mo12535S(view);
        if (S != null) {
            return S;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(nd3.C2969e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: M0 */
    public boolean mo12518M0(View view, int i) {
        return this.f8622a.removeChild(view, i);
    }

    /* renamed from: M1 */
    public void mo12519M1(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8622a.setTextEntryKey(z);
        } else {
            mo12530Q0(8, z);
        }
    }

    /* renamed from: N */
    public CharSequence mo12520N() {
        return this.f8622a.getPackageName();
    }

    /* renamed from: N0 */
    public final void mo12521N0(View view) {
        SparseArray<WeakReference<ClickableSpan>> S = mo12535S(view);
        if (S != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < S.size(); i++) {
                if (S.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                S.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: N1 */
    public void mo12522N1(int i, int i2) {
        this.f8622a.setTextSelection(i, i2);
    }

    @ts2
    /* renamed from: O */
    public CharSequence mo12523O() {
        return Build.VERSION.SDK_INT >= 28 ? this.f8622a.getPaneTitle() : this.f8622a.getExtras().getCharSequence(f8575b);
    }

    /* renamed from: O0 */
    public void mo12524O0(boolean z) {
        this.f8622a.setAccessibilityFocused(z);
    }

    /* renamed from: O1 */
    public void mo12525O1(@ts2 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8622a.setTooltipText(charSequence);
        } else {
            this.f8622a.getExtras().putCharSequence(f8577c, charSequence);
        }
    }

    /* renamed from: P */
    public C1638a2 mo12526P() {
        return m10548Y1(this.f8622a.getParent());
    }

    /* renamed from: P0 */
    public void mo12527P0(@mr2 List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8622a.setAvailableExtraData(list);
        }
    }

    /* renamed from: P1 */
    public void mo12528P1(@mr2 C1643e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8622a.setTouchDelegateInfo(eVar.f8677a);
        }
    }

    /* renamed from: Q */
    public C1642d mo12529Q() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f8622a.getRangeInfo();
        if (rangeInfo != null) {
            return new C1642d(rangeInfo);
        }
        return null;
    }

    /* renamed from: Q0 */
    public final void mo12530Q0(int i, boolean z) {
        Bundle D = mo12493D();
        if (D != null) {
            int i2 = D.getInt(f8581e, 0) & (~i);
            if (!z) {
                i = 0;
            }
            D.putInt(f8581e, i | i2);
        }
    }

    /* renamed from: Q1 */
    public void mo12531Q1(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f8622a.setTraversalAfter(view);
        }
    }

    @ts2
    /* renamed from: R */
    public CharSequence mo12532R() {
        return this.f8622a.getExtras().getCharSequence(f8574a);
    }

    @Deprecated
    /* renamed from: R0 */
    public void mo12533R0(Rect rect) {
        this.f8622a.setBoundsInParent(rect);
    }

    /* renamed from: R1 */
    public void mo12534R1(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f8622a.setTraversalAfter(view, i);
        }
    }

    /* renamed from: S */
    public final SparseArray<WeakReference<ClickableSpan>> mo12535S(View view) {
        return (SparseArray) view.getTag(nd3.C2969e.tag_accessibility_clickable_spans);
    }

    /* renamed from: S0 */
    public void mo12536S0(Rect rect) {
        this.f8622a.setBoundsInScreen(rect);
    }

    /* renamed from: S1 */
    public void mo12537S1(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f8622a.setTraversalBefore(view);
        }
    }

    @ts2
    /* renamed from: T */
    public CharSequence mo12538T() {
        return C3730uo.m29479h() ? this.f8622a.getStateDescription() : this.f8622a.getExtras().getCharSequence(f8593k);
    }

    /* renamed from: T0 */
    public void mo12539T0(boolean z) {
        this.f8622a.setCanOpenPopup(z);
    }

    /* renamed from: T1 */
    public void mo12540T1(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f8622a.setTraversalBefore(view, i);
        }
    }

    /* renamed from: U */
    public CharSequence mo12541U() {
        if (!mo12569e0()) {
            return this.f8622a.getText();
        }
        List<Integer> i = mo12582i(f8585g);
        List<Integer> i2 = mo12582i(f8587h);
        List<Integer> i3 = mo12582i(f8589i);
        List<Integer> i4 = mo12582i(f8583f);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f8622a.getText(), 0, this.f8622a.getText().length()));
        for (int i5 = 0; i5 < i.size(); i5++) {
            spannableString.setSpan(new C3823w1(i4.get(i5).intValue(), this, mo12493D().getInt(f8591j)), i.get(i5).intValue(), i2.get(i5).intValue(), i3.get(i5).intValue());
        }
        return spannableString;
    }

    /* renamed from: U0 */
    public void mo12542U0(boolean z) {
        this.f8622a.setCheckable(z);
    }

    /* renamed from: U1 */
    public void mo12543U1(String str) {
        this.f8622a.setViewIdResourceName(str);
    }

    /* renamed from: V */
    public int mo12544V() {
        return this.f8622a.getTextSelectionEnd();
    }

    /* renamed from: V0 */
    public void mo12545V0(boolean z) {
        this.f8622a.setChecked(z);
    }

    /* renamed from: V1 */
    public void mo12546V1(boolean z) {
        this.f8622a.setVisibleToUser(z);
    }

    /* renamed from: W */
    public int mo12547W() {
        return this.f8622a.getTextSelectionStart();
    }

    /* renamed from: W0 */
    public void mo12548W0(CharSequence charSequence) {
        this.f8622a.setClassName(charSequence);
    }

    /* renamed from: W1 */
    public AccessibilityNodeInfo mo12549W1() {
        return this.f8622a;
    }

    @ts2
    /* renamed from: X */
    public CharSequence mo12550X() {
        return Build.VERSION.SDK_INT >= 28 ? this.f8622a.getTooltipText() : this.f8622a.getExtras().getCharSequence(f8577c);
    }

    /* renamed from: X0 */
    public void mo12551X0(boolean z) {
        this.f8622a.setClickable(z);
    }

    @ts2
    /* renamed from: Y */
    public C1643e mo12552Y() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f8622a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new C1643e(touchDelegateInfo);
    }

    /* renamed from: Y0 */
    public void mo12553Y0(Object obj) {
        this.f8622a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C1640b) obj).f8671a);
    }

    /* renamed from: Z */
    public C1638a2 mo12554Z() {
        if (Build.VERSION.SDK_INT >= 22) {
            return m10548Y1(this.f8622a.getTraversalAfter());
        }
        return null;
    }

    /* renamed from: Z0 */
    public void mo12555Z0(Object obj) {
        this.f8622a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C1641c) obj).f8672a);
    }

    /* renamed from: a */
    public void mo12556a(int i) {
        this.f8622a.addAction(i);
    }

    /* renamed from: a0 */
    public C1638a2 mo12557a0() {
        if (Build.VERSION.SDK_INT >= 22) {
            return m10548Y1(this.f8622a.getTraversalBefore());
        }
        return null;
    }

    /* renamed from: a1 */
    public void mo12558a1(CharSequence charSequence) {
        this.f8622a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void mo12559b(C1639a aVar) {
        this.f8622a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f8667a);
    }

    /* renamed from: b0 */
    public String mo12560b0() {
        return this.f8622a.getViewIdResourceName();
    }

    /* renamed from: b1 */
    public void mo12561b1(boolean z) {
        this.f8622a.setContentInvalid(z);
    }

    /* renamed from: c */
    public void mo12562c(View view) {
        this.f8622a.addChild(view);
    }

    /* renamed from: c0 */
    public C2110f2 mo12563c0() {
        return C2110f2.m14531r(this.f8622a.getWindow());
    }

    /* renamed from: c1 */
    public void mo12564c1(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f8622a.setContextClickable(z);
        }
    }

    /* renamed from: d */
    public void mo12565d(View view, int i) {
        this.f8622a.addChild(view, i);
    }

    /* renamed from: d0 */
    public int mo12566d0() {
        return this.f8622a.getWindowId();
    }

    /* renamed from: d1 */
    public void mo12567d1(boolean z) {
        this.f8622a.setDismissable(z);
    }

    /* renamed from: e */
    public final void mo12568e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        mo12582i(f8585g).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        mo12582i(f8587h).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        mo12582i(f8589i).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        mo12582i(f8583f).add(Integer.valueOf(i));
    }

    /* renamed from: e0 */
    public final boolean mo12569e0() {
        return !mo12582i(f8585g).isEmpty();
    }

    /* renamed from: e1 */
    public void mo12570e1(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f8622a.setDrawingOrder(i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1638a2)) {
            return false;
        }
        C1638a2 a2Var = (C1638a2) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8622a;
        if (accessibilityNodeInfo == null) {
            if (a2Var.f8622a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(a2Var.f8622a)) {
            return false;
        }
        return this.f8623b == a2Var.f8623b && this.f8621a == a2Var.f8621a;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: f */
    public void mo12572f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            mo12578h();
            mo12521N0(view);
            ClickableSpan[] x = m10550x(charSequence);
            if (x != null && x.length > 0) {
                mo12493D().putInt(f8591j, nd3.C2969e.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> M = mo12517M(view);
                for (int i = 0; i < x.length; i++) {
                    int f0 = mo12573f0(x[i], M);
                    M.put(f0, new WeakReference(x[i]));
                    mo12568e(x[i], (Spanned) charSequence, f0);
                }
            }
        }
    }

    /* renamed from: f0 */
    public final int mo12573f0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f8573J;
        f8573J = i2 + 1;
        return i2;
    }

    /* renamed from: f1 */
    public void mo12574f1(boolean z) {
        this.f8622a.setEditable(z);
    }

    /* renamed from: g */
    public boolean mo12575g() {
        return this.f8622a.canOpenPopup();
    }

    /* renamed from: g0 */
    public boolean mo12576g0() {
        return this.f8622a.isAccessibilityFocused();
    }

    /* renamed from: g1 */
    public void mo12577g1(boolean z) {
        this.f8622a.setEnabled(z);
    }

    /* renamed from: h */
    public final void mo12578h() {
        this.f8622a.getExtras().remove(f8585g);
        this.f8622a.getExtras().remove(f8587h);
        this.f8622a.getExtras().remove(f8589i);
        this.f8622a.getExtras().remove(f8583f);
    }

    /* renamed from: h0 */
    public boolean mo12579h0() {
        return this.f8622a.isCheckable();
    }

    /* renamed from: h1 */
    public void mo12580h1(CharSequence charSequence) {
        this.f8622a.setError(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8622a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final List<Integer> mo12582i(String str) {
        ArrayList<Integer> integerArrayList = this.f8622a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f8622a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: i0 */
    public boolean mo12583i0() {
        return this.f8622a.isChecked();
    }

    /* renamed from: i1 */
    public void mo12584i1(boolean z) {
        this.f8622a.setFocusable(z);
    }

    /* renamed from: j */
    public List<C1638a2> mo12585j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f8622a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m10547X1(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    /* renamed from: j0 */
    public boolean mo12586j0() {
        return this.f8622a.isClickable();
    }

    /* renamed from: j1 */
    public void mo12587j1(boolean z) {
        this.f8622a.setFocused(z);
    }

    /* renamed from: k */
    public List<C1638a2> mo12588k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f8622a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo X1 : findAccessibilityNodeInfosByViewId) {
            arrayList.add(m10547X1(X1));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public boolean mo12589k0() {
        return this.f8622a.isContentInvalid();
    }

    /* renamed from: k1 */
    public void mo12590k1(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8622a.setHeading(z);
        } else {
            mo12530Q0(2, z);
        }
    }

    /* renamed from: l */
    public C1638a2 mo12591l(int i) {
        return m10548Y1(this.f8622a.findFocus(i));
    }

    /* renamed from: l0 */
    public boolean mo12592l0() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f8622a.isContextClickable();
        }
        return false;
    }

    /* renamed from: l1 */
    public void mo12593l1(@ts2 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8622a.setHintText(charSequence);
        } else {
            this.f8622a.getExtras().putCharSequence(f8579d, charSequence);
        }
    }

    /* renamed from: m */
    public C1638a2 mo12594m(int i) {
        return m10548Y1(this.f8622a.focusSearch(i));
    }

    /* renamed from: m0 */
    public boolean mo12595m0() {
        return this.f8622a.isDismissable();
    }

    /* renamed from: m1 */
    public void mo12596m1(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f8622a.setImportantForAccessibility(z);
        }
    }

    /* renamed from: n */
    public List<C1639a> mo12597n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f8622a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1639a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    public boolean mo12598n0() {
        return this.f8622a.isEditable();
    }

    /* renamed from: n1 */
    public void mo12599n1(int i) {
        this.f8622a.setInputType(i);
    }

    /* renamed from: o0 */
    public boolean mo12600o0() {
        return this.f8622a.isEnabled();
    }

    /* renamed from: o1 */
    public void mo12601o1(View view) {
        this.f8622a.setLabelFor(view);
    }

    /* renamed from: p */
    public int mo12602p() {
        return this.f8622a.getActions();
    }

    /* renamed from: p0 */
    public boolean mo12603p0() {
        return this.f8622a.isFocusable();
    }

    /* renamed from: p1 */
    public void mo12604p1(View view, int i) {
        this.f8622a.setLabelFor(view, i);
    }

    @mr2
    /* renamed from: q */
    public List<String> mo12605q() {
        return Build.VERSION.SDK_INT >= 26 ? this.f8622a.getAvailableExtraData() : Collections.emptyList();
    }

    /* renamed from: q0 */
    public boolean mo12606q0() {
        return this.f8622a.isFocused();
    }

    /* renamed from: q1 */
    public void mo12607q1(View view) {
        this.f8622a.setLabeledBy(view);
    }

    /* renamed from: r */
    public final boolean mo12608r(int i) {
        Bundle D = mo12493D();
        return D != null && (D.getInt(f8581e, 0) & i) == i;
    }

    /* renamed from: r0 */
    public boolean mo12609r0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f8622a.isHeading();
        }
        if (mo12608r(2)) {
            return true;
        }
        C1641c z = mo12632z();
        return z != null && z.mo12649e();
    }

    /* renamed from: r1 */
    public void mo12610r1(View view, int i) {
        this.f8622a.setLabeledBy(view, i);
    }

    @Deprecated
    /* renamed from: s */
    public void mo12611s(Rect rect) {
        this.f8622a.getBoundsInParent(rect);
    }

    /* renamed from: s0 */
    public boolean mo12612s0() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f8622a.isImportantForAccessibility();
        }
        return true;
    }

    /* renamed from: s1 */
    public void mo12613s1(int i) {
        this.f8622a.setLiveRegion(i);
    }

    /* renamed from: t */
    public void mo12614t(Rect rect) {
        this.f8622a.getBoundsInScreen(rect);
    }

    /* renamed from: t0 */
    public boolean mo12615t0() {
        return this.f8622a.isLongClickable();
    }

    /* renamed from: t1 */
    public void mo12616t1(boolean z) {
        this.f8622a.setLongClickable(z);
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo12611s(rect);
        sb.append("; boundsInParent: " + rect);
        mo12614t(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo12520N());
        sb.append("; className: ");
        sb.append(mo12624w());
        sb.append("; text: ");
        sb.append(mo12541U());
        sb.append("; contentDescription: ");
        sb.append(mo12485A());
        sb.append("; viewId: ");
        sb.append(mo12560b0());
        sb.append("; checkable: ");
        sb.append(mo12579h0());
        sb.append("; checked: ");
        sb.append(mo12583i0());
        sb.append("; focusable: ");
        sb.append(mo12603p0());
        sb.append("; focused: ");
        sb.append(mo12606q0());
        sb.append("; selected: ");
        sb.append(mo12630y0());
        sb.append("; clickable: ");
        sb.append(mo12586j0());
        sb.append("; longClickable: ");
        sb.append(mo12615t0());
        sb.append("; enabled: ");
        sb.append(mo12600o0());
        sb.append("; password: ");
        sb.append(mo12622v0());
        sb.append("; scrollable: " + mo12627x0());
        sb.append("; [");
        List<C1639a> n = mo12597n();
        for (int i = 0; i < n.size(); i++) {
            C1639a aVar = n.get(i);
            String o = m10549o(aVar.mo12636b());
            if (o.equals("ACTION_UNKNOWN") && aVar.mo12637c() != null) {
                o = aVar.mo12637c().toString();
            }
            sb.append(o);
            if (i != n.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public C1638a2 mo12618u(int i) {
        return m10548Y1(this.f8622a.getChild(i));
    }

    /* renamed from: u0 */
    public boolean mo12619u0() {
        return this.f8622a.isMultiLine();
    }

    /* renamed from: u1 */
    public void mo12620u1(int i) {
        this.f8622a.setMaxTextLength(i);
    }

    /* renamed from: v */
    public int mo12621v() {
        return this.f8622a.getChildCount();
    }

    /* renamed from: v0 */
    public boolean mo12622v0() {
        return this.f8622a.isPassword();
    }

    /* renamed from: v1 */
    public void mo12623v1(int i) {
        this.f8622a.setMovementGranularities(i);
    }

    /* renamed from: w */
    public CharSequence mo12624w() {
        return this.f8622a.getClassName();
    }

    /* renamed from: w0 */
    public boolean mo12625w0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f8622a.isScreenReaderFocusable() : mo12608r(1);
    }

    /* renamed from: w1 */
    public void mo12626w1(boolean z) {
        this.f8622a.setMultiLine(z);
    }

    /* renamed from: x0 */
    public boolean mo12627x0() {
        return this.f8622a.isScrollable();
    }

    /* renamed from: x1 */
    public void mo12628x1(CharSequence charSequence) {
        this.f8622a.setPackageName(charSequence);
    }

    /* renamed from: y */
    public C1640b mo12629y() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f8622a.getCollectionInfo();
        if (collectionInfo != null) {
            return new C1640b(collectionInfo);
        }
        return null;
    }

    /* renamed from: y0 */
    public boolean mo12630y0() {
        return this.f8622a.isSelected();
    }

    /* renamed from: y1 */
    public void mo12631y1(@ts2 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8622a.setPaneTitle(charSequence);
        } else {
            this.f8622a.getExtras().putCharSequence(f8575b, charSequence);
        }
    }

    /* renamed from: z */
    public C1641c mo12632z() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f8622a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new C1641c(collectionItemInfo);
        }
        return null;
    }

    /* renamed from: z0 */
    public boolean mo12633z0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f8622a.isShowingHintText() : mo12608r(4);
    }

    /* renamed from: z1 */
    public void mo12634z1(View view) {
        this.f8621a = -1;
        this.f8622a.setParent(view);
    }
}
