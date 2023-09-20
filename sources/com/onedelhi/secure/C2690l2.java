package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.onedelhi.secure.l2 */
public class C2690l2 extends GoogleApi<x07> {

    /* renamed from: a */
    public static final /* synthetic */ int f15140a = 0;

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f15141a;

    /* renamed from: a */
    public static final Api.ClientKey f15142a;

    /* renamed from: a */
    public static final Api f15143a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f15142a = clientKey;
        vl5 vl5 = new vl5();
        f15141a = vl5;
        f15143a = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", vl5, clientKey);
    }

    public C2690l2(@mr2 Activity activity, @ts2 x07 x07) {
        super(activity, f15143a, x07.f22370a, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    public C2690l2(@mr2 Context context, @ts2 x07 x07) {
        super(context, f15143a, x07.f22370a, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    @mr2
    /* renamed from: V */
    public w94<sk0> mo19259V(@mr2 String str) {
        Preconditions.checkNotNull(str);
        return doRead(new ga6(this, 1608, new vh5(str)));
    }

    @mr2
    /* renamed from: W */
    public w94<Void> mo19260W(@mr2 String str, int i) {
        Preconditions.checkNotNull(str);
        return doWrite(new qh6(this, 1610, new jj5(str, i)));
    }

    @mr2
    /* renamed from: X */
    public w94<byte[]> mo19261X(@mr2 String str) {
        Preconditions.checkNotNull(str);
        return doRead(new l26(this, 1607, new zj5(str)));
    }

    @mr2
    /* renamed from: Y */
    public w94<Void> mo19262Y(@mr2 String str, @mr2 byte[] bArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(bArr);
        return doWrite(new js5(this, 1606, new pk5(str, bArr)));
    }

    @mr2
    /* renamed from: Z */
    public w94<Void> mo19263Z(@mr2 String str, @mr2 PendingIntent pendingIntent) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(pendingIntent);
        return doWrite(new zd6(this, 1609, new pm5(str, pendingIntent)));
    }
}
