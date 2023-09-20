package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.C4336a;
import com.onedelhi.secure.C6256o9;
import com.onedelhi.secure.C7012v5;
import com.onedelhi.secure.g13;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.li4;
import com.onedelhi.secure.qd1;
import com.onedelhi.secure.qe4;
import com.onedelhi.secure.rd1;
import com.onedelhi.secure.sd1;
import com.onedelhi.secure.td1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u12;
import com.onedelhi.secure.ud1;
import com.onedelhi.secure.vd1;
import com.onedelhi.secure.wd1;
import com.onedelhi.secure.wg2;
import com.onedelhi.secure.y90;
import com.onedelhi.secure.yd1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final C7012v5 logger = C7012v5.m67717e();
    private C6256o9 applicationProcessState;
    private final C4336a configResolver;
    private final u12<y90> cpuGaugeCollector;
    @ts2
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final u12<ScheduledExecutorService> gaugeManagerExecutor;
    @ts2
    private wd1 gaugeMetadataManager;
    private final u12<wg2> memoryGaugeCollector;
    @ts2
    private String sessionId;
    private final li4 transportManager;

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    public static /* synthetic */ class C4364a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25298a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onedelhi.secure.o9[] r0 = com.onedelhi.secure.C6256o9.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25298a = r0
                com.onedelhi.secure.o9 r1 = com.onedelhi.secure.C6256o9.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25298a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.o9 r1 = com.onedelhi.secure.C6256o9.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.C4364a.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new u12(sd1.f34977a), li4.m55636l(), C4336a.m34908h(), (wd1) null, new u12(qd1.f34062a), new u12(rd1.f34579a));
    }

    @hw4
    public GaugeManager(u12<ScheduledExecutorService> u12, li4 li4, C4336a aVar, wd1 wd1, u12<y90> u122, u12<wg2> u123) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = u12;
        this.transportManager = li4;
        this.configResolver = aVar;
        this.gaugeMetadataManager = wd1;
        this.cpuGaugeCollector = u122;
        this.memoryGaugeCollector = u123;
    }

    private static void collectGaugeMetricOnce(y90 y90, wg2 wg2, qe4 qe4) {
        y90.mo47646c(qe4);
        wg2.mo46720c(qe4);
    }

    private long getCpuGaugeCollectionFrequencyMs(C6256o9 o9Var) {
        int i = C4364a.f25298a[o9Var.ordinal()];
        long B = i != 1 ? i != 2 ? -1 : this.configResolver.mo29850B() : this.configResolver.mo29849A();
        if (y90.m71413f(B)) {
            return -1;
        }
        return B;
    }

    private vd1 getGaugeMetadata() {
        return (vd1) vd1.m67879Ak().mo46118Oj(this.gaugeMetadataManager.mo46673a()).mo46119Pj(this.gaugeMetadataManager.mo46674b()).mo46120Qj(this.gaugeMetadataManager.mo46675c()).mo43381ab();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(C6256o9 o9Var) {
        int i = C4364a.f25298a[o9Var.ordinal()];
        long E = i != 1 ? i != 2 ? -1 : this.configResolver.mo29853E() : this.configResolver.mo29852D();
        if (wg2.m69339e(E)) {
            return -1;
        }
        return E;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ y90 lambda$new$0() {
        return new y90();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wg2 lambda$new$1() {
        return new wg2();
    }

    private boolean startCollectingCpuMetrics(long j, qe4 qe4) {
        if (j == -1) {
            logger.mo46000a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().mo47651k(j, qe4);
        return true;
    }

    private long startCollectingGauges(C6256o9 o9Var, qe4 qe4) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(o9Var);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, qe4)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(o9Var);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, qe4) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }

    private boolean startCollectingMemoryMetrics(long j, qe4 qe4) {
        if (j == -1) {
            logger.mo46000a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().mo46724j(j, qe4);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, C6256o9 o9Var) {
        yd1.C7329b Qk = yd1.m71573Qk();
        while (!this.cpuGaugeCollector.get().f37847a.isEmpty()) {
            Qk.mo47761Pj(this.cpuGaugeCollector.get().f37847a.poll());
        }
        while (!this.memoryGaugeCollector.get().f36990a.isEmpty()) {
            Qk.mo47757Lj(this.memoryGaugeCollector.get().f36990a.poll());
        }
        Qk.mo47775dk(str);
        this.transportManager.mo39868E((yd1) Qk.mo43381ab(), o9Var);
    }

    public void collectGaugeMetricOnce(qe4 qe4) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), qe4);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new wd1(context);
    }

    public boolean logGaugeMetadata(String str, C6256o9 o9Var) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.mo39868E((yd1) yd1.m71573Qk().mo47775dk(str).mo47774ck(getGaugeMetadata()).mo43381ab(), o9Var);
        return true;
    }

    public void startCollectingGauges(g13 g13, C6256o9 o9Var) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(o9Var, g13.mo36516d());
        if (startCollectingGauges == -1) {
            logger.mo46010l("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String j = g13.mo36521j();
        this.sessionId = j;
        this.applicationProcessState = o9Var;
        try {
            long j2 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new td1(this, j, o9Var), j2, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C7012v5 v5Var = logger;
            v5Var.mo46010l("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            C6256o9 o9Var = this.applicationProcessState;
            this.cpuGaugeCollector.get().mo47652l();
            this.memoryGaugeCollector.get().mo46725k();
            ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.gaugeManagerExecutor.get().schedule(new ud1(this, str, o9Var), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }
}
