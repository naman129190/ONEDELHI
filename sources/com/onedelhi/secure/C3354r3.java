package com.onedelhi.secure;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@SafeParcelable.Class(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.Reserved({1000})
/* renamed from: com.onedelhi.secure.r3 */
public class C3354r3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3354r3> CREATOR = new ud6();
    @mr2

    /* renamed from: a */
    public static final Comparator<C3115p3> f19567a = new y96();
    @SafeParcelable.Field(getter = "getActivityTransitions", mo10053id = 1)

    /* renamed from: a */
    public final List f19568a;
    @SafeParcelable.Field(getter = "getTag", mo10053id = 2)
    @ts2

    /* renamed from: b */
    public final String f19569b;
    @SafeParcelable.Field(getter = "getClients", mo10053id = 3)

    /* renamed from: b */
    public final List f19570b;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getContextAttributionTag", mo10053id = 4)
    @ts2

    /* renamed from: c */
    public String f19571c;

    public C3354r3(@mr2 List<C3115p3> list) {
        this(list, (String) null, (List) null, (String) null);
    }

    @SafeParcelable.Constructor
    public C3354r3(@SafeParcelable.Param(mo10056id = 1) @mr2 List list, @SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) @ts2 List list2, @SafeParcelable.Param(mo10056id = 4) @ts2 String str2) {
        Preconditions.checkNotNull(list, "transitions can't be null");
        Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        Preconditions.checkNotNull(list);
        TreeSet treeSet = new TreeSet(f19567a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3115p3 p3Var = (C3115p3) it.next();
            Preconditions.checkArgument(treeSet.add(p3Var), String.format("Found duplicated transition: %s.", new Object[]{p3Var}));
        }
        this.f19568a = Collections.unmodifiableList(list);
        this.f19569b = str;
        this.f19570b = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f19571c = str2;
    }

    /* renamed from: K2 */
    public void mo23557K2(@mr2 Intent intent) {
        Preconditions.checkNotNull(intent);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @mr2
    /* renamed from: L2 */
    public final C3354r3 mo23558L2(@ts2 String str) {
        this.f19571c = str;
        return this;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3354r3 r3Var = (C3354r3) obj;
            return Objects.equal(this.f19568a, r3Var.f19568a) && Objects.equal(this.f19569b, r3Var.f19569b) && Objects.equal(this.f19571c, r3Var.f19571c) && Objects.equal(this.f19570b, r3Var.f19570b);
        }
    }

    public int hashCode() {
        int hashCode = this.f19568a.hashCode() * 31;
        String str = this.f19569b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f19570b;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f19571c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    @mr2
    public String toString() {
        String valueOf = String.valueOf(this.f19568a);
        String str = this.f19569b;
        String valueOf2 = String.valueOf(this.f19570b);
        String str2 = this.f19571c;
        return "ActivityTransitionRequest [mTransitions=" + valueOf + ", mTag='" + str + "', mClients=" + valueOf2 + ", mAttributionTag=" + str2 + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f19568a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f19569b, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f19570b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f19571c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
