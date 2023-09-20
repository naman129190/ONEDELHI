package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.concurrent.atomic.AtomicBoolean;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public abstract class yx3 {
    private final ym3 mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile s74 mStmt;

    public yx3(ym3 ym3) {
        this.mDatabase = ym3;
    }

    /* renamed from: a */
    public final s74 mo27730a() {
        return this.mDatabase.compileStatement(createQuery());
    }

    public s74 acquire() {
        assertNotMainThread();
        return mo27733b(this.mLock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    /* renamed from: b */
    public final s74 mo27733b(boolean z) {
        if (!z) {
            return mo27730a();
        }
        if (this.mStmt == null) {
            this.mStmt = mo27730a();
        }
        return this.mStmt;
    }

    public abstract String createQuery();

    public void release(s74 s74) {
        if (s74 == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
