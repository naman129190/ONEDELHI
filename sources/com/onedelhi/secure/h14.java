package com.onedelhi.secure;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aD\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a3\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a3\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001b"}, d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "builderAction", "Landroid/text/SpannedString;", "c", "", "", "spans", "f", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)Landroid/text/SpannableStringBuilder;", "span", "e", "b", "g", "l", "", "color", "d", "a", "i", "", "proportion", "h", "k", "j", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class h14 {
    @vr2
    /* renamed from: a */
    public static final SpannableStringBuilder m16426a(@vr2 SpannableStringBuilder spannableStringBuilder, @d10 int i, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: b */
    public static final SpannableStringBuilder m16427b(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: c */
    public static final SpannedString m16428c(@vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ec1.mo17094X(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @vr2
    /* renamed from: d */
    public static final SpannableStringBuilder m16429d(@vr2 SpannableStringBuilder spannableStringBuilder, @d10 int i, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: e */
    public static final SpannableStringBuilder m16430e(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 Object obj, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(obj, "span");
        jt1.m53777p(ec1, "builderAction");
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: f */
    public static final SpannableStringBuilder m16431f(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 Object[] objArr, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(objArr, "spans");
        jt1.m53777p(ec1, "builderAction");
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        for (Object span : objArr) {
            spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: g */
    public static final SpannableStringBuilder m16432g(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: h */
    public static final SpannableStringBuilder m16433h(@vr2 SpannableStringBuilder spannableStringBuilder, float f, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: i */
    public static final SpannableStringBuilder m16434i(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: j */
    public static final SpannableStringBuilder m16435j(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: k */
    public static final SpannableStringBuilder m16436k(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @vr2
    /* renamed from: l */
    public static final SpannableStringBuilder m16437l(@vr2 SpannableStringBuilder spannableStringBuilder, @vr2 ec1<? super SpannableStringBuilder, un4> ec1) {
        jt1.m53777p(spannableStringBuilder, "<this>");
        jt1.m53777p(ec1, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        ec1.mo17094X(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
