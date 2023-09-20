package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.C4321e;
import com.google.firebase.provider.FirebaseInitProvider;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.y30;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class w31 {

    /* renamed from: a */
    public static final Object f36869a = new Object();
    @mj1("LOCK")

    /* renamed from: a */
    public static final Map<String, w31> f36870a = new C3042oa();

    /* renamed from: b */
    public static final String f36871b = "FirebaseApp";
    @mr2

    /* renamed from: c */
    public static final String f36872c = "[DEFAULT]";

    /* renamed from: a */
    public final Context f36873a;

    /* renamed from: a */
    public final b73<gh0> f36874a;

    /* renamed from: a */
    public final h51 f36875a;

    /* renamed from: a */
    public final u12<md0> f36876a;

    /* renamed from: a */
    public final y30 f36877a;

    /* renamed from: a */
    public final String f36878a;

    /* renamed from: a */
    public final List<C7127a> f36879a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final AtomicBoolean f36880a = new AtomicBoolean(false);

    /* renamed from: b */
    public final List<x31> f36881b = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final AtomicBoolean f36882b = new AtomicBoolean();

    @KeepForSdk
    /* renamed from: com.onedelhi.secure.w31$a */
    public interface C7127a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.onedelhi.secure.w31$b */
    public static class C7128b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static AtomicReference<C7128b> f36883a = new AtomicReference<>();

        /* renamed from: b */
        public static void m68782b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f36883a.get() == null) {
                    C7128b bVar = new C7128b();
                    if (f36883a.compareAndSet((Object) null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        public void onBackgroundStateChanged(boolean z) {
            synchronized (w31.f36869a) {
                Iterator it = new ArrayList(w31.f36870a.values()).iterator();
                while (it.hasNext()) {
                    w31 w31 = (w31) it.next();
                    if (w31.f36880a.get()) {
                        w31.mo46513F(z);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    /* renamed from: com.onedelhi.secure.w31$c */
    public static class C7129c extends BroadcastReceiver {

        /* renamed from: a */
        public static AtomicReference<C7129c> f36884a = new AtomicReference<>();

        /* renamed from: a */
        public final Context f36885a;

        public C7129c(Context context) {
            this.f36885a = context;
        }

        /* renamed from: b */
        public static void m68784b(Context context) {
            if (f36884a.get() == null) {
                C7129c cVar = new C7129c(context);
                if (f36884a.compareAndSet((Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo46534c() {
            this.f36885a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (w31.f36869a) {
                for (w31 d : w31.f36870a.values()) {
                    d.mo46532v();
                }
            }
            mo46534c();
        }
    }

    public w31(Context context, String str, h51 h51) {
        this.f36873a = (Context) Preconditions.checkNotNull(context);
        this.f36878a = Preconditions.checkNotEmpty(str);
        this.f36875a = (h51) Preconditions.checkNotNull(h51);
        y24 b = FirebaseInitProvider.m35133b();
        x61.m69933b(C4321e.f25156a);
        x61.m69933b(m30.f31981a);
        List<b73<ComponentRegistrar>> c = m30.m56859d(context, ComponentDiscoveryService.class).mo40455c();
        x61.m69932a();
        x61.m69933b("Runtime");
        y30.C7301b g = y30.m71168p(en4.INSTANCE).mo47568d(c).mo47567c(new FirebaseCommonRegistrar()).mo47567c(new ExecutorsRegistrar()).mo47566b(a30.m36006D(context, Context.class, new Class[0])).mo47566b(a30.m36006D(this, w31.class, new Class[0])).mo47566b(a30.m36006D(h51, h51.class, new Class[0])).mo47570g(new q30());
        if (yp4.m32589a(context) && FirebaseInitProvider.m35134c()) {
            g.mo47566b(a30.m36006D(b, y24.class, new Class[0]));
        }
        y30 e = g.mo47569e();
        this.f36877a = e;
        x61.m69932a();
        this.f36876a = new u12<>(new v31(this, context));
        this.f36874a = e.mo36549f(gh0.class);
        mo46521g(new u31(this));
        x61.m69932a();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ md0 m68743C(Context context) {
        return new md0(context, mo46530t(), (a83) this.f36877a.mo36546b(a83.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m68744D(boolean z) {
        if (!z) {
            this.f36874a.get().mo36741l();
        }
    }

    /* renamed from: E */
    public static String m68745E(@mr2 String str) {
        return str.trim();
    }

    @hw4
    /* renamed from: j */
    public static void m68752j() {
        synchronized (f36869a) {
            f36870a.clear();
        }
    }

    /* renamed from: m */
    public static List<String> m68753m() {
        ArrayList arrayList = new ArrayList();
        synchronized (f36869a) {
            for (w31 r : f36870a.values()) {
                arrayList.add(r.mo46528r());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @mr2
    /* renamed from: o */
    public static List<w31> m68754o(@mr2 Context context) {
        ArrayList arrayList;
        synchronized (f36869a) {
            arrayList = new ArrayList(f36870a.values());
        }
        return arrayList;
    }

    @mr2
    /* renamed from: p */
    public static w31 m68755p() {
        w31 w31;
        synchronized (f36869a) {
            w31 = f36870a.get(f36872c);
            if (w31 == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return w31;
    }

    @mr2
    /* renamed from: q */
    public static w31 m68756q(@mr2 String str) {
        w31 w31;
        String str2;
        synchronized (f36869a) {
            w31 = f36870a.get(m68745E(str));
            if (w31 != null) {
                w31.f36874a.get().mo36741l();
            } else {
                List<String> m = m68753m();
                if (m.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", m);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return w31;
    }

    @KeepForSdk
    /* renamed from: u */
    public static String m68757u(String str, h51 h51) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + C3516si.f20377b + Base64Utils.encodeUrlSafeNoPadding(h51.mo37192j().getBytes(Charset.defaultCharset()));
    }

    @ts2
    /* renamed from: x */
    public static w31 m68758x(@mr2 Context context) {
        synchronized (f36869a) {
            if (f36870a.containsKey(f36872c)) {
                w31 p = m68755p();
                return p;
            }
            h51 h = h51.m50239h(context);
            if (h == null) {
                Log.w(f36871b, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            w31 y = m68759y(context, h);
            return y;
        }
    }

    @mr2
    /* renamed from: y */
    public static w31 m68759y(@mr2 Context context, @mr2 h51 h51) {
        return m68760z(context, h51, f36872c);
    }

    @mr2
    /* renamed from: z */
    public static w31 m68760z(@mr2 Context context, @mr2 h51 h51, @mr2 String str) {
        w31 w31;
        C7128b.m68782b(context);
        String E = m68745E(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f36869a) {
            Map<String, w31> map = f36870a;
            boolean z = !map.containsKey(E);
            Preconditions.checkState(z, "FirebaseApp name " + E + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            w31 = new w31(context, E, h51);
            map.put(E, w31);
        }
        w31.mo46532v();
        return w31;
    }

    @KeepForSdk
    /* renamed from: A */
    public boolean mo46511A() {
        mo46524i();
        return this.f36876a.get().mo40537b();
    }

    @hw4
    @KeepForSdk
    /* renamed from: B */
    public boolean mo46512B() {
        return f36872c.equals(mo46528r());
    }

    /* renamed from: F */
    public final void mo46513F(boolean z) {
        Log.d(f36871b, "Notifying background state change listeners.");
        for (C7127a onBackgroundStateChanged : this.f36879a) {
            onBackgroundStateChanged.onBackgroundStateChanged(z);
        }
    }

    /* renamed from: G */
    public final void mo46514G() {
        for (x31 a : this.f36881b) {
            a.mo46986a(this.f36878a, this.f36875a);
        }
    }

    @KeepForSdk
    /* renamed from: H */
    public void mo46515H(C7127a aVar) {
        mo46524i();
        this.f36879a.remove(aVar);
    }

    @KeepForSdk
    /* renamed from: I */
    public void mo46516I(@mr2 x31 x31) {
        mo46524i();
        Preconditions.checkNotNull(x31);
        this.f36881b.remove(x31);
    }

    /* renamed from: J */
    public void mo46517J(boolean z) {
        boolean z2;
        mo46524i();
        if (this.f36880a.compareAndSet(!z, z)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && isInBackground) {
                z2 = true;
            } else if (!z && isInBackground) {
                z2 = false;
            } else {
                return;
            }
            mo46513F(z2);
        }
    }

    @KeepForSdk
    /* renamed from: K */
    public void mo46518K(Boolean bool) {
        mo46524i();
        this.f36876a.get().mo40540e(bool);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: L */
    public void mo46519L(boolean z) {
        mo46518K(Boolean.valueOf(z));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w31)) {
            return false;
        }
        return this.f36878a.equals(((w31) obj).mo46528r());
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo46521g(C7127a aVar) {
        mo46524i();
        if (this.f36880a.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f36879a.add(aVar);
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo46522h(@mr2 x31 x31) {
        mo46524i();
        Preconditions.checkNotNull(x31);
        this.f36881b.add(x31);
    }

    public int hashCode() {
        return this.f36878a.hashCode();
    }

    /* renamed from: i */
    public final void mo46524i() {
        Preconditions.checkState(!this.f36882b.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    public void mo46525k() {
        if (this.f36882b.compareAndSet(false, true)) {
            synchronized (f36869a) {
                f36870a.remove(this.f36878a);
            }
            mo46514G();
        }
    }

    @KeepForSdk
    /* renamed from: l */
    public <T> T mo46526l(Class<T> cls) {
        mo46524i();
        return this.f36877a.mo36546b(cls);
    }

    @mr2
    /* renamed from: n */
    public Context mo46527n() {
        mo46524i();
        return this.f36873a;
    }

    @mr2
    /* renamed from: r */
    public String mo46528r() {
        mo46524i();
        return this.f36878a;
    }

    @mr2
    /* renamed from: s */
    public h51 mo46529s() {
        mo46524i();
        return this.f36875a;
    }

    @KeepForSdk
    /* renamed from: t */
    public String mo46530t() {
        return Base64Utils.encodeUrlSafeNoPadding(mo46528r().getBytes(Charset.defaultCharset())) + C3516si.f20377b + Base64Utils.encodeUrlSafeNoPadding(mo46529s().mo37192j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f36878a).add("options", this.f36875a).toString();
    }

    /* renamed from: v */
    public final void mo46532v() {
        if (!yp4.m32589a(this.f36873a)) {
            Log.i(f36871b, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo46528r());
            C7129c.m68784b(this.f36873a);
            return;
        }
        Log.i(f36871b, "Device unlocked: initializing all Firebase APIs for app " + mo46528r());
        this.f36877a.mo47565u(mo46512B());
        this.f36874a.get().mo36741l();
    }

    @hw4
    @hl3({hl3.C2354a.TESTS})
    /* renamed from: w */
    public void mo46533w() {
        this.f36877a.mo47564t();
    }
}
