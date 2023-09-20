package com.onedelhi.secure;

import android.content.LocusId;
import android.os.Build;

public final class t82 {

    /* renamed from: a */
    public final LocusId f20705a;

    /* renamed from: a */
    public final String f20706a;

    @sj3(29)
    /* renamed from: com.onedelhi.secure.t82$a */
    public static class C3577a {
        @mr2
        /* renamed from: a */
        public static LocusId m28198a(@mr2 String str) {
            return new LocusId(str);
        }

        @mr2
        /* renamed from: b */
        public static String m28199b(@mr2 LocusId locusId) {
            return locusId.getId();
        }
    }

    public t82(@mr2 String str) {
        this.f20706a = (String) k43.m19460q(str, "id cannot be empty");
        this.f20705a = Build.VERSION.SDK_INT >= 29 ? C3577a.m28198a(str) : null;
    }

    @mr2
    @sj3(29)
    /* renamed from: d */
    public static t82 m28194d(@mr2 LocusId locusId) {
        k43.m19456m(locusId, "locusId cannot be null");
        return new t82((String) k43.m19460q(C3577a.m28199b(locusId), "id cannot be empty"));
    }

    @mr2
    /* renamed from: a */
    public String mo24773a() {
        return this.f20706a;
    }

    @mr2
    /* renamed from: b */
    public final String mo24774b() {
        int length = this.f20706a.length();
        return length + "_chars";
    }

    @mr2
    @sj3(29)
    /* renamed from: c */
    public LocusId mo24775c() {
        return this.f20705a;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t82.class != obj.getClass()) {
            return false;
        }
        String str = this.f20706a;
        String str2 = ((t82) obj).f20706a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.f20706a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @mr2
    public String toString() {
        return "LocusIdCompat[" + mo24774b() + "]";
    }
}
