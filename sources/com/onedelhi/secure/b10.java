package com.onedelhi.secure;

import com.onedelhi.secure.g81;
import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class b10 extends qe1<b10, C4609b> implements h10 {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final b10 DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile cz2<b10> PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private g81 alpha_;
    private float blue_;
    private float green_;
    private float red_;

    /* renamed from: com.onedelhi.secure.b10$a */
    public static /* synthetic */ class C4608a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26086a;

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
                f26086a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26086a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26086a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26086a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26086a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26086a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26086a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b10.C4608a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.b10$b */
    public static final class C4609b extends qe1.C6546b<b10, C4609b> implements h10 {
        public C4609b() {
            super(b10.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4609b(C4608a aVar) {
            this();
        }

        /* renamed from: C3 */
        public boolean mo31305C3() {
            return ((b10) this.f34068b).mo31305C3();
        }

        /* renamed from: Gj */
        public C4609b mo31319Gj() {
            mo43393xj();
            ((b10) this.f34068b).mo31314pk();
            return this;
        }

        /* renamed from: Hj */
        public C4609b mo31320Hj() {
            mo43393xj();
            ((b10) this.f34068b).mo31315qk();
            return this;
        }

        /* renamed from: Ij */
        public C4609b mo31321Ij() {
            mo43393xj();
            ((b10) this.f34068b).mo31316rk();
            return this;
        }

        /* renamed from: Jj */
        public C4609b mo31322Jj() {
            mo43393xj();
            ((b10) this.f34068b).mo31317sk();
            return this;
        }

        /* renamed from: Kj */
        public C4609b mo31323Kj(g81 g81) {
            mo43393xj();
            ((b10) this.f34068b).mo31318uk(g81);
            return this;
        }

        /* renamed from: Lj */
        public C4609b mo31324Lj(g81.C5368b bVar) {
            mo43393xj();
            ((b10) this.f34068b).mo31306Kk((g81) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Mj */
        public C4609b mo31325Mj(g81 g81) {
            mo43393xj();
            ((b10) this.f34068b).mo31306Kk(g81);
            return this;
        }

        /* renamed from: Nj */
        public C4609b mo31326Nj(float f) {
            mo43393xj();
            ((b10) this.f34068b).mo31307Lk(f);
            return this;
        }

        /* renamed from: Oj */
        public C4609b mo31327Oj(float f) {
            mo43393xj();
            ((b10) this.f34068b).mo31308Mk(f);
            return this;
        }

        /* renamed from: Pj */
        public C4609b mo31328Pj(float f) {
            mo43393xj();
            ((b10) this.f34068b).mo31309Nk(f);
            return this;
        }

        /* renamed from: X5 */
        public float mo31310X5() {
            return ((b10) this.f34068b).mo31310X5();
        }

        /* renamed from: bf */
        public float mo31311bf() {
            return ((b10) this.f34068b).mo31311bf();
        }

        /* renamed from: fh */
        public g81 mo31312fh() {
            return ((b10) this.f34068b).mo31312fh();
        }

        /* renamed from: ka */
        public float mo31313ka() {
            return ((b10) this.f34068b).mo31313ka();
        }
    }

    static {
        b10 b10 = new b10();
        DEFAULT_INSTANCE = b10;
        qe1.m62492dk(b10.class, b10);
    }

    /* renamed from: Ak */
    public static b10 m39245Ak(C5173er erVar, zy0 zy0) throws nt1 {
        return (b10) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Bk */
    public static b10 m39246Bk(g00 g00) throws IOException {
        return (b10) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ck */
    public static b10 m39247Ck(g00 g00, zy0 zy0) throws IOException {
        return (b10) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Dk */
    public static b10 m39248Dk(InputStream inputStream) throws IOException {
        return (b10) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ek */
    public static b10 m39249Ek(InputStream inputStream, zy0 zy0) throws IOException {
        return (b10) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public static b10 m39250Fk(ByteBuffer byteBuffer) throws nt1 {
        return (b10) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Gk */
    public static b10 m39251Gk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (b10) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Hk */
    public static b10 m39252Hk(byte[] bArr) throws nt1 {
        return (b10) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ik */
    public static b10 m39253Ik(byte[] bArr, zy0 zy0) throws nt1 {
        return (b10) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Jk */
    public static cz2<b10> m39254Jk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: tk */
    public static b10 m39265tk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: vk */
    public static C4609b m39266vk() {
        return (C4609b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: wk */
    public static C4609b m39267wk(b10 b10) {
        return (C4609b) DEFAULT_INSTANCE.mo43358gj(b10);
    }

    /* renamed from: xk */
    public static b10 m39268xk(InputStream inputStream) throws IOException {
        return (b10) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static b10 m39269yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (b10) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static b10 m39270zk(C5173er erVar) throws nt1 {
        return (b10) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: C3 */
    public boolean mo31305C3() {
        return this.alpha_ != null;
    }

    /* renamed from: Kk */
    public final void mo31306Kk(g81 g81) {
        g81.getClass();
        this.alpha_ = g81;
    }

    /* renamed from: Lk */
    public final void mo31307Lk(float f) {
        this.blue_ = f;
    }

    /* renamed from: Mk */
    public final void mo31308Mk(float f) {
        this.green_ = f;
    }

    /* renamed from: Nk */
    public final void mo31309Nk(float f) {
        this.red_ = f;
    }

    /* renamed from: X5 */
    public float mo31310X5() {
        return this.green_;
    }

    /* renamed from: bf */
    public float mo31311bf() {
        return this.blue_;
    }

    /* renamed from: fh */
    public g81 mo31312fh() {
        g81 g81 = this.alpha_;
        return g81 == null ? g81.m49113jk() : g81;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4608a.f26086a[iVar.ordinal()]) {
            case 1:
                return new b10();
            case 2:
                return new C4609b((C4608a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", new Object[]{"red_", "green_", "blue_", "alpha_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<b10> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (b10.class) {
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

    /* renamed from: ka */
    public float mo31313ka() {
        return this.red_;
    }

    /* renamed from: pk */
    public final void mo31314pk() {
        this.alpha_ = null;
    }

    /* renamed from: qk */
    public final void mo31315qk() {
        this.blue_ = 0.0f;
    }

    /* renamed from: rk */
    public final void mo31316rk() {
        this.green_ = 0.0f;
    }

    /* renamed from: sk */
    public final void mo31317sk() {
        this.red_ = 0.0f;
    }

    /* renamed from: uk */
    public final void mo31318uk(g81 g81) {
        g81.getClass();
        g81 g812 = this.alpha_;
        if (!(g812 == null || g812 == g81.m49113jk())) {
            g81 = (g81) ((g81.C5368b) g81.m49115lk(this.alpha_).mo43372Cj(g81)).mo43377Ja();
        }
        this.alpha_ = g81;
    }
}
