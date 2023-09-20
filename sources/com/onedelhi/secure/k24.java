package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.tn1;

@SafeParcelable.Class(creator = "StampStyleCreator")
@SafeParcelable.Reserved({1})
public class k24 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<k24> CREATOR = new jv6();
    @SafeParcelable.Field(getter = "getWrappedStampBinder", mo10053id = 2, type = "android.os.IBinder")
    @mr2

    /* renamed from: a */
    public final C3798vl f14693a;

    /* renamed from: com.onedelhi.secure.k24$a */
    public static abstract class C2592a<T extends C2592a<T>> {

        /* renamed from: a */
        public C3798vl f14694a;

        /* renamed from: a */
        public abstract T mo14452a();

        /* renamed from: b */
        public T mo18874b(C3798vl vlVar) {
            this.f14694a = vlVar;
            return mo14452a();
        }
    }

    @SafeParcelable.Constructor
    public k24(@SafeParcelable.Param(mo10056id = 2) IBinder iBinder) {
        this.f14693a = new C3798vl(tn1.C3647a.m28820j8(iBinder));
    }

    public k24(@mr2 C3798vl vlVar) {
        this.f14693a = vlVar;
    }

    @mr2
    /* renamed from: K2 */
    public C3798vl mo18872K2() {
        return this.f14693a;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f14693a.mo26166a().asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
