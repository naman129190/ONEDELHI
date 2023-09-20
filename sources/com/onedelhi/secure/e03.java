package com.onedelhi.secure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\b\u001a2\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a<\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\b\u001a0\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00142\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0014H\b\u001a\u0016\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a9\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a=\u0010'\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00170\"H\bø\u0001\u0000\u001a(\u0010)\u001a\u00020(*\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b)\u0010*\u001a(\u0010,\u001a\u00020+*\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0.*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u001aA\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u00100*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b01\u0012\u0004\u0012\u00028\u00000\"H\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a@\u00107\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d052\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b7\u00108\u001a@\u00109\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\b¢\u0006\u0004\b9\u0010:\u001a%\u0010;\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u001a%\u0010<\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\b\u0002\u0007\n\u0005\b20\u0001¨\u0006="}, d2 = {"Ljava/nio/file/Path;", "Ljava/nio/charset/Charset;", "charset", "", "Ljava/nio/file/OpenOption;", "options", "Ljava/io/InputStreamReader;", "u", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "", "bufferSize", "Ljava/io/BufferedReader;", "h", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "Ljava/io/OutputStreamWriter;", "F", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "Ljava/io/BufferedWriter;", "j", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "", "p", "array", "Lcom/onedelhi/secure/un4;", "y", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "a", "", "s", "", "text", "D", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "f", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "line", "action", "l", "Ljava/io/InputStream;", "n", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "o", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "", "q", "T", "Lcom/onedelhi/secure/zt3;", "block", "w", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "", "lines", "A", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "z", "(Ljava/nio/file/Path;Lcom/onedelhi/secure/zt3;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "c", "b", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 6, 0}, xs = "kotlin/io/path/PathsKt")
public class e03 {
    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: A */
    public static final Path m45749A(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(iterable, "lines");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(write, "write(this, lines, charset, *options)");
        return write;
    }

    /* renamed from: B */
    public static /* synthetic */ Path m45750B(Path path, zt3 zt3, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(zt3, "lines");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        Path write = Files.write(path, hu3.m50948N(zt3), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    /* renamed from: C */
    public static /* synthetic */ Path m45751C(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(iterable, "lines");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(write, "write(this, lines, charset, *options)");
        return write;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r4, r1);
     */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m45752D(@com.onedelhi.secure.vr2 java.nio.file.Path r1, @com.onedelhi.secure.vr2 java.lang.CharSequence r2, @com.onedelhi.secure.vr2 java.nio.charset.Charset r3, @com.onedelhi.secure.vr2 java.nio.file.OpenOption... r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r0)
            java.lang.String r0 = "text"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "options"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r4)
            java.lang.String r4 = "newOutputStream(this, *options)"
            com.onedelhi.secure.jt1.m53776o(r1, r4)
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter
            r4.<init>(r1, r3)
            r4.append(r2)     // Catch:{ all -> 0x0031 }
            r1 = 0
            com.onedelhi.secure.C5630hz.m51313a(r4, r1)
            return
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r4, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e03.m45752D(java.nio.file.Path, java.lang.CharSequence, java.nio.charset.Charset, java.nio.file.OpenOption[]):void");
    }

    /* renamed from: E */
    public static /* synthetic */ void m45753E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        m45752D(path, charSequence, charset, openOptionArr);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: F */
    public static final OutputStreamWriter m45754F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* renamed from: G */
    public static /* synthetic */ OutputStreamWriter m45755G(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: a */
    public static final void m45756a(Path path, byte[] bArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(bArr, "array");
        Files.write(path, bArr, new OpenOption[]{StandardOpenOption.APPEND});
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: b */
    public static final Path m45757b(Path path, zt3<? extends CharSequence> zt3, Charset charset) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(zt3, "lines");
        jt1.m53777p(charset, "charset");
        Path write = Files.write(path, hu3.m50948N(zt3), charset, new OpenOption[]{StandardOpenOption.APPEND});
        jt1.m53776o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: c */
    public static final Path m45758c(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(iterable, "lines");
        jt1.m53777p(charset, "charset");
        Path write = Files.write(path, iterable, charset, new OpenOption[]{StandardOpenOption.APPEND});
        jt1.m53776o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    /* renamed from: d */
    public static /* synthetic */ Path m45759d(Path path, zt3 zt3, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(zt3, "lines");
        jt1.m53777p(charset, "charset");
        Path write = Files.write(path, hu3.m50948N(zt3), charset, new OpenOption[]{StandardOpenOption.APPEND});
        jt1.m53776o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    /* renamed from: e */
    public static /* synthetic */ Path m45760e(Path path, Iterable iterable, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(iterable, "lines");
        jt1.m53777p(charset, "charset");
        Path write = Files.write(path, iterable, charset, new OpenOption[]{StandardOpenOption.APPEND});
        jt1.m53776o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r3);
     */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m45761f(@com.onedelhi.secure.vr2 java.nio.file.Path r3, @com.onedelhi.secure.vr2 java.lang.CharSequence r4, @com.onedelhi.secure.vr2 java.nio.charset.Charset r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "text"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r2 = 0
            r0[r2] = r1
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r0)
            java.lang.String r0 = "newOutputStream(this, StandardOpenOption.APPEND)"
            com.onedelhi.secure.jt1.m53776o(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r3, r5)
            r0.append(r4)     // Catch:{ all -> 0x002d }
            r3 = 0
            com.onedelhi.secure.C5630hz.m51313a(r0, r3)
            return
        L_0x002d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002f:
            r4 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e03.m45761f(java.nio.file.Path, java.lang.CharSequence, java.nio.charset.Charset):void");
    }

    /* renamed from: g */
    public static /* synthetic */ void m45762g(Path path, CharSequence charSequence, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C5604hx.f29888a;
        }
        m45761f(path, charSequence, charset);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: h */
    public static final BufferedReader m45763h(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* renamed from: i */
    public static /* synthetic */ BufferedReader m45764i(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: j */
    public static final BufferedWriter m45765j(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* renamed from: k */
    public static /* synthetic */ BufferedWriter m45766k(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r2, r4);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r0;
     */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    @com.onedelhi.secure.xq1
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m45767l(java.nio.file.Path r2, java.nio.charset.Charset r3, com.onedelhi.secure.ec1<? super java.lang.String, com.onedelhi.secure.un4> r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "action"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            java.io.BufferedReader r2 = java.nio.file.Files.newBufferedReader(r2, r3)
            java.lang.String r3 = "newBufferedReader(this, charset)"
            com.onedelhi.secure.jt1.m53776o(r2, r3)
            r3 = 1
            com.onedelhi.secure.zt3 r0 = com.onedelhi.secure.gb4.m49305h(r2)     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            r4.mo17094X(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0021
        L_0x002f:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x003c }
            com.onedelhi.secure.uq1.m67403d(r3)
            r4 = 0
            com.onedelhi.secure.C5630hz.m51313a(r2, r4)
            com.onedelhi.secure.uq1.m67402c(r3)
            return
        L_0x003c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            com.onedelhi.secure.uq1.m67403d(r3)
            com.onedelhi.secure.C5630hz.m51313a(r2, r4)
            com.onedelhi.secure.uq1.m67402c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e03.m45767l(java.nio.file.Path, java.nio.charset.Charset, com.onedelhi.secure.ec1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r1, r2);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw r3;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m45768m(java.nio.file.Path r1, java.nio.charset.Charset r2, com.onedelhi.secure.ec1 r3, int r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.nio.charset.Charset r2 = com.onedelhi.secure.C5604hx.f29888a
        L_0x0006:
            java.lang.String r4 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r4)
            java.lang.String r4 = "charset"
            com.onedelhi.secure.jt1.m53777p(r2, r4)
            java.lang.String r4 = "action"
            com.onedelhi.secure.jt1.m53777p(r3, r4)
            java.io.BufferedReader r1 = java.nio.file.Files.newBufferedReader(r1, r2)
            java.lang.String r2 = "newBufferedReader(this, charset)"
            com.onedelhi.secure.jt1.m53776o(r1, r2)
            r2 = 0
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.gb4.m49305h(r1)     // Catch:{ all -> 0x0041 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0041 }
        L_0x0027:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0041 }
            r3.mo17094X(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0027
        L_0x0035:
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0041 }
            com.onedelhi.secure.uq1.m67403d(r5)
            com.onedelhi.secure.C5630hz.m51313a(r1, r2)
            com.onedelhi.secure.uq1.m67402c(r5)
            return
        L_0x0041:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r3 = move-exception
            com.onedelhi.secure.uq1.m67403d(r5)
            com.onedelhi.secure.C5630hz.m51313a(r1, r2)
            com.onedelhi.secure.uq1.m67402c(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e03.m45768m(java.nio.file.Path, java.nio.charset.Charset, com.onedelhi.secure.ec1, int, java.lang.Object):void");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: n */
    public static final InputStream m45769n(Path path, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(newInputStream, "newInputStream(this, *options)");
        return newInputStream;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: o */
    public static final OutputStream m45770o(Path path, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(newOutputStream, "newOutputStream(this, *options)");
        return newOutputStream;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: p */
    public static final byte[] m45771p(Path path) throws IOException {
        jt1.m53777p(path, "<this>");
        byte[] readAllBytes = Files.readAllBytes(path);
        jt1.m53776o(readAllBytes, "readAllBytes(this)");
        return readAllBytes;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: q */
    public static final List<String> m45772q(Path path, Charset charset) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        jt1.m53776o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    /* renamed from: r */
    public static /* synthetic */ List m45773r(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        jt1.m53776o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r2, r3);
     */
    @com.onedelhi.secure.vr2
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m45774s(@com.onedelhi.secure.vr2 java.nio.file.Path r3, @com.onedelhi.secure.vr2 java.nio.charset.Charset r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r3 = java.nio.file.Files.newInputStream(r3, r0)
            r2.<init>(r3, r4)
            java.lang.String r3 = com.onedelhi.secure.gb4.m49308k(r2)     // Catch:{ all -> 0x0025 }
            r4 = 0
            com.onedelhi.secure.C5630hz.m51313a(r2, r4)
            return r3
        L_0x0025:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r4 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e03.m45774s(java.nio.file.Path, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: t */
    public static /* synthetic */ String m45775t(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        return m45774s(path, charset);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: u */
    public static final InputStreamReader m45776u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* renamed from: v */
    public static /* synthetic */ InputStreamReader m45777v(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r1, r3);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    @com.onedelhi.secure.xq1
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m45778w(java.nio.file.Path r1, java.nio.charset.Charset r2, com.onedelhi.secure.ec1<? super com.onedelhi.secure.zt3<java.lang.String>, ? extends T> r3) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r0)
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "block"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.io.BufferedReader r1 = java.nio.file.Files.newBufferedReader(r1, r2)
            r2 = 1
            java.lang.String r0 = "it"
            com.onedelhi.secure.jt1.m53776o(r1, r0)     // Catch:{ all -> 0x002c }
            com.onedelhi.secure.zt3 r0 = com.onedelhi.secure.gb4.m49305h(r1)     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r3.mo17094X(r0)     // Catch:{ all -> 0x002c }
            com.onedelhi.secure.uq1.m67403d(r2)
            r0 = 0
            com.onedelhi.secure.C5630hz.m51313a(r1, r0)
            com.onedelhi.secure.uq1.m67402c(r2)
            return r3
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            com.onedelhi.secure.uq1.m67403d(r2)
            com.onedelhi.secure.C5630hz.m51313a(r1, r3)
            com.onedelhi.secure.uq1.m67402c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e03.m45778w(java.nio.file.Path, java.nio.charset.Charset, com.onedelhi.secure.ec1):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r0, r1);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw r2;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m45779x(java.nio.file.Path r0, java.nio.charset.Charset r1, com.onedelhi.secure.ec1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.nio.charset.Charset r1 = com.onedelhi.secure.C5604hx.f29888a
        L_0x0006:
            java.lang.String r3 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r0, r3)
            java.lang.String r3 = "charset"
            com.onedelhi.secure.jt1.m53777p(r1, r3)
            java.lang.String r3 = "block"
            com.onedelhi.secure.jt1.m53777p(r2, r3)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0, r1)
            r1 = 0
            java.lang.String r3 = "it"
            com.onedelhi.secure.jt1.m53776o(r0, r3)     // Catch:{ all -> 0x0031 }
            com.onedelhi.secure.zt3 r3 = com.onedelhi.secure.gb4.m49305h(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r2.mo17094X(r3)     // Catch:{ all -> 0x0031 }
            com.onedelhi.secure.uq1.m67403d(r4)
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            com.onedelhi.secure.uq1.m67402c(r4)
            return r2
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            com.onedelhi.secure.uq1.m67403d(r4)
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            com.onedelhi.secure.uq1.m67402c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e03.m45779x(java.nio.file.Path, java.nio.charset.Charset, com.onedelhi.secure.ec1, int, java.lang.Object):java.lang.Object");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: y */
    public static final void m45780y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(bArr, "array");
        jt1.m53777p(openOptionArr, "options");
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: z */
    public static final Path m45781z(Path path, zt3<? extends CharSequence> zt3, Charset charset, OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(zt3, "lines");
        jt1.m53777p(charset, "charset");
        jt1.m53777p(openOptionArr, "options");
        Path write = Files.write(path, hu3.m50948N(zt3), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }
}
