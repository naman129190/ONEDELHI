package androidx.media;

import android.content.Context;
import androidx.media.C0773d;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;

@sj3(21)
/* renamed from: androidx.media.e */
public class C0777e extends C0780g {
    public C0777e(Context context) {
        super(context);
        this.f4347a = context;
    }

    /* renamed from: b */
    public boolean mo5175b(@mr2 C0773d.C0776c cVar) {
        return mo5184e(cVar) || super.mo5175b(cVar);
    }

    /* renamed from: e */
    public final boolean mo5184e(@mr2 C0773d.C0776c cVar) {
        return mo5174a().checkPermission(C0780g.f4344c, cVar.mo5183b(), cVar.mo5182a()) == 0;
    }
}
