package com.onedelhi.secure;

import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C5665i9;
import java.lang.ref.WeakReference;

/* renamed from: com.onedelhi.secure.j9 */
public abstract class C5765j9 implements C5665i9.C5667b {
    private final WeakReference<C5665i9.C5667b> appStateCallback;
    private final C5665i9 appStateMonitor;
    private C6256o9 currentAppState;
    private boolean isRegisteredForAppState;

    public C5765j9() {
        this(C5665i9.m51864c());
    }

    public C5765j9(@mr2 C5665i9 i9Var) {
        this.isRegisteredForAppState = false;
        this.currentAppState = C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = i9Var;
        this.appStateCallback = new WeakReference<>(this);
    }

    public C6256o9 getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<C5665i9.C5667b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.mo37876i(i);
    }

    public void onUpdateAppState(C6256o9 o9Var) {
        C6256o9 o9Var2 = this.currentAppState;
        C6256o9 o9Var3 = C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (o9Var2 != o9Var3) {
            if (o9Var2 != o9Var && o9Var != o9Var3) {
                o9Var = C6256o9.FOREGROUND_BACKGROUND;
            } else {
                return;
            }
        }
        this.currentAppState = o9Var;
    }

    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            this.currentAppState = this.appStateMonitor.mo37871b();
            this.appStateMonitor.mo37889p(this.appStateCallback);
            this.isRegisteredForAppState = true;
        }
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.mo37897x(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }
}
