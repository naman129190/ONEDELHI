package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/o64;", "Lcom/onedelhi/secure/d34;", "", "Lcom/onedelhi/secure/rx3;", "delta", "", "i0", "h0", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o64 extends rx3<Integer> implements d34<Integer> {
    public o64(int i) {
        super(1, Integer.MAX_VALUE, C6593qo.DROP_OLDEST);
        mo34785l(Integer.valueOf(i));
    }

    @vr2
    /* renamed from: h0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) mo44095T()).intValue());
        }
        return valueOf;
    }

    /* renamed from: i0 */
    public final boolean mo41550i0(int i) {
        boolean l;
        synchronized (this) {
            l = mo34785l(Integer.valueOf(((Number) mo44095T()).intValue() + i));
        }
        return l;
    }
}
