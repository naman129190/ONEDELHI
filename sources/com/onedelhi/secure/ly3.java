package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import com.onedelhi.secure.hl3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class ly3 {

    /* renamed from: a */
    public static final Object f15693a = new Object();

    /* renamed from: a */
    public static final String f15694a = "ShortcutXmlParser";

    /* renamed from: a */
    public static volatile ArrayList<String> f15695a = null;

    /* renamed from: b */
    public static final String f15696b = "android.app.shortcuts";

    /* renamed from: c */
    public static final String f15697c = "shortcut";

    /* renamed from: d */
    public static final String f15698d = "shortcutId";

    /* renamed from: a */
    public static String m21068a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue((String) null, str) : attributeValue;
    }

    @mr2
    @ly4
    /* renamed from: b */
    public static List<String> m21069b(@mr2 Context context) {
        if (f15695a == null) {
            synchronized (f15693a) {
                if (f15695a == null) {
                    f15695a = new ArrayList<>();
                    f15695a.addAll(m21072e(context));
                }
            }
        }
        return f15695a;
    }

    @mr2
    /* renamed from: c */
    public static XmlResourceParser m21070c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f15696b);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @hw4
    @mr2
    /* renamed from: d */
    public static List<String> m21071d(@mr2 XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String a;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                return arrayList;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f15697c.equals(name) && (a = m21068a(xmlPullParser, f15698d)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @mr2
    /* renamed from: e */
    public static Set<String> m21072e(@mr2 Context context) {
        XmlResourceParser c;
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (!(queryIntentActivities == null || queryIntentActivities.size() == 0)) {
            try {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f15696b)) {
                        c = m21070c(context, activityInfo);
                        hashSet.addAll(m21071d(c));
                        if (c != null) {
                            c.close();
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(f15694a, "Failed to parse the Xml resource: ", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return hashSet;
        throw th;
    }
}
