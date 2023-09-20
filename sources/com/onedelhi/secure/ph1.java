package com.onedelhi.secure;

import android.location.GnssStatus;
import android.os.Build;
import com.onedelhi.secure.hl3;

@sj3(24)
@hl3({hl3.C2354a.LIBRARY})
public class ph1 extends oh1 {

    /* renamed from: a */
    public final GnssStatus f18532a;

    @sj3(26)
    /* renamed from: com.onedelhi.secure.ph1$a */
    public static class C3151a {
        @pn0
        /* renamed from: a */
        public static float m24717a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @pn0
        /* renamed from: b */
        public static boolean m24718b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.ph1$b */
    public static class C3152b {
        @pn0
        /* renamed from: a */
        public static float m24719a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        @pn0
        /* renamed from: b */
        public static boolean m24720b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public ph1(Object obj) {
        this.f18532a = (GnssStatus) k43.m19455l((GnssStatus) obj);
    }

    /* renamed from: a */
    public float mo14147a(int i) {
        return this.f18532a.getAzimuthDegrees(i);
    }

    /* renamed from: b */
    public float mo14148b(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C3152b.m24719a(this.f18532a, i);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public float mo14149c(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3151a.m24717a(this.f18532a, i);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public float mo14150d(int i) {
        return this.f18532a.getCn0DbHz(i);
    }

    /* renamed from: e */
    public int mo14151e(int i) {
        return this.f18532a.getConstellationType(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph1)) {
            return false;
        }
        return this.f18532a.equals(((ph1) obj).f18532a);
    }

    /* renamed from: f */
    public float mo14153f(int i) {
        return this.f18532a.getElevationDegrees(i);
    }

    /* renamed from: g */
    public int mo14154g() {
        return this.f18532a.getSatelliteCount();
    }

    /* renamed from: h */
    public int mo14155h(int i) {
        return this.f18532a.getSvid(i);
    }

    public int hashCode() {
        return this.f18532a.hashCode();
    }

    /* renamed from: i */
    public boolean mo14157i(int i) {
        return this.f18532a.hasAlmanacData(i);
    }

    /* renamed from: j */
    public boolean mo14158j(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C3152b.m24720b(this.f18532a, i);
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo14159k(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3151a.m24718b(this.f18532a, i);
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo14160l(int i) {
        return this.f18532a.hasEphemerisData(i);
    }

    /* renamed from: m */
    public boolean mo14161m(int i) {
        return this.f18532a.usedInFix(i);
    }
}
