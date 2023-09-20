package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.sp4;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class pp4 extends qe1<pp4, C6469b> implements qp4 {
    /* access modifiers changed from: private */
    public static final pp4 DEFAULT_INSTANCE;
    private static volatile cz2<pp4> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private String producerNotificationChannel_ = "";
    private vs1.C7095k<String> requirements_ = qe1.m62499pj();
    private vs1.C7095k<sp4> rules_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.pp4$a */
    public static /* synthetic */ class C6468a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33755a;

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
                f33755a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pp4.C6468a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.pp4$b */
    public static final class C6469b extends qe1.C6546b<pp4, C6469b> implements qp4 {
        public C6469b() {
            super(pp4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6469b(C6468a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6469b mo42866Gj(Iterable<String> iterable) {
            mo43393xj();
            ((pp4) this.f34068b).mo42858uk(iterable);
            return this;
        }

        /* renamed from: Hb */
        public String mo42845Hb() {
            return ((pp4) this.f34068b).mo42845Hb();
        }

        /* renamed from: Hj */
        public C6469b mo42867Hj(Iterable<? extends sp4> iterable) {
            mo43393xj();
            ((pp4) this.f34068b).mo42859vk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C6469b mo42868Ij(String str) {
            mo43393xj();
            ((pp4) this.f34068b).mo42861wk(str);
            return this;
        }

        /* renamed from: Jj */
        public C6469b mo42869Jj(C5173er erVar) {
            mo43393xj();
            ((pp4) this.f34068b).mo42862xk(erVar);
            return this;
        }

        /* renamed from: Kj */
        public C6469b mo42870Kj(int i, sp4.C6787b bVar) {
            mo43393xj();
            ((pp4) this.f34068b).mo42863yk(i, (sp4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C6469b mo42871Lj(int i, sp4 sp4) {
            mo43393xj();
            ((pp4) this.f34068b).mo42863yk(i, sp4);
            return this;
        }

        /* renamed from: Mj */
        public C6469b mo42872Mj(sp4.C6787b bVar) {
            mo43393xj();
            ((pp4) this.f34068b).mo42865zk((sp4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C6469b mo42873Nj(sp4 sp4) {
            mo43393xj();
            ((pp4) this.f34068b).mo42865zk(sp4);
            return this;
        }

        /* renamed from: Oj */
        public C6469b mo42874Oj() {
            mo43393xj();
            ((pp4) this.f34068b).mo42839Ak();
            return this;
        }

        /* renamed from: Pj */
        public C6469b mo42875Pj() {
            mo43393xj();
            ((pp4) this.f34068b).mo42840Bk();
            return this;
        }

        /* renamed from: Qj */
        public C6469b mo42876Qj() {
            mo43393xj();
            ((pp4) this.f34068b).mo42841Ck();
            return this;
        }

        /* renamed from: Rj */
        public C6469b mo42877Rj(int i) {
            mo43393xj();
            ((pp4) this.f34068b).mo42848Xk(i);
            return this;
        }

        /* renamed from: Sj */
        public C6469b mo42878Sj(String str) {
            mo43393xj();
            ((pp4) this.f34068b).mo42849Yk(str);
            return this;
        }

        /* renamed from: Tj */
        public C6469b mo42879Tj(C5173er erVar) {
            mo43393xj();
            ((pp4) this.f34068b).mo42850Zk(erVar);
            return this;
        }

        /* renamed from: Uj */
        public C6469b mo42880Uj(int i, String str) {
            mo43393xj();
            ((pp4) this.f34068b).mo42852al(i, str);
            return this;
        }

        /* renamed from: Vj */
        public C6469b mo42881Vj(int i, sp4.C6787b bVar) {
            mo43393xj();
            ((pp4) this.f34068b).mo42853bl(i, (sp4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Wj */
        public C6469b mo42882Wj(int i, sp4 sp4) {
            mo43393xj();
            ((pp4) this.f34068b).mo42853bl(i, sp4);
            return this;
        }

        /* renamed from: X0 */
        public List<String> mo42847X0() {
            return Collections.unmodifiableList(((pp4) this.f34068b).mo42847X0());
        }

        /* renamed from: a7 */
        public C5173er mo42851a7() {
            return ((pp4) this.f34068b).mo42851a7();
        }

        /* renamed from: dd */
        public sp4 mo42854dd(int i) {
            return ((pp4) this.f34068b).mo42854dd(i);
        }

        /* renamed from: o */
        public List<sp4> mo42855o() {
            return Collections.unmodifiableList(((pp4) this.f34068b).mo42855o());
        }

        /* renamed from: q */
        public int mo42856q() {
            return ((pp4) this.f34068b).mo42856q();
        }

        /* renamed from: u8 */
        public String mo42857u8(int i) {
            return ((pp4) this.f34068b).mo42857u8(i);
        }

        /* renamed from: wf */
        public C5173er mo42860wf(int i) {
            return ((pp4) this.f34068b).mo42860wf(i);
        }

        /* renamed from: z0 */
        public int mo42864z0() {
            return ((pp4) this.f34068b).mo42864z0();
        }
    }

    static {
        pp4 pp4 = new pp4();
        DEFAULT_INSTANCE = pp4;
        qe1.m62492dk(pp4.class, pp4);
    }

    /* renamed from: Fk */
    public static pp4 m61539Fk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ik */
    public static C6469b m61540Ik() {
        return (C6469b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Jk */
    public static C6469b m61541Jk(pp4 pp4) {
        return (C6469b) DEFAULT_INSTANCE.mo43358gj(pp4);
    }

    /* renamed from: Kk */
    public static pp4 m61542Kk(InputStream inputStream) throws IOException {
        return (pp4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Lk */
    public static pp4 m61543Lk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pp4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Mk */
    public static pp4 m61544Mk(C5173er erVar) throws nt1 {
        return (pp4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Nk */
    public static pp4 m61545Nk(C5173er erVar, zy0 zy0) throws nt1 {
        return (pp4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Ok */
    public static pp4 m61546Ok(g00 g00) throws IOException {
        return (pp4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Pk */
    public static pp4 m61547Pk(g00 g00, zy0 zy0) throws IOException {
        return (pp4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Qk */
    public static pp4 m61548Qk(InputStream inputStream) throws IOException {
        return (pp4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Rk */
    public static pp4 m61549Rk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pp4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Sk */
    public static pp4 m61550Sk(ByteBuffer byteBuffer) throws nt1 {
        return (pp4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Tk */
    public static pp4 m61551Tk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (pp4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Uk */
    public static pp4 m61552Uk(byte[] bArr) throws nt1 {
        return (pp4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Vk */
    public static pp4 m61553Vk(byte[] bArr, zy0 zy0) throws nt1 {
        return (pp4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Wk */
    public static cz2<pp4> m61554Wk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo42839Ak() {
        this.producerNotificationChannel_ = m61539Fk().mo42845Hb();
    }

    /* renamed from: Bk */
    public final void mo42840Bk() {
        this.requirements_ = qe1.m62499pj();
    }

    /* renamed from: Ck */
    public final void mo42841Ck() {
        this.rules_ = qe1.m62499pj();
    }

    /* renamed from: Dk */
    public final void mo42842Dk() {
        vs1.C7095k<String> kVar = this.requirements_;
        if (!kVar.mo36500p()) {
            this.requirements_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Ek */
    public final void mo42843Ek() {
        vs1.C7095k<sp4> kVar = this.rules_;
        if (!kVar.mo36500p()) {
            this.rules_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Gk */
    public tp4 mo42844Gk(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: Hb */
    public String mo42845Hb() {
        return this.producerNotificationChannel_;
    }

    /* renamed from: Hk */
    public List<? extends tp4> mo42846Hk() {
        return this.rules_;
    }

    /* renamed from: X0 */
    public List<String> mo42847X0() {
        return this.requirements_;
    }

    /* renamed from: Xk */
    public final void mo42848Xk(int i) {
        mo42843Ek();
        this.rules_.remove(i);
    }

    /* renamed from: Yk */
    public final void mo42849Yk(String str) {
        str.getClass();
        this.producerNotificationChannel_ = str;
    }

    /* renamed from: Zk */
    public final void mo42850Zk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.producerNotificationChannel_ = erVar.mo35543k0();
    }

    /* renamed from: a7 */
    public C5173er mo42851a7() {
        return C5173er.m47136w(this.producerNotificationChannel_);
    }

    /* renamed from: al */
    public final void mo42852al(int i, String str) {
        str.getClass();
        mo42842Dk();
        this.requirements_.set(i, str);
    }

    /* renamed from: bl */
    public final void mo42853bl(int i, sp4 sp4) {
        sp4.getClass();
        mo42843Ek();
        this.rules_.set(i, sp4);
    }

    /* renamed from: dd */
    public sp4 mo42854dd(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6468a.f33755a[iVar.ordinal()]) {
            case 1:
                return new pp4();
            case 2:
                return new C6469b((C6468a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", sp4.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<pp4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (pp4.class) {
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

    /* renamed from: o */
    public List<sp4> mo42855o() {
        return this.rules_;
    }

    /* renamed from: q */
    public int mo42856q() {
        return this.rules_.size();
    }

    /* renamed from: u8 */
    public String mo42857u8(int i) {
        return this.requirements_.get(i);
    }

    /* renamed from: uk */
    public final void mo42858uk(Iterable<String> iterable) {
        mo42842Dk();
        C7403z0.m72412X6(iterable, this.requirements_);
    }

    /* renamed from: vk */
    public final void mo42859vk(Iterable<? extends sp4> iterable) {
        mo42843Ek();
        C7403z0.m72412X6(iterable, this.rules_);
    }

    /* renamed from: wf */
    public C5173er mo42860wf(int i) {
        return C5173er.m47136w(this.requirements_.get(i));
    }

    /* renamed from: wk */
    public final void mo42861wk(String str) {
        str.getClass();
        mo42842Dk();
        this.requirements_.add(str);
    }

    /* renamed from: xk */
    public final void mo42862xk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo42842Dk();
        this.requirements_.add(erVar.mo35543k0());
    }

    /* renamed from: yk */
    public final void mo42863yk(int i, sp4 sp4) {
        sp4.getClass();
        mo42843Ek();
        this.rules_.add(i, sp4);
    }

    /* renamed from: z0 */
    public int mo42864z0() {
        return this.requirements_.size();
    }

    /* renamed from: zk */
    public final void mo42865zk(sp4 sp4) {
        sp4.getClass();
        mo42843Ek();
        this.rules_.add(sp4);
    }
}
