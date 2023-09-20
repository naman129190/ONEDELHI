package com.onedelhi.secure;

import android.graphics.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class xz1 {

    /* renamed from: a */
    public static final int f37718a = 3;

    /* renamed from: b */
    public static final int f37719b = 0;

    /* renamed from: c */
    public static final int f37720c = 1;

    /* renamed from: a */
    public double f37721a = 1.0d;

    /* renamed from: a */
    public float f37722a = 0.0f;

    /* renamed from: a */
    public final e33 f37723a = new e33();

    /* renamed from: a */
    public final g33 f37724a = new g33();

    /* renamed from: a */
    public final sd2 f37725a = new sd2();

    /* renamed from: a */
    public String f37726a;

    /* renamed from: a */
    public final HashMap<String, String> f37727a = new HashMap<>();

    /* renamed from: a */
    public final HashSet<String> f37728a = new HashSet<>();

    /* renamed from: a */
    public boolean f37729a = true;

    /* renamed from: b */
    public String f37730b = null;

    /* renamed from: b */
    public boolean f37731b = true;

    /* renamed from: c */
    public boolean f37732c = false;

    /* renamed from: d */
    public boolean f37733d = false;

    /* renamed from: e */
    public boolean f37734e = false;

    /* renamed from: a */
    public static int m70949a(int i) {
        Random random = new Random();
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (red != 0) {
            red = random.nextInt(red);
        }
        if (blue != 0) {
            blue = random.nextInt(blue);
        }
        if (green != 0) {
            green = random.nextInt(green);
        }
        return Color.rgb(red, green, blue);
    }

    /* renamed from: b */
    public static String m70950b(String str) {
        String str2;
        StringBuilder sb;
        if (str.length() > 6) {
            sb = new StringBuilder();
            sb.append(str.substring(0, 2));
            sb.append(str.substring(6, 8));
            sb.append(str.substring(4, 6));
            str2 = str.substring(2, 4);
        } else {
            sb = new StringBuilder();
            sb.append(str.substring(4, 6));
            sb.append(str.substring(2, 4));
            str2 = str.substring(0, 2);
        }
        sb.append(str2);
        String sb2 = sb.toString();
        if (!sb2.substring(0, 1).equals(" ")) {
            return sb2;
        }
        return qa0.f34045b + sb2.substring(1, sb2.length());
    }

    /* renamed from: c */
    public static sd2 m70951c(sd2 sd2, boolean z, float f) {
        sd2 sd22 = new sd2();
        sd22.mo24330f3(sd2.mo24320V2());
        sd22.mo24310L2(sd2.mo24314P2(), sd2.mo24315Q2());
        if (z) {
            sd2.mo24324Z2(C3858wl.m30939b(m70954g(m70949a((int) f))));
        }
        sd22.mo24324Z2(sd2.mo24316R2());
        return sd22;
    }

    /* renamed from: d */
    public static e33 m70952d(e33 e33, boolean z, boolean z2) {
        e33 e332 = new e33();
        if (z) {
            e332.mo15010P2(e33.mo15012R2());
        }
        if (z2) {
            e332.mo15023c3(e33.mo15015U2());
            e332.mo15026f3(e33.mo15018X2());
        }
        return e332;
    }

    /* renamed from: e */
    public static g33 m70953e(g33 g33) {
        g33 g332 = new g33();
        g332.mo16295R2(g33.mo16298U2());
        g332.mo16313j3(g33.mo16304a3());
        return g332;
    }

    /* renamed from: g */
    public static float m70954g(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return fArr[0];
    }

    /* renamed from: A */
    public void mo47462A(String str) {
        this.f37726a = str;
        this.f37728a.add("iconUrl");
    }

    /* renamed from: B */
    public void mo47463B(String str) {
        this.f37727a.put("text", str);
    }

    /* renamed from: C */
    public void mo47464C(String str) {
        this.f37733d = str.equals("random");
        this.f37728a.add("lineColorMode");
    }

    /* renamed from: D */
    public void mo47465D(String str) {
        float g = m70954g(Color.parseColor("#" + m70950b(str)));
        this.f37722a = g;
        this.f37725a.mo24324Z2(C3858wl.m30939b(g));
        this.f37728a.add("markerColor");
    }

    /* renamed from: E */
    public void mo47466E(boolean z) {
        this.f37731b = z;
        this.f37728a.add(yz1.f38149k);
    }

    /* renamed from: F */
    public void mo47467F(String str) {
        g33 g33 = this.f37724a;
        g33.mo16295R2(Color.parseColor("#" + m70950b(str)));
        e33 e33 = this.f37723a;
        e33.mo15023c3(Color.parseColor("#" + str));
        this.f37728a.add("outlineColor");
    }

    /* renamed from: G */
    public void mo47468G(String str) {
        this.f37734e = str.equals("random");
        this.f37728a.add("polyColorMode");
    }

    /* renamed from: H */
    public void mo47469H(String str) {
        this.f37730b = str;
    }

    /* renamed from: I */
    public void mo47470I(Float f) {
        this.f37724a.mo16313j3(f.floatValue());
        this.f37723a.mo15026f3(f.floatValue());
        this.f37728a.add(yz1.f38148j);
    }

    /* renamed from: f */
    public HashMap<String, String> mo47471f() {
        return this.f37727a;
    }

    /* renamed from: h */
    public double mo47472h() {
        return this.f37721a;
    }

    /* renamed from: i */
    public String mo47473i() {
        return this.f37726a;
    }

    /* renamed from: j */
    public sd2 mo47474j() {
        return m70951c(this.f37725a, mo47481q(), this.f37722a);
    }

    /* renamed from: k */
    public e33 mo47475k() {
        return m70952d(this.f37723a, this.f37729a, this.f37731b);
    }

    /* renamed from: l */
    public g33 mo47476l() {
        return m70953e(this.f37724a);
    }

    /* renamed from: m */
    public String mo47477m() {
        return this.f37730b;
    }

    /* renamed from: n */
    public boolean mo47478n() {
        return this.f37727a.size() > 0;
    }

    /* renamed from: o */
    public boolean mo47479o() {
        return this.f37729a;
    }

    /* renamed from: p */
    public boolean mo47480p() {
        return this.f37731b;
    }

    /* renamed from: q */
    public boolean mo47481q() {
        return this.f37732c;
    }

    /* renamed from: r */
    public boolean mo47482r() {
        return this.f37733d;
    }

    /* renamed from: s */
    public boolean mo47483s() {
        return this.f37734e;
    }

    /* renamed from: t */
    public boolean mo47484t(String str) {
        return this.f37728a.contains(str);
    }

    public String toString() {
        return "Style" + to1.f35745h + "\n balloon options=" + this.f37727a + ",\n fill=" + this.f37729a + ",\n outline=" + this.f37731b + ",\n icon url=" + this.f37726a + ",\n scale=" + this.f37721a + ",\n style id=" + this.f37730b + "\n}\n";
    }

    /* renamed from: u */
    public void mo47486u(boolean z) {
        this.f37729a = z;
    }

    /* renamed from: v */
    public void mo47487v(String str) {
        e33 e33 = this.f37723a;
        e33.mo15010P2(Color.parseColor("#" + m70950b(str)));
        this.f37728a.add("fillColor");
    }

    /* renamed from: w */
    public void mo47488w(float f) {
        this.f37725a.mo24330f3(f);
        this.f37728a.add(yz1.f38140b);
    }

    /* renamed from: x */
    public void mo47489x(float f, float f2, String str, String str2) {
        if (!str.equals("fraction")) {
            f = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f2 = 1.0f;
        }
        this.f37725a.mo24310L2(f, f2);
        this.f37728a.add(yz1.f38143e);
    }

    /* renamed from: y */
    public void mo47490y(String str) {
        this.f37732c = str.equals("random");
        this.f37728a.add("iconColorMode");
    }

    /* renamed from: z */
    public void mo47491z(double d) {
        this.f37721a = d;
        this.f37728a.add("iconScale");
    }
}
