package com.onedelhi.secure;

import java.util.List;

public final class gg0 {

    /* renamed from: a */
    public int f29176a;

    /* renamed from: a */
    public Integer f29177a;

    /* renamed from: a */
    public Object f29178a;

    /* renamed from: a */
    public final String f29179a;

    /* renamed from: a */
    public final List<byte[]> f29180a;

    /* renamed from: a */
    public final byte[] f29181a;

    /* renamed from: b */
    public final int f29182b;

    /* renamed from: b */
    public Integer f29183b;

    /* renamed from: b */
    public final String f29184b;

    /* renamed from: c */
    public final int f29185c;

    public gg0(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public gg0(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f29181a = bArr;
        this.f29176a = bArr == null ? 0 : bArr.length * 8;
        this.f29179a = str;
        this.f29180a = list;
        this.f29184b = str2;
        this.f29182b = i2;
        this.f29185c = i;
    }

    /* renamed from: a */
    public List<byte[]> mo36717a() {
        return this.f29180a;
    }

    /* renamed from: b */
    public String mo36718b() {
        return this.f29184b;
    }

    /* renamed from: c */
    public Integer mo36719c() {
        return this.f29183b;
    }

    /* renamed from: d */
    public Integer mo36720d() {
        return this.f29177a;
    }

    /* renamed from: e */
    public int mo36721e() {
        return this.f29176a;
    }

    /* renamed from: f */
    public Object mo36722f() {
        return this.f29178a;
    }

    /* renamed from: g */
    public byte[] mo36723g() {
        return this.f29181a;
    }

    /* renamed from: h */
    public int mo36724h() {
        return this.f29182b;
    }

    /* renamed from: i */
    public int mo36725i() {
        return this.f29185c;
    }

    /* renamed from: j */
    public String mo36726j() {
        return this.f29179a;
    }

    /* renamed from: k */
    public boolean mo36727k() {
        return this.f29182b >= 0 && this.f29185c >= 0;
    }

    /* renamed from: l */
    public void mo36728l(Integer num) {
        this.f29183b = num;
    }

    /* renamed from: m */
    public void mo36729m(Integer num) {
        this.f29177a = num;
    }

    /* renamed from: n */
    public void mo36730n(int i) {
        this.f29176a = i;
    }

    /* renamed from: o */
    public void mo36731o(Object obj) {
        this.f29178a = obj;
    }
}
