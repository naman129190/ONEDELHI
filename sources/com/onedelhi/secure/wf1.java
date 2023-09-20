package com.onedelhi.secure;

import android.location.Location;
import com.onedelhi.secure.sf1;
import java.util.List;

public class wf1 {

    /* renamed from: a */
    public final int f22096a;
    @ts2

    /* renamed from: a */
    public final Location f22097a;
    @ts2

    /* renamed from: a */
    public final List f22098a;
    @sf1.C3513b

    /* renamed from: b */
    public final int f22099b;

    public wf1(int i, @sf1.C3513b int i2, @ts2 List list, @ts2 Location location) {
        this.f22096a = i;
        this.f22099b = i2;
        this.f22098a = list;
        this.f22097a = location;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    @com.onedelhi.secure.ts2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.wf1 m30803a(@com.onedelhi.secure.mr2 android.content.Intent r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "gms_error_code"
            r2 = -1
            int r1 = r12.getIntExtra(r1, r2)
            java.lang.String r3 = "com.google.android.location.intent.extra.transition"
            int r3 = r12.getIntExtra(r3, r2)
            r4 = 4
            if (r3 != r2) goto L_0x0016
        L_0x0014:
            r3 = -1
            goto L_0x001f
        L_0x0016:
            r5 = 1
            if (r3 == r5) goto L_0x001f
            r5 = 2
            if (r3 == r5) goto L_0x001f
            if (r3 != r4) goto L_0x0014
            r3 = 4
        L_0x001f:
            java.lang.String r4 = "com.google.android.location.intent.extra.geofence_list"
            java.io.Serializable r4 = r12.getSerializableExtra(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x002b
            r5 = r0
            goto L_0x005e
        L_0x002b:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            r5.<init>(r6)
            int r6 = r4.size()
            r7 = 0
            r8 = 0
        L_0x003a:
            if (r8 >= r6) goto L_0x005e
            java.lang.Object r9 = r4.get(r8)
            byte[] r9 = (byte[]) r9
            android.os.Parcel r10 = android.os.Parcel.obtain()
            int r11 = r9.length
            r10.unmarshall(r9, r7, r11)
            r10.setDataPosition(r7)
            android.os.Parcelable$Creator<com.onedelhi.secure.zy5> r9 = com.onedelhi.secure.zy5.CREATOR
            java.lang.Object r9 = r9.createFromParcel(r10)
            com.onedelhi.secure.zy5 r9 = (com.onedelhi.secure.zy5) r9
            r10.recycle()
            r5.add(r9)
            int r8 = r8 + 1
            goto L_0x003a
        L_0x005e:
            java.lang.String r4 = "com.google.android.location.intent.extra.triggering_location"
            android.os.Parcelable r12 = r12.getParcelableExtra(r4)
            android.location.Location r12 = (android.location.Location) r12
            if (r5 != 0) goto L_0x006b
            if (r1 != r2) goto L_0x006b
            return r0
        L_0x006b:
            com.onedelhi.secure.wf1 r0 = new com.onedelhi.secure.wf1
            r0.<init>(r1, r3, r5, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wf1.m30803a(android.content.Intent):com.onedelhi.secure.wf1");
    }

    /* renamed from: b */
    public int mo26503b() {
        return this.f22096a;
    }

    @sf1.C3513b
    /* renamed from: c */
    public int mo26504c() {
        return this.f22099b;
    }

    @ts2
    /* renamed from: d */
    public List<sf1> mo26505d() {
        return this.f22098a;
    }

    @ts2
    /* renamed from: e */
    public Location mo26506e() {
        return this.f22097a;
    }

    /* renamed from: f */
    public boolean mo26507f() {
        return this.f22096a != -1;
    }
}
