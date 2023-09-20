package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class mf5 {

    /* renamed from: a */
    public final qe5 f16084a;

    /* renamed from: a */
    public final String f16085a;

    /* renamed from: b */
    public qe5 f16086b;

    public /* synthetic */ mf5(String str, bf5 bf5) {
        qe5 qe5 = new qe5((fe5) null);
        this.f16084a = qe5;
        this.f16086b = qe5;
        Objects.requireNonNull(str);
        this.f16085a = str;
    }

    /* renamed from: a */
    public final mf5 mo20328a(String str, int i) {
        String valueOf = String.valueOf(i);
        ud5 ud5 = new ud5((id5) null);
        this.f16086b.f19089a = ud5;
        this.f16086b = ud5;
        ud5.f19090a = valueOf;
        ud5.f19091a = "errorCode";
        return this;
    }

    /* renamed from: b */
    public final mf5 mo20329b(String str, @CheckForNull Object obj) {
        qe5 qe5 = new qe5((fe5) null);
        this.f16086b.f19089a = qe5;
        this.f16086b = qe5;
        qe5.f19090a = obj;
        qe5.f19091a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f16085a);
        sb.append('{');
        qe5 qe5 = this.f16084a.f19089a;
        String str = "";
        while (qe5 != null) {
            Object obj = qe5.f19090a;
            boolean z = qe5 instanceof ud5;
            sb.append(str);
            String str2 = qe5.f19091a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            qe5 = qe5.f19089a;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
