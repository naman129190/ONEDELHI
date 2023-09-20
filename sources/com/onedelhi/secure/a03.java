package com.onedelhi.secure;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/a03;", "", "Ljava/nio/file/Path;", "path", "base", "a", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 6, 0})
public final class a03 {
    @vr2

    /* renamed from: a */
    public static final a03 f25687a = new a03();

    /* renamed from: a */
    public static final Path f25688a = Paths.get("", new String[0]);

    /* renamed from: b */
    public static final Path f25689b = Paths.get("..", new String[0]);

    @vr2
    /* renamed from: a */
    public final Path mo30380a(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "path");
        jt1.m53777p(path2, "base");
        Path normalize = path2.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        int i = 0;
        while (i < min) {
            int i2 = i + 1;
            Path name = normalize.getName(i);
            Path path3 = f25689b;
            if (!jt1.m53768g(name, path3)) {
                break;
            } else if (jt1.m53768g(normalize2.getName(i), path3)) {
                i = i2;
            } else {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (jt1.m53768g(normalize2, normalize) || !jt1.m53768g(normalize, f25688a)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            jt1.m53776o(separator, "rn.fileSystem.separator");
            normalize2 = t54.m65408J1(obj, separator, false, 2, (Object) null) ? relativize.getFileSystem().getPath(w54.m68869C6(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        jt1.m53776o(normalize2, "r");
        return normalize2;
    }
}
