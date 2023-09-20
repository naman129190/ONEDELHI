package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
/* renamed from: com.onedelhi.secure.p3 */
public class C3115p3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3115p3> CREATOR = new c26();

    /* renamed from: p */
    public static final int f18314p = 0;

    /* renamed from: q */
    public static final int f18315q = 1;
    @SafeParcelable.Field(getter = "getActivityType", mo10053id = 1)

    /* renamed from: n */
    public final int f18316n;
    @SafeParcelable.Field(getter = "getTransitionType", mo10053id = 2)

    /* renamed from: o */
    public final int f18317o;

    /* renamed from: com.onedelhi.secure.p3$a */
    public static class C3116a {

        /* renamed from: a */
        public int f18318a = -1;

        /* renamed from: b */
        public int f18319b = -1;

        @mr2
        /* renamed from: a */
        public C3115p3 mo22229a() {
            boolean z = true;
            Preconditions.checkState(this.f18318a != -1, "Activity type not set.");
            if (this.f18319b == -1) {
                z = false;
            }
            Preconditions.checkState(z, "Activity transition type not set.");
            return new C3115p3(this.f18318a, this.f18319b);
        }

        @mr2
        /* renamed from: b */
        public C3116a mo22230b(int i) {
            C3115p3.m24368M2(i);
            this.f18319b = i;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3116a mo22231c(int i) {
            this.f18318a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.p3$b */
    public @interface C3117b {
    }

    @SafeParcelable.Constructor
    public C3115p3(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2) {
        this.f18316n = i;
        this.f18317o = i2;
    }

    /* renamed from: M2 */
    public static void m24368M2(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        Preconditions.checkArgument(z, "Transition type " + i + " is not valid.");
    }

    /* renamed from: K2 */
    public int mo22223K2() {
        return this.f18316n;
    }

    /* renamed from: L2 */
    public int mo22224L2() {
        return this.f18317o;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3115p3)) {
            return false;
        }
        C3115p3 p3Var = (C3115p3) obj;
        return this.f18316n == p3Var.f18316n && this.f18317o == p3Var.f18317o;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f18316n), Integer.valueOf(this.f18317o));
    }

    @mr2
    public String toString() {
        int i = this.f18316n;
        int i2 = this.f18317o;
        return "ActivityTransition [mActivityType=" + i + ", mTransitionType=" + i2 + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo22223K2());
        SafeParcelWriter.writeInt(parcel, 2, mo22224L2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
