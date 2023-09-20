package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

public class qe4 implements Parcelable {
    public static final Parcelable.Creator<qe4> CREATOR = new C6566a();

    /* renamed from: b */
    public long f34203b;

    /* renamed from: c */
    public long f34204c;

    /* renamed from: com.onedelhi.secure.qe4$a */
    public class C6566a implements Parcelable.Creator<qe4> {
        /* renamed from: a */
        public qe4 createFromParcel(Parcel parcel) {
            return new qe4(parcel, (C6566a) null);
        }

        /* renamed from: b */
        public qe4[] newArray(int i) {
            return new qe4[i];
        }
    }

    public qe4() {
        this(m62717i(), m62715a());
    }

    @VisibleForTesting
    public qe4(long j) {
        this(j, j);
    }

    @VisibleForTesting
    public qe4(long j, long j2) {
        this.f34203b = j;
        this.f34204c = j2;
    }

    public qe4(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    public /* synthetic */ qe4(Parcel parcel, C6566a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static long m62715a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: f */
    public static qe4 m62716f(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new qe4(m62717i() + (micros - m62715a()), micros);
    }

    /* renamed from: i */
    public static long m62717i() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    /* renamed from: b */
    public long mo43507b() {
        return this.f34203b + mo43508c();
    }

    /* renamed from: c */
    public long mo43508c() {
        return mo43509d(new qe4());
    }

    /* renamed from: d */
    public long mo43509d(@mr2 qe4 qe4) {
        return qe4.f34204c - this.f34204c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo43511e() {
        return this.f34203b;
    }

    /* renamed from: h */
    public void mo43512h() {
        this.f34203b = m62717i();
        this.f34204c = m62715a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f34203b);
        parcel.writeLong(this.f34204c);
    }
}
