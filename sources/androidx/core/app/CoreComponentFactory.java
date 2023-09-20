package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;

@sj3(api = 28)
@hl3({hl3.C2354a.f13188c})
public class CoreComponentFactory extends AppComponentFactory {

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    public interface C0465a {
        /* renamed from: a */
        Object mo3712a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((androidx.core.app.CoreComponentFactory.C0465a) r1).mo3712a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m3563a(T r1) {
        /*
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.C0465a
            if (r0 == 0) goto L_0x000e
            r0 = r1
            androidx.core.app.CoreComponentFactory$a r0 = (androidx.core.app.CoreComponentFactory.C0465a) r0
            java.lang.Object r0 = r0.mo3712a()
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.CoreComponentFactory.m3563a(java.lang.Object):java.lang.Object");
    }

    @mr2
    public Activity instantiateActivity(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) m3563a(super.instantiateActivity(classLoader, str, intent));
    }

    @mr2
    public Application instantiateApplication(@mr2 ClassLoader classLoader, @mr2 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) m3563a(super.instantiateApplication(classLoader, str));
    }

    @mr2
    public ContentProvider instantiateProvider(@mr2 ClassLoader classLoader, @mr2 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) m3563a(super.instantiateProvider(classLoader, str));
    }

    @mr2
    public BroadcastReceiver instantiateReceiver(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) m3563a(super.instantiateReceiver(classLoader, str, intent));
    }

    @mr2
    public Service instantiateService(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) m3563a(super.instantiateService(classLoader, str, intent));
    }
}
