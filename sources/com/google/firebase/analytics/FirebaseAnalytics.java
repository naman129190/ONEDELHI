package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.hs5;
import com.onedelhi.secure.j36;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mx5;
import com.onedelhi.secure.n41;
import com.onedelhi.secure.pa5;
import com.onedelhi.secure.qz3;
import com.onedelhi.secure.sl5;
import com.onedelhi.secure.ti6;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.wj3;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class FirebaseAnalytics {

    /* renamed from: a */
    public static volatile FirebaseAnalytics f24888a;

    /* renamed from: a */
    public final j36 f24889a;

    /* renamed from: a */
    public ExecutorService f24890a;

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    public enum C4302a {
        GRANTED,
        DENIED
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    public enum C4303b {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$c */
    public static class C4304c {
        @mr2

        /* renamed from: A */
        public static final String f24897A = "screen_view";
        @mr2

        /* renamed from: B */
        public static final String f24898B = "remove_from_cart";
        @mr2

        /* renamed from: C */
        public static final String f24899C = "add_shipping_info";
        @mr2

        /* renamed from: D */
        public static final String f24900D = "purchase";
        @mr2

        /* renamed from: E */
        public static final String f24901E = "refund";
        @mr2

        /* renamed from: F */
        public static final String f24902F = "select_item";
        @mr2

        /* renamed from: G */
        public static final String f24903G = "select_promotion";
        @mr2

        /* renamed from: H */
        public static final String f24904H = "view_cart";
        @mr2

        /* renamed from: I */
        public static final String f24905I = "view_promotion";
        @mr2

        /* renamed from: a */
        public static final String f24906a = "ad_impression";
        @mr2

        /* renamed from: b */
        public static final String f24907b = "add_payment_info";
        @mr2

        /* renamed from: c */
        public static final String f24908c = "add_to_cart";
        @mr2

        /* renamed from: d */
        public static final String f24909d = "add_to_wishlist";
        @mr2

        /* renamed from: e */
        public static final String f24910e = "app_open";
        @mr2

        /* renamed from: f */
        public static final String f24911f = "begin_checkout";
        @mr2

        /* renamed from: g */
        public static final String f24912g = "campaign_details";
        @mr2

        /* renamed from: h */
        public static final String f24913h = "generate_lead";
        @mr2

        /* renamed from: i */
        public static final String f24914i = "join_group";
        @mr2

        /* renamed from: j */
        public static final String f24915j = "level_end";
        @mr2

        /* renamed from: k */
        public static final String f24916k = "level_start";
        @mr2

        /* renamed from: l */
        public static final String f24917l = "level_up";
        @mr2

        /* renamed from: m */
        public static final String f24918m = "login";
        @mr2

        /* renamed from: n */
        public static final String f24919n = "post_score";
        @mr2

        /* renamed from: o */
        public static final String f24920o = "search";
        @mr2

        /* renamed from: p */
        public static final String f24921p = "select_content";
        @mr2

        /* renamed from: q */
        public static final String f24922q = "share";
        @mr2

        /* renamed from: r */
        public static final String f24923r = "sign_up";
        @mr2

        /* renamed from: s */
        public static final String f24924s = "spend_virtual_currency";
        @mr2

        /* renamed from: t */
        public static final String f24925t = "tutorial_begin";
        @mr2

        /* renamed from: u */
        public static final String f24926u = "tutorial_complete";
        @mr2

        /* renamed from: v */
        public static final String f24927v = "unlock_achievement";
        @mr2

        /* renamed from: w */
        public static final String f24928w = "view_item";
        @mr2

        /* renamed from: x */
        public static final String f24929x = "view_item_list";
        @mr2

        /* renamed from: y */
        public static final String f24930y = "view_search_results";
        @mr2

        /* renamed from: z */
        public static final String f24931z = "earn_virtual_currency";
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$d */
    public static class C4305d {
        @mr2

        /* renamed from: A */
        public static final String f24932A = "origin";
        @mr2

        /* renamed from: B */
        public static final String f24933B = "price";
        @mr2

        /* renamed from: C */
        public static final String f24934C = "quantity";
        @mr2

        /* renamed from: D */
        public static final String f24935D = "score";
        @mr2

        /* renamed from: E */
        public static final String f24936E = "shipping";
        @mr2

        /* renamed from: F */
        public static final String f24937F = "transaction_id";
        @mr2

        /* renamed from: G */
        public static final String f24938G = "search_term";
        @mr2

        /* renamed from: H */
        public static final String f24939H = "success";
        @mr2

        /* renamed from: I */
        public static final String f24940I = "tax";
        @mr2

        /* renamed from: J */
        public static final String f24941J = "value";
        @mr2

        /* renamed from: K */
        public static final String f24942K = "virtual_currency_name";
        @mr2

        /* renamed from: L */
        public static final String f24943L = "campaign";
        @mr2

        /* renamed from: M */
        public static final String f24944M = "source";
        @mr2

        /* renamed from: N */
        public static final String f24945N = "medium";
        @mr2

        /* renamed from: O */
        public static final String f24946O = "term";
        @mr2

        /* renamed from: P */
        public static final String f24947P = "content";
        @mr2

        /* renamed from: Q */
        public static final String f24948Q = "aclid";
        @mr2

        /* renamed from: R */
        public static final String f24949R = "cp1";
        @mr2

        /* renamed from: S */
        public static final String f24950S = "item_brand";
        @mr2

        /* renamed from: T */
        public static final String f24951T = "item_variant";
        @mr2

        /* renamed from: U */
        public static final String f24952U = "creative_name";
        @mr2

        /* renamed from: V */
        public static final String f24953V = "creative_slot";
        @mr2

        /* renamed from: W */
        public static final String f24954W = "affiliation";
        @mr2

        /* renamed from: X */
        public static final String f24955X = "index";
        @mr2

        /* renamed from: Y */
        public static final String f24956Y = "discount";
        @mr2

        /* renamed from: Z */
        public static final String f24957Z = "item_category2";
        @mr2

        /* renamed from: a */
        public static final String f24958a = "achievement_id";
        @mr2

        /* renamed from: a0 */
        public static final String f24959a0 = "item_category3";
        @mr2

        /* renamed from: b */
        public static final String f24960b = "ad_format";
        @mr2

        /* renamed from: b0 */
        public static final String f24961b0 = "item_category4";
        @mr2

        /* renamed from: c */
        public static final String f24962c = "ad_platform";
        @mr2

        /* renamed from: c0 */
        public static final String f24963c0 = "item_category5";
        @mr2

        /* renamed from: d */
        public static final String f24964d = "ad_source";
        @mr2

        /* renamed from: d0 */
        public static final String f24965d0 = "item_list_id";
        @mr2

        /* renamed from: e */
        public static final String f24966e = "ad_unit_name";
        @mr2

        /* renamed from: e0 */
        public static final String f24967e0 = "item_list_name";
        @mr2

        /* renamed from: f */
        public static final String f24968f = "character";
        @mr2

        /* renamed from: f0 */
        public static final String f24969f0 = "items";
        @mr2

        /* renamed from: g */
        public static final String f24970g = "travel_class";
        @mr2

        /* renamed from: g0 */
        public static final String f24971g0 = "location_id";
        @mr2

        /* renamed from: h */
        public static final String f24972h = "content_type";
        @mr2

        /* renamed from: h0 */
        public static final String f24973h0 = "payment_type";
        @mr2

        /* renamed from: i */
        public static final String f24974i = "currency";
        @mr2

        /* renamed from: i0 */
        public static final String f24975i0 = "promotion_id";
        @mr2

        /* renamed from: j */
        public static final String f24976j = "coupon";
        @mr2

        /* renamed from: j0 */
        public static final String f24977j0 = "promotion_name";
        @mr2

        /* renamed from: k */
        public static final String f24978k = "start_date";
        @mr2

        /* renamed from: k0 */
        public static final String f24979k0 = "screen_class";
        @mr2

        /* renamed from: l */
        public static final String f24980l = "end_date";
        @mr2

        /* renamed from: l0 */
        public static final String f24981l0 = "screen_name";
        @mr2

        /* renamed from: m */
        public static final String f24982m = "extend_session";
        @mr2

        /* renamed from: m0 */
        public static final String f24983m0 = "shipping_tier";
        @mr2

        /* renamed from: n */
        public static final String f24984n = "flight_number";
        @mr2

        /* renamed from: o */
        public static final String f24985o = "group_id";
        @mr2

        /* renamed from: p */
        public static final String f24986p = "item_category";
        @mr2

        /* renamed from: q */
        public static final String f24987q = "item_id";
        @mr2

        /* renamed from: r */
        public static final String f24988r = "item_name";
        @mr2

        /* renamed from: s */
        public static final String f24989s = "location";
        @mr2

        /* renamed from: t */
        public static final String f24990t = "level";
        @mr2

        /* renamed from: u */
        public static final String f24991u = "level_name";
        @mr2

        /* renamed from: v */
        public static final String f24992v = "method";
        @mr2

        /* renamed from: w */
        public static final String f24993w = "number_of_nights";
        @mr2

        /* renamed from: x */
        public static final String f24994x = "number_of_passengers";
        @mr2

        /* renamed from: y */
        public static final String f24995y = "number_of_rooms";
        @mr2

        /* renamed from: z */
        public static final String f24996z = "destination";
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$e */
    public static class C4306e {
        @mr2

        /* renamed from: a */
        public static final String f24997a = "sign_up_method";
        @mr2

        /* renamed from: b */
        public static final String f24998b = "allow_personalized_ads";
    }

    public FirebaseAnalytics(j36 j36) {
        Preconditions.checkNotNull(j36);
        this.f24889a = j36;
    }

    @mr2
    @wj3(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@mr2 Context context) {
        if (f24888a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f24888a == null) {
                    f24888a = new FirebaseAnalytics(j36.m18100D(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f24888a;
    }

    @ts2
    @Keep
    public static ti6 getScionFrontendApiImplementation(Context context, @ts2 Bundle bundle) {
        j36 D = j36.m18100D(context, (String) null, (String) null, (String) null, bundle);
        if (D == null) {
            return null;
        }
        return new mx5(D);
    }

    @mr2
    /* renamed from: a */
    public w94<String> mo29665a() {
        try {
            return ha4.m16569d(mo29676l(), new sl5(this));
        } catch (RuntimeException e) {
            this.f24889a.mo18114b(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return ha4.m16571f(e);
        }
    }

    @mr2
    /* renamed from: b */
    public w94<Long> mo29666b() {
        try {
            return ha4.m16569d(mo29676l(), new hs5(this));
        } catch (RuntimeException e) {
            this.f24889a.mo18114b(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
            return ha4.m16571f(e);
        }
    }

    /* renamed from: c */
    public void mo29667c(@mr2 @qz3(max = 40, min = 1) String str, @ts2 Bundle bundle) {
        this.f24889a.mo18111V(str, bundle);
    }

    /* renamed from: d */
    public void mo29668d() {
        this.f24889a.mo18116d();
    }

    /* renamed from: e */
    public void mo29669e(boolean z) {
        this.f24889a.mo18124l(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public void mo29670f(@mr2 Map<C4303b, C4302a> map) {
        Bundle bundle = new Bundle();
        C4302a aVar = map.get(C4303b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        C4302a aVar2 = map.get(C4303b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.f24889a.mo18119g(bundle);
    }

    /* renamed from: g */
    public void mo29671g(@ts2 Bundle bundle) {
        this.f24889a.mo18122j(bundle);
    }

    @mr2
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) ha4.m16567b(n41.m57860v().mo40943d(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: h */
    public void mo29673h(long j) {
        this.f24889a.mo18125m(j);
    }

    /* renamed from: i */
    public void mo29674i(@ts2 String str) {
        this.f24889a.mo18126n(str);
    }

    /* renamed from: j */
    public void mo29675j(@mr2 @qz3(max = 24, min = 1) String str, @ts2 @qz3(max = 36) String str2) {
        this.f24889a.mo18127o((String) null, str, str2, false);
    }

    @EnsuresNonNull({"this.executor"})
    /* renamed from: l */
    public final ExecutorService mo29676l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f24890a == null) {
                this.f24890a = new pa5(this, 0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f24890a;
        }
        return executorService;
    }

    @bc2
    @Deprecated
    @Keep
    public void setCurrentScreen(@mr2 Activity activity, @ts2 @qz3(max = 36, min = 1) String str, @ts2 @qz3(max = 36, min = 1) String str2) {
        this.f24889a.mo18120h(activity, str, str2);
    }
}
