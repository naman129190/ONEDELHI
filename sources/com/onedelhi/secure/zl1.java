package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.zm1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class zl1 extends qe1<zl1, C7501b> implements sm1 {
    /* access modifiers changed from: private */
    public static final zl1 DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile cz2<zl1> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private vs1.C7095k<zm1> rules_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.zl1$a */
    public static /* synthetic */ class C7500a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38360a;

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
                f38360a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38360a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38360a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38360a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38360a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38360a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38360a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zl1.C7500a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.zl1$b */
    public static final class C7501b extends qe1.C6546b<zl1, C7501b> implements sm1 {
        public C7501b() {
            super(zl1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7501b(C7500a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7501b mo48300Gj(Iterable<? extends zm1> iterable) {
            mo43393xj();
            ((zl1) this.f34068b).mo48292ok(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7501b mo48301Hj(int i, zm1.C7505b bVar) {
            mo43393xj();
            ((zl1) this.f34068b).mo48293pk(i, (zm1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C7501b mo48302Ij(int i, zm1 zm1) {
            mo43393xj();
            ((zl1) this.f34068b).mo48293pk(i, zm1);
            return this;
        }

        /* renamed from: Jj */
        public C7501b mo48303Jj(zm1.C7505b bVar) {
            mo43393xj();
            ((zl1) this.f34068b).mo48294qk((zm1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C7501b mo48304Kj(zm1 zm1) {
            mo43393xj();
            ((zl1) this.f34068b).mo48294qk(zm1);
            return this;
        }

        /* renamed from: Lj */
        public C7501b mo48305Lj() {
            mo43393xj();
            ((zl1) this.f34068b).mo48295rk();
            return this;
        }

        /* renamed from: Mj */
        public C7501b mo48306Mj() {
            mo43393xj();
            ((zl1) this.f34068b).mo48296sk();
            return this;
        }

        /* renamed from: Nj */
        public C7501b mo48307Nj(int i) {
            mo43393xj();
            ((zl1) this.f34068b).mo48289Mk(i);
            return this;
        }

        /* renamed from: Oj */
        public C7501b mo48308Oj(boolean z) {
            mo43393xj();
            ((zl1) this.f34068b).mo48290Nk(z);
            return this;
        }

        /* renamed from: Pj */
        public C7501b mo48309Pj(int i, zm1.C7505b bVar) {
            mo43393xj();
            ((zl1) this.f34068b).mo48291Ok(i, (zm1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Qj */
        public C7501b mo48310Qj(int i, zm1 zm1) {
            mo43393xj();
            ((zl1) this.f34068b).mo48291Ok(i, zm1);
            return this;
        }

        /* renamed from: R5 */
        public zm1 mo44416R5(int i) {
            return ((zl1) this.f34068b).mo44416R5(i);
        }

        /* renamed from: o */
        public List<zm1> mo44417o() {
            return Collections.unmodifiableList(((zl1) this.f34068b).mo44417o());
        }

        /* renamed from: q */
        public int mo44418q() {
            return ((zl1) this.f34068b).mo44418q();
        }

        /* renamed from: xc */
        public boolean mo44419xc() {
            return ((zl1) this.f34068b).mo44419xc();
        }
    }

    static {
        zl1 zl1 = new zl1();
        DEFAULT_INSTANCE = zl1;
        qe1.m62492dk(zl1.class, zl1);
    }

    /* renamed from: Ak */
    public static zl1 m73932Ak(InputStream inputStream, zy0 zy0) throws IOException {
        return (zl1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Bk */
    public static zl1 m73933Bk(C5173er erVar) throws nt1 {
        return (zl1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Ck */
    public static zl1 m73934Ck(C5173er erVar, zy0 zy0) throws nt1 {
        return (zl1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Dk */
    public static zl1 m73935Dk(g00 g00) throws IOException {
        return (zl1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ek */
    public static zl1 m73936Ek(g00 g00, zy0 zy0) throws IOException {
        return (zl1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Fk */
    public static zl1 m73937Fk(InputStream inputStream) throws IOException {
        return (zl1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Gk */
    public static zl1 m73938Gk(InputStream inputStream, zy0 zy0) throws IOException {
        return (zl1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Hk */
    public static zl1 m73939Hk(ByteBuffer byteBuffer) throws nt1 {
        return (zl1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ik */
    public static zl1 m73940Ik(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (zl1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Jk */
    public static zl1 m73941Jk(byte[] bArr) throws nt1 {
        return (zl1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Kk */
    public static zl1 m73942Kk(byte[] bArr, zy0 zy0) throws nt1 {
        return (zl1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Lk */
    public static cz2<zl1> m73943Lk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: uk */
    public static zl1 m73953uk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: xk */
    public static C7501b m73954xk() {
        return (C7501b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: yk */
    public static C7501b m73955yk(zl1 zl1) {
        return (C7501b) DEFAULT_INSTANCE.mo43358gj(zl1);
    }

    /* renamed from: zk */
    public static zl1 m73956zk(InputStream inputStream) throws IOException {
        return (zl1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Mk */
    public final void mo48289Mk(int i) {
        mo48297tk();
        this.rules_.remove(i);
    }

    /* renamed from: Nk */
    public final void mo48290Nk(boolean z) {
        this.fullyDecodeReservedExpansion_ = z;
    }

    /* renamed from: Ok */
    public final void mo48291Ok(int i, zm1 zm1) {
        zm1.getClass();
        mo48297tk();
        this.rules_.set(i, zm1);
    }

    /* renamed from: R5 */
    public zm1 mo44416R5(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7500a.f38360a[iVar.ordinal()]) {
            case 1:
                return new zl1();
            case 2:
                return new C7501b((C7500a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"rules_", zm1.class, "fullyDecodeReservedExpansion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<zl1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (zl1.class) {
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
    public List<zm1> mo44417o() {
        return this.rules_;
    }

    /* renamed from: ok */
    public final void mo48292ok(Iterable<? extends zm1> iterable) {
        mo48297tk();
        C7403z0.m72412X6(iterable, this.rules_);
    }

    /* renamed from: pk */
    public final void mo48293pk(int i, zm1 zm1) {
        zm1.getClass();
        mo48297tk();
        this.rules_.add(i, zm1);
    }

    /* renamed from: q */
    public int mo44418q() {
        return this.rules_.size();
    }

    /* renamed from: qk */
    public final void mo48294qk(zm1 zm1) {
        zm1.getClass();
        mo48297tk();
        this.rules_.add(zm1);
    }

    /* renamed from: rk */
    public final void mo48295rk() {
        this.fullyDecodeReservedExpansion_ = false;
    }

    /* renamed from: sk */
    public final void mo48296sk() {
        this.rules_ = qe1.m62499pj();
    }

    /* renamed from: tk */
    public final void mo48297tk() {
        vs1.C7095k<zm1> kVar = this.rules_;
        if (!kVar.mo36500p()) {
            this.rules_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: vk */
    public an1 mo48298vk(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: wk */
    public List<? extends an1> mo48299wk() {
        return this.rules_;
    }

    /* renamed from: xc */
    public boolean mo44419xc() {
        return this.fullyDecodeReservedExpansion_;
    }
}
