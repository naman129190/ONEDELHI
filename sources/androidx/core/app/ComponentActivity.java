package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0695g;
import androidx.lifecycle.C0703j;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qy1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ty3;

@hl3({hl3.C2354a.f13188c})
public class ComponentActivity extends Activity implements a32, qy1.C3350a {

    /* renamed from: a */
    public C0695g f3236a = new C0695g(this);

    /* renamed from: a */
    public ty3<Class<? extends C0464a>, C0464a> f3237a = new ty3<>();

    @hl3({hl3.C2354a.f13188c})
    @Deprecated
    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C0464a {
    }

    /* renamed from: k0 */
    public static boolean m3558k0(@ts2 String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 1;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Build.VERSION.SDK_INT >= 31;
            case 1:
                return Build.VERSION.SDK_INT >= 29;
            case 2:
                return Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: d0 */
    public boolean mo3702d0(@mr2 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !qy1.m26228d(decorView, keyEvent)) {
            return qy1.m26229e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !qy1.m26228d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @mr2
    public C0690e getLifecycle() {
        return this.f3236a;
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: h0 */
    public <T extends C0464a> T mo3704h0(Class<T> cls) {
        return (C0464a) this.f3237a.get(cls);
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: i0 */
    public void mo3705i0(C0464a aVar) {
        this.f3237a.put(aVar.getClass(), aVar);
    }

    /* renamed from: j0 */
    public final boolean mo3706j0(@ts2 String[] strArr) {
        return !m3558k0(strArr);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        C0703j.m4831g(this);
    }

    @C3740us
    public void onSaveInstanceState(@mr2 Bundle bundle) {
        this.f3236a.mo4970l(C0690e.C0693c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
