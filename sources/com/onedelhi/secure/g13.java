package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.C4336a;
import com.onedelhi.secure.h13;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class g13 implements Parcelable {
    public static final Parcelable.Creator<g13> CREATOR = new C5354a();

    /* renamed from: a */
    public final qe4 f28858a;

    /* renamed from: b */
    public final String f28859b;

    /* renamed from: b */
    public boolean f28860b;

    /* renamed from: com.onedelhi.secure.g13$a */
    public class C5354a implements Parcelable.Creator<g13> {
        /* renamed from: a */
        public g13 createFromParcel(@mr2 Parcel parcel) {
            return new g13(parcel, (C5354a) null);
        }

        /* renamed from: b */
        public g13[] newArray(int i) {
            return new g13[i];
        }
    }

    public g13(@mr2 Parcel parcel) {
        boolean z = false;
        this.f28860b = false;
        this.f28859b = parcel.readString();
        this.f28860b = parcel.readByte() != 0 ? true : z;
        this.f28858a = (qe4) parcel.readParcelable(qe4.class.getClassLoader());
    }

    public /* synthetic */ g13(Parcel parcel, C5354a aVar) {
        this(parcel);
    }

    @hw4(otherwise = 3)
    public g13(String str, C5068dz dzVar) {
        this.f28860b = false;
        this.f28859b = str;
        this.f28858a = dzVar.mo34720a();
    }

    @ts2
    /* renamed from: b */
    public static h13[] m48998b(@mr2 List<g13> list) {
        if (list.isEmpty()) {
            return null;
        }
        h13[] h13Arr = new h13[list.size()];
        h13 a = list.get(0).mo36515a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            h13 a2 = list.get(i).mo36515a();
            if (z || !list.get(i).mo36520h()) {
                h13Arr[i] = a2;
            } else {
                h13Arr[0] = a2;
                h13Arr[i] = a;
                z = true;
            }
        }
        if (!z) {
            h13Arr[0] = a;
        }
        return h13Arr;
    }

    /* renamed from: c */
    public static g13 m48999c() {
        g13 g13 = new g13(UUID.randomUUID().toString().replace("-", ""), new C5068dz());
        g13.mo36522k(m49001m());
        return g13;
    }

    @hw4
    /* renamed from: i */
    public static boolean m49000i(@mr2 h13 h13) {
        for (zu3 zu3 : h13.mo37130ti()) {
            if (zu3 == zu3.GAUGES_AND_SYSTEM_EVENTS) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m49001m() {
        C4336a h = C4336a.m34908h();
        return h.mo29861M() && Math.random() < ((double) h.mo29854F());
    }

    /* renamed from: a */
    public h13 mo36515a() {
        h13.C5473c Kj = h13.m50128tk().mo37137Kj(this.f28859b);
        if (this.f28860b) {
            Kj.mo37134Hj(zu3.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (h13) Kj.mo43381ab();
    }

    /* renamed from: d */
    public qe4 mo36516d() {
        return this.f28858a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo36518e() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f28858a.mo43508c()) > C4336a.m34908h().mo29851C();
    }

    /* renamed from: f */
    public boolean mo36519f() {
        return this.f28860b;
    }

    /* renamed from: h */
    public boolean mo36520h() {
        return this.f28860b;
    }

    /* renamed from: j */
    public String mo36521j() {
        return this.f28859b;
    }

    /* renamed from: k */
    public void mo36522k(boolean z) {
        this.f28860b = z;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeString(this.f28859b);
        parcel.writeByte(this.f28860b ? (byte) 1 : 0);
        parcel.writeParcelable(this.f28858a, 0);
    }
}
