package com.onedelhi.secure;

import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0007"}, d2 = {"Ljava/io/File;", "Lcom/onedelhi/secure/y21;", "direction", "Lcom/onedelhi/secure/w21;", "J", "M", "L", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/io/FilesKt")
public class c31 extends b31 {
    @vr2
    /* renamed from: J */
    public static final w21 m40672J(@vr2 File file, @vr2 y21 y21) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(y21, "direction");
        return new w21(file, y21);
    }

    /* renamed from: K */
    public static /* synthetic */ w21 m40673K(File file, y21 y21, int i, Object obj) {
        if ((i & 1) != 0) {
            y21 = y21.TOP_DOWN;
        }
        return m40672J(file, y21);
    }

    @vr2
    /* renamed from: L */
    public static final w21 m40674L(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        return m40672J(file, y21.BOTTOM_UP);
    }

    @vr2
    /* renamed from: M */
    public static final w21 m40675M(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        return m40672J(file, y21.TOP_DOWN);
    }
}
