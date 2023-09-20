package com.onedelhi.secure;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.C2691l3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/m3;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "activity_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.m3 */
public final class C2811m3 {

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/m3$a;", "Lcom/onedelhi/secure/l3;", "Landroid/net/Uri;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$a */
    public static class C2812a extends C2691l3<Uri, Boolean> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 Uri uri) {
            jt1.m53777p(context, "context");
            jt1.m53777p(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            jt1.m53776o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Boolean> mo19272b(@vr2 Context context, @vr2 Uri uri) {
            jt1.m53777p(context, "context");
            jt1.m53777p(uri, "input");
            return null;
        }

        @vr2
        /* renamed from: f */
        public final Boolean mo4655c(int i, @ss2 Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @sj3(19)
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0017¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/m3$b;", "Lcom/onedelhi/secure/l3;", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "mimeType", "<init>", "(Ljava/lang/String;)V", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$b */
    public static class C2813b extends C2691l3<String, Uri> {
        @vr2

        /* renamed from: a */
        public final String f15884a;

        @xj0(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @oi3(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C2813b() {
            this("*/*");
        }

        public C2813b(@vr2 String str) {
            jt1.m53777p(str, "mimeType");
            this.f15884a = str;
        }

        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f15884a).putExtra("android.intent.extra.TITLE", str);
            jt1.m53776o(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Uri> mo19272b(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            return null;
        }

        @ss2
        /* renamed from: f */
        public final Uri mo4655c(int i, @ss2 Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/m3$c;", "Lcom/onedelhi/secure/l3;", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$c */
    public static class C2814c extends C2691l3<String, Uri> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            jt1.m53776o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Uri> mo19272b(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            return null;
        }

        @ss2
        /* renamed from: f */
        public final Uri mo4655c(int i, @ss2 Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @sj3(18)
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017J$\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\t¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/m3$d;", "Lcom/onedelhi/secure/l3;", "", "", "Landroid/net/Uri;", "Lcom/onedelhi/secure/ax1;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$d */
    public static class C2815d extends C2691l3<String, List<Uri>> {
        @vr2

        /* renamed from: a */
        public static final C2816a f15885a = new C2816a((wg0) null);

        @sj3(18)
        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/m3$d$a;", "", "Landroid/content/Intent;", "", "Landroid/net/Uri;", "a", "(Landroid/content/Intent;)Ljava/util/List;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.m3$d$a */
        public static final class C2816a {
            public C2816a() {
            }

            public /* synthetic */ C2816a(wg0 wg0) {
                this();
            }

            @vr2
            /* renamed from: a */
            public final List<Uri> mo20059a(@vr2 Intent intent) {
                jt1.m53777p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return s00.m64037F();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            jt1.m53776o(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<List<Uri>> mo19272b(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            return null;
        }

        @vr2
        /* renamed from: f */
        public final List<Uri> mo4655c(int i, @ss2 Intent intent) {
            List<Uri> a;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (a = f15885a.mo20059a(intent)) == null) ? s00.m64037F() : a;
        }
    }

    @sj3(19)
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/m3$e;", "Lcom/onedelhi/secure/l3;", "", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lcom/onedelhi/secure/l3$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lcom/onedelhi/secure/l3$a;", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$e */
    public static class C2817e extends C2691l3<String[], Uri> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 String[] strArr) {
            jt1.m53777p(context, "context");
            jt1.m53777p(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            jt1.m53776o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Uri> mo19272b(@vr2 Context context, @vr2 String[] strArr) {
            jt1.m53777p(context, "context");
            jt1.m53777p(strArr, "input");
            return null;
        }

        @ss2
        /* renamed from: f */
        public final Uri mo4655c(int i, @ss2 Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @sj3(21)
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/m3$f;", "Lcom/onedelhi/secure/l3;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$f */
    public static class C2818f extends C2691l3<Uri, Uri> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @ss2 Uri uri) {
            jt1.m53777p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Uri> mo19272b(@vr2 Context context, @ss2 Uri uri) {
            jt1.m53777p(context, "context");
            return null;
        }

        @ss2
        /* renamed from: f */
        public final Uri mo4655c(int i, @ss2 Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @sj3(19)
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/m3$g;", "Lcom/onedelhi/secure/l3;", "", "", "", "Landroid/net/Uri;", "Lcom/onedelhi/secure/ax1;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lcom/onedelhi/secure/l3$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lcom/onedelhi/secure/l3$a;", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$g */
    public static class C2819g extends C2691l3<String[], List<Uri>> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 String[] strArr) {
            jt1.m53777p(context, "context");
            jt1.m53777p(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            jt1.m53776o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<List<Uri>> mo19272b(@vr2 Context context, @vr2 String[] strArr) {
            jt1.m53777p(context, "context");
            jt1.m53777p(strArr, "input");
            return null;
        }

        @vr2
        /* renamed from: f */
        public final List<Uri> mo4655c(int i, @ss2 Intent intent) {
            List<Uri> a;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (a = C2815d.f15885a.mo20059a(intent)) == null) ? s00.m64037F() : a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/m3$h;", "Lcom/onedelhi/secure/l3;", "Ljava/lang/Void;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "", "resultCode", "intent", "e", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$h */
    public static final class C2820h extends C2691l3<Void, Uri> {
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @ss2 Void voidR) {
            jt1.m53777p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            jt1.m53776o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @ss2
        /* renamed from: e */
        public Uri mo4655c(int i, @ss2 Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/m3$i;", "Lcom/onedelhi/secure/l3;", "", "", "", "", "Lcom/onedelhi/secure/ax1;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lcom/onedelhi/secure/l3$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lcom/onedelhi/secure/l3$a;", "", "resultCode", "intent", "f", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$i */
    public static final class C2821i extends C2691l3<String[], Map<String, Boolean>> {
        @vr2

        /* renamed from: a */
        public static final C2822a f15886a = new C2822a((wg0) null);
        @vr2

        /* renamed from: a */
        public static final String f15887a = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        @vr2

        /* renamed from: b */
        public static final String f15888b = "androidx.activity.result.contract.extra.PERMISSIONS";
        @vr2

        /* renamed from: c */
        public static final String f15889c = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/m3$i$a;", "", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.m3$i$a */
        public static final class C2822a {
            public C2822a() {
            }

            public /* synthetic */ C2822a(wg0 wg0) {
                this();
            }

            @vr2
            /* renamed from: a */
            public final Intent mo20074a(@vr2 String[] strArr) {
                jt1.m53777p(strArr, "input");
                Intent putExtra = new Intent(C2821i.f15887a).putExtra(C2821i.f15888b, strArr);
                jt1.m53776o(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }
        }

        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 String[] strArr) {
            jt1.m53777p(context, "context");
            jt1.m53777p(strArr, "input");
            return f15886a.mo20074a(strArr);
        }

        @ss2
        /* renamed from: e */
        public C2691l3.C2692a<Map<String, Boolean>> mo19272b(@vr2 Context context, @vr2 String[] strArr) {
            jt1.m53777p(context, "context");
            jt1.m53777p(strArr, "input");
            boolean z = true;
            if (strArr.length == 0) {
                return new C2691l3.C2692a<>(id2.m52156z());
            }
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!(r70.m26348a(context, strArr[i]) == 0)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(df3.m45198n(hd2.m50458j(strArr.length), 16));
            for (String a : strArr) {
                ey2 a2 = yi4.m71797a(a, Boolean.TRUE);
                linkedHashMap.put(a2.mo35668e(), a2.mo35670f());
            }
            return new C2691l3.C2692a<>(linkedHashMap);
        }

        @vr2
        /* renamed from: f */
        public Map<String, Boolean> mo4655c(int i, @ss2 Intent intent) {
            if (i != -1) {
                return id2.m52156z();
            }
            if (intent == null) {
                return id2.m52156z();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f15888b);
            int[] intArrayExtra = intent.getIntArrayExtra(f15889c);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return id2.m52156z();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            int length = intArrayExtra.length;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
            }
            return id2.m52094D0(a10.m35834d6(C4478ab.m37584ub(stringArrayExtra), arrayList));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/m3$j;", "Lcom/onedelhi/secure/l3;", "", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lcom/onedelhi/secure/l3$a;", "e", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$j */
    public static final class C2823j extends C2691l3<String, Boolean> {
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            return C2821i.f15886a.mo20074a(new String[]{str});
        }

        @ss2
        /* renamed from: e */
        public C2691l3.C2692a<Boolean> mo19272b(@vr2 Context context, @vr2 String str) {
            jt1.m53777p(context, "context");
            jt1.m53777p(str, "input");
            if (r70.m26348a(context, str) == 0) {
                return new C2691l3.C2692a<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r5 == true) goto L_0x0027;
         */
        @com.onedelhi.secure.vr2
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean mo4655c(int r5, @com.onedelhi.secure.ss2 android.content.Intent r6) {
            /*
                r4 = this;
                if (r6 == 0) goto L_0x002c
                r0 = -1
                if (r5 == r0) goto L_0x0006
                goto L_0x002c
            L_0x0006:
                java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r5 = r6.getIntArrayExtra(r5)
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x0026
                int r1 = r5.length
                r2 = 0
            L_0x0012:
                if (r2 >= r1) goto L_0x0022
                r3 = r5[r2]
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 == 0) goto L_0x001f
                r5 = 1
                goto L_0x0023
            L_0x001f:
                int r2 = r2 + 1
                goto L_0x0012
            L_0x0022:
                r5 = 0
            L_0x0023:
                if (r5 != r6) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r6 = 0
            L_0x0027:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
                return r5
            L_0x002c:
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2811m3.C2823j.mo4655c(int, android.content.Intent):java.lang.Boolean");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/m3$k;", "Lcom/onedelhi/secure/l3;", "Landroid/content/Intent;", "Lcom/onedelhi/secure/i3;", "Landroid/content/Context;", "context", "input", "d", "", "resultCode", "intent", "e", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$k */
    public static final class C2824k extends C2691l3<Intent, C2394i3> {
        @vr2

        /* renamed from: a */
        public static final C2825a f15890a = new C2825a((wg0) null);
        @vr2

        /* renamed from: a */
        public static final String f15891a = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/m3$k$a;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.m3$k$a */
        public static final class C2825a {
            public C2825a() {
            }

            public /* synthetic */ C2825a(wg0 wg0) {
                this();
            }
        }

        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 Intent intent) {
            jt1.m53777p(context, "context");
            jt1.m53777p(intent, "input");
            return intent;
        }

        @vr2
        /* renamed from: e */
        public C2394i3 mo4655c(int i, @ss2 Intent intent) {
            return new C2394i3(i, intent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/m3$l;", "Lcom/onedelhi/secure/l3;", "Lcom/onedelhi/secure/ts1;", "Lcom/onedelhi/secure/i3;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "", "resultCode", "intent", "e", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$l */
    public static final class C2826l extends C2691l3<ts1, C2394i3> {
        @vr2

        /* renamed from: a */
        public static final C2827a f15892a = new C2827a((wg0) null);
        @vr2

        /* renamed from: a */
        public static final String f15893a = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        @vr2

        /* renamed from: b */
        public static final String f15894b = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        @vr2

        /* renamed from: c */
        public static final String f15895c = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/m3$l$a;", "", "", "ACTION_INTENT_SENDER_REQUEST", "Ljava/lang/String;", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.m3$l$a */
        public static final class C2827a {
            public C2827a() {
            }

            public /* synthetic */ C2827a(wg0 wg0) {
                this();
            }
        }

        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 ts1 ts1) {
            jt1.m53777p(context, "context");
            jt1.m53777p(ts1, "input");
            Intent putExtra = new Intent(f15893a).putExtra(f15894b, ts1);
            jt1.m53776o(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        @vr2
        /* renamed from: e */
        public C2394i3 mo4655c(int i, @ss2 Intent intent) {
            return new C2394i3(i, intent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/m3$m;", "Lcom/onedelhi/secure/l3;", "Landroid/net/Uri;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$m */
    public static class C2828m extends C2691l3<Uri, Boolean> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 Uri uri) {
            jt1.m53777p(context, "context");
            jt1.m53777p(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            jt1.m53776o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Boolean> mo19272b(@vr2 Context context, @vr2 Uri uri) {
            jt1.m53777p(context, "context");
            jt1.m53777p(uri, "input");
            return null;
        }

        @vr2
        /* renamed from: f */
        public final Boolean mo4655c(int i, @ss2 Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/m3$n;", "Lcom/onedelhi/secure/l3;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$n */
    public static class C2829n extends C2691l3<Void, Bitmap> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @ss2 Void voidR) {
            jt1.m53777p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Bitmap> mo19272b(@vr2 Context context, @ss2 Void voidR) {
            jt1.m53777p(context, "context");
            return null;
        }

        @ss2
        /* renamed from: f */
        public final Bitmap mo4655c(int i, @ss2 Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra(C4311b.C4317f.C4318a.f25149a);
            }
            return null;
        }
    }

    @xj0(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/m3$o;", "Lcom/onedelhi/secure/l3;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lcom/onedelhi/secure/l3$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.m3$o */
    public static class C2830o extends C2691l3<Uri, Bitmap> {
        @C3740us
        @vr2
        /* renamed from: d */
        public Intent mo4654a(@vr2 Context context, @vr2 Uri uri) {
            jt1.m53777p(context, "context");
            jt1.m53777p(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            jt1.m53776o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @ss2
        /* renamed from: e */
        public final C2691l3.C2692a<Bitmap> mo19272b(@vr2 Context context, @vr2 Uri uri) {
            jt1.m53777p(context, "context");
            jt1.m53777p(uri, "input");
            return null;
        }

        @ss2
        /* renamed from: f */
        public final Bitmap mo4655c(int i, @ss2 Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra(C4311b.C4317f.C4318a.f25149a);
            }
            return null;
        }
    }
}
