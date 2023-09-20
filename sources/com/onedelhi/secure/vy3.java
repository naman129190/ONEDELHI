package com.onedelhi.secure;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.onedelhi.secure.hl3;

public class vy3 extends hk3 {

    /* renamed from: a */
    public C3819a f21990a;

    /* renamed from: a */
    public C3820b f21991a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: a */
    public int[] f21992a;

    /* renamed from: a */
    public String[] f21993a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: b */
    public int[] f21994b;

    /* renamed from: s */
    public int f21995s = -1;

    /* renamed from: com.onedelhi.secure.vy3$a */
    public interface C3819a {
        /* renamed from: a */
        CharSequence mo26397a(Cursor cursor);
    }

    /* renamed from: com.onedelhi.secure.vy3$b */
    public interface C3820b {
        /* renamed from: a */
        boolean mo26398a(View view, Cursor cursor, int i);
    }

    @Deprecated
    public vy3(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f21994b = iArr;
        this.f21993a = strArr;
        mo26388q(cursor, strArr);
    }

    public vy3(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f21994b = iArr;
        this.f21993a = strArr;
        mo26388q(cursor, strArr);
    }

    /* renamed from: a */
    public CharSequence mo24232a(Cursor cursor) {
        C3819a aVar = this.f21990a;
        if (aVar != null) {
            return aVar.mo26397a(cursor);
        }
        int i = this.f21995s;
        return i > -1 ? cursor.getString(i) : super.mo24232a(cursor);
    }

    /* renamed from: e */
    public void mo24235e(View view, Context context, Cursor cursor) {
        C3820b bVar = this.f21991a;
        int[] iArr = this.f21994b;
        int length = iArr.length;
        int[] iArr2 = this.f21992a;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (bVar != null ? bVar.mo26398a(findViewById, cursor, iArr2[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        mo26396y((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        mo26395x((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public Cursor mo26386m(Cursor cursor) {
        mo26388q(cursor, this.f21993a);
        return super.mo26386m(cursor);
    }

    /* renamed from: p */
    public void mo26387p(Cursor cursor, String[] strArr, int[] iArr) {
        this.f21993a = strArr;
        this.f21994b = iArr;
        mo26388q(cursor, strArr);
        super.mo24233b(cursor);
    }

    /* renamed from: q */
    public final void mo26388q(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f21992a;
            if (iArr == null || iArr.length != length) {
                this.f21992a = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f21992a[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f21992a = null;
    }

    /* renamed from: r */
    public C3819a mo26389r() {
        return this.f21990a;
    }

    /* renamed from: s */
    public int mo26390s() {
        return this.f21995s;
    }

    /* renamed from: t */
    public C3820b mo26391t() {
        return this.f21991a;
    }

    /* renamed from: u */
    public void mo26392u(C3819a aVar) {
        this.f21990a = aVar;
    }

    /* renamed from: v */
    public void mo26393v(int i) {
        this.f21995s = i;
    }

    /* renamed from: w */
    public void mo26394w(C3820b bVar) {
        this.f21991a = bVar;
    }

    /* renamed from: x */
    public void mo26395x(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: y */
    public void mo26396y(TextView textView, String str) {
        textView.setText(str);
    }
}
