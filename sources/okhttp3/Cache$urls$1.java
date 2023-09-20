package okhttp3;

import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nm0;
import com.onedelhi.secure.qx1;
import com.onedelhi.secure.vr2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\bR\u00020\t0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"okhttp3/Cache$urls$1", "", "", "", "hasNext", "next", "Lcom/onedelhi/secure/un4;", "remove", "Lcom/onedelhi/secure/nm0$g;", "Lcom/onedelhi/secure/nm0;", "delegate", "Ljava/util/Iterator;", "nextUrl", "Ljava/lang/String;", "canRemove", "Z", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Cache$urls$1 implements Iterator<String>, qx1 {
    private boolean canRemove;
    private final Iterator<nm0.C6202g> delegate;
    private String nextUrl;
    public final /* synthetic */ Cache this$0;

    public Cache$urls$1(Cache cache) {
        this.this$0 = cache;
        this.delegate = cache.getCache$okhttp().mo41161j1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r5 = this;
            java.lang.String r0 = r5.nextUrl
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r5.canRemove = r0
        L_0x0009:
            java.util.Iterator<com.onedelhi.secure.nm0$g> r2 = r5.delegate
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L_0x0038
            java.util.Iterator<com.onedelhi.secure.nm0$g> r2 = r5.delegate     // Catch:{ IOException -> 0x0036 }
            java.lang.Object r2 = r2.next()     // Catch:{ IOException -> 0x0036 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ IOException -> 0x0036 }
            r3 = 0
            r4 = r2
            com.onedelhi.secure.nm0$g r4 = (com.onedelhi.secure.nm0.C6202g) r4     // Catch:{ all -> 0x002f }
            com.onedelhi.secure.x04 r4 = r4.mo41203c(r0)     // Catch:{ all -> 0x002f }
            com.onedelhi.secure.to r4 = com.onedelhi.secure.gu2.m49835d(r4)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = r4.mo31699r2()     // Catch:{ all -> 0x002f }
            r5.nextUrl = r4     // Catch:{ all -> 0x002f }
            com.onedelhi.secure.C5630hz.m51313a(r2, r3)     // Catch:{ IOException -> 0x0036 }
            return r1
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r2, r3)     // Catch:{ IOException -> 0x0036 }
            throw r4     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            goto L_0x0009
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache$urls$1.hasNext():boolean");
    }

    @vr2
    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            jt1.m53774m(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }
}
