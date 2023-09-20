package com.onedelhi.secure;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.za3;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public class s64 extends hk3 implements View.OnClickListener {

    /* renamed from: A */
    public static final int f20218A = 50;

    /* renamed from: B */
    public static final int f20219B = 0;

    /* renamed from: C */
    public static final int f20220C = 1;

    /* renamed from: D */
    public static final int f20221D = 2;

    /* renamed from: E */
    public static final int f20222E = -1;

    /* renamed from: b */
    public static final String f20223b = "SuggestionsAdapter";

    /* renamed from: e */
    public static final boolean f20224e = false;

    /* renamed from: a */
    public final SearchableInfo f20225a;

    /* renamed from: a */
    public ColorStateList f20226a;

    /* renamed from: a */
    public final SearchView f20227a;

    /* renamed from: a */
    public final WeakHashMap<String, Drawable.ConstantState> f20228a;

    /* renamed from: b */
    public final Context f20229b;

    /* renamed from: d */
    public boolean f20230d = false;

    /* renamed from: s */
    public final int f20231s;

    /* renamed from: t */
    public int f20232t = 1;

    /* renamed from: u */
    public int f20233u = -1;

    /* renamed from: v */
    public int f20234v = -1;

    /* renamed from: w */
    public int f20235w = -1;

    /* renamed from: x */
    public int f20236x = -1;

    /* renamed from: y */
    public int f20237y = -1;

    /* renamed from: z */
    public int f20238z = -1;

    /* renamed from: com.onedelhi.secure.s64$a */
    public static final class C3475a {

        /* renamed from: a */
        public final ImageView f20239a;

        /* renamed from: a */
        public final TextView f20240a;

        /* renamed from: b */
        public final ImageView f20241b;

        /* renamed from: b */
        public final TextView f20242b;

        /* renamed from: c */
        public final ImageView f20243c;

        public C3475a(View view) {
            this.f20240a = (TextView) view.findViewById(16908308);
            this.f20242b = (TextView) view.findViewById(16908309);
            this.f20239a = (ImageView) view.findViewById(16908295);
            this.f20241b = (ImageView) view.findViewById(16908296);
            this.f20243c = (ImageView) view.findViewById(za3.C4062g.edit_query);
        }
    }

    public s64(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f20227a = searchView;
        this.f20225a = searchableInfo;
        this.f20231s = searchView.getSuggestionCommitIconResId();
        this.f20229b = context;
        this.f20228a = weakHashMap;
    }

    /* renamed from: D */
    public static String m27278D(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(f20223b, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: u */
    public static String m27279u(Cursor cursor, String str) {
        return m27278D(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: A */
    public final Drawable mo24224A(Cursor cursor) {
        int i = this.f20237y;
        if (i == -1) {
            return null;
        }
        return mo24250y(cursor.getString(i));
    }

    /* renamed from: B */
    public int mo24225B() {
        return this.f20232t;
    }

    /* renamed from: C */
    public Cursor mo24226C(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(FirebaseAnalytics.C4305d.f24947P).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f20229b.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: E */
    public void mo24227E(int i) {
        this.f20232t = i;
    }

    /* renamed from: F */
    public final void mo24228F(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: G */
    public final void mo24229G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: H */
    public final void mo24230H(String str, Drawable drawable) {
        if (drawable != null) {
            this.f20228a.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: I */
    public final void mo24231I(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: a */
    public CharSequence mo24232a(Cursor cursor) {
        String u;
        String u2;
        if (cursor == null) {
            return null;
        }
        String u3 = m27279u(cursor, "suggest_intent_query");
        if (u3 != null) {
            return u3;
        }
        if (this.f20225a.shouldRewriteQueryFromData() && (u2 = m27279u(cursor, "suggest_intent_data")) != null) {
            return u2;
        }
        if (!this.f20225a.shouldRewriteQueryFromText() || (u = m27279u(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return u;
    }

    /* renamed from: b */
    public void mo24233b(Cursor cursor) {
        if (this.f20230d) {
            Log.w(f20223b, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo24233b(cursor);
            if (cursor != null) {
                this.f20233u = cursor.getColumnIndex("suggest_text_1");
                this.f20234v = cursor.getColumnIndex("suggest_text_2");
                this.f20235w = cursor.getColumnIndex("suggest_text_2_url");
                this.f20236x = cursor.getColumnIndex("suggest_icon_1");
                this.f20237y = cursor.getColumnIndex("suggest_icon_2");
                this.f20238z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(f20223b, "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: d */
    public Cursor mo24234d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f20227a.getVisibility() == 0 && this.f20227a.getWindowVisibility() == 0) {
            try {
                Cursor C = mo24226C(this.f20225a, charSequence2, 50);
                if (C != null) {
                    C.getCount();
                    return C;
                }
            } catch (RuntimeException e) {
                Log.w(f20223b, "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo24235e(View view, Context context, Cursor cursor) {
        C3475a aVar = (C3475a) view.getTag();
        int i = this.f20238z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f20240a != null) {
            mo24229G(aVar.f20240a, m27278D(cursor, this.f20233u));
        }
        if (aVar.f20242b != null) {
            String D = m27278D(cursor, this.f20235w);
            CharSequence r = D != null ? mo24244r(D) : m27278D(cursor, this.f20234v);
            if (TextUtils.isEmpty(r)) {
                TextView textView = aVar.f20240a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f20240a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f20240a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f20240a.setMaxLines(1);
                }
            }
            mo24229G(aVar.f20242b, r);
        }
        ImageView imageView = aVar.f20239a;
        if (imageView != null) {
            mo24228F(imageView, mo24251z(cursor), 4);
        }
        ImageView imageView2 = aVar.f20241b;
        if (imageView2 != null) {
            mo24228F(imageView2, mo24224A(cursor), 8);
        }
        int i3 = this.f20232t;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f20243c.setVisibility(0);
            aVar.f20243c.setTag(aVar.f20240a.getText());
            aVar.f20243c.setOnClickListener(this);
            return;
        }
        aVar.f20243c.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(f20223b, "Search suggestions cursor threw exception.", e);
            View i2 = mo17325i(this.f20229b, mo26867c(), viewGroup);
            if (i2 != null) {
                ((C3475a) i2.getTag()).f20240a.setText(e.toString());
            }
            return i2;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(f20223b, "Search suggestions cursor threw exception.", e);
            View j = mo17326j(this.f20229b, mo26867c(), viewGroup);
            if (j != null) {
                ((C3475a) j.getTag()).f20240a.setText(e.toString());
            }
            return j;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: j */
    public View mo17326j(Context context, Cursor cursor, ViewGroup viewGroup) {
        View j = super.mo17326j(context, cursor, viewGroup);
        j.setTag(new C3475a(j));
        ((ImageView) j.findViewById(za3.C4062g.edit_query)).setImageResource(this.f20231s);
        return j;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo24231I(mo26867c());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        mo24231I(mo26867c());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f20227a.mo2164a0((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable mo24242p(String str) {
        Drawable.ConstantState constantState = this.f20228a.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: q */
    public void mo24243q() {
        mo24233b((Cursor) null);
        this.f20230d = true;
    }

    /* renamed from: r */
    public final CharSequence mo24244r(CharSequence charSequence) {
        if (this.f20226a == null) {
            TypedValue typedValue = new TypedValue();
            this.f20229b.getTheme().resolveAttribute(za3.C4057b.textColorSearchUrl, typedValue, true);
            this.f20226a = this.f20229b.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f20226a, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: s */
    public final Drawable mo24245s(ComponentName componentName) {
        String nameNotFoundException;
        PackageManager packageManager = this.f20229b.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w(f20223b, nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: t */
    public final Drawable mo24246t(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f20228a.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f20228a.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f20229b.getResources());
        }
        Drawable s = mo24245s(componentName);
        if (s != null) {
            constantState = s.getConstantState();
        }
        this.f20228a.put(flattenToShortString, constantState);
        return s;
    }

    /* renamed from: v */
    public final Drawable mo24247v() {
        Drawable t = mo24246t(this.f20225a.getSearchActivity());
        return t != null ? t : this.f20229b.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo24248w(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo24249x(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f20229b     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.s64.mo24248w(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: x */
    public Drawable mo24249x(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f20229b.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: y */
    public final Drawable mo24250y(String str) {
        if (str == null || str.isEmpty() || qa0.f34045b.equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f20229b.getPackageName() + "/" + parseInt;
            Drawable p = mo24242p(str2);
            if (p != null) {
                return p;
            }
            Drawable i = r70.m26356i(this.f20229b, parseInt);
            mo24230H(str2, i);
            return i;
        } catch (NumberFormatException unused) {
            Drawable p2 = mo24242p(str);
            if (p2 != null) {
                return p2;
            }
            Drawable w = mo24248w(Uri.parse(str));
            mo24230H(str, w);
            return w;
        } catch (Resources.NotFoundException unused2) {
            Log.w(f20223b, "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: z */
    public final Drawable mo24251z(Cursor cursor) {
        int i = this.f20236x;
        if (i == -1) {
            return null;
        }
        Drawable y = mo24250y(cursor.getString(i));
        return y != null ? y : mo24247v();
    }
}
