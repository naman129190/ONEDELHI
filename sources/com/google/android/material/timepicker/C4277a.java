package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import com.onedelhi.secure.be4;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.je2;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sd4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wk0;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.material.timepicker.a */
public final class C4277a extends wk0 implements TimePickerView.C4274d {

    /* renamed from: b */
    public static final String f24759b = "TIME_PICKER_TIME_MODEL";

    /* renamed from: c */
    public static final String f24760c = "TIME_PICKER_INPUT_MODE";

    /* renamed from: d */
    public static final String f24761d = "TIME_PICKER_TITLE_RES";

    /* renamed from: e */
    public static final String f24762e = "TIME_PICKER_TITLE_TEXT";

    /* renamed from: f */
    public static final String f24763f = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";

    /* renamed from: g */
    public static final String f24764g = "TIME_PICKER_POSITIVE_BUTTON_TEXT";

    /* renamed from: h */
    public static final String f24765h = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";

    /* renamed from: i */
    public static final String f24766i = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";

    /* renamed from: j */
    public static final String f24767j = "TIME_PICKER_OVERRIDE_THEME_RES_ID";

    /* renamed from: u */
    public static final int f24768u = 0;

    /* renamed from: v */
    public static final int f24769v = 1;

    /* renamed from: a */
    public ViewStub f24770a;

    /* renamed from: a */
    public Button f24771a;

    /* renamed from: a */
    public MaterialButton f24772a;

    /* renamed from: a */
    public TimePickerView f24773a;
    @ts2

    /* renamed from: a */
    public C4283c f24774a;
    @ts2

    /* renamed from: a */
    public C4287e f24775a;
    @ts2

    /* renamed from: a */
    public be4 f24776a;

    /* renamed from: a */
    public sd4 f24777a;

    /* renamed from: a */
    public CharSequence f24778a;

    /* renamed from: a */
    public final Set<View.OnClickListener> f24779a = new LinkedHashSet();

    /* renamed from: b */
    public CharSequence f24780b;

    /* renamed from: b */
    public final Set<View.OnClickListener> f24781b = new LinkedHashSet();

    /* renamed from: c */
    public CharSequence f24782c;

    /* renamed from: c */
    public final Set<DialogInterface.OnCancelListener> f24783c = new LinkedHashSet();

    /* renamed from: d */
    public final Set<DialogInterface.OnDismissListener> f24784d = new LinkedHashSet();
    @dp0

    /* renamed from: n */
    public int f24785n;
    @dp0

    /* renamed from: o */
    public int f24786o;
    @e54

    /* renamed from: p */
    public int f24787p = 0;
    @e54

    /* renamed from: q */
    public int f24788q = 0;
    @e54

    /* renamed from: r */
    public int f24789r = 0;

    /* renamed from: s */
    public int f24790s = 0;

    /* renamed from: t */
    public int f24791t = 0;

    /* renamed from: com.google.android.material.timepicker.a$a */
    public class C4278a implements View.OnClickListener {
        public C4278a() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : C4277a.this.f24779a) {
                onClick.onClick(view);
            }
            C4277a.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.a$b */
    public class C4279b implements View.OnClickListener {
        public C4279b() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : C4277a.this.f24781b) {
                onClick.onClick(view);
            }
            C4277a.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.a$c */
    public class C4280c implements View.OnClickListener {
        public C4280c() {
        }

        public void onClick(View view) {
            C4277a aVar = C4277a.this;
            int unused = aVar.f24790s = aVar.f24790s == 0 ? 1 : 0;
            C4277a aVar2 = C4277a.this;
            aVar2.mo29584l0(aVar2.f24772a);
        }
    }

    /* renamed from: com.google.android.material.timepicker.a$d */
    public static final class C4281d {

        /* renamed from: a */
        public int f24795a;

        /* renamed from: a */
        public sd4 f24796a = new sd4();

        /* renamed from: a */
        public CharSequence f24797a;
        @e54

        /* renamed from: b */
        public int f24798b = 0;

        /* renamed from: b */
        public CharSequence f24799b;
        @e54

        /* renamed from: c */
        public int f24800c = 0;

        /* renamed from: c */
        public CharSequence f24801c;
        @e54

        /* renamed from: d */
        public int f24802d = 0;

        /* renamed from: e */
        public int f24803e = 0;

        @mr2
        /* renamed from: j */
        public C4277a mo29588j() {
            return C4277a.m34459b0(this);
        }

        @mr2
        /* renamed from: k */
        public C4281d mo29589k(@js1(from = 0, mo18580to = 23) int i) {
            this.f24796a.mo44289i(i);
            return this;
        }

        @mr2
        /* renamed from: l */
        public C4281d mo29590l(int i) {
            this.f24795a = i;
            return this;
        }

        @mr2
        /* renamed from: m */
        public C4281d mo29591m(@js1(from = 0, mo18580to = 59) int i) {
            this.f24796a.mo44290j(i);
            return this;
        }

        @mr2
        /* renamed from: n */
        public C4281d mo29592n(@e54 int i) {
            this.f24802d = i;
            return this;
        }

        @mr2
        /* renamed from: o */
        public C4281d mo29593o(@ts2 CharSequence charSequence) {
            this.f24801c = charSequence;
            return this;
        }

        @mr2
        /* renamed from: p */
        public C4281d mo29594p(@e54 int i) {
            this.f24800c = i;
            return this;
        }

        @mr2
        /* renamed from: q */
        public C4281d mo29595q(@ts2 CharSequence charSequence) {
            this.f24799b = charSequence;
            return this;
        }

        @mr2
        /* renamed from: r */
        public C4281d mo29596r(@e64 int i) {
            this.f24803e = i;
            return this;
        }

        @mr2
        /* renamed from: s */
        public C4281d mo29597s(int i) {
            sd4 sd4 = this.f24796a;
            int i2 = sd4.f34983o;
            int i3 = sd4.f34984p;
            sd4 sd42 = new sd4(i);
            this.f24796a = sd42;
            sd42.mo44290j(i3);
            this.f24796a.mo44289i(i2);
            return this;
        }

        @mr2
        /* renamed from: t */
        public C4281d mo29598t(@e54 int i) {
            this.f24798b = i;
            return this;
        }

        @mr2
        /* renamed from: u */
        public C4281d mo29599u(@ts2 CharSequence charSequence) {
            this.f24797a = charSequence;
            return this;
        }
    }

    @mr2
    /* renamed from: b0 */
    public static C4277a m34459b0(@mr2 C4281d dVar) {
        C4277a aVar = new C4277a();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f24759b, dVar.f24796a);
        bundle.putInt(f24760c, dVar.f24795a);
        bundle.putInt(f24761d, dVar.f24798b);
        if (dVar.f24797a != null) {
            bundle.putCharSequence(f24762e, dVar.f24797a);
        }
        bundle.putInt(f24763f, dVar.f24800c);
        if (dVar.f24799b != null) {
            bundle.putCharSequence(f24764g, dVar.f24799b);
        }
        bundle.putInt(f24765h, dVar.f24802d);
        if (dVar.f24801c != null) {
            bundle.putCharSequence(f24766i, dVar.f24801c);
        }
        bundle.putInt(f24767j, dVar.f24803e);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: I */
    public boolean mo29560I(@mr2 DialogInterface.OnCancelListener onCancelListener) {
        return this.f24783c.add(onCancelListener);
    }

    /* renamed from: L */
    public boolean mo29561L(@mr2 DialogInterface.OnDismissListener onDismissListener) {
        return this.f24784d.add(onDismissListener);
    }

    /* renamed from: N */
    public boolean mo29562N(@mr2 View.OnClickListener onClickListener) {
        return this.f24781b.add(onClickListener);
    }

    /* renamed from: O */
    public boolean mo29563O(@mr2 View.OnClickListener onClickListener) {
        return this.f24779a.add(onClickListener);
    }

    /* renamed from: P */
    public void mo29564P() {
        this.f24783c.clear();
    }

    /* renamed from: Q */
    public void mo29565Q() {
        this.f24784d.clear();
    }

    /* renamed from: R */
    public void mo29566R() {
        this.f24781b.clear();
    }

    /* renamed from: S */
    public void mo29567S() {
        this.f24779a.clear();
    }

    /* renamed from: T */
    public final Pair<Integer, Integer> mo29568T(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.f24785n), Integer.valueOf(fd3.C2163m.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.f24786o), Integer.valueOf(fd3.C2163m.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i);
    }

    @js1(from = 0, mo18580to = 23)
    /* renamed from: U */
    public int mo29569U() {
        return this.f24777a.f34983o % 24;
    }

    /* renamed from: W */
    public int mo29570W() {
        return this.f24790s;
    }

    @js1(from = 0, mo18580to = 59)
    /* renamed from: X */
    public int mo29571X() {
        return this.f24777a.f34984p;
    }

    /* renamed from: Y */
    public final int mo29572Y() {
        int i = this.f24791t;
        if (i != 0) {
            return i;
        }
        TypedValue a = je2.m53272a(requireContext(), fd3.C2153c.materialTimePickerTheme);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    @ts2
    /* renamed from: Z */
    public C4283c mo29573Z() {
        return this.f24774a;
    }

    /* renamed from: a0 */
    public final be4 mo29574a0(int i, @mr2 TimePickerView timePickerView, @mr2 ViewStub viewStub) {
        if (i == 0) {
            C4283c cVar = this.f24774a;
            if (cVar == null) {
                cVar = new C4283c(timePickerView, this.f24777a);
            }
            this.f24774a = cVar;
            return cVar;
        }
        if (this.f24775a == null) {
            this.f24775a = new C4287e((LinearLayout) viewStub.inflate(), this.f24777a);
        }
        this.f24775a.mo29619i();
        return this.f24775a;
    }

    /* renamed from: c0 */
    public boolean mo29575c0(@mr2 DialogInterface.OnCancelListener onCancelListener) {
        return this.f24783c.remove(onCancelListener);
    }

    /* renamed from: d0 */
    public boolean mo29576d0(@mr2 DialogInterface.OnDismissListener onDismissListener) {
        return this.f24784d.remove(onDismissListener);
    }

    /* renamed from: e0 */
    public boolean mo29577e0(@mr2 View.OnClickListener onClickListener) {
        return this.f24781b.remove(onClickListener);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo29557f() {
        this.f24790s = 1;
        mo29584l0(this.f24772a);
        this.f24775a.mo29621l();
    }

    /* renamed from: f0 */
    public boolean mo29578f0(@mr2 View.OnClickListener onClickListener) {
        return this.f24779a.remove(onClickListener);
    }

    /* renamed from: g0 */
    public final void mo29579g0(@ts2 Bundle bundle) {
        if (bundle != null) {
            sd4 sd4 = (sd4) bundle.getParcelable(f24759b);
            this.f24777a = sd4;
            if (sd4 == null) {
                this.f24777a = new sd4();
            }
            this.f24790s = bundle.getInt(f24760c, 0);
            this.f24787p = bundle.getInt(f24761d, 0);
            this.f24778a = bundle.getCharSequence(f24762e);
            this.f24788q = bundle.getInt(f24763f, 0);
            this.f24780b = bundle.getCharSequence(f24764g);
            this.f24789r = bundle.getInt(f24765h, 0);
            this.f24782c = bundle.getCharSequence(f24766i);
            this.f24791t = bundle.getInt(f24767j, 0);
        }
    }

    @hw4
    /* renamed from: h0 */
    public void mo29580h0(@ts2 be4 be4) {
        this.f24776a = be4;
    }

    /* renamed from: i0 */
    public void mo29581i0(@js1(from = 0, mo18580to = 23) int i) {
        this.f24777a.mo44287h(i);
        be4 be4 = this.f24776a;
        if (be4 != null) {
            be4.mo29604g();
        }
    }

    /* renamed from: j0 */
    public void mo29582j0(@js1(from = 0, mo18580to = 59) int i) {
        this.f24777a.mo44290j(i);
        be4 be4 = this.f24776a;
        if (be4 != null) {
            be4.mo29604g();
        }
    }

    /* renamed from: k0 */
    public final void mo29583k0() {
        Button button = this.f24771a;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* renamed from: l0 */
    public final void mo29584l0(MaterialButton materialButton) {
        if (materialButton != null && this.f24773a != null && this.f24770a != null) {
            be4 be4 = this.f24776a;
            if (be4 != null) {
                be4.mo29603c();
            }
            be4 a0 = mo29574a0(this.f24790s, this.f24773a, this.f24770a);
            this.f24776a = a0;
            a0.mo29601a();
            this.f24776a.mo29604g();
            Pair<Integer, Integer> T = mo29568T(this.f24790s);
            materialButton.setIconResource(((Integer) T.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) T.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public final void onCancel(@mr2 DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.f24783c) {
            onCancel.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        mo29579g0(bundle);
    }

    @mr2
    public final Dialog onCreateDialog(@ts2 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), mo29572Y());
        Context context = dialog.getContext();
        int g = je2.m53278g(context, fd3.C2153c.colorSurface, C4277a.class.getCanonicalName());
        int i = fd3.C2153c.materialTimePickerStyle;
        int i2 = fd3.C2164n.Widget_MaterialComponents_TimePicker;
        bf2 bf2 = new bf2(context, (AttributeSet) null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, fd3.C2165o.MaterialTimePicker, i, i2);
        this.f24786o = obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialTimePicker_clockIcon, 0);
        this.f24785n = obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        bf2.mo31599Z(context);
        bf2.mo31626o0(ColorStateList.valueOf(g));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(bf2);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        bf2.mo31624n0(jt4.m18904R(window.getDecorView()));
        return dialog;
    }

    @mr2
    public final View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(fd3.C2161k.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(fd3.C2158h.material_timepicker_view);
        this.f24773a = timePickerView;
        timePickerView.mo29540Q(this);
        this.f24770a = (ViewStub) viewGroup2.findViewById(fd3.C2158h.material_textinput_timepicker);
        this.f24772a = (MaterialButton) viewGroup2.findViewById(fd3.C2158h.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(fd3.C2158h.header_title);
        int i = this.f24787p;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f24778a)) {
            textView.setText(this.f24778a);
        }
        mo29584l0(this.f24772a);
        Button button = (Button) viewGroup2.findViewById(fd3.C2158h.material_timepicker_ok_button);
        button.setOnClickListener(new C4278a());
        int i2 = this.f24788q;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f24780b)) {
            button.setText(this.f24780b);
        }
        Button button2 = (Button) viewGroup2.findViewById(fd3.C2158h.material_timepicker_cancel_button);
        this.f24771a = button2;
        button2.setOnClickListener(new C4279b());
        int i3 = this.f24789r;
        if (i3 != 0) {
            this.f24771a.setText(i3);
        } else if (!TextUtils.isEmpty(this.f24782c)) {
            this.f24771a.setText(this.f24782c);
        }
        mo29583k0();
        this.f24772a.setOnClickListener(new C4280c());
        return viewGroup2;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f24776a = null;
        this.f24774a = null;
        this.f24775a = null;
        TimePickerView timePickerView = this.f24773a;
        if (timePickerView != null) {
            timePickerView.mo29540Q((TimePickerView.C4274d) null);
            this.f24773a = null;
        }
    }

    public final void onDismiss(@mr2 DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.f24784d) {
            onDismiss.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(@mr2 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f24759b, this.f24777a);
        bundle.putInt(f24760c, this.f24790s);
        bundle.putInt(f24761d, this.f24787p);
        bundle.putCharSequence(f24762e, this.f24778a);
        bundle.putInt(f24763f, this.f24788q);
        bundle.putCharSequence(f24764g, this.f24780b);
        bundle.putInt(f24765h, this.f24789r);
        bundle.putCharSequence(f24766i, this.f24782c);
        bundle.putInt(f24767j, this.f24791t);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        mo29583k0();
    }
}
