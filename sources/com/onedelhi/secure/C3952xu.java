package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.tn1;

@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.xu */
public class C3952xu extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3952xu> CREATOR = new ml5();

    /* renamed from: b */
    public static final String f22776b = C3952xu.class.getSimpleName();
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", mo10053id = 3, type = "android.os.IBinder")
    @ts2

    /* renamed from: a */
    public final C3798vl f22777a;
    @SafeParcelable.Field(getter = "getBitmapRefWidth", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final Float f22778a;
    @SafeParcelable.Field(getter = "getType", mo10053id = 2)

    /* renamed from: n */
    public final int f22779n;

    public C3952xu(int i) {
        this(i, (C3798vl) null, (Float) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @SafeParcelable.Constructor
    public C3952xu(@SafeParcelable.Param(mo10056id = 2) int i, @SafeParcelable.Param(mo10056id = 3) @ts2 IBinder iBinder, @SafeParcelable.Param(mo10056id = 4) @ts2 Float f) {
        this(i, iBinder == null ? null : new C3798vl(tn1.C3647a.m28820j8(iBinder)), f);
    }

    public C3952xu(int i, @ts2 C3798vl vlVar, @ts2 Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            if (vlVar == null || !z2) {
                i = 3;
                z = false;
                Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), vlVar, f}));
                this.f22779n = i;
                this.f22777a = vlVar;
                this.f22778a = f;
            }
            i = 3;
        }
        z = true;
        Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), vlVar, f}));
        this.f22779n = i;
        this.f22777a = vlVar;
        this.f22778a = f;
    }

    public C3952xu(@mr2 C3798vl vlVar, float f) {
        this(3, vlVar, Float.valueOf(f));
    }

    /* renamed from: K2 */
    public final C3952xu mo27100K2() {
        int i = this.f22779n;
        if (i == 0) {
            return new C2539jq();
        }
        boolean z = true;
        if (i == 1) {
            return new f24();
        }
        if (i == 2) {
            return new hn3();
        }
        if (i != 3) {
            String str = f22776b;
            Log.w(str, "Unknown Cap type: " + i);
            return this;
        }
        Preconditions.checkState(this.f22777a != null, "bitmapDescriptor must not be null");
        if (this.f22778a == null) {
            z = false;
        }
        Preconditions.checkState(z, "bitmapRefWidth must not be null");
        return new fc0(this.f22777a, this.f22778a.floatValue());
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3952xu)) {
            return false;
        }
        C3952xu xuVar = (C3952xu) obj;
        return this.f22779n == xuVar.f22779n && Objects.equal(this.f22777a, xuVar.f22777a) && Objects.equal(this.f22778a, xuVar.f22778a);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f22779n), this.f22777a, this.f22778a);
    }

    @mr2
    public String toString() {
        int i = this.f22779n;
        return "[Cap: type=" + i + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f22779n);
        C3798vl vlVar = this.f22777a;
        SafeParcelWriter.writeIBinder(parcel, 3, vlVar == null ? null : vlVar.mo26166a().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.f22778a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
