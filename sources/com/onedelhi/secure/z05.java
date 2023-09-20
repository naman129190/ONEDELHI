package com.onedelhi.secure;

import com.onedelhi.secure.f05;
import com.phonepe.intent.sdk.api.B2BPGRequest;
import com.phonepe.intent.sdk.api.PhonePe;
import java.util.Map;
import jmjou.C7601c;

public final class z05 extends au4 implements t25 {
    @vr2

    /* renamed from: a */
    public final lm2<f05> f38155a = new lm2<>();
    @vr2

    /* renamed from: a */
    public final w12 f38156a = i22.m51739a(new C7409c(this));
    @ss2

    /* renamed from: a */
    public w15 f38157a;
    @ss2

    /* renamed from: a */
    public B2BPGRequest f38158a;
    @ss2

    /* renamed from: a */
    public C7601c f38159a;
    @vr2

    /* renamed from: b */
    public final w12 f38160b = i22.m51739a(new C7407a(this));
    @ss2

    /* renamed from: b */
    public String f38161b;
    @vr2

    /* renamed from: c */
    public final w12 f38162c = i22.m51739a(new C7410d(this));
    @vr2

    /* renamed from: d */
    public final w12 f38163d = i22.m51739a(new C7411e(this));
    @vr2

    /* renamed from: e */
    public final w12 f38164e = i22.m51739a(new C7408b(this));

    /* renamed from: com.onedelhi.secure.z05$a */
    public static final class C7407a extends d12 implements cc1<String> {

        /* renamed from: a */
        public final /* synthetic */ z05 f38165a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7407a(z05 z05) {
            super(0);
            this.f38165a = z05;
        }

        public Object invoke() {
            C7601c cVar = this.f38165a.f38159a;
            if (cVar == null) {
                return null;
            }
            return (String) cVar.mo48872h("com.phonepe.android.sdk.MerchantId");
        }
    }

    /* renamed from: com.onedelhi.secure.z05$b */
    public static final class C7408b extends d12 implements cc1<b35> {

        /* renamed from: a */
        public final /* synthetic */ z05 f38166a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7408b(z05 z05) {
            super(0);
            this.f38166a = z05;
        }

        public Object invoke() {
            return new b35((String) this.f38166a.f38160b.getValue(), (String) this.f38166a.f38162c.getValue(), (String) this.f38166a.f38163d.getValue());
        }
    }

    /* renamed from: com.onedelhi.secure.z05$c */
    public static final class C7409c extends d12 implements cc1<g15> {

        /* renamed from: a */
        public final /* synthetic */ z05 f38167a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7409c(z05 z05) {
            super(0);
            this.f38167a = z05;
        }

        public Object invoke() {
            C7601c cVar = this.f38167a.f38159a;
            if (cVar == null) {
                return null;
            }
            return (g15) cVar.mo48873i(g15.class);
        }
    }

    /* renamed from: com.onedelhi.secure.z05$d */
    public static final class C7410d extends d12 implements cc1<String> {

        /* renamed from: a */
        public final /* synthetic */ z05 f38168a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7410d(z05 z05) {
            super(0);
            this.f38168a = z05;
        }

        public Object invoke() {
            C7601c cVar = this.f38168a.f38159a;
            if (cVar == null) {
                return null;
            }
            return (String) cVar.mo48872h("transactionId");
        }
    }

    /* renamed from: com.onedelhi.secure.z05$e */
    public static final class C7411e extends d12 implements cc1<String> {

        /* renamed from: a */
        public final /* synthetic */ z05 f38169a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7411e(z05 z05) {
            super(0);
            this.f38169a = z05;
        }

        public Object invoke() {
            C7601c cVar = this.f38169a.f38159a;
            if (cVar == null) {
                return null;
            }
            return (String) cVar.mo48872h("merchantUserId");
        }
    }

    /* renamed from: b */
    public final b35 mo48098b() {
        return (b35) this.f38164e.getValue();
    }

    /* renamed from: c */
    public void mo30383c(int i, @ss2 String str) {
        this.f38155a.mo4933q(new f05.C5205b(new n15((a35) null, (v25) null, new s15(Integer.valueOf(i), jt1.m53745C("Something went wrong:", Integer.valueOf(i))), 3)));
    }

    /* renamed from: d */
    public final void mo48099d(@ss2 String str) {
        b35 b = mo48098b();
        String str2 = this.f38161b;
        b.getClass();
        Map W = id2.m52120W(yi4.m71797a("message", str), yi4.m71797a("targetPackageName", str2), yi4.m71797a("merchantId", b.f26121a), yi4.m71797a("merchantTransactionId", b.f26122b), yi4.m71797a("merchantUserId", b.f26123c));
        jt1.m53777p("B2B_PG_API_CALL_FAILED", "eventName");
        zz4 zz4 = (zz4) PhonePe.getObjectFactory().mo48873i(zz4.class);
        u25 b2 = zz4.mo48478b("B2B_PG_API_CALL_FAILED");
        if (W != null) {
            for (Map.Entry entry : W.entrySet()) {
                b2.mo45379a((String) entry.getKey(), entry.getValue());
            }
        }
        zz4.mo48477a(b2);
    }

    /* renamed from: e */
    public final void mo48100e(@ss2 String str, @ss2 String str2, @vr2 String str3) {
        jt1.m53777p(str3, "failureReason");
        b35 b = mo48098b();
        b.getClass();
        jt1.m53777p(str3, "failureReason");
        Map W = id2.m52120W(yi4.m71797a("intentUri", str), yi4.m71797a("targetPackageName", str2), yi4.m71797a("failureReason", str3), yi4.m71797a("merchantId", b.f26121a), yi4.m71797a("merchantTransactionId", b.f26122b), yi4.m71797a("merchantUserId", b.f26123c));
        jt1.m53777p("B2B_PG_OPEN_APP_FOR_INTENT_FAILED", "eventName");
        zz4 zz4 = (zz4) PhonePe.getObjectFactory().mo48873i(zz4.class);
        u25 b2 = zz4.mo48478b("B2B_PG_OPEN_APP_FOR_INTENT_FAILED");
        if (W != null) {
            for (Map.Entry entry : W.entrySet()) {
                b2.mo45379a((String) entry.getKey(), entry.getValue());
            }
        }
        zz4.mo48477a(b2);
    }

    /* renamed from: h */
    public void mo30387h(@ss2 String str) {
        this.f38155a.mo4933q(new f05.C5205b(new n15((a35) h15.fromJsonString(str, this.f38159a, a35.class), new v25(this.f38161b), (s15) null, 4)));
    }
}
