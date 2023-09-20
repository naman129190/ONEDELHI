package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/hr2;", "Lcom/onedelhi/secure/j82;", "Lcom/onedelhi/secure/qp1;", "", "state", "e1", "toString", "", "b", "()Z", "isActive", "j0", "()Lcom/onedelhi/secure/hr2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class hr2 extends j82 implements qp1 {
    /* renamed from: b */
    public boolean mo31211b() {
        return true;
    }

    @vr2
    /* renamed from: e1 */
    public final String mo37503e1(@vr2 String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (l82 l82 = (l82) mo39690L0(); !jt1.m53768g(l82, this); l82 = l82.mo39691M0()) {
            if (l82 instanceof av1) {
                av1 av1 = (av1) l82;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(av1);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @vr2
    /* renamed from: j0 */
    public hr2 mo31214j0() {
        return this;
    }

    @vr2
    public String toString() {
        return super.toString();
    }
}
