package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: com.onedelhi.secure.e0 */
public abstract class C2015e0 implements Parcelable {
    public static final Parcelable.Creator<C2015e0> CREATOR = new C2017b();

    /* renamed from: a */
    public static final C2015e0 f11060a = new C2016a();

    /* renamed from: a */
    public final Parcelable f11061a;

    /* renamed from: com.onedelhi.secure.e0$a */
    public class C2016a extends C2015e0 {
        public C2016a() {
            super((C2016a) null);
        }
    }

    /* renamed from: com.onedelhi.secure.e0$b */
    public class C2017b implements Parcelable.ClassLoaderCreator<C2015e0> {
        /* renamed from: a */
        public C2015e0 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C2015e0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C2015e0.f11060a;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public C2015e0[] newArray(int i) {
            return new C2015e0[i];
        }
    }

    public C2015e0() {
        this.f11061a = null;
    }

    public C2015e0(@mr2 Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public C2015e0(@mr2 Parcel parcel, @ts2 ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f11061a = readParcelable == null ? f11060a : readParcelable;
    }

    public C2015e0(@mr2 Parcelable parcelable) {
        if (parcelable != null) {
            this.f11061a = parcelable == f11060a ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public /* synthetic */ C2015e0(C2016a aVar) {
        this();
    }

    @ts2
    /* renamed from: a */
    public final Parcelable mo14959a() {
        return this.f11061a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11061a, i);
    }
}
