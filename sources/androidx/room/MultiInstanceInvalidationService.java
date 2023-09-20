package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0963b;
import com.onedelhi.secure.ky0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vm3;
import java.util.HashMap;

@ky0
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    public final RemoteCallbackList<C0959a> f5232a = new C0957a();

    /* renamed from: a */
    public final C0963b.C0965b f5233a = new C0958b();

    /* renamed from: a */
    public final HashMap<Integer, String> f5234a = new HashMap<>();

    /* renamed from: n */
    public int f5235n = 0;

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class C0957a extends RemoteCallbackList<C0959a> {
        public C0957a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C0959a aVar, Object obj) {
            MultiInstanceInvalidationService.this.f5234a.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class C0958b extends C0963b.C0965b {
        public C0958b() {
        }

        /* renamed from: A7 */
        public void mo6601A7(C0959a aVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f5232a) {
                MultiInstanceInvalidationService.this.f5232a.unregister(aVar);
                MultiInstanceInvalidationService.this.f5234a.remove(Integer.valueOf(i));
            }
        }

        /* renamed from: G1 */
        public void mo6602G1(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f5232a) {
                String str = MultiInstanceInvalidationService.this.f5234a.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w(vm3.f21887a, "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f5232a.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f5232a.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f5234a.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f5232a.getBroadcastItem(i2).mo6604d3(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w(vm3.f21887a, "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f5232a.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f5232a.finishBroadcast();
            }
        }

        /* renamed from: x4 */
        public int mo6603x4(C0959a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f5232a) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f5235n + 1;
                multiInstanceInvalidationService.f5235n = i;
                if (multiInstanceInvalidationService.f5232a.register(aVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f5234a.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f5235n--;
                return 0;
            }
        }
    }

    @ts2
    public IBinder onBind(@mr2 Intent intent) {
        return this.f5233a;
    }
}
