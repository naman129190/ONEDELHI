package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.sk3;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
/* renamed from: com.onedelhi.secure.i8 */
public final class C2416i8 {

    /* renamed from: a */
    public static final PorterDuff.Mode f13534a = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public static C2416i8 f13535a = null;

    /* renamed from: a */
    public static final String f13536a = "AppCompatDrawableManag";

    /* renamed from: a */
    public static final boolean f13537a = false;

    /* renamed from: a */
    public sk3 f13538a;

    /* renamed from: com.onedelhi.secure.i8$a */
    public class C2417a implements sk3.C3524f {

        /* renamed from: a */
        public final int[] f13539a = {za3.C4061f.abc_textfield_search_default_mtrl_alpha, za3.C4061f.abc_textfield_default_mtrl_alpha, za3.C4061f.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f13540b = {za3.C4061f.abc_ic_commit_search_api_mtrl_alpha, za3.C4061f.abc_seekbar_tick_mark_material, za3.C4061f.abc_ic_menu_share_mtrl_alpha, za3.C4061f.abc_ic_menu_copy_mtrl_am_alpha, za3.C4061f.abc_ic_menu_cut_mtrl_alpha, za3.C4061f.abc_ic_menu_selectall_mtrl_alpha, za3.C4061f.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f13541c = {za3.C4061f.abc_textfield_activated_mtrl_alpha, za3.C4061f.abc_textfield_search_activated_mtrl_alpha, za3.C4061f.abc_cab_background_top_mtrl_alpha, za3.C4061f.abc_text_cursor_material, za3.C4061f.abc_text_select_handle_left_mtrl, za3.C4061f.abc_text_select_handle_middle_mtrl, za3.C4061f.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f13542d = {za3.C4061f.abc_popup_background_mtrl_mult, za3.C4061f.abc_cab_background_internal_bg, za3.C4061f.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f13543e = {za3.C4061f.abc_tab_indicator_material, za3.C4061f.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f13544f = {za3.C4061f.abc_btn_check_material, za3.C4061f.abc_btn_radio_material, za3.C4061f.abc_btn_check_material_anim, za3.C4061f.abc_btn_radio_material_anim};

        /* renamed from: a */
        public Drawable mo17668a(@mr2 sk3 sk3, @mr2 Context context, int i) {
            int i2;
            if (i == za3.C4061f.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{sk3.mo24462j(context, za3.C4061f.abc_cab_background_internal_bg), sk3.mo24462j(context, za3.C4061f.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == za3.C4061f.abc_ratingbar_material) {
                i2 = za3.C4060e.abc_star_big;
            } else if (i == za3.C4061f.abc_ratingbar_indicator_material) {
                i2 = za3.C4060e.abc_star_medium;
            } else if (i != za3.C4061f.abc_ratingbar_small_material) {
                return null;
            } else {
                i2 = za3.C4060e.abc_star_small;
            }
            return mo17679l(sk3, context, i2);
        }

        /* renamed from: b */
        public PorterDuff.Mode mo17669b(int i) {
            if (i == za3.C4061f.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo17670c(@mr2 Context context, int i, @mr2 Drawable drawable) {
            Drawable findDrawableByLayerId;
            int d;
            if (i == za3.C4061f.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = za3.C4057b.colorControlNormal;
                mo17680m(findDrawableByLayerId2, qb4.m25635d(context, i2), C2416i8.f13534a);
                mo17680m(layerDrawable.findDrawableByLayerId(16908303), qb4.m25635d(context, i2), C2416i8.f13534a);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                d = qb4.m25635d(context, za3.C4057b.colorControlActivated);
            } else if (i != za3.C4061f.abc_ratingbar_material && i != za3.C4061f.abc_ratingbar_indicator_material && i != za3.C4061f.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                mo17680m(layerDrawable2.findDrawableByLayerId(16908288), qb4.m25634c(context, za3.C4057b.colorControlNormal), C2416i8.f13534a);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = za3.C4057b.colorControlActivated;
                mo17680m(findDrawableByLayerId3, qb4.m25635d(context, i3), C2416i8.f13534a);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                d = qb4.m25635d(context, i3);
            }
            mo17680m(findDrawableByLayerId, d, C2416i8.f13534a);
            return true;
        }

        /* renamed from: d */
        public ColorStateList mo17671d(@mr2 Context context, int i) {
            if (i == za3.C4061f.abc_edit_text_material) {
                return C3129p8.m24528a(context, za3.C4059d.abc_tint_edittext);
            }
            if (i == za3.C4061f.abc_switch_track_mtrl_alpha) {
                return C3129p8.m24528a(context, za3.C4059d.abc_tint_switch_track);
            }
            if (i == za3.C4061f.abc_switch_thumb_material) {
                return mo17678k(context);
            }
            if (i == za3.C4061f.abc_btn_default_mtrl_shape) {
                return mo17677j(context);
            }
            if (i == za3.C4061f.abc_btn_borderless_material) {
                return mo17674g(context);
            }
            if (i == za3.C4061f.abc_btn_colored_material) {
                return mo17676i(context);
            }
            if (i == za3.C4061f.abc_spinner_mtrl_am_alpha || i == za3.C4061f.abc_spinner_textfield_background_material) {
                return C3129p8.m24528a(context, za3.C4059d.abc_tint_spinner);
            }
            if (mo17673f(this.f13540b, i)) {
                return qb4.m25637f(context, za3.C4057b.colorControlNormal);
            }
            if (mo17673f(this.f13543e, i)) {
                return C3129p8.m24528a(context, za3.C4059d.abc_tint_default);
            }
            if (mo17673f(this.f13544f, i)) {
                return C3129p8.m24528a(context, za3.C4059d.abc_tint_btn_checkable);
            }
            if (i == za3.C4061f.abc_seekbar_thumb_material) {
                return C3129p8.m24528a(context, za3.C4059d.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo17672e(@com.onedelhi.secure.mr2 android.content.Context r7, int r8, @com.onedelhi.secure.mr2 android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = com.onedelhi.secure.C2416i8.f13534a
                int[] r1 = r6.f13539a
                boolean r1 = r6.mo17673f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = com.onedelhi.secure.za3.C4057b.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f13541c
                boolean r1 = r6.mo17673f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = com.onedelhi.secure.za3.C4057b.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f13542d
                boolean r1 = r6.mo17673f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = com.onedelhi.secure.za3.C4061f.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = com.onedelhi.secure.za3.C4061f.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = com.onedelhi.secure.jp0.m18730a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = com.onedelhi.secure.qb4.m25635d(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = com.onedelhi.secure.C2416i8.m17331e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2416i8.C2417a.mo17672e(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: f */
        public final boolean mo17673f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList mo17674g(@mr2 Context context) {
            return mo17675h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList mo17675h(@mr2 Context context, @d10 int i) {
            int d = qb4.m25635d(context, za3.C4057b.colorControlHighlight);
            int c = qb4.m25634c(context, za3.C4057b.colorButtonNormal);
            return new ColorStateList(new int[][]{qb4.f19063a, qb4.f19066d, qb4.f19064b, qb4.f19070h}, new int[]{c, p10.m24319t(d, i), p10.m24319t(d, i), i});
        }

        /* renamed from: i */
        public final ColorStateList mo17676i(@mr2 Context context) {
            return mo17675h(context, qb4.m25635d(context, za3.C4057b.colorAccent));
        }

        /* renamed from: j */
        public final ColorStateList mo17677j(@mr2 Context context) {
            return mo17675h(context, qb4.m25635d(context, za3.C4057b.colorButtonNormal));
        }

        /* renamed from: k */
        public final ColorStateList mo17678k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = za3.C4057b.colorSwitchThumbNormal;
            ColorStateList f = qb4.m25637f(context, i);
            if (f == null || !f.isStateful()) {
                iArr[0] = qb4.f19063a;
                iArr2[0] = qb4.m25634c(context, i);
                iArr[1] = qb4.f19067e;
                iArr2[1] = qb4.m25635d(context, za3.C4057b.colorControlActivated);
                iArr[2] = qb4.f19070h;
                iArr2[2] = qb4.m25635d(context, i);
            } else {
                iArr[0] = qb4.f19063a;
                iArr2[0] = f.getColorForState(iArr[0], 0);
                iArr[1] = qb4.f19067e;
                iArr2[1] = qb4.m25635d(context, za3.C4057b.colorControlActivated);
                iArr[2] = qb4.f19070h;
                iArr2[2] = f.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final LayerDrawable mo17679l(@mr2 sk3 sk3, @mr2 Context context, @yk0 int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = sk3.mo24462j(context, za3.C4061f.abc_star_black_48dp);
            Drawable j2 = sk3.mo24462j(context, za3.C4061f.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void mo17680m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (jp0.m18730a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C2416i8.f13534a;
            }
            drawable.setColorFilter(C2416i8.m17331e(i, mode));
        }
    }

    /* renamed from: b */
    public static synchronized C2416i8 m17330b() {
        C2416i8 i8Var;
        synchronized (C2416i8.class) {
            if (f13535a == null) {
                m17332i();
            }
            i8Var = f13535a;
        }
        return i8Var;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m17331e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C2416i8.class) {
            l = sk3.m27674l(i, mode);
        }
        return l;
    }

    /* renamed from: i */
    public static synchronized void m17332i() {
        synchronized (C2416i8.class) {
            if (f13535a == null) {
                C2416i8 i8Var = new C2416i8();
                f13535a = i8Var;
                i8Var.f13538a = sk3.m27673h();
                f13535a.f13538a.mo24470u(new C2417a());
            }
        }
    }

    /* renamed from: j */
    public static void m17333j(Drawable drawable, ye4 ye4, int[] iArr) {
        sk3.m27677w(drawable, ye4, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo17662c(@mr2 Context context, @dp0 int i) {
        return this.f13538a.mo24462j(context, i);
    }

    /* renamed from: d */
    public synchronized Drawable mo17663d(@mr2 Context context, @dp0 int i, boolean z) {
        return this.f13538a.mo24463k(context, i, z);
    }

    /* renamed from: f */
    public synchronized ColorStateList mo17664f(@mr2 Context context, @dp0 int i) {
        return this.f13538a.mo24464m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo17665g(@mr2 Context context) {
        this.f13538a.mo24468s(context);
    }

    /* renamed from: h */
    public synchronized Drawable mo17666h(@mr2 Context context, @mr2 ms4 ms4, @dp0 int i) {
        return this.f13538a.mo24469t(context, ms4, i);
    }

    /* renamed from: k */
    public boolean mo17667k(@mr2 Context context, @dp0 int i, @mr2 Drawable drawable) {
        return this.f13538a.mo24472x(context, i, drawable);
    }
}
