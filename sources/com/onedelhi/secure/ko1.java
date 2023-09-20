package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\b¨\u0006\b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "a", "b", "Landroid/net/Uri;", "c", "", "d", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
@SuppressLint({"ClassVerificationFailure"})
public final class ko1 {
    @sj3(26)
    @vr2
    /* renamed from: a */
    public static final Icon m19961a(@vr2 Bitmap bitmap) {
        jt1.m53777p(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        jt1.m53776o(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @sj3(26)
    @vr2
    /* renamed from: b */
    public static final Icon m19962b(@vr2 Bitmap bitmap) {
        jt1.m53777p(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        jt1.m53776o(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @sj3(26)
    @vr2
    /* renamed from: c */
    public static final Icon m19963c(@vr2 Uri uri) {
        jt1.m53777p(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        jt1.m53776o(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @sj3(26)
    @vr2
    /* renamed from: d */
    public static final Icon m19964d(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        jt1.m53776o(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
