package com.onedelhi.secure;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

@sj3(19)
public class kz3 extends un0 {

    /* renamed from: a */
    public Context f15127a;

    /* renamed from: a */
    public Uri f15128a;

    public kz3(@ts2 un0 un0, Context context, Uri uri) {
        super(un0);
        this.f15127a = context;
        this.f15128a = uri;
    }

    /* renamed from: a */
    public boolean mo17744a() {
        return ao0.m11321a(this.f15127a, this.f15128a);
    }

    /* renamed from: b */
    public boolean mo17745b() {
        return ao0.m11322b(this.f15127a, this.f15128a);
    }

    /* renamed from: c */
    public un0 mo17746c(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public un0 mo17747d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public boolean mo17748e() {
        try {
            return DocumentsContract.deleteDocument(this.f15127a.getContentResolver(), this.f15128a);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public boolean mo17749f() {
        return ao0.m11324d(this.f15127a, this.f15128a);
    }

    @ts2
    /* renamed from: k */
    public String mo17750k() {
        return ao0.m11326f(this.f15127a, this.f15128a);
    }

    @ts2
    /* renamed from: m */
    public String mo17751m() {
        return ao0.m11328h(this.f15127a, this.f15128a);
    }

    /* renamed from: n */
    public Uri mo17752n() {
        return this.f15128a;
    }

    /* renamed from: o */
    public boolean mo17753o() {
        return ao0.m11329i(this.f15127a, this.f15128a);
    }

    /* renamed from: q */
    public boolean mo17754q() {
        return ao0.m11330j(this.f15127a, this.f15128a);
    }

    /* renamed from: r */
    public boolean mo17755r() {
        return ao0.m11331k(this.f15127a, this.f15128a);
    }

    /* renamed from: s */
    public long mo17756s() {
        return ao0.m11332l(this.f15127a, this.f15128a);
    }

    /* renamed from: t */
    public long mo17757t() {
        return ao0.m11333m(this.f15127a, this.f15128a);
    }

    /* renamed from: u */
    public un0[] mo17758u() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public boolean mo17759v(String str) {
        throw new UnsupportedOperationException();
    }
}
