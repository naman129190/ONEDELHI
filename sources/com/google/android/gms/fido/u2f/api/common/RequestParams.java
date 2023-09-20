package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.onedelhi.secure.C2283gw;
import com.onedelhi.secure.jh3;
import com.onedelhi.secure.mr2;
import java.util.List;
import java.util.Set;

@Deprecated
public abstract class RequestParams extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    /* renamed from: K2 */
    public abstract Set<Uri> mo10425K2();

    @mr2
    /* renamed from: L2 */
    public abstract Uri mo10426L2();

    @mr2
    /* renamed from: M2 */
    public abstract C2283gw mo10427M2();

    @mr2
    /* renamed from: N2 */
    public abstract String mo10428N2();

    @mr2
    /* renamed from: O2 */
    public abstract List<jh3> mo10429O2();

    @mr2
    /* renamed from: P2 */
    public abstract Integer mo10430P2();

    @mr2
    /* renamed from: Q2 */
    public abstract Double mo10431Q2();
}
