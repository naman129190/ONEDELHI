package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StrokeStyleCreator")
@SafeParcelable.Reserved({1})
public final class y54 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<y54> CREATOR = new q37();
    @SafeParcelable.Field(getter = "getWidth", mo10053id = 2)

    /* renamed from: a */
    public final float f22882a;
    @SafeParcelable.Field(getter = "getStamp", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public final k24 f22883a;
    @SafeParcelable.Field(getter = "isVisible", mo10053id = 5)

    /* renamed from: b */
    public final boolean f22884b;
    @SafeParcelable.Field(getter = "getColor", mo10053id = 3)

    /* renamed from: n */
    public final int f22885n;
    @SafeParcelable.Field(getter = "getToColor", mo10053id = 4)

    /* renamed from: o */
    public final int f22886o;

    /* renamed from: com.onedelhi.secure.y54$a */
    public static final class C3975a {

        /* renamed from: a */
        public float f22887a;

        /* renamed from: a */
        public int f22888a;
        @ts2

        /* renamed from: a */
        public k24 f22889a;

        /* renamed from: a */
        public boolean f22890a;

        /* renamed from: b */
        public int f22891b;

        public C3975a() {
        }

        public C3975a(@mr2 y54 y54) {
            this.f22887a = y54.mo27204P2();
            Pair Q2 = y54.mo27205Q2();
            this.f22888a = ((Integer) Q2.first).intValue();
            this.f22891b = ((Integer) Q2.second).intValue();
            this.f22890a = y54.mo27203N2();
            this.f22889a = y54.mo27202L2();
        }

        public /* synthetic */ C3975a(z27 z27) {
        }

        @mr2
        /* renamed from: a */
        public y54 mo27207a() {
            return new y54(this.f22887a, this.f22888a, this.f22891b, this.f22890a, this.f22889a);
        }

        @mr2
        /* renamed from: b */
        public C3975a mo27208b(@mr2 k24 k24) {
            this.f22889a = k24;
            return this;
        }

        @mr2
        /* renamed from: c */
        public final C3975a mo27209c(int i) {
            this.f22888a = i;
            this.f22891b = i;
            return this;
        }

        @mr2
        /* renamed from: d */
        public final C3975a mo27210d(int i, int i2) {
            this.f22888a = i;
            this.f22891b = i2;
            return this;
        }

        @mr2
        /* renamed from: e */
        public final C3975a mo27211e(boolean z) {
            this.f22890a = z;
            return this;
        }

        @mr2
        /* renamed from: f */
        public final C3975a mo27212f(float f) {
            this.f22887a = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public y54(@SafeParcelable.Param(mo10056id = 2) float f, @SafeParcelable.Param(mo10056id = 3) int i, @SafeParcelable.Param(mo10056id = 4) int i2, @SafeParcelable.Param(mo10056id = 5) boolean z, @SafeParcelable.Param(mo10056id = 6) @ts2 k24 k24) {
        this.f22882a = f;
        this.f22885n = i;
        this.f22886o = i2;
        this.f22884b = z;
        this.f22883a = k24;
    }

    @mr2
    /* renamed from: K2 */
    public static C3975a m31950K2(int i) {
        C3975a aVar = new C3975a((z27) null);
        aVar.mo27209c(i);
        return aVar;
    }

    @mr2
    /* renamed from: M2 */
    public static C3975a m31951M2(int i, int i2) {
        C3975a aVar = new C3975a((z27) null);
        aVar.mo27210d(i, i2);
        return aVar;
    }

    @mr2
    /* renamed from: O2 */
    public static C3975a m31952O2() {
        C3975a aVar = new C3975a((z27) null);
        aVar.mo27209c(0);
        return aVar;
    }

    @ts2
    /* renamed from: L2 */
    public k24 mo27202L2() {
        return this.f22883a;
    }

    /* renamed from: N2 */
    public boolean mo27203N2() {
        return this.f22884b;
    }

    /* renamed from: P2 */
    public final float mo27204P2() {
        return this.f22882a;
    }

    @mr2
    /* renamed from: Q2 */
    public final Pair mo27205Q2() {
        return new Pair(Integer.valueOf(this.f22885n), Integer.valueOf(this.f22886o));
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f22882a);
        SafeParcelWriter.writeInt(parcel, 3, this.f22885n);
        SafeParcelWriter.writeInt(parcel, 4, this.f22886o);
        SafeParcelWriter.writeBoolean(parcel, 5, mo27203N2());
        SafeParcelWriter.writeParcelable(parcel, 6, mo27202L2(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
