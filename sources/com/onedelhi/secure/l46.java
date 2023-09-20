package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

public final class l46 {

    /* renamed from: a */
    public static final AtomicReference f15164a = new AtomicReference();

    /* renamed from: b */
    public static final AtomicReference f15165b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f15166c = new AtomicReference();

    /* renamed from: a */
    public final i46 f15167a;

    public l46(i46 i46) {
        this.f15167a = i46;
    }

    /* renamed from: g */
    public static final String m20220g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + pl2.f33726c + strArr[i] + pl2.f33727d;
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String mo19277a(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String b = bundle instanceof Bundle ? mo19278b(bundle) : String.valueOf(bundle);
            if (b != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo19278b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f15167a.mo13063a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo19281e(str));
            sb.append(a13.f25713a);
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? mo19277a(new Object[]{obj}) : obj instanceof Object[] ? mo19277a((Object[]) obj) : obj instanceof ArrayList ? mo19277a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo19279c(xj5 xj5) {
        if (!this.f15167a.mo13063a()) {
            return xj5.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(xj5.f22605c);
        sb.append(",name=");
        sb.append(mo19280d(xj5.f22604b));
        sb.append(",params=");
        hj5 hj5 = xj5.f22602a;
        sb.append(hj5 == null ? null : !this.f15167a.mo13063a() ? hj5.toString() : mo19278b(hj5.mo17314L2()));
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo19280d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15167a.mo13063a() ? str : m20220g(str, le6.f15333c, le6.f15331a, f15164a);
    }

    /* renamed from: e */
    public final String mo19281e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15167a.mo13063a() ? str : m20220g(str, oe6.f17939b, oe6.f17938a, f15165b);
    }

    /* renamed from: f */
    public final String mo19282f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f15167a.mo13063a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m20220g(str, re6.f19811b, re6.f19810a, f15166c);
        }
        return "experiment_id(" + str + pl2.f33727d;
    }
}
