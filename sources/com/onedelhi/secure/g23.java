package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "block", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class g23 {
    @vr2
    /* renamed from: a */
    public static final Picture m15451a(@vr2 Picture picture, int i, int i2, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(picture, "<this>");
        jt1.m53777p(ec1, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        jt1.m53776o(beginRecording, "beginRecording(width, height)");
        try {
            ec1.mo17094X(beginRecording);
            return picture;
        } finally {
            uq1.m67403d(1);
            picture.endRecording();
            uq1.m67402c(1);
        }
    }
}
