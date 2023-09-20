package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
public class h03 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<h03> CREATOR = new hk6();

    /* renamed from: b */
    public static final String f12857b = h03.class.getSimpleName();
    @SafeParcelable.Field(getter = "getLength", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final Float f12858a;
    @SafeParcelable.Field(getter = "getType", mo10053id = 2)

    /* renamed from: n */
    public final int f12859n;

    @SafeParcelable.Constructor
    public h03(@SafeParcelable.Param(mo10056id = 2) int i, @SafeParcelable.Param(mo10056id = 3) @ts2 Float f) {
        boolean z = false;
        if (i == 1 || (f != null && f.floatValue() >= 0.0f)) {
            z = true;
        }
        Preconditions.checkArgument(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.f12859n = i;
        this.f12858a = f;
    }

    @ts2
    /* renamed from: K2 */
    public static List m16423K2(@ts2 List list) {
        h03 h03;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h03 h032 = (h03) it.next();
            if (h032 == null) {
                h032 = null;
            } else {
                int i = h032.f12859n;
                boolean z = false;
                if (i == 0) {
                    if (h032.f12858a != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    h03 = new cd0(h032.f12858a.floatValue());
                } else if (i == 1) {
                    h032 = new co0();
                } else if (i != 2) {
                    Log.w(f12857b, "Unknown PatternItem type: " + i);
                } else {
                    if (h032.f12858a != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    h03 = new pd1(h032.f12858a.floatValue());
                }
                h032 = h03;
            }
            arrayList.add(h032);
        }
        return arrayList;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h03)) {
            return false;
        }
        h03 h03 = (h03) obj;
        return this.f12859n == h03.f12859n && Objects.equal(this.f12858a, h03.f12858a);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f12859n), this.f12858a);
    }

    @mr2
    public String toString() {
        int i = this.f12859n;
        Float f = this.f12858a;
        return "[PatternItem: type=" + i + " length=" + f + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f12859n);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.f12858a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
