package com.onedelhi.secure;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public interface mn1 extends IInterface {

    /* renamed from: com.onedelhi.secure.mn1$a */
    public static abstract class C2870a extends cl5 implements mn1 {
        public C2870a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @mr2
        /* renamed from: j8 */
        public static mn1 m21815j8(@mr2 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof mn1 ? (mn1) queryLocalInterface : new wa5(iBinder);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0070, code lost:
            r3.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
            r3.writeNoException();
            r2 = com.onedelhi.secure.sr5.f20495a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cf, code lost:
            r3.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
            r3.writeInt(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e5, code lost:
            r3.writeNoException();
            com.onedelhi.secure.sr5.m27805e(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean zza(int r1, @com.onedelhi.secure.mr2 android.os.Parcel r2, @com.onedelhi.secure.mr2 android.os.Parcel r3, int r4) throws android.os.RemoteException {
            /*
                r0 = this;
                switch(r1) {
                    case 2: goto L_0x00e1;
                    case 3: goto L_0x00d6;
                    case 4: goto L_0x00cb;
                    case 5: goto L_0x00c6;
                    case 6: goto L_0x00c1;
                    case 7: goto L_0x00b7;
                    case 8: goto L_0x00ac;
                    case 9: goto L_0x00a7;
                    case 10: goto L_0x00a2;
                    case 11: goto L_0x009d;
                    case 12: goto L_0x0098;
                    case 13: goto L_0x0093;
                    case 14: goto L_0x008e;
                    case 15: goto L_0x0089;
                    case 16: goto L_0x0084;
                    case 17: goto L_0x007f;
                    case 18: goto L_0x007a;
                    case 19: goto L_0x0075;
                    case 20: goto L_0x0062;
                    case 21: goto L_0x0057;
                    case 22: goto L_0x004c;
                    case 23: goto L_0x0041;
                    case 24: goto L_0x0036;
                    case 25: goto L_0x0027;
                    case 26: goto L_0x0014;
                    case 27: goto L_0x0005;
                    default: goto L_0x0003;
                }
            L_0x0003:
                r1 = 0
                return r1
            L_0x0005:
                android.os.IBinder r1 = r2.readStrongBinder()
                com.onedelhi.secure.tn1 r1 = com.onedelhi.secure.tn1.C3647a.m28820j8(r1)
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15872v4(r1)
                goto L_0x0070
            L_0x0014:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.onedelhi.secure.sr5.m27801a(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                int r4 = r2.readInt()
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15858Q2(r1, r4)
                goto L_0x0070
            L_0x0027:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.onedelhi.secure.sr5.m27801a(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15864d2(r1)
                goto L_0x0070
            L_0x0036:
                boolean r1 = com.onedelhi.secure.sr5.m27806f(r2)
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15866f8(r1)
                goto L_0x0070
            L_0x0041:
                boolean r1 = com.onedelhi.secure.sr5.m27806f(r2)
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15868k7(r1)
                goto L_0x0070
            L_0x004c:
                boolean r1 = com.onedelhi.secure.sr5.m27806f(r2)
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15870v2(r1)
                goto L_0x0070
            L_0x0057:
                boolean r1 = com.onedelhi.secure.sr5.m27806f(r2)
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15857P(r1)
                goto L_0x0070
            L_0x0062:
                android.os.IBinder r1 = r2.readStrongBinder()
                com.onedelhi.secure.tn1 r1 = com.onedelhi.secure.tn1.C3647a.m28820j8(r1)
                com.onedelhi.secure.sr5.m27802b(r2)
                r0.mo15871v3(r1)
            L_0x0070:
                r3.writeNoException()
                goto L_0x00eb
            L_0x0075:
                boolean r1 = r0.mo15874z()
                goto L_0x00bb
            L_0x007a:
                boolean r1 = r0.mo15856K0()
                goto L_0x00bb
            L_0x007f:
                boolean r1 = r0.mo15873y2()
                goto L_0x00bb
            L_0x0084:
                boolean r1 = r0.mo15860U1()
                goto L_0x00bb
            L_0x0089:
                boolean r1 = r0.mo15863d1()
                goto L_0x00bb
            L_0x008e:
                boolean r1 = r0.mo15854H3()
                goto L_0x00bb
            L_0x0093:
                boolean r1 = r0.mo15859T2()
                goto L_0x00bb
            L_0x0098:
                com.onedelhi.secure.tn1 r1 = r0.mo15855J0()
                goto L_0x00e5
            L_0x009d:
                boolean r1 = r0.mo15862V5()
                goto L_0x00bb
            L_0x00a2:
                int r1 = r0.zzc()
                goto L_0x00cf
            L_0x00a7:
                com.onedelhi.secure.mn1 r1 = r0.mo15861V3()
                goto L_0x00e5
            L_0x00ac:
                java.lang.String r1 = r0.mo15851A()
                r3.writeNoException()
                r3.writeString(r1)
                goto L_0x00eb
            L_0x00b7:
                boolean r1 = r0.mo15865e5()
            L_0x00bb:
                r3.writeNoException()
                int r2 = com.onedelhi.secure.sr5.f20495a
                goto L_0x00d2
            L_0x00c1:
                com.onedelhi.secure.tn1 r1 = r0.mo15875z0()
                goto L_0x00e5
            L_0x00c6:
                com.onedelhi.secure.mn1 r1 = r0.mo15869n1()
                goto L_0x00e5
            L_0x00cb:
                int r1 = r0.mo15853G6()
            L_0x00cf:
                r3.writeNoException()
            L_0x00d2:
                r3.writeInt(r1)
                goto L_0x00eb
            L_0x00d6:
                android.os.Bundle r1 = r0.mo15852C1()
                r3.writeNoException()
                com.onedelhi.secure.sr5.m27804d(r3, r1)
                goto L_0x00eb
            L_0x00e1:
                com.onedelhi.secure.tn1 r1 = r0.mo15867i5()
            L_0x00e5:
                r3.writeNoException()
                com.onedelhi.secure.sr5.m27805e(r3, r1)
            L_0x00eb:
                r1 = 1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mn1.C2870a.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    @ts2
    /* renamed from: A */
    String mo15851A() throws RemoteException;

    @ts2
    /* renamed from: C1 */
    Bundle mo15852C1() throws RemoteException;

    /* renamed from: G6 */
    int mo15853G6() throws RemoteException;

    /* renamed from: H3 */
    boolean mo15854H3() throws RemoteException;

    @mr2
    /* renamed from: J0 */
    tn1 mo15855J0() throws RemoteException;

    /* renamed from: K0 */
    boolean mo15856K0() throws RemoteException;

    /* renamed from: P */
    void mo15857P(boolean z) throws RemoteException;

    /* renamed from: Q2 */
    void mo15858Q2(@mr2 Intent intent, int i) throws RemoteException;

    /* renamed from: T2 */
    boolean mo15859T2() throws RemoteException;

    /* renamed from: U1 */
    boolean mo15860U1() throws RemoteException;

    @ts2
    /* renamed from: V3 */
    mn1 mo15861V3() throws RemoteException;

    /* renamed from: V5 */
    boolean mo15862V5() throws RemoteException;

    /* renamed from: d1 */
    boolean mo15863d1() throws RemoteException;

    /* renamed from: d2 */
    void mo15864d2(@mr2 Intent intent) throws RemoteException;

    /* renamed from: e5 */
    boolean mo15865e5() throws RemoteException;

    /* renamed from: f8 */
    void mo15866f8(boolean z) throws RemoteException;

    @mr2
    /* renamed from: i5 */
    tn1 mo15867i5() throws RemoteException;

    /* renamed from: k7 */
    void mo15868k7(boolean z) throws RemoteException;

    @ts2
    /* renamed from: n1 */
    mn1 mo15869n1() throws RemoteException;

    /* renamed from: v2 */
    void mo15870v2(boolean z) throws RemoteException;

    /* renamed from: v3 */
    void mo15871v3(@mr2 tn1 tn1) throws RemoteException;

    /* renamed from: v4 */
    void mo15872v4(@mr2 tn1 tn1) throws RemoteException;

    /* renamed from: y2 */
    boolean mo15873y2() throws RemoteException;

    /* renamed from: z */
    boolean mo15874z() throws RemoteException;

    @mr2
    /* renamed from: z0 */
    tn1 mo15875z0() throws RemoteException;

    int zzc() throws RemoteException;
}
