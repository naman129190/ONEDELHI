package com.onedelhi.secure;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/p21;", "", "", "pos", "Lcom/onedelhi/secure/no;", "source", "byteCount", "Lcom/onedelhi/secure/un4;", "b", "sink", "a", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class p21 {

    /* renamed from: a */
    public final FileChannel f33439a;

    public p21(@vr2 FileChannel fileChannel) {
        jt1.m53777p(fileChannel, "fileChannel");
        this.f33439a = fileChannel;
    }

    /* renamed from: a */
    public final void mo42355a(long j, @vr2 C6205no noVar, long j2) {
        jt1.m53777p(noVar, "sink");
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.f33439a.transferTo(j, j2, noVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final void mo42356b(long j, @vr2 C6205no noVar, long j2) throws IOException {
        jt1.m53777p(noVar, "source");
        if (j2 < 0 || j2 > noVar.mo41244V0()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.f33439a.transferFrom(noVar, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
