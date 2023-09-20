package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class h13 extends qe1<h13, C5473c> implements i13 {
    /* access modifiers changed from: private */
    public static final h13 DEFAULT_INSTANCE;
    private static volatile cz2<h13> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final vs1.C7086h.C7087a<Integer, zu3> sessionVerbosity_converter_ = new C5471a();
    private int bitField0_;
    private String sessionId_ = "";
    private vs1.C7085g sessionVerbosity_ = qe1.m62497nj();

    /* renamed from: com.onedelhi.secure.h13$a */
    public class C5471a implements vs1.C7086h.C7087a<Integer, zu3> {
        /* renamed from: b */
        public zu3 mo37131a(Integer num) {
            zu3 a = zu3.m74329a(num.intValue());
            return a == null ? zu3.SESSION_VERBOSITY_NONE : a;
        }
    }

    /* renamed from: com.onedelhi.secure.h13$b */
    public static /* synthetic */ class C5472b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29390a;

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
                f29390a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29390a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29390a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29390a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29390a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29390a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29390a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h13.C5472b.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.h13$c */
    public static final class C5473c extends qe1.C6546b<h13, C5473c> implements i13 {
        public C5473c() {
            super(h13.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5473c(C5471a aVar) {
            this();
        }

        /* renamed from: C0 */
        public String mo37117C0() {
            return ((h13) this.f34068b).mo37117C0();
        }

        /* renamed from: Gj */
        public C5473c mo37133Gj(Iterable<? extends zu3> iterable) {
            mo43393xj();
            ((h13) this.f34068b).mo37124nk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5473c mo37134Hj(zu3 zu3) {
            mo43393xj();
            ((h13) this.f34068b).mo37125ok(zu3);
            return this;
        }

        /* renamed from: Ij */
        public C5473c mo37135Ij() {
            mo43393xj();
            ((h13) this.f34068b).mo37126pk();
            return this;
        }

        /* renamed from: Jj */
        public C5473c mo37136Jj() {
            mo43393xj();
            ((h13) this.f34068b).mo37128qk();
            return this;
        }

        /* renamed from: Kj */
        public C5473c mo37137Kj(String str) {
            mo43393xj();
            ((h13) this.f34068b).mo37118Ik(str);
            return this;
        }

        /* renamed from: Lj */
        public C5473c mo37138Lj(C5173er erVar) {
            mo43393xj();
            ((h13) this.f34068b).mo37119Jk(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C5473c mo37139Mj(int i, zu3 zu3) {
            mo43393xj();
            ((h13) this.f34068b).mo37120Kk(i, zu3);
            return this;
        }

        /* renamed from: R0 */
        public boolean mo37121R0() {
            return ((h13) this.f34068b).mo37121R0();
        }

        /* renamed from: Te */
        public int mo37122Te() {
            return ((h13) this.f34068b).mo37122Te();
        }

        /* renamed from: j4 */
        public zu3 mo37123j4(int i) {
            return ((h13) this.f34068b).mo37123j4(i);
        }

        /* renamed from: q1 */
        public C5173er mo37127q1() {
            return ((h13) this.f34068b).mo37127q1();
        }

        /* renamed from: ti */
        public List<zu3> mo37130ti() {
            return ((h13) this.f34068b).mo37130ti();
        }
    }

    static {
        h13 h13 = new h13();
        DEFAULT_INSTANCE = h13;
        qe1.m62492dk(h13.class, h13);
    }

    /* renamed from: Ak */
    public static h13 m50111Ak(g00 g00, zy0 zy0) throws IOException {
        return (h13) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Bk */
    public static h13 m50112Bk(InputStream inputStream) throws IOException {
        return (h13) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ck */
    public static h13 m50113Ck(InputStream inputStream, zy0 zy0) throws IOException {
        return (h13) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Dk */
    public static h13 m50114Dk(ByteBuffer byteBuffer) throws nt1 {
        return (h13) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public static h13 m50115Ek(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (h13) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Fk */
    public static h13 m50116Fk(byte[] bArr) throws nt1 {
        return (h13) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Gk */
    public static h13 m50117Gk(byte[] bArr, zy0 zy0) throws nt1 {
        return (h13) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Hk */
    public static cz2<h13> m50118Hk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: sk */
    public static h13 m50127sk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: tk */
    public static C5473c m50128tk() {
        return (C5473c) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: uk */
    public static C5473c m50129uk(h13 h13) {
        return (C5473c) DEFAULT_INSTANCE.mo43358gj(h13);
    }

    /* renamed from: vk */
    public static h13 m50130vk(InputStream inputStream) throws IOException {
        return (h13) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static h13 m50131wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (h13) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static h13 m50132xk(C5173er erVar) throws nt1 {
        return (h13) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: yk */
    public static h13 m50133yk(C5173er erVar, zy0 zy0) throws nt1 {
        return (h13) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: zk */
    public static h13 m50134zk(g00 g00) throws IOException {
        return (h13) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: C0 */
    public String mo37117C0() {
        return this.sessionId_;
    }

    /* renamed from: Ik */
    public final void mo37118Ik(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* renamed from: Jk */
    public final void mo37119Jk(C5173er erVar) {
        this.sessionId_ = erVar.mo35543k0();
        this.bitField0_ |= 1;
    }

    /* renamed from: Kk */
    public final void mo37120Kk(int i, zu3 zu3) {
        zu3.getClass();
        mo37129rk();
        this.sessionVerbosity_.mo31133f1(i, zu3.mo32392j());
    }

    /* renamed from: R0 */
    public boolean mo37121R0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: Te */
    public int mo37122Te() {
        return this.sessionVerbosity_.size();
    }

    /* renamed from: j4 */
    public zu3 mo37123j4(int i) {
        return sessionVerbosity_converter_.mo37131a(Integer.valueOf(this.sessionVerbosity_.getInt(i)));
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5472b.f29390a[iVar.ordinal()]) {
            case 1:
                return new h13();
            case 2:
                return new C5473c((C5471a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", zu3.m74331e()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<h13> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (h13.class) {
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

    /* renamed from: nk */
    public final void mo37124nk(Iterable<? extends zu3> iterable) {
        mo37129rk();
        for (zu3 j : iterable) {
            this.sessionVerbosity_.mo31124G0(j.mo32392j());
        }
    }

    /* renamed from: ok */
    public final void mo37125ok(zu3 zu3) {
        zu3.getClass();
        mo37129rk();
        this.sessionVerbosity_.mo31124G0(zu3.mo32392j());
    }

    /* renamed from: pk */
    public final void mo37126pk() {
        this.bitField0_ &= -2;
        this.sessionId_ = m50127sk().mo37117C0();
    }

    /* renamed from: q1 */
    public C5173er mo37127q1() {
        return C5173er.m47136w(this.sessionId_);
    }

    /* renamed from: qk */
    public final void mo37128qk() {
        this.sessionVerbosity_ = qe1.m62497nj();
    }

    /* renamed from: rk */
    public final void mo37129rk() {
        vs1.C7085g gVar = this.sessionVerbosity_;
        if (!gVar.mo36500p()) {
            this.sessionVerbosity_ = qe1.m62466Dj(gVar);
        }
    }

    /* renamed from: ti */
    public List<zu3> mo37130ti() {
        return new vs1.C7086h(this.sessionVerbosity_, sessionVerbosity_converter_);
    }
}
