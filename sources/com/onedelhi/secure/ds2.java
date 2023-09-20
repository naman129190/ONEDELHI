package com.onedelhi.secure;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ds2 {

    /* renamed from: a */
    public CharSequence f10892a;

    /* renamed from: a */
    public final String f10893a;

    /* renamed from: a */
    public List<cs2> f10894a;

    /* renamed from: a */
    public boolean f10895a;

    /* renamed from: b */
    public String f10896b;

    /* renamed from: com.onedelhi.secure.ds2$a */
    public static class C1991a {

        /* renamed from: a */
        public final ds2 f10897a;

        public C1991a(@mr2 String str) {
            this.f10897a = new ds2(str);
        }

        @mr2
        /* renamed from: a */
        public ds2 mo14826a() {
            return this.f10897a;
        }

        @mr2
        /* renamed from: b */
        public C1991a mo14827b(@ts2 String str) {
            this.f10897a.f10896b = str;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1991a mo14828c(@ts2 CharSequence charSequence) {
            this.f10897a.f10892a = charSequence;
            return this;
        }
    }

    @sj3(28)
    public ds2(@mr2 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @sj3(26)
    public ds2(@mr2 NotificationChannelGroup notificationChannelGroup, @mr2 List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        List<cs2> list2;
        this.f10892a = notificationChannelGroup.getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f10896b = notificationChannelGroup.getDescription();
        }
        if (i >= 28) {
            this.f10895a = notificationChannelGroup.isBlocked();
            list2 = mo14819b(notificationChannelGroup.getChannels());
        } else {
            list2 = mo14819b(list);
        }
        this.f10894a = list2;
    }

    public ds2(@mr2 String str) {
        this.f10894a = Collections.emptyList();
        this.f10893a = (String) k43.m19455l(str);
    }

    @mr2
    /* renamed from: a */
    public List<cs2> mo14818a() {
        return this.f10894a;
    }

    @sj3(26)
    /* renamed from: b */
    public final List<cs2> mo14819b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel next : list) {
            if (this.f10893a.equals(next.getGroup())) {
                arrayList.add(new cs2(next));
            }
        }
        return arrayList;
    }

    @ts2
    /* renamed from: c */
    public String mo14820c() {
        return this.f10896b;
    }

    @mr2
    /* renamed from: d */
    public String mo14821d() {
        return this.f10893a;
    }

    @ts2
    /* renamed from: e */
    public CharSequence mo14822e() {
        return this.f10892a;
    }

    /* renamed from: f */
    public NotificationChannelGroup mo14823f() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.f10893a, this.f10892a);
        if (i >= 28) {
            notificationChannelGroup.setDescription(this.f10896b);
        }
        return notificationChannelGroup;
    }

    /* renamed from: g */
    public boolean mo14824g() {
        return this.f10895a;
    }

    @mr2
    /* renamed from: h */
    public C1991a mo14825h() {
        return new C1991a(this.f10893a).mo14828c(this.f10892a).mo14827b(this.f10896b);
    }
}
