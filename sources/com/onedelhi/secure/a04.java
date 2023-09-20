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

@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
public class a04 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<a04> CREATOR = new je5();

    /* renamed from: q */
    public static final int f8548q = 0;

    /* renamed from: r */
    public static final int f8549r = 1;

    /* renamed from: s */
    public static final int f8550s = 2;
    @SafeParcelable.Field(getter = "getStartTimeMillis", mo10053id = 1)

    /* renamed from: b */
    public final long f8551b;
    @SafeParcelable.Field(getter = "getEndTimeMillis", mo10053id = 2)

    /* renamed from: c */
    public final long f8552c;
    @SafeParcelable.Field(getter = "getStatus", mo10053id = 3)

    /* renamed from: n */
    public final int f8553n;
    @SafeParcelable.Field(getter = "getMissingDataDurationMinutes", mo10053id = 4)

    /* renamed from: o */
    public final int f8554o;
    @SafeParcelable.Field(getter = "getNinetiethPctConfidence", mo10053id = 5)

    /* renamed from: p */
    public final int f8555p;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public a04(@SafeParcelable.Param(mo10056id = 1) long j, @SafeParcelable.Param(mo10056id = 2) long j2, @SafeParcelable.Param(mo10056id = 3) int i, @SafeParcelable.Param(mo10056id = 4) int i2, @SafeParcelable.Param(mo10056id = 5) int i3) {
        Preconditions.checkArgument(j <= j2, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f8551b = j;
        this.f8552c = j2;
        this.f8553n = i;
        this.f8554o = i2;
        this.f8555p = i3;
    }

    @mr2
    /* renamed from: K2 */
    public static List<a04> m10527K2(@mr2 Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!m10528P2(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((a04) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: P2 */
    public static boolean m10528P2(@ts2 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    /* renamed from: L2 */
    public long mo12469L2() {
        return this.f8552c;
    }

    /* renamed from: M2 */
    public long mo12470M2() {
        return this.f8552c - this.f8551b;
    }

    /* renamed from: N2 */
    public long mo12471N2() {
        return this.f8551b;
    }

    /* renamed from: O2 */
    public int mo12472O2() {
        return this.f8553n;
    }

    public boolean equals(@ts2 Object obj) {
        if (obj instanceof a04) {
            a04 a04 = (a04) obj;
            return this.f8551b == a04.mo12471N2() && this.f8552c == a04.mo12469L2() && this.f8553n == a04.mo12472O2() && this.f8554o == a04.f8554o && this.f8555p == a04.f8555p;
        }
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f8551b), Long.valueOf(this.f8552c), Integer.valueOf(this.f8553n));
    }

    @mr2
    public String toString() {
        long j = this.f8551b;
        long j2 = this.f8552c;
        int i = this.f8553n;
        return "startMillis=" + j + ", endMillis=" + j2 + ", status=" + i;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, mo12471N2());
        SafeParcelWriter.writeLong(parcel, 2, mo12469L2());
        SafeParcelWriter.writeInt(parcel, 3, mo12472O2());
        SafeParcelWriter.writeInt(parcel, 4, this.f8554o);
        SafeParcelWriter.writeInt(parcel, 5, this.f8555p);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
