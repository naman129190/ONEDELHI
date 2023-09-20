package com.onedelhi.secure;

import com.onedelhi.secure.vh3;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.mf */
public final class C6107mf implements o50 {

    /* renamed from: a */
    public static final int f32094a = 2;

    /* renamed from: a */
    public static final o50 f32095a = new C6107mf();

    /* renamed from: com.onedelhi.secure.mf$a */
    public static final class C6108a implements kt2<fi2> {

        /* renamed from: a */
        public static final C6108a f32096a = new C6108a();

        /* renamed from: a */
        public static final v11 f32097a = v11.m67579a("projectNumber").mo45928b(C6526qb.m62358b().mo43286d(1).mo43284a()).mo45927a();

        /* renamed from: b */
        public static final v11 f32098b = v11.m67579a("messageId").mo45928b(C6526qb.m62358b().mo43286d(2).mo43284a()).mo45927a();

        /* renamed from: c */
        public static final v11 f32099c = v11.m67579a("instanceId").mo45928b(C6526qb.m62358b().mo43286d(3).mo43284a()).mo45927a();

        /* renamed from: d */
        public static final v11 f32100d = v11.m67579a("messageType").mo45928b(C6526qb.m62358b().mo43286d(4).mo43284a()).mo45927a();

        /* renamed from: e */
        public static final v11 f32101e = v11.m67579a("sdkPlatform").mo45928b(C6526qb.m62358b().mo43286d(5).mo43284a()).mo45927a();

        /* renamed from: f */
        public static final v11 f32102f = v11.m67579a(vh3.C7051b.f36563S).mo45928b(C6526qb.m62358b().mo43286d(6).mo43284a()).mo45927a();

        /* renamed from: g */
        public static final v11 f32103g = v11.m67579a("collapseKey").mo45928b(C6526qb.m62358b().mo43286d(7).mo43284a()).mo45927a();

        /* renamed from: h */
        public static final v11 f32104h = v11.m67579a("priority").mo45928b(C6526qb.m62358b().mo43286d(8).mo43284a()).mo45927a();

        /* renamed from: i */
        public static final v11 f32105i = v11.m67579a("ttl").mo45928b(C6526qb.m62358b().mo43286d(9).mo43284a()).mo45927a();

        /* renamed from: j */
        public static final v11 f32106j = v11.m67579a("topic").mo45928b(C6526qb.m62358b().mo43286d(10).mo43284a()).mo45927a();

        /* renamed from: k */
        public static final v11 f32107k = v11.m67579a("bulkId").mo45928b(C6526qb.m62358b().mo43286d(11).mo43284a()).mo45927a();

        /* renamed from: l */
        public static final v11 f32108l = v11.m67579a("event").mo45928b(C6526qb.m62358b().mo43286d(12).mo43284a()).mo45927a();

        /* renamed from: m */
        public static final v11 f32109m = v11.m67579a("analyticsLabel").mo45928b(C6526qb.m62358b().mo43286d(13).mo43284a()).mo45927a();

        /* renamed from: n */
        public static final v11 f32110n = v11.m67579a("campaignId").mo45928b(C6526qb.m62358b().mo43286d(14).mo43284a()).mo45927a();

        /* renamed from: o */
        public static final v11 f32111o = v11.m67579a("composerLabel").mo45928b(C6526qb.m62358b().mo43286d(15).mo43284a()).mo45927a();

        /* renamed from: b */
        public void mo17710a(fi2 fi2, lt2 lt2) throws IOException {
            lt2.mo39577t(f32097a, fi2.mo35972m());
            lt2.mo39575r(f32098b, fi2.mo35968i());
            lt2.mo39575r(f32099c, fi2.mo35967h());
            lt2.mo39575r(f32100d, fi2.mo35969j());
            lt2.mo39575r(f32101e, fi2.mo35973n());
            lt2.mo39575r(f32102f, fi2.mo35970k());
            lt2.mo39575r(f32103g, fi2.mo35964d());
            lt2.mo39571k(f32104h, fi2.mo35971l());
            lt2.mo39571k(f32105i, fi2.mo35975p());
            lt2.mo39575r(f32106j, fi2.mo35974o());
            lt2.mo39577t(f32107k, fi2.mo35962b());
            lt2.mo39575r(f32108l, fi2.mo35966g());
            lt2.mo39575r(f32109m, fi2.mo35961a());
            lt2.mo39577t(f32110n, fi2.mo35963c());
            lt2.mo39575r(f32111o, fi2.mo35965e());
        }
    }

    /* renamed from: com.onedelhi.secure.mf$b */
    public static final class C6109b implements kt2<gi2> {

        /* renamed from: a */
        public static final C6109b f32112a = new C6109b();

        /* renamed from: a */
        public static final v11 f32113a = v11.m67579a("messagingClientEvent").mo45928b(C6526qb.m62358b().mo43286d(1).mo43284a()).mo45927a();

        /* renamed from: b */
        public void mo17710a(gi2 gi2, lt2 lt2) throws IOException {
            lt2.mo39575r(f32113a, gi2.mo36746c());
        }
    }

    /* renamed from: com.onedelhi.secure.mf$c */
    public static final class C6110c implements kt2<k63> {

        /* renamed from: a */
        public static final C6110c f32114a = new C6110c();

        /* renamed from: a */
        public static final v11 f32115a = v11.m67580d("messagingClientEventExtension");

        /* renamed from: b */
        public void mo17710a(k63 k63, lt2 lt2) throws IOException {
            lt2.mo39575r(f32115a, k63.mo39063c());
        }
    }

    /* renamed from: a */
    public void mo17709a(du0<?> du0) {
        du0.mo34632a(k63.class, C6110c.f32114a);
        du0.mo34632a(gi2.class, C6109b.f32112a);
        du0.mo34632a(fi2.class, C6108a.f32096a);
    }
}
