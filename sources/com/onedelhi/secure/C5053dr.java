package com.onedelhi.secure;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\b\u001a\r\u0010\t\u001a\u00020\u0006*\u00020\bH\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\b\u001a\u0017\u0010\u0010\u001a\u00020\u0000*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\nH\b\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\nH\b\u001a\u0017\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\b\u001a\u0017\u0010\u001b\u001a\u00020\u001a*\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\b\u001a\u001c\u0010\u001e\u001a\u00020\u001d*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\n\u001a\u0016\u0010 \u001a\u00020\b*\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\nH\u0007\u001a\f\u0010!\u001a\u00020\b*\u00020\u000eH\u0007¨\u0006\""}, d2 = {"Ljava/io/BufferedInputStream;", "Lcom/onedelhi/secure/yq;", "o", "", "Ljava/nio/charset/Charset;", "charset", "Ljava/io/ByteArrayInputStream;", "i", "", "m", "", "offset", "length", "n", "Ljava/io/InputStream;", "bufferSize", "a", "Ljava/io/InputStreamReader;", "s", "Ljava/io/BufferedReader;", "e", "Ljava/io/OutputStream;", "Ljava/io/BufferedOutputStream;", "b", "Ljava/io/OutputStreamWriter;", "u", "Ljava/io/BufferedWriter;", "g", "out", "", "k", "estimatedSize", "q", "p", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "ByteStreamsKt")
/* renamed from: com.onedelhi.secure.dr */
public final class C5053dr {

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"com/onedelhi/secure/dr$a", "Lcom/onedelhi/secure/yq;", "", "hasNext", "", "g", "Lcom/onedelhi/secure/un4;", "h", "", "nextByte", "I", "d", "()I", "j", "(I)V", "nextPrepared", "Z", "f", "()Z", "l", "(Z)V", "finished", "b", "i", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.dr$a */
    public static final class C5054a extends C7382yq {

        /* renamed from: a */
        public final /* synthetic */ BufferedInputStream f27598a;

        /* renamed from: b */
        public boolean f27599b;

        /* renamed from: c */
        public boolean f27600c;

        /* renamed from: n */
        public int f27601n = -1;

        public C5054a(BufferedInputStream bufferedInputStream) {
            this.f27598a = bufferedInputStream;
        }

        /* renamed from: b */
        public final boolean mo34609b() {
            return this.f27600c;
        }

        /* renamed from: d */
        public final int mo34610d() {
            return this.f27601n;
        }

        /* renamed from: f */
        public final boolean mo34611f() {
            return this.f27599b;
        }

        /* renamed from: g */
        public byte mo34612g() {
            mo34613h();
            if (!this.f27600c) {
                byte b = (byte) this.f27601n;
                this.f27599b = false;
                return b;
            }
            throw new NoSuchElementException("Input stream is over.");
        }

        /* renamed from: h */
        public final void mo34613h() {
            if (!this.f27599b && !this.f27600c) {
                int read = this.f27598a.read();
                this.f27601n = read;
                boolean z = true;
                this.f27599b = true;
                if (read != -1) {
                    z = false;
                }
                this.f27600c = z;
            }
        }

        public boolean hasNext() {
            mo34613h();
            return !this.f27600c;
        }

        /* renamed from: i */
        public final void mo34615i(boolean z) {
            this.f27600c = z;
        }

        /* renamed from: j */
        public final void mo34616j(int i) {
            this.f27601n = i;
        }

        /* renamed from: l */
        public final void mo34617l(boolean z) {
            this.f27599b = z;
        }
    }

    @xq1
    /* renamed from: a */
    public static final BufferedInputStream m45489a(InputStream inputStream, int i) {
        jt1.m53777p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @xq1
    /* renamed from: b */
    public static final BufferedOutputStream m45490b(OutputStream outputStream, int i) {
        jt1.m53777p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    /* renamed from: c */
    public static /* synthetic */ BufferedInputStream m45491c(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        jt1.m53777p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    /* renamed from: d */
    public static /* synthetic */ BufferedOutputStream m45492d(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        jt1.m53777p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    @xq1
    /* renamed from: e */
    public static final BufferedReader m45493e(InputStream inputStream, Charset charset) {
        jt1.m53777p(inputStream, "<this>");
        jt1.m53777p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    /* renamed from: f */
    public static /* synthetic */ BufferedReader m45494f(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(inputStream, "<this>");
        jt1.m53777p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @xq1
    /* renamed from: g */
    public static final BufferedWriter m45495g(OutputStream outputStream, Charset charset) {
        jt1.m53777p(outputStream, "<this>");
        jt1.m53777p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    /* renamed from: h */
    public static /* synthetic */ BufferedWriter m45496h(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(outputStream, "<this>");
        jt1.m53777p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @xq1
    /* renamed from: i */
    public static final ByteArrayInputStream m45497i(String str, Charset charset) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    /* renamed from: j */
    public static /* synthetic */ ByteArrayInputStream m45498j(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    /* renamed from: k */
    public static final long m45499k(@vr2 InputStream inputStream, @vr2 OutputStream outputStream, int i) {
        jt1.m53777p(inputStream, "<this>");
        jt1.m53777p(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: l */
    public static /* synthetic */ long m45500l(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m45499k(inputStream, outputStream, i);
    }

    @xq1
    /* renamed from: m */
    public static final ByteArrayInputStream m45501m(byte[] bArr) {
        jt1.m53777p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @xq1
    /* renamed from: n */
    public static final ByteArrayInputStream m45502n(byte[] bArr, int i, int i2) {
        jt1.m53777p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @vr2
    /* renamed from: o */
    public static final C7382yq m45503o(@vr2 BufferedInputStream bufferedInputStream) {
        jt1.m53777p(bufferedInputStream, "<this>");
        return new C5054a(bufferedInputStream);
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: p */
    public static final byte[] m45504p(@vr2 InputStream inputStream) {
        jt1.m53777p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m45500l(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        jt1.m53776o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @zj0(errorSince = "1.5", warningSince = "1.3")
    @vr2
    @xj0(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @oi3(expression = "readBytes()", imports = {}))
    /* renamed from: q */
    public static final byte[] m45505q(@vr2 InputStream inputStream, int i) {
        jt1.m53777p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        m45500l(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        jt1.m53776o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    /* renamed from: r */
    public static /* synthetic */ byte[] m45506r(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return m45505q(inputStream, i);
    }

    @xq1
    /* renamed from: s */
    public static final InputStreamReader m45507s(InputStream inputStream, Charset charset) {
        jt1.m53777p(inputStream, "<this>");
        jt1.m53777p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    /* renamed from: t */
    public static /* synthetic */ InputStreamReader m45508t(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(inputStream, "<this>");
        jt1.m53777p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @xq1
    /* renamed from: u */
    public static final OutputStreamWriter m45509u(OutputStream outputStream, Charset charset) {
        jt1.m53777p(outputStream, "<this>");
        jt1.m53777p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    /* renamed from: v */
    public static /* synthetic */ OutputStreamWriter m45510v(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(outputStream, "<this>");
        jt1.m53777p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
