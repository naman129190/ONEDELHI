package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nd3;
import com.onedelhi.secure.s13;
import com.onedelhi.secure.yg1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class es2 {

    /* renamed from: A */
    public static final int f11342A = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: A */
    public static final String f11343A = "android.textLines";

    /* renamed from: B */
    public static final int f11344B = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: B */
    public static final String f11345B = "android.template";

    /* renamed from: C */
    public static final int f11346C = 0;

    /* renamed from: C */
    public static final String f11347C = "androidx.core.app.extra.COMPAT_TEMPLATE";

    /* renamed from: D */
    public static final int f11348D = 1;
    @SuppressLint({"ActionValue"})
    @Deprecated

    /* renamed from: D */
    public static final String f11349D = "android.people";

    /* renamed from: E */
    public static final int f11350E = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: E */
    public static final String f11351E = "android.people.list";

    /* renamed from: F */
    public static final int f11352F = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: F */
    public static final String f11353F = "android.backgroundImageUri";

    /* renamed from: G */
    public static final int f11354G = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: G */
    public static final String f11355G = "android.mediaSession";

    /* renamed from: H */
    public static final int f11356H = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: H */
    public static final String f11357H = "android.compactActions";
    @SuppressLint({"ActionValue"})

    /* renamed from: I */
    public static final String f11358I = "android.selfDisplayName";
    @SuppressLint({"ActionValue"})

    /* renamed from: J */
    public static final String f11359J = "android.messagingStyleUser";
    @SuppressLint({"ActionValue"})

    /* renamed from: K */
    public static final String f11360K = "android.conversationTitle";
    @SuppressLint({"ActionValue"})

    /* renamed from: L */
    public static final String f11361L = "android.messages";
    @SuppressLint({"ActionValue"})

    /* renamed from: M */
    public static final String f11362M = "android.messages.historic";
    @SuppressLint({"ActionValue"})

    /* renamed from: N */
    public static final String f11363N = "android.isGroupConversation";
    @SuppressLint({"ActionValue"})

    /* renamed from: O */
    public static final String f11364O = "android.hiddenConversationTitle";
    @SuppressLint({"ActionValue"})

    /* renamed from: P */
    public static final String f11365P = "android.audioContents";

    /* renamed from: Q */
    public static final String f11366Q = "call";

    /* renamed from: R */
    public static final String f11367R = "navigation";

    /* renamed from: S */
    public static final String f11368S = "msg";

    /* renamed from: T */
    public static final String f11369T = "email";

    /* renamed from: U */
    public static final String f11370U = "event";

    /* renamed from: V */
    public static final String f11371V = "promo";

    /* renamed from: W */
    public static final String f11372W = "alarm";

    /* renamed from: X */
    public static final String f11373X = "progress";

    /* renamed from: Y */
    public static final String f11374Y = "social";

    /* renamed from: Z */
    public static final String f11375Z = "err";

    /* renamed from: a */
    public static final int f11376a = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: a */
    public static final String f11377a = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* renamed from: a0 */
    public static final String f11378a0 = "transport";

    /* renamed from: b */
    public static final int f11379b = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: b */
    public static final String f11380b = "android.intent.extra.CHANNEL_ID";

    /* renamed from: b0 */
    public static final String f11381b0 = "sys";

    /* renamed from: c */
    public static final int f11382c = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: c */
    public static final String f11383c = "android.intent.extra.CHANNEL_GROUP_ID";

    /* renamed from: c0 */
    public static final String f11384c0 = "service";

    /* renamed from: d */
    public static final int f11385d = 4;
    @SuppressLint({"ActionValue"})

    /* renamed from: d */
    public static final String f11386d = "android.intent.extra.NOTIFICATION_TAG";

    /* renamed from: d0 */
    public static final String f11387d0 = "reminder";

    /* renamed from: e */
    public static final int f11388e = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: e */
    public static final String f11389e = "android.intent.extra.NOTIFICATION_ID";

    /* renamed from: e0 */
    public static final String f11390e0 = "recommendation";

    /* renamed from: f */
    public static final int f11391f = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: f */
    public static final String f11392f = "android.title";

    /* renamed from: f0 */
    public static final String f11393f0 = "status";

    /* renamed from: g */
    public static final int f11394g = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: g */
    public static final String f11395g = "android.title.big";

    /* renamed from: g0 */
    public static final String f11396g0 = "workout";

    /* renamed from: h */
    public static final int f11397h = 4;
    @SuppressLint({"ActionValue"})

    /* renamed from: h */
    public static final String f11398h = "android.text";

    /* renamed from: h0 */
    public static final String f11399h0 = "location_sharing";

    /* renamed from: i */
    public static final int f11400i = 8;
    @SuppressLint({"ActionValue"})

    /* renamed from: i */
    public static final String f11401i = "android.subText";

    /* renamed from: i0 */
    public static final String f11402i0 = "stopwatch";

    /* renamed from: j */
    public static final int f11403j = 16;
    @SuppressLint({"ActionValue"})

    /* renamed from: j */
    public static final String f11404j = "android.remoteInputHistory";

    /* renamed from: j0 */
    public static final String f11405j0 = "missed_call";

    /* renamed from: k */
    public static final int f11406k = 32;
    @SuppressLint({"ActionValue"})

    /* renamed from: k */
    public static final String f11407k = "android.infoText";

    /* renamed from: k0 */
    public static final String f11408k0 = "silent";

    /* renamed from: l */
    public static final int f11409l = 64;
    @SuppressLint({"ActionValue"})

    /* renamed from: l */
    public static final String f11410l = "android.summaryText";
    @Deprecated

    /* renamed from: m */
    public static final int f11411m = 128;
    @SuppressLint({"ActionValue"})

    /* renamed from: m */
    public static final String f11412m = "android.bigText";

    /* renamed from: n */
    public static final int f11413n = 256;
    @SuppressLint({"ActionValue"})

    /* renamed from: n */
    public static final String f11414n = "android.icon";

    /* renamed from: o */
    public static final int f11415o = 512;
    @SuppressLint({"ActionValue"})

    /* renamed from: o */
    public static final String f11416o = "android.largeIcon";

    /* renamed from: p */
    public static final int f11417p = 4096;
    @SuppressLint({"ActionValue"})

    /* renamed from: p */
    public static final String f11418p = "android.largeIcon.big";

    /* renamed from: q */
    public static final int f11419q = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: q */
    public static final String f11420q = "android.progress";

    /* renamed from: r */
    public static final int f11421r = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: r */
    public static final String f11422r = "android.progressMax";

    /* renamed from: s */
    public static final int f11423s = -2;
    @SuppressLint({"ActionValue"})

    /* renamed from: s */
    public static final String f11424s = "android.progressIndeterminate";

    /* renamed from: t */
    public static final int f11425t = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: t */
    public static final String f11426t = "android.showChronometer";

    /* renamed from: u */
    public static final int f11427u = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: u */
    public static final String f11428u = "android.chronometerCountDown";
    @d10

    /* renamed from: v */
    public static final int f11429v = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: v */
    public static final String f11430v = "android.colorized";

    /* renamed from: w */
    public static final int f11431w = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: w */
    public static final String f11432w = "android.showWhen";

    /* renamed from: x */
    public static final int f11433x = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: x */
    public static final String f11434x = "android.picture";

    /* renamed from: y */
    public static final int f11435y = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: y */
    public static final String f11436y = "android.pictureContentDescription";

    /* renamed from: z */
    public static final int f11437z = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: z */
    public static final String f11438z = "android.showBigPictureWhenCollapsed";

    /* renamed from: com.onedelhi.secure.es2$b */
    public static class C2072b {

        /* renamed from: a */
        public static final String f11439a = "android.support.action.showsUserInterface";

        /* renamed from: b */
        public static final String f11440b = "android.support.action.semanticAction";

        /* renamed from: c */
        public static final int f11441c = 0;

        /* renamed from: d */
        public static final int f11442d = 1;

        /* renamed from: e */
        public static final int f11443e = 2;

        /* renamed from: f */
        public static final int f11444f = 3;

        /* renamed from: g */
        public static final int f11445g = 4;

        /* renamed from: h */
        public static final int f11446h = 5;

        /* renamed from: i */
        public static final int f11447i = 6;

        /* renamed from: j */
        public static final int f11448j = 7;

        /* renamed from: k */
        public static final int f11449k = 8;

        /* renamed from: l */
        public static final int f11450l = 9;

        /* renamed from: m */
        public static final int f11451m = 10;

        /* renamed from: a */
        public final int f11452a;

        /* renamed from: a */
        public PendingIntent f11453a;

        /* renamed from: a */
        public final Bundle f11454a;
        @ts2

        /* renamed from: a */
        public IconCompat f11455a;

        /* renamed from: a */
        public CharSequence f11456a;

        /* renamed from: a */
        public boolean f11457a;

        /* renamed from: a */
        public final ai3[] f11458a;
        @Deprecated

        /* renamed from: b */
        public int f11459b;

        /* renamed from: b */
        public boolean f11460b;

        /* renamed from: b */
        public final ai3[] f11461b;

        /* renamed from: c */
        public final boolean f11462c;

        /* renamed from: d */
        public boolean f11463d;

        /* renamed from: com.onedelhi.secure.es2$b$a */
        public static final class C2073a {

            /* renamed from: a */
            public int f11464a;

            /* renamed from: a */
            public final PendingIntent f11465a;

            /* renamed from: a */
            public final Bundle f11466a;

            /* renamed from: a */
            public final IconCompat f11467a;

            /* renamed from: a */
            public final CharSequence f11468a;

            /* renamed from: a */
            public ArrayList<ai3> f11469a;

            /* renamed from: a */
            public boolean f11470a;

            /* renamed from: b */
            public boolean f11471b;

            /* renamed from: c */
            public boolean f11472c;

            /* renamed from: d */
            public boolean f11473d;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C2073a(int i, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m3654z((Resources) null, "", i) : null, charSequence, pendingIntent, new Bundle(), (ai3[]) null, true, 0, true, false, false);
            }

            public C2073a(@ts2 IconCompat iconCompat, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (ai3[]) null, true, 0, true, false, false);
            }

            public C2073a(@ts2 IconCompat iconCompat, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent, @mr2 Bundle bundle, @ts2 ai3[] ai3Arr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f11470a = true;
                this.f11471b = true;
                this.f11467a = iconCompat;
                this.f11468a = C2087g.m14085A(charSequence);
                this.f11465a = pendingIntent;
                this.f11466a = bundle;
                this.f11469a = ai3Arr == null ? null : new ArrayList<>(Arrays.asList(ai3Arr));
                this.f11470a = z;
                this.f11464a = i;
                this.f11471b = z2;
                this.f11472c = z3;
                this.f11473d = z4;
            }

            public C2073a(@mr2 C2072b bVar) {
                this(bVar.mo15292f(), bVar.f11456a, bVar.f11453a, new Bundle(bVar.f11454a), bVar.mo15293g(), bVar.mo15288b(), bVar.mo15294h(), bVar.f11460b, bVar.mo15298l(), bVar.mo15297k());
            }

            @mr2
            @sj3(19)
            @hl3({hl3.C2354a.f13188c})
            /* renamed from: f */
            public static C2073a m14009f(@mr2 Notification.Action action) {
                C2073a aVar = (Build.VERSION.SDK_INT < 23 || action.getIcon() == null) ? new C2073a(action.icon, action.title, action.actionIntent) : new C2073a(IconCompat.m3643o(action.getIcon()), action.title, action.actionIntent);
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput e : remoteInputs) {
                        aVar.mo15300b(ai3.m11186e(e));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    aVar.f11470a = action.getAllowGeneratedReplies();
                }
                if (i >= 28) {
                    aVar.mo15308k(action.getSemanticAction());
                }
                if (i >= 29) {
                    aVar.mo15307j(action.isContextual());
                }
                if (i >= 31) {
                    aVar.mo15306i(action.isAuthenticationRequired());
                }
                return aVar;
            }

            @mr2
            /* renamed from: a */
            public C2073a mo15299a(@ts2 Bundle bundle) {
                if (bundle != null) {
                    this.f11466a.putAll(bundle);
                }
                return this;
            }

            @mr2
            /* renamed from: b */
            public C2073a mo15300b(@ts2 ai3 ai3) {
                if (this.f11469a == null) {
                    this.f11469a = new ArrayList<>();
                }
                if (ai3 != null) {
                    this.f11469a.add(ai3);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            @com.onedelhi.secure.mr2
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.onedelhi.secure.es2.C2072b mo15301c() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.mo15302d()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<com.onedelhi.secure.ai3> r3 = r0.f11469a
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    com.onedelhi.secure.ai3 r4 = (com.onedelhi.secure.ai3) r4
                    boolean r5 = r4.mo13100r()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    com.onedelhi.secure.ai3[] r3 = new com.onedelhi.secure.ai3[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    com.onedelhi.secure.ai3[] r1 = (com.onedelhi.secure.ai3[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004e
                    goto L_0x005b
                L_0x004e:
                    int r1 = r2.size()
                    com.onedelhi.secure.ai3[] r1 = new com.onedelhi.secure.ai3[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    com.onedelhi.secure.ai3[] r4 = (com.onedelhi.secure.ai3[]) r4
                L_0x005b:
                    r10 = r4
                    com.onedelhi.secure.es2$b r1 = new com.onedelhi.secure.es2$b
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f11467a
                    java.lang.CharSequence r7 = r0.f11468a
                    android.app.PendingIntent r8 = r0.f11465a
                    android.os.Bundle r9 = r0.f11466a
                    boolean r12 = r0.f11470a
                    int r13 = r0.f11464a
                    boolean r14 = r0.f11471b
                    boolean r15 = r0.f11472c
                    boolean r2 = r0.f11473d
                    r5 = r1
                    r16 = r2
                    r5.<init>((androidx.core.graphics.drawable.IconCompat) r6, (java.lang.CharSequence) r7, (android.app.PendingIntent) r8, (android.os.Bundle) r9, (com.onedelhi.secure.ai3[]) r10, (com.onedelhi.secure.ai3[]) r11, (boolean) r12, (int) r13, (boolean) r14, (boolean) r15, (boolean) r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.es2.C2072b.C2073a.mo15301c():com.onedelhi.secure.es2$b");
            }

            /* renamed from: d */
            public final void mo15302d() {
                if (this.f11472c) {
                    Objects.requireNonNull(this.f11465a, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            @mr2
            /* renamed from: e */
            public C2073a mo15303e(@mr2 C2074b bVar) {
                bVar.mo15310a(this);
                return this;
            }

            @mr2
            /* renamed from: g */
            public Bundle mo15304g() {
                return this.f11466a;
            }

            @mr2
            /* renamed from: h */
            public C2073a mo15305h(boolean z) {
                this.f11470a = z;
                return this;
            }

            @mr2
            /* renamed from: i */
            public C2073a mo15306i(boolean z) {
                this.f11473d = z;
                return this;
            }

            @mr2
            /* renamed from: j */
            public C2073a mo15307j(boolean z) {
                this.f11472c = z;
                return this;
            }

            @mr2
            /* renamed from: k */
            public C2073a mo15308k(int i) {
                this.f11464a = i;
                return this;
            }

            @mr2
            /* renamed from: l */
            public C2073a mo15309l(boolean z) {
                this.f11471b = z;
                return this;
            }
        }

        /* renamed from: com.onedelhi.secure.es2$b$b */
        public interface C2074b {
            @mr2
            /* renamed from: a */
            C2073a mo15310a(@mr2 C2073a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.onedelhi.secure.es2$b$c */
        public @interface C2075c {
        }

        /* renamed from: com.onedelhi.secure.es2$b$d */
        public static final class C2076d implements C2074b {

            /* renamed from: a */
            public static final String f11474a = "android.wearable.EXTENSIONS";

            /* renamed from: b */
            public static final int f11475b = 1;

            /* renamed from: b */
            public static final String f11476b = "flags";

            /* renamed from: c */
            public static final int f11477c = 2;

            /* renamed from: c */
            public static final String f11478c = "inProgressLabel";

            /* renamed from: d */
            public static final int f11479d = 4;

            /* renamed from: d */
            public static final String f11480d = "confirmLabel";

            /* renamed from: e */
            public static final int f11481e = 1;

            /* renamed from: e */
            public static final String f11482e = "cancelLabel";

            /* renamed from: a */
            public int f11483a = 1;

            /* renamed from: a */
            public CharSequence f11484a;

            /* renamed from: b */
            public CharSequence f11485b;

            /* renamed from: c */
            public CharSequence f11486c;

            public C2076d() {
            }

            public C2076d(@mr2 C2072b bVar) {
                Bundle bundle = bVar.mo15290d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f11483a = bundle.getInt("flags", 1);
                    this.f11484a = bundle.getCharSequence(f11478c);
                    this.f11485b = bundle.getCharSequence(f11480d);
                    this.f11486c = bundle.getCharSequence(f11482e);
                }
            }

            @mr2
            /* renamed from: a */
            public C2073a mo15310a(@mr2 C2073a aVar) {
                Bundle bundle = new Bundle();
                int i = this.f11483a;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f11484a;
                if (charSequence != null) {
                    bundle.putCharSequence(f11478c, charSequence);
                }
                CharSequence charSequence2 = this.f11485b;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f11480d, charSequence2);
                }
                CharSequence charSequence3 = this.f11486c;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f11482e, charSequence3);
                }
                aVar.mo15304g().putBundle("android.wearable.EXTENSIONS", bundle);
                return aVar;
            }

            @mr2
            /* renamed from: b */
            public C2076d clone() {
                C2076d dVar = new C2076d();
                dVar.f11483a = this.f11483a;
                dVar.f11484a = this.f11484a;
                dVar.f11485b = this.f11485b;
                dVar.f11486c = this.f11486c;
                return dVar;
            }

            @ts2
            @Deprecated
            /* renamed from: c */
            public CharSequence mo15312c() {
                return this.f11486c;
            }

            @ts2
            @Deprecated
            /* renamed from: d */
            public CharSequence mo15314d() {
                return this.f11485b;
            }

            /* renamed from: e */
            public boolean mo15315e() {
                return (this.f11483a & 4) != 0;
            }

            /* renamed from: f */
            public boolean mo15316f() {
                return (this.f11483a & 2) != 0;
            }

            @ts2
            @Deprecated
            /* renamed from: g */
            public CharSequence mo15317g() {
                return this.f11484a;
            }

            /* renamed from: h */
            public boolean mo15318h() {
                return (this.f11483a & 1) != 0;
            }

            @mr2
            /* renamed from: i */
            public C2076d mo15319i(boolean z) {
                mo15322l(1, z);
                return this;
            }

            @mr2
            @Deprecated
            /* renamed from: j */
            public C2076d mo15320j(@ts2 CharSequence charSequence) {
                this.f11486c = charSequence;
                return this;
            }

            @mr2
            @Deprecated
            /* renamed from: k */
            public C2076d mo15321k(@ts2 CharSequence charSequence) {
                this.f11485b = charSequence;
                return this;
            }

            /* renamed from: l */
            public final void mo15322l(int i, boolean z) {
                int i2;
                if (z) {
                    i2 = i | this.f11483a;
                } else {
                    i2 = (~i) & this.f11483a;
                }
                this.f11483a = i2;
            }

            @mr2
            /* renamed from: m */
            public C2076d mo15323m(boolean z) {
                mo15322l(4, z);
                return this;
            }

            @mr2
            /* renamed from: n */
            public C2076d mo15324n(boolean z) {
                mo15322l(2, z);
                return this;
            }

            @mr2
            @Deprecated
            /* renamed from: o */
            public C2076d mo15325o(@ts2 CharSequence charSequence) {
                this.f11484a = charSequence;
                return this;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C2072b(int i, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m3654z((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C2072b(int i, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent, @ts2 Bundle bundle, @ts2 ai3[] ai3Arr, @ts2 ai3[] ai3Arr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.m3654z((Resources) null, "", i) : null, charSequence, pendingIntent, bundle, ai3Arr, ai3Arr2, z, i2, z2, z3, z4);
        }

        public C2072b(@ts2 IconCompat iconCompat, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (ai3[]) null, (ai3[]) null, true, 0, true, false, false);
        }

        public C2072b(@ts2 IconCompat iconCompat, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent, @ts2 Bundle bundle, @ts2 ai3[] ai3Arr, @ts2 ai3[] ai3Arr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f11460b = true;
            this.f11455a = iconCompat;
            if (iconCompat != null && iconCompat.mo3776E() == 2) {
                this.f11459b = iconCompat.mo3774B();
            }
            this.f11456a = C2087g.m14085A(charSequence);
            this.f11453a = pendingIntent;
            this.f11454a = bundle == null ? new Bundle() : bundle;
            this.f11458a = ai3Arr;
            this.f11461b = ai3Arr2;
            this.f11457a = z;
            this.f11452a = i;
            this.f11460b = z2;
            this.f11462c = z3;
            this.f11463d = z4;
        }

        @ts2
        /* renamed from: a */
        public PendingIntent mo15287a() {
            return this.f11453a;
        }

        /* renamed from: b */
        public boolean mo15288b() {
            return this.f11457a;
        }

        @ts2
        /* renamed from: c */
        public ai3[] mo15289c() {
            return this.f11461b;
        }

        @mr2
        /* renamed from: d */
        public Bundle mo15290d() {
            return this.f11454a;
        }

        @Deprecated
        /* renamed from: e */
        public int mo15291e() {
            return this.f11459b;
        }

        @ts2
        /* renamed from: f */
        public IconCompat mo15292f() {
            int i;
            if (this.f11455a == null && (i = this.f11459b) != 0) {
                this.f11455a = IconCompat.m3654z((Resources) null, "", i);
            }
            return this.f11455a;
        }

        @ts2
        /* renamed from: g */
        public ai3[] mo15293g() {
            return this.f11458a;
        }

        /* renamed from: h */
        public int mo15294h() {
            return this.f11452a;
        }

        /* renamed from: i */
        public boolean mo15295i() {
            return this.f11460b;
        }

        @ts2
        /* renamed from: j */
        public CharSequence mo15296j() {
            return this.f11456a;
        }

        /* renamed from: k */
        public boolean mo15297k() {
            return this.f11463d;
        }

        /* renamed from: l */
        public boolean mo15298l() {
            return this.f11462c;
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.es2$c */
    public @interface C2077c {
    }

    /* renamed from: com.onedelhi.secure.es2$d */
    public static class C2078d extends C2100q {

        /* renamed from: a */
        public static final String f11487a = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: a */
        public Bitmap f11488a;

        /* renamed from: a */
        public IconCompat f11489a;

        /* renamed from: b */
        public boolean f11490b;

        /* renamed from: c */
        public CharSequence f11491c;

        /* renamed from: c */
        public boolean f11492c;

        @sj3(16)
        /* renamed from: com.onedelhi.secure.es2$d$a */
        public static class C2079a {
            private C2079a() {
            }

            @sj3(16)
            /* renamed from: a */
            public static void m14048a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @sj3(16)
            /* renamed from: b */
            public static void m14049b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @sj3(23)
        /* renamed from: com.onedelhi.secure.es2$d$b */
        public static class C2080b {
            private C2080b() {
            }

            @sj3(23)
            /* renamed from: a */
            public static void m14050a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @sj3(31)
        /* renamed from: com.onedelhi.secure.es2$d$c */
        public static class C2081c {
            private C2081c() {
            }

            @sj3(31)
            /* renamed from: a */
            public static void m14051a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @sj3(31)
            /* renamed from: b */
            public static void m14052b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public C2078d() {
        }

        public C2078d(@ts2 C2087g gVar) {
            mo15507z(gVar);
        }

        @ts2
        /* renamed from: A */
        public static IconCompat m14037A(@ts2 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                return IconCompat.m3643o((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m3649u((Bitmap) parcelable);
            }
            return null;
        }

        @mr2
        /* renamed from: B */
        public C2078d mo15326B(@ts2 Bitmap bitmap) {
            this.f11489a = bitmap == null ? null : IconCompat.m3649u(bitmap);
            this.f11490b = true;
            return this;
        }

        @mr2
        /* renamed from: C */
        public C2078d mo15327C(@ts2 Bitmap bitmap) {
            this.f11488a = bitmap;
            return this;
        }

        @mr2
        /* renamed from: D */
        public C2078d mo15328D(@ts2 CharSequence charSequence) {
            this.f11616a = C2087g.m14085A(charSequence);
            return this;
        }

        @mr2
        @sj3(31)
        /* renamed from: E */
        public C2078d mo15329E(@ts2 CharSequence charSequence) {
            this.f11491c = charSequence;
            return this;
        }

        @mr2
        /* renamed from: F */
        public C2078d mo15330F(@ts2 CharSequence charSequence) {
            this.f11618b = C2087g.m14085A(charSequence);
            this.f11617a = true;
            return this;
        }

        @mr2
        @sj3(31)
        /* renamed from: G */
        public C2078d mo15331G(boolean z) {
            this.f11492c = z;
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: b */
        public void mo15332b(bs2 bs2) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(bs2.mo13807a()).setBigContentTitle(this.f11616a).bigPicture(this.f11488a);
            if (this.f11490b) {
                IconCompat iconCompat = this.f11489a;
                Context context = null;
                if (iconCompat != null) {
                    if (i >= 23) {
                        if (bs2 instanceof gs2) {
                            context = ((gs2) bs2).mo16904f();
                        }
                        C2080b.m14050a(bigPicture, this.f11489a.mo3785N(context));
                    } else if (iconCompat.mo3776E() == 1) {
                        C2079a.m14048a(bigPicture, this.f11489a.mo3773A());
                    }
                }
                C2079a.m14048a(bigPicture, (Bitmap) null);
            }
            if (this.f11617a) {
                C2079a.m14049b(bigPicture, this.f11618b);
            }
            if (i >= 31) {
                C2081c.m14052b(bigPicture, this.f11492c);
                C2081c.m14051a(bigPicture, this.f11491c);
            }
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: g */
        public void mo15333g(@mr2 Bundle bundle) {
            super.mo15333g(bundle);
            bundle.remove(es2.f11418p);
            bundle.remove(es2.f11434x);
            bundle.remove(es2.f11438z);
        }

        @mr2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: t */
        public String mo15334t() {
            return f11487a;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: y */
        public void mo15335y(@mr2 Bundle bundle) {
            super.mo15335y(bundle);
            if (bundle.containsKey(es2.f11418p)) {
                this.f11489a = m14037A(bundle.getParcelable(es2.f11418p));
                this.f11490b = true;
            }
            this.f11488a = (Bitmap) bundle.getParcelable(es2.f11434x);
            this.f11492c = bundle.getBoolean(es2.f11438z);
        }
    }

    /* renamed from: com.onedelhi.secure.es2$e */
    public static class C2082e extends C2100q {

        /* renamed from: a */
        public static final String f11493a = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: c */
        public CharSequence f11494c;

        public C2082e() {
        }

        public C2082e(@ts2 C2087g gVar) {
            mo15507z(gVar);
        }

        @mr2
        /* renamed from: A */
        public C2082e mo15336A(@ts2 CharSequence charSequence) {
            this.f11494c = C2087g.m14085A(charSequence);
            return this;
        }

        @mr2
        /* renamed from: B */
        public C2082e mo15337B(@ts2 CharSequence charSequence) {
            this.f11616a = C2087g.m14085A(charSequence);
            return this;
        }

        @mr2
        /* renamed from: C */
        public C2082e mo15338C(@ts2 CharSequence charSequence) {
            this.f11618b = C2087g.m14085A(charSequence);
            this.f11617a = true;
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: a */
        public void mo15339a(@mr2 Bundle bundle) {
            super.mo15339a(bundle);
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: b */
        public void mo15332b(bs2 bs2) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(bs2.mo13807a()).setBigContentTitle(this.f11616a).bigText(this.f11494c);
            if (this.f11617a) {
                bigText.setSummaryText(this.f11618b);
            }
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: g */
        public void mo15333g(@mr2 Bundle bundle) {
            super.mo15333g(bundle);
            bundle.remove(es2.f11412m);
        }

        @mr2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: t */
        public String mo15334t() {
            return f11493a;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: y */
        public void mo15335y(@mr2 Bundle bundle) {
            super.mo15335y(bundle);
            this.f11494c = bundle.getCharSequence(es2.f11412m);
        }
    }

    /* renamed from: com.onedelhi.secure.es2$f */
    public static final class C2083f {

        /* renamed from: d */
        public static final int f11495d = 1;

        /* renamed from: e */
        public static final int f11496e = 2;

        /* renamed from: a */
        public int f11497a;

        /* renamed from: a */
        public PendingIntent f11498a;

        /* renamed from: a */
        public IconCompat f11499a;

        /* renamed from: a */
        public String f11500a;
        @yk0

        /* renamed from: b */
        public int f11501b;

        /* renamed from: b */
        public PendingIntent f11502b;

        /* renamed from: c */
        public int f11503c;

        @sj3(29)
        /* renamed from: com.onedelhi.secure.es2$f$a */
        public static class C2084a {
            private C2084a() {
            }

            @sj3(29)
            @ts2
            /* renamed from: a */
            public static C2083f m14072a(@ts2 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                C2086c i = new C2086c(bubbleMetadata.getIntent(), IconCompat.m3643o(bubbleMetadata.getIcon())).mo15350b(bubbleMetadata.getAutoExpandBubble()).mo15351c(bubbleMetadata.getDeleteIntent()).mo15357i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    i.mo15352d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    i.mo15353e(bubbleMetadata.getDesiredHeightResId());
                }
                return i.mo15349a();
            }

            @sj3(29)
            @ts2
            /* renamed from: b */
            public static Notification.BubbleMetadata m14073b(@ts2 C2083f fVar) {
                if (fVar == null || fVar.mo15345g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(fVar.mo15344f().mo3784M()).setIntent(fVar.mo15345g()).setDeleteIntent(fVar.mo15341c()).setAutoExpandBubble(fVar.mo15340b()).setSuppressNotification(fVar.mo15347i());
                if (fVar.mo15342d() != 0) {
                    suppressNotification.setDesiredHeight(fVar.mo15342d());
                }
                if (fVar.mo15343e() != 0) {
                    suppressNotification.setDesiredHeightResId(fVar.mo15343e());
                }
                return suppressNotification.build();
            }
        }

        @sj3(30)
        /* renamed from: com.onedelhi.secure.es2$f$b */
        public static class C2085b {
            private C2085b() {
            }

            @sj3(30)
            @ts2
            /* renamed from: a */
            public static C2083f m14074a(@ts2 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                C2086c cVar = bubbleMetadata.getShortcutId() != null ? new C2086c(bubbleMetadata.getShortcutId()) : new C2086c(bubbleMetadata.getIntent(), IconCompat.m3643o(bubbleMetadata.getIcon()));
                cVar.mo15350b(bubbleMetadata.getAutoExpandBubble()).mo15351c(bubbleMetadata.getDeleteIntent()).mo15357i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.mo15352d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.mo15353e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.mo15349a();
            }

            @sj3(30)
            @ts2
            /* renamed from: b */
            public static Notification.BubbleMetadata m14075b(@ts2 C2083f fVar) {
                if (fVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = fVar.mo15346h() != null ? new Notification.BubbleMetadata.Builder(fVar.mo15346h()) : new Notification.BubbleMetadata.Builder(fVar.mo15345g(), fVar.mo15344f().mo3784M());
                builder.setDeleteIntent(fVar.mo15341c()).setAutoExpandBubble(fVar.mo15340b()).setSuppressNotification(fVar.mo15347i());
                if (fVar.mo15342d() != 0) {
                    builder.setDesiredHeight(fVar.mo15342d());
                }
                if (fVar.mo15343e() != 0) {
                    builder.setDesiredHeightResId(fVar.mo15343e());
                }
                return builder.build();
            }
        }

        /* renamed from: com.onedelhi.secure.es2$f$c */
        public static final class C2086c {

            /* renamed from: a */
            public int f11504a;

            /* renamed from: a */
            public PendingIntent f11505a;

            /* renamed from: a */
            public IconCompat f11506a;

            /* renamed from: a */
            public String f11507a;
            @yk0

            /* renamed from: b */
            public int f11508b;

            /* renamed from: b */
            public PendingIntent f11509b;

            /* renamed from: c */
            public int f11510c;

            @Deprecated
            public C2086c() {
            }

            public C2086c(@mr2 PendingIntent pendingIntent, @mr2 IconCompat iconCompat) {
                Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
                Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
                this.f11505a = pendingIntent;
                this.f11506a = iconCompat;
            }

            @sj3(30)
            public C2086c(@mr2 String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f11507a = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            @mr2
            @SuppressLint({"SyntheticAccessor"})
            /* renamed from: a */
            public C2083f mo15349a() {
                String str = this.f11507a;
                if (str == null) {
                    Objects.requireNonNull(this.f11505a, "Must supply pending intent or shortcut to bubble");
                }
                if (str == null) {
                    Objects.requireNonNull(this.f11506a, "Must supply an icon or shortcut for the bubble");
                }
                C2083f fVar = new C2083f(this.f11505a, this.f11509b, this.f11506a, this.f11504a, this.f11508b, this.f11510c, str);
                fVar.mo15348j(this.f11510c);
                return fVar;
            }

            @mr2
            /* renamed from: b */
            public C2086c mo15350b(boolean z) {
                mo15354f(1, z);
                return this;
            }

            @mr2
            /* renamed from: c */
            public C2086c mo15351c(@ts2 PendingIntent pendingIntent) {
                this.f11509b = pendingIntent;
                return this;
            }

            @mr2
            /* renamed from: d */
            public C2086c mo15352d(@zk0(unit = 0) int i) {
                this.f11504a = Math.max(i, 0);
                this.f11508b = 0;
                return this;
            }

            @mr2
            /* renamed from: e */
            public C2086c mo15353e(@yk0 int i) {
                this.f11508b = i;
                this.f11504a = 0;
                return this;
            }

            @mr2
            /* renamed from: f */
            public final C2086c mo15354f(int i, boolean z) {
                int i2;
                if (z) {
                    i2 = i | this.f11510c;
                } else {
                    i2 = (~i) & this.f11510c;
                }
                this.f11510c = i2;
                return this;
            }

            @mr2
            /* renamed from: g */
            public C2086c mo15355g(@mr2 IconCompat iconCompat) {
                if (this.f11507a == null) {
                    Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
                    this.f11506a = iconCompat;
                    return this;
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @mr2
            /* renamed from: h */
            public C2086c mo15356h(@mr2 PendingIntent pendingIntent) {
                if (this.f11507a == null) {
                    Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
                    this.f11505a = pendingIntent;
                    return this;
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @mr2
            /* renamed from: i */
            public C2086c mo15357i(boolean z) {
                mo15354f(2, z);
                return this;
            }
        }

        public C2083f(@ts2 PendingIntent pendingIntent, @ts2 PendingIntent pendingIntent2, @ts2 IconCompat iconCompat, int i, @yk0 int i2, int i3, @ts2 String str) {
            this.f11498a = pendingIntent;
            this.f11499a = iconCompat;
            this.f11497a = i;
            this.f11501b = i2;
            this.f11502b = pendingIntent2;
            this.f11503c = i3;
            this.f11500a = str;
        }

        @ts2
        /* renamed from: a */
        public static C2083f m14061a(@ts2 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C2085b.m14074a(bubbleMetadata);
            }
            if (i == 29) {
                return C2084a.m14072a(bubbleMetadata);
            }
            return null;
        }

        @ts2
        /* renamed from: k */
        public static Notification.BubbleMetadata m14062k(@ts2 C2083f fVar) {
            if (fVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C2085b.m14075b(fVar);
            }
            if (i == 29) {
                return C2084a.m14073b(fVar);
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo15340b() {
            return (this.f11503c & 1) != 0;
        }

        @ts2
        /* renamed from: c */
        public PendingIntent mo15341c() {
            return this.f11502b;
        }

        @zk0(unit = 0)
        /* renamed from: d */
        public int mo15342d() {
            return this.f11497a;
        }

        @yk0
        /* renamed from: e */
        public int mo15343e() {
            return this.f11501b;
        }

        @SuppressLint({"InvalidNullConversion"})
        @ts2
        /* renamed from: f */
        public IconCompat mo15344f() {
            return this.f11499a;
        }

        @SuppressLint({"InvalidNullConversion"})
        @ts2
        /* renamed from: g */
        public PendingIntent mo15345g() {
            return this.f11498a;
        }

        @ts2
        /* renamed from: h */
        public String mo15346h() {
            return this.f11500a;
        }

        /* renamed from: i */
        public boolean mo15347i() {
            return (this.f11503c & 2) != 0;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: j */
        public void mo15348j(int i) {
            this.f11503c = i;
        }
    }

    /* renamed from: com.onedelhi.secure.es2$g */
    public static class C2087g {

        /* renamed from: j */
        public static final int f11511j = 5120;

        /* renamed from: a */
        public int f11512a;

        /* renamed from: a */
        public long f11513a;

        /* renamed from: a */
        public Notification f11514a;

        /* renamed from: a */
        public PendingIntent f11515a;
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: a */
        public Context f11516a;

        /* renamed from: a */
        public Bitmap f11517a;

        /* renamed from: a */
        public Icon f11518a;

        /* renamed from: a */
        public Bundle f11519a;

        /* renamed from: a */
        public RemoteViews f11520a;

        /* renamed from: a */
        public C2083f f11521a;

        /* renamed from: a */
        public C2100q f11522a;

        /* renamed from: a */
        public t82 f11523a;

        /* renamed from: a */
        public CharSequence f11524a;

        /* renamed from: a */
        public String f11525a;
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: a */
        public ArrayList<C2072b> f11526a;

        /* renamed from: a */
        public boolean f11527a;

        /* renamed from: a */
        public CharSequence[] f11528a;

        /* renamed from: b */
        public int f11529b;

        /* renamed from: b */
        public Notification f11530b;

        /* renamed from: b */
        public PendingIntent f11531b;

        /* renamed from: b */
        public RemoteViews f11532b;

        /* renamed from: b */
        public CharSequence f11533b;

        /* renamed from: b */
        public String f11534b;
        @mr2
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: b */
        public ArrayList<s13> f11535b;

        /* renamed from: b */
        public boolean f11536b;

        /* renamed from: c */
        public int f11537c;

        /* renamed from: c */
        public RemoteViews f11538c;

        /* renamed from: c */
        public CharSequence f11539c;

        /* renamed from: c */
        public String f11540c;

        /* renamed from: c */
        public ArrayList<C2072b> f11541c;

        /* renamed from: c */
        public boolean f11542c;

        /* renamed from: d */
        public int f11543d;

        /* renamed from: d */
        public RemoteViews f11544d;

        /* renamed from: d */
        public CharSequence f11545d;

        /* renamed from: d */
        public String f11546d;
        @Deprecated

        /* renamed from: d */
        public ArrayList<String> f11547d;

        /* renamed from: d */
        public boolean f11548d;

        /* renamed from: e */
        public int f11549e;

        /* renamed from: e */
        public CharSequence f11550e;

        /* renamed from: e */
        public String f11551e;

        /* renamed from: e */
        public boolean f11552e;

        /* renamed from: f */
        public int f11553f;

        /* renamed from: f */
        public boolean f11554f;

        /* renamed from: g */
        public int f11555g;

        /* renamed from: g */
        public boolean f11556g;

        /* renamed from: h */
        public int f11557h;

        /* renamed from: h */
        public boolean f11558h;

        /* renamed from: i */
        public int f11559i;

        /* renamed from: i */
        public boolean f11560i;

        /* renamed from: j */
        public boolean f11561j;

        @Deprecated
        public C2087g(@mr2 Context context) {
            this(context, (String) null);
        }

        @sj3(19)
        public C2087g(@mr2 Context context, @mr2 Notification notification) {
            this(context, es2.m13979i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            C2100q s = C2100q.m14250s(notification);
            mo15381P(es2.m13983m(notification)).mo15380O(es2.m13982l(notification)).mo15378M(es2.m13981k(notification)).mo15358A0(es2.m13966D(notification)).mo15421o0(es2.m13996z(notification)).mo15442z0(s).mo15379N(notification.contentIntent).mo15391Z(es2.m13985o(notification)).mo15395b0(es2.m13970H(notification)).mo15403f0(es2.m13990t(notification)).mo15372H0(notification.when).mo15427r0(es2.m13964B(notification)).mo15366E0(es2.m13968F(notification)).mo15363D(es2.m13975e(notification)).mo15411j0(es2.m13993w(notification)).mo15409i0(es2.m13992v(notification)).mo15401e0(es2.m13989s(notification)).mo15397c0(notification.largeIcon).mo15365E(es2.m13976f(notification)).mo15369G(es2.m13978h(notification)).mo15367F(es2.m13977g(notification)).mo15407h0(notification.number).mo15360B0(notification.tickerText).mo15379N(notification.contentIntent).mo15386U(notification.deleteIntent).mo15390Y(notification.fullScreenIntent, es2.m13987q(notification)).mo15440y0(notification.sound, notification.audioStreamType).mo15368F0(notification.vibrate).mo15399d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).mo15385T(notification.defaults).mo15413k0(notification.priority).mo15375J(es2.m13980j(notification)).mo15370G0(es2.m13969G(notification)).mo15417m0(es2.m13995y(notification)).mo15436w0(es2.m13965C(notification)).mo15364D0(es2.m13967E(notification)).mo15423p0(es2.m13963A(notification)).mo15415l0(bundle.getInt(es2.f11422r), bundle.getInt(es2.f11420q), bundle.getBoolean(es2.f11424s)).mo15361C(es2.m13974d(notification)).mo15432u0(notification.icon, notification.iconLevel).mo15396c(m14086u(notification, s));
            if (Build.VERSION.SDK_INT >= 23) {
                this.f11518a = notification.getSmallIcon();
            }
            Notification.Action[] actionArr = notification.actions;
            if (!(actionArr == null || actionArr.length == 0)) {
                for (Notification.Action f : actionArr) {
                    mo15394b(C2072b.C2073a.m14009f(f).mo15301c());
                }
            }
            List<C2072b> r = es2.m13988r(notification);
            if (!r.isEmpty()) {
                for (C2072b e : r) {
                    mo15400e(e);
                }
            }
            String[] stringArray = notification.extras.getStringArray(es2.f11349D);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String g : stringArray) {
                    mo15404g(g);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(es2.f11351E)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    mo15402f(s13.m27189a((Person) it.next()));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24 && bundle.containsKey(es2.f11428u)) {
                mo15373I(bundle.getBoolean(es2.f11428u));
            }
            if (i >= 26 && bundle.containsKey(es2.f11430v)) {
                mo15376K(bundle.getBoolean(es2.f11430v));
            }
        }

        public C2087g(@mr2 Context context, @mr2 String str) {
            this.f11526a = new ArrayList<>();
            this.f11535b = new ArrayList<>();
            this.f11541c = new ArrayList<>();
            this.f11527a = true;
            this.f11554f = false;
            this.f11549e = 0;
            this.f11553f = 0;
            this.f11555g = 0;
            this.f11557h = 0;
            this.f11559i = 0;
            Notification notification = new Notification();
            this.f11530b = notification;
            this.f11516a = context;
            this.f11546d = str;
            notification.when = System.currentTimeMillis();
            this.f11530b.audioStreamType = -1;
            this.f11529b = 0;
            this.f11547d = new ArrayList<>();
            this.f11560i = true;
        }

        @ts2
        /* renamed from: A */
        public static CharSequence m14085A(@ts2 CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, f11511j) : charSequence;
        }

        @sj3(19)
        @ts2
        /* renamed from: u */
        public static Bundle m14086u(@mr2 Notification notification, @ts2 C2100q qVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(es2.f11392f);
            bundle.remove(es2.f11398h);
            bundle.remove(es2.f11407k);
            bundle.remove(es2.f11401i);
            bundle.remove(es2.f11380b);
            bundle.remove(es2.f11383c);
            bundle.remove(es2.f11432w);
            bundle.remove(es2.f11420q);
            bundle.remove(es2.f11422r);
            bundle.remove(es2.f11424s);
            bundle.remove(es2.f11428u);
            bundle.remove(es2.f11430v);
            bundle.remove(es2.f11351E);
            bundle.remove(es2.f11349D);
            bundle.remove(hs2.f13245d);
            bundle.remove(hs2.f13243b);
            bundle.remove(hs2.f13244c);
            bundle.remove(hs2.f13242a);
            bundle.remove(hs2.f13246e);
            Bundle bundle2 = bundle.getBundle(C2088h.f11562a);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(C2088h.f11566e);
                bundle.putBundle(C2088h.f11562a, bundle3);
            }
            if (qVar != null) {
                qVar.mo15333g(bundle);
            }
            return bundle;
        }

        @mr2
        /* renamed from: A0 */
        public C2087g mo15358A0(@ts2 CharSequence charSequence) {
            this.f11545d = m14085A(charSequence);
            return this;
        }

        @ts2
        /* renamed from: B */
        public final Bitmap mo15359B(@ts2 Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f11516a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(nd3.C2967c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(nd3.C2967c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        @mr2
        /* renamed from: B0 */
        public C2087g mo15360B0(@ts2 CharSequence charSequence) {
            this.f11530b.tickerText = m14085A(charSequence);
            return this;
        }

        @mr2
        /* renamed from: C */
        public C2087g mo15361C(boolean z) {
            this.f11560i = z;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: C0 */
        public C2087g mo15362C0(@ts2 CharSequence charSequence, @ts2 RemoteViews remoteViews) {
            this.f11530b.tickerText = m14085A(charSequence);
            this.f11520a = remoteViews;
            return this;
        }

        @mr2
        /* renamed from: D */
        public C2087g mo15363D(boolean z) {
            mo15388W(16, z);
            return this;
        }

        @mr2
        /* renamed from: D0 */
        public C2087g mo15364D0(long j) {
            this.f11513a = j;
            return this;
        }

        @mr2
        /* renamed from: E */
        public C2087g mo15365E(int i) {
            this.f11555g = i;
            return this;
        }

        @mr2
        /* renamed from: E0 */
        public C2087g mo15366E0(boolean z) {
            this.f11536b = z;
            return this;
        }

        @mr2
        /* renamed from: F */
        public C2087g mo15367F(@ts2 C2083f fVar) {
            this.f11521a = fVar;
            return this;
        }

        @mr2
        /* renamed from: F0 */
        public C2087g mo15368F0(@ts2 long[] jArr) {
            this.f11530b.vibrate = jArr;
            return this;
        }

        @mr2
        /* renamed from: G */
        public C2087g mo15369G(@ts2 String str) {
            this.f11540c = str;
            return this;
        }

        @mr2
        /* renamed from: G0 */
        public C2087g mo15370G0(int i) {
            this.f11553f = i;
            return this;
        }

        @mr2
        /* renamed from: H */
        public C2087g mo15371H(@mr2 String str) {
            this.f11546d = str;
            return this;
        }

        @mr2
        /* renamed from: H0 */
        public C2087g mo15372H0(long j) {
            this.f11530b.when = j;
            return this;
        }

        @mr2
        @sj3(24)
        /* renamed from: I */
        public C2087g mo15373I(boolean z) {
            this.f11542c = z;
            mo15430t().putBoolean(es2.f11428u, z);
            return this;
        }

        /* renamed from: I0 */
        public final boolean mo15374I0() {
            C2100q qVar = this.f11522a;
            return qVar == null || !qVar.mo15464r();
        }

        @mr2
        /* renamed from: J */
        public C2087g mo15375J(@d10 int i) {
            this.f11549e = i;
            return this;
        }

        @mr2
        /* renamed from: K */
        public C2087g mo15376K(boolean z) {
            this.f11556g = z;
            this.f11558h = true;
            return this;
        }

        @mr2
        /* renamed from: L */
        public C2087g mo15377L(@ts2 RemoteViews remoteViews) {
            this.f11530b.contentView = remoteViews;
            return this;
        }

        @mr2
        /* renamed from: M */
        public C2087g mo15378M(@ts2 CharSequence charSequence) {
            this.f11539c = m14085A(charSequence);
            return this;
        }

        @mr2
        /* renamed from: N */
        public C2087g mo15379N(@ts2 PendingIntent pendingIntent) {
            this.f11515a = pendingIntent;
            return this;
        }

        @mr2
        /* renamed from: O */
        public C2087g mo15380O(@ts2 CharSequence charSequence) {
            this.f11533b = m14085A(charSequence);
            return this;
        }

        @mr2
        /* renamed from: P */
        public C2087g mo15381P(@ts2 CharSequence charSequence) {
            this.f11524a = m14085A(charSequence);
            return this;
        }

        @mr2
        /* renamed from: Q */
        public C2087g mo15382Q(@ts2 RemoteViews remoteViews) {
            this.f11538c = remoteViews;
            return this;
        }

        @mr2
        /* renamed from: R */
        public C2087g mo15383R(@ts2 RemoteViews remoteViews) {
            this.f11532b = remoteViews;
            return this;
        }

        @mr2
        /* renamed from: S */
        public C2087g mo15384S(@ts2 RemoteViews remoteViews) {
            this.f11544d = remoteViews;
            return this;
        }

        @mr2
        /* renamed from: T */
        public C2087g mo15385T(int i) {
            Notification notification = this.f11530b;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @mr2
        /* renamed from: U */
        public C2087g mo15386U(@ts2 PendingIntent pendingIntent) {
            this.f11530b.deleteIntent = pendingIntent;
            return this;
        }

        @mr2
        /* renamed from: V */
        public C2087g mo15387V(@ts2 Bundle bundle) {
            this.f11519a = bundle;
            return this;
        }

        /* renamed from: W */
        public final void mo15388W(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f11530b;
                i2 = i | notification.flags;
            } else {
                notification = this.f11530b;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        @mr2
        /* renamed from: X */
        public C2087g mo15389X(int i) {
            this.f11559i = i;
            return this;
        }

        @mr2
        /* renamed from: Y */
        public C2087g mo15390Y(@ts2 PendingIntent pendingIntent, boolean z) {
            this.f11531b = pendingIntent;
            mo15388W(128, z);
            return this;
        }

        @mr2
        /* renamed from: Z */
        public C2087g mo15391Z(@ts2 String str) {
            this.f11525a = str;
            return this;
        }

        @mr2
        /* renamed from: a */
        public C2087g mo15392a(int i, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent) {
            this.f11526a.add(new C2072b(i, charSequence, pendingIntent));
            return this;
        }

        @mr2
        /* renamed from: a0 */
        public C2087g mo15393a0(int i) {
            this.f11557h = i;
            return this;
        }

        @mr2
        /* renamed from: b */
        public C2087g mo15394b(@ts2 C2072b bVar) {
            if (bVar != null) {
                this.f11526a.add(bVar);
            }
            return this;
        }

        @mr2
        /* renamed from: b0 */
        public C2087g mo15395b0(boolean z) {
            this.f11552e = z;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2087g mo15396c(@ts2 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f11519a;
                if (bundle2 == null) {
                    this.f11519a = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @mr2
        /* renamed from: c0 */
        public C2087g mo15397c0(@ts2 Bitmap bitmap) {
            this.f11517a = mo15359B(bitmap);
            return this;
        }

        @mr2
        @sj3(21)
        /* renamed from: d */
        public C2087g mo15398d(int i, @ts2 CharSequence charSequence, @ts2 PendingIntent pendingIntent) {
            this.f11541c.add(new C2072b(i, charSequence, pendingIntent));
            return this;
        }

        @mr2
        /* renamed from: d0 */
        public C2087g mo15399d0(@d10 int i, int i2, int i3) {
            Notification notification = this.f11530b;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        @mr2
        @sj3(21)
        /* renamed from: e */
        public C2087g mo15400e(@ts2 C2072b bVar) {
            if (bVar != null) {
                this.f11541c.add(bVar);
            }
            return this;
        }

        @mr2
        /* renamed from: e0 */
        public C2087g mo15401e0(boolean z) {
            this.f11554f = z;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C2087g mo15402f(@ts2 s13 s13) {
            if (s13 != null) {
                this.f11535b.add(s13);
            }
            return this;
        }

        @mr2
        /* renamed from: f0 */
        public C2087g mo15403f0(@ts2 t82 t82) {
            this.f11523a = t82;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: g */
        public C2087g mo15404g(@ts2 String str) {
            if (str != null && !str.isEmpty()) {
                this.f11547d.add(str);
            }
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: g0 */
        public C2087g mo15405g0() {
            this.f11561j = true;
            return this;
        }

        @mr2
        /* renamed from: h */
        public Notification mo15406h() {
            return new gs2(this).mo16902c();
        }

        @mr2
        /* renamed from: h0 */
        public C2087g mo15407h0(int i) {
            this.f11512a = i;
            return this;
        }

        @mr2
        /* renamed from: i */
        public C2087g mo15408i() {
            this.f11526a.clear();
            return this;
        }

        @mr2
        /* renamed from: i0 */
        public C2087g mo15409i0(boolean z) {
            mo15388W(2, z);
            return this;
        }

        @mr2
        /* renamed from: j */
        public C2087g mo15410j() {
            this.f11541c.clear();
            Bundle bundle = this.f11519a.getBundle(C2088h.f11562a);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(C2088h.f11566e);
                this.f11519a.putBundle(C2088h.f11562a, bundle2);
            }
            return this;
        }

        @mr2
        /* renamed from: j0 */
        public C2087g mo15411j0(boolean z) {
            mo15388W(8, z);
            return this;
        }

        @mr2
        /* renamed from: k */
        public C2087g mo15412k() {
            this.f11535b.clear();
            this.f11547d.clear();
            return this;
        }

        @mr2
        /* renamed from: k0 */
        public C2087g mo15413k0(int i) {
            this.f11529b = i;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @ts2
        /* renamed from: l */
        public RemoteViews mo15414l() {
            RemoteViews v;
            int i = Build.VERSION.SDK_INT;
            if (this.f11538c != null && mo15374I0()) {
                return this.f11538c;
            }
            gs2 gs2 = new gs2(this);
            C2100q qVar = this.f11522a;
            if (qVar != null && (v = qVar.mo15465v(gs2)) != null) {
                return v;
            }
            Notification c = gs2.mo16902c();
            return i >= 24 ? Notification.Builder.recoverBuilder(this.f11516a, c).createBigContentView() : c.bigContentView;
        }

        @mr2
        /* renamed from: l0 */
        public C2087g mo15415l0(int i, int i2, boolean z) {
            this.f11537c = i;
            this.f11543d = i2;
            this.f11548d = z;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @ts2
        /* renamed from: m */
        public RemoteViews mo15416m() {
            RemoteViews w;
            if (this.f11532b != null && mo15374I0()) {
                return this.f11532b;
            }
            gs2 gs2 = new gs2(this);
            C2100q qVar = this.f11522a;
            if (qVar != null && (w = qVar.mo15466w(gs2)) != null) {
                return w;
            }
            Notification c = gs2.mo16902c();
            return Build.VERSION.SDK_INT >= 24 ? Notification.Builder.recoverBuilder(this.f11516a, c).createContentView() : c.contentView;
        }

        @mr2
        /* renamed from: m0 */
        public C2087g mo15417m0(@ts2 Notification notification) {
            this.f11514a = notification;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @ts2
        /* renamed from: n */
        public RemoteViews mo15418n() {
            RemoteViews x;
            int i = Build.VERSION.SDK_INT;
            if (this.f11544d != null && mo15374I0()) {
                return this.f11544d;
            }
            gs2 gs2 = new gs2(this);
            C2100q qVar = this.f11522a;
            if (qVar != null && (x = qVar.mo15467x(gs2)) != null) {
                return x;
            }
            Notification c = gs2.mo16902c();
            return i >= 24 ? Notification.Builder.recoverBuilder(this.f11516a, c).createHeadsUpContentView() : c.headsUpContentView;
        }

        @mr2
        /* renamed from: n0 */
        public C2087g mo15419n0(@ts2 CharSequence[] charSequenceArr) {
            this.f11528a = charSequenceArr;
            return this;
        }

        @mr2
        /* renamed from: o */
        public C2087g mo15420o(@mr2 C2092j jVar) {
            jVar.mo15443a(this);
            return this;
        }

        @mr2
        /* renamed from: o0 */
        public C2087g mo15421o0(@ts2 CharSequence charSequence) {
            this.f11550e = m14085A(charSequence);
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: p */
        public RemoteViews mo15422p() {
            return this.f11538c;
        }

        @mr2
        /* renamed from: p0 */
        public C2087g mo15423p0(@ts2 String str) {
            this.f11551e = str;
            return this;
        }

        @ts2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: q */
        public C2083f mo15424q() {
            return this.f11521a;
        }

        @mr2
        /* renamed from: q0 */
        public C2087g mo15425q0(@ts2 iy3 iy3) {
            t82 t82;
            if (iy3 == null) {
                return this;
            }
            this.f11551e = iy3.mo18030k();
            if (this.f11523a == null) {
                if (iy3.mo18034o() != null) {
                    t82 = iy3.mo18034o();
                } else if (iy3.mo18030k() != null) {
                    t82 = new t82(iy3.mo18030k());
                }
                this.f11523a = t82;
            }
            if (this.f11524a == null) {
                mo15381P(iy3.mo18038w());
            }
            return this;
        }

        @d10
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: r */
        public int mo15426r() {
            return this.f11549e;
        }

        @mr2
        /* renamed from: r0 */
        public C2087g mo15427r0(boolean z) {
            this.f11527a = z;
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: s */
        public RemoteViews mo15428s() {
            return this.f11532b;
        }

        @mr2
        /* renamed from: s0 */
        public C2087g mo15429s0(boolean z) {
            this.f11561j = z;
            return this;
        }

        @mr2
        /* renamed from: t */
        public Bundle mo15430t() {
            if (this.f11519a == null) {
                this.f11519a = new Bundle();
            }
            return this.f11519a;
        }

        @mr2
        /* renamed from: t0 */
        public C2087g mo15431t0(int i) {
            this.f11530b.icon = i;
            return this;
        }

        @mr2
        /* renamed from: u0 */
        public C2087g mo15432u0(int i, int i2) {
            Notification notification = this.f11530b;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: v */
        public int mo15433v() {
            return this.f11559i;
        }

        @mr2
        @sj3(23)
        /* renamed from: v0 */
        public C2087g mo15434v0(@mr2 IconCompat iconCompat) {
            this.f11518a = iconCompat.mo3785N(this.f11516a);
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: w */
        public RemoteViews mo15435w() {
            return this.f11544d;
        }

        @mr2
        /* renamed from: w0 */
        public C2087g mo15436w0(@ts2 String str) {
            this.f11534b = str;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: x */
        public Notification mo15437x() {
            return mo15406h();
        }

        @mr2
        /* renamed from: x0 */
        public C2087g mo15438x0(@ts2 Uri uri) {
            Notification notification = this.f11530b;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: y */
        public int mo15439y() {
            return this.f11529b;
        }

        @mr2
        /* renamed from: y0 */
        public C2087g mo15440y0(@ts2 Uri uri, int i) {
            Notification notification = this.f11530b;
            notification.sound = uri;
            notification.audioStreamType = i;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: z */
        public long mo15441z() {
            if (this.f11527a) {
                return this.f11530b.when;
            }
            return 0;
        }

        @mr2
        /* renamed from: z0 */
        public C2087g mo15442z0(@ts2 C2100q qVar) {
            if (this.f11522a != qVar) {
                this.f11522a = qVar;
                if (qVar != null) {
                    qVar.mo15507z(this);
                }
            }
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.es2$h */
    public static final class C2088h implements C2092j {
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: a */
        public static final String f11562a = "android.car.EXTENSIONS";

        /* renamed from: b */
        public static final String f11563b = "large_icon";

        /* renamed from: c */
        public static final String f11564c = "car_conversation";

        /* renamed from: d */
        public static final String f11565d = "app_color";
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: e */
        public static final String f11566e = "invisible_actions";

        /* renamed from: f */
        public static final String f11567f = "author";

        /* renamed from: g */
        public static final String f11568g = "text";

        /* renamed from: h */
        public static final String f11569h = "messages";

        /* renamed from: i */
        public static final String f11570i = "remote_input";

        /* renamed from: j */
        public static final String f11571j = "on_reply";

        /* renamed from: k */
        public static final String f11572k = "on_read";

        /* renamed from: l */
        public static final String f11573l = "participants";

        /* renamed from: m */
        public static final String f11574m = "timestamp";

        /* renamed from: a */
        public int f11575a = 0;

        /* renamed from: a */
        public Bitmap f11576a;

        /* renamed from: a */
        public C2089a f11577a;

        @Deprecated
        /* renamed from: com.onedelhi.secure.es2$h$a */
        public static class C2089a {

            /* renamed from: a */
            public final long f11578a;

            /* renamed from: a */
            public final PendingIntent f11579a;

            /* renamed from: a */
            public final ai3 f11580a;

            /* renamed from: a */
            public final String[] f11581a;

            /* renamed from: b */
            public final PendingIntent f11582b;

            /* renamed from: b */
            public final String[] f11583b;

            /* renamed from: com.onedelhi.secure.es2$h$a$a */
            public static class C2090a {

                /* renamed from: a */
                public long f11584a;

                /* renamed from: a */
                public PendingIntent f11585a;

                /* renamed from: a */
                public ai3 f11586a;

                /* renamed from: a */
                public final String f11587a;

                /* renamed from: a */
                public final List<String> f11588a = new ArrayList();

                /* renamed from: b */
                public PendingIntent f11589b;

                public C2090a(@mr2 String str) {
                    this.f11587a = str;
                }

                @mr2
                /* renamed from: a */
                public C2090a mo15457a(@ts2 String str) {
                    if (str != null) {
                        this.f11588a.add(str);
                    }
                    return this;
                }

                @mr2
                /* renamed from: b */
                public C2089a mo15458b() {
                    List<String> list = this.f11588a;
                    return new C2089a((String[]) list.toArray(new String[list.size()]), this.f11586a, this.f11589b, this.f11585a, new String[]{this.f11587a}, this.f11584a);
                }

                @mr2
                /* renamed from: c */
                public C2090a mo15459c(long j) {
                    this.f11584a = j;
                    return this;
                }

                @mr2
                /* renamed from: d */
                public C2090a mo15460d(@ts2 PendingIntent pendingIntent) {
                    this.f11585a = pendingIntent;
                    return this;
                }

                @mr2
                /* renamed from: e */
                public C2090a mo15461e(@ts2 PendingIntent pendingIntent, @ts2 ai3 ai3) {
                    this.f11586a = ai3;
                    this.f11589b = pendingIntent;
                    return this;
                }
            }

            public C2089a(@ts2 String[] strArr, @ts2 ai3 ai3, @ts2 PendingIntent pendingIntent, @ts2 PendingIntent pendingIntent2, @ts2 String[] strArr2, long j) {
                this.f11581a = strArr;
                this.f11580a = ai3;
                this.f11582b = pendingIntent2;
                this.f11579a = pendingIntent;
                this.f11583b = strArr2;
                this.f11578a = j;
            }

            /* renamed from: a */
            public long mo15450a() {
                return this.f11578a;
            }

            @ts2
            /* renamed from: b */
            public String[] mo15451b() {
                return this.f11581a;
            }

            @ts2
            /* renamed from: c */
            public String mo15452c() {
                String[] strArr = this.f11583b;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @ts2
            /* renamed from: d */
            public String[] mo15453d() {
                return this.f11583b;
            }

            @ts2
            /* renamed from: e */
            public PendingIntent mo15454e() {
                return this.f11582b;
            }

            @ts2
            /* renamed from: f */
            public ai3 mo15455f() {
                return this.f11580a;
            }

            @ts2
            /* renamed from: g */
            public PendingIntent mo15456g() {
                return this.f11579a;
            }
        }

        public C2088h() {
        }

        public C2088h(@mr2 Notification notification) {
            Bundle bundle = es2.m13984n(notification) == null ? null : es2.m13984n(notification).getBundle(f11562a);
            if (bundle != null) {
                this.f11576a = (Bitmap) bundle.getParcelable(f11563b);
                this.f11575a = bundle.getInt(f11565d, 0);
                this.f11577a = m14173f(bundle.getBundle(f11564c));
            }
        }

        @sj3(21)
        /* renamed from: b */
        public static Bundle m14172b(@mr2 C2089a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.mo15453d() == null || aVar.mo15453d().length <= 1) ? null : aVar.mo15453d()[0];
            int length = aVar.mo15451b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.mo15451b()[i]);
                bundle2.putString(f11567f, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(f11569h, parcelableArr);
            ai3 f = aVar.mo15455f();
            if (f != null) {
                bundle.putParcelable(f11570i, new RemoteInput.Builder(f.mo13099o()).setLabel(f.mo13098n()).setChoices(f.mo13095h()).setAllowFreeFormInput(f.mo13093f()).addExtras(f.mo13097m()).build());
            }
            bundle.putParcelable(f11571j, aVar.mo15456g());
            bundle.putParcelable(f11572k, aVar.mo15454e());
            bundle.putStringArray(f11573l, aVar.mo15453d());
            bundle.putLong("timestamp", aVar.mo15450a());
            return bundle;
        }

        @sj3(21)
        /* renamed from: f */
        public static C2089a m14173f(@ts2 Bundle bundle) {
            String[] strArr;
            boolean z;
            Bundle bundle2 = bundle;
            ai3 ai3 = null;
            if (bundle2 == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle2.getParcelableArray(f11569h);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    } else if (!(parcelableArray[i] instanceof Bundle)) {
                        break;
                    } else {
                        strArr2[i] = ((Bundle) parcelableArray[i]).getString("text");
                        if (strArr2[i] == null) {
                            break;
                        }
                        i++;
                    }
                }
                z = false;
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable(f11572k);
            PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable(f11571j);
            RemoteInput remoteInput = (RemoteInput) bundle2.getParcelable(f11570i);
            String[] stringArray = bundle2.getStringArray(f11573l);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                ai3 = new ai3(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), (Set<String>) null);
            }
            return new C2089a(strArr, ai3, pendingIntent2, pendingIntent, stringArray, bundle2.getLong("timestamp"));
        }

        @mr2
        /* renamed from: a */
        public C2087g mo15443a(@mr2 C2087g gVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f11576a;
            if (bitmap != null) {
                bundle.putParcelable(f11563b, bitmap);
            }
            int i = this.f11575a;
            if (i != 0) {
                bundle.putInt(f11565d, i);
            }
            C2089a aVar = this.f11577a;
            if (aVar != null) {
                bundle.putBundle(f11564c, m14172b(aVar));
            }
            gVar.mo15430t().putBundle(f11562a, bundle);
            return gVar;
        }

        @d10
        /* renamed from: c */
        public int mo15444c() {
            return this.f11575a;
        }

        @ts2
        /* renamed from: d */
        public Bitmap mo15445d() {
            return this.f11576a;
        }

        @ts2
        @Deprecated
        /* renamed from: e */
        public C2089a mo15446e() {
            return this.f11577a;
        }

        @mr2
        /* renamed from: g */
        public C2088h mo15447g(@d10 int i) {
            this.f11575a = i;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C2088h mo15448h(@ts2 Bitmap bitmap) {
            this.f11576a = bitmap;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: i */
        public C2088h mo15449i(@ts2 C2089a aVar) {
            this.f11577a = aVar;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.es2$i */
    public static class C2091i extends C2100q {

        /* renamed from: a */
        public static final int f11590a = 3;

        /* renamed from: a */
        public static final String f11591a = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: C */
        public static List<C2072b> m14193C(List<C2072b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (C2072b next : list) {
                if (!next.mo15298l()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: A */
        public final RemoteViews mo15462A(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i = 0;
            RemoteViews c = mo15497c(true, nd3.C2971g.notification_template_custom_big, false);
            c.removeAllViews(nd3.C2969e.actions);
            List<C2072b> C = m14193C(this.f11615a.f11526a);
            if (!z || C == null || (min = Math.min(C.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i2 = 0; i2 < min; i2++) {
                    c.addView(nd3.C2969e.actions, mo15463B(C.get(i2)));
                }
            }
            if (!z2) {
                i = 8;
            }
            c.setViewVisibility(nd3.C2969e.actions, i);
            c.setViewVisibility(nd3.C2969e.action_divider, i);
            mo15499e(c, remoteViews);
            return c;
        }

        /* renamed from: B */
        public final RemoteViews mo15463B(C2072b bVar) {
            boolean z = bVar.f11453a == null;
            RemoteViews remoteViews = new RemoteViews(this.f11615a.f11516a.getPackageName(), z ? nd3.C2971g.notification_action_tombstone : nd3.C2971g.notification_action);
            IconCompat f = bVar.mo15292f();
            if (f != null) {
                remoteViews.setImageViewBitmap(nd3.C2969e.action_image, mo15503o(f, this.f11615a.f11516a.getResources().getColor(nd3.C2966b.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(nd3.C2969e.action_text, bVar.f11456a);
            if (!z) {
                remoteViews.setOnClickPendingIntent(nd3.C2969e.action_container, bVar.f11453a);
            }
            remoteViews.setContentDescription(nd3.C2969e.action_container, bVar.f11456a);
            return remoteViews;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: b */
        public void mo15332b(bs2 bs2) {
            if (Build.VERSION.SDK_INT >= 24) {
                bs2.mo13807a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: r */
        public boolean mo15464r() {
            return true;
        }

        @mr2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: t */
        public String mo15334t() {
            return f11591a;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: v */
        public RemoteViews mo15465v(bs2 bs2) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews p = this.f11615a.mo15422p();
            if (p == null) {
                p = this.f11615a.mo15428s();
            }
            if (p == null) {
                return null;
            }
            return mo15462A(p, true);
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: w */
        public RemoteViews mo15466w(bs2 bs2) {
            if (Build.VERSION.SDK_INT < 24 && this.f11615a.mo15428s() != null) {
                return mo15462A(this.f11615a.mo15428s(), false);
            }
            return null;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: x */
        public RemoteViews mo15467x(bs2 bs2) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews w = this.f11615a.mo15435w();
            RemoteViews s = w != null ? w : this.f11615a.mo15428s();
            if (w == null) {
                return null;
            }
            return mo15462A(s, true);
        }
    }

    /* renamed from: com.onedelhi.secure.es2$j */
    public interface C2092j {
        @mr2
        /* renamed from: a */
        C2087g mo15443a(@mr2 C2087g gVar);
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.es2$k */
    public @interface C2093k {
    }

    /* renamed from: com.onedelhi.secure.es2$l */
    public static class C2094l extends C2100q {

        /* renamed from: a */
        public static final String f11592a = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: a */
        public ArrayList<CharSequence> f11593a = new ArrayList<>();

        public C2094l() {
        }

        public C2094l(@ts2 C2087g gVar) {
            mo15507z(gVar);
        }

        @mr2
        /* renamed from: A */
        public C2094l mo15468A(@ts2 CharSequence charSequence) {
            if (charSequence != null) {
                this.f11593a.add(C2087g.m14085A(charSequence));
            }
            return this;
        }

        @mr2
        /* renamed from: B */
        public C2094l mo15469B(@ts2 CharSequence charSequence) {
            this.f11616a = C2087g.m14085A(charSequence);
            return this;
        }

        @mr2
        /* renamed from: C */
        public C2094l mo15470C(@ts2 CharSequence charSequence) {
            this.f11618b = C2087g.m14085A(charSequence);
            this.f11617a = true;
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: b */
        public void mo15332b(bs2 bs2) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(bs2.mo13807a()).setBigContentTitle(this.f11616a);
            if (this.f11617a) {
                bigContentTitle.setSummaryText(this.f11618b);
            }
            Iterator<CharSequence> it = this.f11593a.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: g */
        public void mo15333g(@mr2 Bundle bundle) {
            super.mo15333g(bundle);
            bundle.remove(es2.f11343A);
        }

        @mr2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: t */
        public String mo15334t() {
            return f11592a;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: y */
        public void mo15335y(@mr2 Bundle bundle) {
            super.mo15335y(bundle);
            this.f11593a.clear();
            if (bundle.containsKey(es2.f11343A)) {
                Collections.addAll(this.f11593a, bundle.getCharSequenceArray(es2.f11343A));
            }
        }
    }

    /* renamed from: com.onedelhi.secure.es2$m */
    public static class C2095m extends C2100q {

        /* renamed from: a */
        public static final int f11594a = 25;

        /* renamed from: a */
        public static final String f11595a = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: a */
        public s13 f11596a;
        @ts2

        /* renamed from: a */
        public Boolean f11597a;

        /* renamed from: a */
        public final List<C2096a> f11598a = new ArrayList();

        /* renamed from: b */
        public final List<C2096a> f11599b = new ArrayList();
        @ts2

        /* renamed from: c */
        public CharSequence f11600c;

        /* renamed from: com.onedelhi.secure.es2$m$a */
        public static final class C2096a {

            /* renamed from: b */
            public static final String f11601b = "text";

            /* renamed from: c */
            public static final String f11602c = "time";

            /* renamed from: d */
            public static final String f11603d = "sender";

            /* renamed from: e */
            public static final String f11604e = "type";

            /* renamed from: f */
            public static final String f11605f = "uri";

            /* renamed from: g */
            public static final String f11606g = "extras";

            /* renamed from: h */
            public static final String f11607h = "person";

            /* renamed from: i */
            public static final String f11608i = "sender_person";

            /* renamed from: a */
            public final long f11609a;
            @ts2

            /* renamed from: a */
            public Uri f11610a;

            /* renamed from: a */
            public Bundle f11611a;
            @ts2

            /* renamed from: a */
            public final s13 f11612a;

            /* renamed from: a */
            public final CharSequence f11613a;
            @ts2

            /* renamed from: a */
            public String f11614a;

            public C2096a(@ts2 CharSequence charSequence, long j, @ts2 s13 s13) {
                this.f11611a = new Bundle();
                this.f11613a = charSequence;
                this.f11609a = j;
                this.f11612a = s13;
            }

            @Deprecated
            public C2096a(@ts2 CharSequence charSequence, long j, @ts2 CharSequence charSequence2) {
                this(charSequence, j, new s13.C3467c().mo24166f(charSequence2).mo24161a());
            }

            @mr2
            /* renamed from: a */
            public static Bundle[] m14232a(@mr2 List<C2096a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).mo15496m();
                }
                return bundleArr;
            }

            @ts2
            /* renamed from: e */
            public static C2096a m14233e(@mr2 Bundle bundle) {
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            C2096a aVar = new C2096a(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey(f11607h) ? s13.m27190b(bundle.getBundle(f11607h)) : (!bundle.containsKey(f11608i) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new s13.C3467c().mo24166f(bundle.getCharSequence("sender")).mo24161a() : null : s13.m27189a((Person) bundle.getParcelable(f11608i)));
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                aVar.mo15494k(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                aVar.mo15489d().putAll(bundle.getBundle("extras"));
                            }
                            return aVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @mr2
            /* renamed from: f */
            public static List<C2096a> m14234f(@mr2 Parcelable[] parcelableArr) {
                C2096a e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i = 0; i < parcelableArr.length; i++) {
                    if ((parcelableArr[i] instanceof Bundle) && (e = m14233e(parcelableArr[i])) != null) {
                        arrayList.add(e);
                    }
                }
                return arrayList;
            }

            @ts2
            /* renamed from: b */
            public String mo15487b() {
                return this.f11614a;
            }

            @ts2
            /* renamed from: c */
            public Uri mo15488c() {
                return this.f11610a;
            }

            @mr2
            /* renamed from: d */
            public Bundle mo15489d() {
                return this.f11611a;
            }

            @ts2
            /* renamed from: g */
            public s13 mo15490g() {
                return this.f11612a;
            }

            @ts2
            @Deprecated
            /* renamed from: h */
            public CharSequence mo15491h() {
                s13 s13 = this.f11612a;
                if (s13 == null) {
                    return null;
                }
                return s13.mo24152f();
            }

            @ts2
            /* renamed from: i */
            public CharSequence mo15492i() {
                return this.f11613a;
            }

            /* renamed from: j */
            public long mo15493j() {
                return this.f11609a;
            }

            @mr2
            /* renamed from: k */
            public C2096a mo15494k(@ts2 String str, @ts2 Uri uri) {
                this.f11614a = str;
                this.f11610a = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            @com.onedelhi.secure.mr2
            @com.onedelhi.secure.sj3(24)
            @com.onedelhi.secure.hl3({com.onedelhi.secure.hl3.C2354a.f13188c})
            /* renamed from: l */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message mo15495l() {
                /*
                    r6 = this;
                    com.onedelhi.secure.s13 r0 = r6.mo15490g()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 0
                    r3 = 28
                    if (r1 < r3) goto L_0x0020
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.mo15492i()
                    long r4 = r6.mo15493j()
                    if (r0 != 0) goto L_0x0018
                    goto L_0x001c
                L_0x0018:
                    android.app.Person r2 = r0.mo24157k()
                L_0x001c:
                    r1.<init>(r3, r4, r2)
                    goto L_0x0034
                L_0x0020:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.mo15492i()
                    long r4 = r6.mo15493j()
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    java.lang.CharSequence r2 = r0.mo24152f()
                L_0x0031:
                    r1.<init>(r3, r4, r2)
                L_0x0034:
                    java.lang.String r0 = r6.mo15487b()
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r6.mo15487b()
                    android.net.Uri r2 = r6.mo15488c()
                    r1.setData(r0, r2)
                L_0x0045:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.es2.C2095m.C2096a.mo15495l():android.app.Notification$MessagingStyle$Message");
            }

            @mr2
            /* renamed from: m */
            public final Bundle mo15496m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f11613a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f11609a);
                s13 s13 = this.f11612a;
                if (s13 != null) {
                    bundle.putCharSequence("sender", s13.mo24152f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f11608i, this.f11612a.mo24157k());
                    } else {
                        bundle.putBundle(f11607h, this.f11612a.mo24159m());
                    }
                }
                String str = this.f11614a;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f11610a;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f11611a;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public C2095m() {
        }

        public C2095m(@mr2 s13 s13) {
            if (!TextUtils.isEmpty(s13.mo24152f())) {
                this.f11596a = s13;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        @Deprecated
        public C2095m(@mr2 CharSequence charSequence) {
            this.f11596a = new s13.C3467c().mo24166f(charSequence).mo24161a();
        }

        @ts2
        /* renamed from: E */
        public static C2095m m14210E(@mr2 Notification notification) {
            C2100q s = C2100q.m14250s(notification);
            if (s instanceof C2095m) {
                return (C2095m) s;
            }
            return null;
        }

        @mr2
        /* renamed from: A */
        public C2095m mo15471A(@ts2 C2096a aVar) {
            if (aVar != null) {
                this.f11599b.add(aVar);
                if (this.f11599b.size() > 25) {
                    this.f11599b.remove(0);
                }
            }
            return this;
        }

        @mr2
        /* renamed from: B */
        public C2095m mo15472B(@ts2 C2096a aVar) {
            if (aVar != null) {
                this.f11598a.add(aVar);
                if (this.f11598a.size() > 25) {
                    this.f11598a.remove(0);
                }
            }
            return this;
        }

        @mr2
        /* renamed from: C */
        public C2095m mo15473C(@ts2 CharSequence charSequence, long j, @ts2 s13 s13) {
            mo15472B(new C2096a(charSequence, j, s13));
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: D */
        public C2095m mo15474D(@ts2 CharSequence charSequence, long j, @ts2 CharSequence charSequence2) {
            this.f11598a.add(new C2096a(charSequence, j, new s13.C3467c().mo24166f(charSequence2).mo24161a()));
            if (this.f11598a.size() > 25) {
                this.f11598a.remove(0);
            }
            return this;
        }

        @ts2
        /* renamed from: F */
        public final C2096a mo15475F() {
            for (int size = this.f11598a.size() - 1; size >= 0; size--) {
                C2096a aVar = this.f11598a.get(size);
                if (aVar.mo15490g() != null && !TextUtils.isEmpty(aVar.mo15490g().mo24152f())) {
                    return aVar;
                }
            }
            if (this.f11598a.isEmpty()) {
                return null;
            }
            List<C2096a> list = this.f11598a;
            return list.get(list.size() - 1);
        }

        @ts2
        /* renamed from: G */
        public CharSequence mo15476G() {
            return this.f11600c;
        }

        @mr2
        /* renamed from: H */
        public List<C2096a> mo15477H() {
            return this.f11599b;
        }

        @mr2
        /* renamed from: I */
        public List<C2096a> mo15478I() {
            return this.f11598a;
        }

        @mr2
        /* renamed from: J */
        public s13 mo15479J() {
            return this.f11596a;
        }

        @ts2
        @Deprecated
        /* renamed from: K */
        public CharSequence mo15480K() {
            return this.f11596a.mo24152f();
        }

        /* renamed from: L */
        public final boolean mo15481L() {
            for (int size = this.f11598a.size() - 1; size >= 0; size--) {
                C2096a aVar = this.f11598a.get(size);
                if (aVar.mo15490g() != null && aVar.mo15490g().mo24152f() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: M */
        public boolean mo15482M() {
            C2087g gVar = this.f11615a;
            if (gVar != null && gVar.f11516a.getApplicationInfo().targetSdkVersion < 28 && this.f11597a == null) {
                return this.f11600c != null;
            }
            Boolean bool = this.f11597a;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @mr2
        /* renamed from: N */
        public final TextAppearanceSpan mo15483N(int i) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null);
        }

        /* renamed from: O */
        public final CharSequence mo15484O(@mr2 C2096a aVar) {
            C3155pk c = C3155pk.m24758c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = -16777216;
            CharSequence charSequence = "";
            CharSequence f = aVar.mo15490g() == null ? charSequence : aVar.mo15490g().mo24152f();
            if (TextUtils.isEmpty(f)) {
                f = this.f11596a.mo24152f();
                if (this.f11615a.mo15426r() != 0) {
                    i = this.f11615a.mo15426r();
                }
            }
            CharSequence m = c.mo22475m(f);
            spannableStringBuilder.append(m);
            spannableStringBuilder.setSpan(mo15483N(i), spannableStringBuilder.length() - m.length(), spannableStringBuilder.length(), 33);
            if (aVar.mo15492i() != null) {
                charSequence = aVar.mo15492i();
            }
            spannableStringBuilder.append(yg1.C3999a.f23084c).append(c.mo22475m(charSequence));
            return spannableStringBuilder;
        }

        @mr2
        /* renamed from: P */
        public C2095m mo15485P(@ts2 CharSequence charSequence) {
            this.f11600c = charSequence;
            return this;
        }

        @mr2
        /* renamed from: Q */
        public C2095m mo15486Q(boolean z) {
            this.f11597a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public void mo15339a(@mr2 Bundle bundle) {
            super.mo15339a(bundle);
            bundle.putCharSequence(es2.f11358I, this.f11596a.mo24152f());
            bundle.putBundle(es2.f11359J, this.f11596a.mo24159m());
            bundle.putCharSequence(es2.f11364O, this.f11600c);
            if (this.f11600c != null && this.f11597a.booleanValue()) {
                bundle.putCharSequence(es2.f11360K, this.f11600c);
            }
            if (!this.f11598a.isEmpty()) {
                bundle.putParcelableArray(es2.f11361L, C2096a.m14232a(this.f11598a));
            }
            if (!this.f11599b.isEmpty()) {
                bundle.putParcelableArray(es2.f11362M, C2096a.m14232a(this.f11599b));
            }
            Boolean bool = this.f11597a;
            if (bool != null) {
                bundle.putBoolean(es2.f11363N, bool.booleanValue());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
        @com.onedelhi.secure.hl3({com.onedelhi.secure.hl3.C2354a.f13188c})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo15332b(com.onedelhi.secure.bs2 r8) {
            /*
                r7 = this;
                boolean r0 = r7.mo15482M()
                r7.mo15486Q(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x0089
                r1 = 28
                if (r0 < r1) goto L_0x001d
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                com.onedelhi.secure.s13 r2 = r7.f11596a
                android.app.Person r2 = r2.mo24157k()
                r0.<init>(r2)
                goto L_0x0028
            L_0x001d:
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                com.onedelhi.secure.s13 r2 = r7.f11596a
                java.lang.CharSequence r2 = r2.mo24152f()
                r0.<init>(r2)
            L_0x0028:
                java.util.List<com.onedelhi.secure.es2$m$a> r2 = r7.f11598a
                java.util.Iterator r2 = r2.iterator()
            L_0x002e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0042
                java.lang.Object r3 = r2.next()
                com.onedelhi.secure.es2$m$a r3 = (com.onedelhi.secure.es2.C2095m.C2096a) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.mo15495l()
                r0.addMessage(r3)
                goto L_0x002e
            L_0x0042:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r2 < r3) goto L_0x0062
                java.util.List<com.onedelhi.secure.es2$m$a> r2 = r7.f11599b
                java.util.Iterator r2 = r2.iterator()
            L_0x004e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0062
                java.lang.Object r3 = r2.next()
                com.onedelhi.secure.es2$m$a r3 = (com.onedelhi.secure.es2.C2095m.C2096a) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.mo15495l()
                r0.addHistoricMessage(r3)
                goto L_0x004e
            L_0x0062:
                java.lang.Boolean r2 = r7.f11597a
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x006e
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x0073
            L_0x006e:
                java.lang.CharSequence r2 = r7.f11600c
                r0.setConversationTitle(r2)
            L_0x0073:
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x0080
                java.lang.Boolean r1 = r7.f11597a
                boolean r1 = r1.booleanValue()
                r0.setGroupConversation(r1)
            L_0x0080:
                android.app.Notification$Builder r8 = r8.mo13807a()
                r0.setBuilder(r8)
                goto L_0x012d
            L_0x0089:
                com.onedelhi.secure.es2$m$a r0 = r7.mo15475F()
                java.lang.CharSequence r1 = r7.f11600c
                if (r1 == 0) goto L_0x00a3
                java.lang.Boolean r1 = r7.f11597a
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x00a3
                android.app.Notification$Builder r1 = r8.mo13807a()
                java.lang.CharSequence r2 = r7.f11600c
            L_0x009f:
                r1.setContentTitle(r2)
                goto L_0x00c1
            L_0x00a3:
                if (r0 == 0) goto L_0x00c1
                android.app.Notification$Builder r1 = r8.mo13807a()
                java.lang.String r2 = ""
                r1.setContentTitle(r2)
                com.onedelhi.secure.s13 r1 = r0.mo15490g()
                if (r1 == 0) goto L_0x00c1
                android.app.Notification$Builder r1 = r8.mo13807a()
                com.onedelhi.secure.s13 r2 = r0.mo15490g()
                java.lang.CharSequence r2 = r2.mo24152f()
                goto L_0x009f
            L_0x00c1:
                if (r0 == 0) goto L_0x00d7
                android.app.Notification$Builder r1 = r8.mo13807a()
                java.lang.CharSequence r2 = r7.f11600c
                if (r2 == 0) goto L_0x00d0
                java.lang.CharSequence r0 = r7.mo15484O(r0)
                goto L_0x00d4
            L_0x00d0:
                java.lang.CharSequence r0 = r0.mo15492i()
            L_0x00d4:
                r1.setContentText(r0)
            L_0x00d7:
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                java.lang.CharSequence r1 = r7.f11600c
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x00eb
                boolean r1 = r7.mo15481L()
                if (r1 == 0) goto L_0x00e9
                goto L_0x00eb
            L_0x00e9:
                r1 = 0
                goto L_0x00ec
            L_0x00eb:
                r1 = 1
            L_0x00ec:
                java.util.List<com.onedelhi.secure.es2$m$a> r4 = r7.f11598a
                int r4 = r4.size()
                int r4 = r4 - r3
            L_0x00f3:
                if (r4 < 0) goto L_0x011c
                java.util.List<com.onedelhi.secure.es2$m$a> r5 = r7.f11598a
                java.lang.Object r5 = r5.get(r4)
                com.onedelhi.secure.es2$m$a r5 = (com.onedelhi.secure.es2.C2095m.C2096a) r5
                if (r1 == 0) goto L_0x0104
                java.lang.CharSequence r5 = r7.mo15484O(r5)
                goto L_0x0108
            L_0x0104:
                java.lang.CharSequence r5 = r5.mo15492i()
            L_0x0108:
                java.util.List<com.onedelhi.secure.es2$m$a> r6 = r7.f11598a
                int r6 = r6.size()
                int r6 = r6 - r3
                if (r4 == r6) goto L_0x0116
                java.lang.String r6 = "\n"
                r0.insert(r2, r6)
            L_0x0116:
                r0.insert(r2, r5)
                int r4 = r4 + -1
                goto L_0x00f3
            L_0x011c:
                android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r8 = r8.mo13807a()
                r1.<init>(r8)
                r8 = 0
                android.app.Notification$BigTextStyle r8 = r1.setBigContentTitle(r8)
                r8.bigText(r0)
            L_0x012d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.es2.C2095m.mo15332b(com.onedelhi.secure.bs2):void");
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: g */
        public void mo15333g(@mr2 Bundle bundle) {
            super.mo15333g(bundle);
            bundle.remove(es2.f11359J);
            bundle.remove(es2.f11358I);
            bundle.remove(es2.f11360K);
            bundle.remove(es2.f11364O);
            bundle.remove(es2.f11361L);
            bundle.remove(es2.f11362M);
            bundle.remove(es2.f11363N);
        }

        @mr2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: t */
        public String mo15334t() {
            return f11595a;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: y */
        public void mo15335y(@mr2 Bundle bundle) {
            super.mo15335y(bundle);
            this.f11598a.clear();
            this.f11596a = bundle.containsKey(es2.f11359J) ? s13.m27190b(bundle.getBundle(es2.f11359J)) : new s13.C3467c().mo24166f(bundle.getString(es2.f11358I)).mo24161a();
            CharSequence charSequence = bundle.getCharSequence(es2.f11360K);
            this.f11600c = charSequence;
            if (charSequence == null) {
                this.f11600c = bundle.getCharSequence(es2.f11364O);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(es2.f11361L);
            if (parcelableArray != null) {
                this.f11598a.addAll(C2096a.m14234f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(es2.f11362M);
            if (parcelableArray2 != null) {
                this.f11599b.addAll(C2096a.m14234f(parcelableArray2));
            }
            if (bundle.containsKey(es2.f11363N)) {
                this.f11597a = Boolean.valueOf(bundle.getBoolean(es2.f11363N));
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.es2$n */
    public @interface C2097n {
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.es2$o */
    public @interface C2098o {
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.es2$p */
    public @interface C2099p {
    }

    /* renamed from: com.onedelhi.secure.es2$q */
    public static abstract class C2100q {
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: a */
        public C2087g f11615a;

        /* renamed from: a */
        public CharSequence f11616a;

        /* renamed from: a */
        public boolean f11617a = false;

        /* renamed from: b */
        public CharSequence f11618b;

        /* renamed from: h */
        public static float m14245h(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        @ts2
        /* renamed from: i */
        public static C2100q m14246i(@ts2 String str) {
            if (str == null) {
                return null;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals(C2091i.f11591a)) {
                        c = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals(C2078d.f11487a)) {
                        c = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals(C2094l.f11592a)) {
                        c = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals(C2082e.f11493a)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals(C2095m.f11595a)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C2091i();
                case 1:
                    return new C2078d();
                case 2:
                    return new C2094l();
                case 3:
                    return new C2082e();
                case 4:
                    return new C2095m();
                default:
                    return null;
            }
        }

        @ts2
        /* renamed from: j */
        public static C2100q m14247j(@ts2 String str) {
            if (str == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new C2078d();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new C2082e();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new C2094l();
            }
            if (i >= 24) {
                if (str.equals(Notification.MessagingStyle.class.getName())) {
                    return new C2095m();
                }
                if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                    return new C2091i();
                }
            }
            return null;
        }

        @ts2
        /* renamed from: k */
        public static C2100q m14248k(@mr2 Bundle bundle) {
            C2100q i = m14246i(bundle.getString(es2.f11347C));
            return i != null ? i : (bundle.containsKey(es2.f11358I) || bundle.containsKey(es2.f11359J)) ? new C2095m() : bundle.containsKey(es2.f11434x) ? new C2078d() : bundle.containsKey(es2.f11412m) ? new C2082e() : bundle.containsKey(es2.f11343A) ? new C2094l() : m14247j(bundle.getString(es2.f11345B));
        }

        @ts2
        /* renamed from: l */
        public static C2100q m14249l(@mr2 Bundle bundle) {
            C2100q k = m14248k(bundle);
            if (k == null) {
                return null;
            }
            try {
                k.mo15335y(bundle);
                return k;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @ts2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: s */
        public static C2100q m14250s(@mr2 Notification notification) {
            Bundle n = es2.m13984n(notification);
            if (n == null) {
                return null;
            }
            return m14249l(n);
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: a */
        public void mo15339a(@mr2 Bundle bundle) {
            if (this.f11617a) {
                bundle.putCharSequence(es2.f11410l, this.f11618b);
            }
            CharSequence charSequence = this.f11616a;
            if (charSequence != null) {
                bundle.putCharSequence(es2.f11395g, charSequence);
            }
            String t = mo15334t();
            if (t != null) {
                bundle.putString(es2.f11347C, t);
            }
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: b */
        public void mo15332b(bs2 bs2) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0191  */
        @com.onedelhi.secure.mr2
        @com.onedelhi.secure.hl3({com.onedelhi.secure.hl3.C2354a.f13188c})
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo15497c(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                com.onedelhi.secure.es2$g r0 = r12.f11615a
                android.content.Context r0 = r0.f11516a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                com.onedelhi.secure.es2$g r1 = r12.f11615a
                android.content.Context r1 = r1.f11516a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                com.onedelhi.secure.es2$g r14 = r12.f11615a
                r14.mo15439y()
                int r14 = android.os.Build.VERSION.SDK_INT
                com.onedelhi.secure.es2$g r1 = r12.f11615a
                android.graphics.Bitmap r2 = r1.f11517a
                r8 = 0
                if (r2 == 0) goto L_0x0060
                int r1 = com.onedelhi.secure.nd3.C2969e.icon
                r7.setViewVisibility(r1, r8)
                com.onedelhi.secure.es2$g r2 = r12.f11615a
                android.graphics.Bitmap r2 = r2.f11517a
                r7.setImageViewBitmap(r1, r2)
                if (r13 == 0) goto L_0x0091
                com.onedelhi.secure.es2$g r13 = r12.f11615a
                android.app.Notification r13 = r13.f11530b
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = com.onedelhi.secure.nd3.C2967c.notification_right_icon_size
                int r13 = r0.getDimensionPixelSize(r13)
                int r1 = com.onedelhi.secure.nd3.C2967c.notification_small_icon_background_padding
                int r1 = r0.getDimensionPixelSize(r1)
                int r1 = r1 * 2
                int r1 = r13 - r1
                com.onedelhi.secure.es2$g r2 = r12.f11615a
                android.app.Notification r3 = r2.f11530b
                int r3 = r3.icon
                int r2 = r2.mo15426r()
                android.graphics.Bitmap r13 = r12.mo15505q(r3, r13, r1, r2)
                int r1 = com.onedelhi.secure.nd3.C2969e.right_icon
                r7.setImageViewBitmap(r1, r13)
                r7.setViewVisibility(r1, r8)
                goto L_0x0091
            L_0x0060:
                if (r13 == 0) goto L_0x0091
                android.app.Notification r13 = r1.f11530b
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = com.onedelhi.secure.nd3.C2969e.icon
                r7.setViewVisibility(r13, r8)
                int r1 = com.onedelhi.secure.nd3.C2967c.notification_large_icon_width
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = com.onedelhi.secure.nd3.C2967c.notification_big_circle_margin
                int r2 = r0.getDimensionPixelSize(r2)
                int r1 = r1 - r2
                int r2 = com.onedelhi.secure.nd3.C2967c.notification_small_icon_size_as_large
                int r2 = r0.getDimensionPixelSize(r2)
                com.onedelhi.secure.es2$g r3 = r12.f11615a
                android.app.Notification r4 = r3.f11530b
                int r4 = r4.icon
                int r3 = r3.mo15426r()
                android.graphics.Bitmap r1 = r12.mo15505q(r4, r1, r2, r3)
                r7.setImageViewBitmap(r13, r1)
            L_0x0091:
                com.onedelhi.secure.es2$g r13 = r12.f11615a
                java.lang.CharSequence r13 = r13.f11524a
                if (r13 == 0) goto L_0x009c
                int r1 = com.onedelhi.secure.nd3.C2969e.title
                r7.setTextViewText(r1, r13)
            L_0x009c:
                com.onedelhi.secure.es2$g r13 = r12.f11615a
                java.lang.CharSequence r13 = r13.f11533b
                r9 = 1
                if (r13 == 0) goto L_0x00aa
                int r1 = com.onedelhi.secure.nd3.C2969e.text
                r7.setTextViewText(r1, r13)
                r13 = 1
                goto L_0x00ab
            L_0x00aa:
                r13 = 0
            L_0x00ab:
                com.onedelhi.secure.es2$g r1 = r12.f11615a
                java.lang.CharSequence r2 = r1.f11539c
                r10 = 8
                if (r2 == 0) goto L_0x00be
                int r13 = com.onedelhi.secure.nd3.C2969e.info
                r7.setTextViewText(r13, r2)
            L_0x00b8:
                r7.setViewVisibility(r13, r8)
                r13 = 1
                r11 = 1
                goto L_0x00f5
            L_0x00be:
                int r1 = r1.f11512a
                if (r1 <= 0) goto L_0x00ef
                int r13 = com.onedelhi.secure.nd3.C2970f.status_bar_notification_info_maxnum
                int r13 = r0.getInteger(r13)
                com.onedelhi.secure.es2$g r1 = r12.f11615a
                int r1 = r1.f11512a
                if (r1 <= r13) goto L_0x00da
                int r13 = com.onedelhi.secure.nd3.C2969e.info
                int r1 = com.onedelhi.secure.nd3.C2972h.status_bar_notification_info_overflow
                java.lang.String r1 = r0.getString(r1)
                r7.setTextViewText(r13, r1)
                goto L_0x00ec
            L_0x00da:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r1 = com.onedelhi.secure.nd3.C2969e.info
                com.onedelhi.secure.es2$g r2 = r12.f11615a
                int r2 = r2.f11512a
                long r2 = (long) r2
                java.lang.String r13 = r13.format(r2)
                r7.setTextViewText(r1, r13)
            L_0x00ec:
                int r13 = com.onedelhi.secure.nd3.C2969e.info
                goto L_0x00b8
            L_0x00ef:
                int r1 = com.onedelhi.secure.nd3.C2969e.info
                r7.setViewVisibility(r1, r10)
                r11 = 0
            L_0x00f5:
                com.onedelhi.secure.es2$g r1 = r12.f11615a
                java.lang.CharSequence r1 = r1.f11545d
                if (r1 == 0) goto L_0x0115
                int r2 = com.onedelhi.secure.nd3.C2969e.text
                r7.setTextViewText(r2, r1)
                com.onedelhi.secure.es2$g r1 = r12.f11615a
                java.lang.CharSequence r1 = r1.f11533b
                if (r1 == 0) goto L_0x0110
                int r2 = com.onedelhi.secure.nd3.C2969e.text2
                r7.setTextViewText(r2, r1)
                r7.setViewVisibility(r2, r8)
                r1 = 1
                goto L_0x0116
            L_0x0110:
                int r1 = com.onedelhi.secure.nd3.C2969e.text2
                r7.setViewVisibility(r1, r10)
            L_0x0115:
                r1 = 0
            L_0x0116:
                if (r1 == 0) goto L_0x0130
                if (r15 == 0) goto L_0x0126
                int r15 = com.onedelhi.secure.nd3.C2967c.notification_subtext_size
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = com.onedelhi.secure.nd3.C2969e.text
                r7.setTextViewTextSize(r0, r8, r15)
            L_0x0126:
                int r2 = com.onedelhi.secure.nd3.C2969e.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x0130:
                com.onedelhi.secure.es2$g r15 = r12.f11615a
                long r0 = r15.mo15441z()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0180
                com.onedelhi.secure.es2$g r15 = r12.f11615a
                boolean r15 = r15.f11536b
                if (r15 == 0) goto L_0x016f
                int r15 = com.onedelhi.secure.nd3.C2969e.chronometer
                r7.setViewVisibility(r15, r8)
                com.onedelhi.secure.es2$g r0 = r12.f11615a
                long r0 = r0.mo15441z()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r2 = "setBase"
                r7.setLong(r15, r2, r0)
                java.lang.String r0 = "setStarted"
                r7.setBoolean(r15, r0, r9)
                com.onedelhi.secure.es2$g r0 = r12.f11615a
                boolean r0 = r0.f11542c
                if (r0 == 0) goto L_0x0181
                r1 = 24
                if (r14 < r1) goto L_0x0181
                r7.setChronometerCountDown(r15, r0)
                goto L_0x0181
            L_0x016f:
                int r14 = com.onedelhi.secure.nd3.C2969e.time
                r7.setViewVisibility(r14, r8)
                com.onedelhi.secure.es2$g r15 = r12.f11615a
                long r0 = r15.mo15441z()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
                goto L_0x0181
            L_0x0180:
                r9 = r11
            L_0x0181:
                int r14 = com.onedelhi.secure.nd3.C2969e.right_side
                if (r9 == 0) goto L_0x0187
                r15 = 0
                goto L_0x0189
            L_0x0187:
                r15 = 8
            L_0x0189:
                r7.setViewVisibility(r14, r15)
                int r14 = com.onedelhi.secure.nd3.C2969e.line3
                if (r13 == 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r8 = 8
            L_0x0193:
                r7.setViewVisibility(r14, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.es2.C2100q.mo15497c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @ts2
        /* renamed from: d */
        public Notification mo15498d() {
            C2087g gVar = this.f11615a;
            if (gVar != null) {
                return gVar.mo15406h();
            }
            return null;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: e */
        public void mo15499e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            mo15506u(remoteViews);
            int i = nd3.C2969e.notification_main_column;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(nd3.C2969e.notification_main_column_container, 0, mo15500f(), 0, 0);
        }

        /* renamed from: f */
        public final int mo15500f() {
            Resources resources = this.f11615a.f11516a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(nd3.C2967c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(nd3.C2967c.notification_top_pad_large_text);
            float h = (m14245h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - h) * ((float) dimensionPixelSize)) + (h * ((float) dimensionPixelSize2)));
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: g */
        public void mo15333g(@mr2 Bundle bundle) {
            bundle.remove(es2.f11410l);
            bundle.remove(es2.f11395g);
            bundle.remove(es2.f11347C);
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: m */
        public Bitmap mo15501m(int i, int i2) {
            return mo15502n(i, i2, 0);
        }

        /* renamed from: n */
        public final Bitmap mo15502n(int i, int i2, int i3) {
            return mo15504p(IconCompat.m3653y(this.f11615a.f11516a, i), i2, i3);
        }

        /* renamed from: o */
        public Bitmap mo15503o(@mr2 IconCompat iconCompat, int i) {
            return mo15504p(iconCompat, i, 0);
        }

        /* renamed from: p */
        public final Bitmap mo15504p(@mr2 IconCompat iconCompat, int i, int i2) {
            Drawable H = iconCompat.mo3779H(this.f11615a.f11516a);
            int intrinsicWidth = i2 == 0 ? H.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = H.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            H.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                H.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            H.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: q */
        public final Bitmap mo15505q(int i, int i2, int i3, int i4) {
            int i5 = nd3.C2968d.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap n = mo15502n(i5, i4, i2);
            Canvas canvas = new Canvas(n);
            Drawable mutate = this.f11615a.f11516a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: r */
        public boolean mo15464r() {
            return false;
        }

        @ts2
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: t */
        public String mo15334t() {
            return null;
        }

        /* renamed from: u */
        public final void mo15506u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(nd3.C2969e.title, 8);
            remoteViews.setViewVisibility(nd3.C2969e.text2, 8);
            remoteViews.setViewVisibility(nd3.C2969e.text, 8);
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: v */
        public RemoteViews mo15465v(bs2 bs2) {
            return null;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: w */
        public RemoteViews mo15466w(bs2 bs2) {
            return null;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: x */
        public RemoteViews mo15467x(bs2 bs2) {
            return null;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: y */
        public void mo15335y(@mr2 Bundle bundle) {
            if (bundle.containsKey(es2.f11410l)) {
                this.f11618b = bundle.getCharSequence(es2.f11410l);
                this.f11617a = true;
            }
            this.f11616a = bundle.getCharSequence(es2.f11395g);
        }

        /* renamed from: z */
        public void mo15507z(@ts2 C2087g gVar) {
            if (this.f11615a != gVar) {
                this.f11615a = gVar;
                if (gVar != null) {
                    gVar.mo15442z0(this);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.es2$r */
    public static final class C2101r implements C2092j {

        /* renamed from: A */
        public static final int f11619A = 80;

        /* renamed from: c */
        public static final String f11620c = "android.wearable.EXTENSIONS";

        /* renamed from: d */
        public static final String f11621d = "actions";

        /* renamed from: e */
        public static final String f11622e = "flags";

        /* renamed from: f */
        public static final String f11623f = "displayIntent";

        /* renamed from: g */
        public static final String f11624g = "pages";

        /* renamed from: h */
        public static final String f11625h = "background";

        /* renamed from: i */
        public static final int f11626i = -1;

        /* renamed from: i */
        public static final String f11627i = "contentIcon";
        @Deprecated

        /* renamed from: j */
        public static final int f11628j = 0;

        /* renamed from: j */
        public static final String f11629j = "contentIconGravity";
        @Deprecated

        /* renamed from: k */
        public static final int f11630k = 1;

        /* renamed from: k */
        public static final String f11631k = "contentActionIndex";
        @Deprecated

        /* renamed from: l */
        public static final int f11632l = 2;

        /* renamed from: l */
        public static final String f11633l = "customSizePreset";
        @Deprecated

        /* renamed from: m */
        public static final int f11634m = 3;

        /* renamed from: m */
        public static final String f11635m = "customContentHeight";
        @Deprecated

        /* renamed from: n */
        public static final int f11636n = 4;

        /* renamed from: n */
        public static final String f11637n = "gravity";
        @Deprecated

        /* renamed from: o */
        public static final int f11638o = 5;

        /* renamed from: o */
        public static final String f11639o = "hintScreenTimeout";
        @Deprecated

        /* renamed from: p */
        public static final int f11640p = 0;

        /* renamed from: p */
        public static final String f11641p = "dismissalId";
        @Deprecated

        /* renamed from: q */
        public static final int f11642q = -1;

        /* renamed from: q */
        public static final String f11643q = "bridgeTag";

        /* renamed from: r */
        public static final int f11644r = 1;

        /* renamed from: s */
        public static final int f11645s = 2;

        /* renamed from: t */
        public static final int f11646t = 4;

        /* renamed from: u */
        public static final int f11647u = 8;

        /* renamed from: v */
        public static final int f11648v = 16;

        /* renamed from: w */
        public static final int f11649w = 32;

        /* renamed from: x */
        public static final int f11650x = 64;

        /* renamed from: y */
        public static final int f11651y = 1;

        /* renamed from: z */
        public static final int f11652z = 8388613;

        /* renamed from: a */
        public int f11653a = 1;

        /* renamed from: a */
        public PendingIntent f11654a;

        /* renamed from: a */
        public Bitmap f11655a;

        /* renamed from: a */
        public String f11656a;

        /* renamed from: a */
        public ArrayList<C2072b> f11657a = new ArrayList<>();

        /* renamed from: b */
        public int f11658b;

        /* renamed from: b */
        public String f11659b;

        /* renamed from: b */
        public ArrayList<Notification> f11660b = new ArrayList<>();

        /* renamed from: c */
        public int f11661c = 8388613;

        /* renamed from: d */
        public int f11662d = -1;

        /* renamed from: e */
        public int f11663e = 0;

        /* renamed from: f */
        public int f11664f;

        /* renamed from: g */
        public int f11665g = 80;

        /* renamed from: h */
        public int f11666h;

        public C2101r() {
        }

        public C2101r(@mr2 Notification notification) {
            Bundle n = es2.m13984n(notification);
            Bundle bundle = n != null ? n.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f11621d);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    C2072b[] bVarArr = new C2072b[size];
                    for (int i = 0; i < size; i++) {
                        bVarArr[i] = es2.m13972b((Notification.Action) parcelableArrayList.get(i));
                    }
                    Collections.addAll(this.f11657a, bVarArr);
                }
                this.f11653a = bundle.getInt("flags", 1);
                this.f11654a = (PendingIntent) bundle.getParcelable(f11623f);
                Notification[] u = es2.m13991u(bundle, f11624g);
                if (u != null) {
                    Collections.addAll(this.f11660b, u);
                }
                this.f11655a = (Bitmap) bundle.getParcelable(f11625h);
                this.f11658b = bundle.getInt(f11627i);
                this.f11661c = bundle.getInt(f11629j, 8388613);
                this.f11662d = bundle.getInt(f11631k, -1);
                this.f11663e = bundle.getInt(f11633l, 0);
                this.f11664f = bundle.getInt(f11635m);
                this.f11665g = bundle.getInt(f11637n, 80);
                this.f11666h = bundle.getInt(f11639o);
                this.f11656a = bundle.getString(f11641p);
                this.f11659b = bundle.getString(f11643q);
            }
        }

        @sj3(20)
        /* renamed from: i */
        public static Notification.Action m14271i(C2072b bVar) {
            Notification.Action.Builder builder;
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                IconCompat f = bVar.mo15292f();
                builder = new Notification.Action.Builder(f == null ? null : f.mo3784M(), bVar.mo15296j(), bVar.mo15287a());
            } else {
                IconCompat f2 = bVar.mo15292f();
                builder = new Notification.Action.Builder((f2 == null || f2.mo3776E() != 2) ? 0 : f2.mo3774B(), bVar.mo15296j(), bVar.mo15287a());
            }
            Bundle bundle = bVar.mo15290d() != null ? new Bundle(bVar.mo15290d()) : new Bundle();
            bundle.putBoolean(is2.f13820c, bVar.mo15288b());
            if (i >= 24) {
                builder.setAllowGeneratedReplies(bVar.mo15288b());
            }
            if (i >= 31) {
                builder.setAuthenticationRequired(bVar.mo15297k());
            }
            builder.addExtras(bundle);
            ai3[] g = bVar.mo15293g();
            if (g != null) {
                for (RemoteInput addRemoteInput : ai3.m11185d(g)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            return builder.build();
        }

        @Deprecated
        /* renamed from: A */
        public boolean mo15508A() {
            return (this.f11653a & 4) != 0;
        }

        @mr2
        @Deprecated
        /* renamed from: B */
        public List<Notification> mo15509B() {
            return this.f11660b;
        }

        /* renamed from: C */
        public boolean mo15510C() {
            return (this.f11653a & 8) != 0;
        }

        @mr2
        @Deprecated
        /* renamed from: D */
        public C2101r mo15511D(@ts2 Bitmap bitmap) {
            this.f11655a = bitmap;
            return this;
        }

        @mr2
        /* renamed from: E */
        public C2101r mo15512E(@ts2 String str) {
            this.f11659b = str;
            return this;
        }

        @mr2
        /* renamed from: F */
        public C2101r mo15513F(int i) {
            this.f11662d = i;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: G */
        public C2101r mo15514G(int i) {
            this.f11658b = i;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: H */
        public C2101r mo15515H(int i) {
            this.f11661c = i;
            return this;
        }

        @mr2
        /* renamed from: I */
        public C2101r mo15516I(boolean z) {
            mo15521N(1, z);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: J */
        public C2101r mo15517J(int i) {
            this.f11664f = i;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: K */
        public C2101r mo15518K(int i) {
            this.f11663e = i;
            return this;
        }

        @mr2
        /* renamed from: L */
        public C2101r mo15519L(@ts2 String str) {
            this.f11656a = str;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: M */
        public C2101r mo15520M(@ts2 PendingIntent pendingIntent) {
            this.f11654a = pendingIntent;
            return this;
        }

        /* renamed from: N */
        public final void mo15521N(int i, boolean z) {
            int i2;
            if (z) {
                i2 = i | this.f11653a;
            } else {
                i2 = (~i) & this.f11653a;
            }
            this.f11653a = i2;
        }

        @mr2
        @Deprecated
        /* renamed from: O */
        public C2101r mo15522O(int i) {
            this.f11665g = i;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: P */
        public C2101r mo15523P(boolean z) {
            mo15521N(32, z);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: Q */
        public C2101r mo15524Q(boolean z) {
            mo15521N(16, z);
            return this;
        }

        @mr2
        /* renamed from: R */
        public C2101r mo15525R(boolean z) {
            mo15521N(64, z);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: S */
        public C2101r mo15526S(boolean z) {
            mo15521N(2, z);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: T */
        public C2101r mo15527T(int i) {
            this.f11666h = i;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: U */
        public C2101r mo15528U(boolean z) {
            mo15521N(4, z);
            return this;
        }

        @mr2
        /* renamed from: V */
        public C2101r mo15529V(boolean z) {
            mo15521N(8, z);
            return this;
        }

        @mr2
        /* renamed from: a */
        public C2087g mo15443a(@mr2 C2087g gVar) {
            Bundle bundle = new Bundle();
            if (!this.f11657a.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f11657a.size());
                Iterator<C2072b> it = this.f11657a.iterator();
                while (it.hasNext()) {
                    arrayList.add(m14271i(it.next()));
                }
                bundle.putParcelableArrayList(f11621d, arrayList);
            }
            int i = this.f11653a;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.f11654a;
            if (pendingIntent != null) {
                bundle.putParcelable(f11623f, pendingIntent);
            }
            if (!this.f11660b.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f11660b;
                bundle.putParcelableArray(f11624g, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f11655a;
            if (bitmap != null) {
                bundle.putParcelable(f11625h, bitmap);
            }
            int i2 = this.f11658b;
            if (i2 != 0) {
                bundle.putInt(f11627i, i2);
            }
            int i3 = this.f11661c;
            if (i3 != 8388613) {
                bundle.putInt(f11629j, i3);
            }
            int i4 = this.f11662d;
            if (i4 != -1) {
                bundle.putInt(f11631k, i4);
            }
            int i5 = this.f11663e;
            if (i5 != 0) {
                bundle.putInt(f11633l, i5);
            }
            int i6 = this.f11664f;
            if (i6 != 0) {
                bundle.putInt(f11635m, i6);
            }
            int i7 = this.f11665g;
            if (i7 != 80) {
                bundle.putInt(f11637n, i7);
            }
            int i8 = this.f11666h;
            if (i8 != 0) {
                bundle.putInt(f11639o, i8);
            }
            String str = this.f11656a;
            if (str != null) {
                bundle.putString(f11641p, str);
            }
            String str2 = this.f11659b;
            if (str2 != null) {
                bundle.putString(f11643q, str2);
            }
            gVar.mo15430t().putBundle("android.wearable.EXTENSIONS", bundle);
            return gVar;
        }

        @mr2
        /* renamed from: b */
        public C2101r mo15530b(@mr2 C2072b bVar) {
            this.f11657a.add(bVar);
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2101r mo15531c(@mr2 List<C2072b> list) {
            this.f11657a.addAll(list);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: d */
        public C2101r mo15533d(@mr2 Notification notification) {
            this.f11660b.add(notification);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: e */
        public C2101r mo15534e(@mr2 List<Notification> list) {
            this.f11660b.addAll(list);
            return this;
        }

        @mr2
        /* renamed from: f */
        public C2101r mo15535f() {
            this.f11657a.clear();
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: g */
        public C2101r mo15536g() {
            this.f11660b.clear();
            return this;
        }

        @mr2
        /* renamed from: h */
        public C2101r clone() {
            C2101r rVar = new C2101r();
            rVar.f11657a = new ArrayList<>(this.f11657a);
            rVar.f11653a = this.f11653a;
            rVar.f11654a = this.f11654a;
            rVar.f11660b = new ArrayList<>(this.f11660b);
            rVar.f11655a = this.f11655a;
            rVar.f11658b = this.f11658b;
            rVar.f11661c = this.f11661c;
            rVar.f11662d = this.f11662d;
            rVar.f11663e = this.f11663e;
            rVar.f11664f = this.f11664f;
            rVar.f11665g = this.f11665g;
            rVar.f11666h = this.f11666h;
            rVar.f11656a = this.f11656a;
            rVar.f11659b = this.f11659b;
            return rVar;
        }

        @mr2
        /* renamed from: j */
        public List<C2072b> mo15538j() {
            return this.f11657a;
        }

        @ts2
        @Deprecated
        /* renamed from: k */
        public Bitmap mo15539k() {
            return this.f11655a;
        }

        @ts2
        /* renamed from: l */
        public String mo15540l() {
            return this.f11659b;
        }

        /* renamed from: m */
        public int mo15541m() {
            return this.f11662d;
        }

        @Deprecated
        /* renamed from: n */
        public int mo15542n() {
            return this.f11658b;
        }

        @Deprecated
        /* renamed from: o */
        public int mo15543o() {
            return this.f11661c;
        }

        /* renamed from: p */
        public boolean mo15544p() {
            return (this.f11653a & 1) != 0;
        }

        @Deprecated
        /* renamed from: q */
        public int mo15545q() {
            return this.f11664f;
        }

        @Deprecated
        /* renamed from: r */
        public int mo15546r() {
            return this.f11663e;
        }

        @ts2
        /* renamed from: s */
        public String mo15547s() {
            return this.f11656a;
        }

        @ts2
        @Deprecated
        /* renamed from: t */
        public PendingIntent mo15548t() {
            return this.f11654a;
        }

        @Deprecated
        /* renamed from: u */
        public int mo15549u() {
            return this.f11665g;
        }

        @Deprecated
        /* renamed from: v */
        public boolean mo15550v() {
            return (this.f11653a & 32) != 0;
        }

        @Deprecated
        /* renamed from: w */
        public boolean mo15551w() {
            return (this.f11653a & 16) != 0;
        }

        /* renamed from: x */
        public boolean mo15552x() {
            return (this.f11653a & 64) != 0;
        }

        @Deprecated
        /* renamed from: y */
        public boolean mo15553y() {
            return (this.f11653a & 2) != 0;
        }

        @Deprecated
        /* renamed from: z */
        public int mo15554z() {
            return this.f11666h;
        }
    }

    @ts2
    /* renamed from: A */
    public static String m13963A(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    @sj3(19)
    /* renamed from: B */
    public static boolean m13964B(@mr2 Notification notification) {
        return notification.extras.getBoolean(f11432w);
    }

    @ts2
    /* renamed from: C */
    public static String m13965C(@mr2 Notification notification) {
        return notification.getSortKey();
    }

    @sj3(19)
    @ts2
    /* renamed from: D */
    public static CharSequence m13966D(@mr2 Notification notification) {
        return notification.extras.getCharSequence(f11401i);
    }

    /* renamed from: E */
    public static long m13967E(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    @sj3(19)
    /* renamed from: F */
    public static boolean m13968F(@mr2 Notification notification) {
        return notification.extras.getBoolean(f11426t);
    }

    /* renamed from: G */
    public static int m13969G(@mr2 Notification notification) {
        return notification.visibility;
    }

    /* renamed from: H */
    public static boolean m13970H(@mr2 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @ts2
    /* renamed from: a */
    public static C2072b m13971a(@mr2 Notification notification, int i) {
        return m13972b(notification.actions[i]);
    }

    @mr2
    @sj3(20)
    /* renamed from: b */
    public static C2072b m13972b(@mr2 Notification.Action action) {
        ai3[] ai3Arr;
        int i;
        Notification.Action action2 = action;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        if (remoteInputs == null) {
            ai3Arr = null;
        } else {
            ai3[] ai3Arr2 = new ai3[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                RemoteInput remoteInput = remoteInputs[i2];
                ai3Arr2[i2] = new ai3(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), (Set<String>) null);
            }
            ai3Arr = ai3Arr2;
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean z = i3 >= 24 ? action.getExtras().getBoolean(is2.f13820c) || action.getAllowGeneratedReplies() : action.getExtras().getBoolean(is2.f13820c);
        boolean z2 = action.getExtras().getBoolean(C2072b.f11439a, true);
        int semanticAction = i3 >= 28 ? action.getSemanticAction() : action.getExtras().getInt(C2072b.f11440b, 0);
        boolean isContextual = i3 >= 29 ? action.isContextual() : false;
        boolean isAuthenticationRequired = i3 >= 31 ? action.isAuthenticationRequired() : false;
        if (i3 < 23) {
            return new C2072b(action2.icon, action2.title, action2.actionIntent, action.getExtras(), ai3Arr, (ai3[]) null, z, semanticAction, z2, isContextual, isAuthenticationRequired);
        }
        if (action.getIcon() == null && (i = action2.icon) != 0) {
            return new C2072b(i, action2.title, action2.actionIntent, action.getExtras(), ai3Arr, (ai3[]) null, z, semanticAction, z2, isContextual, isAuthenticationRequired);
        }
        if (action.getIcon() != null) {
            iconCompat = IconCompat.m3644p(action.getIcon());
        }
        return new C2072b(iconCompat, action2.title, action2.actionIntent, action.getExtras(), ai3Arr, (ai3[]) null, z, semanticAction, z2, isContextual, isAuthenticationRequired);
    }

    /* renamed from: c */
    public static int m13973c(@mr2 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m13974d(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m13975e(@mr2 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    /* renamed from: f */
    public static int m13976f(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    @ts2
    /* renamed from: g */
    public static C2083f m13977g(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C2083f.m14061a(notification.getBubbleMetadata());
        }
        return null;
    }

    @ts2
    /* renamed from: h */
    public static String m13978h(@mr2 Notification notification) {
        return notification.category;
    }

    @ts2
    /* renamed from: i */
    public static String m13979i(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    /* renamed from: j */
    public static int m13980j(@mr2 Notification notification) {
        return notification.color;
    }

    @sj3(19)
    @ts2
    /* renamed from: k */
    public static CharSequence m13981k(@mr2 Notification notification) {
        return notification.extras.getCharSequence(f11407k);
    }

    @sj3(19)
    @ts2
    /* renamed from: l */
    public static CharSequence m13982l(@mr2 Notification notification) {
        return notification.extras.getCharSequence(f11398h);
    }

    @sj3(19)
    @ts2
    /* renamed from: m */
    public static CharSequence m13983m(@mr2 Notification notification) {
        return notification.extras.getCharSequence(f11392f);
    }

    @ts2
    /* renamed from: n */
    public static Bundle m13984n(@mr2 Notification notification) {
        return notification.extras;
    }

    @ts2
    /* renamed from: o */
    public static String m13985o(@mr2 Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: p */
    public static int m13986p(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: q */
    public static boolean m13987q(@mr2 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @mr2
    @sj3(21)
    /* renamed from: r */
    public static List<C2072b> m13988r(@mr2 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(C2088h.f11562a);
        if (!(bundle2 == null || (bundle = bundle2.getBundle(C2088h.f11566e)) == null)) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(is2.m17822g(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public static boolean m13989s(@mr2 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @ts2
    /* renamed from: t */
    public static t82 m13990t(@mr2 Notification notification) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT < 29 || (locusId = notification.getLocusId()) == null) {
            return null;
        }
        return t82.m28194d(locusId);
    }

    @mr2
    /* renamed from: u */
    public static Notification[] m13991u(@mr2 Bundle bundle, @mr2 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    /* renamed from: v */
    public static boolean m13992v(@mr2 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    /* renamed from: w */
    public static boolean m13993w(@mr2 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @mr2
    /* renamed from: x */
    public static List<s13> m13994x(@mr2 Notification notification) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = notification.extras;
        if (i >= 28) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f11351E);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(s13.m27189a((Person) it.next()));
                }
            }
        } else {
            String[] stringArray = bundle.getStringArray(f11349D);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String g : stringArray) {
                    arrayList.add(new s13.C3467c().mo24167g(g).mo24161a());
                }
            }
        }
        return arrayList;
    }

    @ts2
    /* renamed from: y */
    public static Notification m13995y(@mr2 Notification notification) {
        return notification.publicVersion;
    }

    @ts2
    /* renamed from: z */
    public static CharSequence m13996z(@mr2 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }
}
