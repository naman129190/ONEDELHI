package com.onedelhi.secure;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class a56 extends hd6 {

    /* renamed from: a */
    public char f8746a = 0;

    /* renamed from: a */
    public long f8747a = -1;

    /* renamed from: a */
    public final u46 f8748a = new u46(this, 6, false, false);
    @mj1("this")

    /* renamed from: a */
    public String f8749a;

    /* renamed from: b */
    public final u46 f8750b = new u46(this, 6, true, false);

    /* renamed from: c */
    public final u46 f8751c = new u46(this, 6, false, true);

    /* renamed from: d */
    public final u46 f8752d = new u46(this, 5, false, false);

    /* renamed from: e */
    public final u46 f8753e = new u46(this, 5, true, false);

    /* renamed from: f */
    public final u46 f8754f = new u46(this, 5, false, true);

    /* renamed from: g */
    public final u46 f8755g = new u46(this, 4, false, false);

    /* renamed from: h */
    public final u46 f8756h = new u46(this, 3, false, false);

    /* renamed from: i */
    public final u46 f8757i = new u46(this, 2, false, false);

    public a56(za6 za6) {
        super(za6);
    }

    /* renamed from: A */
    public static String m10795A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String B = m10796B(z, obj);
        String B2 = m10796B(z, obj2);
        String B3 = m10796B(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: B */
    public static String m10796B(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str = "-";
            }
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof x46 ? ((x46) obj).f22444a : z ? "-" : obj.toString();
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String C = m10797C(za6.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m10797C(className).equals(C)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
    }

    @VisibleForTesting
    /* renamed from: C */
    public static String m10797C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        px6.m25127c();
        return ((Boolean) n36.f17094y0.mo18887a((Object) null)).booleanValue() ? "" : str;
    }

    /* renamed from: z */
    public static Object m10802z(String str) {
        if (str == null) {
            return null;
        }
        return new x46(str);
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    /* renamed from: D */
    public final String mo12722D() {
        String str;
        synchronized (this) {
            if (this.f8749a == null) {
                this.f8749a = this.f11205a.mo27874Q() != null ? this.f11205a.mo27874Q() : this.f11205a.mo27891z().mo14130w();
            }
            Preconditions.checkNotNull(this.f8749a);
            str = this.f8749a;
        }
        return str;
    }

    /* renamed from: G */
    public final void mo12723G(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo12722D(), i)) {
            Log.println(i, mo12722D(), m10795A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Preconditions.checkNotNull(str);
            qa6 G = this.f11205a.mo27865G();
            if (G == null) {
                Log.println(6, mo12722D(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo17204n()) {
                Log.println(6, mo12722D(), "Scheduler not initialized. Not logging error/warn");
            } else {
                G.mo23065z(new r46(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* renamed from: j */
    public final boolean mo12724j() {
        return false;
    }

    /* renamed from: q */
    public final u46 mo12725q() {
        return this.f8756h;
    }

    /* renamed from: r */
    public final u46 mo12726r() {
        return this.f8748a;
    }

    /* renamed from: s */
    public final u46 mo12727s() {
        return this.f8751c;
    }

    /* renamed from: t */
    public final u46 mo12728t() {
        return this.f8750b;
    }

    /* renamed from: u */
    public final u46 mo12729u() {
        return this.f8755g;
    }

    /* renamed from: v */
    public final u46 mo12730v() {
        return this.f8757i;
    }

    /* renamed from: w */
    public final u46 mo12731w() {
        return this.f8752d;
    }

    /* renamed from: x */
    public final u46 mo12732x() {
        return this.f8754f;
    }

    /* renamed from: y */
    public final u46 mo12733y() {
        return this.f8753e;
    }
}
