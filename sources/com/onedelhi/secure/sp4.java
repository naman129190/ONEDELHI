package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class sp4 extends qe1<sp4, C6787b> implements tp4 {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final sp4 DEFAULT_INSTANCE;
    private static volatile cz2<sp4> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    /* renamed from: com.onedelhi.secure.sp4$a */
    public static /* synthetic */ class C6786a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35162a;

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
                f35162a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35162a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35162a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35162a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35162a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35162a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35162a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sp4.C6786a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.sp4$b */
    public static final class C6787b extends qe1.C6546b<sp4, C6787b> implements tp4 {
        public C6787b() {
            super(sp4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6787b(C6786a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6787b mo44444Gj() {
            mo43393xj();
            ((sp4) this.f34068b).mo44441nk();
            return this;
        }

        /* renamed from: Hj */
        public C6787b mo44445Hj() {
            mo43393xj();
            ((sp4) this.f34068b).mo44442ok();
            return this;
        }

        /* renamed from: Id */
        public boolean mo44435Id() {
            return ((sp4) this.f34068b).mo44435Id();
        }

        /* renamed from: Ij */
        public C6787b mo44446Ij() {
            mo43393xj();
            ((sp4) this.f34068b).mo44443pk();
            return this;
        }

        /* renamed from: Jj */
        public C6787b mo44447Jj(boolean z) {
            mo43393xj();
            ((sp4) this.f34068b).mo44433Gk(z);
            return this;
        }

        /* renamed from: Kj */
        public C6787b mo44448Kj(String str) {
            mo43393xj();
            ((sp4) this.f34068b).mo44434Hk(str);
            return this;
        }

        /* renamed from: Lj */
        public C6787b mo44449Lj(C5173er erVar) {
            mo43393xj();
            ((sp4) this.f34068b).mo44436Ik(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C6787b mo44450Mj(boolean z) {
            mo43393xj();
            ((sp4) this.f34068b).mo44437Jk(z);
            return this;
        }

        /* renamed from: d3 */
        public boolean mo44438d3() {
            return ((sp4) this.f34068b).mo44438d3();
        }

        /* renamed from: k */
        public String mo44439k() {
            return ((sp4) this.f34068b).mo44439k();
        }

        /* renamed from: l */
        public C5173er mo44440l() {
            return ((sp4) this.f34068b).mo44440l();
        }
    }

    static {
        sp4 sp4 = new sp4();
        DEFAULT_INSTANCE = sp4;
        qe1.m62492dk(sp4.class, sp4);
    }

    /* renamed from: Ak */
    public static sp4 m64790Ak(InputStream inputStream, zy0 zy0) throws IOException {
        return (sp4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Bk */
    public static sp4 m64791Bk(ByteBuffer byteBuffer) throws nt1 {
        return (sp4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ck */
    public static sp4 m64792Ck(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (sp4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Dk */
    public static sp4 m64793Dk(byte[] bArr) throws nt1 {
        return (sp4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ek */
    public static sp4 m64794Ek(byte[] bArr, zy0 zy0) throws nt1 {
        return (sp4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Fk */
    public static cz2<sp4> m64795Fk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: qk */
    public static sp4 m64804qk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: rk */
    public static C6787b m64805rk() {
        return (C6787b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: sk */
    public static C6787b m64806sk(sp4 sp4) {
        return (C6787b) DEFAULT_INSTANCE.mo43358gj(sp4);
    }

    /* renamed from: tk */
    public static sp4 m64807tk(InputStream inputStream) throws IOException {
        return (sp4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: uk */
    public static sp4 m64808uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (sp4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vk */
    public static sp4 m64809vk(C5173er erVar) throws nt1 {
        return (sp4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: wk */
    public static sp4 m64810wk(C5173er erVar, zy0 zy0) throws nt1 {
        return (sp4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: xk */
    public static sp4 m64811xk(g00 g00) throws IOException {
        return (sp4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: yk */
    public static sp4 m64812yk(g00 g00, zy0 zy0) throws IOException {
        return (sp4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: zk */
    public static sp4 m64813zk(InputStream inputStream) throws IOException {
        return (sp4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Gk */
    public final void mo44433Gk(boolean z) {
        this.allowUnregisteredCalls_ = z;
    }

    /* renamed from: Hk */
    public final void mo44434Hk(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* renamed from: Id */
    public boolean mo44435Id() {
        return this.skipServiceControl_;
    }

    /* renamed from: Ik */
    public final void mo44436Ik(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.selector_ = erVar.mo35543k0();
    }

    /* renamed from: Jk */
    public final void mo44437Jk(boolean z) {
        this.skipServiceControl_ = z;
    }

    /* renamed from: d3 */
    public boolean mo44438d3() {
        return this.allowUnregisteredCalls_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6786a.f35162a[iVar.ordinal()]) {
            case 1:
                return new sp4();
            case 2:
                return new C6787b((C6786a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"selector_", "allowUnregisteredCalls_", "skipServiceControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<sp4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (sp4.class) {
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

    /* renamed from: k */
    public String mo44439k() {
        return this.selector_;
    }

    /* renamed from: l */
    public C5173er mo44440l() {
        return C5173er.m47136w(this.selector_);
    }

    /* renamed from: nk */
    public final void mo44441nk() {
        this.allowUnregisteredCalls_ = false;
    }

    /* renamed from: ok */
    public final void mo44442ok() {
        this.selector_ = m64804qk().mo44439k();
    }

    /* renamed from: pk */
    public final void mo44443pk() {
        this.skipServiceControl_ = false;
    }
}
