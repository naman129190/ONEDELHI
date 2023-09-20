package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a1\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d*\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001eH\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u0002\u0007\n\u0005\b20\u0001¨\u0006\""}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "Lcom/onedelhi/secure/un4;", "a", "", "b", "c", "Landroid/content/res/ColorStateList;", "d", "", "e", "f", "g", "Landroid/graphics/drawable/Drawable;", "h", "i", "Landroid/graphics/Typeface;", "j", "k", "l", "m", "", "n", "", "p", "", "o", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", "block", "q", "(Landroid/content/res/TypedArray;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class wj4 {
    /* renamed from: a */
    public static final void m30910a(TypedArray typedArray, @g64 int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    /* renamed from: b */
    public static final boolean m30911b(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    @d10
    /* renamed from: c */
    public static final int m30912c(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    @vr2
    /* renamed from: d */
    public static final ColorStateList m30913d(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    /* renamed from: e */
    public static final float m30914e(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    @zk0
    /* renamed from: f */
    public static final int m30915f(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    @zk0
    /* renamed from: g */
    public static final int m30916g(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    @vr2
    /* renamed from: h */
    public static final Drawable m30917h(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        jt1.m53774m(drawable);
        return drawable;
    }

    /* renamed from: i */
    public static final float m30918i(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    @sj3(26)
    @vr2
    /* renamed from: j */
    public static final Typeface m30919j(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return vj4.m30180a(typedArray, i);
    }

    /* renamed from: k */
    public static final int m30920k(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    /* renamed from: l */
    public static final int m30921l(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    @C3476s7
    /* renamed from: m */
    public static final int m30922m(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    @vr2
    /* renamed from: n */
    public static final String m30923n(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @vr2
    /* renamed from: o */
    public static final CharSequence[] m30924o(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        CharSequence[] textArray = typedArray.getTextArray(i);
        jt1.m53776o(textArray, "getTextArray(index)");
        return textArray;
    }

    @vr2
    /* renamed from: p */
    public static final CharSequence m30925p(@vr2 TypedArray typedArray, @g64 int i) {
        jt1.m53777p(typedArray, "<this>");
        m30910a(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    /* renamed from: q */
    public static final <R> R m30926q(@vr2 TypedArray typedArray, @vr2 ec1<? super TypedArray, ? extends R> ec1) {
        jt1.m53777p(typedArray, "<this>");
        jt1.m53777p(ec1, "block");
        R X = ec1.mo17094X(typedArray);
        typedArray.recycle();
        return X;
    }
}
