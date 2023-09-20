package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.onedelhi.secure.zr */
public class C4119zr implements Parcelable {
    @mr2
    public static final Parcelable.Creator<C4119zr> CREATOR = new hx6();
    @mr2

    /* renamed from: a */
    public final C2925n4 f23861a;

    /* renamed from: com.onedelhi.secure.zr$a */
    public static class C4120a extends Exception {
        public C4120a(int i) {
            super("Algorithm with COSE value " + i + " not supported");
        }
    }

    public C4119zr(@mr2 C2925n4 n4Var) {
        this.f23861a = (C2925n4) Preconditions.checkNotNull(n4Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.onedelhi.secure.ge3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.onedelhi.secure.yq0[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.onedelhi.secure.yq0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.onedelhi.secure.ge3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.onedelhi.secure.ge3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.onedelhi.secure.ge3} */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.onedelhi.secure.mr2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.C4119zr m33326a(int r7) throws com.onedelhi.secure.C4119zr.C4120a {
        /*
            com.onedelhi.secure.zr r0 = new com.onedelhi.secure.zr
            com.onedelhi.secure.ge3 r1 = com.onedelhi.secure.ge3.LEGACY_RS1
            int r1 = r1.mo16550a()
            if (r7 != r1) goto L_0x000d
            com.onedelhi.secure.ge3 r7 = com.onedelhi.secure.ge3.RS1
            goto L_0x0033
        L_0x000d:
            com.onedelhi.secure.ge3[] r1 = com.onedelhi.secure.ge3.values()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x0023
            r5 = r1[r4]
            int r6 = r5.mo16550a()
            if (r6 != r7) goto L_0x0020
            r7 = r5
            goto L_0x0033
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0023:
            com.onedelhi.secure.yq0[] r1 = com.onedelhi.secure.yq0.values()
            int r2 = r1.length
        L_0x0028:
            if (r3 >= r2) goto L_0x003a
            r4 = r1[r3]
            int r5 = r4.mo16550a()
            if (r5 != r7) goto L_0x0037
            r7 = r4
        L_0x0033:
            r0.<init>(r7)
            return r0
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x003a:
            com.onedelhi.secure.zr$a r0 = new com.onedelhi.secure.zr$a
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4119zr.m33326a(int):com.onedelhi.secure.zr");
    }

    /* renamed from: b */
    public int mo28068b() {
        return this.f23861a.mo16550a();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@mr2 Object obj) {
        return (obj instanceof C4119zr) && this.f23861a.mo16550a() == ((C4119zr) obj).f23861a.mo16550a();
    }

    public int hashCode() {
        return Objects.hashCode(this.f23861a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeInt(this.f23861a.mo16550a());
    }
}
