package com.onedelhi.secure;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0933o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class i04 extends LinearLayoutManager {

    /* renamed from: b */
    public static final float f13418b = 100.0f;

    /* renamed from: com.onedelhi.secure.i04$a */
    public class C2381a extends C0933o {
        public C2381a(Context context) {
            super(context);
        }

        /* renamed from: w */
        public float mo6472w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public i04(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: f2 */
    public void mo5293f2(RecyclerView recyclerView, RecyclerView.C0797c0 c0Var, int i) {
        C2381a aVar = new C2381a(recyclerView.getContext());
        aVar.mo5589q(i);
        mo5870g2(aVar);
    }
}
