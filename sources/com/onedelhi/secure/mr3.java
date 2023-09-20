package com.onedelhi.secure;

import android.content.Intent;
import com.onedelhi.secure.us1;

public final class mr3 {

    /* renamed from: a */
    public final Intent f32218a;

    /* renamed from: a */
    public final Integer f32219a;

    /* renamed from: a */
    public final String f32220a;

    /* renamed from: a */
    public final byte[] f32221a;

    /* renamed from: b */
    public final String f32222b;

    /* renamed from: c */
    public final String f32223c;

    /* renamed from: d */
    public final String f32224d;

    public mr3() {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, (Intent) null);
    }

    public mr3(Intent intent) {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
    }

    public mr3(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f32220a = str;
        this.f32222b = str2;
        this.f32221a = bArr;
        this.f32219a = num;
        this.f32223c = str3;
        this.f32224d = str4;
        this.f32218a = intent;
    }

    /* renamed from: h */
    public static mr3 m57499h(int i, Intent intent) {
        if (i != -1) {
            return new mr3(intent);
        }
        String stringExtra = intent.getStringExtra(us1.C6979a.f36265u);
        String stringExtra2 = intent.getStringExtra(us1.C6979a.f36266v);
        byte[] byteArrayExtra = intent.getByteArrayExtra(us1.C6979a.f36268x);
        int intExtra = intent.getIntExtra(us1.C6979a.f36269y, Integer.MIN_VALUE);
        return new mr3(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra(us1.C6979a.f36270z), intent.getStringExtra(us1.C6979a.f36240B), intent);
    }

    /* renamed from: a */
    public String mo40747a() {
        return this.f32224d;
    }

    /* renamed from: b */
    public String mo40748b() {
        return this.f32220a;
    }

    /* renamed from: c */
    public String mo40749c() {
        return this.f32223c;
    }

    /* renamed from: d */
    public String mo40750d() {
        return this.f32222b;
    }

    /* renamed from: e */
    public Integer mo40751e() {
        return this.f32219a;
    }

    /* renamed from: f */
    public Intent mo40752f() {
        return this.f32218a;
    }

    /* renamed from: g */
    public byte[] mo40753g() {
        return this.f32221a;
    }

    public String toString() {
        byte[] bArr = this.f32221a;
        int length = bArr == null ? 0 : bArr.length;
        return "Format: " + this.f32222b + 10 + "Contents: " + this.f32220a + 10 + "Raw bytes: (" + length + " bytes)\nOrientation: " + this.f32219a + 10 + "EC level: " + this.f32223c + 10 + "Barcode image: " + this.f32224d + 10 + "Original intent: " + this.f32218a + 10;
    }
}
