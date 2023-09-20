package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class vy0 extends C2015e0 {
    public static final Parcelable.Creator<vy0> CREATOR = new C7111a();
    @mr2

    /* renamed from: a */
    public final ty3<String, Bundle> f36780a;

    /* renamed from: com.onedelhi.secure.vy0$a */
    public class C7111a implements Parcelable.ClassLoaderCreator<vy0> {
        @ts2
        /* renamed from: a */
        public vy0 createFromParcel(@mr2 Parcel parcel) {
            return new vy0(parcel, (ClassLoader) null, (C7111a) null);
        }

        @mr2
        /* renamed from: b */
        public vy0 createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
            return new vy0(parcel, classLoader, (C7111a) null);
        }

        @mr2
        /* renamed from: c */
        public vy0[] newArray(int i) {
            return new vy0[i];
        }
    }

    public vy0(@mr2 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f36780a = new ty3<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f36780a.put(strArr[i], bundleArr[i]);
        }
    }

    public /* synthetic */ vy0(Parcel parcel, ClassLoader classLoader, C7111a aVar) {
        this(parcel, classLoader);
    }

    public vy0(Parcelable parcelable) {
        super(parcelable);
        this.f36780a = new ty3<>();
    }

    @mr2
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f36780a + "}";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f36780a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f36780a.mo25350m(i2);
            bundleArr[i2] = this.f36780a.mo25352q(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
