package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.onedelhi.secure.C2223g8;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;
import java.lang.ref.WeakReference;

public class AlertController {

    /* renamed from: a */
    public final int f654a;

    /* renamed from: a */
    public final Context f655a;

    /* renamed from: a */
    public Drawable f656a;

    /* renamed from: a */
    public Handler f657a;

    /* renamed from: a */
    public Message f658a;

    /* renamed from: a */
    public final View.OnClickListener f659a = new C0165a();

    /* renamed from: a */
    public View f660a;

    /* renamed from: a */
    public final Window f661a;

    /* renamed from: a */
    public Button f662a;

    /* renamed from: a */
    public ImageView f663a;

    /* renamed from: a */
    public ListAdapter f664a;

    /* renamed from: a */
    public ListView f665a;

    /* renamed from: a */
    public TextView f666a;

    /* renamed from: a */
    public NestedScrollView f667a;

    /* renamed from: a */
    public final C2223g8 f668a;

    /* renamed from: a */
    public CharSequence f669a;

    /* renamed from: a */
    public boolean f670a = false;

    /* renamed from: b */
    public int f671b;

    /* renamed from: b */
    public Drawable f672b;

    /* renamed from: b */
    public Message f673b;

    /* renamed from: b */
    public View f674b;

    /* renamed from: b */
    public Button f675b;

    /* renamed from: b */
    public TextView f676b;

    /* renamed from: b */
    public CharSequence f677b;

    /* renamed from: b */
    public boolean f678b;

    /* renamed from: c */
    public int f679c;

    /* renamed from: c */
    public Drawable f680c;

    /* renamed from: c */
    public Message f681c;

    /* renamed from: c */
    public Button f682c;

    /* renamed from: c */
    public CharSequence f683c;

    /* renamed from: d */
    public int f684d;

    /* renamed from: d */
    public Drawable f685d;

    /* renamed from: d */
    public CharSequence f686d;

    /* renamed from: e */
    public int f687e;

    /* renamed from: e */
    public CharSequence f688e;

    /* renamed from: f */
    public int f689f;

    /* renamed from: g */
    public int f690g = 0;

    /* renamed from: h */
    public int f691h = -1;

    /* renamed from: i */
    public int f692i;

    /* renamed from: j */
    public int f693j;

    /* renamed from: k */
    public int f694k;

    /* renamed from: l */
    public int f695l;

    /* renamed from: m */
    public int f696m;

    /* renamed from: n */
    public int f697n;

    /* renamed from: o */
    public int f698o = 0;

    public static class RecycleListView extends ListView {

        /* renamed from: n */
        public final int f699n;

        /* renamed from: o */
        public final int f700o;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, za3.C4068m.RecycleListView);
            this.f700o = obtainStyledAttributes.getDimensionPixelOffset(za3.C4068m.RecycleListView_paddingBottomNoButtons, -1);
            this.f699n = obtainStyledAttributes.getDimensionPixelOffset(za3.C4068m.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f699n, getPaddingRight(), z2 ? getPaddingBottom() : this.f700o);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0165a implements View.OnClickListener {
        public C0165a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f681c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f662a
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f658a
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f675b
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f673b
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f682c
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f681c
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f657a
                r1 = 1
                com.onedelhi.secure.g8 r3 = r3.f668a
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0165a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public class C0166b implements NestedScrollView.C0489c {

        /* renamed from: a */
        public final /* synthetic */ View f702a;

        /* renamed from: b */
        public final /* synthetic */ View f704b;

        public C0166b(View view, View view2) {
            this.f702a = view;
            this.f704b = view2;
        }

        /* renamed from: a */
        public void mo821a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m1211g(nestedScrollView, this.f702a, this.f704b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public class C0167c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f705a;

        /* renamed from: b */
        public final /* synthetic */ View f707b;

        public C0167c(View view, View view2) {
            this.f705a = view;
            this.f707b = view2;
        }

        public void run() {
            AlertController.m1211g(AlertController.this.f667a, this.f705a, this.f707b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public class C0168d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ View f708a;

        /* renamed from: b */
        public final /* synthetic */ View f710b;

        public C0168d(View view, View view2) {
            this.f708a = view;
            this.f710b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m1211g(absListView, this.f708a, this.f710b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    public class C0169e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f711a;

        /* renamed from: b */
        public final /* synthetic */ View f713b;

        public C0169e(View view, View view2) {
            this.f711a = view;
            this.f713b = view2;
        }

        public void run() {
            AlertController.m1211g(AlertController.this.f665a, this.f711a, this.f713b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0170f {

        /* renamed from: a */
        public int f714a = 0;

        /* renamed from: a */
        public final Context f715a;

        /* renamed from: a */
        public DialogInterface.OnCancelListener f716a;

        /* renamed from: a */
        public DialogInterface.OnClickListener f717a;

        /* renamed from: a */
        public DialogInterface.OnDismissListener f718a;

        /* renamed from: a */
        public DialogInterface.OnKeyListener f719a;

        /* renamed from: a */
        public DialogInterface.OnMultiChoiceClickListener f720a;

        /* renamed from: a */
        public Cursor f721a;

        /* renamed from: a */
        public Drawable f722a;

        /* renamed from: a */
        public final LayoutInflater f723a;

        /* renamed from: a */
        public View f724a;

        /* renamed from: a */
        public AdapterView.OnItemSelectedListener f725a;

        /* renamed from: a */
        public ListAdapter f726a;

        /* renamed from: a */
        public C0175e f727a;

        /* renamed from: a */
        public CharSequence f728a;

        /* renamed from: a */
        public String f729a;

        /* renamed from: a */
        public boolean f730a;

        /* renamed from: a */
        public CharSequence[] f731a;

        /* renamed from: a */
        public boolean[] f732a;

        /* renamed from: b */
        public int f733b = 0;

        /* renamed from: b */
        public DialogInterface.OnClickListener f734b;

        /* renamed from: b */
        public Drawable f735b;

        /* renamed from: b */
        public View f736b;

        /* renamed from: b */
        public CharSequence f737b;

        /* renamed from: b */
        public String f738b;

        /* renamed from: b */
        public boolean f739b = false;

        /* renamed from: c */
        public int f740c;

        /* renamed from: c */
        public DialogInterface.OnClickListener f741c;

        /* renamed from: c */
        public Drawable f742c;

        /* renamed from: c */
        public CharSequence f743c;

        /* renamed from: c */
        public boolean f744c;

        /* renamed from: d */
        public int f745d;

        /* renamed from: d */
        public DialogInterface.OnClickListener f746d;

        /* renamed from: d */
        public Drawable f747d;

        /* renamed from: d */
        public CharSequence f748d;

        /* renamed from: d */
        public boolean f749d;

        /* renamed from: e */
        public int f750e;

        /* renamed from: e */
        public CharSequence f751e;

        /* renamed from: e */
        public boolean f752e;

        /* renamed from: f */
        public int f753f;

        /* renamed from: f */
        public boolean f754f = true;

        /* renamed from: g */
        public int f755g;

        /* renamed from: h */
        public int f756h = -1;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        public class C0171a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f757a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0171a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f757a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0170f.this.f732a;
                if (zArr != null && zArr[i]) {
                    this.f757a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        public class C0172b extends CursorAdapter {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f759a;

            /* renamed from: a */
            public final /* synthetic */ AlertController f761a;

            /* renamed from: n */
            public final int f762n;

            /* renamed from: o */
            public final int f763o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0172b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f759a = recycleListView;
                this.f761a = alertController;
                Cursor cursor2 = getCursor();
                this.f762n = cursor2.getColumnIndexOrThrow(C0170f.this.f729a);
                this.f763o = cursor2.getColumnIndexOrThrow(C0170f.this.f738b);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f762n));
                RecycleListView recycleListView = this.f759a;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f763o) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0170f.this.f723a.inflate(this.f761a.f695l, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        public class C0173c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AlertController f765a;

            public C0173c(AlertController alertController) {
                this.f765a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0170f.this.f746d.onClick(this.f765a.f668a, i);
                if (!C0170f.this.f749d) {
                    this.f765a.f668a.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        public class C0174d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f766a;

            /* renamed from: a */
            public final /* synthetic */ AlertController f768a;

            public C0174d(RecycleListView recycleListView, AlertController alertController) {
                this.f766a = recycleListView;
                this.f768a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0170f.this.f732a;
                if (zArr != null) {
                    zArr[i] = this.f766a.isItemChecked(i);
                }
                C0170f.this.f720a.onClick(this.f768a.f668a, i, this.f766a.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0175e {
            /* renamed from: a */
            void mo833a(ListView listView);
        }

        public C0170f(Context context) {
            this.f715a = context;
            this.f730a = true;
            this.f723a = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void mo826a(AlertController alertController) {
            View view = this.f724a;
            if (view != null) {
                alertController.mo806n(view);
            } else {
                CharSequence charSequence = this.f728a;
                if (charSequence != null) {
                    alertController.mo811s(charSequence);
                }
                Drawable drawable = this.f722a;
                if (drawable != null) {
                    alertController.mo808p(drawable);
                }
                int i = this.f714a;
                if (i != 0) {
                    alertController.mo807o(i);
                }
                int i2 = this.f733b;
                if (i2 != 0) {
                    alertController.mo807o(alertController.mo797d(i2));
                }
            }
            CharSequence charSequence2 = this.f737b;
            if (charSequence2 != null) {
                alertController.mo809q(charSequence2);
            }
            CharSequence charSequence3 = this.f743c;
            if (!(charSequence3 == null && this.f735b == null)) {
                alertController.mo804l(-1, charSequence3, this.f717a, (Message) null, this.f735b);
            }
            CharSequence charSequence4 = this.f748d;
            if (!(charSequence4 == null && this.f742c == null)) {
                alertController.mo804l(-2, charSequence4, this.f734b, (Message) null, this.f742c);
            }
            CharSequence charSequence5 = this.f751e;
            if (!(charSequence5 == null && this.f747d == null)) {
                alertController.mo804l(-3, charSequence5, this.f741c, (Message) null, this.f747d);
            }
            if (!(this.f731a == null && this.f721a == null && this.f726a == null)) {
                mo827b(alertController);
            }
            View view2 = this.f736b;
            if (view2 == null) {
                int i3 = this.f740c;
                if (i3 != 0) {
                    alertController.mo812t(i3);
                }
            } else if (this.f739b) {
                alertController.mo814v(view2, this.f745d, this.f750e, this.f753f, this.f755g);
            } else {
                alertController.mo813u(view2);
            }
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo827b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f723a
                int r1 = r11.f694k
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f744c
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f721a
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f715a
                int r4 = r11.f695l
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f731a
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f715a
                android.database.Cursor r4 = r10.f721a
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f749d
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f696m
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f697n
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f721a
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f715a
                android.database.Cursor r5 = r10.f721a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f729a
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f726a
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f715a
                java.lang.CharSequence[] r3 = r10.f731a
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f727a
                if (r1 == 0) goto L_0x0072
                r1.mo833a(r0)
            L_0x0072:
                r11.f664a = r9
                int r1 = r10.f756h
                r11.f691h = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f746d
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f720a
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f725a
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f749d
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f744c
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f665a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0170f.mo827b(androidx.appcompat.app.AlertController):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    public static final class C0176g extends Handler {

        /* renamed from: a */
        public static final int f769a = 1;

        /* renamed from: a */
        public WeakReference<DialogInterface> f770a;

        public C0176g(DialogInterface dialogInterface) {
            this.f770a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f770a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    public static class C0177h extends ArrayAdapter<CharSequence> {
        public C0177h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C2223g8 g8Var, Window window) {
        this.f655a = context;
        this.f668a = g8Var;
        this.f661a = window;
        this.f657a = new C0176g(g8Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, za3.C4068m.AlertDialog, za3.C4057b.alertDialogStyle, 0);
        this.f692i = obtainStyledAttributes.getResourceId(za3.C4068m.AlertDialog_android_layout, 0);
        this.f693j = obtainStyledAttributes.getResourceId(za3.C4068m.AlertDialog_buttonPanelSideLayout, 0);
        this.f694k = obtainStyledAttributes.getResourceId(za3.C4068m.AlertDialog_listLayout, 0);
        this.f695l = obtainStyledAttributes.getResourceId(za3.C4068m.AlertDialog_multiChoiceItemLayout, 0);
        this.f696m = obtainStyledAttributes.getResourceId(za3.C4068m.AlertDialog_singleChoiceItemLayout, 0);
        this.f697n = obtainStyledAttributes.getResourceId(za3.C4068m.AlertDialog_listItemLayout, 0);
        this.f678b = obtainStyledAttributes.getBoolean(za3.C4068m.AlertDialog_showTitle, true);
        this.f654a = obtainStyledAttributes.getDimensionPixelSize(za3.C4068m.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        g8Var.mo16391i(1);
    }

    /* renamed from: B */
    public static boolean m1209B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(za3.C4057b.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    public static boolean m1210a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1210a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m1211g(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: A */
    public final void mo794A() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f661a.findViewById(za3.C4062g.parentPanel);
        int i = za3.C4062g.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = za3.C4062g.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = za3.C4062g.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(za3.C4062g.customPanel);
        mo817y(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup j = mo802j(findViewById7, findViewById4);
        ViewGroup j2 = mo802j(findViewById8, findViewById5);
        ViewGroup j3 = mo802j(findViewById9, findViewById6);
        mo816x(j2);
        mo815w(j3);
        mo818z(j);
        char c = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (j == null || j.getVisibility() == 8) ? false : true;
        boolean z3 = (j3 == null || j3.getVisibility() == 8) ? false : true;
        if (!(z3 || j2 == null || (findViewById2 = j2.findViewById(za3.C4062g.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f667a;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f677b == null && this.f665a == null)) {
                view = j.findViewById(za3.C4062g.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(j2 == null || (findViewById = j2.findViewById(za3.C4062g.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f665a;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view2 = this.f665a;
            if (view2 == null) {
                view2 = this.f667a;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                mo810r(j2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f665a;
        if (listView2 != null && (listAdapter = this.f664a) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.f691h;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }

    /* renamed from: b */
    public final void mo795b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public Button mo796c(int i) {
        if (i == -3) {
            return this.f682c;
        }
        if (i == -2) {
            return this.f675b;
        }
        if (i != -1) {
            return null;
        }
        return this.f662a;
    }

    /* renamed from: d */
    public int mo797d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f655a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView mo798e() {
        return this.f665a;
    }

    /* renamed from: f */
    public void mo799f() {
        this.f668a.setContentView(mo803k());
        mo794A();
    }

    /* renamed from: h */
    public boolean mo800h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f667a;
        return nestedScrollView != null && nestedScrollView.mo3887v(keyEvent);
    }

    /* renamed from: i */
    public boolean mo801i(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f667a;
        return nestedScrollView != null && nestedScrollView.mo3887v(keyEvent);
    }

    @ts2
    /* renamed from: j */
    public final ViewGroup mo802j(@ts2 View view, @ts2 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    public final int mo803k() {
        int i = this.f693j;
        return i == 0 ? this.f692i : this.f698o == 1 ? i : this.f692i;
    }

    /* renamed from: l */
    public void mo804l(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f657a.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f688e = charSequence;
            this.f681c = message;
            this.f680c = drawable;
        } else if (i == -2) {
            this.f686d = charSequence;
            this.f673b = message;
            this.f672b = drawable;
        } else if (i == -1) {
            this.f683c = charSequence;
            this.f658a = message;
            this.f656a = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: m */
    public void mo805m(int i) {
        this.f698o = i;
    }

    /* renamed from: n */
    public void mo806n(View view) {
        this.f674b = view;
    }

    /* renamed from: o */
    public void mo807o(int i) {
        this.f685d = null;
        this.f690g = i;
        ImageView imageView = this.f663a;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f663a.setImageResource(this.f690g);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: p */
    public void mo808p(Drawable drawable) {
        this.f685d = drawable;
        this.f690g = 0;
        ImageView imageView = this.f663a;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f663a.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: q */
    public void mo809q(CharSequence charSequence) {
        this.f677b = charSequence;
        TextView textView = this.f676b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public final void mo810r(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f661a.findViewById(za3.C4062g.scrollIndicatorUp);
        View findViewById2 = this.f661a.findViewById(za3.C4062g.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            jt4.m18994p2(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f677b != null) {
                    this.f667a.setOnScrollChangeListener(new C0166b(findViewById, findViewById2));
                    this.f667a.post(new C0167c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f665a;
                if (listView != null) {
                    listView.setOnScrollListener(new C0168d(findViewById, findViewById2));
                    this.f665a.post(new C0169e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: s */
    public void mo811s(CharSequence charSequence) {
        this.f669a = charSequence;
        TextView textView = this.f666a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: t */
    public void mo812t(int i) {
        this.f660a = null;
        this.f671b = i;
        this.f670a = false;
    }

    /* renamed from: u */
    public void mo813u(View view) {
        this.f660a = view;
        this.f671b = 0;
        this.f670a = false;
    }

    /* renamed from: v */
    public void mo814v(View view, int i, int i2, int i3, int i4) {
        this.f660a = view;
        this.f671b = 0;
        this.f670a = true;
        this.f679c = i;
        this.f684d = i2;
        this.f687e = i3;
        this.f689f = i4;
    }

    /* renamed from: w */
    public final void mo815w(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f662a = button2;
        button2.setOnClickListener(this.f659a);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f683c) || this.f656a != null) {
            this.f662a.setText(this.f683c);
            Drawable drawable = this.f656a;
            if (drawable != null) {
                int i = this.f654a;
                drawable.setBounds(0, 0, i, i);
                this.f662a.setCompoundDrawables(this.f656a, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f662a.setVisibility(0);
            z = true;
        } else {
            this.f662a.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f675b = button3;
        button3.setOnClickListener(this.f659a);
        if (!TextUtils.isEmpty(this.f686d) || this.f672b != null) {
            this.f675b.setText(this.f686d);
            Drawable drawable2 = this.f672b;
            if (drawable2 != null) {
                int i2 = this.f654a;
                drawable2.setBounds(0, 0, i2, i2);
                this.f675b.setCompoundDrawables(this.f672b, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f675b.setVisibility(0);
            z |= true;
        } else {
            this.f675b.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f682c = button4;
        button4.setOnClickListener(this.f659a);
        if (!TextUtils.isEmpty(this.f688e) || this.f680c != null) {
            this.f682c.setText(this.f688e);
            Drawable drawable3 = this.f680c;
            if (drawable3 != null) {
                int i3 = this.f654a;
                drawable3.setBounds(0, 0, i3, i3);
                this.f682c.setCompoundDrawables(this.f680c, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f682c.setVisibility(0);
            z |= true;
        } else {
            this.f682c.setVisibility(8);
        }
        if (m1209B(this.f655a)) {
            if (z) {
                button = this.f662a;
            } else if (z) {
                button = this.f675b;
            } else if (z) {
                button = this.f682c;
            }
            mo795b(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: x */
    public final void mo816x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f661a.findViewById(za3.C4062g.scrollView);
        this.f667a = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f667a.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f676b = textView;
        if (textView != null) {
            CharSequence charSequence = this.f677b;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f667a.removeView(this.f676b);
            if (this.f665a != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f667a.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f667a);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f665a, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: y */
    public final void mo817y(ViewGroup viewGroup) {
        View view = this.f660a;
        boolean z = false;
        if (view == null) {
            view = this.f671b != 0 ? LayoutInflater.from(this.f655a).inflate(this.f671b, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m1210a(view)) {
            this.f661a.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f661a.findViewById(za3.C4062g.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f670a) {
                frameLayout.setPadding(this.f679c, this.f684d, this.f687e, this.f689f);
            }
            if (this.f665a != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: z */
    public final void mo818z(ViewGroup viewGroup) {
        if (this.f674b != null) {
            viewGroup.addView(this.f674b, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f661a.findViewById(za3.C4062g.title_template).setVisibility(8);
            return;
        }
        this.f663a = (ImageView) this.f661a.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f669a)) || !this.f678b) {
            this.f661a.findViewById(za3.C4062g.title_template).setVisibility(8);
            this.f663a.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f661a.findViewById(za3.C4062g.alertTitle);
        this.f666a = textView;
        textView.setText(this.f669a);
        int i = this.f690g;
        if (i != 0) {
            this.f663a.setImageResource(i);
            return;
        }
        Drawable drawable = this.f685d;
        if (drawable != null) {
            this.f663a.setImageDrawable(drawable);
            return;
        }
        this.f666a.setPadding(this.f663a.getPaddingLeft(), this.f663a.getPaddingTop(), this.f663a.getPaddingRight(), this.f663a.getPaddingBottom());
        this.f663a.setVisibility(8);
    }
}
