package com.onedelhi.secure;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
public class zz3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<zz3> CREATOR = new yd5();
    @SafeParcelable.Field(getter = "getConfidenceOverwrittenByAlarmClockTrigger", mo10053id = 8)

    /* renamed from: b */
    public final boolean f24002b;
    @SafeParcelable.Field(getter = "getTimestampSec", mo10053id = 1)

    /* renamed from: n */
    public final int f24003n;
    @SafeParcelable.Field(getter = "getConfidence", mo10053id = 2)

    /* renamed from: o */
    public final int f24004o;
    @SafeParcelable.Field(getter = "getMotion", mo10053id = 3)

    /* renamed from: p */
    public final int f24005p;
    @SafeParcelable.Field(getter = "getLight", mo10053id = 4)

    /* renamed from: q */
    public final int f24006q;
    @SafeParcelable.Field(getter = "getNoise", mo10053id = 5)

    /* renamed from: r */
    public final int f24007r;
    @SafeParcelable.Field(getter = "getLightDiff", mo10053id = 6)

    /* renamed from: s */
    public final int f24008s;
    @SafeParcelable.Field(getter = "getNightOrDay", mo10053id = 7)

    /* renamed from: t */
    public final int f24009t;
    @SafeParcelable.Field(getter = "getPresenceConfidence", mo10053id = 9)

    /* renamed from: u */
    public final int f24010u;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public zz3(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) int i3, @SafeParcelable.Param(mo10056id = 4) int i4, @SafeParcelable.Param(mo10056id = 5) int i5, @SafeParcelable.Param(mo10056id = 6) int i6, @SafeParcelable.Param(mo10056id = 7) int i7, @SafeParcelable.Param(mo10056id = 8) boolean z, @SafeParcelable.Param(mo10056id = 9) int i8) {
        this.f24003n = i;
        this.f24004o = i2;
        this.f24005p = i3;
        this.f24006q = i4;
        this.f24007r = i5;
        this.f24008s = i6;
        this.f24009t = i7;
        this.f24002b = z;
        this.f24010u = i8;
    }

    @mr2
    /* renamed from: K2 */
    public static List<zz3> m33567K2(@mr2 Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!m33568P2(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((zz3) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: P2 */
    public static boolean m33568P2(@ts2 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    /* renamed from: L2 */
    public int mo28205L2() {
        return this.f24004o;
    }

    /* renamed from: M2 */
    public int mo28206M2() {
        return this.f24006q;
    }

    /* renamed from: N2 */
    public int mo28207N2() {
        return this.f24005p;
    }

    /* renamed from: O2 */
    public long mo28208O2() {
        return ((long) this.f24003n) * 1000;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz3)) {
            return false;
        }
        zz3 zz3 = (zz3) obj;
        return this.f24003n == zz3.f24003n && this.f24004o == zz3.f24004o;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f24003n), Integer.valueOf(this.f24004o));
    }

    @mr2
    public String toString() {
        int i = this.f24003n;
        int i2 = this.f24004o;
        int i3 = this.f24005p;
        int i4 = this.f24006q;
        return i + " Conf:" + i2 + " Motion:" + i3 + " Light:" + i4;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f24003n);
        SafeParcelWriter.writeInt(parcel, 2, mo28205L2());
        SafeParcelWriter.writeInt(parcel, 3, mo28207N2());
        SafeParcelWriter.writeInt(parcel, 4, mo28206M2());
        SafeParcelWriter.writeInt(parcel, 5, this.f24007r);
        SafeParcelWriter.writeInt(parcel, 6, this.f24008s);
        SafeParcelWriter.writeInt(parcel, 7, this.f24009t);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f24002b);
        SafeParcelWriter.writeInt(parcel, 9, this.f24010u);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
