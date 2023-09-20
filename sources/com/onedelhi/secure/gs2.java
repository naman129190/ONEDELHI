package com.onedelhi.secure;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@hl3({hl3.C2354a.f13188c})
public class gs2 implements bs2 {

    /* renamed from: a */
    public int f12740a;

    /* renamed from: a */
    public final Notification.Builder f12741a;

    /* renamed from: a */
    public final Context f12742a;

    /* renamed from: a */
    public final Bundle f12743a = new Bundle();

    /* renamed from: a */
    public RemoteViews f12744a;

    /* renamed from: a */
    public final es2.C2087g f12745a;

    /* renamed from: a */
    public final List<Bundle> f12746a = new ArrayList();

    /* renamed from: b */
    public RemoteViews f12747b;

    /* renamed from: c */
    public RemoteViews f12748c;

    public gs2(es2.C2087g gVar) {
        int i;
        Icon icon;
        this.f12745a = gVar;
        this.f12742a = gVar.f11516a;
        this.f12741a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(gVar.f11516a, gVar.f11546d) : new Notification.Builder(gVar.f11516a);
        Notification notification = gVar.f11530b;
        this.f12741a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, gVar.f11520a).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gVar.f11524a).setContentText(gVar.f11533b).setContentInfo(gVar.f11539c).setContentIntent(gVar.f11515a).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(gVar.f11531b, (notification.flags & 128) != 0).setLargeIcon(gVar.f11517a).setNumber(gVar.f11512a).setProgress(gVar.f11537c, gVar.f11543d, gVar.f11548d);
        this.f12741a.setSubText(gVar.f11545d).setUsesChronometer(gVar.f11536b).setPriority(gVar.f11529b);
        Iterator<es2.C2072b> it = gVar.f11526a.iterator();
        while (it.hasNext()) {
            mo16901b(it.next());
        }
        Bundle bundle = gVar.f11519a;
        if (bundle != null) {
            this.f12743a.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f12744a = gVar.f11532b;
        this.f12747b = gVar.f11538c;
        this.f12741a.setShowWhen(gVar.f11527a);
        this.f12741a.setLocalOnly(gVar.f11554f).setGroup(gVar.f11525a).setGroupSummary(gVar.f11552e).setSortKey(gVar.f11534b);
        this.f12740a = gVar.f11557h;
        this.f12741a.setCategory(gVar.f11540c).setColor(gVar.f11549e).setVisibility(gVar.f11553f).setPublicVersion(gVar.f11514a).setSound(notification.sound, notification.audioAttributes);
        List<String> e = i2 < 28 ? m16240e(m16241g(gVar.f11535b), gVar.f11547d) : gVar.f11547d;
        if (e != null && !e.isEmpty()) {
            for (String addPerson : e) {
                this.f12741a.addPerson(addPerson);
            }
        }
        this.f12748c = gVar.f11544d;
        if (gVar.f11541c.size() > 0) {
            Bundle bundle2 = gVar.mo15430t().getBundle(es2.C2088h.f11562a);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < gVar.f11541c.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), is2.m17825j(gVar.f11541c.get(i3)));
            }
            bundle2.putBundle(es2.C2088h.f11566e, bundle4);
            bundle3.putBundle(es2.C2088h.f11566e, bundle4);
            gVar.mo15430t().putBundle(es2.C2088h.f11562a, bundle2);
            this.f12743a.putBundle(es2.C2088h.f11562a, bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = gVar.f11518a) != null) {
            this.f12741a.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.f12741a.setExtras(gVar.f11519a).setRemoteInputHistory(gVar.f11528a);
            RemoteViews remoteViews = gVar.f11532b;
            if (remoteViews != null) {
                this.f12741a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = gVar.f11538c;
            if (remoteViews2 != null) {
                this.f12741a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = gVar.f11544d;
            if (remoteViews3 != null) {
                this.f12741a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.f12741a.setBadgeIconType(gVar.f11555g).setSettingsText(gVar.f11550e).setShortcutId(gVar.f11551e).setTimeoutAfter(gVar.f11513a).setGroupAlertBehavior(gVar.f11557h);
            if (gVar.f11558h) {
                this.f12741a.setColorized(gVar.f11556g);
            }
            if (!TextUtils.isEmpty(gVar.f11546d)) {
                this.f12741a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator<s13> it2 = gVar.f11535b.iterator();
            while (it2.hasNext()) {
                this.f12741a.addPerson(it2.next().mo24157k());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f12741a.setAllowSystemGeneratedContextualActions(gVar.f11560i);
            this.f12741a.setBubbleMetadata(es2.C2083f.m14062k(gVar.f11521a));
            t82 t82 = gVar.f11523a;
            if (t82 != null) {
                this.f12741a.setLocusId(t82.mo24775c());
            }
        }
        if (i5 >= 31 && (i = gVar.f11559i) != 0) {
            this.f12741a.setForegroundServiceBehavior(i);
        }
        if (gVar.f11561j) {
            if (this.f12745a.f11552e) {
                this.f12740a = 2;
            } else {
                this.f12740a = 1;
            }
            this.f12741a.setVibrate((long[]) null);
            this.f12741a.setSound((Uri) null);
            int i6 = notification.defaults & -2 & -3;
            notification.defaults = i6;
            this.f12741a.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f12745a.f11525a)) {
                    this.f12741a.setGroup(es2.f11408k0);
                }
                this.f12741a.setGroupAlertBehavior(this.f12740a);
            }
        }
    }

    @ts2
    /* renamed from: e */
    public static List<String> m16240e(@ts2 List<String> list, @ts2 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3679ua uaVar = new C3679ua(list.size() + list2.size());
        uaVar.addAll(list);
        uaVar.addAll(list2);
        return new ArrayList(uaVar);
    }

    @ts2
    /* renamed from: g */
    public static List<String> m16241g(@ts2 List<s13> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (s13 j : list) {
            arrayList.add(j.mo24156j());
        }
        return arrayList;
    }

    /* renamed from: a */
    public Notification.Builder mo13807a() {
        return this.f12741a;
    }

    /* renamed from: b */
    public final void mo16901b(es2.C2072b bVar) {
        Notification.Action.Builder builder;
        int i = Build.VERSION.SDK_INT;
        IconCompat f = bVar.mo15292f();
        if (i >= 23) {
            builder = new Notification.Action.Builder(f != null ? f.mo3784M() : null, bVar.mo15296j(), bVar.mo15287a());
        } else {
            builder = new Notification.Action.Builder(f != null ? f.mo3774B() : 0, bVar.mo15296j(), bVar.mo15287a());
        }
        if (bVar.mo15293g() != null) {
            for (RemoteInput addRemoteInput : ai3.m11185d(bVar.mo15293g())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        Bundle bundle = bVar.mo15290d() != null ? new Bundle(bVar.mo15290d()) : new Bundle();
        bundle.putBoolean(is2.f13820c, bVar.mo15288b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(bVar.mo15288b());
        }
        bundle.putInt(es2.C2072b.f11440b, bVar.mo15294h());
        if (i2 >= 28) {
            builder.setSemanticAction(bVar.mo15294h());
        }
        if (i2 >= 29) {
            builder.setContextual(bVar.mo15298l());
        }
        if (i2 >= 31) {
            builder.setAuthenticationRequired(bVar.mo15297k());
        }
        bundle.putBoolean(es2.C2072b.f11439a, bVar.mo15295i());
        builder.addExtras(bundle);
        this.f12741a.addAction(builder.build());
    }

    /* renamed from: c */
    public Notification mo16902c() {
        Bundle n;
        RemoteViews x;
        RemoteViews v;
        es2.C2100q qVar = this.f12745a.f11522a;
        if (qVar != null) {
            qVar.mo15332b(this);
        }
        RemoteViews w = qVar != null ? qVar.mo15466w(this) : null;
        Notification d = mo16903d();
        if (!(w == null && (w = this.f12745a.f11532b) == null)) {
            d.contentView = w;
        }
        if (!(qVar == null || (v = qVar.mo15465v(this)) == null)) {
            d.bigContentView = v;
        }
        if (!(qVar == null || (x = this.f12745a.f11522a.mo15467x(this)) == null)) {
            d.headsUpContentView = x;
        }
        if (!(qVar == null || (n = es2.m13984n(d)) == null)) {
            qVar.mo15339a(n);
        }
        return d;
    }

    /* renamed from: d */
    public Notification mo16903d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f12741a.build();
        }
        if (i >= 24) {
            Notification build = this.f12741a.build();
            if (this.f12740a != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f12740a != 2)) {
                    mo16905h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f12740a == 1) {
                    mo16905h(build);
                }
            }
            return build;
        }
        this.f12741a.setExtras(this.f12743a);
        Notification build2 = this.f12741a.build();
        RemoteViews remoteViews = this.f12744a;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f12747b;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f12748c;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f12740a != 0) {
            if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f12740a != 2)) {
                mo16905h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f12740a == 1) {
                mo16905h(build2);
            }
        }
        return build2;
    }

    /* renamed from: f */
    public Context mo16904f() {
        return this.f12742a;
    }

    /* renamed from: h */
    public final void mo16905h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }
}
