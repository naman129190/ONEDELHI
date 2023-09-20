package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class a80 {
    @ts2
    /* renamed from: a */
    public static Activity m36091a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
