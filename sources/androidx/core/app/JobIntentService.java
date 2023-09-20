package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.onedelhi.secure.jg3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: a */
    public static final Object f3238a = new Object();

    /* renamed from: a */
    public static final HashMap<ComponentName, C0474h> f3239a = new HashMap<>();

    /* renamed from: b */
    public static final String f3240b = "JobIntentService";

    /* renamed from: e */
    public static final boolean f3241e = false;

    /* renamed from: a */
    public C0466a f3242a;

    /* renamed from: a */
    public C0467b f3243a;

    /* renamed from: a */
    public C0474h f3244a;

    /* renamed from: a */
    public final ArrayList<C0469d> f3245a;

    /* renamed from: b */
    public boolean f3246b = false;

    /* renamed from: c */
    public boolean f3247c = false;

    /* renamed from: d */
    public boolean f3248d = false;

    /* renamed from: androidx.core.app.JobIntentService$a */
    public final class C0466a extends AsyncTask<Void, Void, Void> {
        public C0466a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0470e a = JobIntentService.this.mo3713a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.mo3717h(a.getIntent());
                a.mo3737a();
            }
        }

        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.mo3719j();
        }

        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo3719j();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    public interface C0467b {
        /* renamed from: a */
        C0470e mo3731a();

        /* renamed from: b */
        IBinder mo3732b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    public static final class C0468c extends C0474h {

        /* renamed from: a */
        public final Context f3250a;

        /* renamed from: a */
        public final PowerManager.WakeLock f3251a;

        /* renamed from: b */
        public final PowerManager.WakeLock f3252b;

        /* renamed from: b */
        public boolean f3253b;

        /* renamed from: c */
        public boolean f3254c;

        public C0468c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3250a = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3251a = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3252b = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: a */
        public void mo3733a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3268a);
            if (this.f3250a.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3253b) {
                        this.f3253b = true;
                        if (!this.f3254c) {
                            this.f3251a.acquire(jg3.f30769e);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo3734c() {
            synchronized (this) {
                if (this.f3254c) {
                    if (this.f3253b) {
                        this.f3251a.acquire(jg3.f30769e);
                    }
                    this.f3254c = false;
                    this.f3252b.release();
                }
            }
        }

        /* renamed from: d */
        public void mo3735d() {
            synchronized (this) {
                if (!this.f3254c) {
                    this.f3254c = true;
                    this.f3252b.acquire(600000);
                    this.f3251a.release();
                }
            }
        }

        /* renamed from: e */
        public void mo3736e() {
            synchronized (this) {
                this.f3253b = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    public final class C0469d implements C0470e {

        /* renamed from: a */
        public final int f3255a;

        /* renamed from: a */
        public final Intent f3256a;

        public C0469d(Intent intent, int i) {
            this.f3256a = intent;
            this.f3255a = i;
        }

        /* renamed from: a */
        public void mo3737a() {
            JobIntentService.this.stopSelf(this.f3255a);
        }

        public Intent getIntent() {
            return this.f3256a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    public interface C0470e {
        /* renamed from: a */
        void mo3737a();

        Intent getIntent();
    }

    @sj3(26)
    /* renamed from: androidx.core.app.JobIntentService$f */
    public static final class C0471f extends JobServiceEngine implements C0467b {

        /* renamed from: a */
        public static final String f3258a = "JobServiceEngineImpl";

        /* renamed from: a */
        public static final boolean f3259a = false;

        /* renamed from: a */
        public JobParameters f3260a;

        /* renamed from: a */
        public final JobIntentService f3261a;

        /* renamed from: a */
        public final Object f3262a = new Object();

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        public final class C0472a implements C0470e {

            /* renamed from: a */
            public final JobWorkItem f3263a;

            public C0472a(JobWorkItem jobWorkItem) {
                this.f3263a = jobWorkItem;
            }

            /* renamed from: a */
            public void mo3737a() {
                synchronized (C0471f.this.f3262a) {
                    JobParameters jobParameters = C0471f.this.f3260a;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3263a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f3263a.getIntent();
            }
        }

        public C0471f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3261a = jobIntentService;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f3261a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.C0471f.C0472a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.C0470e mo3731a() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f3262a
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f3260a     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f3261a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.C0471f.mo3731a():androidx.core.app.JobIntentService$e");
        }

        /* renamed from: b */
        public IBinder mo3732b() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f3260a = jobParameters;
            this.f3261a.mo3715e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f3261a.mo3714b();
            synchronized (this.f3262a) {
                this.f3260a = null;
            }
            return b;
        }
    }

    @sj3(26)
    /* renamed from: androidx.core.app.JobIntentService$g */
    public static final class C0473g extends C0474h {

        /* renamed from: a */
        public final JobInfo f3265a;

        /* renamed from: a */
        public final JobScheduler f3266a;

        public C0473g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo3741b(i);
            this.f3265a = new JobInfo.Builder(i, this.f3268a).setOverrideDeadline(0).build();
            this.f3266a = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* renamed from: a */
        public void mo3733a(Intent intent) {
            this.f3266a.enqueue(this.f3265a, new JobWorkItem(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    public static abstract class C0474h {

        /* renamed from: a */
        public int f3267a;

        /* renamed from: a */
        public final ComponentName f3268a;

        /* renamed from: a */
        public boolean f3269a;

        public C0474h(ComponentName componentName) {
            this.f3268a = componentName;
        }

        /* renamed from: a */
        public abstract void mo3733a(Intent intent);

        /* renamed from: b */
        public void mo3741b(int i) {
            if (!this.f3269a) {
                this.f3269a = true;
                this.f3267a = i;
            } else if (this.f3267a != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f3267a);
            }
        }

        /* renamed from: c */
        public void mo3734c() {
        }

        /* renamed from: d */
        public void mo3735d() {
        }

        /* renamed from: e */
        public void mo3736e() {
        }
    }

    public JobIntentService() {
        this.f3245a = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    /* renamed from: c */
    public static void m3565c(@mr2 Context context, @mr2 ComponentName componentName, int i, @mr2 Intent intent) {
        if (intent != null) {
            synchronized (f3238a) {
                C0474h f = m3567f(context, componentName, true, i);
                f.mo3741b(i);
                f.mo3733a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: d */
    public static void m3566d(@mr2 Context context, @mr2 Class<?> cls, int i, @mr2 Intent intent) {
        m3565c(context, new ComponentName(context, cls), i, intent);
    }

    /* renamed from: f */
    public static C0474h m3567f(Context context, ComponentName componentName, boolean z, int i) {
        C0474h hVar;
        HashMap<ComponentName, C0474h> hashMap = f3239a;
        C0474h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C0468c(context, componentName);
        } else if (z) {
            hVar = new C0473g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0474h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* renamed from: a */
    public C0470e mo3713a() {
        C0467b bVar = this.f3243a;
        if (bVar != null) {
            return bVar.mo3731a();
        }
        synchronized (this.f3245a) {
            if (this.f3245a.size() <= 0) {
                return null;
            }
            C0470e remove = this.f3245a.remove(0);
            return remove;
        }
    }

    /* renamed from: b */
    public boolean mo3714b() {
        C0466a aVar = this.f3242a;
        if (aVar != null) {
            aVar.cancel(this.f3246b);
        }
        this.f3247c = true;
        return mo3718i();
    }

    /* renamed from: e */
    public void mo3715e(boolean z) {
        if (this.f3242a == null) {
            this.f3242a = new C0466a();
            C0474h hVar = this.f3244a;
            if (hVar != null && z) {
                hVar.mo3735d();
            }
            this.f3242a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: g */
    public boolean mo3716g() {
        return this.f3247c;
    }

    /* renamed from: h */
    public abstract void mo3717h(@mr2 Intent intent);

    /* renamed from: i */
    public boolean mo3718i() {
        return true;
    }

    /* renamed from: j */
    public void mo3719j() {
        ArrayList<C0469d> arrayList = this.f3245a;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3242a = null;
                ArrayList<C0469d> arrayList2 = this.f3245a;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo3715e(false);
                } else if (!this.f3248d) {
                    this.f3244a.mo3734c();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo3720k(boolean z) {
        this.f3246b = z;
    }

    public IBinder onBind(@mr2 Intent intent) {
        C0467b bVar = this.f3243a;
        if (bVar != null) {
            return bVar.mo3732b();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3243a = new C0471f(this);
            this.f3244a = null;
            return;
        }
        this.f3243a = null;
        this.f3244a = m3567f(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0469d> arrayList = this.f3245a;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3248d = true;
                this.f3244a.mo3734c();
            }
        }
    }

    public int onStartCommand(@ts2 Intent intent, int i, int i2) {
        if (this.f3245a == null) {
            return 2;
        }
        this.f3244a.mo3736e();
        synchronized (this.f3245a) {
            ArrayList<C0469d> arrayList = this.f3245a;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0469d(intent, i2));
            mo3715e(true);
        }
        return 3;
    }
}
