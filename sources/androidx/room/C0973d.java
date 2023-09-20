package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0959a;
import androidx.room.C0963b;
import androidx.room.C0967c;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vm3;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.d */
public class C0973d {

    /* renamed from: a */
    public int f5284a;

    /* renamed from: a */
    public final Context f5285a;

    /* renamed from: a */
    public final ServiceConnection f5286a;

    /* renamed from: a */
    public final C0959a f5287a = new C0974a();
    @ts2

    /* renamed from: a */
    public C0963b f5288a;

    /* renamed from: a */
    public final C0967c.C0970c f5289a;

    /* renamed from: a */
    public final C0967c f5290a;

    /* renamed from: a */
    public final Runnable f5291a;

    /* renamed from: a */
    public final String f5292a;

    /* renamed from: a */
    public final Executor f5293a;

    /* renamed from: a */
    public final AtomicBoolean f5294a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Runnable f5295b;

    /* renamed from: androidx.room.d$a */
    public class C0974a extends C0959a.C0961b {

        /* renamed from: androidx.room.d$a$a */
        public class C0975a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String[] f5298a;

            public C0975a(String[] strArr) {
                this.f5298a = strArr;
            }

            public void run() {
                C0973d.this.f5290a.mo6621i(this.f5298a);
            }
        }

        public C0974a() {
        }

        /* renamed from: d3 */
        public void mo6604d3(String[] strArr) {
            C0973d.this.f5293a.execute(new C0975a(strArr));
        }
    }

    /* renamed from: androidx.room.d$b */
    public class C0976b implements ServiceConnection {
        public C0976b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0973d.this.f5288a = C0963b.C0965b.m6707j8(iBinder);
            C0973d dVar = C0973d.this;
            dVar.f5293a.execute(dVar.f5291a);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0973d dVar = C0973d.this;
            dVar.f5293a.execute(dVar.f5295b);
            C0973d.this.f5288a = null;
        }
    }

    /* renamed from: androidx.room.d$c */
    public class C0977c implements Runnable {
        public C0977c() {
        }

        public void run() {
            try {
                C0973d dVar = C0973d.this;
                C0963b bVar = dVar.f5288a;
                if (bVar != null) {
                    dVar.f5284a = bVar.mo6603x4(dVar.f5287a, dVar.f5292a);
                    C0973d dVar2 = C0973d.this;
                    dVar2.f5290a.mo6615a(dVar2.f5289a);
                }
            } catch (RemoteException e) {
                Log.w(vm3.f21887a, "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.d$d */
    public class C0978d implements Runnable {
        public C0978d() {
        }

        public void run() {
            C0973d dVar = C0973d.this;
            dVar.f5290a.mo6625m(dVar.f5289a);
        }
    }

    /* renamed from: androidx.room.d$e */
    public class C0979e extends C0967c.C0970c {
        public C0979e(String[] strArr) {
            super(strArr);
        }

        /* renamed from: a */
        public boolean mo6641a() {
            return true;
        }

        /* renamed from: b */
        public void mo6642b(@mr2 Set<String> set) {
            if (!C0973d.this.f5294a.get()) {
                try {
                    C0973d dVar = C0973d.this;
                    C0963b bVar = dVar.f5288a;
                    if (bVar != null) {
                        bVar.mo6602G1(dVar.f5284a, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w(vm3.f21887a, "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    public C0973d(Context context, String str, Intent intent, C0967c cVar, Executor executor) {
        C0976b bVar = new C0976b();
        this.f5286a = bVar;
        this.f5291a = new C0977c();
        this.f5295b = new C0978d();
        Context applicationContext = context.getApplicationContext();
        this.f5285a = applicationContext;
        this.f5292a = str;
        this.f5290a = cVar;
        this.f5293a = executor;
        this.f5289a = new C0979e((String[]) cVar.f5264a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }

    /* renamed from: a */
    public void mo6645a() {
        if (this.f5294a.compareAndSet(false, true)) {
            this.f5290a.mo6625m(this.f5289a);
            try {
                C0963b bVar = this.f5288a;
                if (bVar != null) {
                    bVar.mo6601A7(this.f5287a, this.f5284a);
                }
            } catch (RemoteException e) {
                Log.w(vm3.f21887a, "Cannot unregister multi-instance invalidation callback", e);
            }
            this.f5285a.unbindService(this.f5286a);
        }
    }
}
