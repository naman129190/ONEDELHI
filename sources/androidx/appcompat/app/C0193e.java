package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0180a;
import androidx.appcompat.view.menu.C0245c;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0366c;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.C1862c8;
import com.onedelhi.secure.C2223g8;
import com.onedelhi.secure.C2416i8;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.C3767v8;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.aj4;
import com.onedelhi.secure.cl3;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.h74;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.kg0;
import com.onedelhi.secure.kn2;
import com.onedelhi.secure.kx4;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ms4;
import com.onedelhi.secure.ot2;
import com.onedelhi.secure.p12;
import com.onedelhi.secure.q12;
import com.onedelhi.secure.qy1;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.rv4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ty3;
import com.onedelhi.secure.vu4;
import com.onedelhi.secure.xu4;
import com.onedelhi.secure.y64;
import com.onedelhi.secure.yu4;
import com.onedelhi.secure.z70;
import com.onedelhi.secure.za3;
import com.onedelhi.secure.zk3;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@hl3({hl3.C2354a.f13185a})
/* renamed from: androidx.appcompat.app.e */
public class C0193e extends C0191d implements C0248e.C0249a, LayoutInflater.Factory2 {

    /* renamed from: a */
    public static final ty3<String, Integer> f818a = new ty3<>();

    /* renamed from: a */
    public static final int[] f819a = {16842836};

    /* renamed from: c */
    public static final String f820c = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* renamed from: u */
    public static final boolean f821u = false;

    /* renamed from: v */
    public static final boolean f822v = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: w */
    public static final boolean f823w = true;

    /* renamed from: x */
    public static boolean f824x;

    /* renamed from: A */
    public int f825A;

    /* renamed from: a */
    public final Context f826a;

    /* renamed from: a */
    public Configuration f827a;

    /* renamed from: a */
    public Rect f828a;

    /* renamed from: a */
    public MenuInflater f829a;

    /* renamed from: a */
    public View f830a;

    /* renamed from: a */
    public ViewGroup f831a;

    /* renamed from: a */
    public Window f832a;

    /* renamed from: a */
    public PopupWindow f833a;

    /* renamed from: a */
    public TextView f834a;

    /* renamed from: a */
    public ActionBar f835a;

    /* renamed from: a */
    public C0204j f836a;

    /* renamed from: a */
    public C0211p f837a;

    /* renamed from: a */
    public C0213r f838a;

    /* renamed from: a */
    public C0218v f839a;

    /* renamed from: a */
    public C0221w f840a;

    /* renamed from: a */
    public ActionBarContextView f841a;

    /* renamed from: a */
    public final C1862c8 f842a;

    /* renamed from: a */
    public kg0 f843a;

    /* renamed from: a */
    public p12 f844a;

    /* renamed from: a */
    public C3563t2 f845a;

    /* renamed from: a */
    public C3767v8 f846a;

    /* renamed from: a */
    public vu4 f847a;

    /* renamed from: a */
    public CharSequence f848a;

    /* renamed from: a */
    public Runnable f849a;

    /* renamed from: a */
    public C0218v[] f850a;

    /* renamed from: b */
    public Rect f851b;

    /* renamed from: b */
    public C0213r f852b;

    /* renamed from: b */
    public final Object f853b;

    /* renamed from: b */
    public final Runnable f854b;

    /* renamed from: c */
    public boolean f855c;

    /* renamed from: d */
    public boolean f856d;

    /* renamed from: e */
    public boolean f857e;

    /* renamed from: f */
    public boolean f858f;

    /* renamed from: g */
    public boolean f859g;

    /* renamed from: h */
    public boolean f860h;

    /* renamed from: i */
    public boolean f861i;

    /* renamed from: j */
    public boolean f862j;

    /* renamed from: k */
    public boolean f863k;

    /* renamed from: l */
    public boolean f864l;

    /* renamed from: m */
    public boolean f865m;

    /* renamed from: n */
    public boolean f866n;

    /* renamed from: o */
    public boolean f867o;

    /* renamed from: p */
    public boolean f868p;

    /* renamed from: q */
    public boolean f869q;

    /* renamed from: r */
    public boolean f870r;

    /* renamed from: s */
    public boolean f871s;

    /* renamed from: t */
    public boolean f872t;

    /* renamed from: y */
    public int f873y;

    /* renamed from: z */
    public int f874z;

    /* renamed from: androidx.appcompat.app.e$a */
    public class C0194a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f875a;

        public C0194a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f875a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        public final boolean mo1060a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(@mr2 Thread thread, @mr2 Throwable th) {
            if (mo1060a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + C0193e.f820c);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f875a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f875a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.e$b */
    public class C0195b implements Runnable {
        public C0195b() {
        }

        public void run() {
            C0193e eVar = C0193e.this;
            if ((eVar.f825A & 1) != 0) {
                eVar.mo1040h0(0);
            }
            C0193e eVar2 = C0193e.this;
            if ((eVar2.f825A & 4096) != 0) {
                eVar2.mo1040h0(108);
            }
            C0193e eVar3 = C0193e.this;
            eVar3.f871s = false;
            eVar3.f825A = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.e$c */
    public class C0196c implements ju2 {
        public C0196c() {
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, sx4 sx4) {
            int r = sx4.mo24605r();
            int Y0 = C0193e.this.mo1028Y0(sx4, (Rect) null);
            if (r != Y0) {
                sx4 = sx4.mo24579D(sx4.mo24603p(), Y0, sx4.mo24604q(), sx4.mo24602o());
            }
            return jt4.m18957g1(view, sx4);
        }
    }

    /* renamed from: androidx.appcompat.app.e$d */
    public class C0197d implements C0366c.C0367a {
        public C0197d() {
        }

        /* renamed from: a */
        public void mo1064a(Rect rect) {
            rect.top = C0193e.this.mo1028Y0((sx4) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.e$e */
    public class C0198e implements ContentFrameLayout.C0297a {
        public C0198e() {
        }

        /* renamed from: a */
        public void mo1065a() {
        }

        public void onDetachedFromWindow() {
            C0193e.this.mo1038f0();
        }
    }

    /* renamed from: androidx.appcompat.app.e$f */
    public class C0199f implements Runnable {

        /* renamed from: androidx.appcompat.app.e$f$a */
        public class C0200a extends yu4 {
            public C0200a() {
            }

            /* renamed from: a */
            public void mo1068a(View view) {
                C0193e.this.f841a.setAlpha(1.0f);
                C0193e.this.f847a.mo26372u((xu4) null);
                C0193e.this.f847a = null;
            }

            /* renamed from: b */
            public void mo1069b(View view) {
                C0193e.this.f841a.setVisibility(0);
            }
        }

        public C0199f() {
        }

        public void run() {
            C0193e eVar = C0193e.this;
            eVar.f833a.showAtLocation(eVar.f841a, 55, 0, 0);
            C0193e.this.mo1041i0();
            if (C0193e.this.mo1016R0()) {
                C0193e.this.f841a.setAlpha(0.0f);
                C0193e eVar2 = C0193e.this;
                eVar2.f847a = jt4.m18955g(eVar2.f841a).mo26354b(1.0f);
                C0193e.this.f847a.mo26372u(new C0200a());
                return;
            }
            C0193e.this.f841a.setAlpha(1.0f);
            C0193e.this.f841a.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.e$g */
    public class C0201g extends yu4 {
        public C0201g() {
        }

        /* renamed from: a */
        public void mo1068a(View view) {
            C0193e.this.f841a.setAlpha(1.0f);
            C0193e.this.f847a.mo26372u((xu4) null);
            C0193e.this.f847a = null;
        }

        /* renamed from: b */
        public void mo1069b(View view) {
            C0193e.this.f841a.setVisibility(0);
            if (C0193e.this.f841a.getParent() instanceof View) {
                jt4.m19017v1((View) C0193e.this.f841a.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$h */
    public class C0202h implements C0180a.C0182b {
        public C0202h() {
        }

        /* renamed from: a */
        public Drawable mo904a() {
            af4 F = af4.m11109F(mo908e(), (AttributeSet) null, new int[]{za3.C4057b.homeAsUpIndicator});
            Drawable h = F.mo13037h(0);
            F.mo13029I();
            return h;
        }

        /* renamed from: b */
        public void mo905b(Drawable drawable, int i) {
            ActionBar s = C0193e.this.mo992s();
            if (s != null) {
                s.mo743l0(drawable);
                s.mo737i0(i);
            }
        }

        /* renamed from: c */
        public void mo906c(int i) {
            ActionBar s = C0193e.this.mo992s();
            if (s != null) {
                s.mo737i0(i);
            }
        }

        /* renamed from: d */
        public boolean mo907d() {
            ActionBar s = C0193e.this.mo992s();
            return (s == null || (s.mo750p() & 4) == 0) ? false : true;
        }

        /* renamed from: e */
        public Context mo908e() {
            return C0193e.this.mo1045n0();
        }
    }

    /* renamed from: androidx.appcompat.app.e$i */
    public interface C0203i {
        /* renamed from: a */
        boolean mo1070a(int i);

        @ts2
        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.e$j */
    public final class C0204j implements C0258j.C0259a {
        public C0204j() {
        }

        /* renamed from: b */
        public void mo1072b(@mr2 C0248e eVar, boolean z) {
            C0193e.this.mo1029Z(eVar);
        }

        /* renamed from: c */
        public boolean mo1073c(@mr2 C0248e eVar) {
            Window.Callback u0 = C0193e.this.mo1054u0();
            if (u0 == null) {
                return true;
            }
            u0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.e$k */
    public class C0205k implements C3563t2.C3564a {

        /* renamed from: a */
        public C3563t2.C3564a f886a;

        /* renamed from: androidx.appcompat.app.e$k$a */
        public class C0206a extends yu4 {
            public C0206a() {
            }

            /* renamed from: a */
            public void mo1068a(View view) {
                C0193e.this.f841a.setVisibility(8);
                C0193e eVar = C0193e.this;
                PopupWindow popupWindow = eVar.f833a;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f841a.getParent() instanceof View) {
                    jt4.m19017v1((View) C0193e.this.f841a.getParent());
                }
                C0193e.this.f841a.mo1554t();
                C0193e.this.f847a.mo26372u((xu4) null);
                C0193e eVar2 = C0193e.this;
                eVar2.f847a = null;
                jt4.m19017v1(eVar2.f831a);
            }
        }

        public C0205k(C3563t2.C3564a aVar) {
            this.f886a = aVar;
        }

        /* renamed from: a */
        public boolean mo1074a(C3563t2 t2Var, Menu menu) {
            return this.f886a.mo1074a(t2Var, menu);
        }

        /* renamed from: b */
        public boolean mo1075b(C3563t2 t2Var, MenuItem menuItem) {
            return this.f886a.mo1075b(t2Var, menuItem);
        }

        /* renamed from: c */
        public boolean mo1076c(C3563t2 t2Var, Menu menu) {
            jt4.m19017v1(C0193e.this.f831a);
            return this.f886a.mo1076c(t2Var, menu);
        }

        /* renamed from: d */
        public void mo1077d(C3563t2 t2Var) {
            this.f886a.mo1077d(t2Var);
            C0193e eVar = C0193e.this;
            if (eVar.f833a != null) {
                eVar.f832a.getDecorView().removeCallbacks(C0193e.this.f849a);
            }
            C0193e eVar2 = C0193e.this;
            if (eVar2.f841a != null) {
                eVar2.mo1041i0();
                C0193e eVar3 = C0193e.this;
                eVar3.f847a = jt4.m18955g(eVar3.f841a).mo26354b(0.0f);
                C0193e.this.f847a.mo26372u(new C0206a());
            }
            C0193e eVar4 = C0193e.this;
            C1862c8 c8Var = eVar4.f842a;
            if (c8Var != null) {
                c8Var.mo878y(eVar4.f845a);
            }
            C0193e eVar5 = C0193e.this;
            eVar5.f845a = null;
            jt4.m19017v1(eVar5.f831a);
        }
    }

    @sj3(17)
    /* renamed from: androidx.appcompat.app.e$l */
    public static class C0207l {
        /* renamed from: a */
        public static Context m1522a(@mr2 Context context, @mr2 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m1523b(@mr2 Configuration configuration, @mr2 Configuration configuration2, @mr2 Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    @sj3(21)
    /* renamed from: androidx.appcompat.app.e$m */
    public static class C0208m {
        /* renamed from: a */
        public static boolean m1524a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    @sj3(24)
    /* renamed from: androidx.appcompat.app.e$n */
    public static class C0209n {
        /* renamed from: a */
        public static void m1525a(@mr2 Configuration configuration, @mr2 Configuration configuration2, @mr2 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    @sj3(26)
    /* renamed from: androidx.appcompat.app.e$o */
    public static class C0210o {
        /* renamed from: a */
        public static void m1526a(@mr2 Configuration configuration, @mr2 Configuration configuration2, @mr2 Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$p */
    public class C0211p extends kx4 {

        /* renamed from: a */
        public C0203i f888a;

        /* renamed from: b */
        public boolean f890b;

        /* renamed from: c */
        public boolean f891c;

        /* renamed from: d */
        public boolean f892d;

        public C0211p(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo1078b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f891c = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f891c = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f891c = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo1079c(Window.Callback callback) {
            try {
                this.f890b = true;
                callback.onContentChanged();
                this.f890b = false;
            } catch (Throwable th) {
                this.f890b = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo1080d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f892d = true;
                callback.onPanelClosed(i, menu);
                this.f892d = false;
            } catch (Throwable th) {
                this.f892d = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f891c ? mo19227a().dispatchKeyEvent(keyEvent) : C0193e.this.mo1039g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0193e.this.mo1004F0(keyEvent.getKeyCode(), keyEvent);
        }

        /* renamed from: e */
        public void mo1083e(@ts2 C0203i iVar) {
            this.f888a = iVar;
        }

        /* renamed from: f */
        public final ActionMode mo1084f(ActionMode.Callback callback) {
            y64.C3977a aVar = new y64.C3977a(C0193e.this.f826a, callback);
            C3563t2 T = C0193e.this.mo982T(aVar);
            if (T != null) {
                return aVar.mo27233e(T);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f890b) {
                mo19227a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0248e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.onCreatePanelView(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreatePanelView(int r2) {
            /*
                r1 = this;
                androidx.appcompat.app.e$i r0 = r1.f888a
                if (r0 == 0) goto L_0x000b
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0193e.C0211p.onCreatePanelView(int):android.view.View");
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0193e.this.mo1007I0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            if (this.f892d) {
                mo19227a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            C0193e.this.mo1008J0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0248e eVar = menu instanceof C0248e ? (C0248e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            boolean z = true;
            if (eVar != null) {
                eVar.mo1342i0(true);
            }
            C0203i iVar = this.f888a;
            if (iVar == null || !iVar.mo1070a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.mo1342i0(false);
            }
            return z;
        }

        @sj3(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0248e eVar;
            C0218v r0 = C0193e.this.mo1051r0(0, true);
            if (r0 == null || (eVar = r0.f907a) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0193e.this.mo996x() ? mo1084f(callback) : super.onWindowStartingActionMode(callback);
        }

        @sj3(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0193e.this.mo996x() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo1084f(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.e$q */
    public class C0212q extends C0213r {

        /* renamed from: a */
        public final PowerManager f893a;

        public C0212q(@mr2 Context context) {
            super();
            this.f893a = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* renamed from: b */
        public IntentFilter mo1094b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1095c() {
            return C0208m.m1524a(this.f893a) ? 2 : 1;
        }

        /* renamed from: e */
        public void mo1096e() {
            C0193e.this.mo984e();
        }
    }

    @hw4
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.appcompat.app.e$r */
    public abstract class C0213r {

        /* renamed from: a */
        public BroadcastReceiver f895a;

        /* renamed from: androidx.appcompat.app.e$r$a */
        public class C0214a extends BroadcastReceiver {
            public C0214a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0213r.this.mo1096e();
            }
        }

        public C0213r() {
        }

        /* renamed from: a */
        public void mo1097a() {
            BroadcastReceiver broadcastReceiver = this.f895a;
            if (broadcastReceiver != null) {
                try {
                    C0193e.this.f826a.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f895a = null;
            }
        }

        @ts2
        /* renamed from: b */
        public abstract IntentFilter mo1094b();

        /* renamed from: c */
        public abstract int mo1095c();

        /* renamed from: d */
        public boolean mo1098d() {
            return this.f895a != null;
        }

        /* renamed from: e */
        public abstract void mo1096e();

        /* renamed from: f */
        public void mo1099f() {
            mo1097a();
            IntentFilter b = mo1094b();
            if (b != null && b.countActions() != 0) {
                if (this.f895a == null) {
                    this.f895a = new C0214a();
                }
                C0193e.this.f826a.registerReceiver(this.f895a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$s */
    public class C0215s extends C0213r {

        /* renamed from: a */
        public final aj4 f898a;

        public C0215s(@mr2 aj4 aj4) {
            super();
            this.f898a = aj4;
        }

        /* renamed from: b */
        public IntentFilter mo1094b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1095c() {
            return this.f898a.mo13113d() ? 2 : 1;
        }

        /* renamed from: e */
        public void mo1096e() {
            C0193e.this.mo984e();
        }
    }

    @sj3(17)
    /* renamed from: androidx.appcompat.app.e$t */
    public static class C0216t {
        /* renamed from: a */
        public static void m1544a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.e$u */
    public class C0217u extends ContentFrameLayout {
        public C0217u(Context context) {
            super(context);
        }

        /* renamed from: b */
        public final boolean mo1101b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0193e.this.mo1039g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !mo1101b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0193e.this.mo1034b0(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C3129p8.m24529b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.e$v */
    public static final class C0218v {

        /* renamed from: a */
        public int f901a;

        /* renamed from: a */
        public Context f902a;

        /* renamed from: a */
        public Bundle f903a;

        /* renamed from: a */
        public View f904a;

        /* renamed from: a */
        public ViewGroup f905a;

        /* renamed from: a */
        public C0245c f906a;

        /* renamed from: a */
        public C0248e f907a;

        /* renamed from: a */
        public boolean f908a;

        /* renamed from: b */
        public int f909b;

        /* renamed from: b */
        public Bundle f910b;

        /* renamed from: b */
        public View f911b;

        /* renamed from: b */
        public boolean f912b;

        /* renamed from: c */
        public int f913c;

        /* renamed from: c */
        public boolean f914c;

        /* renamed from: d */
        public int f915d;

        /* renamed from: d */
        public boolean f916d;

        /* renamed from: e */
        public int f917e;

        /* renamed from: e */
        public boolean f918e = false;

        /* renamed from: f */
        public int f919f;

        /* renamed from: f */
        public boolean f920f;

        /* renamed from: g */
        public boolean f921g;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.appcompat.app.e$v$a */
        public static class C0219a implements Parcelable {
            public static final Parcelable.Creator<C0219a> CREATOR = new C0220a();

            /* renamed from: a */
            public Bundle f922a;

            /* renamed from: b */
            public boolean f923b;

            /* renamed from: n */
            public int f924n;

            /* renamed from: androidx.appcompat.app.e$v$a$a */
            public class C0220a implements Parcelable.ClassLoaderCreator<C0219a> {
                /* renamed from: a */
                public C0219a createFromParcel(Parcel parcel) {
                    return C0219a.m1554a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public C0219a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return C0219a.m1554a(parcel, classLoader);
                }

                /* renamed from: c */
                public C0219a[] newArray(int i) {
                    return new C0219a[i];
                }
            }

            /* renamed from: a */
            public static C0219a m1554a(Parcel parcel, ClassLoader classLoader) {
                C0219a aVar = new C0219a();
                aVar.f924n = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                aVar.f923b = z;
                if (z) {
                    aVar.f922a = parcel.readBundle(classLoader);
                }
                return aVar;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f924n);
                parcel.writeInt(this.f923b ? 1 : 0);
                if (this.f923b) {
                    parcel.writeBundle(this.f922a);
                }
            }
        }

        public C0218v(int i) {
            this.f901a = i;
        }

        /* renamed from: a */
        public void mo1105a() {
            Bundle bundle;
            C0248e eVar = this.f907a;
            if (eVar != null && (bundle = this.f903a) != null) {
                eVar.mo1304U(bundle);
                this.f903a = null;
            }
        }

        /* renamed from: b */
        public void mo1106b() {
            C0248e eVar = this.f907a;
            if (eVar != null) {
                eVar.mo1302S(this.f906a);
            }
            this.f906a = null;
        }

        /* renamed from: c */
        public C0260k mo1107c(C0258j.C0259a aVar) {
            if (this.f907a == null) {
                return null;
            }
            if (this.f906a == null) {
                C0245c cVar = new C0245c(this.f902a, za3.C4065j.abc_list_menu_item_layout);
                this.f906a = cVar;
                cVar.mo1220j(aVar);
                this.f907a.mo1321b(this.f906a);
            }
            return this.f906a.mo1216f(this.f905a);
        }

        /* renamed from: d */
        public boolean mo1108d() {
            if (this.f904a == null) {
                return false;
            }
            return this.f911b != null || this.f906a.mo1261a().getCount() > 0;
        }

        /* renamed from: e */
        public void mo1109e(Parcelable parcelable) {
            C0219a aVar = (C0219a) parcelable;
            this.f901a = aVar.f924n;
            this.f921g = aVar.f923b;
            this.f903a = aVar.f922a;
            this.f904a = null;
            this.f905a = null;
        }

        /* renamed from: f */
        public Parcelable mo1110f() {
            C0219a aVar = new C0219a();
            aVar.f924n = this.f901a;
            aVar.f923b = this.f914c;
            if (this.f907a != null) {
                Bundle bundle = new Bundle();
                aVar.f922a = bundle;
                this.f907a.mo1306W(bundle);
            }
            return aVar;
        }

        /* renamed from: g */
        public void mo1111g(C0248e eVar) {
            C0245c cVar;
            C0248e eVar2 = this.f907a;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.mo1302S(this.f906a);
                }
                this.f907a = eVar;
                if (eVar != null && (cVar = this.f906a) != null) {
                    eVar.mo1321b(cVar);
                }
            }
        }

        /* renamed from: h */
        public void mo1112h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(za3.C4057b.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(za3.C4057b.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = za3.C4067l.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            z70 z70 = new z70(context, 0);
            z70.getTheme().setTo(newTheme);
            this.f902a = z70;
            TypedArray obtainStyledAttributes = z70.obtainStyledAttributes(za3.C4068m.AppCompatTheme);
            this.f909b = obtainStyledAttributes.getResourceId(za3.C4068m.AppCompatTheme_panelBackground, 0);
            this.f919f = obtainStyledAttributes.getResourceId(za3.C4068m.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.e$w */
    public final class C0221w implements C0258j.C0259a {
        public C0221w() {
        }

        /* renamed from: b */
        public void mo1072b(@mr2 C0248e eVar, boolean z) {
            C0248e G = eVar.mo1290G();
            boolean z2 = G != eVar;
            C0193e eVar2 = C0193e.this;
            if (z2) {
                eVar = G;
            }
            C0218v l0 = eVar2.mo1044l0(eVar);
            if (l0 == null) {
                return;
            }
            if (z2) {
                C0193e.this.mo1027Y(l0.f901a, l0, G);
                C0193e.this.mo1035c0(l0, true);
                return;
            }
            C0193e.this.mo1035c0(l0, z);
        }

        /* renamed from: c */
        public boolean mo1073c(@mr2 C0248e eVar) {
            Window.Callback u0;
            if (eVar != eVar.mo1290G()) {
                return true;
            }
            C0193e eVar2 = C0193e.this;
            if (!eVar2.f859g || (u0 = eVar2.mo1054u0()) == null || C0193e.this.f868p) {
                return true;
            }
            u0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public C0193e(Activity activity, C1862c8 c8Var) {
        this(activity, (Window) null, c8Var, activity);
    }

    public C0193e(Dialog dialog, C1862c8 c8Var) {
        this(dialog.getContext(), dialog.getWindow(), c8Var, dialog);
    }

    public C0193e(Context context, Activity activity, C1862c8 c8Var) {
        this(context, (Window) null, c8Var, activity);
    }

    public C0193e(Context context, Window window, C1862c8 c8Var) {
        this(context, window, c8Var, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f818a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0193e(android.content.Context r3, android.view.Window r4, com.onedelhi.secure.C1862c8 r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f847a = r0
            r0 = 1
            r2.f855c = r0
            r0 = -100
            r2.f873y = r0
            androidx.appcompat.app.e$b r1 = new androidx.appcompat.app.e$b
            r1.<init>()
            r2.f854b = r1
            r2.f826a = r3
            r2.f842a = r5
            r2.f853b = r6
            int r3 = r2.f873y
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.AppCompatActivity r3 = r2.mo1022V0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.d r3 = r3.mo841M0()
            int r3 = r3.mo990q()
            r2.f873y = r3
        L_0x0032:
            int r3 = r2.f873y
            if (r3 != r0) goto L_0x0059
            com.onedelhi.secure.ty3<java.lang.String, java.lang.Integer> r3 = f818a
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f873y = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.mo1023W(r4)
        L_0x005e:
            com.onedelhi.secure.C2416i8.m17332i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0193e.<init>(android.content.Context, android.view.Window, com.onedelhi.secure.c8, java.lang.Object):void");
    }

    @mr2
    /* renamed from: m0 */
    public static Configuration m1410m0(@mr2 Configuration configuration, @ts2 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0209n.m1525a(configuration, configuration2, configuration3);
            } else if (!ot2.m24056a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0210o.m1526a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C0207l.m1523b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo967A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f853b
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0191d.m1366G(r3)
        L_0x0009:
            boolean r0 = r3.f871s
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f832a
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f854b
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f868p = r0
            int r0 = r3.f873y
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f853b
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            com.onedelhi.secure.ty3<java.lang.String, java.lang.Integer> r0 = f818a
            java.lang.Object r1 = r3.f853b
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f873y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            com.onedelhi.secure.ty3<java.lang.String, java.lang.Integer> r0 = f818a
            java.lang.Object r1 = r3.f853b
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.ActionBar r0 = r3.f835a
            if (r0 == 0) goto L_0x005b
            r0.mo709J()
        L_0x005b:
            r3.mo1032a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0193e.mo967A():void");
    }

    /* renamed from: A0 */
    public final boolean mo999A0(Context context) {
        if (!this.f870r && (this.f853b instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f853b.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f869q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d(C0191d.f805b, "Exception while getting ActivityInfo", e);
                this.f869q = false;
            }
        }
        this.f870r = true;
        return this.f869q;
    }

    /* renamed from: B */
    public void mo968B(Bundle bundle) {
        mo1042j0();
    }

    /* renamed from: B0 */
    public int mo1000B0(@mr2 Context context, int i) {
        C0213r q0;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        q0 = mo1046o0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                q0 = mo1050q0(context);
            }
            return q0.mo1095c();
        }
        return i;
    }

    /* renamed from: C */
    public void mo969C() {
        ActionBar s = mo992s();
        if (s != null) {
            s.mo761u0(true);
        }
    }

    /* renamed from: C0 */
    public boolean mo1001C0() {
        C3563t2 t2Var = this.f845a;
        if (t2Var != null) {
            t2Var.mo1150c();
            return true;
        }
        ActionBar s = mo992s();
        return s != null && s.mo744m();
    }

    /* renamed from: D */
    public void mo970D(Bundle bundle) {
    }

    /* renamed from: D0 */
    public boolean mo1002D0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f865m = z;
        } else if (i == 82) {
            mo1003E0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public void mo971E() {
        mo984e();
    }

    /* renamed from: E0 */
    public final boolean mo1003E0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0218v r0 = mo1051r0(i, true);
        if (!r0.f914c) {
            return mo1013O0(r0, keyEvent);
        }
        return false;
    }

    /* renamed from: F */
    public void mo972F() {
        ActionBar s = mo992s();
        if (s != null) {
            s.mo761u0(false);
        }
    }

    /* renamed from: F0 */
    public boolean mo1004F0(int i, KeyEvent keyEvent) {
        ActionBar s = mo992s();
        if (s != null && s.mo710K(i, keyEvent)) {
            return true;
        }
        C0218v vVar = this.f839a;
        if (vVar == null || !mo1012N0(vVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f839a == null) {
                C0218v r0 = mo1051r0(0, true);
                mo1013O0(r0, keyEvent);
                boolean N0 = mo1012N0(r0, keyEvent.getKeyCode(), keyEvent, 1);
                r0.f908a = false;
                if (N0) {
                    return true;
                }
            }
            return false;
        }
        C0218v vVar2 = this.f839a;
        if (vVar2 != null) {
            vVar2.f912b = true;
        }
        return true;
    }

    /* renamed from: G0 */
    public boolean mo1005G0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f865m;
            this.f865m = false;
            C0218v r0 = mo1051r0(0, false);
            if (r0 != null && r0.f914c) {
                if (!z) {
                    mo1035c0(r0, true);
                }
                return true;
            } else if (mo1001C0()) {
                return true;
            }
        } else if (i == 82) {
            mo1006H0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1006H0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            com.onedelhi.secure.t2 r0 = r4.f845a
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.e$v r2 = r4.mo1051r0(r5, r0)
            if (r5 != 0) goto L_0x0043
            com.onedelhi.secure.kg0 r5 = r4.f843a
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo1570g()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f826a
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            com.onedelhi.secure.kg0 r5 = r4.f843a
            boolean r5 = r5.mo1563c()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f868p
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.mo1013O0(r2, r6)
            if (r5 == 0) goto L_0x0062
            com.onedelhi.secure.kg0 r5 = r4.f843a
            boolean r0 = r5.mo1577h()
            goto L_0x0068
        L_0x003c:
            com.onedelhi.secure.kg0 r5 = r4.f843a
            boolean r0 = r5.mo1565d()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f914c
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f912b
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f908a
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f920f
            if (r5 == 0) goto L_0x005b
            r2.f908a = r1
            boolean r5 = r4.mo1013O0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.mo1010L0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.mo1035c0(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f826a
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0193e.mo1006H0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: I */
    public boolean mo973I(int i) {
        int Q0 = mo1015Q0(i);
        if (this.f863k && Q0 == 108) {
            return false;
        }
        if (this.f859g && Q0 == 1) {
            this.f859g = false;
        }
        if (Q0 == 1) {
            mo1020U0();
            this.f863k = true;
            return true;
        } else if (Q0 == 2) {
            mo1020U0();
            this.f857e = true;
            return true;
        } else if (Q0 == 5) {
            mo1020U0();
            this.f858f = true;
            return true;
        } else if (Q0 == 10) {
            mo1020U0();
            this.f861i = true;
            return true;
        } else if (Q0 == 108) {
            mo1020U0();
            this.f859g = true;
            return true;
        } else if (Q0 != 109) {
            return this.f832a.requestFeature(Q0);
        } else {
            mo1020U0();
            this.f860h = true;
            return true;
        }
    }

    /* renamed from: I0 */
    public void mo1007I0(int i) {
        ActionBar s;
        if (i == 108 && (s = mo992s()) != null) {
            s.mo746n(true);
        }
    }

    /* renamed from: J0 */
    public void mo1008J0(int i) {
        if (i == 108) {
            ActionBar s = mo992s();
            if (s != null) {
                s.mo746n(false);
            }
        } else if (i == 0) {
            C0218v r0 = mo1051r0(i, true);
            if (r0.f914c) {
                mo1035c0(r0, false);
            }
        }
    }

    /* renamed from: K */
    public void mo974K(int i) {
        mo1042j0();
        ViewGroup viewGroup = (ViewGroup) this.f831a.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f826a).inflate(i, viewGroup);
        this.f837a.mo1079c(this.f832a.getCallback());
    }

    /* renamed from: K0 */
    public void mo1009K0(ViewGroup viewGroup) {
    }

    /* renamed from: L */
    public void mo975L(View view) {
        mo1042j0();
        ViewGroup viewGroup = (ViewGroup) this.f831a.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f837a.mo1079c(this.f832a.getCallback());
    }

    /* renamed from: L0 */
    public final void mo1010L0(C0218v vVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!vVar.f914c && !this.f868p) {
            if (vVar.f901a == 0) {
                if ((this.f826a.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback u0 = mo1054u0();
            if (u0 == null || u0.onMenuOpened(vVar.f901a, vVar.f907a)) {
                WindowManager windowManager = (WindowManager) this.f826a.getSystemService("window");
                if (windowManager != null && mo1013O0(vVar, keyEvent)) {
                    ViewGroup viewGroup = vVar.f905a;
                    if (viewGroup == null || vVar.f918e) {
                        if (viewGroup == null) {
                            if (!mo1057x0(vVar) || vVar.f905a == null) {
                                return;
                            }
                        } else if (vVar.f918e && viewGroup.getChildCount() > 0) {
                            vVar.f905a.removeAllViews();
                        }
                        if (!mo1056w0(vVar) || !vVar.mo1108d()) {
                            vVar.f918e = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = vVar.f904a.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        vVar.f905a.setBackgroundResource(vVar.f909b);
                        ViewParent parent = vVar.f904a.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(vVar.f904a);
                        }
                        vVar.f905a.addView(vVar.f904a, layoutParams2);
                        if (!vVar.f904a.hasFocus()) {
                            vVar.f904a.requestFocus();
                        }
                    } else {
                        View view = vVar.f911b;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            vVar.f912b = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, vVar.f915d, vVar.f917e, 1002, 8519680, -3);
                            layoutParams3.gravity = vVar.f913c;
                            layoutParams3.windowAnimations = vVar.f919f;
                            windowManager.addView(vVar.f905a, layoutParams3);
                            vVar.f914c = true;
                            return;
                        }
                    }
                    i = -2;
                    vVar.f912b = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, vVar.f915d, vVar.f917e, 1002, 8519680, -3);
                    layoutParams32.gravity = vVar.f913c;
                    layoutParams32.windowAnimations = vVar.f919f;
                    windowManager.addView(vVar.f905a, layoutParams32);
                    vVar.f914c = true;
                    return;
                }
                return;
            }
            mo1035c0(vVar, true);
        }
    }

    /* renamed from: M */
    public void mo976M(View view, ViewGroup.LayoutParams layoutParams) {
        mo1042j0();
        ViewGroup viewGroup = (ViewGroup) this.f831a.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f837a.mo1079c(this.f832a.getCallback());
    }

    /* renamed from: M0 */
    public final ActionBar mo1011M0() {
        return this.f835a;
    }

    /* renamed from: N0 */
    public final boolean mo1012N0(C0218v vVar, int i, KeyEvent keyEvent, int i2) {
        C0248e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.f908a || mo1013O0(vVar, keyEvent)) && (eVar = vVar.f907a) != null) {
            z = eVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f843a == null) {
            mo1035c0(vVar, true);
        }
        return z;
    }

    /* renamed from: O */
    public void mo977O(boolean z) {
        this.f855c = z;
    }

    /* renamed from: O0 */
    public final boolean mo1013O0(C0218v vVar, KeyEvent keyEvent) {
        kg0 kg0;
        kg0 kg02;
        kg0 kg03;
        if (this.f868p) {
            return false;
        }
        if (vVar.f908a) {
            return true;
        }
        C0218v vVar2 = this.f839a;
        if (!(vVar2 == null || vVar2 == vVar)) {
            mo1035c0(vVar2, false);
        }
        Window.Callback u0 = mo1054u0();
        if (u0 != null) {
            vVar.f911b = u0.onCreatePanelView(vVar.f901a);
        }
        int i = vVar.f901a;
        boolean z = i == 0 || i == 108;
        if (z && (kg03 = this.f843a) != null) {
            kg03.setMenuPrepared();
        }
        if (vVar.f911b == null && (!z || !(mo1011M0() instanceof C0223g))) {
            C0248e eVar = vVar.f907a;
            if (eVar == null || vVar.f920f) {
                if (eVar == null && (!mo1058y0(vVar) || vVar.f907a == null)) {
                    return false;
                }
                if (z && this.f843a != null) {
                    if (this.f836a == null) {
                        this.f836a = new C0204j();
                    }
                    this.f843a.setMenu(vVar.f907a, this.f836a);
                }
                vVar.f907a.mo1351m0();
                if (!u0.onCreatePanelMenu(vVar.f901a, vVar.f907a)) {
                    vVar.mo1111g((C0248e) null);
                    if (z && (kg02 = this.f843a) != null) {
                        kg02.setMenu((Menu) null, this.f836a);
                    }
                    return false;
                }
                vVar.f920f = false;
            }
            vVar.f907a.mo1351m0();
            Bundle bundle = vVar.f910b;
            if (bundle != null) {
                vVar.f907a.mo1303T(bundle);
                vVar.f910b = null;
            }
            if (!u0.onPreparePanel(0, vVar.f911b, vVar.f907a)) {
                if (z && (kg0 = this.f843a) != null) {
                    kg0.setMenu((Menu) null, this.f836a);
                }
                vVar.f907a.mo1349l0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            vVar.f916d = z2;
            vVar.f907a.setQwertyMode(z2);
            vVar.f907a.mo1349l0();
        }
        vVar.f908a = true;
        vVar.f912b = false;
        this.f839a = vVar;
        return true;
    }

    @sj3(17)
    /* renamed from: P */
    public void mo978P(int i) {
        if (this.f873y != i) {
            this.f873y = i;
            if (this.f866n) {
                mo984e();
            }
        }
    }

    /* renamed from: P0 */
    public final void mo1014P0(boolean z) {
        kg0 kg0 = this.f843a;
        if (kg0 == null || !kg0.mo1570g() || (ViewConfiguration.get(this.f826a).hasPermanentMenuKey() && !this.f843a.mo1578i())) {
            C0218v r0 = mo1051r0(0, true);
            r0.f918e = true;
            mo1035c0(r0, false);
            mo1010L0(r0, (KeyEvent) null);
            return;
        }
        Window.Callback u0 = mo1054u0();
        if (this.f843a.mo1563c() && z) {
            this.f843a.mo1565d();
            if (!this.f868p) {
                u0.onPanelClosed(108, mo1051r0(0, true).f907a);
            }
        } else if (u0 != null && !this.f868p) {
            if (this.f871s && (this.f825A & 1) != 0) {
                this.f832a.getDecorView().removeCallbacks(this.f854b);
                this.f854b.run();
            }
            C0218v r02 = mo1051r0(0, true);
            C0248e eVar = r02.f907a;
            if (eVar != null && !r02.f920f && u0.onPreparePanel(0, r02.f911b, eVar)) {
                u0.onMenuOpened(108, r02.f907a);
                this.f843a.mo1577h();
            }
        }
    }

    /* renamed from: Q */
    public void mo979Q(Toolbar toolbar) {
        if (this.f853b instanceof Activity) {
            ActionBar s = mo992s();
            if (!(s instanceof C0229h)) {
                this.f829a = null;
                if (s != null) {
                    s.mo709J();
                }
                this.f835a = null;
                if (toolbar != null) {
                    C0223g gVar = new C0223g(toolbar, mo1053t0(), this.f837a);
                    this.f835a = gVar;
                    this.f837a.mo1083e(gVar.f928a);
                } else {
                    this.f837a.mo1083e((C0203i) null);
                }
                mo995v();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: Q0 */
    public final int mo1015Q0(int i) {
        if (i == 8) {
            Log.i(C0191d.f805b, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i(C0191d.f805b, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: R */
    public void mo980R(@e64 int i) {
        this.f874z = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f831a;
     */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1016R0() {
        /*
            r1 = this;
            boolean r0 = r1.f856d
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f831a
            if (r0 == 0) goto L_0x0010
            boolean r0 = com.onedelhi.secure.jt4.m18914U0(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0193e.mo1016R0():boolean");
    }

    /* renamed from: S */
    public final void mo981S(CharSequence charSequence) {
        this.f848a = charSequence;
        kg0 kg0 = this.f843a;
        if (kg0 != null) {
            kg0.setWindowTitle(charSequence);
        } else if (mo1011M0() != null) {
            mo1011M0().mo699B0(charSequence);
        } else {
            TextView textView = this.f834a;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: S0 */
    public final boolean mo1017S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f832a.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || jt4.m18896O0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: T */
    public C3563t2 mo982T(@mr2 C3563t2.C3564a aVar) {
        C1862c8 c8Var;
        if (aVar != null) {
            C3563t2 t2Var = this.f845a;
            if (t2Var != null) {
                t2Var.mo1150c();
            }
            C0205k kVar = new C0205k(aVar);
            ActionBar s = mo992s();
            if (s != null) {
                C3563t2 D0 = s.mo703D0(kVar);
                this.f845a = D0;
                if (!(D0 == null || (c8Var = this.f842a) == null)) {
                    c8Var.mo840L(D0);
                }
            }
            if (this.f845a == null) {
                this.f845a = mo1018T0(kVar);
            }
            return this.f845a;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.C3563t2 mo1018T0(@com.onedelhi.secure.mr2 com.onedelhi.secure.C3563t2.C3564a r8) {
        /*
            r7 = this;
            r7.mo1041i0()
            com.onedelhi.secure.t2 r0 = r7.f845a
            if (r0 == 0) goto L_0x000a
            r0.mo1150c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0193e.C0205k
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.e$k r0 = new androidx.appcompat.app.e$k
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            com.onedelhi.secure.c8 r0 = r7.f842a
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f868p
            if (r2 != 0) goto L_0x0022
            com.onedelhi.secure.t2 r0 = r0.mo837G(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f845a = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f841a
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f862j
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f826a
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = com.onedelhi.secure.za3.C4057b.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f826a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            com.onedelhi.secure.z70 r4 = new com.onedelhi.secure.z70
            android.content.Context r6 = r7.f826a
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f826a
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f841a = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = com.onedelhi.secure.za3.C4057b.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f833a = r5
            r6 = 2
            com.onedelhi.secure.q33.m25274d(r5, r6)
            android.widget.PopupWindow r5 = r7.f833a
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f841a
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f833a
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = com.onedelhi.secure.za3.C4057b.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f841a
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f833a
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.e$f r0 = new androidx.appcompat.app.e$f
            r0.<init>()
            r7.f849a = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f831a
            int r4 = com.onedelhi.secure.za3.C4062g.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo1045n0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo2461a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f841a = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f841a
            if (r0 == 0) goto L_0x015b
            r7.mo1041i0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f841a
            r0.mo1554t()
            com.onedelhi.secure.l24 r0 = new com.onedelhi.secure.l24
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f841a
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f841a
            android.widget.PopupWindow r6 = r7.f833a
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo1152e()
            boolean r8 = r8.mo1074a(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.mo1156k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f841a
            r8.mo1544q(r0)
            r7.f845a = r0
            boolean r8 = r7.mo1016R0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f841a
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f841a
            com.onedelhi.secure.vu4 r8 = com.onedelhi.secure.jt4.m18955g(r8)
            com.onedelhi.secure.vu4 r8 = r8.mo26354b(r0)
            r7.f847a = r8
            androidx.appcompat.app.e$g r0 = new androidx.appcompat.app.e$g
            r0.<init>()
            r8.mo26372u(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f841a
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f841a
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f841a
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f841a
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            com.onedelhi.secure.jt4.m19017v1(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f833a
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f832a
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f849a
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f845a = r1
        L_0x015b:
            com.onedelhi.secure.t2 r8 = r7.f845a
            if (r8 == 0) goto L_0x0166
            com.onedelhi.secure.c8 r0 = r7.f842a
            if (r0 == 0) goto L_0x0166
            r0.mo840L(r8)
        L_0x0166:
            com.onedelhi.secure.t2 r8 = r7.f845a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0193e.mo1018T0(com.onedelhi.secure.t2$a):com.onedelhi.secure.t2");
    }

    /* renamed from: U */
    public final boolean mo1019U(boolean z) {
        if (this.f868p) {
            return false;
        }
        int X = mo1025X();
        boolean W0 = mo1024W0(mo1000B0(this.f826a, X), z);
        if (X == 0) {
            mo1050q0(this.f826a).mo1099f();
        } else {
            C0213r rVar = this.f838a;
            if (rVar != null) {
                rVar.mo1097a();
            }
        }
        if (X == 3) {
            mo1046o0(this.f826a).mo1099f();
        } else {
            C0213r rVar2 = this.f852b;
            if (rVar2 != null) {
                rVar2.mo1097a();
            }
        }
        return W0;
    }

    /* renamed from: U0 */
    public final void mo1020U0() {
        if (this.f856d) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: V */
    public final void mo1021V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f831a.findViewById(16908290);
        View decorView = this.f832a.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f826a.obtainStyledAttributes(za3.C4068m.AppCompatTheme);
        obtainStyledAttributes.getValue(za3.C4068m.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(za3.C4068m.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i = za3.C4068m.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = za3.C4068m.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = za3.C4068m.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = za3.C4068m.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @ts2
    /* renamed from: V0 */
    public final AppCompatActivity mo1022V0() {
        Context context = this.f826a;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    /* renamed from: W */
    public final void mo1023W(@mr2 Window window) {
        if (this.f832a == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0211p)) {
                C0211p pVar = new C0211p(callback);
                this.f837a = pVar;
                window.setCallback(pVar);
                af4 F = af4.m11109F(this.f826a, (AttributeSet) null, f819a);
                Drawable i = F.mo13038i(0);
                if (i != null) {
                    window.setBackgroundDrawable(i);
                }
                F.mo13029I();
                this.f832a = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: W0 */
    public final boolean mo1024W0(int i, boolean z) {
        boolean z2 = false;
        Configuration d0 = mo1036d0(this.f826a, i, (Configuration) null, false);
        boolean A0 = mo999A0(this.f826a);
        Configuration configuration = this.f827a;
        if (configuration == null) {
            configuration = this.f826a.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = d0.uiMode & 48;
        boolean z3 = true;
        if (i2 != i3 && z && !A0 && this.f866n && (f822v || this.f867o)) {
            Object obj = this.f853b;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                C3962y2.m31857E((Activity) this.f853b);
                z2 = true;
            }
        }
        if (z2 || i2 == i3) {
            z3 = z2;
        } else {
            mo1026X0(i3, A0, (Configuration) null);
        }
        if (z3) {
            Object obj2 = this.f853b;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).mo846Q0(i);
            }
        }
        return z3;
    }

    /* renamed from: X */
    public final int mo1025X() {
        int i = this.f873y;
        return i != -100 ? i : C0191d.m1376o();
    }

    /* renamed from: X0 */
    public final void mo1026X0(int i, boolean z, @ts2 Configuration configuration) {
        Resources resources = this.f826a.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            cl3.m12601a(resources);
        }
        int i3 = this.f874z;
        if (i3 != 0) {
            this.f826a.setTheme(i3);
            if (i2 >= 23) {
                this.f826a.getTheme().applyStyle(this.f874z, true);
            }
        }
        if (z) {
            Object obj = this.f853b;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof a32) {
                    if (!((a32) activity).getLifecycle().mo4959b().mo4962a(C0690e.C0693c.CREATED)) {
                        return;
                    }
                } else if (!this.f867o || this.f868p) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    /* renamed from: Y */
    public void mo1027Y(int i, C0218v vVar, Menu menu) {
        if (menu == null) {
            if (vVar == null && i >= 0) {
                C0218v[] vVarArr = this.f850a;
                if (i < vVarArr.length) {
                    vVar = vVarArr[i];
                }
            }
            if (vVar != null) {
                menu = vVar.f907a;
            }
        }
        if ((vVar == null || vVar.f914c) && !this.f868p) {
            this.f837a.mo1080d(this.f832a.getCallback(), i, menu);
        }
    }

    /* renamed from: Y0 */
    public final int mo1028Y0(@ts2 sx4 sx4, @ts2 Rect rect) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
        int r = sx4 != null ? sx4.mo24605r() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f841a;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f841a.getLayoutParams();
            boolean z3 = true;
            if (this.f841a.isShown()) {
                if (this.f828a == null) {
                    this.f828a = new Rect();
                    this.f851b = new Rect();
                }
                Rect rect2 = this.f828a;
                Rect rect3 = this.f851b;
                if (sx4 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(sx4.mo24603p(), sx4.mo24605r(), sx4.mo24604q(), sx4.mo24602o());
                }
                rv4.m27092a(this.f831a, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                sx4 o0 = jt4.m18988o0(this.f831a);
                int p = o0 == null ? 0 : o0.mo24603p();
                int q = o0 == null ? 0 : o0.mo24604q();
                if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i3;
                    marginLayoutParams2.leftMargin = i4;
                    marginLayoutParams2.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.f830a != null) {
                    View view = this.f830a;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == p && marginLayoutParams.rightMargin == q))) {
                        marginLayoutParams.height = i;
                        marginLayoutParams.leftMargin = p;
                        marginLayoutParams.rightMargin = q;
                        this.f830a.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f826a);
                    this.f830a = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = p;
                    layoutParams.rightMargin = q;
                    this.f831a.addView(this.f830a, -1, layoutParams);
                }
                View view3 = this.f830a;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    mo1030Z0(this.f830a);
                }
                if (!this.f861i && z3) {
                    r = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f841a.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f830a;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return r;
    }

    /* renamed from: Z */
    public void mo1029Z(@mr2 C0248e eVar) {
        if (!this.f864l) {
            this.f864l = true;
            this.f843a.mo1579j();
            Window.Callback u0 = mo1054u0();
            if (u0 != null && !this.f868p) {
                u0.onPanelClosed(108, eVar);
            }
            this.f864l = false;
        }
    }

    /* renamed from: Z0 */
    public final void mo1030Z0(View view) {
        int i;
        Context context;
        if ((jt4.m18852C0(view) & 8192) != 0) {
            context = this.f826a;
            i = za3.C4059d.abc_decor_view_status_guard_light;
        } else {
            context = this.f826a;
            i = za3.C4059d.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(r70.m26353f(context, i));
    }

    /* renamed from: a */
    public void mo1031a(@mr2 C0248e eVar) {
        mo1014P0(true);
    }

    /* renamed from: a0 */
    public final void mo1032a0() {
        C0213r rVar = this.f838a;
        if (rVar != null) {
            rVar.mo1097a();
        }
        C0213r rVar2 = this.f852b;
        if (rVar2 != null) {
            rVar2.mo1097a();
        }
    }

    /* renamed from: b */
    public boolean mo1033b(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
        C0218v l0;
        Window.Callback u0 = mo1054u0();
        if (u0 == null || this.f868p || (l0 = mo1044l0(eVar.mo1290G())) == null) {
            return false;
        }
        return u0.onMenuItemSelected(l0.f901a, menuItem);
    }

    /* renamed from: b0 */
    public void mo1034b0(int i) {
        mo1035c0(mo1051r0(i, true), true);
    }

    /* renamed from: c0 */
    public void mo1035c0(C0218v vVar, boolean z) {
        ViewGroup viewGroup;
        kg0 kg0;
        if (!z || vVar.f901a != 0 || (kg0 = this.f843a) == null || !kg0.mo1563c()) {
            WindowManager windowManager = (WindowManager) this.f826a.getSystemService("window");
            if (!(windowManager == null || !vVar.f914c || (viewGroup = vVar.f905a) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo1027Y(vVar.f901a, vVar, (Menu) null);
                }
            }
            vVar.f908a = false;
            vVar.f912b = false;
            vVar.f914c = false;
            vVar.f904a = null;
            vVar.f918e = true;
            if (this.f839a == vVar) {
                this.f839a = null;
                return;
            }
            return;
        }
        mo1029Z(vVar.f907a);
    }

    /* renamed from: d */
    public void mo983d(View view, ViewGroup.LayoutParams layoutParams) {
        mo1042j0();
        ((ViewGroup) this.f831a.findViewById(16908290)).addView(view, layoutParams);
        this.f837a.mo1079c(this.f832a.getCallback());
    }

    @mr2
    /* renamed from: d0 */
    public final Configuration mo1036d0(@mr2 Context context, int i, @ts2 Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: e */
    public boolean mo984e() {
        return mo1019U(true);
    }

    /* renamed from: e0 */
    public final ViewGroup mo1037e0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f826a.obtainStyledAttributes(za3.C4068m.AppCompatTheme);
        int i = za3.C4068m.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(za3.C4068m.AppCompatTheme_windowNoTitle, false)) {
                mo973I(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo973I(108);
            }
            if (obtainStyledAttributes.getBoolean(za3.C4068m.AppCompatTheme_windowActionBarOverlay, false)) {
                mo973I(109);
            }
            if (obtainStyledAttributes.getBoolean(za3.C4068m.AppCompatTheme_windowActionModeOverlay, false)) {
                mo973I(10);
            }
            this.f862j = obtainStyledAttributes.getBoolean(za3.C4068m.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            mo1043k0();
            this.f832a.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f826a);
            if (this.f863k) {
                viewGroup = (ViewGroup) from.inflate(this.f861i ? za3.C4065j.abc_screen_simple_overlay_action_mode : za3.C4065j.abc_screen_simple, (ViewGroup) null);
            } else if (this.f862j) {
                viewGroup = (ViewGroup) from.inflate(za3.C4065j.abc_dialog_title_material, (ViewGroup) null);
                this.f860h = false;
                this.f859g = false;
            } else if (this.f859g) {
                TypedValue typedValue = new TypedValue();
                this.f826a.getTheme().resolveAttribute(za3.C4057b.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new z70(this.f826a, typedValue.resourceId) : this.f826a).inflate(za3.C4065j.abc_screen_toolbar, (ViewGroup) null);
                kg0 kg0 = (kg0) viewGroup.findViewById(za3.C4062g.decor_content_parent);
                this.f843a = kg0;
                kg0.setWindowCallback(mo1054u0());
                if (this.f860h) {
                    this.f843a.mo1600q(109);
                }
                if (this.f857e) {
                    this.f843a.mo1600q(2);
                }
                if (this.f858f) {
                    this.f843a.mo1600q(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                jt4.m18934a2(viewGroup, new C0196c());
                if (this.f843a == null) {
                    this.f834a = (TextView) viewGroup.findViewById(za3.C4062g.title);
                }
                rv4.m27094c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(za3.C4062g.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f832a.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f832a.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0198e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f859g + ", windowActionBarOverlay: " + this.f860h + ", android:windowIsFloating: " + this.f862j + ", windowActionModeOverlay: " + this.f861i + ", windowNoTitle: " + this.f863k + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: f0 */
    public void mo1038f0() {
        C0248e eVar;
        kg0 kg0 = this.f843a;
        if (kg0 != null) {
            kg0.mo1579j();
        }
        if (this.f833a != null) {
            this.f832a.getDecorView().removeCallbacks(this.f849a);
            if (this.f833a.isShowing()) {
                try {
                    this.f833a.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f833a = null;
        }
        mo1041i0();
        C0218v r0 = mo1051r0(0, false);
        if (r0 != null && (eVar = r0.f907a) != null) {
            eVar.close();
        }
    }

    /* renamed from: g0 */
    public boolean mo1039g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f853b;
        boolean z = true;
        if (((obj instanceof qy1.C3350a) || (obj instanceof C2223g8)) && (decorView = this.f832a.getDecorView()) != null && qy1.m26228d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f837a.mo1078b(this.f832a.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo1002D0(keyCode, keyEvent) : mo1005G0(keyCode, keyEvent);
    }

    @mr2
    @C3740us
    /* renamed from: h */
    public Context mo986h(@mr2 Context context) {
        boolean z = true;
        this.f866n = true;
        int B0 = mo1000B0(context, mo1025X());
        Configuration configuration = null;
        boolean z2 = false;
        if (f823w && (context instanceof ContextThemeWrapper)) {
            try {
                C0216t.m1544a((ContextThemeWrapper) context, mo1036d0(context, B0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof z70) {
            try {
                ((z70) context).mo27819a(mo1036d0(context, B0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f822v) {
            return super.mo986h(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C0207l.m1522a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m1410m0(configuration3, configuration4);
        }
        Configuration d0 = mo1036d0(context, B0, configuration, true);
        z70 z70 = new z70(context, za3.C4067l.Theme_AppCompat_Empty);
        z70.mo27819a(d0);
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            zk3.C4110h.m33230a(z70.getTheme());
        }
        return super.mo986h(z70);
    }

    /* renamed from: h0 */
    public void mo1040h0(int i) {
        C0218v r0;
        C0218v r02 = mo1051r0(i, true);
        if (r02.f907a != null) {
            Bundle bundle = new Bundle();
            r02.f907a.mo1305V(bundle);
            if (bundle.size() > 0) {
                r02.f910b = bundle;
            }
            r02.f907a.mo1351m0();
            r02.f907a.clear();
        }
        r02.f920f = true;
        r02.f918e = true;
        if ((i == 108 || i == 0) && this.f843a != null && (r0 = mo1051r0(0, false)) != null) {
            r0.f908a = false;
            mo1013O0(r0, (KeyEvent) null);
        }
    }

    /* renamed from: i0 */
    public void mo1041i0() {
        vu4 vu4 = this.f847a;
        if (vu4 != null) {
            vu4.mo26356d();
        }
    }

    /* renamed from: j0 */
    public final void mo1042j0() {
        if (!this.f856d) {
            this.f831a = mo1037e0();
            CharSequence t0 = mo1053t0();
            if (!TextUtils.isEmpty(t0)) {
                kg0 kg0 = this.f843a;
                if (kg0 != null) {
                    kg0.setWindowTitle(t0);
                } else if (mo1011M0() != null) {
                    mo1011M0().mo699B0(t0);
                } else {
                    TextView textView = this.f834a;
                    if (textView != null) {
                        textView.setText(t0);
                    }
                }
            }
            mo1021V();
            mo1009K0(this.f831a);
            this.f856d = true;
            C0218v r0 = mo1051r0(0, false);
            if (this.f868p) {
                return;
            }
            if (r0 == null || r0.f907a == null) {
                mo1059z0(108);
            }
        }
    }

    /* renamed from: k0 */
    public final void mo1043k0() {
        if (this.f832a == null) {
            Object obj = this.f853b;
            if (obj instanceof Activity) {
                mo1023W(((Activity) obj).getWindow());
            }
        }
        if (this.f832a == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: l0 */
    public C0218v mo1044l0(Menu menu) {
        C0218v[] vVarArr = this.f850a;
        int length = vVarArr != null ? vVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0218v vVar = vVarArr[i];
            if (vVar != null && vVar.f907a == menu) {
                return vVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public View mo987m(View view, String str, @mr2 Context context, @mr2 AttributeSet attributeSet) {
        boolean z;
        C3767v8 v8Var;
        boolean z2 = false;
        if (this.f846a == null) {
            String string = this.f826a.obtainStyledAttributes(za3.C4068m.AppCompatTheme).getString(za3.C4068m.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                v8Var = new C3767v8();
            } else {
                try {
                    this.f846a = (C3767v8) this.f826a.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i(C0191d.f805b, "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    v8Var = new C3767v8();
                }
            }
            this.f846a = v8Var;
        }
        boolean z3 = f821u;
        if (z3) {
            if (this.f844a == null) {
                this.f844a = new p12();
            }
            if (this.f844a.mo22202a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z2 = mo1017S0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.f846a.mo25896r(view, str, context, attributeSet, z, z3, true, ms4.m21939d());
    }

    @ts2
    /* renamed from: n */
    public <T extends View> T mo988n(@mo1 int i) {
        mo1042j0();
        return this.f832a.findViewById(i);
    }

    /* renamed from: n0 */
    public final Context mo1045n0() {
        ActionBar s = mo992s();
        Context A = s != null ? s.mo696A() : null;
        return A == null ? this.f826a : A;
    }

    /* renamed from: o0 */
    public final C0213r mo1046o0(@mr2 Context context) {
        if (this.f852b == null) {
            this.f852b = new C0212q(context);
        }
        return this.f852b;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo987m(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public final C0180a.C0182b mo989p() {
        return new C0202h();
    }

    @hw4
    @mr2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: p0 */
    public final C0213r mo1049p0() {
        return mo1050q0(this.f826a);
    }

    /* renamed from: q */
    public int mo990q() {
        return this.f873y;
    }

    /* renamed from: q0 */
    public final C0213r mo1050q0(@mr2 Context context) {
        if (this.f838a == null) {
            this.f838a = new C0215s(aj4.m11229a(context));
        }
        return this.f838a;
    }

    /* renamed from: r */
    public MenuInflater mo991r() {
        if (this.f829a == null) {
            mo1055v0();
            ActionBar actionBar = this.f835a;
            this.f829a = new h74(actionBar != null ? actionBar.mo696A() : this.f826a);
        }
        return this.f829a;
    }

    /* renamed from: r0 */
    public C0218v mo1051r0(int i, boolean z) {
        C0218v[] vVarArr = this.f850a;
        if (vVarArr == null || vVarArr.length <= i) {
            C0218v[] vVarArr2 = new C0218v[(i + 1)];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.f850a = vVarArr2;
            vVarArr = vVarArr2;
        }
        C0218v vVar = vVarArr[i];
        if (vVar != null) {
            return vVar;
        }
        C0218v vVar2 = new C0218v(i);
        vVarArr[i] = vVar2;
        return vVar2;
    }

    /* renamed from: s */
    public ActionBar mo992s() {
        mo1055v0();
        return this.f835a;
    }

    /* renamed from: s0 */
    public ViewGroup mo1052s0() {
        return this.f831a;
    }

    /* renamed from: t */
    public boolean mo993t(int i) {
        int Q0 = mo1015Q0(i);
        return (Q0 != 1 ? Q0 != 2 ? Q0 != 5 ? Q0 != 10 ? Q0 != 108 ? Q0 != 109 ? false : this.f860h : this.f859g : this.f861i : this.f858f : this.f857e : this.f863k) || this.f832a.hasFeature(i);
    }

    /* renamed from: t0 */
    public final CharSequence mo1053t0() {
        Object obj = this.f853b;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f848a;
    }

    /* renamed from: u */
    public void mo994u() {
        LayoutInflater from = LayoutInflater.from(this.f826a);
        if (from.getFactory() == null) {
            q12.m25254d(from, this);
        } else if (!(from.getFactory2() instanceof C0193e)) {
            Log.i(C0191d.f805b, "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: u0 */
    public final Window.Callback mo1054u0() {
        return this.f832a.getCallback();
    }

    /* renamed from: v */
    public void mo995v() {
        if (mo1011M0() != null && !mo992s().mo702D()) {
            mo1059z0(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1055v0() {
        /*
            r3 = this;
            r3.mo1042j0()
            boolean r0 = r3.f859g
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.ActionBar r0 = r3.f835a
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f853b
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.h r0 = new androidx.appcompat.app.h
            java.lang.Object r1 = r3.f853b
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f860h
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f835a = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.h r0 = new androidx.appcompat.app.h
            java.lang.Object r1 = r3.f853b
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>((android.app.Dialog) r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.ActionBar r0 = r3.f835a
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f872t
            r0.mo723X(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0193e.mo1055v0():void");
    }

    /* renamed from: w0 */
    public final boolean mo1056w0(C0218v vVar) {
        View view = vVar.f911b;
        if (view != null) {
            vVar.f904a = view;
            return true;
        } else if (vVar.f907a == null) {
            return false;
        } else {
            if (this.f840a == null) {
                this.f840a = new C0221w();
            }
            View view2 = (View) vVar.mo1107c(this.f840a);
            vVar.f904a = view2;
            return view2 != null;
        }
    }

    /* renamed from: x */
    public boolean mo996x() {
        return this.f855c;
    }

    /* renamed from: x0 */
    public final boolean mo1057x0(C0218v vVar) {
        vVar.mo1112h(mo1045n0());
        vVar.f905a = new C0217u(vVar.f902a);
        vVar.f913c = 81;
        return true;
    }

    /* renamed from: y */
    public void mo997y(Configuration configuration) {
        ActionBar s;
        if (this.f859g && this.f856d && (s = mo992s()) != null) {
            s.mo708I(configuration);
        }
        C2416i8.m17330b().mo17665g(this.f826a);
        this.f827a = new Configuration(this.f826a.getResources().getConfiguration());
        mo1019U(false);
        configuration.updateFrom(this.f826a.getResources().getConfiguration());
    }

    /* renamed from: y0 */
    public final boolean mo1058y0(C0218v vVar) {
        Context context = this.f826a;
        int i = vVar.f901a;
        if ((i == 0 || i == 108) && this.f843a != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(za3.C4057b.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(za3.C4057b.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(za3.C4057b.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                z70 z70 = new z70(context, 0);
                z70.getTheme().setTo(theme2);
                context = z70;
            }
        }
        C0248e eVar = new C0248e(context);
        eVar.mo1307X(this);
        vVar.mo1111g(eVar);
        return true;
    }

    /* renamed from: z */
    public void mo998z(Bundle bundle) {
        this.f866n = true;
        mo1019U(false);
        mo1043k0();
        Object obj = this.f853b;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = kn2.m19947d((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar M0 = mo1011M0();
                if (M0 == null) {
                    this.f872t = true;
                } else {
                    M0.mo723X(true);
                }
            }
            C0191d.m1370c(this);
        }
        this.f827a = new Configuration(this.f826a.getResources().getConfiguration());
        this.f867o = true;
    }

    /* renamed from: z0 */
    public final void mo1059z0(int i) {
        this.f825A = (1 << i) | this.f825A;
        if (!this.f871s) {
            jt4.m18993p1(this.f832a.getDecorView(), this.f854b);
            this.f871s = true;
        }
    }
}
