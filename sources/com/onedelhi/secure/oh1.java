package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class oh1 {
    @SuppressLint({"InlinedApi"})

    /* renamed from: a */
    public static final int f17951a = 0;
    @SuppressLint({"InlinedApi"})

    /* renamed from: b */
    public static final int f17952b = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: c */
    public static final int f17953c = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: d */
    public static final int f17954d = 3;
    @SuppressLint({"InlinedApi"})

    /* renamed from: e */
    public static final int f17955e = 4;
    @SuppressLint({"InlinedApi"})

    /* renamed from: f */
    public static final int f17956f = 5;
    @SuppressLint({"InlinedApi"})

    /* renamed from: g */
    public static final int f17957g = 6;
    @SuppressLint({"InlinedApi"})

    /* renamed from: h */
    public static final int f17958h = 7;

    /* renamed from: com.onedelhi.secure.oh1$a */
    public static abstract class C3059a {
        /* renamed from: a */
        public void mo21922a(@js1(from = 0) int i) {
        }

        /* renamed from: b */
        public void mo21923b(@mr2 oh1 oh1) {
        }

        /* renamed from: c */
        public void mo21924c() {
        }

        /* renamed from: d */
        public void mo21925d() {
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.oh1$b */
    public @interface C3060b {
    }

    @mr2
    @sj3(24)
    /* renamed from: n */
    public static oh1 m23766n(@mr2 GnssStatus gnssStatus) {
        return new ph1(gnssStatus);
    }

    @mr2
    @SuppressLint({"ReferencesDeprecated"})
    /* renamed from: o */
    public static oh1 m23767o(@mr2 GpsStatus gpsStatus) {
        return new ci1(gpsStatus);
    }

    @d81(from = 0.0d, mo14561to = 360.0d)
    /* renamed from: a */
    public abstract float mo14147a(@js1(from = 0) int i);

    @d81(from = 0.0d, mo14561to = 63.0d)
    /* renamed from: b */
    public abstract float mo14148b(@js1(from = 0) int i);

    @d81(from = 0.0d)
    /* renamed from: c */
    public abstract float mo14149c(@js1(from = 0) int i);

    @d81(from = 0.0d, mo14561to = 63.0d)
    /* renamed from: d */
    public abstract float mo14150d(@js1(from = 0) int i);

    /* renamed from: e */
    public abstract int mo14151e(@js1(from = 0) int i);

    @d81(from = -90.0d, mo14561to = 90.0d)
    /* renamed from: f */
    public abstract float mo14153f(@js1(from = 0) int i);

    @js1(from = 0)
    /* renamed from: g */
    public abstract int mo14154g();

    @js1(from = 1, mo18580to = 200)
    /* renamed from: h */
    public abstract int mo14155h(@js1(from = 0) int i);

    /* renamed from: i */
    public abstract boolean mo14157i(@js1(from = 0) int i);

    /* renamed from: j */
    public abstract boolean mo14158j(@js1(from = 0) int i);

    /* renamed from: k */
    public abstract boolean mo14159k(@js1(from = 0) int i);

    /* renamed from: l */
    public abstract boolean mo14160l(@js1(from = 0) int i);

    /* renamed from: m */
    public abstract boolean mo14161m(@js1(from = 0) int i);
}
