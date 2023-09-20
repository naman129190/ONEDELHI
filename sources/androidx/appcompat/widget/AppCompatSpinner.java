package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0189c;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.g64;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.la1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.my3;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.rb4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

public class AppCompatSpinner extends Spinner implements bf4 {
    @g64
    @SuppressLint({"ResourceType"})

    /* renamed from: a */
    public static final int[] f1372a = {16843505};

    /* renamed from: b */
    public static final String f1373b = "AppCompatSpinner";

    /* renamed from: o */
    public static final int f1374o = 15;

    /* renamed from: p */
    public static final int f1375p = 0;

    /* renamed from: q */
    public static final int f1376q = 1;

    /* renamed from: r */
    public static final int f1377r = -1;

    /* renamed from: a */
    public final Context f1378a;

    /* renamed from: a */
    public final Rect f1379a;

    /* renamed from: a */
    public SpinnerAdapter f1380a;

    /* renamed from: a */
    public C0296j f1381a;

    /* renamed from: a */
    public final C1765b8 f1382a;

    /* renamed from: a */
    public la1 f1383a;

    /* renamed from: b */
    public final boolean f1384b;

    /* renamed from: n */
    public int f1385n;

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0283a extends la1 {

        /* renamed from: a */
        public final /* synthetic */ C0290h f1386a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0283a(View view, C0290h hVar) {
            super(view);
            this.f1386a = hVar;
        }

        /* renamed from: b */
        public my3 mo1194b() {
            return this.f1386a;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo1195c() {
            if (AppCompatSpinner.this.getInternalPopup().mo1881c()) {
                return true;
            }
            AppCompatSpinner.this.mo1854b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class C0284b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0284b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1881c()) {
                AppCompatSpinner.this.mo1854b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0285c.m2156a(viewTreeObserver, this);
            }
        }
    }

    @sj3(16)
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public static final class C0285c {
        @pn0
        /* renamed from: a */
        public static void m2156a(@mr2 ViewTreeObserver viewTreeObserver, @ts2 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @sj3(17)
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static final class C0286d {
        @pn0
        /* renamed from: a */
        public static int m2157a(@mr2 View view) {
            return view.getTextAlignment();
        }

        @pn0
        /* renamed from: b */
        public static int m2158b(@mr2 View view) {
            return view.getTextDirection();
        }

        @pn0
        /* renamed from: c */
        public static void m2159c(@mr2 View view, int i) {
            view.setTextAlignment(i);
        }

        @pn0
        /* renamed from: d */
        public static void m2160d(@mr2 View view, int i) {
            view.setTextDirection(i);
        }
    }

    @sj3(23)
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public static final class C0287e {
        @pn0
        /* renamed from: a */
        public static void m2161a(@mr2 ThemedSpinnerAdapter themedSpinnerAdapter, @ts2 Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @hw4
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public class C0288f implements C0296j, DialogInterface.OnClickListener {

        /* renamed from: a */
        public ListAdapter f1389a;
        @hw4

        /* renamed from: a */
        public C0189c f1390a;

        /* renamed from: a */
        public CharSequence f1392a;

        public C0288f() {
        }

        /* renamed from: b */
        public void mo1880b(Drawable drawable) {
            Log.e(AppCompatSpinner.f1373b, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public boolean mo1881c() {
            C0189c cVar = this.f1390a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        /* renamed from: d */
        public int mo1882d() {
            return 0;
        }

        public void dismiss() {
            C0189c cVar = this.f1390a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1390a = null;
            }
        }

        /* renamed from: e */
        public void mo1884e(ListAdapter listAdapter) {
            this.f1389a = listAdapter;
        }

        /* renamed from: f */
        public CharSequence mo1885f() {
            return this.f1392a;
        }

        /* renamed from: g */
        public Drawable mo1886g() {
            return null;
        }

        /* renamed from: h */
        public void mo1887h(int i) {
            Log.e(AppCompatSpinner.f1373b, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: i */
        public void mo1888i(int i, int i2) {
            if (this.f1389a != null) {
                C0189c.C0190a aVar = new C0189c.C0190a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1392a;
                if (charSequence != null) {
                    aVar.mo936K(charSequence);
                }
                C0189c a = aVar.mo933H(this.f1389a, AppCompatSpinner.this.getSelectedItemPosition(), this).mo941a();
                this.f1390a = a;
                ListView k = a.mo910k();
                C0286d.m2160d(k, i);
                C0286d.m2159c(k, i2);
                this.f1390a.show();
            }
        }

        /* renamed from: j */
        public void mo1889j(CharSequence charSequence) {
            this.f1392a = charSequence;
        }

        /* renamed from: m */
        public void mo1890m(int i) {
            Log.e(AppCompatSpinner.f1373b, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: n */
        public int mo1891n() {
            return 0;
        }

        /* renamed from: o */
        public int mo1892o() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f1389a.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: q */
        public void mo1894q(int i) {
            Log.e(AppCompatSpinner.f1373b, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public static class C0289g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public ListAdapter f1393a;

        /* renamed from: a */
        public SpinnerAdapter f1394a;

        public C0289g(@ts2 SpinnerAdapter spinnerAdapter, @ts2 Resources.Theme theme) {
            this.f1394a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1393a = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C0287e.m2161a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof rb4) {
                rb4 rb4 = (rb4) spinnerAdapter;
                if (rb4.getDropDownViewTheme() == null) {
                    rb4.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1393a;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1394a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1394a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1394a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1394a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1394a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1393a;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1394a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1394a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @hw4
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    public class C0290h extends ListPopupWindow implements C0296j {

        /* renamed from: D */
        public int f1395D;

        /* renamed from: a */
        public CharSequence f1397a;

        /* renamed from: b */
        public ListAdapter f1398b;

        /* renamed from: c */
        public final Rect f1399c = new Rect();

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        public class C0291a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AppCompatSpinner f1401a;

            public C0291a(AppCompatSpinner appCompatSpinner) {
                this.f1401a = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0290h hVar = C0290h.this;
                    AppCompatSpinner.this.performItemClick(view, i, hVar.f1398b.getItemId(i));
                }
                C0290h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        public class C0292b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0292b() {
            }

            public void onGlobalLayout() {
                C0290h hVar = C0290h.this;
                if (!hVar.mo1909r0(AppCompatSpinner.this)) {
                    C0290h.this.dismiss();
                    return;
                }
                C0290h.this.mo1908q0();
                C0290h.super.mo1237a();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        public class C0293c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1403a;

            public C0293c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1403a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1403a);
                }
            }
        }

        public C0290h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2038S(AppCompatSpinner.this);
            mo2051d0(true);
            mo2058j0(0);
            mo2053f0(new C0291a(AppCompatSpinner.this));
        }

        /* renamed from: e */
        public void mo1884e(ListAdapter listAdapter) {
            super.mo1884e(listAdapter);
            this.f1398b = listAdapter;
        }

        /* renamed from: f */
        public CharSequence mo1885f() {
            return this.f1397a;
        }

        /* renamed from: h */
        public void mo1887h(int i) {
            this.f1395D = i;
        }

        /* renamed from: i */
        public void mo1888i(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean c = mo1238c();
            mo1908q0();
            mo2046a0(2);
            super.mo1237a();
            ListView l = mo1241l();
            l.setChoiceMode(1);
            C0286d.m2160d(l, i);
            C0286d.m2159c(l, i2);
            mo2060l0(AppCompatSpinner.this.getSelectedItemPosition());
            if (!c && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0292b bVar = new C0292b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo2052e0(new C0293c(bVar));
            }
        }

        /* renamed from: j */
        public void mo1889j(CharSequence charSequence) {
            this.f1397a = charSequence;
        }

        /* renamed from: n */
        public int mo1891n() {
            return this.f1395D;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: q0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1908q0() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo2054g()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.f1379a
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = com.onedelhi.secure.rv4.m27093b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f1379a
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f1379a
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f1379a
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.f1385n
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1398b
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo2054g()
                int r4 = r4.mo1853a(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.f1379a
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo2040U(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo2040U(r5)
            L_0x0085:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = com.onedelhi.secure.rv4.m27093b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.mo2028H()
                int r3 = r3 - r0
                int r0 = r8.mo1891n()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.mo1891n()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.mo2061m(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.C0290h.mo1908q0():void");
        }

        /* renamed from: r0 */
        public boolean mo1909r0(View view) {
            return jt4.m18896O0(view) && view.getGlobalVisibleRect(this.f1399c);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    public static class C0294i extends View.BaseSavedState {
        public static final Parcelable.Creator<C0294i> CREATOR = new C0295a();

        /* renamed from: b */
        public boolean f1405b;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i$a */
        public class C0295a implements Parcelable.Creator<C0294i> {
            /* renamed from: a */
            public C0294i createFromParcel(Parcel parcel) {
                return new C0294i(parcel);
            }

            /* renamed from: b */
            public C0294i[] newArray(int i) {
                return new C0294i[i];
            }
        }

        public C0294i(Parcel parcel) {
            super(parcel);
            this.f1405b = parcel.readByte() != 0;
        }

        public C0294i(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1405b ? (byte) 1 : 0);
        }
    }

    @hw4
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$j */
    public interface C0296j {
        /* renamed from: b */
        void mo1880b(Drawable drawable);

        /* renamed from: c */
        boolean mo1881c();

        /* renamed from: d */
        int mo1882d();

        void dismiss();

        /* renamed from: e */
        void mo1884e(ListAdapter listAdapter);

        /* renamed from: f */
        CharSequence mo1885f();

        /* renamed from: g */
        Drawable mo1886g();

        /* renamed from: h */
        void mo1887h(int i);

        /* renamed from: i */
        void mo1888i(int i, int i2);

        /* renamed from: j */
        void mo1889j(CharSequence charSequence);

        /* renamed from: m */
        void mo1890m(int i);

        /* renamed from: n */
        int mo1891n();

        /* renamed from: o */
        int mo1892o();

        /* renamed from: q */
        void mo1894q(int i);
    }

    public AppCompatSpinner(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(@mr2 Context context, int i) {
        this(context, (AttributeSet) null, za3.C4057b.spinnerStyle, i);
    }

    public AppCompatSpinner(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.spinnerStyle);
    }

    public AppCompatSpinner(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r11 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(@com.onedelhi.secure.mr2 android.content.Context r7, @com.onedelhi.secure.ts2 android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1379a = r0
            android.content.Context r0 = r6.getContext()
            com.onedelhi.secure.qb4.m25632a(r6, r0)
            int[] r0 = com.onedelhi.secure.za3.C4068m.Spinner
            r1 = 0
            com.onedelhi.secure.af4 r0 = com.onedelhi.secure.af4.m11110G(r7, r8, r0, r9, r1)
            com.onedelhi.secure.b8 r2 = new com.onedelhi.secure.b8
            r2.<init>(r6)
            r6.f1382a = r2
            if (r11 == 0) goto L_0x0029
            com.onedelhi.secure.z70 r2 = new com.onedelhi.secure.z70
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f1378a = r2
            goto L_0x0039
        L_0x0029:
            int r11 = com.onedelhi.secure.za3.C4068m.Spinner_popupTheme
            int r11 = r0.mo13050u(r11, r1)
            if (r11 == 0) goto L_0x0037
            com.onedelhi.secure.z70 r2 = new com.onedelhi.secure.z70
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f1378a = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0069
            int[] r11 = f1372a     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x004d
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0051 }
        L_0x004d:
            r11.recycle()
            goto L_0x0069
        L_0x0051:
            r3 = move-exception
            goto L_0x0057
        L_0x0053:
            r7 = move-exception
            goto L_0x0063
        L_0x0055:
            r3 = move-exception
            r11 = r2
        L_0x0057:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0061:
            r7 = move-exception
            r2 = r11
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.recycle()
        L_0x0068:
            throw r7
        L_0x0069:
            r11 = 1
            if (r10 == 0) goto L_0x00a6
            if (r10 == r11) goto L_0x006f
            goto L_0x00b6
        L_0x006f:
            androidx.appcompat.widget.AppCompatSpinner$h r10 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r6.f1378a
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1378a
            int[] r4 = com.onedelhi.secure.za3.C4068m.Spinner
            com.onedelhi.secure.af4 r1 = com.onedelhi.secure.af4.m11110G(r3, r8, r4, r9, r1)
            int r3 = com.onedelhi.secure.za3.C4068m.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo13046q(r3, r4)
            r6.f1385n = r3
            int r3 = com.onedelhi.secure.za3.C4068m.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo13037h(r3)
            r10.mo2047b(r3)
            int r3 = com.onedelhi.secure.za3.C4068m.Spinner_android_prompt
            java.lang.String r3 = r0.mo13052w(r3)
            r10.mo1889j(r3)
            r1.mo13029I()
            r6.f1381a = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f1383a = r1
            goto L_0x00b6
        L_0x00a6:
            androidx.appcompat.widget.AppCompatSpinner$f r10 = new androidx.appcompat.widget.AppCompatSpinner$f
            r10.<init>()
            r6.f1381a = r10
            int r1 = com.onedelhi.secure.za3.C4068m.Spinner_android_prompt
            java.lang.String r1 = r0.mo13052w(r1)
            r10.mo1889j(r1)
        L_0x00b6:
            int r10 = com.onedelhi.secure.za3.C4068m.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo13054y(r10)
            if (r10 == 0) goto L_0x00ce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = com.onedelhi.secure.za3.C4065j.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00ce:
            r0.mo13029I()
            r6.f1384b = r11
            android.widget.SpinnerAdapter r7 = r6.f1380a
            if (r7 == 0) goto L_0x00dc
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1380a = r2
        L_0x00dc:
            com.onedelhi.secure.b8 r7 = r6.f1382a
            r7.mo13523e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    public int mo1853a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1379a);
        Rect rect = this.f1379a;
        return i2 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void mo1854b() {
        this.f1381a.mo1888i(C0286d.m2158b(this), C0286d.m2157a(this));
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1765b8 b8Var = this.f1382a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0296j jVar = this.f1381a;
        return jVar != null ? jVar.mo1882d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0296j jVar = this.f1381a;
        return jVar != null ? jVar.mo1892o() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f1381a != null ? this.f1385n : super.getDropDownWidth();
    }

    @hw4
    public final C0296j getInternalPopup() {
        return this.f1381a;
    }

    public Drawable getPopupBackground() {
        C0296j jVar = this.f1381a;
        return jVar != null ? jVar.mo1886g() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1378a;
    }

    public CharSequence getPrompt() {
        C0296j jVar = this.f1381a;
        return jVar != null ? jVar.mo1885f() : super.getPrompt();
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1382a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1382a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0296j jVar = this.f1381a;
        if (jVar != null && jVar.mo1881c()) {
            this.f1381a.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1381a != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1853a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0294i iVar = (C0294i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f1405b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0284b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0294i iVar = new C0294i(super.onSaveInstanceState());
        C0296j jVar = this.f1381a;
        iVar.f1405b = jVar != null && jVar.mo1881c();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        la1 la1 = this.f1383a;
        if (la1 == null || !la1.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0296j jVar = this.f1381a;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.mo1881c()) {
            return true;
        }
        mo1854b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1384b) {
            this.f1380a = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1381a != null) {
            Context context = this.f1378a;
            if (context == null) {
                context = getContext();
            }
            this.f1381a.mo1884e(new C0289g(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1382a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1382a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0296j jVar = this.f1381a;
        if (jVar != null) {
            jVar.mo1887h(i);
            this.f1381a.mo1890m(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0296j jVar = this.f1381a;
        if (jVar != null) {
            jVar.mo1894q(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1381a != null) {
            this.f1385n = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0296j jVar = this.f1381a;
        if (jVar != null) {
            jVar.mo1880b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@dp0 int i) {
        setPopupBackgroundDrawable(C3129p8.m24529b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0296j jVar = this.f1381a;
        if (jVar != null) {
            jVar.mo1889j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1382a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1382a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }
}
