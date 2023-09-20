package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.k */
public interface C0260k {

    /* renamed from: androidx.appcompat.view.menu.k$a */
    public interface C0261a {
        /* renamed from: b */
        void mo1171b(C0253h hVar, int i);

        /* renamed from: d */
        boolean mo1172d();

        /* renamed from: f */
        boolean mo1174f();

        C0253h getItemData();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z, char c);

        void setTitle(CharSequence charSequence);
    }

    /* renamed from: g */
    void mo1198g(C0248e eVar);

    int getWindowAnimations();
}
