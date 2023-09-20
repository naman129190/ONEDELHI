package com.onedelhi.secure;

import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/x04;", "Ljava/util/zip/Inflater;", "inflater", "Lcom/onedelhi/secure/jq1;", "a", "okio"}, k = 2, mv = {1, 4, 0})
@uw1(name = "-InflaterSourceExtensions")
/* renamed from: com.onedelhi.secure.j */
public final class C5756j {
    @vr2
    /* renamed from: a */
    public static final jq1 m52785a(@vr2 x04 x04, @vr2 Inflater inflater) {
        jt1.m53777p(x04, "$this$inflate");
        jt1.m53777p(inflater, "inflater");
        return new jq1(x04, inflater);
    }

    /* renamed from: b */
    public static /* synthetic */ jq1 m52786b(x04 x04, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        jt1.m53777p(x04, "$this$inflate");
        jt1.m53777p(inflater, "inflater");
        return new jq1(x04, inflater);
    }
}
