package com.onedelhi.secure;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\b\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0006"}, d2 = {"", "Landroid/net/Uri;", "c", "Ljava/io/File;", "b", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class jp4 {
    @vr2
    /* renamed from: a */
    public static final File m18737a(@vr2 Uri uri) {
        jt1.m53777p(uri, "<this>");
        if (jt1.m53768g(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    @vr2
    /* renamed from: b */
    public static final Uri m18738b(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        jt1.m53776o(fromFile, "fromFile(this)");
        return fromFile;
    }

    @vr2
    /* renamed from: c */
    public static final Uri m18739c(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        Uri parse = Uri.parse(str);
        jt1.m53776o(parse, "parse(this)");
        return parse;
    }
}
