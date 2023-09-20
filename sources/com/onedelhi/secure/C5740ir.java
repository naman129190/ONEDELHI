package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.onedelhi.secure.ir */
public class C5740ir implements gn2 {
    @mr2

    /* renamed from: a */
    public final String f30431a;
    @ts2

    /* renamed from: a */
    public final byte[] f30432a;
    @mr2

    /* renamed from: b */
    public final String f30433b;

    public C5740ir(@mr2 String str, @mr2 String str2, @ts2 byte[] bArr) {
        this.f30431a = str;
        this.f30433b = str2;
        this.f30432a = bArr;
    }

    @ts2
    /* renamed from: a */
    public InputStream mo36794a() {
        if (mo38196e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f30432a);
    }

    @mr2
    /* renamed from: b */
    public String mo36795b() {
        return this.f30433b;
    }

    @ts2
    /* renamed from: c */
    public pa0.C6379e.C6381b mo36796c() {
        byte[] d = mo38195d();
        if (d == null) {
            return null;
        }
        return pa0.C6379e.C6381b.m60597a().mo31661b(d).mo31662c(this.f30431a).mo31660a();
    }

    @ts2
    /* renamed from: d */
    public final byte[] mo38195d() {
        GZIPOutputStream gZIPOutputStream;
        if (mo38196e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f30432a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: e */
    public final boolean mo38196e() {
        byte[] bArr = this.f30432a;
        return bArr == null || bArr.length == 0;
    }
}
