package com.onedelhi.secure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u001a!\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\b\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\b\u001a\u0017\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\u0012\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000f\u001a\u0012\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000f\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001aB\u0010 \u001a\u00020\u0012*\u00020\u000026\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\u001a\u001aJ\u0010\"\u001a\u00020\u0012*\u00020\u00002\u0006\u0010!\u001a\u00020\u000526\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\u001a\u001a7\u0010%\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00120#\u001a\r\u0010'\u001a\u00020&*\u00020\u0000H\b\u001a\r\u0010)\u001a\u00020(*\u00020\u0000H\b\u001a\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150**\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001aD\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010,*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150-\u0012\u0004\u0012\u00028\u00000#H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0002\u000f\n\u0005\b20\u0001\n\u0006\b\u0011(/0\u0001¨\u00062"}, d2 = {"Ljava/io/File;", "Ljava/nio/charset/Charset;", "charset", "Ljava/io/InputStreamReader;", "A", "", "bufferSize", "Ljava/io/BufferedReader;", "j", "Ljava/io/OutputStreamWriter;", "H", "Ljava/io/BufferedWriter;", "l", "Ljava/io/PrintWriter;", "t", "", "v", "array", "Lcom/onedelhi/secure/un4;", "E", "g", "", "y", "text", "F", "h", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "buffer", "bytesRead", "action", "o", "blockSize", "n", "Lkotlin/Function1;", "line", "p", "Ljava/io/FileInputStream;", "r", "Ljava/io/FileOutputStream;", "s", "", "w", "T", "Lcom/onedelhi/secure/zt3;", "block", "Requires newer compiler version to be inlined correctly.", "C", "(Ljava/io/File;Ljava/nio/charset/Charset;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/io/FilesKt")
public class b31 extends a31 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.b31$a */
    public static final class C4619a extends d12 implements ec1<String, un4> {

        /* renamed from: a */
        public final /* synthetic */ ArrayList<String> f26115a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4619a(ArrayList<String> arrayList) {
            super(1);
            this.f26115a = arrayList;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo31351a((String) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo31351a(@vr2 String str) {
            jt1.m53777p(str, "it");
            this.f26115a.add(str);
        }
    }

    @xq1
    /* renamed from: A */
    public static final InputStreamReader m39334A(File file, Charset charset) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* renamed from: B */
    public static /* synthetic */ InputStreamReader m39335B(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r0, r2);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r4;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m39336C(@com.onedelhi.secure.vr2 java.io.File r2, @com.onedelhi.secure.vr2 java.nio.charset.Charset r3, @com.onedelhi.secure.vr2 com.onedelhi.secure.ec1<? super com.onedelhi.secure.zt3<java.lang.String>, ? extends T> r4) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "block"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0020
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x0028
        L_0x0020:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0, r3)
            r0 = r2
        L_0x0028:
            r2 = 0
            r3 = 1
            com.onedelhi.secure.zt3 r1 = com.onedelhi.secure.gb4.m49305h(r0)     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.mo17094X(r1)     // Catch:{ all -> 0x003c }
            com.onedelhi.secure.uq1.m67403d(r3)
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            com.onedelhi.secure.uq1.m67402c(r3)
            return r4
        L_0x003c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003e }
        L_0x003e:
            r4 = move-exception
            com.onedelhi.secure.uq1.m67403d(r3)
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            com.onedelhi.secure.uq1.m67402c(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b31.m39336C(java.io.File, java.nio.charset.Charset, com.onedelhi.secure.ec1):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r0, r2);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        throw r3;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m39337D(java.io.File r2, java.nio.charset.Charset r3, com.onedelhi.secure.ec1 r4, int r5, java.lang.Object r6) {
        /*
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0006
            java.nio.charset.Charset r3 = com.onedelhi.secure.C5604hx.f29888a
        L_0x0006:
            r5 = 8192(0x2000, float:1.14794E-41)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0019
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x001f
        L_0x0019:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r5)
            r0 = r2
        L_0x001f:
            r2 = 0
            com.onedelhi.secure.zt3 r3 = com.onedelhi.secure.gb4.m49305h(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Object r3 = r4.mo17094X(r3)     // Catch:{ all -> 0x0032 }
            com.onedelhi.secure.uq1.m67403d(r6)
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            com.onedelhi.secure.uq1.m67402c(r6)
            return r3
        L_0x0032:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r3 = move-exception
            com.onedelhi.secure.uq1.m67403d(r6)
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            com.onedelhi.secure.uq1.m67402c(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b31.m39337D(java.io.File, java.nio.charset.Charset, com.onedelhi.secure.ec1, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r1);
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m39338E(@com.onedelhi.secure.vr2 java.io.File r1, @com.onedelhi.secure.vr2 byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r0)
            java.lang.String r0 = "array"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            com.onedelhi.secure.un4 r1 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0019 }
            r1 = 0
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b31.m39338E(java.io.File, byte[]):void");
    }

    /* renamed from: F */
    public static final void m39339F(@vr2 File file, @vr2 String str, @vr2 Charset charset) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(str, "text");
        jt1.m53777p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        m39338E(file, bytes);
    }

    /* renamed from: G */
    public static /* synthetic */ void m39340G(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        m39339F(file, str, charset);
    }

    @xq1
    /* renamed from: H */
    public static final OutputStreamWriter m39341H(File file, Charset charset) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* renamed from: I */
    public static /* synthetic */ OutputStreamWriter m39342I(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r2);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m39343g(@com.onedelhi.secure.vr2 java.io.File r2, @com.onedelhi.secure.vr2 byte[] r3) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "array"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch:{ all -> 0x001a }
            com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x001a }
            r2 = 0
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            return
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r3 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b31.m39343g(java.io.File, byte[]):void");
    }

    /* renamed from: h */
    public static final void m39344h(@vr2 File file, @vr2 String str, @vr2 Charset charset) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(str, "text");
        jt1.m53777p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        m39343g(file, bytes);
    }

    /* renamed from: i */
    public static /* synthetic */ void m39345i(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        m39344h(file, str, charset);
    }

    @xq1
    /* renamed from: j */
    public static final BufferedReader m39346j(File file, Charset charset, int i) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    /* renamed from: k */
    public static /* synthetic */ BufferedReader m39347k(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    @xq1
    /* renamed from: l */
    public static final BufferedWriter m39348l(File file, Charset charset, int i) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    /* renamed from: m */
    public static /* synthetic */ BufferedWriter m39349m(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r2;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m39350n(@com.onedelhi.secure.vr2 java.io.File r1, int r2, @com.onedelhi.secure.vr2 com.onedelhi.secure.sc1<? super byte[], ? super java.lang.Integer, com.onedelhi.secure.un4> r3) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r0)
            java.lang.String r0 = "action"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            r0 = 512(0x200, float:7.175E-43)
            int r2 = com.onedelhi.secure.df3.m45198n(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.read(r2)     // Catch:{ all -> 0x002c }
            if (r1 > 0) goto L_0x0024
            com.onedelhi.secure.un4 r1 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x002c }
            r1 = 0
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            return
        L_0x0024:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x002c }
            r3.mo21054h0(r2, r1)     // Catch:{ all -> 0x002c }
            goto L_0x0017
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b31.m39350n(java.io.File, int, com.onedelhi.secure.sc1):void");
    }

    /* renamed from: o */
    public static final void m39351o(@vr2 File file, @vr2 sc1<? super byte[], ? super Integer, un4> sc1) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(sc1, "action");
        m39350n(file, 4096, sc1);
    }

    /* renamed from: p */
    public static final void m39352p(@vr2 File file, @vr2 Charset charset, @vr2 ec1<? super String, un4> ec1) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(ec1, "action");
        gb4.m49304g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), ec1);
    }

    /* renamed from: q */
    public static /* synthetic */ void m39353q(File file, Charset charset, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        m39352p(file, charset, ec1);
    }

    @xq1
    /* renamed from: r */
    public static final FileInputStream m39354r(File file) {
        jt1.m53777p(file, "<this>");
        return new FileInputStream(file);
    }

    @xq1
    /* renamed from: s */
    public static final FileOutputStream m39355s(File file) {
        jt1.m53777p(file, "<this>");
        return new FileOutputStream(file);
    }

    @xq1
    /* renamed from: t */
    public static final PrintWriter m39356t(File file, Charset charset) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    /* renamed from: u */
    public static /* synthetic */ PrintWriter m39357u(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        throw r1;
     */
    @com.onedelhi.secure.vr2
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m39358v(@com.onedelhi.secure.vr2 java.io.File r10) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch:{ all -> 0x00a5 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r5 = "File "
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0083
            int r2 = (int) r1
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x00a5 }
            r3 = 0
            r4 = r2
            r6 = 0
        L_0x001d:
            if (r4 <= 0) goto L_0x0028
            int r7 = r0.read(r1, r6, r4)     // Catch:{ all -> 0x00a5 }
            if (r7 < 0) goto L_0x0028
            int r4 = r4 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r4 <= 0) goto L_0x0035
            byte[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch:{ all -> 0x00a5 }
            com.onedelhi.secure.jt1.m53776o(r1, r7)     // Catch:{ all -> 0x00a5 }
            goto L_0x0065
        L_0x0035:
            int r4 = r0.read()     // Catch:{ all -> 0x00a5 }
            r6 = -1
            if (r4 != r6) goto L_0x003d
            goto L_0x0065
        L_0x003d:
            com.onedelhi.secure.ry0 r6 = new com.onedelhi.secure.ry0     // Catch:{ all -> 0x00a5 }
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x00a5 }
            r6.write(r4)     // Catch:{ all -> 0x00a5 }
            r4 = 2
            com.onedelhi.secure.C5053dr.m45500l(r0, r6, r3, r4, r8)     // Catch:{ all -> 0x00a5 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + r2
            if (r4 < 0) goto L_0x0069
            byte[] r10 = r6.mo44109a()     // Catch:{ all -> 0x00a5 }
            byte[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch:{ all -> 0x00a5 }
            com.onedelhi.secure.jt1.m53776o(r1, r7)     // Catch:{ all -> 0x00a5 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a5 }
            byte[] r1 = com.onedelhi.secure.C7458za.m72840W0(r10, r1, r2, r3, r4)     // Catch:{ all -> 0x00a5 }
        L_0x0065:
            com.onedelhi.secure.C5630hz.m51313a(r0, r8)
            return r1
        L_0x0069:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
            r2.append(r5)     // Catch:{ all -> 0x00a5 }
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00a5 }
            r1.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x0083:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r4.<init>()     // Catch:{ all -> 0x00a5 }
            r4.append(r5)     // Catch:{ all -> 0x00a5 }
            r4.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big ("
            r4.append(r10)     // Catch:{ all -> 0x00a5 }
            r4.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " bytes) to fit in memory."
            r4.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x00a5 }
            r3.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r3     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b31.m39358v(java.io.File):byte[]");
    }

    @vr2
    /* renamed from: w */
    public static final List<String> m39359w(@vr2 File file, @vr2 Charset charset) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(charset, "charset");
        ArrayList arrayList = new ArrayList();
        m39352p(file, charset, new C4619a(arrayList));
        return arrayList;
    }

    /* renamed from: x */
    public static /* synthetic */ List m39360x(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        return m39359w(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r2);
     */
    @com.onedelhi.secure.vr2
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m39361y(@com.onedelhi.secure.vr2 java.io.File r2, @com.onedelhi.secure.vr2 java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = com.onedelhi.secure.gb4.m49308k(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            com.onedelhi.secure.C5630hz.m51313a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b31.m39361y(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: z */
    public static /* synthetic */ String m39362z(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        return m39361y(file, charset);
    }
}
