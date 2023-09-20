package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.tar.TarConstants;

public final class ct0 extends qe1<ct0, C4911b> implements lt0 {
    /* access modifiers changed from: private */
    public static final ct0 DEFAULT_INSTANCE;
    private static volatile cz2<ct0> PARSER;

    /* renamed from: com.onedelhi.secure.ct0$a */
    public static /* synthetic */ class C4910a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27054a;

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
                f27054a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27054a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27054a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27054a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27054a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27054a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27054a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ct0.C4910a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ct0$b */
    public static final class C4911b extends qe1.C6546b<ct0, C4911b> implements lt0 {
        public C4911b() {
            super(ct0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4911b(C4910a aVar) {
            this();
        }
    }

    static {
        ct0 ct0 = new ct0();
        DEFAULT_INSTANCE = ct0;
        qe1.m62492dk(ct0.class, ct0);
    }

    /* renamed from: gk */
    public static ct0 m44255gk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: hk */
    public static C4911b m44256hk() {
        return (C4911b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ik */
    public static C4911b m44257ik(ct0 ct0) {
        return (C4911b) DEFAULT_INSTANCE.mo43358gj(ct0);
    }

    /* renamed from: jk */
    public static ct0 m44258jk(InputStream inputStream) throws IOException {
        return (ct0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: kk */
    public static ct0 m44259kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ct0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: lk */
    public static ct0 m44260lk(C5173er erVar) throws nt1 {
        return (ct0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: mk */
    public static ct0 m44261mk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ct0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: nk */
    public static ct0 m44262nk(g00 g00) throws IOException {
        return (ct0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: ok */
    public static ct0 m44263ok(g00 g00, zy0 zy0) throws IOException {
        return (ct0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: pk */
    public static ct0 m44264pk(InputStream inputStream) throws IOException {
        return (ct0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: qk */
    public static ct0 m44265qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ct0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rk */
    public static ct0 m44266rk(ByteBuffer byteBuffer) throws nt1 {
        return (ct0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: sk */
    public static ct0 m44267sk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ct0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: tk */
    public static ct0 m44268tk(byte[] bArr) throws nt1 {
        return (ct0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: uk */
    public static ct0 m44269uk(byte[] bArr, zy0 zy0) throws nt1 {
        return (ct0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: vk */
    public static cz2<ct0> m44270vk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4910a.f27054a[iVar.ordinal()]) {
            case 1:
                return new ct0();
            case 2:
                return new C4911b((C4910a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, TarConstants.VERSION_ANT, (Object[]) null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ct0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ct0.class) {
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
}
