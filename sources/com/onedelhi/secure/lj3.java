package com.onedelhi.secure;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

public abstract class lj3 extends AbstractSafeParcelable {
    @ts2
    /* renamed from: K2 */
    public abstract C3495sc mo17872K2();

    @mr2
    /* renamed from: L2 */
    public abstract byte[] mo17873L2();

    @ts2
    /* renamed from: M2 */
    public abstract Integer mo17874M2();

    @ts2
    /* renamed from: N2 */
    public abstract Double mo17875N2();

    @ts2
    /* renamed from: O2 */
    public abstract jf4 mo17876O2();

    @mr2
    /* renamed from: P2 */
    public byte[] mo17877P2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }
}
