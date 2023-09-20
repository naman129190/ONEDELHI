package com.google.android.gms.fido.u2f.api.common;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.onedelhi.secure.mr2;
import org.json.JSONObject;

@Deprecated
public abstract class ResponseData extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    /* renamed from: K2 */
    public abstract JSONObject mo10417K2();
}
