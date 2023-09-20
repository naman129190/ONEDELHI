package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.concurrent.Executor;

@hl3({hl3.C2354a.f13187b})
public enum fl0 implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
