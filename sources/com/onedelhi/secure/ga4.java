package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class ga4 implements Iterable<Intent> {

    /* renamed from: b */
    public static final String f12483b = "TaskStackBuilder";

    /* renamed from: a */
    public final Context f12484a;

    /* renamed from: a */
    public final ArrayList<Intent> f12485a = new ArrayList<>();

    @sj3(16)
    /* renamed from: com.onedelhi.secure.ga4$a */
    public static class C2224a {
        @pn0
        /* renamed from: a */
        public static PendingIntent m15648a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* renamed from: com.onedelhi.secure.ga4$b */
    public interface C2225b {
        @ts2
        /* renamed from: I */
        Intent mo838I();
    }

    public ga4(Context context) {
        this.f12484a = context;
    }

    @mr2
    /* renamed from: j */
    public static ga4 m15633j(@mr2 Context context) {
        return new ga4(context);
    }

    @Deprecated
    /* renamed from: l */
    public static ga4 m15634l(Context context) {
        return m15633j(context);
    }

    @mr2
    /* renamed from: b */
    public ga4 mo16435b(@mr2 Intent intent) {
        this.f12485a.add(intent);
        return this;
    }

    @mr2
    /* renamed from: e */
    public ga4 mo16436e(@mr2 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f12484a.getPackageManager());
        }
        if (component != null) {
            mo16438g(component);
        }
        mo16435b(intent);
        return this;
    }

    @mr2
    /* renamed from: f */
    public ga4 mo16437f(@mr2 Activity activity) {
        Intent I = activity instanceof C2225b ? ((C2225b) activity).mo838I() : null;
        if (I == null) {
            I = kn2.m19944a(activity);
        }
        if (I != null) {
            ComponentName component = I.getComponent();
            if (component == null) {
                component = I.resolveActivity(this.f12484a.getPackageManager());
            }
            mo16438g(component);
            mo16435b(I);
        }
        return this;
    }

    @mr2
    /* renamed from: g */
    public ga4 mo16438g(@mr2 ComponentName componentName) {
        int size = this.f12485a.size();
        try {
            Context context = this.f12484a;
            while (true) {
                Intent b = kn2.m19945b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f12485a.add(size, b);
                context = this.f12484a;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f12483b, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @mr2
    /* renamed from: i */
    public ga4 mo16439i(@mr2 Class<?> cls) {
        return mo16438g(new ComponentName(this.f12484a, cls));
    }

    @mr2
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f12485a.iterator();
    }

    @ts2
    /* renamed from: k */
    public Intent mo16441k(int i) {
        return this.f12485a.get(i);
    }

    @Deprecated
    /* renamed from: n */
    public Intent mo16442n(int i) {
        return mo16441k(i);
    }

    /* renamed from: o */
    public int mo16443o() {
        return this.f12485a.size();
    }

    @mr2
    /* renamed from: r */
    public Intent[] mo16444r() {
        int size = this.f12485a.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f12485a.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new Intent(this.f12485a.get(i));
        }
        return intentArr;
    }

    @ts2
    /* renamed from: s */
    public PendingIntent mo16445s(int i, int i2) {
        return mo16446t(i, i2, (Bundle) null);
    }

    @ts2
    /* renamed from: t */
    public PendingIntent mo16446t(int i, int i2, @ts2 Bundle bundle) {
        if (!this.f12485a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f12485a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C2224a.m15648a(this.f12484a, i, intentArr, i2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: u */
    public void mo16447u() {
        mo16448v((Bundle) null);
    }

    /* renamed from: v */
    public void mo16448v(@ts2 Bundle bundle) {
        if (!this.f12485a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f12485a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!r70.m26366s(this.f12484a, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(bi2.f26358i);
                this.f12484a.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
