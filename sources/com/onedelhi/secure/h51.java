package com.onedelhi.secure;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

public final class h51 {

    /* renamed from: h */
    public static final String f29459h = "google_api_key";

    /* renamed from: i */
    public static final String f29460i = "google_app_id";

    /* renamed from: j */
    public static final String f29461j = "firebase_database_url";

    /* renamed from: k */
    public static final String f29462k = "ga_trackingId";

    /* renamed from: l */
    public static final String f29463l = "gcm_defaultSenderId";

    /* renamed from: m */
    public static final String f29464m = "google_storage_bucket";

    /* renamed from: n */
    public static final String f29465n = "project_id";

    /* renamed from: a */
    public final String f29466a;

    /* renamed from: b */
    public final String f29467b;

    /* renamed from: c */
    public final String f29468c;

    /* renamed from: d */
    public final String f29469d;

    /* renamed from: e */
    public final String f29470e;

    /* renamed from: f */
    public final String f29471f;

    /* renamed from: g */
    public final String f29472g;

    /* renamed from: com.onedelhi.secure.h51$b */
    public static final class C5481b {

        /* renamed from: a */
        public String f29473a;

        /* renamed from: b */
        public String f29474b;

        /* renamed from: c */
        public String f29475c;

        /* renamed from: d */
        public String f29476d;

        /* renamed from: e */
        public String f29477e;

        /* renamed from: f */
        public String f29478f;

        /* renamed from: g */
        public String f29479g;

        public C5481b() {
        }

        public C5481b(@mr2 h51 h51) {
            this.f29474b = h51.f29467b;
            this.f29473a = h51.f29466a;
            this.f29475c = h51.f29468c;
            this.f29476d = h51.f29469d;
            this.f29477e = h51.f29470e;
            this.f29478f = h51.f29471f;
            this.f29479g = h51.f29472g;
        }

        @mr2
        /* renamed from: a */
        public h51 mo37199a() {
            return new h51(this.f29474b, this.f29473a, this.f29475c, this.f29476d, this.f29477e, this.f29478f, this.f29479g);
        }

        @mr2
        /* renamed from: b */
        public C5481b mo37200b(@mr2 String str) {
            this.f29473a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @mr2
        /* renamed from: c */
        public C5481b mo37201c(@mr2 String str) {
            this.f29474b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @mr2
        /* renamed from: d */
        public C5481b mo37202d(@ts2 String str) {
            this.f29475c = str;
            return this;
        }

        @mr2
        @KeepForSdk
        /* renamed from: e */
        public C5481b mo37203e(@ts2 String str) {
            this.f29476d = str;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C5481b mo37204f(@ts2 String str) {
            this.f29477e = str;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C5481b mo37205g(@ts2 String str) {
            this.f29479g = str;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C5481b mo37206h(@ts2 String str) {
            this.f29478f = str;
            return this;
        }
    }

    public h51(@mr2 String str, @mr2 String str2, @ts2 String str3, @ts2 String str4, @ts2 String str5, @ts2 String str6, @ts2 String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f29467b = str;
        this.f29466a = str2;
        this.f29468c = str3;
        this.f29469d = str4;
        this.f29470e = str5;
        this.f29471f = str6;
        this.f29472g = str7;
    }

    @ts2
    /* renamed from: h */
    public static h51 m50239h(@mr2 Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(f29460i);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new h51(string, stringResourceValueReader.getString(f29459h), stringResourceValueReader.getString(f29461j), stringResourceValueReader.getString(f29462k), stringResourceValueReader.getString(f29463l), stringResourceValueReader.getString(f29464m), stringResourceValueReader.getString(f29465n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h51)) {
            return false;
        }
        h51 h51 = (h51) obj;
        return Objects.equal(this.f29467b, h51.f29467b) && Objects.equal(this.f29466a, h51.f29466a) && Objects.equal(this.f29468c, h51.f29468c) && Objects.equal(this.f29469d, h51.f29469d) && Objects.equal(this.f29470e, h51.f29470e) && Objects.equal(this.f29471f, h51.f29471f) && Objects.equal(this.f29472g, h51.f29472g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f29467b, this.f29466a, this.f29468c, this.f29469d, this.f29470e, this.f29471f, this.f29472g);
    }

    @mr2
    /* renamed from: i */
    public String mo37191i() {
        return this.f29466a;
    }

    @mr2
    /* renamed from: j */
    public String mo37192j() {
        return this.f29467b;
    }

    @ts2
    /* renamed from: k */
    public String mo37193k() {
        return this.f29468c;
    }

    @KeepForSdk
    @ts2
    /* renamed from: l */
    public String mo37194l() {
        return this.f29469d;
    }

    @ts2
    /* renamed from: m */
    public String mo37195m() {
        return this.f29470e;
    }

    @ts2
    /* renamed from: n */
    public String mo37196n() {
        return this.f29472g;
    }

    @ts2
    /* renamed from: o */
    public String mo37197o() {
        return this.f29471f;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f29467b).add("apiKey", this.f29466a).add("databaseUrl", this.f29468c).add("gcmSenderId", this.f29470e).add("storageBucket", this.f29471f).add("projectId", this.f29472g).toString();
    }
}
