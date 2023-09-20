package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class t90 implements Parcelable {
    public static final Parcelable.Creator<t90> CREATOR = new C6862a();

    /* renamed from: a */
    public final AtomicLong f35516a;

    /* renamed from: b */
    public final String f35517b;

    /* renamed from: com.onedelhi.secure.t90$a */
    public class C6862a implements Parcelable.Creator<t90> {
        /* renamed from: a */
        public t90 createFromParcel(Parcel parcel) {
            return new t90(parcel, (C6862a) null);
        }

        /* renamed from: b */
        public t90[] newArray(int i) {
            return new t90[i];
        }
    }

    public t90(Parcel parcel) {
        this.f35517b = parcel.readString();
        this.f35516a = new AtomicLong(parcel.readLong());
    }

    public /* synthetic */ t90(Parcel parcel, C6862a aVar) {
        this(parcel);
    }

    public t90(@mr2 String str) {
        this.f35517b = str;
        this.f35516a = new AtomicLong(0);
    }

    /* renamed from: a */
    public long mo44948a() {
        return this.f35516a.get();
    }

    @mr2
    /* renamed from: b */
    public String mo44949b() {
        return this.f35517b;
    }

    /* renamed from: c */
    public void mo44950c(long j) {
        this.f35516a.addAndGet(j);
    }

    /* renamed from: d */
    public void mo44951d(long j) {
        this.f35516a.set(j);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35517b);
        parcel.writeLong(this.f35516a.get());
    }
}
