package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.onedelhi.secure.C2223g8;
import com.onedelhi.secure.C3483sa;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

/* renamed from: androidx.appcompat.app.c */
public class C0189c extends C2223g8 implements DialogInterface {

    /* renamed from: n */
    public static final int f798n = 0;

    /* renamed from: o */
    public static final int f799o = 1;

    /* renamed from: a */
    public final AlertController f800a;

    /* renamed from: androidx.appcompat.app.c$a */
    public static class C0190a {

        /* renamed from: a */
        public final int f801a;

        /* renamed from: a */
        public final AlertController.C0170f f802a;

        public C0190a(@mr2 Context context) {
            this(context, C0189c.m1311l(context, 0));
        }

        public C0190a(@mr2 Context context, @e64 int i) {
            this.f802a = new AlertController.C0170f(new ContextThemeWrapper(context, C0189c.m1311l(context, i)));
            this.f801a = i;
        }

        /* renamed from: A */
        public C0190a mo926A(DialogInterface.OnKeyListener onKeyListener) {
            this.f802a.f719a = onKeyListener;
            return this;
        }

        /* renamed from: B */
        public C0190a mo927B(@e54 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f743c = fVar.f715a.getText(i);
            this.f802a.f717a = onClickListener;
            return this;
        }

        /* renamed from: C */
        public C0190a mo928C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f743c = charSequence;
            fVar.f717a = onClickListener;
            return this;
        }

        /* renamed from: D */
        public C0190a mo929D(Drawable drawable) {
            this.f802a.f735b = drawable;
            return this;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: E */
        public C0190a mo930E(boolean z) {
            this.f802a.f754f = z;
            return this;
        }

        /* renamed from: F */
        public C0190a mo931F(@C3483sa int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f731a = fVar.f715a.getResources().getTextArray(i);
            AlertController.C0170f fVar2 = this.f802a;
            fVar2.f746d = onClickListener;
            fVar2.f756h = i2;
            fVar2.f749d = true;
            return this;
        }

        /* renamed from: G */
        public C0190a mo932G(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f721a = cursor;
            fVar.f746d = onClickListener;
            fVar.f756h = i;
            fVar.f729a = str;
            fVar.f749d = true;
            return this;
        }

        /* renamed from: H */
        public C0190a mo933H(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f726a = listAdapter;
            fVar.f746d = onClickListener;
            fVar.f756h = i;
            fVar.f749d = true;
            return this;
        }

        /* renamed from: I */
        public C0190a mo934I(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f731a = charSequenceArr;
            fVar.f746d = onClickListener;
            fVar.f756h = i;
            fVar.f749d = true;
            return this;
        }

        /* renamed from: J */
        public C0190a mo935J(@e54 int i) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f728a = fVar.f715a.getText(i);
            return this;
        }

        /* renamed from: K */
        public C0190a mo936K(@ts2 CharSequence charSequence) {
            this.f802a.f728a = charSequence;
            return this;
        }

        /* renamed from: L */
        public C0190a mo937L(int i) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f736b = null;
            fVar.f740c = i;
            fVar.f739b = false;
            return this;
        }

        /* renamed from: M */
        public C0190a mo938M(View view) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f736b = view;
            fVar.f740c = 0;
            fVar.f739b = false;
            return this;
        }

        @Deprecated
        @hl3({hl3.C2354a.f13188c})
        /* renamed from: N */
        public C0190a mo939N(View view, int i, int i2, int i3, int i4) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f736b = view;
            fVar.f740c = 0;
            fVar.f739b = true;
            fVar.f745d = i;
            fVar.f750e = i2;
            fVar.f753f = i3;
            fVar.f755g = i4;
            return this;
        }

        /* renamed from: O */
        public C0189c mo940O() {
            C0189c a = mo941a();
            a.show();
            return a;
        }

        @mr2
        /* renamed from: a */
        public C0189c mo941a() {
            C0189c cVar = new C0189c(this.f802a.f715a, this.f801a);
            this.f802a.mo826a(cVar.f800a);
            cVar.setCancelable(this.f802a.f730a);
            if (this.f802a.f730a) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f802a.f716a);
            cVar.setOnDismissListener(this.f802a.f718a);
            DialogInterface.OnKeyListener onKeyListener = this.f802a.f719a;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        @mr2
        /* renamed from: b */
        public Context mo942b() {
            return this.f802a.f715a;
        }

        /* renamed from: c */
        public C0190a mo943c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f726a = listAdapter;
            fVar.f746d = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0190a mo944d(boolean z) {
            this.f802a.f730a = z;
            return this;
        }

        /* renamed from: e */
        public C0190a mo945e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f721a = cursor;
            fVar.f729a = str;
            fVar.f746d = onClickListener;
            return this;
        }

        /* renamed from: f */
        public C0190a mo946f(@ts2 View view) {
            this.f802a.f724a = view;
            return this;
        }

        /* renamed from: g */
        public C0190a mo947g(@dp0 int i) {
            this.f802a.f714a = i;
            return this;
        }

        /* renamed from: h */
        public C0190a mo948h(@ts2 Drawable drawable) {
            this.f802a.f722a = drawable;
            return this;
        }

        /* renamed from: i */
        public C0190a mo949i(@C3982yb int i) {
            TypedValue typedValue = new TypedValue();
            this.f802a.f715a.getTheme().resolveAttribute(i, typedValue, true);
            this.f802a.f714a = typedValue.resourceId;
            return this;
        }

        @Deprecated
        /* renamed from: j */
        public C0190a mo950j(boolean z) {
            this.f802a.f752e = z;
            return this;
        }

        /* renamed from: k */
        public C0190a mo951k(@C3483sa int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f731a = fVar.f715a.getResources().getTextArray(i);
            this.f802a.f746d = onClickListener;
            return this;
        }

        /* renamed from: l */
        public C0190a mo952l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f731a = charSequenceArr;
            fVar.f746d = onClickListener;
            return this;
        }

        /* renamed from: m */
        public C0190a mo953m(@e54 int i) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f737b = fVar.f715a.getText(i);
            return this;
        }

        /* renamed from: n */
        public C0190a mo954n(@ts2 CharSequence charSequence) {
            this.f802a.f737b = charSequence;
            return this;
        }

        /* renamed from: o */
        public C0190a mo955o(@C3483sa int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f731a = fVar.f715a.getResources().getTextArray(i);
            AlertController.C0170f fVar2 = this.f802a;
            fVar2.f720a = onMultiChoiceClickListener;
            fVar2.f732a = zArr;
            fVar2.f744c = true;
            return this;
        }

        /* renamed from: p */
        public C0190a mo956p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f721a = cursor;
            fVar.f720a = onMultiChoiceClickListener;
            fVar.f738b = str;
            fVar.f729a = str2;
            fVar.f744c = true;
            return this;
        }

        /* renamed from: q */
        public C0190a mo957q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f731a = charSequenceArr;
            fVar.f720a = onMultiChoiceClickListener;
            fVar.f732a = zArr;
            fVar.f744c = true;
            return this;
        }

        /* renamed from: r */
        public C0190a mo958r(@e54 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f748d = fVar.f715a.getText(i);
            this.f802a.f734b = onClickListener;
            return this;
        }

        /* renamed from: s */
        public C0190a mo959s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f748d = charSequence;
            fVar.f734b = onClickListener;
            return this;
        }

        /* renamed from: t */
        public C0190a mo960t(Drawable drawable) {
            this.f802a.f742c = drawable;
            return this;
        }

        /* renamed from: u */
        public C0190a mo961u(@e54 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f751e = fVar.f715a.getText(i);
            this.f802a.f741c = onClickListener;
            return this;
        }

        /* renamed from: v */
        public C0190a mo962v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f fVar = this.f802a;
            fVar.f751e = charSequence;
            fVar.f741c = onClickListener;
            return this;
        }

        /* renamed from: w */
        public C0190a mo963w(Drawable drawable) {
            this.f802a.f747d = drawable;
            return this;
        }

        /* renamed from: x */
        public C0190a mo964x(DialogInterface.OnCancelListener onCancelListener) {
            this.f802a.f716a = onCancelListener;
            return this;
        }

        /* renamed from: y */
        public C0190a mo965y(DialogInterface.OnDismissListener onDismissListener) {
            this.f802a.f718a = onDismissListener;
            return this;
        }

        /* renamed from: z */
        public C0190a mo966z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f802a.f725a = onItemSelectedListener;
            return this;
        }
    }

    public C0189c(@mr2 Context context) {
        this(context, 0);
    }

    public C0189c(@mr2 Context context, @e64 int i) {
        super(context, m1311l(context, i));
        this.f800a = new AlertController(getContext(), this, getWindow());
    }

    public C0189c(@mr2 Context context, boolean z, @ts2 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    /* renamed from: l */
    public static int m1311l(@mr2 Context context, @e64 int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(za3.C4057b.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: j */
    public Button mo909j(int i) {
        return this.f800a.mo796c(i);
    }

    /* renamed from: k */
    public ListView mo910k() {
        return this.f800a.mo798e();
    }

    /* renamed from: m */
    public void mo911m(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f800a.mo804l(i, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    /* renamed from: n */
    public void mo912n(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f800a.mo804l(i, charSequence, onClickListener, (Message) null, drawable);
    }

    /* renamed from: o */
    public void mo913o(int i, CharSequence charSequence, Message message) {
        this.f800a.mo804l(i, charSequence, (DialogInterface.OnClickListener) null, message, (Drawable) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f800a.mo799f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f800a.mo800h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f800a.mo801i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: p */
    public void mo917p(int i) {
        this.f800a.mo805m(i);
    }

    /* renamed from: q */
    public void mo918q(View view) {
        this.f800a.mo806n(view);
    }

    /* renamed from: r */
    public void mo919r(int i) {
        this.f800a.mo807o(i);
    }

    /* renamed from: s */
    public void mo920s(Drawable drawable) {
        this.f800a.mo808p(drawable);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f800a.mo811s(charSequence);
    }

    /* renamed from: t */
    public void mo922t(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.f800a.mo807o(typedValue.resourceId);
    }

    /* renamed from: u */
    public void mo923u(CharSequence charSequence) {
        this.f800a.mo809q(charSequence);
    }

    /* renamed from: v */
    public void mo924v(View view) {
        this.f800a.mo813u(view);
    }

    /* renamed from: w */
    public void mo925w(View view, int i, int i2, int i3, int i4) {
        this.f800a.mo814v(view, i, i2, i3, i4);
    }
}
