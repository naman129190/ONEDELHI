package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0189c;
import androidx.appcompat.view.menu.C0258j;
import com.onedelhi.secure.b33;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.za3;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0251f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0258j.C0259a {

    /* renamed from: a */
    public C0189c f1131a;

    /* renamed from: a */
    public C0245c f1132a;

    /* renamed from: a */
    public C0248e f1133a;

    /* renamed from: a */
    public C0258j.C0259a f1134a;

    public C0251f(C0248e eVar) {
        this.f1133a = eVar;
    }

    /* renamed from: a */
    public void mo1374a() {
        C0189c cVar = this.f1131a;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo1072b(@mr2 C0248e eVar, boolean z) {
        if (z || eVar == this.f1133a) {
            mo1374a();
        }
        C0258j.C0259a aVar = this.f1134a;
        if (aVar != null) {
            aVar.mo1072b(eVar, z);
        }
    }

    /* renamed from: c */
    public boolean mo1073c(@mr2 C0248e eVar) {
        C0258j.C0259a aVar = this.f1134a;
        if (aVar != null) {
            return aVar.mo1073c(eVar);
        }
        return false;
    }

    /* renamed from: d */
    public void mo1375d(C0258j.C0259a aVar) {
        this.f1134a = aVar;
    }

    /* renamed from: e */
    public void mo1376e(IBinder iBinder) {
        C0248e eVar = this.f1133a;
        C0189c.C0190a aVar = new C0189c.C0190a(eVar.mo1371x());
        C0245c cVar = new C0245c(aVar.mo942b(), za3.C4065j.abc_list_menu_item_layout);
        this.f1132a = cVar;
        cVar.mo1220j(this);
        this.f1133a.mo1321b(this.f1132a);
        aVar.mo943c(this.f1132a.mo1261a(), this);
        View B = eVar.mo1286B();
        if (B != null) {
            aVar.mo946f(B);
        } else {
            aVar.mo948h(eVar.mo1373z()).mo936K(eVar.mo1285A());
        }
        aVar.mo926A(this);
        C0189c a = aVar.mo941a();
        this.f1131a = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1131a.getWindow().getAttributes();
        attributes.type = b33.f9633e;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1131a.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1133a.mo1298O((C0253h) this.f1132a.mo1261a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1132a.mo1212b(this.f1133a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1131a.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1131a.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1133a.mo1332f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1133a.performShortcut(i, keyEvent, 0);
    }
}
