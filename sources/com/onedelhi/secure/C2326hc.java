package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* renamed from: com.onedelhi.secure.hc */
public final class C2326hc {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f13031a;
    @mr2

    /* renamed from: a */
    public static final Api.ClientKey f13032a;
    @ShowFirstParty
    @mr2
    @KeepForSdk
    @Deprecated

    /* renamed from: a */
    public static final Api<C2959nc> f13033a = C2854mc.f16062a;
    @ShowFirstParty
    @mr2
    @KeepForSdk
    @Deprecated

    /* renamed from: a */
    public static final h73 f13034a = C2854mc.f16063a;
    @mr2

    /* renamed from: a */
    public static final ob0 f13035a = new f85();
    @mr2

    /* renamed from: a */
    public static final vh1 f13036a = new e75();

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f13037b;
    @mr2

    /* renamed from: b */
    public static final Api.ClientKey f13038b;
    @mr2

    /* renamed from: b */
    public static final Api<C2327a> f13039b;
    @mr2

    /* renamed from: c */
    public static final Api<GoogleSignInOptions> f13040c;

    @Deprecated
    /* renamed from: com.onedelhi.secure.hc$a */
    public static class C2327a implements Api.ApiOptions.Optional {
        @mr2

        /* renamed from: a */
        public static final C2327a f13041a = new C2327a(new C2328a());

        /* renamed from: b */
        public final String f13042b = null;

        /* renamed from: b */
        public final boolean f13043b;
        @ts2

        /* renamed from: c */
        public final String f13044c;

        @Deprecated
        /* renamed from: com.onedelhi.secure.hc$a$a */
        public static class C2328a {
            @mr2

            /* renamed from: a */
            public Boolean f13045a = Boolean.FALSE;
            @ts2

            /* renamed from: a */
            public String f13046a;

            public C2328a() {
            }

            @ShowFirstParty
            public C2328a(@mr2 C2327a aVar) {
                String unused = aVar.f13042b;
                this.f13045a = Boolean.valueOf(aVar.f13043b);
                this.f13046a = aVar.f13044c;
            }

            @mr2
            /* renamed from: a */
            public C2328a mo17187a() {
                this.f13045a = Boolean.TRUE;
                return this;
            }

            @ShowFirstParty
            @mr2
            /* renamed from: b */
            public final C2328a mo17188b(@mr2 String str) {
                this.f13046a = str;
                return this;
            }
        }

        public C2327a(@mr2 C2328a aVar) {
            this.f13043b = aVar.f13045a.booleanValue();
            this.f13044c = aVar.f13046a;
        }

        @mr2
        /* renamed from: a */
        public final Bundle mo17183a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", (String) null);
            bundle.putBoolean("force_save_dialog", this.f13043b);
            bundle.putString("log_session_id", this.f13044c);
            return bundle;
        }

        @ts2
        /* renamed from: d */
        public final String mo17184d() {
            return this.f13044c;
        }

        public boolean equals(@ts2 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2327a)) {
                return false;
            }
            C2327a aVar = (C2327a) obj;
            String str = aVar.f13042b;
            return Objects.equal((Object) null, (Object) null) && this.f13043b == aVar.f13043b && Objects.equal(this.f13044c, aVar.f13044c);
        }

        public int hashCode() {
            return Objects.hashCode(null, Boolean.valueOf(this.f13043b), this.f13044c);
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f13032a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f13038b = clientKey2;
        o55 o55 = new o55();
        f13031a = o55;
        u65 u65 = new u65();
        f13037b = u65;
        f13039b = new Api<>("Auth.CREDENTIALS_API", o55, clientKey);
        f13040c = new Api<>("Auth.GOOGLE_SIGN_IN_API", u65, clientKey2);
    }
}
