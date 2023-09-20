package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.p65;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
@Deprecated
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new p65();
    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", mo10053id = 1)

    /* renamed from: b */
    public final boolean f7232b;
    @SafeParcelable.Field(getter = "shouldShowCancelButton", mo10053id = 2)

    /* renamed from: c */
    public final boolean f7233c;
    @SafeParcelable.Field(mo10053id = 1000)

    /* renamed from: n */
    public final int f7234n;
    @SafeParcelable.Field(getter = "getPromptInternalId", mo10053id = 4)

    /* renamed from: o */
    public final int f7235o;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C1400a {

        /* renamed from: a */
        public int f7236a = 1;

        /* renamed from: a */
        public boolean f7237a = false;

        /* renamed from: b */
        public boolean f7238b = true;

        @mr2
        /* renamed from: a */
        public CredentialPickerConfig mo9144a() {
            return new CredentialPickerConfig(2, this.f7237a, this.f7238b, false, this.f7236a);
        }

        @mr2
        @Deprecated
        /* renamed from: b */
        public C1400a mo9145b(boolean z) {
            int i = 1;
            if (true == z) {
                i = 3;
            }
            this.f7236a = i;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1400a mo9146c(int i) {
            this.f7236a = i;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1400a mo9147d(boolean z) {
            this.f7237a = z;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1400a mo9148e(boolean z) {
            this.f7238b = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$b */
    public @interface C1401b {

        /* renamed from: a */
        public static final int f7239a = 1;

        /* renamed from: b */
        public static final int f7240b = 2;

        /* renamed from: c */
        public static final int f7241c = 3;
    }

    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(mo10056id = 1000) int i, @SafeParcelable.Param(mo10056id = 1) boolean z, @SafeParcelable.Param(mo10056id = 2) boolean z2, @SafeParcelable.Param(mo10056id = 3) boolean z3, @SafeParcelable.Param(mo10056id = 4) int i2) {
        this.f7234n = i;
        this.f7232b = z;
        this.f7233c = z2;
        if (i < 2) {
            this.f7235o = true == z3 ? 3 : 1;
        } else {
            this.f7235o = i2;
        }
    }

    @Deprecated
    /* renamed from: K2 */
    public boolean mo9140K2() {
        return this.f7235o == 3;
    }

    /* renamed from: L2 */
    public boolean mo9141L2() {
        return this.f7232b;
    }

    /* renamed from: M2 */
    public boolean mo9142M2() {
        return this.f7233c;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo9141L2());
        SafeParcelWriter.writeBoolean(parcel, 2, mo9142M2());
        SafeParcelWriter.writeBoolean(parcel, 3, mo9140K2());
        SafeParcelWriter.writeInt(parcel, 4, this.f7235o);
        SafeParcelWriter.writeInt(parcel, 1000, this.f7234n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
