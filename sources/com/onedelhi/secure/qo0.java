package com.onedelhi.secure;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import com.onedelhi.secure.hl3;

public final class qo0 {

    /* renamed from: a */
    public final DragAndDropPermissions f19268a;

    @sj3(24)
    /* renamed from: com.onedelhi.secure.qo0$a */
    public static class C3312a {
        @pn0
        /* renamed from: a */
        public static void m25868a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @pn0
        /* renamed from: b */
        public static DragAndDropPermissions m25869b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public qo0(DragAndDropPermissions dragAndDropPermissions) {
        this.f19268a = dragAndDropPermissions;
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static qo0 m25866b(@mr2 Activity activity, @mr2 DragEvent dragEvent) {
        DragAndDropPermissions b;
        if (Build.VERSION.SDK_INT < 24 || (b = C3312a.m25869b(activity, dragEvent)) == null) {
            return null;
        }
        return new qo0(b);
    }

    /* renamed from: a */
    public void mo23273a() {
        if (Build.VERSION.SDK_INT >= 24) {
            C3312a.m25868a(this.f19268a);
        }
    }
}
