package com.onedelhi.secure;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/uh2;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/no;", "buffer", "Lcom/onedelhi/secure/un4;", "a", "close", "", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class uh2 implements Closeable {

    /* renamed from: a */
    public final jq1 f36111a;

    /* renamed from: a */
    public final C6205no f36112a;

    /* renamed from: a */
    public final Inflater f36113a;

    /* renamed from: b */
    public final boolean f36114b;

    public uh2(boolean z) {
        this.f36114b = z;
        C6205no noVar = new C6205no();
        this.f36112a = noVar;
        Inflater inflater = new Inflater(true);
        this.f36113a = inflater;
        this.f36111a = new jq1((x04) noVar, inflater);
    }

    /* renamed from: a */
    public final void mo45596a(@vr2 C6205no noVar) throws IOException {
        jt1.m53777p(noVar, "buffer");
        if (this.f36112a.mo41244V0() == 0) {
            if (this.f36114b) {
                this.f36113a.reset();
            }
            this.f36112a.mo41235N(noVar);
            this.f36112a.mo41293w0(65535);
            long bytesRead = this.f36113a.getBytesRead() + this.f36112a.mo41244V0();
            do {
                this.f36111a.mo38807a(noVar, Long.MAX_VALUE);
            } while (this.f36113a.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void close() throws IOException {
        this.f36111a.close();
    }
}
