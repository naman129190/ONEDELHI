package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.onedelhi.secure.w73;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "PublicKeyCredentialDescriptorCreator")
@SafeParcelable.Reserved({1})
public class s73 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<s73> CREATOR = new wg5();

    /* renamed from: a */
    public static final cj5 f20249a = cj5.m12508n(pd6.f18470a, pd6.f18471b);
    @SafeParcelable.Field(getter = "getTypeAsString", mo10053id = 2, type = "java.lang.String")
    @mr2

    /* renamed from: a */
    public final w73 f20250a;
    @SafeParcelable.Field(getter = "getTransports", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final List f20251a;
    @SafeParcelable.Field(getter = "getId", mo10053id = 3)
    @mr2

    /* renamed from: a */
    public final byte[] f20252a;

    /* renamed from: com.onedelhi.secure.s73$a */
    public static class C3477a extends Exception {
        public C3477a(@mr2 String str) {
            super(str);
        }

        public C3477a(@mr2 String str, @mr2 Throwable th) {
            super(str, th);
        }
    }

    @SafeParcelable.Constructor
    public s73(@SafeParcelable.Param(mo10056id = 2) @mr2 String str, @SafeParcelable.Param(mo10056id = 3) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 4) @ts2 List<Transport> list) {
        Preconditions.checkNotNull(str);
        try {
            this.f20250a = w73.m30706a(str);
            this.f20252a = (byte[]) Preconditions.checkNotNull(bArr);
            this.f20251a = list;
        } catch (w73.C3835a e) {
            throw new IllegalArgumentException(e);
        }
    }

    @mr2
    /* renamed from: K2 */
    public byte[] mo24254K2() {
        return this.f20252a;
    }

    @ts2
    /* renamed from: L2 */
    public List<Transport> mo24255L2() {
        return this.f20251a;
    }

    @mr2
    /* renamed from: M2 */
    public w73 mo24256M2() {
        return this.f20250a;
    }

    @mr2
    /* renamed from: N2 */
    public String mo24257N2() {
        return this.f20250a.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r3 = r5.f20251a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.mr2 java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onedelhi.secure.s73
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.onedelhi.secure.s73 r5 = (com.onedelhi.secure.s73) r5
            com.onedelhi.secure.w73 r0 = r4.f20250a
            com.onedelhi.secure.w73 r2 = r5.f20250a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0013
            return r1
        L_0x0013:
            byte[] r0 = r4.f20252a
            byte[] r2 = r5.f20252a
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 != 0) goto L_0x001e
            return r1
        L_0x001e:
            java.util.List r0 = r4.f20251a
            r2 = 1
            if (r0 != 0) goto L_0x0029
            java.util.List r3 = r5.f20251a
            if (r3 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            if (r0 == 0) goto L_0x0041
            java.util.List r3 = r5.f20251a
            if (r3 != 0) goto L_0x0030
            goto L_0x0041
        L_0x0030:
            boolean r0 = r0.containsAll(r3)
            if (r0 == 0) goto L_0x0041
            java.util.List r5 = r5.f20251a
            java.util.List r0 = r4.f20251a
            boolean r5 = r5.containsAll(r0)
            if (r5 == 0) goto L_0x0041
            return r2
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.s73.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(this.f20250a, Integer.valueOf(Arrays.hashCode(this.f20252a)), this.f20251a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, mo24257N2(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, mo24254K2(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, mo24255L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
