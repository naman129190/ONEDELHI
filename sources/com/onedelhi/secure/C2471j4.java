package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* renamed from: com.onedelhi.secure.j4 */
public final class C2471j4 {

    @sj3(19)
    /* renamed from: com.onedelhi.secure.j4$a */
    public static class C2472a {
        @pn0
        /* renamed from: a */
        public static void m18152a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.j4$b */
    public static class C2473b {
        @pn0
        /* renamed from: a */
        public static AlarmManager.AlarmClockInfo m18153a(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        @pn0
        /* renamed from: b */
        public static void m18154b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.j4$c */
    public static class C2474c {
        @pn0
        /* renamed from: a */
        public static void m18155a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        @pn0
        /* renamed from: b */
        public static void m18156b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static void m18148a(@mr2 AlarmManager alarmManager, long j, @mr2 PendingIntent pendingIntent, @mr2 PendingIntent pendingIntent2) {
        C2473b.m18154b(alarmManager, C2473b.m18153a(j, pendingIntent), pendingIntent2);
    }

    /* renamed from: b */
    public static void m18149b(@mr2 AlarmManager alarmManager, int i, long j, @mr2 PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            C2474c.m18155a(alarmManager, i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    /* renamed from: c */
    public static void m18150c(@mr2 AlarmManager alarmManager, int i, long j, @mr2 PendingIntent pendingIntent) {
        C2472a.m18152a(alarmManager, i, j, pendingIntent);
    }

    /* renamed from: d */
    public static void m18151d(@mr2 AlarmManager alarmManager, int i, long j, @mr2 PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            C2474c.m18156b(alarmManager, i, j, pendingIntent);
        } else {
            m18150c(alarmManager, i, j, pendingIntent);
        }
    }
}
