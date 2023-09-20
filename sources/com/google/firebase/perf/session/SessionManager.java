package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.onedelhi.secure.C5665i9;
import com.onedelhi.secure.C5765j9;
import com.onedelhi.secure.C6256o9;
import com.onedelhi.secure.g13;
import com.onedelhi.secure.uu3;
import com.onedelhi.secure.vu3;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
public class SessionManager extends C5765j9 {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C5665i9 appStateMonitor;
    private final Set<WeakReference<uu3>> clients;
    private final GaugeManager gaugeManager;
    private g13 perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), g13.m48999c(), C5665i9.m51864c());
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager2, g13 g13, C5665i9 i9Var) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager2;
        this.perfSession = g13;
        this.appStateMonitor = i9Var;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, g13 g13) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (g13.mo36519f()) {
            this.gaugeManager.logGaugeMetadata(g13.mo36521j(), C6256o9.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(C6256o9 o9Var) {
        if (this.perfSession.mo36519f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.mo36521j(), o9Var);
        }
    }

    private void startOrStopCollectingGauges(C6256o9 o9Var) {
        if (this.perfSession.mo36519f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, o9Var);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        C6256o9 o9Var = C6256o9.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(o9Var);
        startOrStopCollectingGauges(o9Var);
    }

    public void onUpdateAppState(C6256o9 o9Var) {
        super.onUpdateAppState(o9Var);
        if (!this.appStateMonitor.mo37877j()) {
            if (o9Var == C6256o9.FOREGROUND) {
                updatePerfSession(o9Var);
            } else if (!updatePerfSessionIfExpired()) {
                startOrStopCollectingGauges(o9Var);
            }
        }
    }

    public final g13 perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<uu3> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new vu3(this, context, this.perfSession));
    }

    @VisibleForTesting
    public void setPerfSession(g13 g13) {
        this.perfSession = g13;
    }

    public void unregisterForSessionUpdates(WeakReference<uu3> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(C6256o9 o9Var) {
        synchronized (this.clients) {
            this.perfSession = g13.m48999c();
            Iterator<WeakReference<uu3>> it = this.clients.iterator();
            while (it.hasNext()) {
                uu3 uu3 = (uu3) it.next().get();
                if (uu3 != null) {
                    uu3.mo29944a(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(o9Var);
        startOrStopCollectingGauges(o9Var);
    }

    public boolean updatePerfSessionIfExpired() {
        if (!this.perfSession.mo36518e()) {
            return false;
        }
        updatePerfSession(this.appStateMonitor.mo37871b());
        return true;
    }
}
