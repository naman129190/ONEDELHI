package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class oy2 {

    /* renamed from: com.onedelhi.secure.oy2$a */
    public static class C3106a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a */
        public final py2<T> f18253a;

        public C3106a(py2<T> py2) {
            this.f18253a = py2;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f18253a.createFromParcel(parcel, (ClassLoader) null);
        }

        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f18253a.createFromParcel(parcel, classLoader);
        }

        public T[] newArray(int i) {
            return this.f18253a.newArray(i);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m24270a(py2<T> py2) {
        return new C3106a(py2);
    }
}
