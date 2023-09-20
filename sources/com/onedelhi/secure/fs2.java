package com.onedelhi.secure;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.qb3;

public class fs2 {

    /* renamed from: com.onedelhi.secure.fs2$a */
    public static class C2196a extends C2197b {
        /* renamed from: E */
        public int mo16150E(int i) {
            return i <= 3 ? qb3.C3285g.notification_template_big_media_narrow_custom : qb3.C3285g.notification_template_big_media_custom;
        }

        /* renamed from: F */
        public int mo16151F() {
            return this.f11615a.mo15428s() != null ? qb3.C3285g.notification_template_media_custom : super.mo16151F();
        }

        /* renamed from: L */
        public final void mo16152L(RemoteViews remoteViews) {
            remoteViews.setInt(qb3.C3283e.status_bar_latest_event_content, "setBackgroundColor", this.f11615a.mo15426r() != 0 ? this.f11615a.mo15426r() : this.f11615a.f11516a.getResources().getColor(qb3.C3280b.notification_material_background_media_default_color));
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: b */
        public void mo15332b(bs2 bs2) {
            if (Build.VERSION.SDK_INT >= 24) {
                bs2.mo13807a().setStyle(mo16153A(new Notification.DecoratedMediaCustomViewStyle()));
            } else {
                super.mo15332b(bs2);
            }
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: v */
        public RemoteViews mo15465v(bs2 bs2) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews p = this.f11615a.mo15422p() != null ? this.f11615a.mo15422p() : this.f11615a.mo15428s();
            if (p == null) {
                return null;
            }
            RemoteViews B = mo16154B();
            mo15499e(B, p);
            mo16152L(B);
            return B;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: w */
        public RemoteViews mo15466w(bs2 bs2) {
            RemoteViews remoteViews = null;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z = true;
            boolean z2 = this.f11615a.mo15428s() != null;
            if (!z2 && this.f11615a.mo15422p() == null) {
                z = false;
            }
            if (z) {
                remoteViews = mo16155C();
                if (z2) {
                    mo15499e(remoteViews, this.f11615a.mo15428s());
                }
                mo16152L(remoteViews);
            }
            return remoteViews;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: x */
        public RemoteViews mo15467x(bs2 bs2) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews w = this.f11615a.mo15435w() != null ? this.f11615a.mo15435w() : this.f11615a.mo15428s();
            if (w == null) {
                return null;
            }
            RemoteViews B = mo16154B();
            mo15499e(B, w);
            mo16152L(B);
            return B;
        }
    }

    /* renamed from: com.onedelhi.secure.fs2$b */
    public static class C2197b extends es2.C2100q {

        /* renamed from: a */
        public static final int f12304a = 3;

        /* renamed from: b */
        public static final int f12305b = 5;

        /* renamed from: a */
        public PendingIntent f12306a;

        /* renamed from: a */
        public MediaSessionCompat.Token f12307a;

        /* renamed from: a */
        public int[] f12308a = null;

        /* renamed from: b */
        public boolean f12309b;

        public C2197b() {
        }

        public C2197b(es2.C2087g gVar) {
            mo15507z(gVar);
        }

        /* renamed from: G */
        public static MediaSessionCompat.Token m15266G(Notification notification) {
            Parcelable parcelable;
            Bundle n = es2.m13984n(notification);
            if (n == null || (parcelable = n.getParcelable(es2.f11355G)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.m499b(parcelable);
        }

        @sj3(21)
        /* renamed from: A */
        public Notification.MediaStyle mo16153A(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f12308a;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f12307a;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.mo357f());
            }
            return mediaStyle;
        }

        /* renamed from: B */
        public RemoteViews mo16154B() {
            int min = Math.min(this.f11615a.f11526a.size(), 5);
            RemoteViews c = mo15497c(false, mo16150E(min), false);
            c.removeAllViews(qb3.C3283e.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    c.addView(qb3.C3283e.media_actions, mo16156D(this.f11615a.f11526a.get(i)));
                }
            }
            if (this.f12309b) {
                int i2 = qb3.C3283e.cancel_action;
                c.setViewVisibility(i2, 0);
                c.setInt(i2, "setAlpha", this.f11615a.f11516a.getResources().getInteger(qb3.C3284f.cancel_button_image_alpha));
                c.setOnClickPendingIntent(i2, this.f12306a);
            } else {
                c.setViewVisibility(qb3.C3283e.cancel_action, 8);
            }
            return c;
        }

        /* renamed from: C */
        public RemoteViews mo16155C() {
            RemoteViews c = mo15497c(false, mo16151F(), true);
            int size = this.f11615a.f11526a.size();
            int[] iArr = this.f12308a;
            int min = iArr == null ? 0 : Math.min(iArr.length, 3);
            c.removeAllViews(qb3.C3283e.media_actions);
            if (min > 0) {
                int i = 0;
                while (i < min) {
                    if (i < size) {
                        c.addView(qb3.C3283e.media_actions, mo16156D(this.f11615a.f11526a.get(this.f12308a[i])));
                        i++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.f12309b) {
                c.setViewVisibility(qb3.C3283e.end_padder, 8);
                int i2 = qb3.C3283e.cancel_action;
                c.setViewVisibility(i2, 0);
                c.setOnClickPendingIntent(i2, this.f12306a);
                c.setInt(i2, "setAlpha", this.f11615a.f11516a.getResources().getInteger(qb3.C3284f.cancel_button_image_alpha));
            } else {
                c.setViewVisibility(qb3.C3283e.end_padder, 0);
                c.setViewVisibility(qb3.C3283e.cancel_action, 8);
            }
            return c;
        }

        /* renamed from: D */
        public final RemoteViews mo16156D(es2.C2072b bVar) {
            boolean z = bVar.mo15287a() == null;
            RemoteViews remoteViews = new RemoteViews(this.f11615a.f11516a.getPackageName(), qb3.C3285g.notification_media_action);
            int i = qb3.C3283e.action0;
            remoteViews.setImageViewResource(i, bVar.mo15291e());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i, bVar.mo15287a());
            }
            remoteViews.setContentDescription(i, bVar.mo15296j());
            return remoteViews;
        }

        /* renamed from: E */
        public int mo16150E(int i) {
            return i <= 3 ? qb3.C3285g.notification_template_big_media_narrow : qb3.C3285g.notification_template_big_media;
        }

        /* renamed from: F */
        public int mo16151F() {
            return qb3.C3285g.notification_template_media;
        }

        /* renamed from: H */
        public C2197b mo16157H(PendingIntent pendingIntent) {
            this.f12306a = pendingIntent;
            return this;
        }

        /* renamed from: I */
        public C2197b mo16158I(MediaSessionCompat.Token token) {
            this.f12307a = token;
            return this;
        }

        /* renamed from: J */
        public C2197b mo16159J(int... iArr) {
            this.f12308a = iArr;
            return this;
        }

        /* renamed from: K */
        public C2197b mo16160K(boolean z) {
            return this;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: b */
        public void mo15332b(bs2 bs2) {
            bs2.mo13807a().setStyle(mo16153A(new Notification.MediaStyle()));
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: v */
        public RemoteViews mo15465v(bs2 bs2) {
            return null;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: w */
        public RemoteViews mo15466w(bs2 bs2) {
            return null;
        }
    }
}
