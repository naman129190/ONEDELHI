package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class jj3 extends qe1<jj3, C5824b> implements kj3 {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final jj3 DEFAULT_INSTANCE;
    private static volatile cz2<jj3> PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    /* renamed from: com.onedelhi.secure.jj3$a */
    public static /* synthetic */ class C5823a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30846a;

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
                f30846a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30846a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30846a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30846a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30846a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30846a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30846a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jj3.C5823a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.jj3$b */
    public static final class C5824b extends qe1.C6546b<jj3, C5824b> implements kj3 {
        public C5824b() {
            super(jj3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5824b(C5823a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5824b mo38694Gj() {
            mo43393xj();
            ((jj3) this.f34068b).mo38691mk();
            return this;
        }

        /* renamed from: Hj */
        public C5824b mo38695Hj() {
            mo43393xj();
            ((jj3) this.f34068b).mo38692nk();
            return this;
        }

        /* renamed from: Ij */
        public C5824b mo38696Ij(String str) {
            mo43393xj();
            ((jj3) this.f34068b).mo38684Ek(str);
            return this;
        }

        /* renamed from: Jb */
        public C5173er mo38688Jb() {
            return ((jj3) this.f34068b).mo38688Jb();
        }

        /* renamed from: Jj */
        public C5824b mo38697Jj(C5173er erVar) {
            mo43393xj();
            ((jj3) this.f34068b).mo38685Fk(erVar);
            return this;
        }

        /* renamed from: Kj */
        public C5824b mo38698Kj(String str) {
            mo43393xj();
            ((jj3) this.f34068b).mo38686Gk(str);
            return this;
        }

        /* renamed from: Lj */
        public C5824b mo38699Lj(C5173er erVar) {
            mo43393xj();
            ((jj3) this.f34068b).mo38687Hk(erVar);
            return this;
        }

        /* renamed from: Xi */
        public C5173er mo38689Xi() {
            return ((jj3) this.f34068b).mo38689Xi();
        }

        /* renamed from: id */
        public String mo38690id() {
            return ((jj3) this.f34068b).mo38690id();
        }

        /* renamed from: u7 */
        public String mo38693u7() {
            return ((jj3) this.f34068b).mo38693u7();
        }
    }

    static {
        jj3 jj3 = new jj3();
        DEFAULT_INSTANCE = jj3;
        qe1.m62492dk(jj3.class, jj3);
    }

    /* renamed from: Ak */
    public static jj3 m53409Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (jj3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static jj3 m53410Bk(byte[] bArr) throws nt1 {
        return (jj3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static jj3 m53411Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (jj3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<jj3> m53412Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: ok */
    public static jj3 m53420ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C5824b m53421pk() {
        return (C5824b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C5824b m53422qk(jj3 jj3) {
        return (C5824b) DEFAULT_INSTANCE.mo43358gj(jj3);
    }

    /* renamed from: rk */
    public static jj3 m53423rk(InputStream inputStream) throws IOException {
        return (jj3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static jj3 m53424sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (jj3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static jj3 m53425tk(C5173er erVar) throws nt1 {
        return (jj3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static jj3 m53426uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (jj3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static jj3 m53427vk(g00 g00) throws IOException {
        return (jj3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static jj3 m53428wk(g00 g00, zy0 zy0) throws IOException {
        return (jj3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static jj3 m53429xk(InputStream inputStream) throws IOException {
        return (jj3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static jj3 m53430yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (jj3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static jj3 m53431zk(ByteBuffer byteBuffer) throws nt1 {
        return (jj3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public final void mo38684Ek(String str) {
        str.getClass();
        this.callerIp_ = str;
    }

    /* renamed from: Fk */
    public final void mo38685Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.callerIp_ = erVar.mo35543k0();
    }

    /* renamed from: Gk */
    public final void mo38686Gk(String str) {
        str.getClass();
        this.callerSuppliedUserAgent_ = str;
    }

    /* renamed from: Hk */
    public final void mo38687Hk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.callerSuppliedUserAgent_ = erVar.mo35543k0();
    }

    /* renamed from: Jb */
    public C5173er mo38688Jb() {
        return C5173er.m47136w(this.callerSuppliedUserAgent_);
    }

    /* renamed from: Xi */
    public C5173er mo38689Xi() {
        return C5173er.m47136w(this.callerIp_);
    }

    /* renamed from: id */
    public String mo38690id() {
        return this.callerSuppliedUserAgent_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5823a.f30846a[iVar.ordinal()]) {
            case 1:
                return new jj3();
            case 2:
                return new C5824b((C5823a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<jj3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (jj3.class) {
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

    /* renamed from: mk */
    public final void mo38691mk() {
        this.callerIp_ = m53420ok().mo38693u7();
    }

    /* renamed from: nk */
    public final void mo38692nk() {
        this.callerSuppliedUserAgent_ = m53420ok().mo38690id();
    }

    /* renamed from: u7 */
    public String mo38693u7() {
        return this.callerIp_;
    }
}
