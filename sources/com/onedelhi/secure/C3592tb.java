package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\bø\u0001\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\b\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0013"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lcom/onedelhi/secure/iy2;", "name", "out", "Lcom/onedelhi/secure/un4;", "block", "d", "", "array", "e", "", "text", "Ljava/nio/charset/Charset;", "charset", "f", "a", "b", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: com.onedelhi.secure.tb */
public final class C3592tb {
    @sj3(17)
    @vr2
    /* renamed from: a */
    public static final byte[] m28279a(@vr2 AtomicFile atomicFile) {
        jt1.m53777p(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        jt1.m53776o(readFully, "readFully()");
        return readFully;
    }

    @sj3(17)
    @vr2
    /* renamed from: b */
    public static final String m28280b(@vr2 AtomicFile atomicFile, @vr2 Charset charset) {
        jt1.m53777p(atomicFile, "<this>");
        jt1.m53777p(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        jt1.m53776o(readFully, "readFully()");
        return new String(readFully, charset);
    }

    /* renamed from: c */
    public static /* synthetic */ String m28281c(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        return m28280b(atomicFile, charset);
    }

    @sj3(17)
    /* renamed from: d */
    public static final void m28282d(@vr2 AtomicFile atomicFile, @vr2 ec1<? super FileOutputStream, un4> ec1) {
        jt1.m53777p(atomicFile, "<this>");
        jt1.m53777p(ec1, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            jt1.m53776o(startWrite, "stream");
            ec1.mo17094X(startWrite);
            uq1.m67403d(1);
            atomicFile.finishWrite(startWrite);
            uq1.m67402c(1);
        } catch (Throwable th) {
            uq1.m67403d(1);
            atomicFile.failWrite(startWrite);
            uq1.m67402c(1);
            throw th;
        }
    }

    @sj3(17)
    /* renamed from: e */
    public static final void m28283e(@vr2 AtomicFile atomicFile, @vr2 byte[] bArr) {
        jt1.m53777p(atomicFile, "<this>");
        jt1.m53777p(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            jt1.m53776o(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @sj3(17)
    /* renamed from: f */
    public static final void m28284f(@vr2 AtomicFile atomicFile, @vr2 String str, @vr2 Charset charset) {
        jt1.m53777p(atomicFile, "<this>");
        jt1.m53777p(str, "text");
        jt1.m53777p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        m28283e(atomicFile, bytes);
    }

    /* renamed from: g */
    public static /* synthetic */ void m28285g(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        m28284f(atomicFile, str, charset);
    }
}
