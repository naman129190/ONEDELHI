package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.onedelhi.secure.fo1;
import com.onedelhi.secure.go1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qo4;
import com.onedelhi.secure.ts2;

public abstract class UnusedAppRestrictionsBackportService extends Service {
    @SuppressLint({"ActionValue"})

    /* renamed from: b */
    public static final String f3295b = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* renamed from: a */
    public go1.C2258b f3296a = new C0481a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class C0481a extends go1.C2258b {
        public C0481a() {
        }

        /* renamed from: G3 */
        public void mo3772G3(@ts2 fo1 fo1) throws RemoteException {
            if (fo1 != null) {
                UnusedAppRestrictionsBackportService.this.mo3770a(new qo4(fo1));
            }
        }
    }

    /* renamed from: a */
    public abstract void mo3770a(@mr2 qo4 qo4);

    @ts2
    public IBinder onBind(@ts2 Intent intent) {
        return this.f3296a;
    }
}
