package com.onedelhi.secure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u001a\u001e\u0010\f\u001a\u00020\n*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u001a\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r*\u00020\u0000\u001a:\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\u00002\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0010\u0012\u0004\u0012\u00028\u00000\bH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015*\u00020\tH\b\u001a\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u0003\u001a\n\u0010\u0018\u001a\u00020\t*\u00020\u0000\u001a\u001c\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u0017\u0010\u001f\u001a\u00020\t*\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\b\u001a\n\u0010!\u001a\u00020 *\u00020\u001c\u0002\u000f\n\u0005\b20\u0001\n\u0006\b\u0011(\u00120\u0001¨\u0006\""}, d2 = {"Ljava/io/Reader;", "", "bufferSize", "Ljava/io/BufferedReader;", "a", "Ljava/io/Writer;", "Ljava/io/BufferedWriter;", "b", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/un4;", "action", "g", "", "j", "T", "Lcom/onedelhi/secure/zt3;", "block", "Requires newer compiler version to be inlined correctly.", "o", "(Ljava/io/Reader;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "Ljava/io/StringReader;", "n", "h", "k", "out", "", "e", "Ljava/net/URL;", "Ljava/nio/charset/Charset;", "charset", "l", "", "i", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "TextStreamsKt")
public final class gb4 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.gb4$a */
    public static final class C5404a extends d12 implements ec1<String, un4> {

        /* renamed from: a */
        public final /* synthetic */ ArrayList<String> f29131a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5404a(ArrayList<String> arrayList) {
            super(1);
            this.f29131a = arrayList;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo36658a((String) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo36658a(@vr2 String str) {
            jt1.m53777p(str, "it");
            this.f29131a.add(str);
        }
    }

    @xq1
    /* renamed from: a */
    public static final BufferedReader m49298a(Reader reader, int i) {
        jt1.m53777p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @xq1
    /* renamed from: b */
    public static final BufferedWriter m49299b(Writer writer, int i) {
        jt1.m53777p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    /* renamed from: c */
    public static /* synthetic */ BufferedReader m49300c(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        jt1.m53777p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    /* renamed from: d */
    public static /* synthetic */ BufferedWriter m49301d(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        jt1.m53777p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    /* renamed from: e */
    public static final long m49302e(@vr2 Reader reader, @vr2 Writer writer, int i) {
        jt1.m53777p(reader, "<this>");
        jt1.m53777p(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: f */
    public static /* synthetic */ long m49303f(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m49302e(reader, writer, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        throw r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m49304g(@com.onedelhi.secure.vr2 java.io.Reader r3, @com.onedelhi.secure.vr2 com.onedelhi.secure.ec1<? super java.lang.String, com.onedelhi.secure.un4> r4) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "action"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            com.onedelhi.secure.zt3 r1 = m49305h(r3)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0036 }
            r4.mo17094X(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0030:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0036 }
            com.onedelhi.secure.C5630hz.m51313a(r3, r0)
            return
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gb4.m49304g(java.io.Reader, com.onedelhi.secure.ec1):void");
    }

    @vr2
    /* renamed from: h */
    public static final zt3<String> m49305h(@vr2 BufferedReader bufferedReader) {
        jt1.m53777p(bufferedReader, "<this>");
        return fu3.m48488f(new q32(bufferedReader));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r2, r0);
     */
    @com.onedelhi.secure.vr2
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m49306i(@com.onedelhi.secure.vr2 java.net.URL r2) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.io.InputStream r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r2)
            java.lang.String r0 = "it"
            com.onedelhi.secure.jt1.m53776o(r2, r0)     // Catch:{ all -> 0x0017 }
            byte[] r0 = com.onedelhi.secure.C5053dr.m45504p(r2)     // Catch:{ all -> 0x0017 }
            r1 = 0
            com.onedelhi.secure.C5630hz.m51313a(r2, r1)
            return r0
        L_0x0017:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r1 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gb4.m49306i(java.net.URL):byte[]");
    }

    @vr2
    /* renamed from: j */
    public static final List<String> m49307j(@vr2 Reader reader) {
        jt1.m53777p(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        m49304g(reader, new C5404a(arrayList));
        return arrayList;
    }

    @vr2
    /* renamed from: k */
    public static final String m49308k(@vr2 Reader reader) {
        jt1.m53777p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m49303f(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        jt1.m53776o(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @xq1
    /* renamed from: l */
    public static final String m49309l(URL url, Charset charset) {
        jt1.m53777p(url, "<this>");
        jt1.m53777p(charset, "charset");
        return new String(m49306i(url), charset);
    }

    /* renamed from: m */
    public static /* synthetic */ String m49310m(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(url, "<this>");
        jt1.m53777p(charset, "charset");
        return new String(m49306i(url), charset);
    }

    @xq1
    /* renamed from: n */
    public static final StringReader m49311n(String str) {
        jt1.m53777p(str, "<this>");
        return new StringReader(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r3, r4);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        throw r0;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m49312o(@com.onedelhi.secure.vr2 java.io.Reader r3, @com.onedelhi.secure.vr2 com.onedelhi.secure.ec1<? super com.onedelhi.secure.zt3<java.lang.String>, ? extends T> r4) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "block"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            r1 = 1
            com.onedelhi.secure.zt3 r2 = m49305h(r3)     // Catch:{ all -> 0x002d }
            java.lang.Object r4 = r4.mo17094X(r2)     // Catch:{ all -> 0x002d }
            com.onedelhi.secure.uq1.m67403d(r1)
            com.onedelhi.secure.C5630hz.m51313a(r3, r0)
            com.onedelhi.secure.uq1.m67402c(r1)
            return r4
        L_0x002d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            com.onedelhi.secure.uq1.m67403d(r1)
            com.onedelhi.secure.C5630hz.m51313a(r3, r4)
            com.onedelhi.secure.uq1.m67402c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gb4.m49312o(java.io.Reader, com.onedelhi.secure.ec1):java.lang.Object");
    }
}
