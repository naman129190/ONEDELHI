package com.onedelhi.secure;

import java.util.concurrent.Executor;

public enum h16 implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
