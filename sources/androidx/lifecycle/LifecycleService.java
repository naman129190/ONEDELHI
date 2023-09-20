package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class LifecycleService extends Service implements a32 {

    /* renamed from: a */
    public final C0707l f4030a = new C0707l(this);

    @mr2
    public C0690e getLifecycle() {
        return this.f4030a.mo5020a();
    }

    @C3740us
    @ts2
    public IBinder onBind(@mr2 Intent intent) {
        this.f4030a.mo5021b();
        return null;
    }

    @C3740us
    public void onCreate() {
        this.f4030a.mo5022c();
        super.onCreate();
    }

    @C3740us
    public void onDestroy() {
        this.f4030a.mo5023d();
        super.onDestroy();
    }

    @C3740us
    public void onStart(@ts2 Intent intent, int i) {
        this.f4030a.mo5024e();
        super.onStart(intent, i);
    }

    @C3740us
    public int onStartCommand(@ts2 Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
