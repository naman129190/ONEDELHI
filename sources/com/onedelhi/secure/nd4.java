package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class nd4 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<nd4> CREATOR = new ec5();
    @SafeParcelable.Field(getter = "getZIndex", mo10053id = 4)

    /* renamed from: a */
    public float f17324a;
    @ts2

    /* renamed from: a */
    public od4 f17325a;
    @SafeParcelable.Field(getter = "getTileProviderDelegate", mo10053id = 2, type = "android.os.IBinder")
    @ts2

    /* renamed from: a */
    public rg5 f17326a;
    @SafeParcelable.Field(getter = "getTransparency", mo10053id = 6)

    /* renamed from: b */
    public float f17327b = 0.0f;
    @SafeParcelable.Field(getter = "isVisible", mo10053id = 3)

    /* renamed from: b */
    public boolean f17328b = true;
    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", mo10053id = 5)

    /* renamed from: c */
    public boolean f17329c = true;

    public nd4() {
    }

    @SafeParcelable.Constructor
    public nd4(@SafeParcelable.Param(mo10056id = 2) IBinder iBinder, @SafeParcelable.Param(mo10056id = 3) boolean z, @SafeParcelable.Param(mo10056id = 4) float f, @SafeParcelable.Param(mo10056id = 5) boolean z2, @SafeParcelable.Param(mo10056id = 6) float f2) {
        rg5 k8 = ig5.m17523k8(iBinder);
        this.f17326a = k8;
        this.f17325a = k8 == null ? null : new cb5(this);
        this.f17328b = z;
        this.f17324a = f;
        this.f17329c = z2;
        this.f17327b = f2;
    }

    @mr2
    /* renamed from: K2 */
    public nd4 mo21158K2(boolean z) {
        this.f17329c = z;
        return this;
    }

    /* renamed from: L2 */
    public boolean mo21159L2() {
        return this.f17329c;
    }

    @ts2
    /* renamed from: M2 */
    public od4 mo21160M2() {
        return this.f17325a;
    }

    /* renamed from: N2 */
    public float mo21161N2() {
        return this.f17327b;
    }

    /* renamed from: O2 */
    public float mo21162O2() {
        return this.f17324a;
    }

    /* renamed from: P2 */
    public boolean mo21163P2() {
        return this.f17328b;
    }

    @mr2
    /* renamed from: Q2 */
    public nd4 mo21164Q2(@mr2 od4 od4) {
        this.f17325a = (od4) Preconditions.checkNotNull(od4, "tileProvider must not be null.");
        this.f17326a = new qb5(this, od4);
        return this;
    }

    @mr2
    /* renamed from: R2 */
    public nd4 mo21165R2(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.f17327b = f;
        return this;
    }

    @mr2
    /* renamed from: S2 */
    public nd4 mo21166S2(boolean z) {
        this.f17328b = z;
        return this;
    }

    @mr2
    /* renamed from: T2 */
    public nd4 mo21167T2(float f) {
        this.f17324a = f;
        return this;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        rg5 rg5 = this.f17326a;
        SafeParcelWriter.writeIBinder(parcel, 2, rg5 == null ? null : rg5.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, mo21163P2());
        SafeParcelWriter.writeFloat(parcel, 4, mo21162O2());
        SafeParcelWriter.writeBoolean(parcel, 5, mo21159L2());
        SafeParcelWriter.writeFloat(parcel, 6, mo21161N2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
