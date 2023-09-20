package com.onedelhi.secure;

import android.os.PersistableBundle;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\b\u0010\b\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\n\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0007¨\u0006\u000b"}, d2 = {"", "Lcom/onedelhi/secure/ey2;", "", "", "pairs", "Landroid/os/PersistableBundle;", "b", "([Lcom/onedelhi/secure/ey2;)Landroid/os/PersistableBundle;", "a", "", "c", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class o13 {
    @sj3(21)
    @vr2
    /* renamed from: a */
    public static final PersistableBundle m23256a() {
        return m13.m21184a(0);
    }

    @sj3(21)
    @vr2
    /* renamed from: b */
    public static final PersistableBundle m23257b(@vr2 ey2<String, ? extends Object>... ey2Arr) {
        jt1.m53777p(ey2Arr, "pairs");
        PersistableBundle a = m13.m21184a(ey2Arr.length);
        for (ey2<String, ? extends Object> ey2 : ey2Arr) {
            m13.m21185b(a, ey2.mo35665a(), ey2.mo35666b());
        }
        return a;
    }

    @sj3(21)
    @vr2
    /* renamed from: c */
    public static final PersistableBundle m23258c(@vr2 Map<String, ? extends Object> map) {
        jt1.m53777p(map, "<this>");
        PersistableBundle a = m13.m21184a(map.size());
        for (Map.Entry next : map.entrySet()) {
            m13.m21185b(a, (String) next.getKey(), next.getValue());
        }
        return a;
    }
}
