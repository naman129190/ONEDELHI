package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.onedelhi.secure.hl3;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ny2 {

    /* renamed from: a */
    public static final String f17619a = "a";

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static <T extends ys4> T m23213a(InputStream inputStream) {
        return new xs4(inputStream, (OutputStream) null).mo26272g0();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static <T extends ys4> T m23214b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo7068a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @ts2
    /* renamed from: c */
    public static <T extends ys4> T m23215c(@mr2 Bundle bundle, @mr2 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ny2.class.getClassLoader());
            return m23214b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @ts2
    /* renamed from: d */
    public static <T extends ys4> List<T> m23216d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(ny2.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(m23214b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m23217e(@mr2 Bundle bundle, @mr2 String str, @ts2 ys4 ys4) {
        if (ys4 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", m23220h(ys4));
            bundle.putParcelable(str, bundle2);
        }
    }

    /* renamed from: f */
    public static void m23218f(@mr2 Bundle bundle, @mr2 String str, @mr2 List<? extends ys4> list) {
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (ys4 h : list) {
            arrayList.add(m23220h(h));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public static void m23219g(ys4 ys4, OutputStream outputStream) {
        xs4 xs4 = new xs4((InputStream) null, outputStream);
        xs4.mo26288l1(ys4);
        xs4.mo26254a();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public static Parcelable m23220h(ys4 ys4) {
        return new ParcelImpl(ys4);
    }
}
