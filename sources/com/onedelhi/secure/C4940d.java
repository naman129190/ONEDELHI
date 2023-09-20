package com.onedelhi.secure;

import java.util.zip.Deflater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/oz3;", "Ljava/util/zip/Deflater;", "deflater", "Lcom/onedelhi/secure/di0;", "a", "okio"}, k = 2, mv = {1, 4, 0})
@uw1(name = "-DeflaterSinkExtensions")
/* renamed from: com.onedelhi.secure.d */
public final class C4940d {
    @vr2
    /* renamed from: a */
    public static final di0 m44411a(@vr2 oz3 oz3, @vr2 Deflater deflater) {
        jt1.m53777p(oz3, "$this$deflate");
        jt1.m53777p(deflater, "deflater");
        return new di0(oz3, deflater);
    }

    /* renamed from: b */
    public static /* synthetic */ di0 m44412b(oz3 oz3, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        jt1.m53777p(oz3, "$this$deflate");
        jt1.m53777p(deflater, "deflater");
        return new di0(oz3, deflater);
    }
}
