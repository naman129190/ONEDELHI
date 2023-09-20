package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class z54 extends qe1<z54, C7435b> implements b64 {
    /* access modifiers changed from: private */
    public static final z54 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile cz2<z54> PARSER;
    private rc2<String, lr4> fields_ = rc2.m63481i();

    /* renamed from: com.onedelhi.secure.z54$a */
    public static /* synthetic */ class C7434a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38222a;

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
                f38222a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38222a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38222a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38222a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38222a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38222a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38222a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z54.C7434a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.z54$b */
    public static final class C7435b extends qe1.C6546b<z54, C7435b> implements b64 {
        public C7435b() {
            super(z54.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7435b(C7434a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7435b mo48143Gj() {
            mo43393xj();
            ((z54) this.f34068b).mo48140ik().clear();
            return this;
        }

        /* renamed from: Hj */
        public C7435b mo48144Hj(Map<String, lr4> map) {
            mo43393xj();
            ((z54) this.f34068b).mo48140ik().putAll(map);
            return this;
        }

        /* renamed from: Ij */
        public C7435b mo48145Ij(String str, lr4 lr4) {
            str.getClass();
            lr4.getClass();
            mo43393xj();
            ((z54) this.f34068b).mo48140ik().put(str, lr4);
            return this;
        }

        /* renamed from: Jj */
        public C7435b mo48146Jj(String str) {
            str.getClass();
            mo43393xj();
            ((z54) this.f34068b).mo48140ik().remove(str);
            return this;
        }

        @Deprecated
        /* renamed from: O4 */
        public Map<String, lr4> mo31438O4() {
            return mo31443x3();
        }

        /* renamed from: Ua */
        public lr4 mo31439Ua(String str) {
            str.getClass();
            Map<String, lr4> x3 = ((z54) this.f34068b).mo31443x3();
            if (x3.containsKey(str)) {
                return x3.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: fb */
        public boolean mo31440fb(String str) {
            str.getClass();
            return ((z54) this.f34068b).mo31443x3().containsKey(str);
        }

        /* renamed from: m1 */
        public int mo31441m1() {
            return ((z54) this.f34068b).mo31443x3().size();
        }

        /* renamed from: qf */
        public lr4 mo31442qf(String str, lr4 lr4) {
            str.getClass();
            Map<String, lr4> x3 = ((z54) this.f34068b).mo31443x3();
            return x3.containsKey(str) ? x3.get(str) : lr4;
        }

        /* renamed from: x3 */
        public Map<String, lr4> mo31443x3() {
            return Collections.unmodifiableMap(((z54) this.f34068b).mo31443x3());
        }
    }

    /* renamed from: com.onedelhi.secure.z54$c */
    public static final class C7436c {

        /* renamed from: a */
        public static final oc2<String, lr4> f38223a = oc2.m59242f(wx4.C7195b.STRING, "", wx4.C7195b.MESSAGE, lr4.m56348Ek());
    }

    static {
        z54 z54 = new z54();
        DEFAULT_INSTANCE = z54;
        qe1.m62492dk(z54.class, z54);
    }

    /* renamed from: hk */
    public static z54 m72555hk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: lk */
    public static C7435b m72556lk() {
        return (C7435b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: mk */
    public static C7435b m72557mk(z54 z54) {
        return (C7435b) DEFAULT_INSTANCE.mo43358gj(z54);
    }

    /* renamed from: nk */
    public static z54 m72558nk(InputStream inputStream) throws IOException {
        return (z54) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ok */
    public static z54 m72559ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (z54) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pk */
    public static z54 m72560pk(C5173er erVar) throws nt1 {
        return (z54) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: qk */
    public static z54 m72561qk(C5173er erVar, zy0 zy0) throws nt1 {
        return (z54) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: rk */
    public static z54 m72562rk(g00 g00) throws IOException {
        return (z54) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: sk */
    public static z54 m72563sk(g00 g00, zy0 zy0) throws IOException {
        return (z54) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: tk */
    public static z54 m72564tk(InputStream inputStream) throws IOException {
        return (z54) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: uk */
    public static z54 m72565uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (z54) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vk */
    public static z54 m72566vk(ByteBuffer byteBuffer) throws nt1 {
        return (z54) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: wk */
    public static z54 m72567wk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (z54) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: xk */
    public static z54 m72568xk(byte[] bArr) throws nt1 {
        return (z54) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: yk */
    public static z54 m72569yk(byte[] bArr, zy0 zy0) throws nt1 {
        return (z54) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: zk */
    public static cz2<z54> m72570zk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    @Deprecated
    /* renamed from: O4 */
    public Map<String, lr4> mo31438O4() {
        return mo31443x3();
    }

    /* renamed from: Ua */
    public lr4 mo31439Ua(String str) {
        str.getClass();
        rc2<String, lr4> jk = mo48141jk();
        if (jk.containsKey(str)) {
            return jk.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: fb */
    public boolean mo31440fb(String str) {
        str.getClass();
        return mo48141jk().containsKey(str);
    }

    /* renamed from: ik */
    public final Map<String, lr4> mo48140ik() {
        return mo48142kk();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7434a.f38222a[iVar.ordinal()]) {
            case 1:
                return new z54();
            case 2:
                return new C7435b((C7434a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C7436c.f38223a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<z54> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (z54.class) {
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

    /* renamed from: jk */
    public final rc2<String, lr4> mo48141jk() {
        return this.fields_;
    }

    /* renamed from: kk */
    public final rc2<String, lr4> mo48142kk() {
        if (!this.fields_.mo43841n()) {
            this.fields_ = this.fields_.mo43846q();
        }
        return this.fields_;
    }

    /* renamed from: m1 */
    public int mo31441m1() {
        return mo48141jk().size();
    }

    /* renamed from: qf */
    public lr4 mo31442qf(String str, lr4 lr4) {
        str.getClass();
        rc2<String, lr4> jk = mo48141jk();
        return jk.containsKey(str) ? jk.get(str) : lr4;
    }

    /* renamed from: x3 */
    public Map<String, lr4> mo31443x3() {
        return Collections.unmodifiableMap(mo48141jk());
    }
}
