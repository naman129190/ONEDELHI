package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\bø\u0001\u0000\u001a;\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, d2 = {"", "T", "Landroid/content/Context;", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "block", "c", "resourceId", "b", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class t70 {
    /* renamed from: a */
    public static final /* synthetic */ <T> T m28140a(Context context) {
        jt1.m53777p(context, "<this>");
        jt1.m53786y(4, mx0.f16794s2);
        return r70.m26362o(context, Object.class);
    }

    /* renamed from: b */
    public static final void m28141b(@vr2 Context context, @e64 int i, @vr2 int[] iArr, @vr2 ec1<? super TypedArray, un4> ec1) {
        jt1.m53777p(context, "<this>");
        jt1.m53777p(iArr, "attrs");
        jt1.m53777p(ec1, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        jt1.m53776o(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        ec1.mo17094X(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static final void m28142c(@vr2 Context context, @ss2 AttributeSet attributeSet, @vr2 int[] iArr, @C3982yb int i, @e64 int i2, @vr2 ec1<? super TypedArray, un4> ec1) {
        jt1.m53777p(context, "<this>");
        jt1.m53777p(iArr, "attrs");
        jt1.m53777p(ec1, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        jt1.m53776o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ec1.mo17094X(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public static /* synthetic */ void m28143d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, ec1 ec1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        jt1.m53777p(context, "<this>");
        jt1.m53777p(iArr, "attrs");
        jt1.m53777p(ec1, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        jt1.m53776o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ec1.mo17094X(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
