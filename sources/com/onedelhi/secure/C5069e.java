package com.onedelhi.secure;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J+\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\"\u001a\u00020\u0004H\u0007¨\u0006%"}, d2 = {"Lcom/onedelhi/secure/e;", "", "Ljava/io/File;", "file", "Lcom/onedelhi/secure/oz3;", "a", "sink", "Lcom/onedelhi/secure/so;", "c", "Lcom/onedelhi/secure/x04;", "source", "Lcom/onedelhi/secure/to;", "d", "e", "Ljava/io/OutputStream;", "outputStream", "f", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "h", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/onedelhi/secure/oz3;", "Ljava/net/Socket;", "socket", "g", "i", "Ljava/io/InputStream;", "inputStream", "j", "l", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/onedelhi/secure/x04;", "k", "b", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
@xj0(message = "changed in Okio 2.x")
/* renamed from: com.onedelhi.secure.e */
public final class C5069e {

    /* renamed from: a */
    public static final C5069e f27664a = new C5069e();

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    /* renamed from: a */
    public final oz3 mo34733a(@vr2 File file) {
        jt1.m53777p(file, "file");
        return gu2.m49832a(file);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    /* renamed from: b */
    public final oz3 mo34734b() {
        return gu2.m49833b();
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "sink.buffer()", imports = {"okio.buffer"}))
    /* renamed from: c */
    public final C6785so mo34735c(@vr2 oz3 oz3) {
        jt1.m53777p(oz3, "sink");
        return gu2.m49834c(oz3);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "source.buffer()", imports = {"okio.buffer"}))
    /* renamed from: d */
    public final C6893to mo34736d(@vr2 x04 x04) {
        jt1.m53777p(x04, "source");
        return gu2.m49835d(x04);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "file.sink()", imports = {"okio.sink"}))
    /* renamed from: e */
    public final oz3 mo34737e(@vr2 File file) {
        jt1.m53777p(file, "file");
        return hu2.m50901j(file, false, 1, (Object) null);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "outputStream.sink()", imports = {"okio.sink"}))
    /* renamed from: f */
    public final oz3 mo34738f(@vr2 OutputStream outputStream) {
        jt1.m53777p(outputStream, "outputStream");
        return gu2.m49839h(outputStream);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "socket.sink()", imports = {"okio.sink"}))
    /* renamed from: g */
    public final oz3 mo34739g(@vr2 Socket socket) {
        jt1.m53777p(socket, "socket");
        return gu2.m49840i(socket);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "path.sink(*options)", imports = {"okio.sink"}))
    /* renamed from: h */
    public final oz3 mo34740h(@vr2 Path path, @vr2 OpenOption... openOptionArr) {
        jt1.m53777p(path, "path");
        jt1.m53777p(openOptionArr, "options");
        return gu2.m49841j(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "file.source()", imports = {"okio.source"}))
    /* renamed from: i */
    public final x04 mo34741i(@vr2 File file) {
        jt1.m53777p(file, "file");
        return gu2.m49843l(file);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "inputStream.source()", imports = {"okio.source"}))
    /* renamed from: j */
    public final x04 mo34742j(@vr2 InputStream inputStream) {
        jt1.m53777p(inputStream, "inputStream");
        return gu2.m49844m(inputStream);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "socket.source()", imports = {"okio.source"}))
    /* renamed from: k */
    public final x04 mo34743k(@vr2 Socket socket) {
        jt1.m53777p(socket, "socket");
        return gu2.m49845n(socket);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "path.source(*options)", imports = {"okio.source"}))
    /* renamed from: l */
    public final x04 mo34744l(@vr2 Path path, @vr2 OpenOption... openOptionArr) {
        jt1.m53777p(path, "path");
        jt1.m53777p(openOptionArr, "options");
        return gu2.m49846o(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}
