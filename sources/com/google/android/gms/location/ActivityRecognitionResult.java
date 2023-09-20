package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.dx5;
import com.onedelhi.secure.fk0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.Reserved({1000})
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new dx5();
    @SafeParcelable.Field(mo10053id = 5)
    @ts2

    /* renamed from: a */
    public Bundle f7470a;
    @SafeParcelable.Field(mo10053id = 1)

    /* renamed from: a */
    public List f7471a;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public long f7472b;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: c */
    public long f7473c;
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: n */
    public int f7474n;

    @VisibleForTesting
    public ActivityRecognitionResult(@mr2 fk0 fk0, long j, long j2) {
        this(Collections.singletonList(fk0), j, j2, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(@mr2 List<fk0> list, long j, long j2) {
        this(list, j, j2, 0, (Bundle) null);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(mo10056id = 1) @mr2 List list, @SafeParcelable.Param(mo10056id = 2) long j, @SafeParcelable.Param(mo10056id = 3) long j2, @SafeParcelable.Param(mo10056id = 4) int i, @SafeParcelable.Param(mo10056id = 5) @ts2 Bundle bundle) {
        boolean z = true;
        Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.checkArgument((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f7471a = list;
        this.f7472b = j;
        this.f7473c = j2;
        this.f7474n = i;
        this.f7470a = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((r0 instanceof com.google.android.gms.location.ActivityRecognitionResult) != false) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    @com.onedelhi.secure.ts2
    /* renamed from: K2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.ActivityRecognitionResult m8983K2(@com.onedelhi.secure.mr2 android.content.Intent r3) {
        /*
            boolean r0 = m8984Q2(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x002a
        L_0x0009:
            android.os.Bundle r0 = r3.getExtras()
            if (r0 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L_0x0025
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r0, r2)
        L_0x0022:
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L_0x002a
        L_0x0025:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L_0x0007
            goto L_0x0022
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            return r0
        L_0x002d:
            java.util.List r3 = m8985R2(r3)
            if (r3 == 0) goto L_0x0047
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.m8983K2(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    /* renamed from: Q2 */
    public static boolean m8984Q2(@ts2 Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List R2 = m8985R2(intent);
        return R2 != null && !R2.isEmpty();
    }

    @ts2
    /* renamed from: R2 */
    public static List m8985R2(@mr2 Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    /* renamed from: S2 */
    public static boolean m8986S2(@ts2 Bundle bundle, @ts2 Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!m8986S2(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                    int i = 0;
                    while (i < length) {
                        if (Objects.equal(Array.get(obj, i), Array.get(obj2, i))) {
                            i++;
                        }
                    }
                    continue;
                }
                return false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L2 */
    public int mo10497L2(int i) {
        for (fk0 fk0 : this.f7471a) {
            if (fk0.mo16026L2() == i) {
                return fk0.mo16025K2();
            }
        }
        return 0;
    }

    /* renamed from: M2 */
    public long mo10498M2() {
        return this.f7473c;
    }

    @mr2
    /* renamed from: N2 */
    public fk0 mo10499N2() {
        return (fk0) this.f7471a.get(0);
    }

    @mr2
    /* renamed from: O2 */
    public List<fk0> mo10500O2() {
        return this.f7471a;
    }

    /* renamed from: P2 */
    public long mo10501P2() {
        return this.f7472b;
    }

    @ShowFirstParty
    public final boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f7472b == activityRecognitionResult.f7472b && this.f7473c == activityRecognitionResult.f7473c && this.f7474n == activityRecognitionResult.f7474n && Objects.equal(this.f7471a, activityRecognitionResult.f7471a) && m8986S2(this.f7470a, activityRecognitionResult.f7470a);
        }
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f7472b), Long.valueOf(this.f7473c), Integer.valueOf(this.f7474n), this.f7471a, this.f7470a);
    }

    @mr2
    public String toString() {
        String valueOf = String.valueOf(this.f7471a);
        long j = this.f7472b;
        long j2 = this.f7473c;
        return "ActivityRecognitionResult [probableActivities=" + valueOf + ", timeMillis=" + j + ", elapsedRealtimeMillis=" + j2 + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f7471a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f7472b);
        SafeParcelWriter.writeLong(parcel, 3, this.f7473c);
        SafeParcelWriter.writeInt(parcel, 4, this.f7474n);
        SafeParcelWriter.writeBundle(parcel, 5, this.f7470a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
