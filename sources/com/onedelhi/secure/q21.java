package com.onedelhi.secure;

import java.io.File;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J#\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/onedelhi/secure/q21;", "", "", "beginIndex", "endIndex", "Ljava/io/File;", "j", "a", "", "b", "root", "segments", "c", "", "toString", "hashCode", "other", "", "equals", "Ljava/io/File;", "e", "()Ljava/io/File;", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "()Ljava/lang/String;", "rootName", "i", "()Z", "isRooted", "h", "()I", "size", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class q21 {
    @vr2

    /* renamed from: a */
    public final File f33956a;
    @vr2

    /* renamed from: a */
    public final List<File> f33957a;

    public q21(@vr2 File file, @vr2 List<? extends File> list) {
        jt1.m53777p(file, "root");
        jt1.m53777p(list, "segments");
        this.f33956a = file;
        this.f33957a = list;
    }

    /* renamed from: d */
    public static /* synthetic */ q21 m61989d(q21 q21, File file, List<File> list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = q21.f33956a;
        }
        if ((i & 2) != 0) {
            list = q21.f33957a;
        }
        return q21.mo43085c(file, list);
    }

    @vr2
    /* renamed from: a */
    public final File mo43083a() {
        return this.f33956a;
    }

    @vr2
    /* renamed from: b */
    public final List<File> mo43084b() {
        return this.f33957a;
    }

    @vr2
    /* renamed from: c */
    public final q21 mo43085c(@vr2 File file, @vr2 List<? extends File> list) {
        jt1.m53777p(file, "root");
        jt1.m53777p(list, "segments");
        return new q21(file, list);
    }

    @vr2
    /* renamed from: e */
    public final File mo43086e() {
        return this.f33956a;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21 = (q21) obj;
        return jt1.m53768g(this.f33956a, q21.f33956a) && jt1.m53768g(this.f33957a, q21.f33957a);
    }

    @vr2
    /* renamed from: f */
    public final String mo43088f() {
        String path = this.f33956a.getPath();
        jt1.m53776o(path, "root.path");
        return path;
    }

    @vr2
    /* renamed from: g */
    public final List<File> mo43089g() {
        return this.f33957a;
    }

    /* renamed from: h */
    public final int mo43090h() {
        return this.f33957a.size();
    }

    public int hashCode() {
        return (this.f33956a.hashCode() * 31) + this.f33957a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo43092i() {
        String path = this.f33956a.getPath();
        jt1.m53776o(path, "root.path");
        return path.length() > 0;
    }

    @vr2
    /* renamed from: j */
    public final File mo43093j(int i, int i2) {
        if (i < 0 || i > i2 || i2 > mo43090h()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.f33957a.subList(i, i2);
        String str = File.separator;
        jt1.m53776o(str, "separator");
        return new File(a10.m35851h3(subList, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (ec1) null, 62, (Object) null));
    }

    @vr2
    public String toString() {
        return "FilePathComponents(root=" + this.f33956a + ", segments=" + this.f33957a + ')';
    }
}
