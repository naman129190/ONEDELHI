package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.onedelhi.secure.b9 */
public class C1767b9 {

    /* renamed from: a */
    public final j36 f9751a;

    @KeepForSdk
    /* renamed from: com.onedelhi.secure.b9$a */
    public static final class C1768a {
        @mr2
        @KeepForSdk

        /* renamed from: a */
        public static final String f9752a = "origin";
        @mr2
        @KeepForSdk

        /* renamed from: b */
        public static final String f9753b = "name";
        @mr2
        @KeepForSdk

        /* renamed from: c */
        public static final String f9754c = "value";
        @mr2
        @KeepForSdk

        /* renamed from: d */
        public static final String f9755d = "trigger_event_name";
        @mr2
        @KeepForSdk

        /* renamed from: e */
        public static final String f9756e = "trigger_timeout";
        @mr2
        @KeepForSdk

        /* renamed from: f */
        public static final String f9757f = "timed_out_event_name";
        @mr2
        @KeepForSdk

        /* renamed from: g */
        public static final String f9758g = "timed_out_event_params";
        @mr2
        @KeepForSdk

        /* renamed from: h */
        public static final String f9759h = "triggered_event_name";
        @mr2
        @KeepForSdk

        /* renamed from: i */
        public static final String f9760i = "triggered_event_params";
        @mr2
        @KeepForSdk

        /* renamed from: j */
        public static final String f9761j = "time_to_live";
        @mr2
        @KeepForSdk

        /* renamed from: k */
        public static final String f9762k = "expired_event_name";
        @mr2
        @KeepForSdk

        /* renamed from: l */
        public static final String f9763l = "expired_event_params";
        @mr2
        @KeepForSdk

        /* renamed from: m */
        public static final String f9764m = "creation_timestamp";
        @mr2
        @KeepForSdk

        /* renamed from: n */
        public static final String f9765n = "active";
        @mr2
        @KeepForSdk

        /* renamed from: o */
        public static final String f9766o = "triggered_timestamp";
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: com.onedelhi.secure.b9$b */
    public interface C1769b extends ue6 {
        @ShowFirstParty
        @KeepForSdk
        @ly4
        /* renamed from: a */
        void mo10735a(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: com.onedelhi.secure.b9$c */
    public interface C1770c extends xe6 {
        @ShowFirstParty
        @KeepForSdk
        @ly4
        /* renamed from: a */
        void mo10736a(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle, long j);
    }

    public C1767b9(j36 j36) {
        this.f9751a = j36;
    }

    @ShowFirstParty
    @mr2
    @wj3(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    /* renamed from: k */
    public static C1767b9 m11692k(@mr2 Context context) {
        return j36.m18100D(context, (String) null, (String) null, (String) null, (Bundle) null).mo18096A();
    }

    @mr2
    @wj3(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    /* renamed from: l */
    public static C1767b9 m11693l(@mr2 Context context, @mr2 String str, @mr2 String str2, @ts2 String str3, @mr2 Bundle bundle) {
        return j36.m18100D(context, str, str2, str3, bundle).mo18096A();
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: A */
    public void mo13538A(@mr2 C1770c cVar) {
        this.f9751a.mo18128p(cVar);
    }

    /* renamed from: B */
    public final void mo13539B(boolean z) {
        this.f9751a.mo18121i(z);
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo13540a(@mr2 @qz3(min = 1) String str) {
        this.f9751a.mo18108S(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo13541b(@mr2 @qz3(max = 24, min = 1) String str, @ts2 String str2, @ts2 Bundle bundle) {
        this.f9751a.mo18109T(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo13542c(@mr2 @qz3(min = 1) String str) {
        this.f9751a.mo18110U(str);
    }

    @KeepForSdk
    /* renamed from: d */
    public long mo13543d() {
        return this.f9751a.mo18135y();
    }

    @KeepForSdk
    @ts2
    /* renamed from: e */
    public String mo13544e() {
        return this.f9751a.mo18100H();
    }

    @KeepForSdk
    @ts2
    /* renamed from: f */
    public String mo13545f() {
        return this.f9751a.mo18102J();
    }

    @mr2
    @ly4
    @KeepForSdk
    /* renamed from: g */
    public List<Bundle> mo13546g(@ts2 String str, @ts2 @qz3(max = 23, min = 1) String str2) {
        return this.f9751a.mo18106N(str, str2);
    }

    @KeepForSdk
    @ts2
    /* renamed from: h */
    public String mo13547h() {
        return this.f9751a.mo18103K();
    }

    @KeepForSdk
    @ts2
    /* renamed from: i */
    public String mo13548i() {
        return this.f9751a.mo18104L();
    }

    @KeepForSdk
    @ts2
    /* renamed from: j */
    public String mo13549j() {
        return this.f9751a.mo18105M();
    }

    @KeepForSdk
    @ly4
    /* renamed from: m */
    public int mo13550m(@mr2 @qz3(min = 1) String str) {
        return this.f9751a.mo18134x(str);
    }

    @mr2
    @ly4
    @KeepForSdk
    /* renamed from: n */
    public Map<String, Object> mo13551n(@ts2 String str, @ts2 @qz3(max = 24, min = 1) String str2, boolean z) {
        return this.f9751a.mo18107O(str, str2, z);
    }

    @KeepForSdk
    /* renamed from: o */
    public void mo13552o(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle) {
        this.f9751a.mo18112W(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: p */
    public void mo13553p(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle, long j) {
        this.f9751a.mo18113a(str, str2, bundle, j);
    }

    @KeepForSdk
    @ts2
    /* renamed from: q */
    public void mo13554q(@mr2 Bundle bundle) {
        this.f9751a.mo18136z(bundle, false);
    }

    @KeepForSdk
    @ts2
    /* renamed from: r */
    public Bundle mo13555r(@mr2 Bundle bundle) {
        return this.f9751a.mo18136z(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: s */
    public void mo13556s(@mr2 C1770c cVar) {
        this.f9751a.mo18115c(cVar);
    }

    @KeepForSdk
    /* renamed from: t */
    public void mo13557t(@mr2 Bundle bundle) {
        this.f9751a.mo18117e(bundle);
    }

    @KeepForSdk
    /* renamed from: u */
    public void mo13558u(@mr2 Bundle bundle) {
        this.f9751a.mo18118f(bundle);
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo13559v(@mr2 Activity activity, @ts2 @qz3(max = 36, min = 1) String str, @ts2 @qz3(max = 36, min = 1) String str2) {
        this.f9751a.mo18120h(activity, str, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    @ly4
    /* renamed from: w */
    public void mo13560w(@mr2 C1769b bVar) {
        this.f9751a.mo18123k(bVar);
    }

    @KeepForSdk
    /* renamed from: x */
    public void mo13561x(@ts2 Boolean bool) {
        this.f9751a.mo18124l(bool);
    }

    @KeepForSdk
    /* renamed from: y */
    public void mo13562y(boolean z) {
        this.f9751a.mo18124l(Boolean.valueOf(z));
    }

    @KeepForSdk
    /* renamed from: z */
    public void mo13563z(@mr2 String str, @mr2 String str2, @mr2 Object obj) {
        this.f9751a.mo18127o(str, str2, obj, true);
    }
}
