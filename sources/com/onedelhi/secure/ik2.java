package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class ik2 extends qe1<ik2, C5732b> implements nk2 {
    /* access modifiers changed from: private */
    public static final ik2 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile cz2<ik2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private rc2<String, String> labels_ = rc2.m63481i();
    private String type_ = "";

    /* renamed from: com.onedelhi.secure.ik2$a */
    public static /* synthetic */ class C5731a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30351a;

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
                f30351a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30351a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30351a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30351a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30351a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30351a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30351a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ik2.C5731a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ik2$b */
    public static final class C5732b extends qe1.C6546b<ik2, C5732b> implements nk2 {
        public C5732b() {
            super(ik2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5732b(C5731a aVar) {
            this();
        }

        /* renamed from: B */
        public boolean mo38128B(String str) {
            str.getClass();
            return ((ik2) this.f34068b).mo38133I().containsKey(str);
        }

        /* renamed from: D */
        public String mo38129D(String str) {
            str.getClass();
            Map<String, String> I = ((ik2) this.f34068b).mo38133I();
            if (I.containsKey(str)) {
                return I.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: Gj */
        public C5732b mo38142Gj() {
            mo43393xj();
            ((ik2) this.f34068b).mo38137mk().clear();
            return this;
        }

        /* renamed from: H */
        public String mo38132H(String str, String str2) {
            str.getClass();
            Map<String, String> I = ((ik2) this.f34068b).mo38133I();
            return I.containsKey(str) ? I.get(str) : str2;
        }

        /* renamed from: Hj */
        public C5732b mo38143Hj() {
            mo43393xj();
            ((ik2) this.f34068b).mo38135kk();
            return this;
        }

        /* renamed from: I */
        public Map<String, String> mo38133I() {
            return Collections.unmodifiableMap(((ik2) this.f34068b).mo38133I());
        }

        /* renamed from: Ij */
        public C5732b mo38144Ij(Map<String, String> map) {
            mo43393xj();
            ((ik2) this.f34068b).mo38137mk().putAll(map);
            return this;
        }

        /* renamed from: Jj */
        public C5732b mo38145Jj(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo43393xj();
            ((ik2) this.f34068b).mo38137mk().put(str, str2);
            return this;
        }

        /* renamed from: Kj */
        public C5732b mo38146Kj(String str) {
            str.getClass();
            mo43393xj();
            ((ik2) this.f34068b).mo38137mk().remove(str);
            return this;
        }

        /* renamed from: Lj */
        public C5732b mo38147Lj(String str) {
            mo43393xj();
            ((ik2) this.f34068b).mo38130Ek(str);
            return this;
        }

        /* renamed from: Mj */
        public C5732b mo38148Mj(C5173er erVar) {
            mo43393xj();
            ((ik2) this.f34068b).mo38131Fk(erVar);
            return this;
        }

        /* renamed from: h */
        public String mo38134h() {
            return ((ik2) this.f34068b).mo38134h();
        }

        /* renamed from: m */
        public C5173er mo38136m() {
            return ((ik2) this.f34068b).mo38136m();
        }

        /* renamed from: r */
        public int mo38140r() {
            return ((ik2) this.f34068b).mo38133I().size();
        }

        @Deprecated
        /* renamed from: z */
        public Map<String, String> mo38141z() {
            return mo38133I();
        }
    }

    /* renamed from: com.onedelhi.secure.ik2$c */
    public static final class C5733c {

        /* renamed from: a */
        public static final oc2<String, String> f30352a;

        static {
            wx4.C7195b bVar = wx4.C7195b.STRING;
            f30352a = oc2.m59242f(bVar, "", bVar, "");
        }
    }

    static {
        ik2 ik2 = new ik2();
        DEFAULT_INSTANCE = ik2;
        qe1.m62492dk(ik2.class, ik2);
    }

    /* renamed from: Ak */
    public static ik2 m52331Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ik2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static ik2 m52332Bk(byte[] bArr) throws nt1 {
        return (ik2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static ik2 m52333Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (ik2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<ik2> m52334Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: lk */
    public static ik2 m52340lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C5732b m52341pk() {
        return (C5732b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C5732b m52342qk(ik2 ik2) {
        return (C5732b) DEFAULT_INSTANCE.mo43358gj(ik2);
    }

    /* renamed from: rk */
    public static ik2 m52343rk(InputStream inputStream) throws IOException {
        return (ik2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static ik2 m52344sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ik2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static ik2 m52345tk(C5173er erVar) throws nt1 {
        return (ik2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static ik2 m52346uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ik2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static ik2 m52347vk(g00 g00) throws IOException {
        return (ik2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static ik2 m52348wk(g00 g00, zy0 zy0) throws IOException {
        return (ik2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static ik2 m52349xk(InputStream inputStream) throws IOException {
        return (ik2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static ik2 m52350yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ik2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static ik2 m52351zk(ByteBuffer byteBuffer) throws nt1 {
        return (ik2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: B */
    public boolean mo38128B(String str) {
        str.getClass();
        return mo38138nk().containsKey(str);
    }

    /* renamed from: D */
    public String mo38129D(String str) {
        str.getClass();
        rc2<String, String> nk = mo38138nk();
        if (nk.containsKey(str)) {
            return nk.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Ek */
    public final void mo38130Ek(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* renamed from: Fk */
    public final void mo38131Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.type_ = erVar.mo35543k0();
    }

    /* renamed from: H */
    public String mo38132H(String str, String str2) {
        str.getClass();
        rc2<String, String> nk = mo38138nk();
        return nk.containsKey(str) ? nk.get(str) : str2;
    }

    /* renamed from: I */
    public Map<String, String> mo38133I() {
        return Collections.unmodifiableMap(mo38138nk());
    }

    /* renamed from: h */
    public String mo38134h() {
        return this.type_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5731a.f30351a[iVar.ordinal()]) {
            case 1:
                return new ik2();
            case 2:
                return new C5732b((C5731a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"type_", "labels_", C5733c.f30352a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ik2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ik2.class) {
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

    /* renamed from: kk */
    public final void mo38135kk() {
        this.type_ = m52340lk().mo38134h();
    }

    /* renamed from: m */
    public C5173er mo38136m() {
        return C5173er.m47136w(this.type_);
    }

    /* renamed from: mk */
    public final Map<String, String> mo38137mk() {
        return mo38139ok();
    }

    /* renamed from: nk */
    public final rc2<String, String> mo38138nk() {
        return this.labels_;
    }

    /* renamed from: ok */
    public final rc2<String, String> mo38139ok() {
        if (!this.labels_.mo43841n()) {
            this.labels_ = this.labels_.mo43846q();
        }
        return this.labels_;
    }

    /* renamed from: r */
    public int mo38140r() {
        return mo38138nk().size();
    }

    @Deprecated
    /* renamed from: z */
    public Map<String, String> mo38141z() {
        return mo38133I();
    }
}
