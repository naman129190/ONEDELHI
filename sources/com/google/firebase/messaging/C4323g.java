package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.bi3;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.mm0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qa0;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yz1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.firebase.messaging.g */
public final class C4323g extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C4323g> CREATOR = new bi3();

    /* renamed from: n */
    public static final int f25167n = 0;

    /* renamed from: o */
    public static final int f25168o = 1;

    /* renamed from: p */
    public static final int f25169p = 2;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: a */
    public Bundle f25170a;

    /* renamed from: a */
    public C4327d f25171a;

    /* renamed from: a */
    public Map<String, String> f25172a;

    /* renamed from: com.google.firebase.messaging.g$b */
    public static class C4325b {

        /* renamed from: a */
        public final Bundle f25173a;

        /* renamed from: a */
        public final Map<String, String> f25174a = new C3042oa();

        public C4325b(@mr2 String str) {
            Bundle bundle = new Bundle();
            this.f25173a = bundle;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(C4311b.C4315d.f25117g, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @mr2
        /* renamed from: a */
        public C4325b mo29779a(@mr2 String str, @ts2 String str2) {
            this.f25174a.put(str, str2);
            return this;
        }

        @mr2
        /* renamed from: b */
        public C4323g mo29780b() {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f25174a.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            bundle.putAll(this.f25173a);
            this.f25173a.remove("from");
            return new C4323g(bundle);
        }

        @mr2
        /* renamed from: c */
        public C4325b mo29781c() {
            this.f25174a.clear();
            return this;
        }

        @ts2
        /* renamed from: d */
        public String mo29782d() {
            return this.f25173a.getString(C4311b.C4315d.f25114d);
        }

        @mr2
        /* renamed from: e */
        public Map<String, String> mo29783e() {
            return this.f25174a;
        }

        @mr2
        /* renamed from: f */
        public String mo29784f() {
            return this.f25173a.getString(C4311b.C4315d.f25118h, "");
        }

        @ts2
        /* renamed from: g */
        public String mo29785g() {
            return this.f25173a.getString(C4311b.C4315d.f25114d);
        }

        @js1(from = 0, mo18580to = 86400)
        /* renamed from: h */
        public int mo29786h() {
            return Integer.parseInt(this.f25173a.getString(C4311b.C4315d.f25114d, qa0.f34045b));
        }

        @mr2
        /* renamed from: i */
        public C4325b mo29787i(@ts2 String str) {
            this.f25173a.putString(C4311b.C4315d.f25115e, str);
            return this;
        }

        @mr2
        /* renamed from: j */
        public C4325b mo29788j(@mr2 Map<String, String> map) {
            this.f25174a.clear();
            this.f25174a.putAll(map);
            return this;
        }

        @mr2
        /* renamed from: k */
        public C4325b mo29789k(@mr2 String str) {
            this.f25173a.putString(C4311b.C4315d.f25118h, str);
            return this;
        }

        @mr2
        /* renamed from: l */
        public C4325b mo29790l(@ts2 String str) {
            this.f25173a.putString(C4311b.C4315d.f25114d, str);
            return this;
        }

        @ShowFirstParty
        @mr2
        /* renamed from: m */
        public C4325b mo29791m(byte[] bArr) {
            this.f25173a.putByteArray("rawData", bArr);
            return this;
        }

        @mr2
        /* renamed from: n */
        public C4325b mo29792n(@js1(from = 0, mo18580to = 86400) int i) {
            this.f25173a.putString(C4311b.C4315d.f25119i, String.valueOf(i));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.messaging.g$c */
    public @interface C4326c {
    }

    /* renamed from: com.google.firebase.messaging.g$d */
    public static class C4327d {

        /* renamed from: a */
        public final Uri f25175a;

        /* renamed from: a */
        public final Integer f25176a;

        /* renamed from: a */
        public final Long f25177a;

        /* renamed from: a */
        public final String f25178a;

        /* renamed from: a */
        public final boolean f25179a;

        /* renamed from: a */
        public final int[] f25180a;

        /* renamed from: a */
        public final long[] f25181a;

        /* renamed from: a */
        public final String[] f25182a;

        /* renamed from: b */
        public final Integer f25183b;

        /* renamed from: b */
        public final String f25184b;

        /* renamed from: b */
        public final boolean f25185b;

        /* renamed from: b */
        public final String[] f25186b;

        /* renamed from: c */
        public final Integer f25187c;

        /* renamed from: c */
        public final String f25188c;

        /* renamed from: c */
        public final boolean f25189c;

        /* renamed from: d */
        public final String f25190d;

        /* renamed from: d */
        public final boolean f25191d;

        /* renamed from: e */
        public final String f25192e;

        /* renamed from: e */
        public final boolean f25193e;

        /* renamed from: f */
        public final String f25194f;

        /* renamed from: g */
        public final String f25195g;

        /* renamed from: h */
        public final String f25196h;

        /* renamed from: i */
        public final String f25197i;

        /* renamed from: j */
        public final String f25198j;

        /* renamed from: k */
        public final String f25199k;

        /* renamed from: l */
        public final String f25200l;

        public C4327d(C4322f fVar) {
            this.f25178a = fVar.mo29755p(C4311b.C4314c.f25091g);
            this.f25184b = fVar.mo29747h(C4311b.C4314c.f25091g);
            this.f25182a = m34845p(fVar, C4311b.C4314c.f25091g);
            this.f25188c = fVar.mo29755p(C4311b.C4314c.f25092h);
            this.f25190d = fVar.mo29747h(C4311b.C4314c.f25092h);
            this.f25186b = m34845p(fVar, C4311b.C4314c.f25092h);
            this.f25192e = fVar.mo29755p(C4311b.C4314c.f25093i);
            this.f25195g = fVar.mo29754o();
            this.f25196h = fVar.mo29755p(C4311b.C4314c.f25095k);
            this.f25197i = fVar.mo29755p(C4311b.C4314c.f25096l);
            this.f25198j = fVar.mo29755p(C4311b.C4314c.f25078A);
            this.f25199k = fVar.mo29755p(C4311b.C4314c.f25081D);
            this.f25175a = fVar.mo29745f();
            this.f25194f = fVar.mo29755p(C4311b.C4314c.f25094j);
            this.f25200l = fVar.mo29755p(C4311b.C4314c.f25097m);
            this.f25176a = fVar.mo29742b(C4311b.C4314c.f25100p);
            this.f25183b = fVar.mo29742b(C4311b.C4314c.f25105u);
            this.f25187c = fVar.mo29742b(C4311b.C4314c.f25104t);
            this.f25179a = fVar.mo29741a(C4311b.C4314c.f25099o);
            this.f25185b = fVar.mo29741a(C4311b.C4314c.f25098n);
            this.f25189c = fVar.mo29741a(C4311b.C4314c.f25101q);
            this.f25191d = fVar.mo29741a(C4311b.C4314c.f25102r);
            this.f25193e = fVar.mo29741a(C4311b.C4314c.f25103s);
            this.f25177a = fVar.mo29749j(C4311b.C4314c.f25108x);
            this.f25180a = fVar.mo29744e();
            this.f25181a = fVar.mo29756q();
        }

        /* renamed from: p */
        public static String[] m34845p(C4322f fVar, String str) {
            Object[] g = fVar.mo29746g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        @ts2
        /* renamed from: A */
        public Integer mo29793A() {
            return this.f25183b;
        }

        @ts2
        /* renamed from: a */
        public String mo29794a() {
            return this.f25188c;
        }

        @ts2
        /* renamed from: b */
        public String[] mo29795b() {
            return this.f25186b;
        }

        @ts2
        /* renamed from: c */
        public String mo29796c() {
            return this.f25190d;
        }

        @ts2
        /* renamed from: d */
        public String mo29797d() {
            return this.f25199k;
        }

        @ts2
        /* renamed from: e */
        public String mo29798e() {
            return this.f25198j;
        }

        @ts2
        /* renamed from: f */
        public String mo29799f() {
            return this.f25197i;
        }

        /* renamed from: g */
        public boolean mo29800g() {
            return this.f25193e;
        }

        /* renamed from: h */
        public boolean mo29801h() {
            return this.f25189c;
        }

        /* renamed from: i */
        public boolean mo29802i() {
            return this.f25191d;
        }

        @ts2
        /* renamed from: j */
        public Long mo29803j() {
            return this.f25177a;
        }

        @ts2
        /* renamed from: k */
        public String mo29804k() {
            return this.f25192e;
        }

        @ts2
        /* renamed from: l */
        public Uri mo29805l() {
            String str = this.f25194f;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @ts2
        /* renamed from: m */
        public int[] mo29806m() {
            return this.f25180a;
        }

        @ts2
        /* renamed from: n */
        public Uri mo29807n() {
            return this.f25175a;
        }

        /* renamed from: o */
        public boolean mo29808o() {
            return this.f25185b;
        }

        @ts2
        /* renamed from: q */
        public Integer mo29809q() {
            return this.f25187c;
        }

        @ts2
        /* renamed from: r */
        public Integer mo29810r() {
            return this.f25176a;
        }

        @ts2
        /* renamed from: s */
        public String mo29811s() {
            return this.f25195g;
        }

        /* renamed from: t */
        public boolean mo29812t() {
            return this.f25179a;
        }

        @ts2
        /* renamed from: u */
        public String mo29813u() {
            return this.f25196h;
        }

        @ts2
        /* renamed from: v */
        public String mo29814v() {
            return this.f25200l;
        }

        @ts2
        /* renamed from: w */
        public String mo29815w() {
            return this.f25178a;
        }

        @ts2
        /* renamed from: x */
        public String[] mo29816x() {
            return this.f25182a;
        }

        @ts2
        /* renamed from: y */
        public String mo29817y() {
            return this.f25184b;
        }

        @ts2
        /* renamed from: z */
        public long[] mo29818z() {
            return this.f25181a;
        }
    }

    @SafeParcelable.Constructor
    public C4323g(@SafeParcelable.Param(mo10056id = 2) Bundle bundle) {
        this.f25170a = bundle;
    }

    @ts2
    /* renamed from: K2 */
    public String mo29762K2() {
        return this.f25170a.getString(C4311b.C4315d.f25115e);
    }

    @mr2
    /* renamed from: L2 */
    public Map<String, String> mo29763L2() {
        if (this.f25172a == null) {
            this.f25172a = C4311b.C4315d.m34746a(this.f25170a);
        }
        return this.f25172a;
    }

    @ts2
    /* renamed from: M2 */
    public String mo29764M2() {
        return this.f25170a.getString("from");
    }

    @ts2
    /* renamed from: N2 */
    public String mo29765N2() {
        String string = this.f25170a.getString(C4311b.C4315d.f25118h);
        return string == null ? this.f25170a.getString(C4311b.C4315d.f25116f) : string;
    }

    /* renamed from: O2 */
    public final int mo29766O2(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return yz1.f38147i.equals(str) ? 2 : 0;
    }

    @ts2
    /* renamed from: P2 */
    public String mo29767P2() {
        return this.f25170a.getString(C4311b.C4315d.f25114d);
    }

    @ts2
    /* renamed from: Q2 */
    public C4327d mo29768Q2() {
        if (this.f25171a == null && C4322f.m34790v(this.f25170a)) {
            this.f25171a = new C4327d(new C4322f(this.f25170a));
        }
        return this.f25171a;
    }

    /* renamed from: R2 */
    public int mo29769R2() {
        String string = this.f25170a.getString(C4311b.C4315d.f25121k);
        if (string == null) {
            string = this.f25170a.getString(C4311b.C4315d.f25123m);
        }
        return mo29766O2(string);
    }

    /* renamed from: S2 */
    public int mo29770S2() {
        String string = this.f25170a.getString(C4311b.C4315d.f25122l);
        if (string == null) {
            if (mm0.f16219f.equals(this.f25170a.getString(C4311b.C4315d.f25124n))) {
                return 2;
            }
            string = this.f25170a.getString(C4311b.C4315d.f25123m);
        }
        return mo29766O2(string);
    }

    @ShowFirstParty
    @ts2
    /* renamed from: T2 */
    public byte[] mo29771T2() {
        return this.f25170a.getByteArray("rawData");
    }

    @ts2
    /* renamed from: U2 */
    public String mo29772U2() {
        return this.f25170a.getString(C4311b.C4315d.f25126p);
    }

    /* renamed from: V2 */
    public long mo29773V2() {
        Object obj = this.f25170a.get(C4311b.C4315d.f25120j);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0;
        }
    }

    @ts2
    /* renamed from: W2 */
    public String mo29774W2() {
        return this.f25170a.getString(C4311b.C4315d.f25117g);
    }

    /* renamed from: X2 */
    public int mo29775X2() {
        Object obj = this.f25170a.get(C4311b.C4315d.f25119i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: Y2 */
    public void mo29776Y2(Intent intent) {
        intent.putExtras(this.f25170a);
    }

    @KeepForSdk
    /* renamed from: Z2 */
    public Intent mo29777Z2() {
        Intent intent = new Intent();
        intent.putExtras(this.f25170a);
        return intent;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        bi3.m39966c(this, parcel, i);
    }
}
