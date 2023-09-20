package com.onedelhi.secure;

import android.os.Parcelable;

public final class eg5 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r15)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0010:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x0079
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r15)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 2: goto L_0x006f;
                case 3: goto L_0x0065;
                case 4: goto L_0x0060;
                case 5: goto L_0x0059;
                case 6: goto L_0x0054;
                case 7: goto L_0x004d;
                case 8: goto L_0x0043;
                case 9: goto L_0x003e;
                case 10: goto L_0x0034;
                case 11: goto L_0x002f;
                case 12: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r15, r1)
            goto L_0x0010
        L_0x0025:
            android.os.Parcelable$Creator<com.onedelhi.secure.sc> r2 = com.onedelhi.secure.C3495sc.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r13 = r1
            com.onedelhi.secure.sc r13 = (com.onedelhi.secure.C3495sc) r13
            goto L_0x0010
        L_0x002f:
            java.lang.String r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            goto L_0x0010
        L_0x0034:
            android.os.Parcelable$Creator<com.onedelhi.secure.jf4> r2 = com.onedelhi.secure.jf4.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r11 = r1
            com.onedelhi.secure.jf4 r11 = (com.onedelhi.secure.jf4) r11
            goto L_0x0010
        L_0x003e:
            java.lang.Integer r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(r15, r1)
            goto L_0x0010
        L_0x0043:
            android.os.Parcelable$Creator<com.onedelhi.secure.ed> r2 = com.onedelhi.secure.C2054ed.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r9 = r1
            com.onedelhi.secure.ed r9 = (com.onedelhi.secure.C2054ed) r9
            goto L_0x0010
        L_0x004d:
            android.os.Parcelable$Creator<com.onedelhi.secure.s73> r2 = com.onedelhi.secure.s73.CREATOR
            java.util.ArrayList r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r15, r1, r2)
            goto L_0x0010
        L_0x0054:
            java.lang.Double r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(r15, r1)
            goto L_0x0010
        L_0x0059:
            android.os.Parcelable$Creator<com.onedelhi.secure.t73> r2 = com.onedelhi.secure.t73.CREATOR
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r15, r1, r2)
            goto L_0x0010
        L_0x0060:
            byte[] r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r15, r1)
            goto L_0x0010
        L_0x0065:
            android.os.Parcelable$Creator<com.onedelhi.secure.x73> r2 = com.onedelhi.secure.x73.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r4 = r1
            com.onedelhi.secure.x73 r4 = (com.onedelhi.secure.x73) r4
            goto L_0x0010
        L_0x006f:
            android.os.Parcelable$Creator<com.onedelhi.secure.v73> r2 = com.onedelhi.secure.v73.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r3 = r1
            com.onedelhi.secure.v73 r3 = (com.onedelhi.secure.v73) r3
            goto L_0x0010
        L_0x0079:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r15, r0)
            com.onedelhi.secure.r73 r15 = new com.onedelhi.secure.r73
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eg5.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new r73[i];
    }
}
