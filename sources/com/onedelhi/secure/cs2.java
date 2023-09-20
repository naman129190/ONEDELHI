package com.onedelhi.secure;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

public class cs2 {

    /* renamed from: d */
    public static final int f10471d = 0;

    /* renamed from: f */
    public static final String f10472f = "miscellaneous";

    /* renamed from: g */
    public static final boolean f10473g = true;

    /* renamed from: a */
    public int f10474a;

    /* renamed from: a */
    public AudioAttributes f10475a;

    /* renamed from: a */
    public Uri f10476a;

    /* renamed from: a */
    public CharSequence f10477a;
    @mr2

    /* renamed from: a */
    public final String f10478a;

    /* renamed from: a */
    public boolean f10479a;

    /* renamed from: a */
    public long[] f10480a;

    /* renamed from: b */
    public int f10481b;

    /* renamed from: b */
    public String f10482b;

    /* renamed from: b */
    public boolean f10483b;

    /* renamed from: c */
    public int f10484c;

    /* renamed from: c */
    public String f10485c;

    /* renamed from: c */
    public boolean f10486c;

    /* renamed from: d */
    public String f10487d;

    /* renamed from: d */
    public boolean f10488d;

    /* renamed from: e */
    public String f10489e;

    /* renamed from: e */
    public boolean f10490e;

    /* renamed from: f */
    public boolean f10491f;

    /* renamed from: com.onedelhi.secure.cs2$a */
    public static class C1924a {

        /* renamed from: a */
        public final cs2 f10492a;

        public C1924a(@mr2 String str, int i) {
            this.f10492a = new cs2(str, i);
        }

        @mr2
        /* renamed from: a */
        public cs2 mo14368a() {
            return this.f10492a;
        }

        @mr2
        /* renamed from: b */
        public C1924a mo14369b(@mr2 String str, @mr2 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                cs2 cs2 = this.f10492a;
                cs2.f10487d = str;
                cs2.f10489e = str2;
            }
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1924a mo14370c(@ts2 String str) {
            this.f10492a.f10482b = str;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1924a mo14371d(@ts2 String str) {
            this.f10492a.f10485c = str;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1924a mo14372e(int i) {
            this.f10492a.f10474a = i;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1924a mo14373f(int i) {
            this.f10492a.f10481b = i;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1924a mo14374g(boolean z) {
            this.f10492a.f10483b = z;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1924a mo14375h(@ts2 CharSequence charSequence) {
            this.f10492a.f10477a = charSequence;
            return this;
        }

        @mr2
        /* renamed from: i */
        public C1924a mo14376i(boolean z) {
            this.f10492a.f10479a = z;
            return this;
        }

        @mr2
        /* renamed from: j */
        public C1924a mo14377j(@ts2 Uri uri, @ts2 AudioAttributes audioAttributes) {
            cs2 cs2 = this.f10492a;
            cs2.f10476a = uri;
            cs2.f10475a = audioAttributes;
            return this;
        }

        @mr2
        /* renamed from: k */
        public C1924a mo14378k(boolean z) {
            this.f10492a.f10486c = z;
            return this;
        }

        @mr2
        /* renamed from: l */
        public C1924a mo14379l(@ts2 long[] jArr) {
            cs2 cs2 = this.f10492a;
            cs2.f10486c = jArr != null && jArr.length > 0;
            cs2.f10480a = jArr;
            return this;
        }
    }

    @sj3(26)
    public cs2(@mr2 NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.f10477a = notificationChannel.getName();
        this.f10482b = notificationChannel.getDescription();
        this.f10485c = notificationChannel.getGroup();
        this.f10479a = notificationChannel.canShowBadge();
        this.f10476a = notificationChannel.getSound();
        this.f10475a = notificationChannel.getAudioAttributes();
        this.f10483b = notificationChannel.shouldShowLights();
        this.f10481b = notificationChannel.getLightColor();
        this.f10486c = notificationChannel.shouldVibrate();
        this.f10480a = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f10487d = notificationChannel.getParentChannelId();
            this.f10489e = notificationChannel.getConversationId();
        }
        this.f10488d = notificationChannel.canBypassDnd();
        this.f10484c = notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            this.f10490e = notificationChannel.canBubble();
        }
        if (i >= 30) {
            this.f10491f = notificationChannel.isImportantConversation();
        }
    }

    public cs2(@mr2 String str, int i) {
        this.f10479a = true;
        this.f10476a = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f10481b = 0;
        this.f10478a = (String) k43.m19455l(str);
        this.f10474a = i;
        this.f10475a = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* renamed from: a */
    public boolean mo14348a() {
        return this.f10490e;
    }

    /* renamed from: b */
    public boolean mo14349b() {
        return this.f10488d;
    }

    /* renamed from: c */
    public boolean mo14350c() {
        return this.f10479a;
    }

    @ts2
    /* renamed from: d */
    public AudioAttributes mo14351d() {
        return this.f10475a;
    }

    @ts2
    /* renamed from: e */
    public String mo14352e() {
        return this.f10489e;
    }

    @ts2
    /* renamed from: f */
    public String mo14353f() {
        return this.f10482b;
    }

    @ts2
    /* renamed from: g */
    public String mo14354g() {
        return this.f10485c;
    }

    @mr2
    /* renamed from: h */
    public String mo14355h() {
        return this.f10478a;
    }

    /* renamed from: i */
    public int mo14356i() {
        return this.f10474a;
    }

    /* renamed from: j */
    public int mo14357j() {
        return this.f10481b;
    }

    /* renamed from: k */
    public int mo14358k() {
        return this.f10484c;
    }

    @ts2
    /* renamed from: l */
    public CharSequence mo14359l() {
        return this.f10477a;
    }

    /* renamed from: m */
    public NotificationChannel mo14360m() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.f10478a, this.f10477a, this.f10474a);
        notificationChannel.setDescription(this.f10482b);
        notificationChannel.setGroup(this.f10485c);
        notificationChannel.setShowBadge(this.f10479a);
        notificationChannel.setSound(this.f10476a, this.f10475a);
        notificationChannel.enableLights(this.f10483b);
        notificationChannel.setLightColor(this.f10481b);
        notificationChannel.setVibrationPattern(this.f10480a);
        notificationChannel.enableVibration(this.f10486c);
        if (!(i < 30 || (str = this.f10487d) == null || (str2 = this.f10489e) == null)) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    @ts2
    /* renamed from: n */
    public String mo14361n() {
        return this.f10487d;
    }

    @ts2
    /* renamed from: o */
    public Uri mo14362o() {
        return this.f10476a;
    }

    @ts2
    /* renamed from: p */
    public long[] mo14363p() {
        return this.f10480a;
    }

    /* renamed from: q */
    public boolean mo14364q() {
        return this.f10491f;
    }

    /* renamed from: r */
    public boolean mo14365r() {
        return this.f10483b;
    }

    /* renamed from: s */
    public boolean mo14366s() {
        return this.f10486c;
    }

    @mr2
    /* renamed from: t */
    public C1924a mo14367t() {
        return new C1924a(this.f10478a, this.f10474a).mo14375h(this.f10477a).mo14370c(this.f10482b).mo14371d(this.f10485c).mo14376i(this.f10479a).mo14377j(this.f10476a, this.f10475a).mo14374g(this.f10483b).mo14373f(this.f10481b).mo14378k(this.f10486c).mo14379l(this.f10480a).mo14369b(this.f10487d, this.f10489e);
    }
}
