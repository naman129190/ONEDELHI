package com.onedelhi.secure;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public final class b70 {

    /* renamed from: a */
    public static final int f9691a = 0;

    /* renamed from: b */
    public static final int f9692b = 1;

    /* renamed from: c */
    public static final int f9693c = 2;

    /* renamed from: d */
    public static final int f9694d = 3;

    /* renamed from: e */
    public static final int f9695e = 4;

    /* renamed from: f */
    public static final int f9696f = 5;

    /* renamed from: g */
    public static final int f9697g = 1;
    @mr2

    /* renamed from: a */
    public final C1759g f9698a;

    @sj3(31)
    /* renamed from: com.onedelhi.secure.b70$a */
    public static final class C1753a {
        @mr2
        @pn0
        /* renamed from: a */
        public static Pair<ContentInfo, ContentInfo> m11605a(@mr2 ContentInfo contentInfo, @mr2 Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> h = b70.m11594h(clip, new a70(predicate));
            return h.first == null ? Pair.create((Object) null, contentInfo) : h.second == null ? Pair.create(contentInfo, (Object) null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) h.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) h.second).build());
        }
    }

    /* renamed from: com.onedelhi.secure.b70$b */
    public static final class C1754b {
        @mr2

        /* renamed from: a */
        public final C1756d f9699a;

        public C1754b(@mr2 ClipData clipData, int i) {
            this.f9699a = Build.VERSION.SDK_INT >= 31 ? new C1755c(clipData, i) : new C1757e(clipData, i);
        }

        public C1754b(@mr2 b70 b70) {
            this.f9699a = Build.VERSION.SDK_INT >= 31 ? new C1755c(b70) : new C1757e(b70);
        }

        @mr2
        /* renamed from: a */
        public b70 mo13491a() {
            return this.f9699a.mo13498b();
        }

        @mr2
        /* renamed from: b */
        public C1754b mo13492b(@mr2 ClipData clipData) {
            this.f9699a.mo13499c(clipData);
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1754b mo13493c(@ts2 Bundle bundle) {
            this.f9699a.setExtras(bundle);
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1754b mo13494d(int i) {
            this.f9699a.mo13500d(i);
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1754b mo13495e(@ts2 Uri uri) {
            this.f9699a.mo13497a(uri);
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1754b mo13496f(int i) {
            this.f9699a.mo13501e(i);
            return this;
        }
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.b70$c */
    public static final class C1755c implements C1756d {
        @mr2

        /* renamed from: a */
        public final ContentInfo.Builder f9700a;

        public C1755c(@mr2 ClipData clipData, int i) {
            this.f9700a = new ContentInfo.Builder(clipData, i);
        }

        public C1755c(@mr2 b70 b70) {
            this.f9700a = new ContentInfo.Builder(b70.mo13489l());
        }

        /* renamed from: a */
        public void mo13497a(@ts2 Uri uri) {
            this.f9700a.setLinkUri(uri);
        }

        @mr2
        /* renamed from: b */
        public b70 mo13498b() {
            return new b70(new C1758f(this.f9700a.build()));
        }

        /* renamed from: c */
        public void mo13499c(@mr2 ClipData clipData) {
            this.f9700a.setClip(clipData);
        }

        /* renamed from: d */
        public void mo13500d(int i) {
            this.f9700a.setFlags(i);
        }

        /* renamed from: e */
        public void mo13501e(int i) {
            this.f9700a.setSource(i);
        }

        public void setExtras(@ts2 Bundle bundle) {
            this.f9700a.setExtras(bundle);
        }
    }

    /* renamed from: com.onedelhi.secure.b70$d */
    public interface C1756d {
        /* renamed from: a */
        void mo13497a(@ts2 Uri uri);

        @mr2
        /* renamed from: b */
        b70 mo13498b();

        /* renamed from: c */
        void mo13499c(@mr2 ClipData clipData);

        /* renamed from: d */
        void mo13500d(int i);

        /* renamed from: e */
        void mo13501e(int i);

        void setExtras(@ts2 Bundle bundle);
    }

    /* renamed from: com.onedelhi.secure.b70$e */
    public static final class C1757e implements C1756d {

        /* renamed from: a */
        public int f9701a;
        @mr2

        /* renamed from: a */
        public ClipData f9702a;
        @ts2

        /* renamed from: a */
        public Uri f9703a;
        @ts2

        /* renamed from: a */
        public Bundle f9704a;

        /* renamed from: b */
        public int f9705b;

        public C1757e(@mr2 ClipData clipData, int i) {
            this.f9702a = clipData;
            this.f9701a = i;
        }

        public C1757e(@mr2 b70 b70) {
            this.f9702a = b70.mo13483c();
            this.f9701a = b70.mo13487g();
            this.f9705b = b70.mo13485e();
            this.f9703a = b70.mo13486f();
            this.f9704a = b70.mo13484d();
        }

        /* renamed from: a */
        public void mo13497a(@ts2 Uri uri) {
            this.f9703a = uri;
        }

        @mr2
        /* renamed from: b */
        public b70 mo13498b() {
            return new b70(new C1760h(this));
        }

        /* renamed from: c */
        public void mo13499c(@mr2 ClipData clipData) {
            this.f9702a = clipData;
        }

        /* renamed from: d */
        public void mo13500d(int i) {
            this.f9705b = i;
        }

        /* renamed from: e */
        public void mo13501e(int i) {
            this.f9701a = i;
        }

        public void setExtras(@ts2 Bundle bundle) {
            this.f9704a = bundle;
        }
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.b70$f */
    public static final class C1758f implements C1759g {
        @mr2

        /* renamed from: a */
        public final ContentInfo f9706a;

        public C1758f(@mr2 ContentInfo contentInfo) {
            this.f9706a = (ContentInfo) k43.m19455l(contentInfo);
        }

        @ts2
        /* renamed from: a */
        public Uri mo13503a() {
            return this.f9706a.getLinkUri();
        }

        /* renamed from: b */
        public int mo13504b() {
            return this.f9706a.getFlags();
        }

        /* renamed from: c */
        public int mo13505c() {
            return this.f9706a.getSource();
        }

        @mr2
        /* renamed from: d */
        public ContentInfo mo13506d() {
            return this.f9706a;
        }

        @mr2
        /* renamed from: e */
        public ClipData mo13507e() {
            return this.f9706a.getClip();
        }

        @ts2
        public Bundle getExtras() {
            return this.f9706a.getExtras();
        }

        @mr2
        public String toString() {
            return "ContentInfoCompat{" + this.f9706a + "}";
        }
    }

    /* renamed from: com.onedelhi.secure.b70$g */
    public interface C1759g {
        @ts2
        /* renamed from: a */
        Uri mo13503a();

        /* renamed from: b */
        int mo13504b();

        /* renamed from: c */
        int mo13505c();

        @ts2
        /* renamed from: d */
        ContentInfo mo13506d();

        @mr2
        /* renamed from: e */
        ClipData mo13507e();

        @ts2
        Bundle getExtras();
    }

    /* renamed from: com.onedelhi.secure.b70$h */
    public static final class C1760h implements C1759g {

        /* renamed from: a */
        public final int f9707a;
        @mr2

        /* renamed from: a */
        public final ClipData f9708a;
        @ts2

        /* renamed from: a */
        public final Uri f9709a;
        @ts2

        /* renamed from: a */
        public final Bundle f9710a;

        /* renamed from: b */
        public final int f9711b;

        public C1760h(C1757e eVar) {
            this.f9708a = (ClipData) k43.m19455l(eVar.f9702a);
            this.f9707a = k43.m19450g(eVar.f9701a, 0, 5, "source");
            this.f9711b = k43.m19454k(eVar.f9705b, 1);
            this.f9709a = eVar.f9703a;
            this.f9710a = eVar.f9704a;
        }

        @ts2
        /* renamed from: a */
        public Uri mo13503a() {
            return this.f9709a;
        }

        /* renamed from: b */
        public int mo13504b() {
            return this.f9711b;
        }

        /* renamed from: c */
        public int mo13505c() {
            return this.f9707a;
        }

        @ts2
        /* renamed from: d */
        public ContentInfo mo13506d() {
            return null;
        }

        @mr2
        /* renamed from: e */
        public ClipData mo13507e() {
            return this.f9708a;
        }

        @ts2
        public Bundle getExtras() {
            return this.f9710a;
        }

        @mr2
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f9708a.getDescription());
            sb.append(", source=");
            sb.append(b70.m11596k(this.f9707a));
            sb.append(", flags=");
            sb.append(b70.m11593b(this.f9711b));
            String str2 = "";
            if (this.f9709a == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f9709a.toString().length() + pl2.f33727d;
            }
            sb.append(str);
            if (this.f9710a != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.b70$i */
    public @interface C1761i {
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.b70$j */
    public @interface C1762j {
    }

    public b70(@mr2 C1759g gVar) {
        this.f9698a = gVar;
    }

    @mr2
    /* renamed from: a */
    public static ClipData m11592a(@mr2 ClipDescription clipDescription, @mr2 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    @mr2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: b */
    public static String m11593b(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    @mr2
    /* renamed from: h */
    public static Pair<ClipData, ClipData> m11594h(@mr2 ClipData clipData, @mr2 o43<ClipData.Item> o43) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (o43.mo21599a(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create((Object) null, clipData) : arrayList2 == null ? Pair.create(clipData, (Object) null) : Pair.create(m11592a(clipData.getDescription(), arrayList), m11592a(clipData.getDescription(), arrayList2));
    }

    @mr2
    @sj3(31)
    /* renamed from: i */
    public static Pair<ContentInfo, ContentInfo> m11595i(@mr2 ContentInfo contentInfo, @mr2 Predicate<ClipData.Item> predicate) {
        return C1753a.m11605a(contentInfo, predicate);
    }

    @mr2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: k */
    public static String m11596k(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @mr2
    @sj3(31)
    /* renamed from: m */
    public static b70 m11597m(@mr2 ContentInfo contentInfo) {
        return new b70(new C1758f(contentInfo));
    }

    @mr2
    /* renamed from: c */
    public ClipData mo13483c() {
        return this.f9698a.mo13507e();
    }

    @ts2
    /* renamed from: d */
    public Bundle mo13484d() {
        return this.f9698a.getExtras();
    }

    /* renamed from: e */
    public int mo13485e() {
        return this.f9698a.mo13504b();
    }

    @ts2
    /* renamed from: f */
    public Uri mo13486f() {
        return this.f9698a.mo13503a();
    }

    /* renamed from: g */
    public int mo13487g() {
        return this.f9698a.mo13505c();
    }

    @mr2
    /* renamed from: j */
    public Pair<b70, b70> mo13488j(@mr2 o43<ClipData.Item> o43) {
        ClipData e = this.f9698a.mo13507e();
        b70 b70 = null;
        if (e.getItemCount() == 1) {
            boolean a = o43.mo21599a(e.getItemAt(0));
            b70 b702 = a ? this : null;
            if (!a) {
                b70 = this;
            }
            return Pair.create(b702, b70);
        }
        Pair<ClipData, ClipData> h = m11594h(e, o43);
        return h.first == null ? Pair.create((Object) null, this) : h.second == null ? Pair.create(this, (Object) null) : Pair.create(new C1754b(this).mo13492b((ClipData) h.first).mo13491a(), new C1754b(this).mo13492b((ClipData) h.second).mo13491a());
    }

    @mr2
    @sj3(31)
    /* renamed from: l */
    public ContentInfo mo13489l() {
        ContentInfo d = this.f9698a.mo13506d();
        Objects.requireNonNull(d);
        ContentInfo contentInfo = d;
        return d;
    }

    @mr2
    public String toString() {
        return this.f9698a.toString();
    }
}
