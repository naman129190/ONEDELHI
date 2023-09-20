package com.delhitransport.onedelhi.networking;

import com.delhitransport.onedelhi.models.auth.CreateResponse;
import com.delhitransport.onedelhi.models.auth.VerifyRequest;
import com.delhitransport.onedelhi.models.auth.VerifyResponse;
import com.onedelhi.secure.C3400rc;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import org.json.JSONObject;

/* renamed from: com.delhitransport.onedelhi.networking.d */
public class C1338d {

    /* renamed from: a */
    public static C1338d f7081a;

    /* renamed from: a */
    public final C3400rc f7082a = ((C3400rc) ApiClient.m8530k(C3400rc.class));

    /* renamed from: com.delhitransport.onedelhi.networking.d$a */
    public class C1339a implements C7181ws<CreateResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7084a;

        public C1339a(lm2 lm2) {
            this.f7084a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<CreateResponse> qsVar, @mr2 Throwable th) {
            this.f7084a.mo4933q(null);
            String a = pj0.m61166a(-125210193925959L);
            s41.m27245c(a, pj0.m61166a(-125283208369991L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<CreateResponse> qsVar, @mr2 el3<CreateResponse> el3) {
            String str;
            long j;
            StringBuilder sb;
            if (el3.mo35472g()) {
                this.f7084a.mo4933q(el3.mo35468a());
                return;
            }
            if (el3.mo35469b() >= 500 || el3.mo35469b() < 400) {
                this.f7084a.mo4933q(null);
                str = pj0.m61166a(-125107114710855L);
                sb = new StringBuilder();
                j = -125180129154887L;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(el3.mo35470e().string());
                    CreateResponse createResponse = new CreateResponse();
                    createResponse.setMessage(jSONObject.getString(pj0.m61166a(-124888071378759L)));
                    createResponse.setDescription(jSONObject.getString(pj0.m61166a(-124922431117127L)));
                    this.f7084a.mo4933q(createResponse);
                } catch (Exception e) {
                    System.out.println(e.toString());
                    this.f7084a.mo4933q(null);
                    s41.m27244b(e, pj0.m61166a(-124973970724679L) + el3.toString());
                }
                str = pj0.m61166a(-125004035495751L);
                sb = new StringBuilder();
                j = -125077049939783L;
            }
            sb.append(pj0.m61166a(j));
            sb.append(el3.toString());
            s41.m27245c(str, sb.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.d$b */
    public class C1340b implements C7181ws<VerifyResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7086a;

        public C1340b(lm2 lm2) {
            this.f7086a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<VerifyResponse> qsVar, @mr2 Throwable th) {
            this.f7086a.mo4933q(null);
            String a = pj0.m61166a(-125643985622855L);
            s41.m27245c(a, pj0.m61166a(-125717000066887L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<VerifyResponse> qsVar, @mr2 el3<VerifyResponse> el3) {
            String str;
            long j;
            StringBuilder sb;
            if (el3.mo35472g()) {
                this.f7086a.mo4933q(el3.mo35468a());
                return;
            }
            if (el3.mo35469b() >= 500 || el3.mo35469b() < 400) {
                this.f7086a.mo4933q(null);
                str = pj0.m61166a(-125540906407751L);
                sb = new StringBuilder();
                j = -125613920851783L;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(el3.mo35470e().string());
                    VerifyResponse verifyResponse = new VerifyResponse();
                    verifyResponse.setMessage(jSONObject.getString(pj0.m61166a(-125321863075655L)));
                    verifyResponse.setDescription(jSONObject.getString(pj0.m61166a(-125356222814023L)));
                    this.f7086a.mo4933q(verifyResponse);
                } catch (Exception e) {
                    s41.m27244b(e, pj0.m61166a(-125407762421575L) + el3.toString());
                    this.f7086a.mo4933q(null);
                }
                str = pj0.m61166a(-125437827192647L);
                sb = new StringBuilder();
                j = -125510841636679L;
            }
            sb.append(pj0.m61166a(j));
            sb.append(el3.toString());
            s41.m27245c(str, sb.toString());
        }
    }

    /* renamed from: b */
    public static C1338d m8535b() {
        if (f7081a == null) {
            f7081a = new C1338d();
        }
        return f7081a;
    }

    /* renamed from: a */
    public lm2<CreateResponse> mo8644a(long j) {
        lm2<CreateResponse> lm2 = new lm2<>();
        this.f7082a.mo23792b(j).mo14269jh(new C1339a(lm2));
        return lm2;
    }

    /* renamed from: c */
    public lm2<VerifyResponse> mo8645c(long j, VerifyRequest verifyRequest) {
        lm2<VerifyResponse> lm2 = new lm2<>();
        this.f7082a.mo23791a(j, verifyRequest).mo14269jh(new C1340b(lm2));
        return lm2;
    }
}
