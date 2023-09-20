package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0180a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.onedelhi.secure.C1862c8;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.ga4;
import com.onedelhi.secure.kn2;
import com.onedelhi.secure.kv4;
import com.onedelhi.secure.m70;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ms4;
import com.onedelhi.secure.mv4;
import com.onedelhi.secure.ov4;
import com.onedelhi.secure.ru2;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.ts2;

public class AppCompatActivity extends FragmentActivity implements C1862c8, ga4.C2225b, C0180a.C0183c {

    /* renamed from: d */
    public static final String f771d = "androidx:appcompat";

    /* renamed from: a */
    public Resources f772a;

    /* renamed from: a */
    public C0191d f773a;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    public class C0178a implements br3.C1803c {
        public C0178a() {
        }

        @mr2
        /* renamed from: a */
        public Bundle mo879a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.mo841M0().mo970D(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    public class C0179b implements ru2 {
        public C0179b() {
        }

        /* renamed from: a */
        public void mo880a(@mr2 Context context) {
            C0191d M0 = AppCompatActivity.this.mo841M0();
            M0.mo994u();
            M0.mo998z(AppCompatActivity.this.getSavedStateRegistry().mo13796b(AppCompatActivity.f771d));
        }
    }

    public AppCompatActivity() {
        mo844O0();
    }

    @m70
    public AppCompatActivity(@s12 int i) {
        super(i);
        mo844O0();
    }

    /* renamed from: q0 */
    private void m1241q0() {
        kv4.m20051b(getWindow().getDecorView(), this);
        ov4.m24127b(getWindow().getDecorView(), this);
        mv4.m22038b(getWindow().getDecorView(), this);
    }

    @ts2
    /* renamed from: G */
    public C3563t2 mo837G(@mr2 C3563t2.C3564a aVar) {
        return null;
    }

    @ts2
    /* renamed from: I */
    public Intent mo838I() {
        return kn2.m19944a(this);
    }

    /* renamed from: J0 */
    public void mo839J0() {
        mo841M0().mo995v();
    }

    @C3740us
    /* renamed from: L */
    public void mo840L(@mr2 C3563t2 t2Var) {
    }

    @mr2
    /* renamed from: M0 */
    public C0191d mo841M0() {
        if (this.f773a == null) {
            this.f773a = C0191d.m1372i(this, this);
        }
        return this.f773a;
    }

    @ts2
    /* renamed from: N */
    public C0180a.C0182b mo842N() {
        return mo841M0().mo989p();
    }

    @ts2
    /* renamed from: N0 */
    public ActionBar mo843N0() {
        return mo841M0().mo992s();
    }

    /* renamed from: O0 */
    public final void mo844O0() {
        getSavedStateRegistry().mo13803j(f771d, new C0178a());
        mo626b0(new C0179b());
    }

    /* renamed from: P0 */
    public void mo845P0(@mr2 ga4 ga4) {
        ga4.mo16437f(this);
    }

    /* renamed from: Q0 */
    public void mo846Q0(int i) {
    }

    /* renamed from: R0 */
    public void mo847R0(@mr2 ga4 ga4) {
    }

    @Deprecated
    /* renamed from: S0 */
    public void mo848S0() {
    }

    /* renamed from: T0 */
    public boolean mo849T0() {
        Intent I = mo838I();
        if (I == null) {
            return false;
        }
        if (mo861d1(I)) {
            ga4 j = ga4.m15633j(this);
            mo845P0(j);
            mo847R0(j);
            j.mo16447u();
            try {
                C3962y2.m31870w(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo858b1(I);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo850U0(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.mo850U0(android.view.KeyEvent):boolean");
    }

    /* renamed from: V0 */
    public void mo851V0(@ts2 Toolbar toolbar) {
        mo841M0().mo979Q(toolbar);
    }

    @Deprecated
    /* renamed from: W0 */
    public void mo852W0(int i) {
    }

    @Deprecated
    /* renamed from: X0 */
    public void mo853X0(boolean z) {
    }

    @Deprecated
    /* renamed from: Y0 */
    public void mo854Y0(boolean z) {
    }

    @Deprecated
    /* renamed from: Z0 */
    public void mo855Z0(boolean z) {
    }

    @ts2
    /* renamed from: a1 */
    public C3563t2 mo856a1(@mr2 C3563t2.C3564a aVar) {
        return mo841M0().mo982T(aVar);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1241q0();
        mo841M0().mo983d(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo841M0().mo986h(context));
    }

    /* renamed from: b1 */
    public void mo858b1(@mr2 Intent intent) {
        kn2.m19950g(this, intent);
    }

    /* renamed from: c1 */
    public boolean mo859c1(int i) {
        return mo841M0().mo973I(i);
    }

    public void closeOptionsMenu() {
        ActionBar N0 = mo843N0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (N0 == null || !N0.mo742l()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d1 */
    public boolean mo861d1(@mr2 Intent intent) {
        return kn2.m19951h(this, intent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar N0 = mo843N0();
        if (keyCode != 82 || N0 == null || !N0.mo711L(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(@mo1 int i) {
        return mo841M0().mo988n(i);
    }

    @mr2
    public MenuInflater getMenuInflater() {
        return mo841M0().mo991r();
    }

    public Resources getResources() {
        if (this.f772a == null && ms4.m21939d()) {
            this.f772a = new ms4(this, super.getResources());
        }
        Resources resources = this.f772a;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo841M0().mo995v();
    }

    public void onConfigurationChanged(@mr2 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo841M0().mo997y(configuration);
        if (this.f772a != null) {
            this.f772a.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo848S0();
    }

    public void onDestroy() {
        super.onDestroy();
        mo841M0().mo967A();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (mo850U0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, @mr2 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar N0 = mo843N0();
        if (menuItem.getItemId() != 16908332 || N0 == null || (N0.mo750p() & 4) == 0) {
            return false;
        }
        return mo849T0();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, @mr2 Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(@ts2 Bundle bundle) {
        super.onPostCreate(bundle);
        mo841M0().mo968B(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        mo841M0().mo969C();
    }

    public void onStart() {
        super.onStart();
        mo841M0().mo971E();
    }

    public void onStop() {
        super.onStop();
        mo841M0().mo972F();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo841M0().mo981S(charSequence);
    }

    public void openOptionsMenu() {
        ActionBar N0 = mo843N0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (N0 == null || !N0.mo712M()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(@s12 int i) {
        m1241q0();
        mo841M0().mo974K(i);
    }

    public void setContentView(View view) {
        m1241q0();
        mo841M0().mo975L(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1241q0();
        mo841M0().mo976M(view, layoutParams);
    }

    public void setTheme(@e64 int i) {
        super.setTheme(i);
        mo841M0().mo980R(i);
    }

    @C3740us
    /* renamed from: y */
    public void mo878y(@mr2 C3563t2 t2Var) {
    }
}
