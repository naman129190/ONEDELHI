package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.bi2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.l00;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.ps3;
import com.onedelhi.secure.rv4;
import com.onedelhi.secure.s64;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xb0;
import com.onedelhi.secure.za3;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements l00 {

    /* renamed from: a */
    public static final C0333o f1544a = (Build.VERSION.SDK_INT < 29 ? new C0333o() : null);

    /* renamed from: c */
    public static final String f1545c = "SearchView";

    /* renamed from: d */
    public static final String f1546d = "nm";

    /* renamed from: k */
    public static final boolean f1547k = false;

    /* renamed from: H */
    public final int f1548H;

    /* renamed from: I */
    public final int f1549I;

    /* renamed from: J */
    public int f1550J;

    /* renamed from: K */
    public int f1551K;

    /* renamed from: a */
    public SearchableInfo f1552a;

    /* renamed from: a */
    public final Intent f1553a;

    /* renamed from: a */
    public Rect f1554a;

    /* renamed from: a */
    public Bundle f1555a;

    /* renamed from: a */
    public TextWatcher f1556a;

    /* renamed from: a */
    public View.OnClickListener f1557a;

    /* renamed from: a */
    public View.OnFocusChangeListener f1558a;

    /* renamed from: a */
    public View.OnKeyListener f1559a;

    /* renamed from: a */
    public final View f1560a;

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f1561a;

    /* renamed from: a */
    public final AdapterView.OnItemSelectedListener f1562a;

    /* renamed from: a */
    public final ImageView f1563a;

    /* renamed from: a */
    public final TextView.OnEditorActionListener f1564a;

    /* renamed from: a */
    public final SearchAutoComplete f1565a;

    /* renamed from: a */
    public C0330l f1566a;

    /* renamed from: a */
    public C0331m f1567a;

    /* renamed from: a */
    public C0332n f1568a;

    /* renamed from: a */
    public C0336q f1569a;

    /* renamed from: a */
    public xb0 f1570a;

    /* renamed from: a */
    public final CharSequence f1571a;

    /* renamed from: a */
    public final Runnable f1572a;

    /* renamed from: a */
    public final WeakHashMap<String, Drawable.ConstantState> f1573a;

    /* renamed from: b */
    public final Intent f1574b;

    /* renamed from: b */
    public Rect f1575b;

    /* renamed from: b */
    public final Drawable f1576b;

    /* renamed from: b */
    public final View.OnClickListener f1577b;

    /* renamed from: b */
    public final View f1578b;

    /* renamed from: b */
    public final ImageView f1579b;

    /* renamed from: b */
    public CharSequence f1580b;

    /* renamed from: b */
    public Runnable f1581b;

    /* renamed from: c */
    public final View f1582c;

    /* renamed from: c */
    public final ImageView f1583c;

    /* renamed from: c */
    public CharSequence f1584c;

    /* renamed from: c */
    public int[] f1585c;

    /* renamed from: d */
    public final View f1586d;

    /* renamed from: d */
    public final ImageView f1587d;

    /* renamed from: d */
    public CharSequence f1588d;

    /* renamed from: d */
    public boolean f1589d;

    /* renamed from: d */
    public int[] f1590d;

    /* renamed from: e */
    public final ImageView f1591e;

    /* renamed from: e */
    public boolean f1592e;

    /* renamed from: f */
    public boolean f1593f;

    /* renamed from: g */
    public boolean f1594g;

    /* renamed from: h */
    public boolean f1595h;

    /* renamed from: i */
    public boolean f1596i;

    /* renamed from: j */
    public boolean f1597j;

    @hl3({hl3.C2354a.f13188c})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        public SearchView f1598a;

        /* renamed from: a */
        public final Runnable f1599a;

        /* renamed from: b */
        public boolean f1600b;

        /* renamed from: n */
        public int f1601n;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0318a implements Runnable {
            public C0318a() {
            }

            public void run() {
                SearchAutoComplete.this.mo2216e();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, za3.C4057b.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1599a = new C0318a();
            this.f1601n = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: b */
        public void mo2214b() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0329k.m2371b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1544a.mo2248c(this);
        }

        /* renamed from: d */
        public boolean mo2215d() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: e */
        public void mo2216e() {
            if (this.f1600b) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1600b = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1601n <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1600b) {
                removeCallbacks(this.f1599a);
                post(this.f1599a);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1598a.mo2172f0();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1598a.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1598a.hasFocus() && getVisibility() == 0) {
                this.f1600b = true;
                if (SearchView.m2326Q(getContext())) {
                    mo2214b();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1600b = false;
                removeCallbacks(this.f1599a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1600b = false;
                removeCallbacks(this.f1599a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1600b = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1598a = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1601n = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0319a implements TextWatcher {
        public C0319a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo2171e0(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0320b implements Runnable {
        public C0320b() {
        }

        public void run() {
            SearchView.this.mo2185k0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0321c implements Runnable {
        public C0321c() {
        }

        public void run() {
            xb0 xb0 = SearchView.this.f1570a;
            if (xb0 instanceof s64) {
                xb0.mo24233b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0322d implements View.OnFocusChangeListener {
        public C0322d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1558a;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0323e implements View.OnLayoutChangeListener {
        public C0323e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo2143E();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0324f implements View.OnClickListener {
        public C0324f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1563a) {
                searchView.mo2165b0();
            } else if (view == searchView.f1583c) {
                searchView.mo2161X();
            } else if (view == searchView.f1579b) {
                searchView.mo2167c0();
            } else if (view == searchView.f1587d) {
                searchView.mo2173g0();
            } else if (view == searchView.f1565a) {
                searchView.mo2149K();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0325g implements View.OnKeyListener {
        public C0325g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1552a == null) {
                return false;
            }
            if (searchView.f1565a.isPopupShowing() && SearchView.this.f1565a.getListSelection() != -1) {
                return SearchView.this.mo2169d0(view, i, keyEvent);
            }
            if (SearchView.this.f1565a.mo2215d() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo2159V(0, (String) null, searchView2.f1565a.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0326h implements TextView.OnEditorActionListener {
        public C0326h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo2167c0();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0327i implements AdapterView.OnItemClickListener {
        public C0327i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo2162Y(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0328j implements AdapterView.OnItemSelectedListener {
        public C0328j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo2163Z(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @sj3(29)
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0329k {
        @pn0
        /* renamed from: a */
        public static void m2370a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @pn0
        /* renamed from: b */
        public static void m2371b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0330l {
        /* renamed from: a */
        boolean mo2241a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0331m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0332n {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0333o {

        /* renamed from: a */
        public Method f1613a = null;

        /* renamed from: b */
        public Method f1614b = null;

        /* renamed from: c */
        public Method f1615c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0333o() {
            m2373d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1613a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1614b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1615c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        public static void m2373d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        public void mo2246a(AutoCompleteTextView autoCompleteTextView) {
            m2373d();
            Method method = this.f1614b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public void mo2247b(AutoCompleteTextView autoCompleteTextView) {
            m2373d();
            Method method = this.f1613a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        public void mo2248c(AutoCompleteTextView autoCompleteTextView) {
            m2373d();
            Method method = this.f1615c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0334p extends C2015e0 {
        public static final Parcelable.Creator<C0334p> CREATOR = new C0335a();

        /* renamed from: b */
        public boolean f1616b;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        public class C0335a implements Parcelable.ClassLoaderCreator<C0334p> {
            /* renamed from: a */
            public C0334p createFromParcel(Parcel parcel) {
                return new C0334p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0334p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0334p(parcel, classLoader);
            }

            /* renamed from: c */
            public C0334p[] newArray(int i) {
                return new C0334p[i];
            }
        }

        public C0334p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1616b = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public C0334p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1616b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1616b));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    public static class C0336q extends TouchDelegate {

        /* renamed from: a */
        public final int f1617a;

        /* renamed from: a */
        public final Rect f1618a = new Rect();

        /* renamed from: a */
        public final View f1619a;

        /* renamed from: a */
        public boolean f1620a;

        /* renamed from: b */
        public final Rect f1621b = new Rect();

        /* renamed from: c */
        public final Rect f1622c = new Rect();

        public C0336q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1617a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo2257a(rect, rect2);
            this.f1619a = view;
        }

        /* renamed from: a */
        public void mo2257a(Rect rect, Rect rect2) {
            this.f1618a.set(rect);
            this.f1622c.set(rect);
            Rect rect3 = this.f1622c;
            int i = this.f1617a;
            rect3.inset(-i, -i);
            this.f1621b.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1620a
                r7.f1620a = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1620a
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1622c
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1618a
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1620a = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f1621b
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f1619a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1619a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.f1621b
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f1619a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0336q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1554a = new Rect();
        this.f1575b = new Rect();
        this.f1585c = new int[2];
        this.f1590d = new int[2];
        this.f1572a = new C0320b();
        this.f1581b = new C0321c();
        this.f1573a = new WeakHashMap<>();
        C0324f fVar = new C0324f();
        this.f1577b = fVar;
        this.f1559a = new C0325g();
        C0326h hVar = new C0326h();
        this.f1564a = hVar;
        C0327i iVar = new C0327i();
        this.f1561a = iVar;
        C0328j jVar = new C0328j();
        this.f1562a = jVar;
        this.f1556a = new C0319a();
        int[] iArr = za3.C4068m.SearchView;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        af4 G = af4.m11110G(context, attributeSet2, iArr, i2, 0);
        jt4.m19033z1(this, context, iArr, attributeSet2, G.mo13025B(), i2, 0);
        LayoutInflater.from(context).inflate(G.mo13050u(za3.C4068m.SearchView_layout, za3.C4065j.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(za3.C4062g.search_src_text);
        this.f1565a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1560a = findViewById(za3.C4062g.search_edit_frame);
        View findViewById = findViewById(za3.C4062g.search_plate);
        this.f1578b = findViewById;
        View findViewById2 = findViewById(za3.C4062g.submit_area);
        this.f1582c = findViewById2;
        ImageView imageView = (ImageView) findViewById(za3.C4062g.search_button);
        this.f1563a = imageView;
        ImageView imageView2 = (ImageView) findViewById(za3.C4062g.search_go_btn);
        this.f1579b = imageView2;
        ImageView imageView3 = (ImageView) findViewById(za3.C4062g.search_close_btn);
        this.f1583c = imageView3;
        ImageView imageView4 = (ImageView) findViewById(za3.C4062g.search_voice_btn);
        this.f1587d = imageView4;
        ImageView imageView5 = (ImageView) findViewById(za3.C4062g.search_mag_icon);
        this.f1591e = imageView5;
        jt4.m18877I1(findViewById, G.mo13037h(za3.C4068m.SearchView_queryBackground));
        jt4.m18877I1(findViewById2, G.mo13037h(za3.C4068m.SearchView_submitBackground));
        int i3 = za3.C4068m.SearchView_searchIcon;
        imageView.setImageDrawable(G.mo13037h(i3));
        imageView2.setImageDrawable(G.mo13037h(za3.C4068m.SearchView_goIcon));
        imageView3.setImageDrawable(G.mo13037h(za3.C4068m.SearchView_closeIcon));
        imageView4.setImageDrawable(G.mo13037h(za3.C4068m.SearchView_voiceIcon));
        imageView5.setImageDrawable(G.mo13037h(i3));
        this.f1576b = G.mo13037h(za3.C4068m.SearchView_searchHintIcon);
        of4.m23742a(imageView, getResources().getString(za3.C4066k.abc_searchview_description_search));
        this.f1548H = G.mo13050u(za3.C4068m.SearchView_suggestionRowLayout, za3.C4065j.abc_search_dropdown_item_icons_2line);
        this.f1549I = G.mo13050u(za3.C4068m.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1556a);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1559a);
        searchAutoComplete.setOnFocusChangeListener(new C0322d());
        setIconifiedByDefault(G.mo13030a(za3.C4068m.SearchView_iconifiedByDefault, true));
        int g = G.mo13036g(za3.C4068m.SearchView_android_maxWidth, -1);
        if (g != -1) {
            setMaxWidth(g);
        }
        this.f1571a = G.mo13053x(za3.C4068m.SearchView_defaultQueryHint);
        this.f1580b = G.mo13053x(za3.C4068m.SearchView_queryHint);
        int o = G.mo13044o(za3.C4068m.SearchView_android_imeOptions, -1);
        if (o != -1) {
            setImeOptions(o);
        }
        int o2 = G.mo13044o(za3.C4068m.SearchView_android_inputType, -1);
        if (o2 != -1) {
            setInputType(o2);
        }
        setFocusable(G.mo13030a(za3.C4068m.SearchView_android_focusable, true));
        G.mo13029I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1553a = intent;
        intent.addFlags(bi2.f26358i);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1574b = intent2;
        intent2.addFlags(bi2.f26358i);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1586d = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0323e());
        }
        mo2194p0(this.f1589d);
        mo2186l0();
    }

    /* renamed from: Q */
    public static boolean m2326Q(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(za3.C4060e.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(za3.C4060e.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1565a.setText(charSequence);
        this.f1565a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: E */
    public void mo2143E() {
        if (this.f1586d.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1578b.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = rv4.m27093b(this);
            int dimensionPixelSize = this.f1589d ? resources.getDimensionPixelSize(za3.C4060e.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(za3.C4060e.abc_dropdownitem_text_padding_left) : 0;
            this.f1565a.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f1565a.setDropDownHorizontalOffset(b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f1565a.setDropDownWidth((((this.f1586d.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: F */
    public final Intent mo2144F(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(bi2.f26358i);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1588d);
        if (str3 != null) {
            intent.putExtra(ps3.f18698b, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1555a;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1552a.getSearchActivity());
        return intent;
    }

    /* renamed from: G */
    public final Intent mo2145G(Cursor cursor, int i, String str) {
        int i2;
        String u;
        try {
            String u2 = s64.m27279u(cursor, "suggest_intent_action");
            if (u2 == null) {
                u2 = this.f1552a.getSuggestIntentAction();
            }
            if (u2 == null) {
                u2 = "android.intent.action.SEARCH";
            }
            String str2 = u2;
            String u3 = s64.m27279u(cursor, "suggest_intent_data");
            if (u3 == null) {
                u3 = this.f1552a.getSuggestIntentData();
            }
            if (!(u3 == null || (u = s64.m27279u(cursor, "suggest_intent_data_id")) == null)) {
                u3 = u3 + "/" + Uri.encode(u);
            }
            return mo2144F(str2, u3 == null ? null : Uri.parse(u3), s64.m27279u(cursor, "suggest_intent_extra_data"), s64.m27279u(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w(f1545c, "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: H */
    public final Intent mo2146H(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1555a;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: I */
    public final Intent mo2147I(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: J */
    public final void mo2148J() {
        this.f1565a.dismissDropDown();
    }

    /* renamed from: K */
    public void mo2149K() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0329k.m2370a(this.f1565a);
            return;
        }
        C0333o oVar = f1544a;
        oVar.mo2247b(this.f1565a);
        oVar.mo2246a(this.f1565a);
    }

    /* renamed from: L */
    public final void mo2150L(View view, Rect rect) {
        view.getLocationInWindow(this.f1585c);
        getLocationInWindow(this.f1590d);
        int[] iArr = this.f1585c;
        int i = iArr[1];
        int[] iArr2 = this.f1590d;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: M */
    public final CharSequence mo2151M(CharSequence charSequence) {
        if (!this.f1589d || this.f1576b == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1565a.getTextSize()) * 1.25d);
        this.f1576b.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1576b), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: N */
    public final boolean mo2152N() {
        SearchableInfo searchableInfo = this.f1552a;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1552a.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1553a;
        } else if (this.f1552a.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1574b;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: O */
    public boolean mo2153O() {
        return this.f1589d;
    }

    /* renamed from: P */
    public boolean mo2154P() {
        return this.f1592e;
    }

    /* renamed from: R */
    public boolean mo2155R() {
        return this.f1594g;
    }

    /* renamed from: S */
    public final boolean mo2156S() {
        return (this.f1593f || this.f1596i) && !mo2154P();
    }

    /* renamed from: T */
    public boolean mo2157T() {
        return this.f1593f;
    }

    /* renamed from: U */
    public final void mo2158U(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e(f1545c, "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: V */
    public void mo2159V(int i, String str, String str2) {
        getContext().startActivity(mo2144F("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* renamed from: W */
    public final boolean mo2160W(int i, int i2, String str) {
        Cursor c = this.f1570a.mo26867c();
        if (c == null || !c.moveToPosition(i)) {
            return false;
        }
        mo2158U(mo2145G(c, i2, str));
        return true;
    }

    /* renamed from: X */
    public void mo2161X() {
        if (!TextUtils.isEmpty(this.f1565a.getText())) {
            this.f1565a.setText("");
            this.f1565a.requestFocus();
            this.f1565a.setImeVisibility(true);
        } else if (this.f1589d) {
            C0330l lVar = this.f1566a;
            if (lVar == null || !lVar.mo2241a()) {
                clearFocus();
                mo2194p0(true);
            }
        }
    }

    /* renamed from: Y */
    public boolean mo2162Y(int i, int i2, String str) {
        C0332n nVar = this.f1568a;
        if (nVar != null && nVar.onSuggestionClick(i)) {
            return false;
        }
        mo2160W(i, 0, (String) null);
        this.f1565a.setImeVisibility(false);
        mo2148J();
        return true;
    }

    /* renamed from: Z */
    public boolean mo2163Z(int i) {
        C0332n nVar = this.f1568a;
        if (nVar != null && nVar.onSuggestionSelect(i)) {
            return false;
        }
        mo2183i0(i);
        return true;
    }

    /* renamed from: a0 */
    public void mo2164a0(@ts2 CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: b0 */
    public void mo2165b0() {
        mo2194p0(false);
        this.f1565a.requestFocus();
        this.f1565a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1557a;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: c */
    public void mo2166c() {
        if (!this.f1597j) {
            this.f1597j = true;
            int imeOptions = this.f1565a.getImeOptions();
            this.f1551K = imeOptions;
            this.f1565a.setImeOptions(imeOptions | 33554432);
            this.f1565a.setText("");
            setIconified(false);
        }
    }

    /* renamed from: c0 */
    public void mo2167c0() {
        Editable text = this.f1565a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0331m mVar = this.f1567a;
            if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
                if (this.f1552a != null) {
                    mo2159V(0, (String) null, text.toString());
                }
                this.f1565a.setImeVisibility(false);
                mo2148J();
            }
        }
    }

    public void clearFocus() {
        this.f1595h = true;
        super.clearFocus();
        this.f1565a.clearFocus();
        this.f1565a.setImeVisibility(false);
        this.f1595h = false;
    }

    /* renamed from: d0 */
    public boolean mo2169d0(View view, int i, KeyEvent keyEvent) {
        if (this.f1552a != null && this.f1570a != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo2162Y(this.f1565a.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f1565a.setSelection(i == 21 ? 0 : this.f1565a.length());
                this.f1565a.setListSelection(0);
                this.f1565a.clearListSelection();
                this.f1565a.mo2214b();
                return true;
            } else if (i == 19) {
                this.f1565a.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo2170e() {
        setQuery("", false);
        clearFocus();
        mo2194p0(true);
        this.f1565a.setImeOptions(this.f1551K);
        this.f1597j = false;
    }

    /* renamed from: e0 */
    public void mo2171e0(CharSequence charSequence) {
        Editable text = this.f1565a.getText();
        this.f1588d = text;
        boolean z = !TextUtils.isEmpty(text);
        mo2189o0(z);
        mo2195q0(!z);
        mo2184j0();
        mo2188n0();
        if (this.f1567a != null && !TextUtils.equals(charSequence, this.f1584c)) {
            this.f1567a.onQueryTextChange(charSequence.toString());
        }
        this.f1584c = charSequence.toString();
    }

    /* renamed from: f0 */
    public void mo2172f0() {
        mo2194p0(mo2154P());
        mo2182h0();
        if (this.f1565a.hasFocus()) {
            mo2149K();
        }
    }

    /* renamed from: g0 */
    public void mo2173g0() {
        Intent H;
        SearchableInfo searchableInfo = this.f1552a;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    H = mo2147I(this.f1553a, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    H = mo2146H(this.f1574b, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(H);
            } catch (ActivityNotFoundException unused) {
                Log.w(f1545c, "Could not find voice search activity");
            }
        }
    }

    public int getImeOptions() {
        return this.f1565a.getImeOptions();
    }

    public int getInputType() {
        return this.f1565a.getInputType();
    }

    public int getMaxWidth() {
        return this.f1550J;
    }

    public CharSequence getQuery() {
        return this.f1565a.getText();
    }

    @ts2
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1580b;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1552a;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1571a : getContext().getText(this.f1552a.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1549I;
    }

    public int getSuggestionRowLayout() {
        return this.f1548H;
    }

    public xb0 getSuggestionsAdapter() {
        return this.f1570a;
    }

    /* renamed from: h0 */
    public final void mo2182h0() {
        post(this.f1572a);
    }

    /* renamed from: i0 */
    public final void mo2183i0(int i) {
        CharSequence a;
        Editable text = this.f1565a.getText();
        Cursor c = this.f1570a.mo26867c();
        if (c != null) {
            if (!c.moveToPosition(i) || (a = this.f1570a.mo24232a(c)) == null) {
                setQuery(text);
            } else {
                setQuery(a);
            }
        }
    }

    /* renamed from: j0 */
    public final void mo2184j0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1565a.getText());
        int i = 0;
        if (!z2 && (!this.f1589d || this.f1597j)) {
            z = false;
        }
        ImageView imageView = this.f1583c;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1583c.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: k0 */
    public void mo2185k0() {
        int[] iArr = this.f1565a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1578b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1582c.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: l0 */
    public final void mo2186l0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1565a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(mo2151M(queryHint));
    }

    /* renamed from: m0 */
    public final void mo2187m0() {
        this.f1565a.setThreshold(this.f1552a.getSuggestThreshold());
        this.f1565a.setImeOptions(this.f1552a.getImeOptions());
        int inputType = this.f1552a.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1552a.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1565a.setInputType(inputType);
        xb0 xb0 = this.f1570a;
        if (xb0 != null) {
            xb0.mo24233b((Cursor) null);
        }
        if (this.f1552a.getSuggestAuthority() != null) {
            s64 s64 = new s64(getContext(), this, this.f1552a, this.f1573a);
            this.f1570a = s64;
            this.f1565a.setAdapter(s64);
            s64 s642 = (s64) this.f1570a;
            if (this.f1594g) {
                i = 2;
            }
            s642.mo24227E(i);
        }
    }

    /* renamed from: n0 */
    public final void mo2188n0() {
        this.f1582c.setVisibility((!mo2156S() || !(this.f1579b.getVisibility() == 0 || this.f1587d.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: o0 */
    public final void mo2189o0(boolean z) {
        this.f1579b.setVisibility((!this.f1593f || !mo2156S() || !hasFocus() || (!z && this.f1596i)) ? 8 : 0);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f1572a);
        post(this.f1581b);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo2150L(this.f1565a, this.f1554a);
            Rect rect = this.f1575b;
            Rect rect2 = this.f1554a;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0336q qVar = this.f1569a;
            if (qVar == null) {
                C0336q qVar2 = new C0336q(this.f1575b, this.f1554a, this.f1565a);
                this.f1569a = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.mo2257a(this.f1575b, this.f1554a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo2154P()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f1550J
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f1550J
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f1550J
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0334p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0334p pVar = (C0334p) parcelable;
        super.onRestoreInstanceState(pVar.mo14959a());
        mo2194p0(pVar.f1616b);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0334p pVar = new C0334p(super.onSaveInstanceState());
        pVar.f1616b = mo2154P();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        mo2182h0();
    }

    /* renamed from: p0 */
    public final void mo2194p0(boolean z) {
        this.f1592e = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1565a.getText());
        this.f1563a.setVisibility(i2);
        mo2189o0(z2);
        this.f1560a.setVisibility(z ? 8 : 0);
        if (this.f1591e.getDrawable() == null || this.f1589d) {
            i = 8;
        }
        this.f1591e.setVisibility(i);
        mo2184j0();
        mo2195q0(!z2);
        mo2188n0();
    }

    /* renamed from: q0 */
    public final void mo2195q0(boolean z) {
        int i = 8;
        if (this.f1596i && !mo2154P() && z) {
            this.f1579b.setVisibility(8);
            i = 0;
        }
        this.f1587d.setVisibility(i);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1595h || !isFocusable()) {
            return false;
        }
        if (mo2154P()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1565a.requestFocus(i, rect);
        if (requestFocus) {
            mo2194p0(false);
        }
        return requestFocus;
    }

    @hl3({hl3.C2354a.f13188c})
    public void setAppSearchData(Bundle bundle) {
        this.f1555a = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo2161X();
        } else {
            mo2165b0();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1589d != z) {
            this.f1589d = z;
            mo2194p0(z);
            mo2186l0();
        }
    }

    public void setImeOptions(int i) {
        this.f1565a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1565a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1550J = i;
        requestLayout();
    }

    public void setOnCloseListener(C0330l lVar) {
        this.f1566a = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1558a = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0331m mVar) {
        this.f1567a = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1557a = onClickListener;
    }

    public void setOnSuggestionListener(C0332n nVar) {
        this.f1568a = nVar;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.f1565a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1565a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1588d = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo2167c0();
        }
    }

    public void setQueryHint(@ts2 CharSequence charSequence) {
        this.f1580b = charSequence;
        mo2186l0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1594g = z;
        xb0 xb0 = this.f1570a;
        if (xb0 instanceof s64) {
            ((s64) xb0).mo24227E(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1552a = searchableInfo;
        if (searchableInfo != null) {
            mo2187m0();
            mo2186l0();
        }
        boolean N = mo2152N();
        this.f1596i = N;
        if (N) {
            this.f1565a.setPrivateImeOptions(f1546d);
        }
        mo2194p0(mo2154P());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1593f = z;
        mo2194p0(mo2154P());
    }

    public void setSuggestionsAdapter(xb0 xb0) {
        this.f1570a = xb0;
        this.f1565a.setAdapter(xb0);
    }
}
