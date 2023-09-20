package com.onedelhi.secure;

import android.view.MotionEvent;

public final class dl2 {
    @Deprecated

    /* renamed from: A */
    public static final int f10803A = 17;
    @Deprecated

    /* renamed from: B */
    public static final int f10804B = 18;
    @Deprecated

    /* renamed from: C */
    public static final int f10805C = 19;
    @Deprecated

    /* renamed from: D */
    public static final int f10806D = 20;
    @Deprecated

    /* renamed from: E */
    public static final int f10807E = 21;
    @Deprecated

    /* renamed from: F */
    public static final int f10808F = 22;
    @Deprecated

    /* renamed from: G */
    public static final int f10809G = 23;
    @Deprecated

    /* renamed from: H */
    public static final int f10810H = 24;
    @Deprecated

    /* renamed from: I */
    public static final int f10811I = 25;

    /* renamed from: J */
    public static final int f10812J = 26;

    /* renamed from: K */
    public static final int f10813K = 27;

    /* renamed from: L */
    public static final int f10814L = 28;
    @Deprecated

    /* renamed from: M */
    public static final int f10815M = 32;
    @Deprecated

    /* renamed from: N */
    public static final int f10816N = 33;
    @Deprecated

    /* renamed from: O */
    public static final int f10817O = 34;
    @Deprecated

    /* renamed from: P */
    public static final int f10818P = 35;
    @Deprecated

    /* renamed from: Q */
    public static final int f10819Q = 36;
    @Deprecated

    /* renamed from: R */
    public static final int f10820R = 37;
    @Deprecated

    /* renamed from: S */
    public static final int f10821S = 38;
    @Deprecated

    /* renamed from: T */
    public static final int f10822T = 39;
    @Deprecated

    /* renamed from: U */
    public static final int f10823U = 40;
    @Deprecated

    /* renamed from: V */
    public static final int f10824V = 41;
    @Deprecated

    /* renamed from: W */
    public static final int f10825W = 42;
    @Deprecated

    /* renamed from: X */
    public static final int f10826X = 43;
    @Deprecated

    /* renamed from: Y */
    public static final int f10827Y = 44;
    @Deprecated

    /* renamed from: Z */
    public static final int f10828Z = 45;
    @Deprecated

    /* renamed from: a */
    public static final int f10829a = 255;
    @Deprecated

    /* renamed from: a0 */
    public static final int f10830a0 = 46;
    @Deprecated

    /* renamed from: b */
    public static final int f10831b = 5;
    @Deprecated

    /* renamed from: b0 */
    public static final int f10832b0 = 47;
    @Deprecated

    /* renamed from: c */
    public static final int f10833c = 6;
    @Deprecated

    /* renamed from: c0 */
    public static final int f10834c0 = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f10835d = 7;
    @Deprecated

    /* renamed from: e */
    public static final int f10836e = 8;
    @Deprecated

    /* renamed from: f */
    public static final int f10837f = 65280;
    @Deprecated

    /* renamed from: g */
    public static final int f10838g = 8;
    @Deprecated

    /* renamed from: h */
    public static final int f10839h = 9;
    @Deprecated

    /* renamed from: i */
    public static final int f10840i = 10;
    @Deprecated

    /* renamed from: j */
    public static final int f10841j = 0;
    @Deprecated

    /* renamed from: k */
    public static final int f10842k = 1;
    @Deprecated

    /* renamed from: l */
    public static final int f10843l = 2;
    @Deprecated

    /* renamed from: m */
    public static final int f10844m = 3;
    @Deprecated

    /* renamed from: n */
    public static final int f10845n = 4;
    @Deprecated

    /* renamed from: o */
    public static final int f10846o = 5;
    @Deprecated

    /* renamed from: p */
    public static final int f10847p = 6;
    @Deprecated

    /* renamed from: q */
    public static final int f10848q = 7;
    @Deprecated

    /* renamed from: r */
    public static final int f10849r = 8;
    @Deprecated

    /* renamed from: s */
    public static final int f10850s = 9;
    @Deprecated

    /* renamed from: t */
    public static final int f10851t = 10;
    @Deprecated

    /* renamed from: u */
    public static final int f10852u = 11;
    @Deprecated

    /* renamed from: v */
    public static final int f10853v = 12;
    @Deprecated

    /* renamed from: w */
    public static final int f10854w = 13;
    @Deprecated

    /* renamed from: x */
    public static final int f10855x = 14;
    @Deprecated

    /* renamed from: y */
    public static final int f10856y = 15;
    @Deprecated

    /* renamed from: z */
    public static final int f10857z = 16;

    @Deprecated
    /* renamed from: a */
    public static int m13223a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m13224b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: c */
    public static int m13225c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* renamed from: d */
    public static float m13226d(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    @Deprecated
    /* renamed from: e */
    public static float m13227e(MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }

    @Deprecated
    /* renamed from: f */
    public static int m13228f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    /* renamed from: g */
    public static int m13229g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    /* renamed from: h */
    public static int m13230h(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: i */
    public static int m13231i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    /* renamed from: j */
    public static float m13232j(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* renamed from: k */
    public static float m13233k(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: l */
    public static boolean m13234l(@mr2 MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
