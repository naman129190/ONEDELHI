package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.onedelhi.secure.js2;
import com.onedelhi.secure.sn1;

public abstract class NotificationCompatSideChannelService extends Service {

    /* renamed from: androidx.core.app.NotificationCompatSideChannelService$a */
    public class C0475a extends sn1.C3530b {
        public C0475a() {
        }

        /* renamed from: R6 */
        public void mo3747R6(String str, int i, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3744c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3745d(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: q5 */
        public void mo3748q5(String str) {
            NotificationCompatSideChannelService.this.mo3744c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3743b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: z7 */
        public void mo3749z7(String str, int i, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3744c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3742a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo3742a(String str, int i, String str2);

    /* renamed from: b */
    public abstract void mo3743b(String str);

    /* renamed from: c */
    public void mo3744c(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    /* renamed from: d */
    public abstract void mo3745d(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        intent.getAction().equals(js2.f14464e);
        return null;
    }
}
