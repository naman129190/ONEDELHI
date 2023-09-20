package com.onedelhi.secure;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C1972dh;

@AutoValue
public abstract class jo2 {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.jo2$a */
    public static abstract class C2534a {
        @mr2
        /* renamed from: a */
        public abstract jo2 mo14651a();

        @mr2
        /* renamed from: b */
        public abstract C2534a mo14652b(@ts2 C2535b bVar);

        @mr2
        /* renamed from: c */
        public abstract C2534a mo14653c(@ts2 C2536c cVar);
    }

    /* renamed from: com.onedelhi.secure.jo2$b */
    public enum C2535b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: a */
        public static final SparseArray<C2535b> f14302a = null;

        /* renamed from: n */
        public final int f14325n;

        /* access modifiers changed from: public */
        static {
            C2535b bVar;
            C2535b bVar2;
            C2535b bVar3;
            C2535b bVar4;
            C2535b bVar5;
            C2535b bVar6;
            C2535b bVar7;
            C2535b bVar8;
            C2535b bVar9;
            C2535b bVar10;
            C2535b bVar11;
            C2535b bVar12;
            C2535b bVar13;
            C2535b bVar14;
            C2535b bVar15;
            C2535b bVar16;
            C2535b bVar17;
            C2535b bVar18;
            C2535b bVar19;
            C2535b bVar20;
            SparseArray<C2535b> sparseArray = new SparseArray<>();
            f14302a = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar20);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar17);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar19);
        }

        /* access modifiers changed from: public */
        C2535b(int i) {
            this.f14325n = i;
        }

        @ts2
        /* renamed from: a */
        public static C2535b m18715a(int i) {
            return f14302a.get(i);
        }

        /* renamed from: b */
        public int mo18522b() {
            return this.f14325n;
        }
    }

    /* renamed from: com.onedelhi.secure.jo2$c */
    public enum C2536c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: a */
        public static final SparseArray<C2536c> f14326a = null;

        /* renamed from: n */
        public final int f14347n;

        /* access modifiers changed from: public */
        static {
            C2536c cVar;
            C2536c cVar2;
            C2536c cVar3;
            C2536c cVar4;
            C2536c cVar5;
            C2536c cVar6;
            C2536c cVar7;
            C2536c cVar8;
            C2536c cVar9;
            C2536c cVar10;
            C2536c cVar11;
            C2536c cVar12;
            C2536c cVar13;
            C2536c cVar14;
            C2536c cVar15;
            C2536c cVar16;
            C2536c cVar17;
            C2536c cVar18;
            C2536c cVar19;
            SparseArray<C2536c> sparseArray = new SparseArray<>();
            f14326a = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar19);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar14);
            sparseArray.put(15, cVar15);
            sparseArray.put(16, cVar16);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar17);
        }

        /* access modifiers changed from: public */
        C2536c(int i) {
            this.f14347n = i;
        }

        @ts2
        /* renamed from: a */
        public static C2536c m18717a(int i) {
            return f14326a.get(i);
        }

        /* renamed from: b */
        public int mo18523b() {
            return this.f14347n;
        }
    }

    @mr2
    /* renamed from: a */
    public static C2534a m18709a() {
        return new C1972dh.C1974b();
    }

    @ts2
    /* renamed from: b */
    public abstract C2535b mo14646b();

    @ts2
    /* renamed from: c */
    public abstract C2536c mo14647c();
}
