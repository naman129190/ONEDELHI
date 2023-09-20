package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002\u001a\r\u0010\u0006\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\t\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\n\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\u000b\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\bH\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\bH\b\u001a\r\u0010\u000f\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0011\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0013\u001a\u00020\u0000*\u00020\rH\b\u001a\r\u0010\u0014\u001a\u00020\b*\u00020\rH\b\u001a\u0015\u0010\u0017\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\f\u001a\u0015\u0010\u0019\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0018H\f\u001a\u0015\u0010\u001a\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\f\u001a\u0015\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0018H\f\u001a\u0015\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\f\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0018H\f\u001a\r\u0010\u001f\u001a\u00020\b*\u00020\u001eH\b\"\u0016\u0010\"\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0016\u0010$\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010!\"\u0016\u0010&\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b%\u0010!\"\u0016\u0010(\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b'\u0010!\"\u0016\u0010+\u001a\u00020\u0001*\u00020\b8Ç\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0016\u0010\"\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0016\u0010$\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b.\u0010-\"\u0016\u0010&\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b/\u0010-\"\u0016\u0010(\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b0\u0010-\"\u0016\u0010+\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b1\u0010-\"\u0016\u00105\u001a\u000202*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0016\u00107\u001a\u000202*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b6\u00104\"\u0016\u0010\u0016\u001a\u00020\u0018*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Landroid/graphics/Color;", "", "b", "e", "h", "k", "c", "F", "", "f", "i", "l", "G", "", "K", "a", "d", "g", "j", "H", "I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "m", "Landroid/graphics/ColorSpace;", "n", "o", "p", "q", "r", "", "J", "t", "(I)I", "alpha", "C", "red", "y", "green", "v", "blue", "z", "(I)F", "luminance", "s", "(J)F", "B", "x", "u", "A", "", "D", "(J)Z", "isSrgb", "E", "isWideGamut", "w", "(J)Landroid/graphics/ColorSpace;", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class f10 {
    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: A */
    public static final float m14480A(long j) {
        return Color.luminance(j);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: B */
    public static final float m14481B(long j) {
        return Color.red(j);
    }

    /* renamed from: C */
    public static final int m14482C(@d10 int i) {
        return (i >> 16) & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: D */
    public static final boolean m14483D(long j) {
        return Color.isSrgb(j);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: E */
    public static final boolean m14484E(long j) {
        return Color.isWideGamut(j);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: F */
    public static final Color m14485F(@vr2 Color color, @vr2 Color color2) {
        jt1.m53777p(color, "<this>");
        jt1.m53777p(color2, "c");
        Color u = p10.m24320u(color2, color);
        jt1.m53776o(u, "compositeColors(c, this)");
        return u;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: G */
    public static final Color m14486G(@d10 int i) {
        Color valueOf = Color.valueOf(i);
        jt1.m53776o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: H */
    public static final Color m14487H(long j) {
        Color valueOf = Color.valueOf(j);
        jt1.m53776o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @d10
    /* renamed from: I */
    public static final int m14488I(long j) {
        return Color.toArgb(j);
    }

    @d10
    /* renamed from: J */
    public static final int m14489J(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        return Color.parseColor(str);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: K */
    public static final long m14490K(@d10 int i) {
        return Color.pack(i);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: a */
    public static final float m14491a(long j) {
        return Color.red(j);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: b */
    public static final float m14492b(@vr2 Color color) {
        jt1.m53777p(color, "<this>");
        return color.getComponent(0);
    }

    /* renamed from: c */
    public static final int m14493c(@d10 int i) {
        return (i >> 24) & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: d */
    public static final float m14494d(long j) {
        return Color.green(j);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public static final float m14495e(@vr2 Color color) {
        jt1.m53777p(color, "<this>");
        return color.getComponent(1);
    }

    /* renamed from: f */
    public static final int m14496f(@d10 int i) {
        return (i >> 16) & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static final float m14497g(long j) {
        return Color.blue(j);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: h */
    public static final float m14498h(@vr2 Color color) {
        jt1.m53777p(color, "<this>");
        return color.getComponent(2);
    }

    /* renamed from: i */
    public static final int m14499i(@d10 int i) {
        return (i >> 8) & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: j */
    public static final float m14500j(long j) {
        return Color.alpha(j);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: k */
    public static final float m14501k(@vr2 Color color) {
        jt1.m53777p(color, "<this>");
        return color.getComponent(3);
    }

    /* renamed from: l */
    public static final int m14502l(@d10 int i) {
        return i & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: m */
    public static final long m14503m(@d10 int i, @vr2 ColorSpace.Named named) {
        jt1.m53777p(named, "colorSpace");
        return Color.convert(i, ColorSpace.get(named));
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: n */
    public static final long m14504n(@d10 int i, @vr2 ColorSpace colorSpace) {
        jt1.m53777p(colorSpace, "colorSpace");
        return Color.convert(i, colorSpace);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: o */
    public static final long m14505o(long j, @vr2 ColorSpace.Named named) {
        jt1.m53777p(named, "colorSpace");
        return Color.convert(j, ColorSpace.get(named));
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: p */
    public static final long m14506p(long j, @vr2 ColorSpace colorSpace) {
        jt1.m53777p(colorSpace, "colorSpace");
        return Color.convert(j, colorSpace);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: q */
    public static final Color m14507q(@vr2 Color color, @vr2 ColorSpace.Named named) {
        jt1.m53777p(color, "<this>");
        jt1.m53777p(named, "colorSpace");
        Color convert = color.convert(ColorSpace.get(named));
        jt1.m53776o(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: r */
    public static final Color m14508r(@vr2 Color color, @vr2 ColorSpace colorSpace) {
        jt1.m53777p(color, "<this>");
        jt1.m53777p(colorSpace, "colorSpace");
        Color convert = color.convert(colorSpace);
        jt1.m53776o(convert, "convert(colorSpace)");
        return convert;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: s */
    public static final float m14509s(long j) {
        return Color.alpha(j);
    }

    /* renamed from: t */
    public static final int m14510t(@d10 int i) {
        return (i >> 24) & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: u */
    public static final float m14511u(long j) {
        return Color.blue(j);
    }

    /* renamed from: v */
    public static final int m14512v(@d10 int i) {
        return i & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: w */
    public static final ColorSpace m14513w(long j) {
        ColorSpace colorSpace = Color.colorSpace(j);
        jt1.m53776o(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: x */
    public static final float m14514x(long j) {
        return Color.green(j);
    }

    /* renamed from: y */
    public static final int m14515y(@d10 int i) {
        return (i >> 8) & 255;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: z */
    public static final float m14516z(@d10 int i) {
        return Color.luminance(i);
    }
}
