package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ro3 {

    /* renamed from: a */
    public static final String f34699a = System.getenv("EXTERNAL_STORAGE");
    @SuppressLint({"SdCardPath"})

    /* renamed from: a */
    public static final String[] f34700a = {"/storage/sdcard0", "/storage/sdcard1", "/storage/extsdcard", "/storage/sdcard0/external_sdcard", "/mnt/extsdcard", "/mnt/sdcard/external_sd", "/mnt/sdcard/ext_sd", "/mnt/external_sd", "/mnt/media_rw/sdcard1", "/removable/microsd", "/mnt/emmc", "/storage/external_SD", "/storage/ext_sd", "/storage/removable/sdcard1", "/data/sdext", "/data/sdext2", "/data/sdext3", "/data/sdext4", "/sdcard1", "/sdcard2", "/storage/microsd"};

    /* renamed from: b */
    public static final String f34701b = System.getenv("SECONDARY_STORAGE");

    /* renamed from: c */
    public static final String f34702c = System.getenv("EMULATED_STORAGE_TARGET");

    /* renamed from: a */
    public static String[] m63773a() {
        String str = f34701b;
        return (TextUtils.isEmpty(str) || str == null) ? new String[0] : str.split(File.pathSeparator);
    }

    /* renamed from: b */
    public static List<String> m63774b() {
        ArrayList arrayList = new ArrayList();
        for (String str : f34700a) {
            if (new File(str).exists()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m63775c() {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        String str = File.separator;
        String[] split = absolutePath.split(str);
        String str2 = split[split.length - 1];
        if (TextUtils.isEmpty(str2) || !TextUtils.isDigitsOnly(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return f34702c;
        }
        return f34702c + str + str2;
    }

    /* renamed from: d */
    public static File[] m63776d(Context context) {
        return context.getExternalFilesDirs((String) null);
    }

    /* renamed from: e */
    public static Set<String> m63777e(Context context) {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 23) {
            for (File file : m63776d(context)) {
                if (file != null) {
                    String absolutePath = file.getAbsolutePath();
                    String substring = absolutePath.substring(9, absolutePath.indexOf("Android/data"));
                    String substring2 = substring.substring(substring.indexOf("/storage/") + 1);
                    String substring3 = substring2.substring(0, substring2.indexOf("/"));
                    if (!substring3.equals("emulated")) {
                        hashSet.add(substring3);
                    }
                }
            }
        } else {
            String str = f34699a;
            if (TextUtils.isEmpty(str)) {
                hashSet.addAll(m63774b());
            } else {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public static String[] m63778f(Context context) {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(f34702c)) {
            hashSet.add(m63775c());
        } else {
            hashSet.addAll(m63777e(context));
        }
        Collections.addAll(hashSet, m63773a());
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }
}
