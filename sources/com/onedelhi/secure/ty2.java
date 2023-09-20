package com.onedelhi.secure;

import android.media.browse.MediaBrowser;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@sj3(21)
public class ty2 {

    /* renamed from: a */
    public static Constructor f21168a;

    static {
        try {
            f21168a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Object m29010a(List<MediaBrowser.MediaItem> list) {
        try {
            return f21168a.newInstance(new Object[]{list});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
