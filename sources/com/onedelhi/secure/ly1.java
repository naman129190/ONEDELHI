package com.onedelhi.secure;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C0419a;
import java.util.HashMap;
import java.util.HashSet;

public abstract class ly1 {

    /* renamed from: b */
    public static final String f15664b = "alpha";

    /* renamed from: c */
    public static final String f15665c = "elevation";

    /* renamed from: d */
    public static int f15666d = -1;

    /* renamed from: d */
    public static final String f15667d = "rotation";

    /* renamed from: e */
    public static final String f15668e = "rotationX";

    /* renamed from: f */
    public static final String f15669f = "rotationY";

    /* renamed from: g */
    public static final String f15670g = "transformPivotX";

    /* renamed from: h */
    public static final String f15671h = "transformPivotY";

    /* renamed from: i */
    public static final String f15672i = "transitionPathRotate";

    /* renamed from: j */
    public static final String f15673j = "scaleX";

    /* renamed from: k */
    public static final String f15674k = "scaleY";

    /* renamed from: l */
    public static final String f15675l = "wavePeriod";

    /* renamed from: m */
    public static final String f15676m = "waveOffset";

    /* renamed from: n */
    public static final String f15677n = "wavePhase";

    /* renamed from: o */
    public static final String f15678o = "waveVariesBy";

    /* renamed from: p */
    public static final String f15679p = "translationX";

    /* renamed from: q */
    public static final String f15680q = "translationY";

    /* renamed from: r */
    public static final String f15681r = "translationZ";

    /* renamed from: s */
    public static final String f15682s = "progress";

    /* renamed from: t */
    public static final String f15683t = "CUSTOM";

    /* renamed from: u */
    public static final String f15684u = "curveFit";

    /* renamed from: v */
    public static final String f15685v = "motionProgress";

    /* renamed from: w */
    public static final String f15686w = "transitionEasing";

    /* renamed from: x */
    public static final String f15687x = "visibility";

    /* renamed from: a */
    public int f15688a;

    /* renamed from: a */
    public String f15689a = null;

    /* renamed from: a */
    public HashMap<String, C0419a> f15690a;

    /* renamed from: b */
    public int f15691b;

    /* renamed from: c */
    public int f15692c;

    public ly1() {
        int i = f15666d;
        this.f15688a = i;
        this.f15691b = i;
    }

    /* renamed from: a */
    public abstract void mo14436a(HashMap<String, bv4> hashMap);

    /* renamed from: b */
    public abstract ly1 clone();

    /* renamed from: c */
    public ly1 mo14438c(ly1 ly1) {
        this.f15688a = ly1.f15688a;
        this.f15691b = ly1.f15691b;
        this.f15689a = ly1.f15689a;
        this.f15692c = ly1.f15692c;
        this.f15690a = ly1.f15690a;
        return this;
    }

    /* renamed from: d */
    public abstract void mo13346d(HashSet<String> hashSet);

    /* renamed from: e */
    public int mo19935e() {
        return this.f15688a;
    }

    /* renamed from: f */
    public abstract void mo14440f(Context context, AttributeSet attributeSet);

    /* renamed from: g */
    public boolean mo19936g(String str) {
        String str2 = this.f15689a;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: h */
    public void mo19937h(int i) {
        this.f15688a = i;
    }

    /* renamed from: i */
    public void mo14441i(HashMap<String, Integer> hashMap) {
    }

    /* renamed from: j */
    public abstract void mo14442j(String str, Object obj);

    /* renamed from: k */
    public ly1 mo19938k(int i) {
        this.f15691b = i;
        return this;
    }

    /* renamed from: l */
    public boolean mo19939l(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: m */
    public float mo19940m(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* renamed from: n */
    public int mo19941n(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
