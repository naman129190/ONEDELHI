package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0247d;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.onedelhi.secure.fh2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.qp0;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import java.lang.reflect.Method;

@hl3({hl3.C2354a.f13188c})
public class MenuPopupWindow extends ListPopupWindow implements fh2 {

    /* renamed from: c */
    public static final String f1509c = "MenuPopupWindow";

    /* renamed from: d */
    public static Method f1510d;

    /* renamed from: a */
    public fh2 f1511a;

    @hl3({hl3.C2354a.f13188c})
    public static class MenuDropDownListView extends qp0 {

        /* renamed from: a */
        public MenuItem f1512a;

        /* renamed from: a */
        public fh2 f1513a;

        /* renamed from: u */
        public final int f1514u;

        /* renamed from: v */
        public final int f1515v;

        @sj3(17)
        /* renamed from: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView$a */
        public static class C0310a {
            @pn0
            /* renamed from: a */
            public static int m2305a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == C0310a.m2305a(context.getResources().getConfiguration())) {
                this.f1514u = 21;
                this.f1515v = 22;
                return;
            }
            this.f1514u = 22;
            this.f1515v = 21;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo2091d(int i, boolean z) {
            return super.mo2091d(i, z);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ int mo2092e(int i, int i2, int i3, int i4, int i5) {
            return super.mo2092e(i, i2, i3, i4, i5);
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ boolean mo2093f(MotionEvent motionEvent, int i) {
            return super.mo2093f(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        /* renamed from: n */
        public void mo2098n() {
            setSelection(-1);
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1513a != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0247d dVar = (C0247d) adapter;
                C0253h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < dVar.getCount()) {
                    hVar = dVar.getItem(i2);
                }
                MenuItem menuItem = this.f1512a;
                if (menuItem != hVar) {
                    C0248e b = dVar.mo1276b();
                    if (menuItem != null) {
                        this.f1513a.mo1258p(b, menuItem);
                    }
                    this.f1512a = hVar;
                    if (hVar != null) {
                        this.f1513a.mo1257k(b, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1514u) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1515v) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C0247d) adapter).mo1276b().mo1332f(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(fh2 fh2) {
            this.f1513a = fh2;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    @sj3(23)
    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$a */
    public static class C0311a {
        @pn0
        /* renamed from: a */
        public static void m2306a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @pn0
        /* renamed from: b */
        public static void m2307b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @sj3(29)
    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$b */
    public static class C0312b {
        @pn0
        /* renamed from: a */
        public static void m2308a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1510d = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i(f1509c, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: k */
    public void mo1257k(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
        fh2 fh2 = this.f1511a;
        if (fh2 != null) {
            fh2.mo1257k(eVar, menuItem);
        }
    }

    /* renamed from: p */
    public void mo1258p(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
        fh2 fh2 = this.f1511a;
        if (fh2 != null) {
            fh2.mo1258p(eVar, menuItem);
        }
    }

    /* renamed from: p0 */
    public void mo2087p0(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0311a.m2306a(this.f1478a, (Transition) obj);
        }
    }

    /* renamed from: q0 */
    public void mo2088q0(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0311a.m2307b(this.f1478a, (Transition) obj);
        }
    }

    /* renamed from: r0 */
    public void mo2089r0(fh2 fh2) {
        this.f1511a = fh2;
    }

    /* renamed from: s0 */
    public void mo2090s0(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1510d;
            if (method != null) {
                try {
                    method.invoke(this.f1478a, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i(f1509c, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0312b.m2308a(this.f1478a, z);
        }
    }

    @mr2
    /* renamed from: u */
    public qp0 mo2070u(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
