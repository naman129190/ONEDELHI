package com.onedelhi.secure;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.util.Iterator;

@hl3({hl3.C2354a.f13185a})
public class ci1 extends oh1 {

    /* renamed from: k */
    public static final int f10293k = 0;

    /* renamed from: l */
    public static final int f10294l = 32;

    /* renamed from: m */
    public static final int f10295m = 33;

    /* renamed from: n */
    public static final int f10296n = 64;

    /* renamed from: o */
    public static final int f10297o = -87;

    /* renamed from: p */
    public static final int f10298p = 64;

    /* renamed from: q */
    public static final int f10299q = 24;

    /* renamed from: r */
    public static final int f10300r = 193;

    /* renamed from: s */
    public static final int f10301s = 200;

    /* renamed from: t */
    public static final int f10302t = 200;

    /* renamed from: u */
    public static final int f10303u = 35;
    @mj1("mWrapped")

    /* renamed from: a */
    public GpsSatellite f10304a;

    /* renamed from: a */
    public final GpsStatus f10305a;
    @mj1("mWrapped")

    /* renamed from: a */
    public Iterator<GpsSatellite> f10306a;
    @mj1("mWrapped")

    /* renamed from: i */
    public int f10307i = -1;
    @mj1("mWrapped")

    /* renamed from: j */
    public int f10308j;

    public ci1(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) k43.m19455l(gpsStatus);
        this.f10305a = gpsStatus2;
        this.f10306a = gpsStatus2.getSatellites().iterator();
        this.f10308j = -1;
        this.f10304a = null;
    }

    /* renamed from: p */
    public static int m12491p(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i <= 200 || i > 235) {
            return (i < 193 || i > 200) ? 0 : 4;
        }
        return 5;
    }

    /* renamed from: r */
    public static int m12492r(int i) {
        int p = m12491p(i);
        return p != 2 ? p != 3 ? p != 5 ? i : i - 200 : i - 64 : i + 87;
    }

    /* renamed from: a */
    public float mo14147a(int i) {
        return mo14162q(i).getAzimuth();
    }

    /* renamed from: b */
    public float mo14148b(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public float mo14149c(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public float mo14150d(int i) {
        return mo14162q(i).getSnr();
    }

    /* renamed from: e */
    public int mo14151e(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return m12491p(mo14162q(i).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci1)) {
            return false;
        }
        return this.f10305a.equals(((ci1) obj).f10305a);
    }

    /* renamed from: f */
    public float mo14153f(int i) {
        return mo14162q(i).getElevation();
    }

    /* renamed from: g */
    public int mo14154g() {
        int i;
        synchronized (this.f10305a) {
            if (this.f10307i == -1) {
                for (GpsSatellite next : this.f10305a.getSatellites()) {
                    this.f10307i++;
                }
                this.f10307i++;
            }
            i = this.f10307i;
        }
        return i;
    }

    /* renamed from: h */
    public int mo14155h(int i) {
        int i2 = Build.VERSION.SDK_INT;
        int prn = mo14162q(i).getPrn();
        return i2 < 24 ? prn : m12492r(prn);
    }

    public int hashCode() {
        return this.f10305a.hashCode();
    }

    /* renamed from: i */
    public boolean mo14157i(int i) {
        return mo14162q(i).hasAlmanac();
    }

    /* renamed from: j */
    public boolean mo14158j(int i) {
        return false;
    }

    /* renamed from: k */
    public boolean mo14159k(int i) {
        return false;
    }

    /* renamed from: l */
    public boolean mo14160l(int i) {
        return mo14162q(i).hasEphemeris();
    }

    /* renamed from: m */
    public boolean mo14161m(int i) {
        return mo14162q(i).usedInFix();
    }

    /* renamed from: q */
    public final GpsSatellite mo14162q(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.f10305a) {
            if (i < this.f10308j) {
                this.f10306a = this.f10305a.getSatellites().iterator();
                this.f10308j = -1;
            }
            while (true) {
                int i2 = this.f10308j;
                if (i2 >= i) {
                    break;
                }
                this.f10308j = i2 + 1;
                if (!this.f10306a.hasNext()) {
                    this.f10304a = null;
                    break;
                }
                this.f10304a = this.f10306a.next();
            }
            gpsSatellite = this.f10304a;
        }
        return (GpsSatellite) k43.m19455l(gpsSatellite);
    }
}
