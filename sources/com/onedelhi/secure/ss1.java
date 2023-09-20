package com.onedelhi.secure;

import android.content.Intent;

public final class ss1 {

    /* renamed from: a */
    public final Intent f35168a;

    /* renamed from: a */
    public final Integer f35169a;

    /* renamed from: a */
    public final String f35170a;

    /* renamed from: a */
    public final byte[] f35171a;

    /* renamed from: b */
    public final String f35172b;

    /* renamed from: c */
    public final String f35173c;

    /* renamed from: d */
    public final String f35174d;

    public ss1() {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, (Intent) null);
    }

    public ss1(Intent intent) {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
    }

    public ss1(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f35170a = str;
        this.f35172b = str2;
        this.f35171a = bArr;
        this.f35169a = num;
        this.f35173c = str3;
        this.f35174d = str4;
        this.f35168a = intent;
    }

    /* renamed from: a */
    public String mo44519a() {
        return this.f35174d;
    }

    /* renamed from: b */
    public String mo44520b() {
        return this.f35170a;
    }

    /* renamed from: c */
    public String mo44521c() {
        return this.f35173c;
    }

    /* renamed from: d */
    public String mo44522d() {
        return this.f35172b;
    }

    /* renamed from: e */
    public Integer mo44523e() {
        return this.f35169a;
    }

    /* renamed from: f */
    public Intent mo44524f() {
        return this.f35168a;
    }

    /* renamed from: g */
    public byte[] mo44525g() {
        return this.f35171a;
    }

    public String toString() {
        byte[] bArr = this.f35171a;
        int length = bArr == null ? 0 : bArr.length;
        return "Format: " + this.f35172b + 10 + "Contents: " + this.f35170a + 10 + "Raw bytes: (" + length + " bytes)\nOrientation: " + this.f35169a + 10 + "EC level: " + this.f35173c + 10 + "Barcode image: " + this.f35174d + 10 + "Original intent: " + this.f35168a + 10;
    }
}
