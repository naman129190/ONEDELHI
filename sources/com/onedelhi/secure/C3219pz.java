package com.onedelhi.secure;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.C4311b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@SafeParcelable.Class(creator = "CloudMessageCreator")
/* renamed from: com.onedelhi.secure.pz */
public final class C3219pz extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3219pz> CREATOR = new va5();

    /* renamed from: n */
    public static final int f18842n = 0;

    /* renamed from: o */
    public static final int f18843o = 1;

    /* renamed from: p */
    public static final int f18844p = 2;
    @SafeParcelable.Field(mo10053id = 1)
    @mr2

    /* renamed from: a */
    public Intent f18845a;
    @GuardedBy("this")

    /* renamed from: a */
    public Map<String, String> f18846a;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.pz$a */
    public @interface C3220a {
    }

    @SafeParcelable.Constructor
    public C3219pz(@SafeParcelable.Param(mo10056id = 1) @mr2 Intent intent) {
        this.f18845a = intent;
    }

    /* renamed from: X2 */
    public static int m25215X2(@ts2 String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return yz1.f38147i.equals(str) ? 2 : 0;
    }

    @ts2
    /* renamed from: K2 */
    public String mo22787K2() {
        return this.f18845a.getStringExtra(C4311b.C4315d.f25115e);
    }

    @mr2
    /* renamed from: L2 */
    public synchronized Map<String, String> mo22788L2() {
        if (this.f18846a == null) {
            Bundle extras = this.f18845a.getExtras();
            C3042oa oaVar = new C3042oa();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith(C4311b.C4315d.f25111a) && !str.equals("from") && !str.equals(C4311b.C4315d.f25114d) && !str.equals(C4311b.C4315d.f25115e)) {
                            oaVar.put(str, str2);
                        }
                    }
                }
            }
            this.f18846a = oaVar;
        }
        return this.f18846a;
    }

    @ts2
    /* renamed from: M2 */
    public String mo22789M2() {
        return this.f18845a.getStringExtra("from");
    }

    @mr2
    /* renamed from: N2 */
    public Intent mo22790N2() {
        return this.f18845a;
    }

    @ts2
    /* renamed from: O2 */
    public String mo22791O2() {
        String stringExtra = this.f18845a.getStringExtra(C4311b.C4315d.f25118h);
        return stringExtra == null ? this.f18845a.getStringExtra(C4311b.C4315d.f25116f) : stringExtra;
    }

    @ts2
    /* renamed from: P2 */
    public String mo22792P2() {
        return this.f18845a.getStringExtra(C4311b.C4315d.f25114d);
    }

    /* renamed from: Q2 */
    public int mo22793Q2() {
        String stringExtra = this.f18845a.getStringExtra(C4311b.C4315d.f25121k);
        if (stringExtra == null) {
            stringExtra = this.f18845a.getStringExtra(C4311b.C4315d.f25123m);
        }
        return m25215X2(stringExtra);
    }

    /* renamed from: R2 */
    public int mo22794R2() {
        String stringExtra = this.f18845a.getStringExtra(C4311b.C4315d.f25122l);
        if (stringExtra == null) {
            if (mm0.f16219f.equals(this.f18845a.getStringExtra(C4311b.C4315d.f25124n))) {
                return 2;
            }
            stringExtra = this.f18845a.getStringExtra(C4311b.C4315d.f25123m);
        }
        return m25215X2(stringExtra);
    }

    @ts2
    /* renamed from: S2 */
    public byte[] mo22795S2() {
        return this.f18845a.getByteArrayExtra("rawData");
    }

    @ts2
    /* renamed from: T2 */
    public String mo22796T2() {
        return this.f18845a.getStringExtra(C4311b.C4315d.f25126p);
    }

    /* renamed from: U2 */
    public long mo22797U2() {
        Bundle extras = this.f18845a.getExtras();
        Object obj = extras != null ? extras.get(C4311b.C4315d.f25120j) : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(valueOf);
            Log.w("CloudMessage", sb.toString());
            return 0;
        }
    }

    @ts2
    /* renamed from: V2 */
    public String mo22798V2() {
        return this.f18845a.getStringExtra(C4311b.C4315d.f25117g);
    }

    /* renamed from: W2 */
    public int mo22799W2() {
        Bundle extras = this.f18845a.getExtras();
        Object obj = extras != null ? extras.get(C4311b.C4315d.f25119i) : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("CloudMessage", sb.toString());
            return 0;
        }
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f18845a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
