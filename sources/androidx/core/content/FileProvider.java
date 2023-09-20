package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.bi2;
import com.onedelhi.secure.ez4;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {

    /* renamed from: a */
    public static final File f3277a = new File("/");
    @mj1("sCache")

    /* renamed from: a */
    public static final HashMap<String, C0479b> f3278a = new HashMap<>();

    /* renamed from: a */
    public static final String[] f3279a = {"_display_name", "_size"};

    /* renamed from: b */
    public static final String f3280b = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: c */
    public static final String f3281c = "root-path";

    /* renamed from: d */
    public static final String f3282d = "files-path";

    /* renamed from: e */
    public static final String f3283e = "cache-path";

    /* renamed from: f */
    public static final String f3284f = "external-path";

    /* renamed from: g */
    public static final String f3285g = "external-files-path";

    /* renamed from: h */
    public static final String f3286h = "external-cache-path";

    /* renamed from: i */
    public static final String f3287i = "external-media-path";

    /* renamed from: j */
    public static final String f3288j = "name";

    /* renamed from: k */
    public static final String f3289k = "path";

    /* renamed from: l */
    public static final String f3290l = "displayName";

    /* renamed from: a */
    public C0479b f3291a;

    /* renamed from: n */
    public int f3292n;

    @sj3(21)
    /* renamed from: androidx.core.content.FileProvider$a */
    public static class C0478a {
        @pn0
        /* renamed from: a */
        public static File[] m3631a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    public interface C0479b {
        /* renamed from: a */
        Uri mo3767a(File file);

        /* renamed from: b */
        File mo3768b(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    public static class C0480c implements C0479b {

        /* renamed from: a */
        public final String f3293a;

        /* renamed from: a */
        public final HashMap<String, File> f3294a = new HashMap<>();

        public C0480c(String str) {
            this.f3293a = str;
        }

        /* renamed from: a */
        public Uri mo3767a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f3294a.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    boolean endsWith = path2.endsWith("/");
                    int length = path2.length();
                    if (!endsWith) {
                        length++;
                    }
                    String substring = canonicalPath.substring(length);
                    return new Uri.Builder().scheme(FirebaseAnalytics.C4305d.f24947P).authority(this.f3293a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: b */
        public File mo3768b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f3294a.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        /* renamed from: c */
        public void mo3769c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f3294a.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public FileProvider() {
        this.f3292n = 0;
    }

    public FileProvider(@ez4 int i) {
        this.f3292n = i;
    }

    /* renamed from: a */
    public static File m3622a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static Object[] m3623b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    public static String[] m3624c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    @hw4
    /* renamed from: d */
    public static XmlResourceParser m3625d(Context context, String str, @ts2 ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(f3280b, i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f3280b);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    public static C0479b m3626e(Context context, String str, int i) {
        C0479b bVar;
        HashMap<String, C0479b> hashMap = f3278a;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    bVar = m3630i(context, str, i);
                    hashMap.put(str, bVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return bVar;
    }

    /* renamed from: f */
    public static Uri m3627f(@mr2 Context context, @mr2 String str, @mr2 File file) {
        return m3626e(context, str, 0).mo3767a(file);
    }

    @mr2
    @SuppressLint({"StreamFiles"})
    /* renamed from: g */
    public static Uri m3628g(@mr2 Context context, @mr2 String str, @mr2 File file, @mr2 String str2) {
        return m3627f(context, str, file).buildUpon().appendQueryParameter(f3290l, str2).build();
    }

    /* renamed from: h */
    public static int m3629h(String str) {
        if ("r".equals(str)) {
            return bi2.f26358i;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: i */
    public static C0479b m3630i(Context context, String str, int i) throws IOException, XmlPullParserException {
        C0480c cVar = new C0480c(str);
        XmlResourceParser d = m3625d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = d.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d.getName();
                File file = null;
                String attributeValue = d.getAttributeValue((String) null, "name");
                String attributeValue2 = d.getAttributeValue((String) null, "path");
                if (f3281c.equals(name)) {
                    file = f3277a;
                } else if (f3282d.equals(name)) {
                    file = context.getFilesDir();
                } else if (f3283e.equals(name)) {
                    file = context.getCacheDir();
                } else if (f3284f.equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if (f3285g.equals(name)) {
                    File[] k = r70.m26358k(context, (String) null);
                    if (k.length > 0) {
                        file = k[0];
                    }
                } else if (f3286h.equals(name)) {
                    File[] j = r70.m26357j(context);
                    if (j.length > 0) {
                        file = j[0];
                    }
                } else if (f3287i.equals(name)) {
                    File[] a = C0478a.m3631a(context);
                    if (a.length > 0) {
                        file = a[0];
                    }
                }
                if (file != null) {
                    cVar.mo3769c(attributeValue, m3622a(file, attributeValue2));
                }
            }
        }
    }

    public void attachInfo(@mr2 Context context, @mr2 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap<String, C0479b> hashMap = f3278a;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            this.f3291a = m3626e(context, str, this.f3292n);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(@mr2 Uri uri, @ts2 String str, @ts2 String[] strArr) {
        return this.f3291a.mo3768b(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    @com.onedelhi.secure.ts2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(@com.onedelhi.secure.mr2 android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.FileProvider$b r0 = r2.f3291a
            java.io.File r3 = r0.mo3768b(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0027
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(@mr2 Uri uri, @mr2 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@mr2 Uri uri, @mr2 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f3291a.mo3768b(uri), m3629h(str));
    }

    @mr2
    public Cursor query(@mr2 Uri uri, @ts2 String[] strArr, @ts2 String str, @ts2 String[] strArr2, @ts2 String str2) {
        int i;
        File b = this.f3291a.mo3768b(uri);
        String queryParameter = uri.getQueryParameter(f3290l);
        if (strArr == null) {
            strArr = f3279a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? b.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b.length());
            }
            i2 = i;
        }
        String[] c = m3624c(strArr3, i2);
        Object[] b2 = m3623b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(c, 1);
        matrixCursor.addRow(b2);
        return matrixCursor;
    }

    public int update(@mr2 Uri uri, @mr2 ContentValues contentValues, @ts2 String str, @ts2 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
