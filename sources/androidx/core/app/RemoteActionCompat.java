package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ys4;

public final class RemoteActionCompat implements ys4 {
    @mr2
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: a */
    public PendingIntent f3271a;
    @mr2
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: a */
    public IconCompat f3272a;
    @mr2
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: a */
    public CharSequence f3273a;
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: a */
    public boolean f3274a;
    @mr2
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: b */
    public CharSequence f3275b;
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: b */
    public boolean f3276b;

    @sj3(26)
    /* renamed from: androidx.core.app.RemoteActionCompat$a */
    public static class C0476a {
        @pn0
        /* renamed from: a */
        public static RemoteAction m3613a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @pn0
        /* renamed from: b */
        public static PendingIntent m3614b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @pn0
        /* renamed from: c */
        public static CharSequence m3615c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @pn0
        /* renamed from: d */
        public static Icon m3616d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @pn0
        /* renamed from: e */
        public static CharSequence m3617e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @pn0
        /* renamed from: f */
        public static boolean m3618f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @pn0
        /* renamed from: g */
        public static void m3619g(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }

    @sj3(28)
    /* renamed from: androidx.core.app.RemoteActionCompat$b */
    public static class C0477b {
        @pn0
        /* renamed from: a */
        public static void m3620a(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }

        @pn0
        /* renamed from: b */
        public static boolean m3621b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    @hl3({hl3.C2354a.f13187b})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@mr2 RemoteActionCompat remoteActionCompat) {
        k43.m19455l(remoteActionCompat);
        this.f3272a = remoteActionCompat.f3272a;
        this.f3273a = remoteActionCompat.f3273a;
        this.f3275b = remoteActionCompat.f3275b;
        this.f3271a = remoteActionCompat.f3271a;
        this.f3274a = remoteActionCompat.f3274a;
        this.f3276b = remoteActionCompat.f3276b;
    }

    public RemoteActionCompat(@mr2 IconCompat iconCompat, @mr2 CharSequence charSequence, @mr2 CharSequence charSequence2, @mr2 PendingIntent pendingIntent) {
        this.f3272a = (IconCompat) k43.m19455l(iconCompat);
        this.f3273a = (CharSequence) k43.m19455l(charSequence);
        this.f3275b = (CharSequence) k43.m19455l(charSequence2);
        this.f3271a = (PendingIntent) k43.m19455l(pendingIntent);
        this.f3274a = true;
        this.f3276b = true;
    }

    @mr2
    @sj3(26)
    /* renamed from: i */
    public static RemoteActionCompat m3603i(@mr2 RemoteAction remoteAction) {
        k43.m19455l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.m3643o(C0476a.m3616d(remoteAction)), C0476a.m3617e(remoteAction), C0476a.m3615c(remoteAction), C0476a.m3614b(remoteAction));
        remoteActionCompat.mo3755o(C0476a.m3618f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.mo3756p(C0477b.m3621b(remoteAction));
        }
        return remoteActionCompat;
    }

    @mr2
    /* renamed from: j */
    public PendingIntent mo3750j() {
        return this.f3271a;
    }

    @mr2
    /* renamed from: k */
    public CharSequence mo3751k() {
        return this.f3275b;
    }

    @mr2
    /* renamed from: l */
    public IconCompat mo3752l() {
        return this.f3272a;
    }

    @mr2
    /* renamed from: m */
    public CharSequence mo3753m() {
        return this.f3273a;
    }

    /* renamed from: n */
    public boolean mo3754n() {
        return this.f3274a;
    }

    /* renamed from: o */
    public void mo3755o(boolean z) {
        this.f3274a = z;
    }

    /* renamed from: p */
    public void mo3756p(boolean z) {
        this.f3276b = z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: q */
    public boolean mo3757q() {
        return this.f3276b;
    }

    @mr2
    @sj3(26)
    /* renamed from: r */
    public RemoteAction mo3758r() {
        RemoteAction a = C0476a.m3613a(this.f3272a.mo3784M(), this.f3273a, this.f3275b, this.f3271a);
        C0476a.m3619g(a, mo3754n());
        if (Build.VERSION.SDK_INT >= 28) {
            C0477b.m3620a(a, mo3757q());
        }
        return a;
    }
}
