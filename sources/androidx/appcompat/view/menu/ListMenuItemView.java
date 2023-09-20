package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0260k;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class ListMenuItemView extends LinearLayout implements C0260k.C0261a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public static final String f1012b = "ListMenuItemView";

    /* renamed from: a */
    public Context f1013a;

    /* renamed from: a */
    public Drawable f1014a;

    /* renamed from: a */
    public LayoutInflater f1015a;

    /* renamed from: a */
    public CheckBox f1016a;

    /* renamed from: a */
    public ImageView f1017a;

    /* renamed from: a */
    public LinearLayout f1018a;

    /* renamed from: a */
    public RadioButton f1019a;

    /* renamed from: a */
    public TextView f1020a;

    /* renamed from: a */
    public C0253h f1021a;

    /* renamed from: b */
    public Drawable f1022b;

    /* renamed from: b */
    public ImageView f1023b;

    /* renamed from: b */
    public TextView f1024b;

    /* renamed from: b */
    public boolean f1025b;

    /* renamed from: c */
    public ImageView f1026c;

    /* renamed from: c */
    public boolean f1027c;

    /* renamed from: d */
    public boolean f1028d;

    /* renamed from: n */
    public int f1029n;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        af4 G = af4.m11110G(getContext(), attributeSet, za3.C4068m.MenuView, i, 0);
        this.f1014a = G.mo13037h(za3.C4068m.MenuView_android_itemBackground);
        this.f1029n = G.mo13050u(za3.C4068m.MenuView_android_itemTextAppearance, -1);
        this.f1025b = G.mo13030a(za3.C4068m.MenuView_preserveIconSpacing, false);
        this.f1013a = context;
        this.f1022b = G.mo13037h(za3.C4068m.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, za3.C4057b.dropDownListViewStyle, 0);
        this.f1027c = obtainStyledAttributes.hasValue(0);
        G.mo13029I();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1015a == null) {
            this.f1015a = LayoutInflater.from(getContext());
        }
        return this.f1015a;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1023b;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo1202a(View view) {
        mo1204c(view, -1);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1026c;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1026c.getLayoutParams();
            rect.top += this.f1026c.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public void mo1171b(C0253h hVar, int i) {
        this.f1021a = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.mo1428n(this));
        setCheckable(hVar.isCheckable());
        setShortcut(hVar.mo1387F(), hVar.mo1426l());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    /* renamed from: c */
    public final void mo1204c(View view, int i) {
        LinearLayout linearLayout = this.f1018a;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: d */
    public boolean mo1172d() {
        return false;
    }

    /* renamed from: e */
    public final void mo1205e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(za3.C4065j.abc_list_menu_item_checkbox, this, false);
        this.f1016a = checkBox;
        mo1202a(checkBox);
    }

    /* renamed from: f */
    public boolean mo1174f() {
        return this.f1028d;
    }

    /* renamed from: g */
    public final void mo1206g() {
        ImageView imageView = (ImageView) getInflater().inflate(za3.C4065j.abc_list_menu_item_icon, this, false);
        this.f1017a = imageView;
        mo1204c(imageView, 0);
    }

    public C0253h getItemData() {
        return this.f1021a;
    }

    /* renamed from: h */
    public final void mo1207h() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(za3.C4065j.abc_list_menu_item_radio, this, false);
        this.f1019a = radioButton;
        mo1202a(radioButton);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        jt4.m18877I1(this, this.f1014a);
        TextView textView = (TextView) findViewById(za3.C4062g.title);
        this.f1020a = textView;
        int i = this.f1029n;
        if (i != -1) {
            textView.setTextAppearance(this.f1013a, i);
        }
        this.f1024b = (TextView) findViewById(za3.C4062g.shortcut);
        ImageView imageView = (ImageView) findViewById(za3.C4062g.submenuarrow);
        this.f1023b = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1022b);
        }
        this.f1026c = (ImageView) findViewById(za3.C4062g.group_divider);
        this.f1018a = (LinearLayout) findViewById(za3.C4062g.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f1017a != null && this.f1025b) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1017a.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1019a != null || this.f1016a != null) {
            if (this.f1021a.mo1432r()) {
                if (this.f1019a == null) {
                    mo1207h();
                }
                compoundButton2 = this.f1019a;
                compoundButton = this.f1016a;
            } else {
                if (this.f1016a == null) {
                    mo1205e();
                }
                compoundButton2 = this.f1016a;
                compoundButton = this.f1019a;
            }
            if (z) {
                compoundButton2.setChecked(this.f1021a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1016a;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1019a;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1021a.mo1432r()) {
            if (this.f1019a == null) {
                mo1207h();
            }
            compoundButton = this.f1019a;
        } else {
            if (this.f1016a == null) {
                mo1205e();
            }
            compoundButton = this.f1016a;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1028d = z;
        this.f1025b = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1026c;
        if (imageView != null) {
            imageView.setVisibility((this.f1027c || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1021a.mo1386E() || this.f1028d;
        if (z || this.f1025b) {
            ImageView imageView = this.f1017a;
            if (imageView != null || drawable != null || this.f1025b) {
                if (imageView == null) {
                    mo1206g();
                }
                if (drawable != null || this.f1025b) {
                    ImageView imageView2 = this.f1017a;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f1017a.getVisibility() != 0) {
                        this.f1017a.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1017a.setVisibility(8);
            }
        }
    }

    public void setShortcut(boolean z, char c) {
        int i = (!z || !this.f1021a.mo1387F()) ? 8 : 0;
        if (i == 0) {
            this.f1024b.setText(this.f1021a.mo1427m());
        }
        if (this.f1024b.getVisibility() != i) {
            this.f1024b.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f1020a.setText(charSequence);
            if (this.f1020a.getVisibility() != 0) {
                textView = this.f1020a;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f1020a.getVisibility() != 8) {
                textView = this.f1020a;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
