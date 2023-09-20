package com.onedelhi.secure;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;

public final class ox3 {

    /* renamed from: a */
    public static final String f18177a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b */
    public static final String f18178b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c */
    public static final String f18179c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d */
    public static final String f18180d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e */
    public static final String f18181e = ".sharecompat_";

    @sj3(16)
    /* renamed from: com.onedelhi.secure.ox3$a */
    public static class C3102a {
        @pn0
        /* renamed from: a */
        public static String m24172a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @pn0
        /* renamed from: b */
        public static void m24173b(@mr2 Intent intent, @mr2 ArrayList<Uri> arrayList) {
            CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT");
            String stringExtra = intent.getStringExtra(qs1.f19447b);
            ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(charSequenceExtra, stringExtra, (Intent) null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @pn0
        /* renamed from: c */
        public static void m24174c(@mr2 Intent intent) {
            intent.setClipData((ClipData) null);
            intent.setFlags(intent.getFlags() & -2);
        }
    }

    /* renamed from: com.onedelhi.secure.ox3$b */
    public static class C3103b {
        @mr2

        /* renamed from: a */
        public final Context f18182a;
        @mr2

        /* renamed from: a */
        public final Intent f18183a;
        @ts2

        /* renamed from: a */
        public CharSequence f18184a;
        @ts2

        /* renamed from: a */
        public ArrayList<String> f18185a;
        @ts2

        /* renamed from: b */
        public ArrayList<String> f18186b;
        @ts2

        /* renamed from: c */
        public ArrayList<String> f18187c;
        @ts2

        /* renamed from: d */
        public ArrayList<Uri> f18188d;

        public C3103b(@mr2 Context context) {
            Activity activity;
            this.f18182a = (Context) k43.m19455l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f18183a = action;
            action.putExtra(ox3.f18177a, context.getPackageName());
            action.putExtra(ox3.f18178b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f18183a.putExtra(ox3.f18179c, componentName);
                this.f18183a.putExtra(ox3.f18180d, componentName);
            }
        }

        @mr2
        @Deprecated
        /* renamed from: k */
        public static C3103b m24175k(@mr2 Activity activity) {
            return new C3103b(activity);
        }

        @mr2
        /* renamed from: a */
        public C3103b mo22130a(@mr2 String str) {
            if (this.f18187c == null) {
                this.f18187c = new ArrayList<>();
            }
            this.f18187c.add(str);
            return this;
        }

        @mr2
        /* renamed from: b */
        public C3103b mo22131b(@mr2 String[] strArr) {
            mo22138i("android.intent.extra.BCC", strArr);
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3103b mo22132c(@mr2 String str) {
            if (this.f18186b == null) {
                this.f18186b = new ArrayList<>();
            }
            this.f18186b.add(str);
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3103b mo22133d(@mr2 String[] strArr) {
            mo22138i("android.intent.extra.CC", strArr);
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3103b mo22134e(@mr2 String str) {
            if (this.f18185a == null) {
                this.f18185a = new ArrayList<>();
            }
            this.f18185a.add(str);
            return this;
        }

        @mr2
        /* renamed from: f */
        public C3103b mo22135f(@mr2 String[] strArr) {
            mo22138i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @mr2
        /* renamed from: g */
        public C3103b mo22136g(@mr2 Uri uri) {
            if (this.f18188d == null) {
                this.f18188d = new ArrayList<>();
            }
            this.f18188d.add(uri);
            return this;
        }

        /* renamed from: h */
        public final void mo22137h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f18183a.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f18183a.putExtra(str, strArr);
        }

        /* renamed from: i */
        public final void mo22138i(@ts2 String str, @mr2 String[] strArr) {
            Intent m = mo22141m();
            String[] stringArrayExtra = m.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[(strArr.length + length)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            m.putExtra(str, strArr2);
        }

        @mr2
        /* renamed from: j */
        public Intent mo22139j() {
            return Intent.createChooser(mo22141m(), this.f18184a);
        }

        @mr2
        /* renamed from: l */
        public Context mo22140l() {
            return this.f18182a;
        }

        @mr2
        /* renamed from: m */
        public Intent mo22141m() {
            ArrayList<String> arrayList = this.f18185a;
            if (arrayList != null) {
                mo22137h("android.intent.extra.EMAIL", arrayList);
                this.f18185a = null;
            }
            ArrayList<String> arrayList2 = this.f18186b;
            if (arrayList2 != null) {
                mo22137h("android.intent.extra.CC", arrayList2);
                this.f18186b = null;
            }
            ArrayList<String> arrayList3 = this.f18187c;
            if (arrayList3 != null) {
                mo22137h("android.intent.extra.BCC", arrayList3);
                this.f18187c = null;
            }
            ArrayList<Uri> arrayList4 = this.f18188d;
            boolean z = true;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                z = false;
            }
            if (!z) {
                this.f18183a.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f18188d;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f18183a.removeExtra("android.intent.extra.STREAM");
                    C3102a.m24174c(this.f18183a);
                    return this.f18183a;
                }
                this.f18183a.putExtra("android.intent.extra.STREAM", this.f18188d.get(0));
            } else {
                this.f18183a.setAction("android.intent.action.SEND_MULTIPLE");
                this.f18183a.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f18188d);
            }
            C3102a.m24173b(this.f18183a, this.f18188d);
            return this.f18183a;
        }

        @mr2
        /* renamed from: n */
        public C3103b mo22142n(@e54 int i) {
            return mo22143o(this.f18182a.getText(i));
        }

        @mr2
        /* renamed from: o */
        public C3103b mo22143o(@ts2 CharSequence charSequence) {
            this.f18184a = charSequence;
            return this;
        }

        @mr2
        /* renamed from: p */
        public C3103b mo22144p(@ts2 String[] strArr) {
            this.f18183a.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @mr2
        /* renamed from: q */
        public C3103b mo22145q(@ts2 String[] strArr) {
            this.f18183a.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @mr2
        /* renamed from: r */
        public C3103b mo22146r(@ts2 String[] strArr) {
            if (this.f18185a != null) {
                this.f18185a = null;
            }
            this.f18183a.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @mr2
        /* renamed from: s */
        public C3103b mo22147s(@ts2 String str) {
            this.f18183a.putExtra(qs1.f19447b, str);
            if (!this.f18183a.hasExtra("android.intent.extra.TEXT")) {
                mo22150v(Html.fromHtml(str));
            }
            return this;
        }

        @mr2
        /* renamed from: t */
        public C3103b mo22148t(@ts2 Uri uri) {
            this.f18188d = null;
            if (uri != null) {
                mo22136g(uri);
            }
            return this;
        }

        @mr2
        /* renamed from: u */
        public C3103b mo22149u(@ts2 String str) {
            this.f18183a.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @mr2
        /* renamed from: v */
        public C3103b mo22150v(@ts2 CharSequence charSequence) {
            this.f18183a.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @mr2
        /* renamed from: w */
        public C3103b mo22151w(@ts2 String str) {
            this.f18183a.setType(str);
            return this;
        }

        /* renamed from: x */
        public void mo22152x() {
            this.f18182a.startActivity(mo22139j());
        }
    }

    /* renamed from: com.onedelhi.secure.ox3$c */
    public static class C3104c {

        /* renamed from: b */
        public static final String f18189b = "IntentReader";
        @ts2

        /* renamed from: a */
        public final ComponentName f18190a;
        @mr2

        /* renamed from: a */
        public final Context f18191a;
        @mr2

        /* renamed from: a */
        public final Intent f18192a;
        @ts2

        /* renamed from: a */
        public final String f18193a;
        @ts2

        /* renamed from: a */
        public ArrayList<Uri> f18194a;

        public C3104c(@mr2 Activity activity) {
            this((Context) k43.m19455l(activity), activity.getIntent());
        }

        public C3104c(@mr2 Context context, @mr2 Intent intent) {
            this.f18191a = (Context) k43.m19455l(context);
            this.f18192a = (Intent) k43.m19455l(intent);
            this.f18193a = ox3.m24171f(intent);
            this.f18190a = ox3.m24169d(intent);
        }

        @mr2
        @Deprecated
        /* renamed from: a */
        public static C3104c m24199a(@mr2 Activity activity) {
            return new C3104c(activity);
        }

        /* renamed from: t */
        public static void m24200t(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            String str;
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '<') {
                    str = "&lt;";
                } else if (charAt == '>') {
                    str = "&gt;";
                } else if (charAt == '&') {
                    str = "&amp;";
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#");
                    sb.append(charAt);
                    str = ";";
                } else {
                    if (charAt == ' ') {
                        while (true) {
                            int i3 = i + 1;
                            if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                                sb.append(' ');
                            } else {
                                sb.append("&nbsp;");
                                i = i3;
                            }
                        }
                        sb.append(' ');
                    } else {
                        sb.append(charAt);
                    }
                    i++;
                }
                sb.append(str);
                i++;
            }
        }

        @ts2
        /* renamed from: b */
        public ComponentName mo22153b() {
            return this.f18190a;
        }

        @ts2
        /* renamed from: c */
        public Drawable mo22154c() {
            if (this.f18190a == null) {
                return null;
            }
            try {
                return this.f18191a.getPackageManager().getActivityIcon(this.f18190a);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f18189b, "Could not retrieve icon for calling activity", e);
                return null;
            }
        }

        @ts2
        /* renamed from: d */
        public Drawable mo22155d() {
            if (this.f18193a == null) {
                return null;
            }
            try {
                return this.f18191a.getPackageManager().getApplicationIcon(this.f18193a);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f18189b, "Could not retrieve icon for calling application", e);
                return null;
            }
        }

        @ts2
        /* renamed from: e */
        public CharSequence mo22156e() {
            if (this.f18193a == null) {
                return null;
            }
            PackageManager packageManager = this.f18191a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f18193a, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f18189b, "Could not retrieve label for calling application", e);
                return null;
            }
        }

        @ts2
        /* renamed from: f */
        public String mo22157f() {
            return this.f18193a;
        }

        @ts2
        /* renamed from: g */
        public String[] mo22158g() {
            return this.f18192a.getStringArrayExtra("android.intent.extra.BCC");
        }

        @ts2
        /* renamed from: h */
        public String[] mo22159h() {
            return this.f18192a.getStringArrayExtra("android.intent.extra.CC");
        }

        @ts2
        /* renamed from: i */
        public String[] mo22160i() {
            return this.f18192a.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @ts2
        /* renamed from: j */
        public String mo22161j() {
            String stringExtra = this.f18192a.getStringExtra(qs1.f19447b);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence o = mo22166o();
            return o instanceof Spanned ? Html.toHtml((Spanned) o) : o != null ? C3102a.m24172a(o) : stringExtra;
        }

        @ts2
        /* renamed from: k */
        public Uri mo22162k() {
            return (Uri) this.f18192a.getParcelableExtra("android.intent.extra.STREAM");
        }

        @ts2
        /* renamed from: l */
        public Uri mo22163l(int i) {
            Object parcelableExtra;
            if (this.f18194a == null && mo22168q()) {
                this.f18194a = this.f18192a.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.f18194a;
            if (arrayList != null) {
                parcelableExtra = arrayList.get(i);
            } else if (i == 0) {
                parcelableExtra = this.f18192a.getParcelableExtra("android.intent.extra.STREAM");
            } else {
                throw new IndexOutOfBoundsException("Stream items available: " + mo22164m() + " index requested: " + i);
            }
            return (Uri) parcelableExtra;
        }

        /* renamed from: m */
        public int mo22164m() {
            if (this.f18194a == null && mo22168q()) {
                this.f18194a = this.f18192a.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f18194a;
            return arrayList != null ? arrayList.size() : this.f18192a.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @ts2
        /* renamed from: n */
        public String mo22165n() {
            return this.f18192a.getStringExtra("android.intent.extra.SUBJECT");
        }

        @ts2
        /* renamed from: o */
        public CharSequence mo22166o() {
            return this.f18192a.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @ts2
        /* renamed from: p */
        public String mo22167p() {
            return this.f18192a.getType();
        }

        /* renamed from: q */
        public boolean mo22168q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f18192a.getAction());
        }

        /* renamed from: r */
        public boolean mo22169r() {
            String action = this.f18192a.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        /* renamed from: s */
        public boolean mo22170s() {
            return "android.intent.action.SEND".equals(this.f18192a.getAction());
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m24166a(@mr2 Menu menu, @mo1 int i, @mr2 C3103b bVar) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            m24167b(findItem, bVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
    }

    @Deprecated
    /* renamed from: b */
    public static void m24167b(@mr2 MenuItem menuItem, @mr2 C3103b bVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(bVar.mo22140l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f18181e + bVar.mo22140l().getClass().getName());
        shareActionProvider.setShareIntent(bVar.mo22141m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @ts2
    /* renamed from: c */
    public static ComponentName m24168c(@mr2 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? m24169d(intent) : callingActivity;
    }

    @ts2
    /* renamed from: d */
    public static ComponentName m24169d(@mr2 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f18179c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f18180d) : componentName;
    }

    @ts2
    /* renamed from: e */
    public static String m24170e(@mr2 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : m24171f(intent);
    }

    @ts2
    /* renamed from: f */
    public static String m24171f(@mr2 Intent intent) {
        String stringExtra = intent.getStringExtra(f18177a);
        return stringExtra == null ? intent.getStringExtra(f18178b) : stringExtra;
    }
}
