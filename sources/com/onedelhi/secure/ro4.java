package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import com.onedelhi.secure.fo1;
import com.onedelhi.secure.go1;

public class ro4 implements ServiceConnection {

    /* renamed from: a */
    public final Context f19953a;
    @mr2

    /* renamed from: a */
    public bk3<Integer> f19954a;
    @hw4
    @ts2

    /* renamed from: a */
    public go1 f19955a = null;

    /* renamed from: b */
    public boolean f19956b = false;

    /* renamed from: com.onedelhi.secure.ro4$a */
    public class C3429a extends fo1.C2186b {
        public C3429a() {
        }

        /* renamed from: e1 */
        public void mo16121e1(boolean z, boolean z2) throws RemoteException {
            if (z) {
                ro4.this.f19954a.mo13747B(Integer.valueOf(z2 ? 3 : 2));
                return;
            }
            ro4.this.f19954a.mo13747B(0);
            Log.e(wx2.f22358a, "Unable to retrieve the permission revocation setting from the backport");
        }
    }

    public ro4(@mr2 Context context) {
        this.f19953a = context;
    }

    /* renamed from: a */
    public void mo23972a(@mr2 bk3<Integer> bk3) {
        if (!this.f19956b) {
            this.f19956b = true;
            this.f19954a = bk3;
            this.f19953a.bindService(new Intent(UnusedAppRestrictionsBackportService.f3295b).setPackage(wx2.m31169b(this.f19953a.getPackageManager())), this, 1);
            return;
        }
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    /* renamed from: b */
    public void mo23973b() {
        if (this.f19956b) {
            this.f19956b = false;
            this.f19953a.unbindService(this);
            return;
        }
        throw new IllegalStateException("bindService must be called before unbind");
    }

    /* renamed from: c */
    public final fo1 mo23974c() {
        return new C3429a();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        go1 j8 = go1.C2258b.m15946j8(iBinder);
        this.f19955a = j8;
        try {
            j8.mo3772G3(mo23974c());
        } catch (RemoteException unused) {
            this.f19954a.mo13747B(0);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f19955a = null;
    }
}
