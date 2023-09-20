package com.onedelhi.secure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\t\u001a'\u0010\u0013\u001a\u00020\u0001*\u00020\u000f2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u0004*\u00020\u000f2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\"\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u001c\u0010!\u001a\u00020\n*\u00060\u001dj\u0002`\u001e8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Ljava/io/OutputStream;", "Lcom/onedelhi/secure/oz3;", "g", "Ljava/io/InputStream;", "Lcom/onedelhi/secure/x04;", "l", "Ljava/net/Socket;", "h", "m", "Ljava/io/File;", "", "append", "f", "b", "k", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", "options", "i", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/onedelhi/secure/oz3;", "n", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/onedelhi/secure/x04;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "c", "()Ljava/util/logging/Logger;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "d", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 4, 0}, xs = "okio/Okio")
public final /* synthetic */ class hu2 {

    /* renamed from: a */
    public static final Logger f29790a = Logger.getLogger("okio.Okio");

    @vr2
    /* renamed from: b */
    public static final oz3 m50893b(@vr2 File file) throws FileNotFoundException {
        jt1.m53777p(file, "$this$appendingSink");
        return gu2.m49839h(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final Logger m50894c() {
        return f29790a;
    }

    /* renamed from: d */
    public static final boolean m50895d(@vr2 AssertionError assertionError) {
        jt1.m53777p(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? u54.m66602V2(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    @vw1
    @vr2
    /* renamed from: e */
    public static final oz3 m50896e(@vr2 File file) throws FileNotFoundException {
        return m50901j(file, false, 1, (Object) null);
    }

    @vw1
    @vr2
    /* renamed from: f */
    public static final oz3 m50897f(@vr2 File file, boolean z) throws FileNotFoundException {
        jt1.m53777p(file, "$this$sink");
        return gu2.m49839h(new FileOutputStream(file, z));
    }

    @vr2
    /* renamed from: g */
    public static final oz3 m50898g(@vr2 OutputStream outputStream) {
        jt1.m53777p(outputStream, "$this$sink");
        return new ex2(outputStream, new me4());
    }

    @vr2
    /* renamed from: h */
    public static final oz3 m50899h(@vr2 Socket socket) throws IOException {
        jt1.m53777p(socket, "$this$sink");
        t04 t04 = new t04(socket);
        OutputStream outputStream = socket.getOutputStream();
        jt1.m53776o(outputStream, "getOutputStream()");
        return t04.mo42500z(new ex2(outputStream, t04));
    }

    @IgnoreJRERequirement
    @vr2
    /* renamed from: i */
    public static final oz3 m50900i(@vr2 Path path, @vr2 OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "$this$sink");
        jt1.m53777p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(newOutputStream, "Files.newOutputStream(this, *options)");
        return gu2.m49839h(newOutputStream);
    }

    /* renamed from: j */
    public static /* synthetic */ oz3 m50901j(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return gu2.m49838g(file, z);
    }

    @vr2
    /* renamed from: k */
    public static final x04 m50902k(@vr2 File file) throws FileNotFoundException {
        jt1.m53777p(file, "$this$source");
        return gu2.m49844m(new FileInputStream(file));
    }

    @vr2
    /* renamed from: l */
    public static final x04 m50903l(@vr2 InputStream inputStream) {
        jt1.m53777p(inputStream, "$this$source");
        return new dr1(inputStream, new me4());
    }

    @vr2
    /* renamed from: m */
    public static final x04 m50904m(@vr2 Socket socket) throws IOException {
        jt1.m53777p(socket, "$this$source");
        t04 t04 = new t04(socket);
        InputStream inputStream = socket.getInputStream();
        jt1.m53776o(inputStream, "getInputStream()");
        return t04.mo42494A(new dr1(inputStream, t04));
    }

    @IgnoreJRERequirement
    @vr2
    /* renamed from: n */
    public static final x04 m50905n(@vr2 Path path, @vr2 OpenOption... openOptionArr) throws IOException {
        jt1.m53777p(path, "$this$source");
        jt1.m53777p(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        jt1.m53776o(newInputStream, "Files.newInputStream(this, *options)");
        return gu2.m49844m(newInputStream);
    }
}
