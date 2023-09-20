package com.onedelhi.secure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"com/onedelhi/secure/hu2", "com/onedelhi/secure/iu2"}, d2 = {}, k = 4, mv = {1, 4, 0})
public final class gu2 {
    @vr2
    /* renamed from: a */
    public static final oz3 m49832a(@vr2 File file) throws FileNotFoundException {
        return hu2.m50893b(file);
    }

    @uw1(name = "blackhole")
    @vr2
    /* renamed from: b */
    public static final oz3 m49833b() {
        return iu2.m52679a();
    }

    @vr2
    /* renamed from: c */
    public static final C6785so m49834c(@vr2 oz3 oz3) {
        return iu2.m52680b(oz3);
    }

    @vr2
    /* renamed from: d */
    public static final C6893to m49835d(@vr2 x04 x04) {
        return iu2.m52681c(x04);
    }

    /* renamed from: e */
    public static final boolean m49836e(@vr2 AssertionError assertionError) {
        return hu2.m50895d(assertionError);
    }

    @vw1
    @vr2
    /* renamed from: f */
    public static final oz3 m49837f(@vr2 File file) throws FileNotFoundException {
        return hu2.m50901j(file, false, 1, (Object) null);
    }

    @vw1
    @vr2
    /* renamed from: g */
    public static final oz3 m49838g(@vr2 File file, boolean z) throws FileNotFoundException {
        return hu2.m50897f(file, z);
    }

    @vr2
    /* renamed from: h */
    public static final oz3 m49839h(@vr2 OutputStream outputStream) {
        return hu2.m50898g(outputStream);
    }

    @vr2
    /* renamed from: i */
    public static final oz3 m49840i(@vr2 Socket socket) throws IOException {
        return hu2.m50899h(socket);
    }

    @IgnoreJRERequirement
    @vr2
    /* renamed from: j */
    public static final oz3 m49841j(@vr2 Path path, @vr2 OpenOption... openOptionArr) throws IOException {
        return hu2.m50900i(path, openOptionArr);
    }

    @vr2
    /* renamed from: l */
    public static final x04 m49843l(@vr2 File file) throws FileNotFoundException {
        return hu2.m50902k(file);
    }

    @vr2
    /* renamed from: m */
    public static final x04 m49844m(@vr2 InputStream inputStream) {
        return hu2.m50903l(inputStream);
    }

    @vr2
    /* renamed from: n */
    public static final x04 m49845n(@vr2 Socket socket) throws IOException {
        return hu2.m50904m(socket);
    }

    @IgnoreJRERequirement
    @vr2
    /* renamed from: o */
    public static final x04 m49846o(@vr2 Path path, @vr2 OpenOption... openOptionArr) throws IOException {
        return hu2.m50905n(path, openOptionArr);
    }
}
