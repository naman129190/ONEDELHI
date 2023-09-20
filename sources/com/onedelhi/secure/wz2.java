package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Path;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f¨\u0006\f"}, d2 = {"Landroid/graphics/Path;", "", "error", "", "Lcom/onedelhi/secure/b03;", "b", "p", "f", "d", "e", "a", "g", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
@SuppressLint({"ClassVerificationFailure"})
public final class wz2 {
    @sj3(19)
    @vr2
    /* renamed from: a */
    public static final Path m31186a(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "p");
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @sj3(26)
    @vr2
    /* renamed from: b */
    public static final Iterable<b03> m31187b(@vr2 Path path, float f) {
        jt1.m53777p(path, "<this>");
        Collection<b03> b = c03.m12183b(path, f);
        jt1.m53776o(b, "flatten(this, error)");
        return b;
    }

    /* renamed from: c */
    public static /* synthetic */ Iterable m31188c(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return m31187b(path, f);
    }

    @sj3(19)
    @vr2
    /* renamed from: d */
    public static final Path m31189d(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @sj3(19)
    @vr2
    /* renamed from: e */
    public static final Path m31190e(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @sj3(19)
    @vr2
    /* renamed from: f */
    public static final Path m31191f(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @sj3(19)
    @vr2
    /* renamed from: g */
    public static final Path m31192g(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
