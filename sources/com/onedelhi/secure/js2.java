package com.onedelhi.secure;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.google.firebase.messaging.C4321e;
import com.onedelhi.secure.sn1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class js2 {

    /* renamed from: a */
    public static final int f14451a = 19;
    @mj1("sLock")

    /* renamed from: a */
    public static C2544d f14452a = null;

    /* renamed from: a */
    public static final Object f14453a = new Object();

    /* renamed from: a */
    public static final String f14454a = "NotifManCompat";
    @mj1("sEnabledNotificationListenersLock")

    /* renamed from: a */
    public static Set<String> f14455a = new HashSet();

    /* renamed from: b */
    public static final int f14456b = 1000;

    /* renamed from: b */
    public static final Object f14457b = new Object();

    /* renamed from: b */
    public static final String f14458b = "checkOpNoThrow";

    /* renamed from: c */
    public static final int f14459c = 6;

    /* renamed from: c */
    public static final String f14460c = "OP_POST_NOTIFICATION";

    /* renamed from: d */
    public static final int f14461d = -1000;

    /* renamed from: d */
    public static final String f14462d = "android.support.useSideChannel";

    /* renamed from: e */
    public static final int f14463e = 0;

    /* renamed from: e */
    public static final String f14464e = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: f */
    public static final int f14465f = 1;

    /* renamed from: f */
    public static final String f14466f = "enabled_notification_listeners";

    /* renamed from: g */
    public static final int f14467g = 2;
    @mj1("sEnabledNotificationListenersLock")

    /* renamed from: g */
    public static String f14468g = null;

    /* renamed from: h */
    public static final int f14469h = 3;

    /* renamed from: i */
    public static final int f14470i = 4;

    /* renamed from: j */
    public static final int f14471j = 5;

    /* renamed from: a */
    public final NotificationManager f14472a;

    /* renamed from: a */
    public final Context f14473a;

    /* renamed from: com.onedelhi.secure.js2$a */
    public static class C2541a implements C2546e {

        /* renamed from: a */
        public final int f14474a;

        /* renamed from: a */
        public final String f14475a;

        /* renamed from: a */
        public final boolean f14476a;

        /* renamed from: b */
        public final String f14477b;

        public C2541a(String str) {
            this.f14475a = str;
            this.f14474a = 0;
            this.f14477b = null;
            this.f14476a = true;
        }

        public C2541a(String str, int i, String str2) {
            this.f14475a = str;
            this.f14474a = i;
            this.f14477b = str2;
            this.f14476a = false;
        }

        /* renamed from: a */
        public void mo18610a(sn1 sn1) throws RemoteException {
            if (this.f14476a) {
                sn1.mo3748q5(this.f14475a);
            } else {
                sn1.mo3749z7(this.f14475a, this.f14474a, this.f14477b);
            }
        }

        @mr2
        public String toString() {
            return "CancelTask[" + "packageName:" + this.f14475a + ", id:" + this.f14474a + ", tag:" + this.f14477b + ", all:" + this.f14476a + "]";
        }
    }

    /* renamed from: com.onedelhi.secure.js2$b */
    public static class C2542b implements C2546e {

        /* renamed from: a */
        public final int f14478a;

        /* renamed from: a */
        public final Notification f14479a;

        /* renamed from: a */
        public final String f14480a;

        /* renamed from: b */
        public final String f14481b;

        public C2542b(String str, int i, String str2, Notification notification) {
            this.f14480a = str;
            this.f14478a = i;
            this.f14481b = str2;
            this.f14479a = notification;
        }

        /* renamed from: a */
        public void mo18610a(sn1 sn1) throws RemoteException {
            sn1.mo3747R6(this.f14480a, this.f14478a, this.f14481b, this.f14479a);
        }

        @mr2
        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f14480a + ", id:" + this.f14478a + ", tag:" + this.f14481b + "]";
        }
    }

    /* renamed from: com.onedelhi.secure.js2$c */
    public static class C2543c {

        /* renamed from: a */
        public final ComponentName f14482a;

        /* renamed from: a */
        public final IBinder f14483a;

        public C2543c(ComponentName componentName, IBinder iBinder) {
            this.f14482a = componentName;
            this.f14483a = iBinder;
        }
    }

    /* renamed from: com.onedelhi.secure.js2$d */
    public static class C2544d implements Handler.Callback, ServiceConnection {

        /* renamed from: n */
        public static final int f14484n = 0;

        /* renamed from: o */
        public static final int f14485o = 1;

        /* renamed from: p */
        public static final int f14486p = 2;

        /* renamed from: q */
        public static final int f14487q = 3;

        /* renamed from: a */
        public final Context f14488a;

        /* renamed from: a */
        public final Handler f14489a;

        /* renamed from: a */
        public final HandlerThread f14490a;

        /* renamed from: a */
        public final Map<ComponentName, C2545a> f14491a = new HashMap();

        /* renamed from: a */
        public Set<String> f14492a = new HashSet();

        /* renamed from: com.onedelhi.secure.js2$d$a */
        public static class C2545a {

            /* renamed from: a */
            public int f14493a = 0;

            /* renamed from: a */
            public final ComponentName f14494a;

            /* renamed from: a */
            public sn1 f14495a;

            /* renamed from: a */
            public ArrayDeque<C2546e> f14496a = new ArrayDeque<>();

            /* renamed from: a */
            public boolean f14497a = false;

            public C2545a(ComponentName componentName) {
                this.f14494a = componentName;
            }
        }

        public C2544d(Context context) {
            this.f14488a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f14490a = handlerThread;
            handlerThread.start();
            this.f14489a = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean mo18613a(C2545a aVar) {
            if (aVar.f14497a) {
                return true;
            }
            boolean bindService = this.f14488a.bindService(new Intent(js2.f14464e).setComponent(aVar.f14494a), this, 33);
            aVar.f14497a = bindService;
            if (bindService) {
                aVar.f14493a = 0;
            } else {
                Log.w(js2.f14454a, "Unable to bind to listener " + aVar.f14494a);
                this.f14488a.unbindService(this);
            }
            return aVar.f14497a;
        }

        /* renamed from: b */
        public final void mo18614b(C2545a aVar) {
            if (aVar.f14497a) {
                this.f14488a.unbindService(this);
                aVar.f14497a = false;
            }
            aVar.f14495a = null;
        }

        /* renamed from: c */
        public final void mo18615c(C2546e eVar) {
            mo18623j();
            for (C2545a next : this.f14491a.values()) {
                next.f14496a.add(eVar);
                mo18619g(next);
            }
        }

        /* renamed from: d */
        public final void mo18616d(ComponentName componentName) {
            C2545a aVar = this.f14491a.get(componentName);
            if (aVar != null) {
                mo18619g(aVar);
            }
        }

        /* renamed from: e */
        public final void mo18617e(ComponentName componentName, IBinder iBinder) {
            C2545a aVar = this.f14491a.get(componentName);
            if (aVar != null) {
                aVar.f14495a = sn1.C3530b.m27737j8(iBinder);
                aVar.f14493a = 0;
                mo18619g(aVar);
            }
        }

        /* renamed from: f */
        public final void mo18618f(ComponentName componentName) {
            C2545a aVar = this.f14491a.get(componentName);
            if (aVar != null) {
                mo18614b(aVar);
            }
        }

        /* renamed from: g */
        public final void mo18619g(C2545a aVar) {
            if (Log.isLoggable(js2.f14454a, 3)) {
                Log.d(js2.f14454a, "Processing component " + aVar.f14494a + ", " + aVar.f14496a.size() + " queued tasks");
            }
            if (!aVar.f14496a.isEmpty()) {
                if (!mo18613a(aVar) || aVar.f14495a == null) {
                    mo18622i(aVar);
                    return;
                }
                while (true) {
                    C2546e peek = aVar.f14496a.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(js2.f14454a, 3)) {
                            Log.d(js2.f14454a, "Sending task " + peek);
                        }
                        peek.mo18610a(aVar.f14495a);
                        aVar.f14496a.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(js2.f14454a, 3)) {
                            Log.d(js2.f14454a, "Remote service has died: " + aVar.f14494a);
                        }
                    } catch (RemoteException e) {
                        Log.w(js2.f14454a, "RemoteException communicating with " + aVar.f14494a, e);
                    }
                }
                if (!aVar.f14496a.isEmpty()) {
                    mo18622i(aVar);
                }
            }
        }

        /* renamed from: h */
        public void mo18620h(C2546e eVar) {
            this.f14489a.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                mo18615c((C2546e) message.obj);
                return true;
            } else if (i == 1) {
                C2543c cVar = (C2543c) message.obj;
                mo18617e(cVar.f14482a, cVar.f14483a);
                return true;
            } else if (i == 2) {
                mo18618f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                mo18616d((ComponentName) message.obj);
                return true;
            }
        }

        /* renamed from: i */
        public final void mo18622i(C2545a aVar) {
            if (!this.f14489a.hasMessages(3, aVar.f14494a)) {
                int i = aVar.f14493a + 1;
                aVar.f14493a = i;
                if (i > 6) {
                    Log.w(js2.f14454a, "Giving up on delivering " + aVar.f14496a.size() + " tasks to " + aVar.f14494a + " after " + aVar.f14493a + " retries");
                    aVar.f14496a.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(js2.f14454a, 3)) {
                    Log.d(js2.f14454a, "Scheduling retry for " + i2 + " ms");
                }
                this.f14489a.sendMessageDelayed(this.f14489a.obtainMessage(3, aVar.f14494a), (long) i2);
            }
        }

        /* renamed from: j */
        public final void mo18623j() {
            Set<String> q = js2.m18799q(this.f14488a);
            if (!q.equals(this.f14492a)) {
                this.f14492a = q;
                List<ResolveInfo> queryIntentServices = this.f14488a.getPackageManager().queryIntentServices(new Intent().setAction(js2.f14464e), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (q.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w(js2.f14454a, "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f14491a.containsKey(componentName2)) {
                        if (Log.isLoggable(js2.f14454a, 3)) {
                            Log.d(js2.f14454a, "Adding listener record for " + componentName2);
                        }
                        this.f14491a.put(componentName2, new C2545a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C2545a>> it = this.f14491a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable(js2.f14454a, 3)) {
                            Log.d(js2.f14454a, "Removing listener record for " + next2.getKey());
                        }
                        mo18614b((C2545a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(js2.f14454a, 3)) {
                Log.d(js2.f14454a, "Connected to service " + componentName);
            }
            this.f14489a.obtainMessage(1, new C2543c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(js2.f14454a, 3)) {
                Log.d(js2.f14454a, "Disconnected from service " + componentName);
            }
            this.f14489a.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: com.onedelhi.secure.js2$e */
    public interface C2546e {
        /* renamed from: a */
        void mo18610a(sn1 sn1) throws RemoteException;
    }

    public js2(Context context) {
        this.f14473a = context;
        this.f14472a = (NotificationManager) context.getSystemService(C4321e.f25157b);
    }

    /* renamed from: F */
    public static boolean m18797F(Notification notification) {
        Bundle n = es2.m13984n(notification);
        return n != null && n.getBoolean(f14462d);
    }

    @mr2
    /* renamed from: p */
    public static js2 m18798p(@mr2 Context context) {
        return new js2(context);
    }

    @mr2
    /* renamed from: q */
    public static Set<String> m18799q(@mr2 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f14453a) {
            if (string != null) {
                if (!string.equals(f14468g)) {
                    String[] split = string.split(ar4.f25981a, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f14455a = hashSet;
                    f14468g = string;
                }
            }
            set = f14455a;
        }
        return set;
    }

    @mr2
    /* renamed from: A */
    public List<NotificationChannel> mo18581A() {
        return Build.VERSION.SDK_INT >= 26 ? this.f14472a.getNotificationChannels() : Collections.emptyList();
    }

    @mr2
    /* renamed from: B */
    public List<cs2> mo18582B() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> A = mo18581A();
            if (!A.isEmpty()) {
                ArrayList arrayList = new ArrayList(A.size());
                for (NotificationChannel cs2 : A) {
                    arrayList.add(new cs2(cs2));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: C */
    public void mo18583C(int i, @mr2 Notification notification) {
        mo18584D((String) null, i, notification);
    }

    /* renamed from: D */
    public void mo18584D(@ts2 String str, int i, @mr2 Notification notification) {
        if (m18797F(notification)) {
            mo18585E(new C2542b(this.f14473a.getPackageName(), i, str, notification));
            this.f14472a.cancel(str, i);
            return;
        }
        this.f14472a.notify(str, i, notification);
    }

    /* renamed from: E */
    public final void mo18585E(C2546e eVar) {
        synchronized (f14457b) {
            if (f14452a == null) {
                f14452a = new C2544d(this.f14473a.getApplicationContext());
            }
            f14452a.mo18620h(eVar);
        }
    }

    /* renamed from: a */
    public boolean mo18586a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f14472a.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f14473a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f14473a.getApplicationInfo();
        String packageName = this.f14473a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod(f14458b, new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(f14460c).get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void mo18587b(int i) {
        mo18588c((String) null, i);
    }

    /* renamed from: c */
    public void mo18588c(@ts2 String str, int i) {
        this.f14472a.cancel(str, i);
    }

    /* renamed from: d */
    public void mo18589d() {
        this.f14472a.cancelAll();
    }

    /* renamed from: e */
    public void mo18590e(@mr2 NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14472a.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: f */
    public void mo18591f(@mr2 cs2 cs2) {
        mo18590e(cs2.mo14360m());
    }

    /* renamed from: g */
    public void mo18592g(@mr2 NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14472a.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    /* renamed from: h */
    public void mo18593h(@mr2 ds2 ds2) {
        mo18592g(ds2.mo14823f());
    }

    /* renamed from: i */
    public void mo18594i(@mr2 List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14472a.createNotificationChannelGroups(list);
        }
    }

    /* renamed from: j */
    public void mo18595j(@mr2 List<ds2> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (ds2 f : list) {
                arrayList.add(f.mo14823f());
            }
            this.f14472a.createNotificationChannelGroups(arrayList);
        }
    }

    /* renamed from: k */
    public void mo18596k(@mr2 List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14472a.createNotificationChannels(list);
        }
    }

    /* renamed from: l */
    public void mo18597l(@mr2 List<cs2> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (cs2 m : list) {
                arrayList.add(m.mo14360m());
            }
            this.f14472a.createNotificationChannels(arrayList);
        }
    }

    /* renamed from: m */
    public void mo18598m(@mr2 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14472a.deleteNotificationChannel(str);
        }
    }

    /* renamed from: n */
    public void mo18599n(@mr2 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14472a.deleteNotificationChannelGroup(str);
        }
    }

    /* renamed from: o */
    public void mo18600o(@mr2 Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel next : this.f14472a.getNotificationChannels()) {
                if (!collection.contains(next.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(next.getParentChannelId()))) {
                    this.f14472a.deleteNotificationChannel(next.getId());
                }
            }
        }
    }

    /* renamed from: r */
    public int mo18601r() {
        return Build.VERSION.SDK_INT >= 24 ? this.f14472a.getImportance() : f14461d;
    }

    @ts2
    /* renamed from: s */
    public NotificationChannel mo18602s(@mr2 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f14472a.getNotificationChannel(str);
        }
        return null;
    }

    @ts2
    /* renamed from: t */
    public NotificationChannel mo18603t(@mr2 String str, @mr2 String str2) {
        return Build.VERSION.SDK_INT >= 30 ? this.f14472a.getNotificationChannel(str, str2) : mo18602s(str);
    }

    @ts2
    /* renamed from: u */
    public cs2 mo18604u(@mr2 String str) {
        NotificationChannel s;
        if (Build.VERSION.SDK_INT < 26 || (s = mo18602s(str)) == null) {
            return null;
        }
        return new cs2(s);
    }

    @ts2
    /* renamed from: v */
    public cs2 mo18605v(@mr2 String str, @mr2 String str2) {
        NotificationChannel t;
        if (Build.VERSION.SDK_INT < 26 || (t = mo18603t(str, str2)) == null) {
            return null;
        }
        return new cs2(t);
    }

    @ts2
    /* renamed from: w */
    public NotificationChannelGroup mo18606w(@mr2 String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.f14472a.getNotificationChannelGroup(str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup next : mo18608y()) {
                if (next.getId().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    @ts2
    /* renamed from: x */
    public ds2 mo18607x(@mr2 String str) {
        NotificationChannelGroup w;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup w2 = mo18606w(str);
            if (w2 != null) {
                return new ds2(w2);
            }
            return null;
        } else if (i < 26 || (w = mo18606w(str)) == null) {
            return null;
        } else {
            return new ds2(w, mo18581A());
        }
    }

    @mr2
    /* renamed from: y */
    public List<NotificationChannelGroup> mo18608y() {
        return Build.VERSION.SDK_INT >= 26 ? this.f14472a.getNotificationChannelGroups() : Collections.emptyList();
    }

    @mr2
    /* renamed from: z */
    public List<ds2> mo18609z() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> y = mo18608y();
            if (!y.isEmpty()) {
                List<NotificationChannel> emptyList = i >= 28 ? Collections.emptyList() : mo18581A();
                ArrayList arrayList = new ArrayList(y.size());
                for (NotificationChannelGroup next : y) {
                    arrayList.add(Build.VERSION.SDK_INT >= 28 ? new ds2(next) : new ds2(next, emptyList));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }
}
