package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SafeParcelable.Class(creator = "UvmEntriesCreator")
public class fr4 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<fr4> CREATOR = new vk5();
    @SafeParcelable.Field(getter = "getUvmEntryList", mo10053id = 1)
    @ts2

    /* renamed from: a */
    public final List f12287a;

    /* renamed from: com.onedelhi.secure.fr4$a */
    public static final class C2195a {

        /* renamed from: a */
        public final List f12288a = new ArrayList();

        @mr2
        /* renamed from: a */
        public C2195a mo16145a(@mr2 List<gr4> list) {
            pg5.m24695c(this.f12288a.size() + list.size() <= 3);
            this.f12288a.addAll(list);
            return this;
        }

        @mr2
        /* renamed from: b */
        public C2195a mo16146b(@ts2 gr4 gr4) {
            if (this.f12288a.size() < 3) {
                this.f12288a.add(gr4);
                return this;
            }
            throw new IllegalStateException();
        }

        @mr2
        /* renamed from: c */
        public fr4 mo16147c() {
            return new fr4(this.f12288a);
        }
    }

    @SafeParcelable.Constructor
    public fr4(@SafeParcelable.Param(mo10056id = 1) @ts2 List list) {
        this.f12287a = list;
    }

    @ts2
    /* renamed from: K2 */
    public List<gr4> mo16141K2() {
        return this.f12287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r3 = r5.f12287a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.mr2 java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onedelhi.secure.fr4
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.onedelhi.secure.fr4 r5 = (com.onedelhi.secure.fr4) r5
            java.util.List r0 = r4.f12287a
            r2 = 1
            if (r0 != 0) goto L_0x0014
            java.util.List r3 = r5.f12287a
            if (r3 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r1 = 1
            goto L_0x002b
        L_0x0014:
            if (r0 == 0) goto L_0x002b
            java.util.List r3 = r5.f12287a
            if (r3 == 0) goto L_0x002b
            boolean r0 = r0.containsAll(r3)
            if (r0 == 0) goto L_0x002b
            java.util.List r5 = r5.f12287a
            java.util.List r0 = r4.f12287a
            boolean r5 = r5.containsAll(r0)
            if (r5 == 0) goto L_0x002b
            goto L_0x0012
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fr4.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(new HashSet(this.f12287a));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, mo16141K2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
