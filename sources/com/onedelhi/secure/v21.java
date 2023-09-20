package com.onedelhi.secure;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/v21;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "Ljava/io/File;", "a", "()Ljava/io/File;", "other", "b", "", "reason", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class v21 extends IOException {
    @vr2

    /* renamed from: a */
    public final File f36405a;
    @ss2

    /* renamed from: b */
    public final File f36406b;
    @ss2

    /* renamed from: b */
    public final String f36407b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v21(@vr2 File file, @ss2 File file2, @ss2 String str) {
        super(mw0.m57654b(file, file2, str));
        jt1.m53777p(file, "file");
        this.f36405a = file;
        this.f36406b = file2;
        this.f36407b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v21(File file, File file2, String str, int i, wg0 wg0) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    @vr2
    /* renamed from: a */
    public final File mo45931a() {
        return this.f36405a;
    }

    @ss2
    /* renamed from: b */
    public final File mo45932b() {
        return this.f36406b;
    }

    @ss2
    /* renamed from: c */
    public final String mo45933c() {
        return this.f36407b;
    }
}
