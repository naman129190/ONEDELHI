package com.onedelhi.secure;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\b\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0007\"!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"", "Lcom/onedelhi/secure/un4;", "f", "Ljava/io/PrintWriter;", "writer", "h", "Ljava/io/PrintStream;", "stream", "g", "", "i", "exception", "a", "", "Ljava/lang/StackTraceElement;", "b", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "getStackTrace$annotations", "(Ljava/lang/Throwable;)V", "stackTrace", "", "d", "(Ljava/lang/Throwable;)Ljava/util/List;", "getSuppressedExceptions$annotations", "suppressedExceptions", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/ExceptionsKt")
public class pw0 {
    @gz3(version = "1.1")
    @ol1
    /* renamed from: a */
    public static final void m61687a(@vr2 Throwable th, @vr2 Throwable th2) {
        jt1.m53777p(th, "<this>");
        jt1.m53777p(th2, "exception");
        if (th != th2) {
            o23.f32878a.mo37549a(th, th2);
        }
    }

    @vr2
    /* renamed from: b */
    public static final StackTraceElement[] m61688b(@vr2 Throwable th) {
        jt1.m53777p(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        jt1.m53774m(stackTrace);
        return stackTrace;
    }

    /* renamed from: c */
    public static /* synthetic */ void m61689c(Throwable th) {
    }

    @vr2
    /* renamed from: d */
    public static final List<Throwable> m61690d(@vr2 Throwable th) {
        jt1.m53777p(th, "<this>");
        return o23.f32878a.mo37550d(th);
    }

    @gz3(version = "1.4")
    /* renamed from: e */
    public static /* synthetic */ void m61691e(Throwable th) {
    }

    @xq1
    /* renamed from: f */
    public static final void m61692f(Throwable th) {
        jt1.m53777p(th, "<this>");
        th.printStackTrace();
    }

    @xq1
    /* renamed from: g */
    public static final void m61693g(Throwable th, PrintStream printStream) {
        jt1.m53777p(th, "<this>");
        jt1.m53777p(printStream, "stream");
        th.printStackTrace(printStream);
    }

    @xq1
    /* renamed from: h */
    public static final void m61694h(Throwable th, PrintWriter printWriter) {
        jt1.m53777p(th, "<this>");
        jt1.m53777p(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @gz3(version = "1.4")
    @vr2
    /* renamed from: i */
    public static final String m61695i(@vr2 Throwable th) {
        jt1.m53777p(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        jt1.m53776o(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
