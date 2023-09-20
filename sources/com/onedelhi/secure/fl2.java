package com.onedelhi.secure;

import java.util.HashMap;
import java.util.HashSet;

public abstract class fl2 implements ak4 {

    /* renamed from: c */
    public static final String f12128c = "alpha";

    /* renamed from: d */
    public static final String f12129d = "elevation";

    /* renamed from: e */
    public static final String f12130e = "rotationZ";

    /* renamed from: f */
    public static final String f12131f = "rotationX";

    /* renamed from: g */
    public static final String f12132g = "transitionPathRotate";

    /* renamed from: h */
    public static final String f12133h = "scaleX";

    /* renamed from: i */
    public static final String f12134i = "scaleY";

    /* renamed from: j */
    public static int f12135j = -1;

    /* renamed from: j */
    public static final String f12136j = "translationX";

    /* renamed from: k */
    public static final String f12137k = "translationY";

    /* renamed from: l */
    public static final String f12138l = "CUSTOM";

    /* renamed from: m */
    public static final String f12139m = "visibility";

    /* renamed from: a */
    public HashMap<String, qc0> f12140a;

    /* renamed from: b */
    public String f12141b = null;

    /* renamed from: g */
    public int f12142g;

    /* renamed from: h */
    public int f12143h;

    /* renamed from: i */
    public int f12144i;

    public fl2() {
        int i = f12135j;
        this.f12142g = i;
        this.f12143h = i;
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        if (i != 100) {
            return false;
        }
        this.f12142g = i2;
        return true;
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        return false;
    }

    /* renamed from: d */
    public boolean mo13123d(int i, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (i != 101) {
            return false;
        }
        this.f12141b = str;
        return true;
    }

    /* renamed from: f */
    public abstract void mo16041f(HashMap<String, x14> hashMap);

    /* renamed from: g */
    public abstract fl2 clone();

    /* renamed from: h */
    public fl2 mo16043h(fl2 fl2) {
        this.f12142g = fl2.f12142g;
        this.f12143h = fl2.f12143h;
        this.f12141b = fl2.f12141b;
        this.f12144i = fl2.f12144i;
        return this;
    }

    /* renamed from: i */
    public abstract void mo16044i(HashSet<String> hashSet);

    /* renamed from: j */
    public int mo16045j() {
        return this.f12142g;
    }

    /* renamed from: k */
    public boolean mo16046k(String str) {
        String str2 = this.f12141b;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: l */
    public void mo16047l(String str, int i, float f) {
        this.f12140a.put(str, new qc0(str, i, f));
    }

    /* renamed from: m */
    public void mo16048m(String str, int i, int i2) {
        this.f12140a.put(str, new qc0(str, i, i2));
    }

    /* renamed from: n */
    public void mo16049n(String str, int i, String str2) {
        this.f12140a.put(str, new qc0(str, i, str2));
    }

    /* renamed from: o */
    public void mo16050o(String str, int i, boolean z) {
        this.f12140a.put(str, new qc0(str, i, z));
    }

    /* renamed from: p */
    public void mo16051p(int i) {
        this.f12142g = i;
    }

    /* renamed from: q */
    public void mo16052q(HashMap<String, Integer> hashMap) {
    }

    /* renamed from: r */
    public fl2 mo16053r(int i) {
        this.f12143h = i;
        return this;
    }

    /* renamed from: s */
    public boolean mo16054s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: t */
    public float mo16055t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* renamed from: u */
    public int mo16056u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
