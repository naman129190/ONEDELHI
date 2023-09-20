package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationReceiverCreator")
public final class by5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<by5> CREATOR = new fy5();
    @SafeParcelable.Field(getter = "getPendingIntentReceiver", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final PendingIntent f10028a;
    @SafeParcelable.Field(getter = "getOldBinderReceiver", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public final IBinder f10029a;
    @SafeParcelable.Field(getter = "getBinderReceiver", mo10053id = 3)
    @ts2

    /* renamed from: b */
    public final IBinder f10030b;
    @SafeParcelable.Field(getter = "getModuleId", mo10053id = 5)
    @ts2

    /* renamed from: b */
    public final String f10031b;
    @SafeParcelable.Field(getter = "getListenerId", mo10053id = 6)
    @ts2

    /* renamed from: c */
    public final String f10032c;
    @SafeParcelable.Field(getter = "getType", mo10053id = 1)

    /* renamed from: n */
    public final int f10033n;

    @SafeParcelable.Constructor
    public by5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) @ts2 IBinder iBinder, @SafeParcelable.Param(mo10056id = 3) @ts2 IBinder iBinder2, @SafeParcelable.Param(mo10056id = 4) @ts2 PendingIntent pendingIntent, @SafeParcelable.Param(mo10056id = 5) @ts2 String str, @SafeParcelable.Param(mo10056id = 6) @ts2 String str2) {
        this.f10033n = i;
        this.f10029a = iBinder;
        this.f10030b = iBinder2;
        this.f10028a = pendingIntent;
        this.f10031b = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f10032c = str2;
    }

    /* renamed from: K2 */
    public static by5 m12146K2(PendingIntent pendingIntent, @ts2 String str, @ts2 String str2) {
        return new by5(3, (IBinder) null, (IBinder) null, pendingIntent, (String) null, (String) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.by5 m12147L2(@com.onedelhi.secure.ts2 android.os.IInterface r7, com.onedelhi.secure.i07 r8, @com.onedelhi.secure.ts2 java.lang.String r9, @com.onedelhi.secure.ts2 java.lang.String r10) {
        /*
            com.onedelhi.secure.by5 r9 = new com.onedelhi.secure.by5
            if (r7 != 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r2 = r7
            r1 = 2
            r4 = 0
            r5 = 0
            r0 = r9
            r3 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.by5.m12147L2(android.os.IInterface, com.onedelhi.secure.i07, java.lang.String, java.lang.String):com.onedelhi.secure.by5");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.by5 m12148M2(@com.onedelhi.secure.ts2 android.os.IInterface r7, com.onedelhi.secure.w27 r8, @com.onedelhi.secure.ts2 java.lang.String r9, @com.onedelhi.secure.ts2 java.lang.String r10) {
        /*
            com.onedelhi.secure.by5 r9 = new com.onedelhi.secure.by5
            if (r7 != 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r2 = r7
            r1 = 1
            r4 = 0
            r5 = 0
            r0 = r9
            r3 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.by5.m12148M2(android.os.IInterface, com.onedelhi.secure.w27, java.lang.String, java.lang.String):com.onedelhi.secure.by5");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f10033n);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f10029a, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f10030b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f10028a, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f10031b, false);
        SafeParcelWriter.writeString(parcel, 6, this.f10032c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
