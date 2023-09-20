package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.la1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.my3;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.q33;
import com.onedelhi.secure.qp0;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;
import java.lang.reflect.Method;

public class ListPopupWindow implements my3 {

    /* renamed from: A */
    public static final int f1456A = 0;

    /* renamed from: B */
    public static final int f1457B = 1;

    /* renamed from: C */
    public static final int f1458C = 2;

    /* renamed from: a */
    public static Method f1459a = null;

    /* renamed from: b */
    public static final String f1460b = "ListPopupWindow";

    /* renamed from: b */
    public static Method f1461b = null;

    /* renamed from: c */
    public static Method f1462c = null;

    /* renamed from: h */
    public static final boolean f1463h = false;

    /* renamed from: v */
    public static final int f1464v = 250;

    /* renamed from: w */
    public static final int f1465w = 0;

    /* renamed from: x */
    public static final int f1466x = 1;

    /* renamed from: y */
    public static final int f1467y = -1;

    /* renamed from: z */
    public static final int f1468z = -2;

    /* renamed from: a */
    public Context f1469a;

    /* renamed from: a */
    public DataSetObserver f1470a;

    /* renamed from: a */
    public final Rect f1471a;

    /* renamed from: a */
    public Drawable f1472a;

    /* renamed from: a */
    public final Handler f1473a;

    /* renamed from: a */
    public View f1474a;

    /* renamed from: a */
    public AdapterView.OnItemClickListener f1475a;

    /* renamed from: a */
    public AdapterView.OnItemSelectedListener f1476a;

    /* renamed from: a */
    public ListAdapter f1477a;

    /* renamed from: a */
    public PopupWindow f1478a;

    /* renamed from: a */
    public final C0305f f1479a;

    /* renamed from: a */
    public final C0307h f1480a;

    /* renamed from: a */
    public final C0308i f1481a;

    /* renamed from: a */
    public final C0309j f1482a;

    /* renamed from: a */
    public qp0 f1483a;

    /* renamed from: a */
    public Runnable f1484a;

    /* renamed from: b */
    public Rect f1485b;

    /* renamed from: b */
    public View f1486b;

    /* renamed from: b */
    public boolean f1487b;

    /* renamed from: c */
    public boolean f1488c;

    /* renamed from: d */
    public boolean f1489d;

    /* renamed from: e */
    public boolean f1490e;

    /* renamed from: f */
    public boolean f1491f;

    /* renamed from: g */
    public boolean f1492g;

    /* renamed from: n */
    public int f1493n;

    /* renamed from: o */
    public int f1494o;

    /* renamed from: p */
    public int f1495p;

    /* renamed from: q */
    public int f1496q;

    /* renamed from: r */
    public int f1497r;

    /* renamed from: s */
    public int f1498s;

    /* renamed from: t */
    public int f1499t;

    /* renamed from: u */
    public int f1500u;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    public class C0300a extends la1 {
        public C0300a(View view) {
            super(view);
        }

        /* renamed from: k */
        public ListPopupWindow mo1194b() {
            return ListPopupWindow.this;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    public class C0301b implements Runnable {
        public C0301b() {
        }

        public void run() {
            View v = ListPopupWindow.this.mo2071v();
            if (v != null && v.getWindowToken() != null) {
                ListPopupWindow.this.mo1237a();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    public class C0302c implements AdapterView.OnItemSelectedListener {
        public C0302c() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            qp0 qp0;
            if (i != -1 && (qp0 = ListPopupWindow.this.f1483a) != null) {
                qp0.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @sj3(24)
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    public static class C0303d {
        @pn0
        /* renamed from: a */
        public static int m2291a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    @sj3(29)
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    public static class C0304e {
        @pn0
        /* renamed from: a */
        public static void m2292a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @pn0
        /* renamed from: b */
        public static void m2293b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    public class C0305f implements Runnable {
        public C0305f() {
        }

        public void run() {
            ListPopupWindow.this.mo2068s();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    public class C0306g extends DataSetObserver {
        public C0306g() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.mo1238c()) {
                ListPopupWindow.this.mo1237a();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$h */
    public class C0307h implements AbsListView.OnScrollListener {
        public C0307h() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo2030K() && ListPopupWindow.this.f1478a.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1473a.removeCallbacks(listPopupWindow.f1482a);
                ListPopupWindow.this.f1482a.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$i */
    public class C0308i implements View.OnTouchListener {
        public C0308i() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f1478a) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f1478a.getWidth() && y >= 0 && y < ListPopupWindow.this.f1478a.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1473a.postDelayed(listPopupWindow.f1482a, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f1473a.removeCallbacks(listPopupWindow2.f1482a);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$j */
    public class C0309j implements Runnable {
        public C0309j() {
        }

        public void run() {
            qp0 qp0 = ListPopupWindow.this.f1483a;
            if (qp0 != null && jt4.m18896O0(qp0) && ListPopupWindow.this.f1483a.getCount() > ListPopupWindow.this.f1483a.getChildCount()) {
                int childCount = ListPopupWindow.this.f1483a.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f1499t) {
                    listPopupWindow.f1478a.setInputMethodMode(2);
                    ListPopupWindow.this.mo1237a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1459a = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i(f1460b, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1462c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i(f1460b, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1461b = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i(f1460b, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@mr2 Context context) {
        this(context, (AttributeSet) null, za3.C4057b.listPopupWindowStyle);
    }

    public ListPopupWindow(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.listPopupWindowStyle);
    }

    public ListPopupWindow(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        this.f1493n = -2;
        this.f1494o = -2;
        this.f1497r = 1002;
        this.f1498s = 0;
        this.f1490e = false;
        this.f1491f = false;
        this.f1499t = Integer.MAX_VALUE;
        this.f1500u = 0;
        this.f1482a = new C0309j();
        this.f1481a = new C0308i();
        this.f1480a = new C0307h();
        this.f1479a = new C0305f();
        this.f1471a = new Rect();
        this.f1469a = context;
        this.f1473a = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, za3.C4068m.ListPopupWindow, i, i2);
        this.f1495p = obtainStyledAttributes.getDimensionPixelOffset(za3.C4068m.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(za3.C4068m.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1496q = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1487b = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f1478a = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    /* renamed from: I */
    public static boolean m2229I(int i) {
        return i == 66 || i == 23;
    }

    /* renamed from: A */
    public final int mo2021A(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return C0303d.m2291a(this.f1478a, view, i, z);
        }
        Method method = f1461b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1478a, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i(f1460b, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1478a.getMaxAvailableHeight(view, i);
    }

    /* renamed from: B */
    public int mo2022B() {
        return this.f1500u;
    }

    @ts2
    /* renamed from: C */
    public Object mo2023C() {
        if (!mo1238c()) {
            return null;
        }
        return this.f1483a.getSelectedItem();
    }

    /* renamed from: D */
    public long mo2024D() {
        if (!mo1238c()) {
            return Long.MIN_VALUE;
        }
        return this.f1483a.getSelectedItemId();
    }

    /* renamed from: E */
    public int mo2025E() {
        if (!mo1238c()) {
            return -1;
        }
        return this.f1483a.getSelectedItemPosition();
    }

    @ts2
    /* renamed from: F */
    public View mo2026F() {
        if (!mo1238c()) {
            return null;
        }
        return this.f1483a.getSelectedView();
    }

    /* renamed from: G */
    public int mo2027G() {
        return this.f1478a.getSoftInputMode();
    }

    /* renamed from: H */
    public int mo2028H() {
        return this.f1494o;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: J */
    public boolean mo2029J() {
        return this.f1490e;
    }

    /* renamed from: K */
    public boolean mo2030K() {
        return this.f1478a.getInputMethodMode() == 2;
    }

    /* renamed from: L */
    public boolean mo2031L() {
        return this.f1492g;
    }

    /* renamed from: M */
    public boolean mo2032M(int i, @mr2 KeyEvent keyEvent) {
        if (mo1238c() && i != 62 && (this.f1483a.getSelectedItemPosition() >= 0 || !m2229I(i))) {
            int selectedItemPosition = this.f1483a.getSelectedItemPosition();
            boolean z = !this.f1478a.isAboveAnchor();
            ListAdapter listAdapter = this.f1477a;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int d = areAllItemsEnabled ? 0 : this.f1483a.mo2091d(0, true);
                int count = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.f1483a.mo2091d(listAdapter.getCount() - 1, false);
                i2 = d;
                i3 = count;
            }
            if ((!z || i != 19 || selectedItemPosition > i2) && (z || i != 20 || selectedItemPosition < i3)) {
                this.f1483a.setListSelectionHidden(false);
                if (this.f1483a.onKeyDown(i, keyEvent)) {
                    this.f1478a.setInputMethodMode(2);
                    this.f1483a.requestFocusFromTouch();
                    mo1237a();
                    if (i == 19 || i == 20 || i == 23 || i == 66) {
                        return true;
                    }
                } else if (!z || i != 20) {
                    return !z && i == 19 && selectedItemPosition == i2;
                } else {
                    if (selectedItemPosition == i3) {
                        return true;
                    }
                }
            } else {
                mo2068s();
                this.f1478a.setInputMethodMode(1);
                mo1237a();
                return true;
            }
        }
    }

    /* renamed from: N */
    public boolean mo2033N(int i, @mr2 KeyEvent keyEvent) {
        if (i != 4 || !mo1238c()) {
            return false;
        }
        View view = this.f1486b;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() != 1) {
            return false;
        } else {
            KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                return false;
            }
            dismiss();
            return true;
        }
    }

    /* renamed from: O */
    public boolean mo2034O(int i, @mr2 KeyEvent keyEvent) {
        if (!mo1238c() || this.f1483a.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f1483a.onKeyUp(i, keyEvent);
        if (onKeyUp && m2229I(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    /* renamed from: P */
    public boolean mo2035P(int i) {
        if (!mo1238c()) {
            return false;
        }
        if (this.f1475a == null) {
            return true;
        }
        qp0 qp0 = this.f1483a;
        int i2 = i;
        this.f1475a.onItemClick(qp0, qp0.getChildAt(i - qp0.getFirstVisiblePosition()), i2, qp0.getAdapter().getItemId(i));
        return true;
    }

    /* renamed from: Q */
    public void mo2036Q() {
        this.f1473a.post(this.f1484a);
    }

    /* renamed from: R */
    public final void mo2037R() {
        View view = this.f1474a;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1474a);
            }
        }
    }

    /* renamed from: S */
    public void mo2038S(@ts2 View view) {
        this.f1486b = view;
    }

    /* renamed from: T */
    public void mo2039T(@e64 int i) {
        this.f1478a.setAnimationStyle(i);
    }

    /* renamed from: U */
    public void mo2040U(int i) {
        Drawable background = this.f1478a.getBackground();
        if (background != null) {
            background.getPadding(this.f1471a);
            Rect rect = this.f1471a;
            this.f1494o = rect.left + rect.right + i;
            return;
        }
        mo2063n0(i);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: V */
    public void mo2041V(boolean z) {
        this.f1490e = z;
    }

    /* renamed from: W */
    public void mo2042W(int i) {
        this.f1498s = i;
    }

    /* renamed from: X */
    public void mo2043X(@ts2 Rect rect) {
        this.f1485b = rect != null ? new Rect(rect) : null;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: Y */
    public void mo2044Y(boolean z) {
        this.f1491f = z;
    }

    /* renamed from: Z */
    public void mo2045Z(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.f1493n = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    /* renamed from: a */
    public void mo1237a() {
        int r = mo2067r();
        boolean K = mo2030K();
        q33.m25274d(this.f1478a, this.f1497r);
        boolean z = true;
        if (!this.f1478a.isShowing()) {
            int i = this.f1494o;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo2071v().getWidth();
            }
            int i2 = this.f1493n;
            if (i2 == -1) {
                r = -1;
            } else if (i2 != -2) {
                r = i2;
            }
            this.f1478a.setWidth(i);
            this.f1478a.setHeight(r);
            mo2057i0(true);
            this.f1478a.setOutsideTouchable(!this.f1491f && !this.f1490e);
            this.f1478a.setTouchInterceptor(this.f1481a);
            if (this.f1489d) {
                q33.m25273c(this.f1478a, this.f1488c);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1462c;
                if (method != null) {
                    try {
                        method.invoke(this.f1478a, new Object[]{this.f1485b});
                    } catch (Exception e) {
                        Log.e(f1460b, "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                C0304e.m2292a(this.f1478a, this.f1485b);
            }
            q33.m25275e(this.f1478a, mo2071v(), this.f1495p, this.f1496q, this.f1498s);
            this.f1483a.setSelection(-1);
            if (!this.f1492g || this.f1483a.isInTouchMode()) {
                mo2068s();
            }
            if (!this.f1492g) {
                this.f1473a.post(this.f1479a);
            }
        } else if (jt4.m18896O0(mo2071v())) {
            int i3 = this.f1494o;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo2071v().getWidth();
            }
            int i4 = this.f1493n;
            if (i4 == -1) {
                if (!K) {
                    r = -1;
                }
                if (K) {
                    this.f1478a.setWidth(this.f1494o == -1 ? -1 : 0);
                    this.f1478a.setHeight(0);
                } else {
                    this.f1478a.setWidth(this.f1494o == -1 ? -1 : 0);
                    this.f1478a.setHeight(-1);
                }
            } else if (i4 != -2) {
                r = i4;
            }
            PopupWindow popupWindow = this.f1478a;
            if (this.f1491f || this.f1490e) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1478a.update(mo2071v(), this.f1495p, this.f1496q, i3 < 0 ? -1 : i3, r < 0 ? -1 : r);
        }
    }

    /* renamed from: a0 */
    public void mo2046a0(int i) {
        this.f1478a.setInputMethodMode(i);
    }

    /* renamed from: b */
    public void mo2047b(@ts2 Drawable drawable) {
        this.f1478a.setBackgroundDrawable(drawable);
    }

    /* renamed from: b0 */
    public void mo2048b0(int i) {
        this.f1499t = i;
    }

    /* renamed from: c */
    public boolean mo1238c() {
        return this.f1478a.isShowing();
    }

    /* renamed from: c0 */
    public void mo2049c0(Drawable drawable) {
        this.f1472a = drawable;
    }

    /* renamed from: d */
    public int mo2050d() {
        return this.f1495p;
    }

    /* renamed from: d0 */
    public void mo2051d0(boolean z) {
        this.f1492g = z;
        this.f1478a.setFocusable(z);
    }

    public void dismiss() {
        this.f1478a.dismiss();
        mo2037R();
        this.f1478a.setContentView((View) null);
        this.f1483a = null;
        this.f1473a.removeCallbacks(this.f1482a);
    }

    /* renamed from: e */
    public void mo1884e(@ts2 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1470a;
        if (dataSetObserver == null) {
            this.f1470a = new C0306g();
        } else {
            ListAdapter listAdapter2 = this.f1477a;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1477a = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1470a);
        }
        qp0 qp0 = this.f1483a;
        if (qp0 != null) {
            qp0.setAdapter(this.f1477a);
        }
    }

    /* renamed from: e0 */
    public void mo2052e0(@ts2 PopupWindow.OnDismissListener onDismissListener) {
        this.f1478a.setOnDismissListener(onDismissListener);
    }

    /* renamed from: f0 */
    public void mo2053f0(@ts2 AdapterView.OnItemClickListener onItemClickListener) {
        this.f1475a = onItemClickListener;
    }

    @ts2
    /* renamed from: g */
    public Drawable mo2054g() {
        return this.f1478a.getBackground();
    }

    /* renamed from: g0 */
    public void mo2055g0(@ts2 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1476a = onItemSelectedListener;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: h0 */
    public void mo2056h0(boolean z) {
        this.f1489d = true;
        this.f1488c = z;
    }

    /* renamed from: i0 */
    public final void mo2057i0(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1459a;
            if (method != null) {
                try {
                    method.invoke(this.f1478a, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i(f1460b, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0304e.m2293b(this.f1478a, z);
        }
    }

    /* renamed from: j0 */
    public void mo2058j0(int i) {
        this.f1500u = i;
    }

    /* renamed from: k0 */
    public void mo2059k0(@ts2 View view) {
        boolean c = mo1238c();
        if (c) {
            mo2037R();
        }
        this.f1474a = view;
        if (c) {
            mo1237a();
        }
    }

    @ts2
    /* renamed from: l */
    public ListView mo1241l() {
        return this.f1483a;
    }

    /* renamed from: l0 */
    public void mo2060l0(int i) {
        qp0 qp0 = this.f1483a;
        if (mo1238c() && qp0 != null) {
            qp0.setListSelectionHidden(false);
            qp0.setSelection(i);
            if (qp0.getChoiceMode() != 0) {
                qp0.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: m */
    public void mo2061m(int i) {
        this.f1495p = i;
    }

    /* renamed from: m0 */
    public void mo2062m0(int i) {
        this.f1478a.setSoftInputMode(i);
    }

    /* renamed from: n0 */
    public void mo2063n0(int i) {
        this.f1494o = i;
    }

    /* renamed from: o */
    public int mo2064o() {
        if (!this.f1487b) {
            return 0;
        }
        return this.f1496q;
    }

    /* renamed from: o0 */
    public void mo2065o0(int i) {
        this.f1497r = i;
    }

    /* renamed from: q */
    public void mo2066q(int i) {
        this.f1496q = i;
        this.f1487b = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: com.onedelhi.secure.qp0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: com.onedelhi.secure.qp0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: com.onedelhi.secure.qp0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0151  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2067r() {
        /*
            r12 = this;
            com.onedelhi.secure.qp0 r0 = r12.f1483a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f1469a
            androidx.appcompat.widget.ListPopupWindow$b r5 = new androidx.appcompat.widget.ListPopupWindow$b
            r5.<init>()
            r12.f1484a = r5
            boolean r5 = r12.f1492g
            r5 = r5 ^ r3
            com.onedelhi.secure.qp0 r5 = r12.mo2070u(r0, r5)
            r12.f1483a = r5
            android.graphics.drawable.Drawable r6 = r12.f1472a
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            com.onedelhi.secure.qp0 r5 = r12.f1483a
            android.widget.ListAdapter r6 = r12.f1477a
            r5.setAdapter(r6)
            com.onedelhi.secure.qp0 r5 = r12.f1483a
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1475a
            r5.setOnItemClickListener(r6)
            com.onedelhi.secure.qp0 r5 = r12.f1483a
            r5.setFocusable(r3)
            com.onedelhi.secure.qp0 r5 = r12.f1483a
            r5.setFocusableInTouchMode(r3)
            com.onedelhi.secure.qp0 r5 = r12.f1483a
            androidx.appcompat.widget.ListPopupWindow$c r6 = new androidx.appcompat.widget.ListPopupWindow$c
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            com.onedelhi.secure.qp0 r5 = r12.f1483a
            androidx.appcompat.widget.ListPopupWindow$h r6 = r12.f1480a
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1476a
            if (r5 == 0) goto L_0x0054
            com.onedelhi.secure.qp0 r6 = r12.f1483a
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            com.onedelhi.secure.qp0 r5 = r12.f1483a
            android.view.View r6 = r12.f1474a
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1500u
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1500u
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1494o
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.f1478a
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.f1478a
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1474a
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.f1478a
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.f1471a
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1471a
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1487b
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f1496q = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.f1471a
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.f1478a
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.mo2071v()
            int r6 = r12.f1496q
            int r3 = r12.mo2021A(r4, r6, r3)
            boolean r4 = r12.f1490e
            if (r4 != 0) goto L_0x0162
            int r4 = r12.f1493n
            if (r4 != r2) goto L_0x011d
            goto L_0x0162
        L_0x011d:
            int r4 = r12.f1494o
            r6 = -2
            if (r4 == r6) goto L_0x012b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0143
        L_0x012b:
            android.content.Context r2 = r12.f1469a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1471a
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0143:
            r7 = r1
            com.onedelhi.secure.qp0 r6 = r12.f1483a
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2092e(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0160
            com.onedelhi.secure.qp0 r2 = r12.f1483a
            int r2 = r2.getPaddingTop()
            com.onedelhi.secure.qp0 r3 = r12.f1483a
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0160:
            int r1 = r1 + r0
            return r1
        L_0x0162:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.mo2067r():int");
    }

    /* renamed from: s */
    public void mo2068s() {
        qp0 qp0 = this.f1483a;
        if (qp0 != null) {
            qp0.setListSelectionHidden(true);
            qp0.requestLayout();
        }
    }

    /* renamed from: t */
    public View.OnTouchListener mo2069t(View view) {
        return new C0300a(view);
    }

    @mr2
    /* renamed from: u */
    public qp0 mo2070u(Context context, boolean z) {
        return new qp0(context, z);
    }

    @ts2
    /* renamed from: v */
    public View mo2071v() {
        return this.f1486b;
    }

    @e64
    /* renamed from: w */
    public int mo2072w() {
        return this.f1478a.getAnimationStyle();
    }

    @ts2
    /* renamed from: x */
    public Rect mo2073x() {
        if (this.f1485b != null) {
            return new Rect(this.f1485b);
        }
        return null;
    }

    /* renamed from: y */
    public int mo2074y() {
        return this.f1493n;
    }

    /* renamed from: z */
    public int mo2075z() {
        return this.f1478a.getInputMethodMode();
    }
}
