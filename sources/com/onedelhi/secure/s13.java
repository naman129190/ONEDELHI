package com.onedelhi.secure;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.hl3;

public class s13 {

    /* renamed from: c */
    public static final String f20168c = "name";

    /* renamed from: d */
    public static final String f20169d = "icon";

    /* renamed from: e */
    public static final String f20170e = "uri";

    /* renamed from: f */
    public static final String f20171f = "key";

    /* renamed from: g */
    public static final String f20172g = "isBot";

    /* renamed from: h */
    public static final String f20173h = "isImportant";
    @ts2

    /* renamed from: a */
    public IconCompat f20174a;
    @ts2

    /* renamed from: a */
    public CharSequence f20175a;
    @ts2

    /* renamed from: a */
    public String f20176a;

    /* renamed from: a */
    public boolean f20177a;
    @ts2

    /* renamed from: b */
    public String f20178b;

    /* renamed from: b */
    public boolean f20179b;

    @sj3(22)
    /* renamed from: com.onedelhi.secure.s13$a */
    public static class C3465a {
        @pn0
        /* renamed from: a */
        public static s13 m27203a(PersistableBundle persistableBundle) {
            return new C3467c().mo24166f(persistableBundle.getString("name")).mo24167g(persistableBundle.getString("uri")).mo24165e(persistableBundle.getString("key")).mo24162b(persistableBundle.getBoolean(s13.f20172g)).mo24164d(persistableBundle.getBoolean(s13.f20173h)).mo24161a();
        }

        @pn0
        /* renamed from: b */
        public static PersistableBundle m27204b(s13 s13) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = s13.f20175a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", s13.f20176a);
            persistableBundle.putString("key", s13.f20178b);
            persistableBundle.putBoolean(s13.f20172g, s13.f20177a);
            persistableBundle.putBoolean(s13.f20173h, s13.f20179b);
            return persistableBundle;
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.s13$b */
    public static class C3466b {
        @pn0
        /* renamed from: a */
        public static s13 m27205a(Person person) {
            return new C3467c().mo24166f(person.getName()).mo24163c(person.getIcon() != null ? IconCompat.m3643o(person.getIcon()) : null).mo24167g(person.getUri()).mo24165e(person.getKey()).mo24162b(person.isBot()).mo24164d(person.isImportant()).mo24161a();
        }

        @pn0
        /* renamed from: b */
        public static Person m27206b(s13 s13) {
            return new Person.Builder().setName(s13.mo24152f()).setIcon(s13.mo24150d() != null ? s13.mo24150d().mo3784M() : null).setUri(s13.mo24153g()).setKey(s13.mo24151e()).setBot(s13.mo24154h()).setImportant(s13.mo24155i()).build();
        }
    }

    /* renamed from: com.onedelhi.secure.s13$c */
    public static class C3467c {
        @ts2

        /* renamed from: a */
        public IconCompat f20180a;
        @ts2

        /* renamed from: a */
        public CharSequence f20181a;
        @ts2

        /* renamed from: a */
        public String f20182a;

        /* renamed from: a */
        public boolean f20183a;
        @ts2

        /* renamed from: b */
        public String f20184b;

        /* renamed from: b */
        public boolean f20185b;

        public C3467c() {
        }

        public C3467c(s13 s13) {
            this.f20181a = s13.f20175a;
            this.f20180a = s13.f20174a;
            this.f20182a = s13.f20176a;
            this.f20184b = s13.f20178b;
            this.f20183a = s13.f20177a;
            this.f20185b = s13.f20179b;
        }

        @mr2
        /* renamed from: a */
        public s13 mo24161a() {
            return new s13(this);
        }

        @mr2
        /* renamed from: b */
        public C3467c mo24162b(boolean z) {
            this.f20183a = z;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3467c mo24163c(@ts2 IconCompat iconCompat) {
            this.f20180a = iconCompat;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3467c mo24164d(boolean z) {
            this.f20185b = z;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3467c mo24165e(@ts2 String str) {
            this.f20184b = str;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C3467c mo24166f(@ts2 CharSequence charSequence) {
            this.f20181a = charSequence;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C3467c mo24167g(@ts2 String str) {
            this.f20182a = str;
            return this;
        }
    }

    public s13(C3467c cVar) {
        this.f20175a = cVar.f20181a;
        this.f20174a = cVar.f20180a;
        this.f20176a = cVar.f20182a;
        this.f20178b = cVar.f20184b;
        this.f20177a = cVar.f20183a;
        this.f20179b = cVar.f20185b;
    }

    @mr2
    @sj3(28)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static s13 m27189a(@mr2 Person person) {
        return C3466b.m27205a(person);
    }

    @mr2
    /* renamed from: b */
    public static s13 m27190b(@mr2 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new C3467c().mo24166f(bundle.getCharSequence("name")).mo24163c(bundle2 != null ? IconCompat.m3641m(bundle2) : null).mo24167g(bundle.getString("uri")).mo24165e(bundle.getString("key")).mo24162b(bundle.getBoolean(f20172g)).mo24164d(bundle.getBoolean(f20173h)).mo24161a();
    }

    @mr2
    @sj3(22)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public static s13 m27191c(@mr2 PersistableBundle persistableBundle) {
        return C3465a.m27203a(persistableBundle);
    }

    @ts2
    /* renamed from: d */
    public IconCompat mo24150d() {
        return this.f20174a;
    }

    @ts2
    /* renamed from: e */
    public String mo24151e() {
        return this.f20178b;
    }

    @ts2
    /* renamed from: f */
    public CharSequence mo24152f() {
        return this.f20175a;
    }

    @ts2
    /* renamed from: g */
    public String mo24153g() {
        return this.f20176a;
    }

    /* renamed from: h */
    public boolean mo24154h() {
        return this.f20177a;
    }

    /* renamed from: i */
    public boolean mo24155i() {
        return this.f20179b;
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public String mo24156j() {
        String str = this.f20176a;
        if (str != null) {
            return str;
        }
        if (this.f20175a == null) {
            return "";
        }
        return "name:" + this.f20175a;
    }

    @mr2
    @sj3(28)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public Person mo24157k() {
        return C3466b.m27206b(this);
    }

    @mr2
    /* renamed from: l */
    public C3467c mo24158l() {
        return new C3467c(this);
    }

    @mr2
    /* renamed from: m */
    public Bundle mo24159m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f20175a);
        IconCompat iconCompat = this.f20174a;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.mo3786a() : null);
        bundle.putString("uri", this.f20176a);
        bundle.putString("key", this.f20178b);
        bundle.putBoolean(f20172g, this.f20177a);
        bundle.putBoolean(f20173h, this.f20179b);
        return bundle;
    }

    @mr2
    @sj3(22)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: n */
    public PersistableBundle mo24160n() {
        return C3465a.m27204b(this);
    }
}
