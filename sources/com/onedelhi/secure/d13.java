package com.onedelhi.secure;

import com.onedelhi.secure.C5978l9;
import com.onedelhi.secure.ci4;
import com.onedelhi.secure.eg4;
import com.onedelhi.secure.no2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.yd1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class d13 extends qe1<d13, C4947b> implements e13 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final d13 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile cz2<d13> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C5978l9 applicationInfo_;
    private int bitField0_;
    private yd1 gaugeMetric_;
    private no2 networkRequestMetric_;
    private eg4 traceMetric_;
    private ci4 transportInfo_;

    /* renamed from: com.onedelhi.secure.d13$a */
    public static /* synthetic */ class C4946a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27181a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.qe1$i[] r0 = com.onedelhi.secure.qe1.C6554i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27181a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27181a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27181a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27181a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27181a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27181a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27181a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d13.C4946a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.d13$b */
    public static final class C4947b extends qe1.C6546b<d13, C4947b> implements e13 {
        public C4947b() {
            super(d13.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4947b(C4946a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C4947b mo34090Gj() {
            mo43393xj();
            ((d13) this.f34068b).mo34084vk();
            return this;
        }

        /* renamed from: Hj */
        public C4947b mo34091Hj() {
            mo43393xj();
            ((d13) this.f34068b).mo34085wk();
            return this;
        }

        /* renamed from: Ij */
        public C4947b mo34092Ij() {
            mo43393xj();
            ((d13) this.f34068b).mo34087xk();
            return this;
        }

        /* renamed from: Jj */
        public C4947b mo34093Jj() {
            mo43393xj();
            ((d13) this.f34068b).mo34088yk();
            return this;
        }

        /* renamed from: Kj */
        public C4947b mo34094Kj() {
            mo43393xj();
            ((d13) this.f34068b).mo34089zk();
            return this;
        }

        /* renamed from: Lj */
        public C4947b mo34095Lj(C5978l9 l9Var) {
            mo43393xj();
            ((d13) this.f34068b).mo34065Bk(l9Var);
            return this;
        }

        /* renamed from: Mj */
        public C4947b mo34096Mj(yd1 yd1) {
            mo43393xj();
            ((d13) this.f34068b).mo34066Ck(yd1);
            return this;
        }

        /* renamed from: Nj */
        public C4947b mo34097Nj(no2 no2) {
            mo43393xj();
            ((d13) this.f34068b).mo34067Dk(no2);
            return this;
        }

        /* renamed from: Oj */
        public C4947b mo34098Oj(eg4 eg4) {
            mo43393xj();
            ((d13) this.f34068b).mo34068Ek(eg4);
            return this;
        }

        /* renamed from: Pj */
        public C4947b mo34099Pj(ci4 ci4) {
            mo43393xj();
            ((d13) this.f34068b).mo34069Fk(ci4);
            return this;
        }

        /* renamed from: Qj */
        public C4947b mo34100Qj(C5978l9.C5980b bVar) {
            mo43393xj();
            ((d13) this.f34068b).mo34071Vk((C5978l9) bVar.mo43381ab());
            return this;
        }

        /* renamed from: R7 */
        public boolean mo34070R7() {
            return ((d13) this.f34068b).mo34070R7();
        }

        /* renamed from: Rj */
        public C4947b mo34101Rj(C5978l9 l9Var) {
            mo43393xj();
            ((d13) this.f34068b).mo34071Vk(l9Var);
            return this;
        }

        /* renamed from: Sj */
        public C4947b mo34102Sj(yd1.C7329b bVar) {
            mo43393xj();
            ((d13) this.f34068b).mo34072Wk((yd1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Tj */
        public C4947b mo34103Tj(yd1 yd1) {
            mo43393xj();
            ((d13) this.f34068b).mo34072Wk(yd1);
            return this;
        }

        /* renamed from: Uj */
        public C4947b mo34104Uj(no2.C6210b bVar) {
            mo43393xj();
            ((d13) this.f34068b).mo34073Xk((no2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Vj */
        public C4947b mo34105Vj(no2 no2) {
            mo43393xj();
            ((d13) this.f34068b).mo34073Xk(no2);
            return this;
        }

        /* renamed from: Wj */
        public C4947b mo34106Wj(eg4.C5143b bVar) {
            mo43393xj();
            ((d13) this.f34068b).mo34074Yk((eg4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Xj */
        public C4947b mo34107Xj(eg4 eg4) {
            mo43393xj();
            ((d13) this.f34068b).mo34074Yk(eg4);
            return this;
        }

        /* renamed from: Yj */
        public C4947b mo34108Yj(ci4.C4770b bVar) {
            mo43393xj();
            ((d13) this.f34068b).mo34075Zk((ci4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Zj */
        public C4947b mo34109Zj(ci4 ci4) {
            mo43393xj();
            ((d13) this.f34068b).mo34075Zk(ci4);
            return this;
        }

        /* renamed from: bd */
        public boolean mo34076bd() {
            return ((d13) this.f34068b).mo34076bd();
        }

        /* renamed from: f5 */
        public eg4 mo34077f5() {
            return ((d13) this.f34068b).mo34077f5();
        }

        /* renamed from: h8 */
        public yd1 mo34078h8() {
            return ((d13) this.f34068b).mo34078h8();
        }

        /* renamed from: jc */
        public boolean mo34079jc() {
            return ((d13) this.f34068b).mo34079jc();
        }

        /* renamed from: ng */
        public no2 mo34080ng() {
            return ((d13) this.f34068b).mo34080ng();
        }

        /* renamed from: of */
        public ci4 mo34081of() {
            return ((d13) this.f34068b).mo34081of();
        }

        /* renamed from: r5 */
        public boolean mo34082r5() {
            return ((d13) this.f34068b).mo34082r5();
        }

        /* renamed from: t3 */
        public boolean mo34083t3() {
            return ((d13) this.f34068b).mo34083t3();
        }

        /* renamed from: xb */
        public C5978l9 mo34086xb() {
            return ((d13) this.f34068b).mo34086xb();
        }
    }

    static {
        d13 d13 = new d13();
        DEFAULT_INSTANCE = d13;
        qe1.m62492dk(d13.class, d13);
    }

    /* renamed from: Ak */
    public static d13 m44436Ak() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Gk */
    public static C4947b m44437Gk() {
        return (C4947b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Hk */
    public static C4947b m44438Hk(d13 d13) {
        return (C4947b) DEFAULT_INSTANCE.mo43358gj(d13);
    }

    /* renamed from: Ik */
    public static d13 m44439Ik(InputStream inputStream) throws IOException {
        return (d13) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Jk */
    public static d13 m44440Jk(InputStream inputStream, zy0 zy0) throws IOException {
        return (d13) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Kk */
    public static d13 m44441Kk(C5173er erVar) throws nt1 {
        return (d13) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Lk */
    public static d13 m44442Lk(C5173er erVar, zy0 zy0) throws nt1 {
        return (d13) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Mk */
    public static d13 m44443Mk(g00 g00) throws IOException {
        return (d13) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Nk */
    public static d13 m44444Nk(g00 g00, zy0 zy0) throws IOException {
        return (d13) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ok */
    public static d13 m44445Ok(InputStream inputStream) throws IOException {
        return (d13) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Pk */
    public static d13 m44446Pk(InputStream inputStream, zy0 zy0) throws IOException {
        return (d13) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Qk */
    public static d13 m44447Qk(ByteBuffer byteBuffer) throws nt1 {
        return (d13) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Rk */
    public static d13 m44448Rk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (d13) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Sk */
    public static d13 m44449Sk(byte[] bArr) throws nt1 {
        return (d13) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Tk */
    public static d13 m44450Tk(byte[] bArr, zy0 zy0) throws nt1 {
        return (d13) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Uk */
    public static cz2<d13> m44451Uk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Bk */
    public final void mo34065Bk(C5978l9 l9Var) {
        l9Var.getClass();
        C5978l9 l9Var2 = this.applicationInfo_;
        if (!(l9Var2 == null || l9Var2 == C5978l9.m55414wk())) {
            l9Var = (C5978l9) ((C5978l9.C5980b) C5978l9.m55387Ck(this.applicationInfo_).mo43372Cj(l9Var)).mo43377Ja();
        }
        this.applicationInfo_ = l9Var;
        this.bitField0_ |= 1;
    }

    /* renamed from: Ck */
    public final void mo34066Ck(yd1 yd1) {
        yd1.getClass();
        yd1 yd12 = this.gaugeMetric_;
        if (!(yd12 == null || yd12 == yd1.m71572Ok())) {
            yd1 = (yd1) ((yd1.C7329b) yd1.m71574Rk(this.gaugeMetric_).mo43372Cj(yd1)).mo43377Ja();
        }
        this.gaugeMetric_ = yd1;
        this.bitField0_ |= 8;
    }

    /* renamed from: Dk */
    public final void mo34067Dk(no2 no2) {
        no2.getClass();
        no2 no22 = this.networkRequestMetric_;
        if (!(no22 == null || no22 == no2.m58453bl())) {
            no2 = (no2) ((no2.C6210b) no2.m58459il(this.networkRequestMetric_).mo43372Cj(no2)).mo43377Ja();
        }
        this.networkRequestMetric_ = no2;
        this.bitField0_ |= 4;
    }

    /* renamed from: Ek */
    public final void mo34068Ek(eg4 eg4) {
        eg4.getClass();
        eg4 eg42 = this.traceMetric_;
        if (!(eg42 == null || eg42 == eg4.m46645Rk())) {
            eg4 = (eg4) ((eg4.C5143b) eg4.m46647dl(this.traceMetric_).mo43372Cj(eg4)).mo43377Ja();
        }
        this.traceMetric_ = eg4;
        this.bitField0_ |= 2;
    }

    /* renamed from: Fk */
    public final void mo34069Fk(ci4 ci4) {
        ci4.getClass();
        ci4 ci42 = this.transportInfo_;
        if (!(ci42 == null || ci42 == ci4.m41001jk())) {
            ci4 = (ci4) ((ci4.C4770b) ci4.m41003lk(this.transportInfo_).mo43372Cj(ci4)).mo43377Ja();
        }
        this.transportInfo_ = ci4;
        this.bitField0_ |= 16;
    }

    /* renamed from: R7 */
    public boolean mo34070R7() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: Vk */
    public final void mo34071Vk(C5978l9 l9Var) {
        l9Var.getClass();
        this.applicationInfo_ = l9Var;
        this.bitField0_ |= 1;
    }

    /* renamed from: Wk */
    public final void mo34072Wk(yd1 yd1) {
        yd1.getClass();
        this.gaugeMetric_ = yd1;
        this.bitField0_ |= 8;
    }

    /* renamed from: Xk */
    public final void mo34073Xk(no2 no2) {
        no2.getClass();
        this.networkRequestMetric_ = no2;
        this.bitField0_ |= 4;
    }

    /* renamed from: Yk */
    public final void mo34074Yk(eg4 eg4) {
        eg4.getClass();
        this.traceMetric_ = eg4;
        this.bitField0_ |= 2;
    }

    /* renamed from: Zk */
    public final void mo34075Zk(ci4 ci4) {
        ci4.getClass();
        this.transportInfo_ = ci4;
        this.bitField0_ |= 16;
    }

    /* renamed from: bd */
    public boolean mo34076bd() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: f5 */
    public eg4 mo34077f5() {
        eg4 eg4 = this.traceMetric_;
        return eg4 == null ? eg4.m46645Rk() : eg4;
    }

    /* renamed from: h8 */
    public yd1 mo34078h8() {
        yd1 yd1 = this.gaugeMetric_;
        return yd1 == null ? yd1.m71572Ok() : yd1;
    }

    /* renamed from: jc */
    public boolean mo34079jc() {
        return (this.bitField0_ & 16) != 0;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4946a.f27181a[iVar.ordinal()]) {
            case 1:
                return new d13();
            case 2:
                return new C4947b((C4946a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<d13> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (d13.class) {
                        cz2 = PARSER;
                        if (cz2 == null) {
                            cz2 = new qe1.C6547c<>(DEFAULT_INSTANCE);
                            PARSER = cz2;
                        }
                    }
                }
                return cz2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ng */
    public no2 mo34080ng() {
        no2 no2 = this.networkRequestMetric_;
        return no2 == null ? no2.m58453bl() : no2;
    }

    /* renamed from: of */
    public ci4 mo34081of() {
        ci4 ci4 = this.transportInfo_;
        return ci4 == null ? ci4.m41001jk() : ci4;
    }

    /* renamed from: r5 */
    public boolean mo34082r5() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: t3 */
    public boolean mo34083t3() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: vk */
    public final void mo34084vk() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* renamed from: wk */
    public final void mo34085wk() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* renamed from: xb */
    public C5978l9 mo34086xb() {
        C5978l9 l9Var = this.applicationInfo_;
        return l9Var == null ? C5978l9.m55414wk() : l9Var;
    }

    /* renamed from: xk */
    public final void mo34087xk() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* renamed from: yk */
    public final void mo34088yk() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* renamed from: zk */
    public final void mo34089zk() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }
}
