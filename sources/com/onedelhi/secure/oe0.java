package com.onedelhi.secure;

import com.onedelhi.secure.eq0;
import com.onedelhi.secure.ie4;
import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class oe0 extends qe1<oe0, C6271b> implements pe0 {
    public static final int DAY_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final oe0 DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile cz2<oe0> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    /* renamed from: com.onedelhi.secure.oe0$a */
    public static /* synthetic */ class C6270a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32996a;

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
                f32996a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32996a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32996a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32996a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32996a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32996a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32996a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oe0.C6270a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.oe0$b */
    public static final class C6271b extends qe1.C6546b<oe0, C6271b> implements pe0 {
        public C6271b() {
            super(oe0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6271b(C6270a aVar) {
            this();
        }

        /* renamed from: Ad */
        public ie4 mo41677Ad() {
            return ((oe0) this.f34068b).mo41677Ad();
        }

        /* renamed from: F0 */
        public int mo41682F0() {
            return ((oe0) this.f34068b).mo41682F0();
        }

        /* renamed from: Gj */
        public C6271b mo41710Gj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41678Bk();
            return this;
        }

        /* renamed from: Hj */
        public C6271b mo41711Hj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41679Ck();
            return this;
        }

        /* renamed from: Ij */
        public C6271b mo41712Ij() {
            mo43393xj();
            ((oe0) this.f34068b).mo41680Dk();
            return this;
        }

        /* renamed from: Jj */
        public C6271b mo41713Jj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41681Ek();
            return this;
        }

        /* renamed from: Kj */
        public C6271b mo41714Kj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41683Fk();
            return this;
        }

        /* renamed from: Le */
        public C6272c mo41689Le() {
            return ((oe0) this.f34068b).mo41689Le();
        }

        /* renamed from: Lj */
        public C6271b mo41715Lj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41684Gk();
            return this;
        }

        /* renamed from: Mj */
        public C6271b mo41716Mj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41685Hk();
            return this;
        }

        /* renamed from: Nj */
        public C6271b mo41717Nj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41686Ik();
            return this;
        }

        /* renamed from: Oj */
        public C6271b mo41718Oj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41687Jk();
            return this;
        }

        /* renamed from: P0 */
        public int mo41692P0() {
            return ((oe0) this.f34068b).mo41692P0();
        }

        /* renamed from: Pj */
        public C6271b mo41719Pj() {
            mo43393xj();
            ((oe0) this.f34068b).mo41688Kk();
            return this;
        }

        /* renamed from: Qj */
        public C6271b mo41720Qj(ie4 ie4) {
            mo43393xj();
            ((oe0) this.f34068b).mo41690Mk(ie4);
            return this;
        }

        /* renamed from: Rj */
        public C6271b mo41721Rj(eq0 eq0) {
            mo43393xj();
            ((oe0) this.f34068b).mo41691Nk(eq0);
            return this;
        }

        /* renamed from: Sj */
        public C6271b mo41722Sj(int i) {
            mo43393xj();
            ((oe0) this.f34068b).mo41695dl(i);
            return this;
        }

        /* renamed from: Tj */
        public C6271b mo41723Tj(int i) {
            mo43393xj();
            ((oe0) this.f34068b).mo41696el(i);
            return this;
        }

        /* renamed from: Uj */
        public C6271b mo41724Uj(int i) {
            mo43393xj();
            ((oe0) this.f34068b).mo41698fl(i);
            return this;
        }

        /* renamed from: Vh */
        public eq0 mo41693Vh() {
            return ((oe0) this.f34068b).mo41693Vh();
        }

        /* renamed from: Vj */
        public C6271b mo41725Vj(int i) {
            mo43393xj();
            ((oe0) this.f34068b).mo41699gl(i);
            return this;
        }

        /* renamed from: Wj */
        public C6271b mo41726Wj(int i) {
            mo43393xj();
            ((oe0) this.f34068b).mo41701hl(i);
            return this;
        }

        /* renamed from: Xj */
        public C6271b mo41727Xj(int i) {
            mo43393xj();
            ((oe0) this.f34068b).mo41702il(i);
            return this;
        }

        /* renamed from: Yj */
        public C6271b mo41728Yj(ie4.C5719b bVar) {
            mo43393xj();
            ((oe0) this.f34068b).mo41703jl((ie4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Zj */
        public C6271b mo41729Zj(ie4 ie4) {
            mo43393xj();
            ((oe0) this.f34068b).mo41703jl(ie4);
            return this;
        }

        /* renamed from: ak */
        public C6271b mo41730ak(eq0.C5172b bVar) {
            mo43393xj();
            ((oe0) this.f34068b).mo41704kl((eq0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: bk */
        public C6271b mo41731bk(eq0 eq0) {
            mo43393xj();
            ((oe0) this.f34068b).mo41704kl(eq0);
            return this;
        }

        /* renamed from: ck */
        public C6271b mo41732ck(int i) {
            mo43393xj();
            ((oe0) this.f34068b).mo41705ll(i);
            return this;
        }

        /* renamed from: d2 */
        public int mo41694d2() {
            return ((oe0) this.f34068b).mo41694d2();
        }

        /* renamed from: f1 */
        public int mo41697f1() {
            return ((oe0) this.f34068b).mo41697f1();
        }

        /* renamed from: h1 */
        public int mo41700h1() {
            return ((oe0) this.f34068b).mo41700h1();
        }

        /* renamed from: m3 */
        public boolean mo41706m3() {
            return ((oe0) this.f34068b).mo41706m3();
        }

        /* renamed from: p9 */
        public boolean mo41707p9() {
            return ((oe0) this.f34068b).mo41707p9();
        }

        /* renamed from: v */
        public int mo41708v() {
            return ((oe0) this.f34068b).mo41708v();
        }

        /* renamed from: v0 */
        public int mo41709v0() {
            return ((oe0) this.f34068b).mo41709v0();
        }
    }

    /* renamed from: com.onedelhi.secure.oe0$c */
    public enum C6272c {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);
        

        /* renamed from: n */
        public final int f33001n;

        /* access modifiers changed from: public */
        C6272c(int i) {
            this.f33001n = i;
        }

        /* renamed from: a */
        public static C6272c m59364a(int i) {
            if (i == 0) {
                return TIMEOFFSET_NOT_SET;
            }
            if (i == 8) {
                return UTC_OFFSET;
            }
            if (i != 9) {
                return null;
            }
            return TIME_ZONE;
        }

        @Deprecated
        /* renamed from: b */
        public static C6272c m59365b(int i) {
            return m59364a(i);
        }

        /* renamed from: j */
        public int mo41733j() {
            return this.f33001n;
        }
    }

    static {
        oe0 oe0 = new oe0();
        DEFAULT_INSTANCE = oe0;
        qe1.m62492dk(oe0.class, oe0);
    }

    /* renamed from: Lk */
    public static oe0 m59258Lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ok */
    public static C6271b m59259Ok() {
        return (C6271b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Pk */
    public static C6271b m59260Pk(oe0 oe0) {
        return (C6271b) DEFAULT_INSTANCE.mo43358gj(oe0);
    }

    /* renamed from: Qk */
    public static oe0 m59261Qk(InputStream inputStream) throws IOException {
        return (oe0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Rk */
    public static oe0 m59262Rk(InputStream inputStream, zy0 zy0) throws IOException {
        return (oe0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Sk */
    public static oe0 m59263Sk(C5173er erVar) throws nt1 {
        return (oe0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Tk */
    public static oe0 m59264Tk(C5173er erVar, zy0 zy0) throws nt1 {
        return (oe0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Uk */
    public static oe0 m59265Uk(g00 g00) throws IOException {
        return (oe0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Vk */
    public static oe0 m59266Vk(g00 g00, zy0 zy0) throws IOException {
        return (oe0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Wk */
    public static oe0 m59267Wk(InputStream inputStream) throws IOException {
        return (oe0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Xk */
    public static oe0 m59268Xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (oe0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Yk */
    public static oe0 m59269Yk(ByteBuffer byteBuffer) throws nt1 {
        return (oe0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Zk */
    public static oe0 m59270Zk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (oe0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: al */
    public static oe0 m59271al(byte[] bArr) throws nt1 {
        return (oe0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: bl */
    public static oe0 m59272bl(byte[] bArr, zy0 zy0) throws nt1 {
        return (oe0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: cl */
    public static cz2<oe0> m59273cl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ad */
    public ie4 mo41677Ad() {
        return this.timeOffsetCase_ == 9 ? (ie4) this.timeOffset_ : ie4.m52191ok();
    }

    /* renamed from: Bk */
    public final void mo41678Bk() {
        this.day_ = 0;
    }

    /* renamed from: Ck */
    public final void mo41679Ck() {
        this.hours_ = 0;
    }

    /* renamed from: Dk */
    public final void mo41680Dk() {
        this.minutes_ = 0;
    }

    /* renamed from: Ek */
    public final void mo41681Ek() {
        this.month_ = 0;
    }

    /* renamed from: F0 */
    public int mo41682F0() {
        return this.month_;
    }

    /* renamed from: Fk */
    public final void mo41683Fk() {
        this.nanos_ = 0;
    }

    /* renamed from: Gk */
    public final void mo41684Gk() {
        this.seconds_ = 0;
    }

    /* renamed from: Hk */
    public final void mo41685Hk() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    /* renamed from: Ik */
    public final void mo41686Ik() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* renamed from: Jk */
    public final void mo41687Jk() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* renamed from: Kk */
    public final void mo41688Kk() {
        this.year_ = 0;
    }

    /* renamed from: Le */
    public C6272c mo41689Le() {
        return C6272c.m59364a(this.timeOffsetCase_);
    }

    /* renamed from: Mk */
    public final void mo41690Mk(ie4 ie4) {
        ie4.getClass();
        zh2 zh2 = ie4;
        if (this.timeOffsetCase_ == 9) {
            zh2 = ie4;
            if (this.timeOffset_ != ie4.m52191ok()) {
                zh2 = ((ie4.C5719b) ie4.m52193qk((ie4) this.timeOffset_).mo43372Cj(ie4)).mo43377Ja();
            }
        }
        this.timeOffset_ = zh2;
        this.timeOffsetCase_ = 9;
    }

    /* renamed from: Nk */
    public final void mo41691Nk(eq0 eq0) {
        eq0.getClass();
        zh2 zh2 = eq0;
        if (this.timeOffsetCase_ == 8) {
            zh2 = eq0;
            if (this.timeOffset_ != eq0.m47083mk()) {
                zh2 = ((eq0.C5172b) eq0.m47085ok((eq0) this.timeOffset_).mo43372Cj(eq0)).mo43377Ja();
            }
        }
        this.timeOffset_ = zh2;
        this.timeOffsetCase_ = 8;
    }

    /* renamed from: P0 */
    public int mo41692P0() {
        return this.day_;
    }

    /* renamed from: Vh */
    public eq0 mo41693Vh() {
        return this.timeOffsetCase_ == 8 ? (eq0) this.timeOffset_ : eq0.m47083mk();
    }

    /* renamed from: d2 */
    public int mo41694d2() {
        return this.seconds_;
    }

    /* renamed from: dl */
    public final void mo41695dl(int i) {
        this.day_ = i;
    }

    /* renamed from: el */
    public final void mo41696el(int i) {
        this.hours_ = i;
    }

    /* renamed from: f1 */
    public int mo41697f1() {
        return this.year_;
    }

    /* renamed from: fl */
    public final void mo41698fl(int i) {
        this.minutes_ = i;
    }

    /* renamed from: gl */
    public final void mo41699gl(int i) {
        this.month_ = i;
    }

    /* renamed from: h1 */
    public int mo41700h1() {
        return this.minutes_;
    }

    /* renamed from: hl */
    public final void mo41701hl(int i) {
        this.nanos_ = i;
    }

    /* renamed from: il */
    public final void mo41702il(int i) {
        this.seconds_ = i;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6270a.f32996a[iVar.ordinal()]) {
            case 1:
                return new oe0();
            case 2:
                return new C6271b((C6270a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", eq0.class, ie4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<oe0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (oe0.class) {
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

    /* renamed from: jl */
    public final void mo41703jl(ie4 ie4) {
        ie4.getClass();
        this.timeOffset_ = ie4;
        this.timeOffsetCase_ = 9;
    }

    /* renamed from: kl */
    public final void mo41704kl(eq0 eq0) {
        eq0.getClass();
        this.timeOffset_ = eq0;
        this.timeOffsetCase_ = 8;
    }

    /* renamed from: ll */
    public final void mo41705ll(int i) {
        this.year_ = i;
    }

    /* renamed from: m3 */
    public boolean mo41706m3() {
        return this.timeOffsetCase_ == 8;
    }

    /* renamed from: p9 */
    public boolean mo41707p9() {
        return this.timeOffsetCase_ == 9;
    }

    /* renamed from: v */
    public int mo41708v() {
        return this.nanos_;
    }

    /* renamed from: v0 */
    public int mo41709v0() {
        return this.hours_;
    }
}
