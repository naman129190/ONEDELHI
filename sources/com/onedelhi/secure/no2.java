package com.onedelhi.secure;

import com.onedelhi.secure.h13;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class no2 extends qe1<no2, C6210b> implements qo2 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final no2 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile cz2<no2> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private rc2<String, String> customAttributes_ = rc2.m63481i();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private vs1.C7095k<h13> perfSessions_ = qe1.m62499pj();
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    /* renamed from: com.onedelhi.secure.no2$a */
    public static /* synthetic */ class C6209a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32666a;

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
                f32666a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32666a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32666a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32666a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32666a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32666a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32666a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.no2.C6209a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.no2$b */
    public static final class C6210b extends qe1.C6546b<no2, C6210b> implements qo2 {
        public C6210b() {
            super(no2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6210b(C6209a aVar) {
            this();
        }

        /* renamed from: Ab */
        public boolean mo41314Ab() {
            return ((no2) this.f34068b).mo41314Ab();
        }

        /* renamed from: B0 */
        public int mo41316B0() {
            return ((no2) this.f34068b).mo41316B0();
        }

        /* renamed from: Cg */
        public boolean mo41318Cg() {
            return ((no2) this.f34068b).mo41318Cg();
        }

        /* renamed from: G9 */
        public long mo41323G9() {
            return ((no2) this.f34068b).mo41323G9();
        }

        /* renamed from: Gj */
        public C6210b mo41383Gj(Iterable<? extends h13> iterable) {
            mo43393xj();
            ((no2) this.f34068b).mo41332Lk(iterable);
            return this;
        }

        /* renamed from: H0 */
        public List<h13> mo41325H0() {
            return Collections.unmodifiableList(((no2) this.f34068b).mo41325H0());
        }

        /* renamed from: H9 */
        public C6212d mo41326H9() {
            return ((no2) this.f34068b).mo41326H9();
        }

        /* renamed from: Hj */
        public C6210b mo41384Hj(int i, h13.C5473c cVar) {
            mo43393xj();
            ((no2) this.f34068b).mo41334Mk(i, (h13) cVar.mo43381ab());
            return this;
        }

        /* renamed from: I0 */
        public C5173er mo41328I0() {
            return ((no2) this.f34068b).mo41328I0();
        }

        /* renamed from: Ij */
        public C6210b mo41385Ij(int i, h13 h13) {
            mo43393xj();
            ((no2) this.f34068b).mo41334Mk(i, h13);
            return this;
        }

        /* renamed from: Jj */
        public C6210b mo41386Jj(h13.C5473c cVar) {
            mo43393xj();
            ((no2) this.f34068b).mo41337Nk((h13) cVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6210b mo41387Kj(h13 h13) {
            mo43393xj();
            ((no2) this.f34068b).mo41337Nk(h13);
            return this;
        }

        /* renamed from: Lj */
        public C6210b mo41388Lj() {
            mo43393xj();
            ((no2) this.f34068b).mo41338Ok();
            return this;
        }

        /* renamed from: M5 */
        public String mo41333M5() {
            return ((no2) this.f34068b).mo41333M5();
        }

        /* renamed from: Mj */
        public C6210b mo41389Mj() {
            mo43393xj();
            ((no2) this.f34068b).mo41362cl().clear();
            return this;
        }

        /* renamed from: N */
        public boolean mo41335N(String str) {
            str.getClass();
            return ((no2) this.f34068b).mo41344S().containsKey(str);
        }

        /* renamed from: N4 */
        public boolean mo41336N4() {
            return ((no2) this.f34068b).mo41336N4();
        }

        /* renamed from: Nj */
        public C6210b mo41390Nj() {
            mo43393xj();
            ((no2) this.f34068b).mo41340Pk();
            return this;
        }

        /* renamed from: Oj */
        public C6210b mo41391Oj() {
            mo43393xj();
            ((no2) this.f34068b).mo41341Qk();
            return this;
        }

        /* renamed from: P8 */
        public boolean mo41339P8() {
            return ((no2) this.f34068b).mo41339P8();
        }

        /* renamed from: Pj */
        public C6210b mo41392Pj() {
            mo43393xj();
            ((no2) this.f34068b).mo41343Rk();
            return this;
        }

        /* renamed from: Qj */
        public C6210b mo41393Qj() {
            mo43393xj();
            ((no2) this.f34068b).mo41345Sk();
            return this;
        }

        /* renamed from: R8 */
        public boolean mo41342R8() {
            return ((no2) this.f34068b).mo41342R8();
        }

        /* renamed from: Rj */
        public C6210b mo41394Rj() {
            mo43393xj();
            ((no2) this.f34068b).mo41346Tk();
            return this;
        }

        /* renamed from: S */
        public Map<String, String> mo41344S() {
            return Collections.unmodifiableMap(((no2) this.f34068b).mo41344S());
        }

        /* renamed from: Sj */
        public C6210b mo41395Sj() {
            mo43393xj();
            ((no2) this.f34068b).mo41347Uk();
            return this;
        }

        /* renamed from: Tj */
        public C6210b mo41396Tj() {
            mo43393xj();
            ((no2) this.f34068b).mo41348Vk();
            return this;
        }

        /* renamed from: Uj */
        public C6210b mo41397Uj() {
            mo43393xj();
            ((no2) this.f34068b).mo41350Wk();
            return this;
        }

        /* renamed from: Vj */
        public C6210b mo41398Vj() {
            mo43393xj();
            ((no2) this.f34068b).mo41352Xk();
            return this;
        }

        /* renamed from: W3 */
        public boolean mo41349W3() {
            return ((no2) this.f34068b).mo41349W3();
        }

        /* renamed from: Wj */
        public C6210b mo41399Wj() {
            mo43393xj();
            ((no2) this.f34068b).mo41354Yk();
            return this;
        }

        @Deprecated
        /* renamed from: X */
        public Map<String, String> mo41351X() {
            return mo41344S();
        }

        /* renamed from: Xj */
        public C6210b mo41400Xj() {
            mo43393xj();
            ((no2) this.f34068b).mo41356Zk();
            return this;
        }

        /* renamed from: Y1 */
        public long mo41353Y1() {
            return ((no2) this.f34068b).mo41353Y1();
        }

        /* renamed from: Yj */
        public C6210b mo41401Yj(Map<String, String> map) {
            mo43393xj();
            ((no2) this.f34068b).mo41362cl().putAll(map);
            return this;
        }

        /* renamed from: Z5 */
        public long mo41355Z5() {
            return ((no2) this.f34068b).mo41355Z5();
        }

        /* renamed from: Zj */
        public C6210b mo41402Zj(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo43393xj();
            ((no2) this.f34068b).mo41362cl().put(str, str2);
            return this;
        }

        /* renamed from: a0 */
        public String mo41357a0(String str, String str2) {
            str.getClass();
            Map<String, String> S = ((no2) this.f34068b).mo41344S();
            return S.containsKey(str) ? S.get(str) : str2;
        }

        /* renamed from: a2 */
        public h13 mo41358a2(int i) {
            return ((no2) this.f34068b).mo41358a2(i);
        }

        /* renamed from: a8 */
        public C6215e mo41359a8() {
            return ((no2) this.f34068b).mo41359a8();
        }

        /* renamed from: ak */
        public C6210b mo41403ak(String str) {
            str.getClass();
            mo43393xj();
            ((no2) this.f34068b).mo41362cl().remove(str);
            return this;
        }

        /* renamed from: be */
        public C5173er mo41361be() {
            return ((no2) this.f34068b).mo41361be();
        }

        /* renamed from: bk */
        public C6210b mo41404bk(int i) {
            mo43393xj();
            ((no2) this.f34068b).mo41375wl(i);
            return this;
        }

        /* renamed from: ck */
        public C6210b mo41405ck(long j) {
            mo43393xj();
            ((no2) this.f34068b).mo41377xl(j);
            return this;
        }

        /* renamed from: dk */
        public C6210b mo41406dk(C6212d dVar) {
            mo43393xj();
            ((no2) this.f34068b).mo41380yl(dVar);
            return this;
        }

        /* renamed from: ek */
        public C6210b mo41407ek(int i) {
            mo43393xj();
            ((no2) this.f34068b).mo41382zl(i);
            return this;
        }

        /* renamed from: f2 */
        public boolean mo41365f2() {
            return ((no2) this.f34068b).mo41365f2();
        }

        /* renamed from: fk */
        public C6210b mo41408fk(C6215e eVar) {
            mo43393xj();
            ((no2) this.f34068b).mo41315Al(eVar);
            return this;
        }

        /* renamed from: gk */
        public C6210b mo41409gk(int i, h13.C5473c cVar) {
            mo43393xj();
            ((no2) this.f34068b).mo41317Bl(i, (h13) cVar.mo43381ab());
            return this;
        }

        /* renamed from: h0 */
        public int mo41368h0() {
            return ((no2) this.f34068b).mo41344S().size();
        }

        /* renamed from: h7 */
        public boolean mo41369h7() {
            return ((no2) this.f34068b).mo41369h7();
        }

        /* renamed from: hk */
        public C6210b mo41410hk(int i, h13 h13) {
            mo43393xj();
            ((no2) this.f34068b).mo41317Bl(i, h13);
            return this;
        }

        /* renamed from: ik */
        public C6210b mo41411ik(long j) {
            mo43393xj();
            ((no2) this.f34068b).mo41319Cl(j);
            return this;
        }

        /* renamed from: jk */
        public C6210b mo41412jk(String str) {
            mo43393xj();
            ((no2) this.f34068b).mo41320Dl(str);
            return this;
        }

        /* renamed from: kk */
        public C6210b mo41413kk(C5173er erVar) {
            mo43393xj();
            ((no2) this.f34068b).mo41321El(erVar);
            return this;
        }

        /* renamed from: l0 */
        public String mo41370l0(String str) {
            str.getClass();
            Map<String, String> S = ((no2) this.f34068b).mo41344S();
            if (S.containsKey(str)) {
                return S.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: la */
        public long mo41371la() {
            return ((no2) this.f34068b).mo41371la();
        }

        /* renamed from: lc */
        public boolean mo41372lc() {
            return ((no2) this.f34068b).mo41372lc();
        }

        /* renamed from: lk */
        public C6210b mo41414lk(long j) {
            mo43393xj();
            ((no2) this.f34068b).mo41322Fl(j);
            return this;
        }

        /* renamed from: md */
        public int mo41373md() {
            return ((no2) this.f34068b).mo41373md();
        }

        /* renamed from: mk */
        public C6210b mo41415mk(long j) {
            mo43393xj();
            ((no2) this.f34068b).mo41324Gl(j);
            return this;
        }

        /* renamed from: nk */
        public C6210b mo41416nk(long j) {
            mo43393xj();
            ((no2) this.f34068b).mo41327Hl(j);
            return this;
        }

        /* renamed from: ok */
        public C6210b mo41417ok(long j) {
            mo43393xj();
            ((no2) this.f34068b).mo41329Il(j);
            return this;
        }

        /* renamed from: pk */
        public C6210b mo41418pk(String str) {
            mo43393xj();
            ((no2) this.f34068b).mo41330Jl(str);
            return this;
        }

        /* renamed from: qk */
        public C6210b mo41419qk(C5173er erVar) {
            mo43393xj();
            ((no2) this.f34068b).mo41331Kl(erVar);
            return this;
        }

        /* renamed from: t0 */
        public String mo41374t0() {
            return ((no2) this.f34068b).mo41374t0();
        }

        /* renamed from: x6 */
        public long mo41376x6() {
            return ((no2) this.f34068b).mo41376x6();
        }

        /* renamed from: y4 */
        public boolean mo41378y4() {
            return ((no2) this.f34068b).mo41378y4();
        }

        /* renamed from: yc */
        public boolean mo41379yc() {
            return ((no2) this.f34068b).mo41379yc();
        }

        /* renamed from: zc */
        public long mo41381zc() {
            return ((no2) this.f34068b).mo41381zc();
        }
    }

    /* renamed from: com.onedelhi.secure.no2$c */
    public static final class C6211c {

        /* renamed from: a */
        public static final oc2<String, String> f32667a;

        static {
            wx4.C7195b bVar = wx4.C7195b.STRING;
            f32667a = oc2.m59242f(bVar, "", bVar, "");
        }
    }

    /* renamed from: com.onedelhi.secure.no2$d */
    public enum C6212d implements vs1.C7081c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: a */
        public static final vs1.C7082d<C6212d> f32669a = null;

        /* renamed from: o */
        public static final int f32680o = 0;

        /* renamed from: p */
        public static final int f32681p = 1;

        /* renamed from: q */
        public static final int f32682q = 2;

        /* renamed from: r */
        public static final int f32683r = 3;

        /* renamed from: s */
        public static final int f32684s = 4;

        /* renamed from: t */
        public static final int f32685t = 5;

        /* renamed from: u */
        public static final int f32686u = 6;

        /* renamed from: v */
        public static final int f32687v = 7;

        /* renamed from: w */
        public static final int f32688w = 8;

        /* renamed from: x */
        public static final int f32689x = 9;

        /* renamed from: n */
        public final int f32690n;

        /* renamed from: com.onedelhi.secure.no2$d$a */
        public class C6213a implements vs1.C7082d<C6212d> {
            /* renamed from: b */
            public C6212d mo32393a(int i) {
                return C6212d.m58630a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.no2$d$b */
        public static final class C6214b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f32691a = null;

            static {
                f32691a = new C6214b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C6212d.m58630a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f32669a = new C6213a();
        }

        /* access modifiers changed from: public */
        C6212d(int i) {
            this.f32690n = i;
        }

        /* renamed from: a */
        public static C6212d m58630a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static vs1.C7082d<C6212d> m58631b() {
            return f32669a;
        }

        /* renamed from: e */
        public static vs1.C7083e m58632e() {
            return C6214b.f32691a;
        }

        @Deprecated
        /* renamed from: g */
        public static C6212d m58633g(int i) {
            return m58630a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            return this.f32690n;
        }
    }

    /* renamed from: com.onedelhi.secure.no2$e */
    public enum C6215e implements vs1.C7081c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C6215e> f32693a = null;

        /* renamed from: o */
        public static final int f32696o = 0;

        /* renamed from: p */
        public static final int f32697p = 1;

        /* renamed from: n */
        public final int f32698n;

        /* renamed from: com.onedelhi.secure.no2$e$a */
        public class C6216a implements vs1.C7082d<C6215e> {
            /* renamed from: b */
            public C6215e mo32393a(int i) {
                return C6215e.m58638a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.no2$e$b */
        public static final class C6217b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f32699a = null;

            static {
                f32699a = new C6217b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C6215e.m58638a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f32693a = new C6216a();
        }

        /* access modifiers changed from: public */
        C6215e(int i) {
            this.f32698n = i;
        }

        /* renamed from: a */
        public static C6215e m58638a(int i) {
            if (i == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        /* renamed from: b */
        public static vs1.C7082d<C6215e> m58639b() {
            return f32693a;
        }

        /* renamed from: e */
        public static vs1.C7083e m58640e() {
            return C6217b.f32699a;
        }

        @Deprecated
        /* renamed from: g */
        public static C6215e m58641g(int i) {
            return m58638a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            return this.f32698n;
        }
    }

    static {
        no2 no2 = new no2();
        DEFAULT_INSTANCE = no2;
        qe1.m62492dk(no2.class, no2);
    }

    /* renamed from: bl */
    public static no2 m58453bl() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: hl */
    public static C6210b m58457hl() {
        return (C6210b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: il */
    public static C6210b m58459il(no2 no2) {
        return (C6210b) DEFAULT_INSTANCE.mo43358gj(no2);
    }

    /* renamed from: jl */
    public static no2 m58461jl(InputStream inputStream) throws IOException {
        return (no2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: kl */
    public static no2 m58463kl(InputStream inputStream, zy0 zy0) throws IOException {
        return (no2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ll */
    public static no2 m58465ll(C5173er erVar) throws nt1 {
        return (no2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: ml */
    public static no2 m58467ml(C5173er erVar, zy0 zy0) throws nt1 {
        return (no2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: nl */
    public static no2 m58469nl(g00 g00) throws IOException {
        return (no2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: ol */
    public static no2 m58471ol(g00 g00, zy0 zy0) throws IOException {
        return (no2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: pl */
    public static no2 m58473pl(InputStream inputStream) throws IOException {
        return (no2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ql */
    public static no2 m58475ql(InputStream inputStream, zy0 zy0) throws IOException {
        return (no2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rl */
    public static no2 m58477rl(ByteBuffer byteBuffer) throws nt1 {
        return (no2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: sl */
    public static no2 m58479sl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (no2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: tl */
    public static no2 m58481tl(byte[] bArr) throws nt1 {
        return (no2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: ul */
    public static no2 m58483ul(byte[] bArr, zy0 zy0) throws nt1 {
        return (no2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: vl */
    public static cz2<no2> m58485vl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ab */
    public boolean mo41314Ab() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: Al */
    public final void mo41315Al(C6215e eVar) {
        this.networkClientErrorReason_ = eVar.mo32392j();
        this.bitField0_ |= 16;
    }

    /* renamed from: B0 */
    public int mo41316B0() {
        return this.perfSessions_.size();
    }

    /* renamed from: Bl */
    public final void mo41317Bl(int i, h13 h13) {
        h13.getClass();
        mo41360al();
        this.perfSessions_.set(i, h13);
    }

    /* renamed from: Cg */
    public boolean mo41318Cg() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: Cl */
    public final void mo41319Cl(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* renamed from: Dl */
    public final void mo41320Dl(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* renamed from: El */
    public final void mo41321El(C5173er erVar) {
        this.responseContentType_ = erVar.mo35543k0();
        this.bitField0_ |= 64;
    }

    /* renamed from: Fl */
    public final void mo41322Fl(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* renamed from: G9 */
    public long mo41323G9() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: Gl */
    public final void mo41324Gl(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    /* renamed from: H0 */
    public List<h13> mo41325H0() {
        return this.perfSessions_;
    }

    /* renamed from: H9 */
    public C6212d mo41326H9() {
        C6212d a = C6212d.m58630a(this.httpMethod_);
        return a == null ? C6212d.HTTP_METHOD_UNKNOWN : a;
    }

    /* renamed from: Hl */
    public final void mo41327Hl(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    /* renamed from: I0 */
    public C5173er mo41328I0() {
        return C5173er.m47136w(this.url_);
    }

    /* renamed from: Il */
    public final void mo41329Il(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* renamed from: Jl */
    public final void mo41330Jl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* renamed from: Kl */
    public final void mo41331Kl(C5173er erVar) {
        this.url_ = erVar.mo35543k0();
        this.bitField0_ |= 1;
    }

    /* renamed from: Lk */
    public final void mo41332Lk(Iterable<? extends h13> iterable) {
        mo41360al();
        C7403z0.m72412X6(iterable, this.perfSessions_);
    }

    /* renamed from: M5 */
    public String mo41333M5() {
        return this.responseContentType_;
    }

    /* renamed from: Mk */
    public final void mo41334Mk(int i, h13 h13) {
        h13.getClass();
        mo41360al();
        this.perfSessions_.add(i, h13);
    }

    /* renamed from: N */
    public boolean mo41335N(String str) {
        str.getClass();
        return mo41366fl().containsKey(str);
    }

    /* renamed from: N4 */
    public boolean mo41336N4() {
        return (this.bitField0_ & 16) != 0;
    }

    /* renamed from: Nk */
    public final void mo41337Nk(h13 h13) {
        h13.getClass();
        mo41360al();
        this.perfSessions_.add(h13);
    }

    /* renamed from: Ok */
    public final void mo41338Ok() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0;
    }

    /* renamed from: P8 */
    public boolean mo41339P8() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: Pk */
    public final void mo41340Pk() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* renamed from: Qk */
    public final void mo41341Qk() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* renamed from: R8 */
    public boolean mo41342R8() {
        return (this.bitField0_ & 256) != 0;
    }

    /* renamed from: Rk */
    public final void mo41343Rk() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* renamed from: S */
    public Map<String, String> mo41344S() {
        return Collections.unmodifiableMap(mo41366fl());
    }

    /* renamed from: Sk */
    public final void mo41345Sk() {
        this.perfSessions_ = qe1.m62499pj();
    }

    /* renamed from: Tk */
    public final void mo41346Tk() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0;
    }

    /* renamed from: Uk */
    public final void mo41347Uk() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m58453bl().mo41333M5();
    }

    /* renamed from: Vk */
    public final void mo41348Vk() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0;
    }

    /* renamed from: W3 */
    public boolean mo41349W3() {
        return (this.bitField0_ & 64) != 0;
    }

    /* renamed from: Wk */
    public final void mo41350Wk() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0;
    }

    @Deprecated
    /* renamed from: X */
    public Map<String, String> mo41351X() {
        return mo41344S();
    }

    /* renamed from: Xk */
    public final void mo41352Xk() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0;
    }

    /* renamed from: Y1 */
    public long mo41353Y1() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: Yk */
    public final void mo41354Yk() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0;
    }

    /* renamed from: Z5 */
    public long mo41355Z5() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: Zk */
    public final void mo41356Zk() {
        this.bitField0_ &= -2;
        this.url_ = m58453bl().mo41374t0();
    }

    /* renamed from: a0 */
    public String mo41357a0(String str, String str2) {
        str.getClass();
        rc2<String, String> fl = mo41366fl();
        return fl.containsKey(str) ? fl.get(str) : str2;
    }

    /* renamed from: a2 */
    public h13 mo41358a2(int i) {
        return this.perfSessions_.get(i);
    }

    /* renamed from: a8 */
    public C6215e mo41359a8() {
        C6215e a = C6215e.m58638a(this.networkClientErrorReason_);
        return a == null ? C6215e.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : a;
    }

    /* renamed from: al */
    public final void mo41360al() {
        vs1.C7095k<h13> kVar = this.perfSessions_;
        if (!kVar.mo36500p()) {
            this.perfSessions_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: be */
    public C5173er mo41361be() {
        return C5173er.m47136w(this.responseContentType_);
    }

    /* renamed from: cl */
    public final Map<String, String> mo41362cl() {
        return mo41367gl();
    }

    /* renamed from: dl */
    public i13 mo41363dl(int i) {
        return this.perfSessions_.get(i);
    }

    /* renamed from: el */
    public List<? extends i13> mo41364el() {
        return this.perfSessions_;
    }

    /* renamed from: f2 */
    public boolean mo41365f2() {
        return (this.bitField0_ & 128) != 0;
    }

    /* renamed from: fl */
    public final rc2<String, String> mo41366fl() {
        return this.customAttributes_;
    }

    /* renamed from: gl */
    public final rc2<String, String> mo41367gl() {
        if (!this.customAttributes_.mo43841n()) {
            this.customAttributes_ = this.customAttributes_.mo43846q();
        }
        return this.customAttributes_;
    }

    /* renamed from: h0 */
    public int mo41368h0() {
        return mo41366fl().size();
    }

    /* renamed from: h7 */
    public boolean mo41369h7() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6209a.f32666a[iVar.ordinal()]) {
            case 1:
                return new no2();
            case 2:
                return new C6210b((C6209a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", C6212d.m58632e(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", C6215e.m58640e(), "customAttributes_", C6211c.f32667a, "perfSessions_", h13.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<no2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (no2.class) {
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

    /* renamed from: l0 */
    public String mo41370l0(String str) {
        str.getClass();
        rc2<String, String> fl = mo41366fl();
        if (fl.containsKey(str)) {
            return fl.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: la */
    public long mo41371la() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: lc */
    public boolean mo41372lc() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* renamed from: md */
    public int mo41373md() {
        return this.httpResponseCode_;
    }

    /* renamed from: t0 */
    public String mo41374t0() {
        return this.url_;
    }

    /* renamed from: wl */
    public final void mo41375wl(int i) {
        mo41360al();
        this.perfSessions_.remove(i);
    }

    /* renamed from: x6 */
    public long mo41376x6() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: xl */
    public final void mo41377xl(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* renamed from: y4 */
    public boolean mo41378y4() {
        return (this.bitField0_ & 512) != 0;
    }

    /* renamed from: yc */
    public boolean mo41379yc() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: yl */
    public final void mo41380yl(C6212d dVar) {
        this.httpMethod_ = dVar.mo32392j();
        this.bitField0_ |= 2;
    }

    /* renamed from: zc */
    public long mo41381zc() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: zl */
    public final void mo41382zl(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }
}
