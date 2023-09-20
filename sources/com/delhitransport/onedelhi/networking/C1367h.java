package com.delhitransport.onedelhi.networking;

import com.delhitransport.onedelhi.models.freshdesk.FreshDeskRequest;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskTicketResponse;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import com.onedelhi.secure.vb1;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: com.delhitransport.onedelhi.networking.h */
public class C1367h {

    /* renamed from: a */
    public static C1367h f7142a;

    /* renamed from: a */
    public final vb1 f7143a = ((vb1) ApiClient.m8526g(vb1.class));

    /* renamed from: com.delhitransport.onedelhi.networking.h$a */
    public class C1368a implements C7181ws<FreshDeskTicketResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7145a;

        public C1368a(lm2 lm2) {
            this.f7145a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<FreshDeskTicketResponse> qsVar, Throwable th) {
            this.f7145a.mo4933q(null);
            String a = pj0.m61166a(-133031329371975L);
            s41.m27245c(a, pj0.m61166a(-133185948194631L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<FreshDeskTicketResponse> qsVar, el3<FreshDeskTicketResponse> el3) {
            if (el3.mo35472g()) {
                this.f7145a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7145a.mo4933q(null);
            String a = pj0.m61166a(-132846645778247L);
            s41.m27245c(a, pj0.m61166a(-133001264600903L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.h$b */
    public class C1369b implements C7181ws<FreshDeskTicketResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7147a;

        public C1369b(lm2 lm2) {
            this.f7147a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<FreshDeskTicketResponse> qsVar, Throwable th) {
            this.f7147a.mo4933q(null);
            String a = pj0.m61166a(-133469416036167L);
            s41.m27245c(a, pj0.m61166a(-133684164400967L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<FreshDeskTicketResponse> qsVar, el3<FreshDeskTicketResponse> el3) {
            if (el3.mo35472g()) {
                this.f7147a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7147a.mo4933q(null);
            String a = pj0.m61166a(-133224602900295L);
            s41.m27245c(a, pj0.m61166a(-133439351265095L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.h$c */
    public class C1370c implements C7181ws<List<FreshDeskTicketResponse>> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7149a;

        public C1370c(lm2 lm2) {
            this.f7149a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<List<FreshDeskTicketResponse>> qsVar, Throwable th) {
            this.f7149a.mo4933q(null);
            String a = pj0.m61166a(-133924682569543L);
            s41.m27245c(a, pj0.m61166a(-134096481261383L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<List<FreshDeskTicketResponse>> qsVar, el3<List<FreshDeskTicketResponse>> el3) {
            if (el3.mo35472g()) {
                this.f7149a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7149a.mo4933q(null);
            String a = pj0.m61166a(-133722819106631L);
            s41.m27245c(a, pj0.m61166a(-133894617798471L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.h$d */
    public class C1371d implements C7181ws<FreshDeskTicketResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7151a;

        public C1371d(lm2 lm2) {
            this.f7151a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<FreshDeskTicketResponse> qsVar, Throwable th) {
            this.f7151a.mo4933q(null);
            String a = pj0.m61166a(-134341294397255L);
            s41.m27245c(a, pj0.m61166a(-134525977990983L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<FreshDeskTicketResponse> qsVar, el3<FreshDeskTicketResponse> el3) {
            if (el3.mo35472g()) {
                this.f7151a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7151a.mo4933q(null);
            String a = pj0.m61166a(-134126546032455L);
            s41.m27245c(a, pj0.m61166a(-134311229626183L) + el3.toString());
        }
    }

    /* renamed from: d */
    public static C1367h m8616d() {
        if (f7142a == null) {
            f7142a = new C1367h();
        }
        return f7142a;
    }

    /* renamed from: a */
    public lm2<FreshDeskTicketResponse> mo8676a(FreshDeskRequest freshDeskRequest) {
        lm2<FreshDeskTicketResponse> lm2 = new lm2<>();
        this.f7143a.mo25996b(freshDeskRequest).mo14269jh(new C1368a(lm2));
        return lm2;
    }

    /* renamed from: b */
    public lm2<FreshDeskTicketResponse> mo8677b(FreshDeskRequest freshDeskRequest, String str) {
        lm2<FreshDeskTicketResponse> lm2 = new lm2<>();
        File file = new File(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        if (freshDeskRequest.getName() != null && !freshDeskRequest.getName().isEmpty()) {
            type.addFormDataPart(pj0.m61166a(-134564632696647L), freshDeskRequest.getName());
        }
        type.addFormDataPart(pj0.m61166a(-134586107533127L), freshDeskRequest.getSubject());
        if (freshDeskRequest.getPhone() != null && !freshDeskRequest.getPhone().isEmpty()) {
            type.addFormDataPart(pj0.m61166a(-134620467271495L), freshDeskRequest.getPhone());
        }
        type.addFormDataPart(pj0.m61166a(-134646237075271L), freshDeskRequest.getEmail());
        type.addFormDataPart(pj0.m61166a(-134672006879047L), freshDeskRequest.getDescription());
        type.addFormDataPart(pj0.m61166a(-134723546486599L), String.valueOf(freshDeskRequest.getPriority()));
        type.addFormDataPart(pj0.m61166a(-134762201192263L), String.valueOf(freshDeskRequest.getStatus()));
        type.addFormDataPart(pj0.m61166a(-134792265963335L), String.valueOf(freshDeskRequest.getSource()));
        type.addFormDataPart(pj0.m61166a(-134822330734407L), file.getName(), RequestBody.create(MediaType.parse(pj0.m61166a(-134882460276551L)), file));
        Iterator<String> it = freshDeskRequest.getTags().iterator();
        while (it.hasNext()) {
            type.addFormDataPart(pj0.m61166a(-134989834458951L), it.next());
        }
        this.f7143a.mo25999e(type.build()).mo14269jh(new C1369b(lm2));
        return lm2;
    }

    /* renamed from: c */
    public lm2<List<FreshDeskTicketResponse>> mo8678c(String str) {
        lm2<List<FreshDeskTicketResponse>> lm2 = new lm2<>();
        this.f7143a.mo25995a(str).mo14269jh(new C1370c(lm2));
        return lm2;
    }

    /* renamed from: e */
    public final RequestBody mo8679e(String str) {
        return RequestBody.create(MediaType.parse(pj0.m61166a(-135127273412423L)), str);
    }

    /* renamed from: f */
    public final RequestBody mo8680f(Integer num) {
        return RequestBody.create(MediaType.parse(pj0.m61166a(-135174518052679L)), String.valueOf(num));
    }

    /* renamed from: g */
    public final RequestBody mo8681g(File file) {
        return RequestBody.create(MediaType.parse(pj0.m61166a(-135019899230023L)), file);
    }

    /* renamed from: h */
    public lm2<FreshDeskTicketResponse> mo8682h(long j, FreshDeskRequest freshDeskRequest) {
        lm2<FreshDeskTicketResponse> lm2 = new lm2<>();
        this.f7143a.mo25998d(j, freshDeskRequest).mo14269jh(new C1371d(lm2));
        return lm2;
    }
}
