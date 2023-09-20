package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.pass.FormField;
import com.google.android.gms.common.C1410R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class fa1 extends RecyclerView.C0805h<C2136b> {

    /* renamed from: a */
    public final Context f11985a;

    /* renamed from: a */
    public SharedPreferences f11986a;

    /* renamed from: a */
    public final HashMap<String, Object> f11987a = new HashMap<>();

    /* renamed from: a */
    public final List<FormField> f11988a;

    /* renamed from: b */
    public final HashMap<String, Boolean> f11989b = new HashMap<>();

    /* renamed from: com.onedelhi.secure.fa1$a */
    public class C2135a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ FormField f11990a;

        /* renamed from: a */
        public final /* synthetic */ C2136b f11991a;

        /* renamed from: b */
        public final /* synthetic */ String f11993b;

        /* renamed from: c */
        public final /* synthetic */ String f11994c;

        public C2135a(String str, String str2, C2136b bVar, FormField formField) {
            this.f11993b = str;
            this.f11994c = str2;
            this.f11991a = bVar;
            this.f11990a = formField;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                double parseDouble = Double.parseDouble(charSequence.toString());
                double parseDouble2 = Double.parseDouble(this.f11993b);
                double parseDouble3 = Double.parseDouble(this.f11994c);
                if (parseDouble < parseDouble2) {
                    if (parseDouble > parseDouble3) {
                        fa1.this.f11989b.put(this.f11990a.getField_name(), Boolean.TRUE);
                        System.out.println(parseDouble);
                        fa1.this.f11987a.put(this.f11990a.getField_name(), charSequence.toString());
                    }
                }
                this.f11991a.f11995a.setError(pj0.m61166a(-83402982266695L));
                fa1.this.f11989b.put(this.f11990a.getField_name(), Boolean.FALSE);
            } catch (Exception e) {
                System.out.println(e.toString());
                if (charSequence.toString().length() > 0) {
                    fa1.this.f11989b.put(this.f11990a.getField_name(), Boolean.TRUE);
                } else {
                    fa1.this.f11989b.put(this.f11990a.getField_name(), Boolean.FALSE);
                    this.f11991a.f11995a.setError(pj0.m61166a(-83488881612615L));
                }
            }
            fa1.this.f11987a.put(this.f11990a.getField_name(), charSequence.toString());
        }
    }

    /* renamed from: com.onedelhi.secure.fa1$b */
    public static class C2136b extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final EditText f11995a;

        /* renamed from: a */
        public final TextView f11996a;

        /* renamed from: b */
        public final TextView f11997b;

        /* renamed from: c */
        public final TextView f11998c;

        public C2136b(View view) {
            super(view);
            this.f11996a = (TextView) view.findViewById(C1410R.C1412id.tv_display_name);
            this.f11998c = (TextView) view.findViewById(C1410R.C1412id.tv_field_name);
            this.f11997b = (TextView) view.findViewById(C1410R.C1412id.tv_asterisks);
            this.f11995a = (EditText) view.findViewById(C1410R.C1412id.et_display_value);
        }
    }

    public fa1(Context context, List<FormField> list) {
        this.f11985a = context;
        this.f11988a = list;
    }

    /* renamed from: L */
    public HashMap<String, Object> mo15902L() {
        boolean z;
        System.out.println(this.f11989b);
        Iterator<Boolean> it = this.f11989b.values().iterator();
        loop0:
        while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                boolean booleanValue = it.next().booleanValue();
                if (!z || !booleanValue) {
                    z = false;
                }
            }
        }
        if (!z || this.f11987a.size() != this.f11988a.size()) {
            return null;
        }
        return this.f11987a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013c A[SYNTHETIC, Splitter:B:28:0x013c] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5728x(@com.onedelhi.secure.mr2 com.onedelhi.secure.fa1.C2136b r12, int r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.f11985a
            r1 = -83574780958535(0xffffb3fd3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r11.f11986a = r0
            java.util.List<com.delhitransport.onedelhi.pass.FormField> r0 = r11.f11988a
            java.lang.Object r13 = r0.get(r13)
            r8 = r13
            com.delhitransport.onedelhi.pass.FormField r8 = (com.delhitransport.onedelhi.pass.FormField) r8
            java.lang.String r5 = r8.getMax_value()
            java.lang.String r6 = r8.getMin_value()
            android.widget.TextView r13 = r12.f11996a
            java.lang.String r0 = r8.getDisplay_name()
            r13.setText(r0)
            android.widget.EditText r13 = r12.f11995a
            java.lang.String r0 = r8.getDescription()
            r13.setHint(r0)
            android.widget.TextView r13 = r12.f11998c
            java.lang.String r0 = r8.getField_name()
            r13.setText(r0)
            java.lang.String r13 = r8.getType()
            r0 = -83660680304455(0xffffb3e93ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r13 = r13.equalsIgnoreCase(r0)
            if (r13 != 0) goto L_0x0084
            java.lang.String r13 = r8.getType()
            r0 = -83669270239047(0xffffb3e73ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r13 = r13.equalsIgnoreCase(r0)
            if (r13 == 0) goto L_0x006b
            goto L_0x0084
        L_0x006b:
            java.lang.String r13 = r8.getType()
            r0 = -83677860173639(0xffffb3e53ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r13 = r13.equalsIgnoreCase(r0)
            if (r13 == 0) goto L_0x008c
            android.widget.EditText r13 = r12.f11995a
            r0 = 1
            goto L_0x0089
        L_0x0084:
            android.widget.EditText r13 = r12.f11995a
            r0 = 3
        L_0x0089:
            r13.setInputType(r0)
        L_0x008c:
            boolean r13 = r8.isMandatory()
            if (r13 == 0) goto L_0x009a
            android.widget.TextView r13 = r12.f11997b
            r13.setVisibility(r2)
            goto L_0x00a3
        L_0x009a:
            android.widget.TextView r13 = r12.f11997b
            r0 = 8
            r13.setVisibility(r0)
        L_0x00a3:
            java.lang.String r13 = r8.getType()
            r0 = -83686450108231(0xffffb3e33ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r13 = r13.equalsIgnoreCase(r0)
            if (r13 != 0) goto L_0x00f6
            java.lang.String r13 = r8.getType()
            r0 = -83695040042823(0xffffb3e13ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r13 = r13.equalsIgnoreCase(r0)
            if (r13 == 0) goto L_0x00ca
            goto L_0x00f6
        L_0x00ca:
            java.lang.String r13 = r8.getType()
            r0 = -83712219912007(0xffffb3dd3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r13 = r13.equalsIgnoreCase(r0)
            if (r13 == 0) goto L_0x011d
            android.content.SharedPreferences r13 = r11.f11986a
            java.lang.String r0 = r8.getField_name()
            r1 = -1
            int r13 = r13.getInt(r0, r1)
            if (r13 == r1) goto L_0x011d
            android.widget.EditText r0 = r12.f11995a
            java.lang.String r13 = java.lang.String.valueOf(r13)
        L_0x00f2:
            r0.setText(r13)
            goto L_0x011d
        L_0x00f6:
            android.content.SharedPreferences r13 = r11.f11986a
            java.lang.String r0 = r8.getField_name()
            r1 = -83703629977415(0xffffb3df3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
            java.lang.String r13 = r13.getString(r0, r1)
            r0 = -83707924944711(0xffffb3de3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r0 = r13.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x011d
            android.widget.EditText r0 = r12.f11995a
            goto L_0x00f2
        L_0x011d:
            android.widget.EditText r13 = r12.f11995a
            android.text.Editable r13 = r13.getText()
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.trim()
            r0 = -83720809846599(0xffffb3db3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r0 = r13.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x01be
            double r0 = java.lang.Double.parseDouble(r13)     // Catch:{ Exception -> 0x017e }
            double r2 = java.lang.Double.parseDouble(r5)     // Catch:{ Exception -> 0x017e }
            double r9 = java.lang.Double.parseDouble(r6)     // Catch:{ Exception -> 0x017e }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0162
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0151
            goto L_0x0162
        L_0x0151:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = r11.f11989b     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = r8.getField_name()     // Catch:{ Exception -> 0x017e }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x017e }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x017e }
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ Exception -> 0x017e }
            r2.println(r0)     // Catch:{ Exception -> 0x017e }
            goto L_0x01b5
        L_0x0162:
            android.widget.EditText r0 = r12.f11995a     // Catch:{ Exception -> 0x017e }
            r1 = -83725104813895(0xffffb3da3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)     // Catch:{ Exception -> 0x017e }
            r0.setError(r1)     // Catch:{ Exception -> 0x017e }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r11.f11989b     // Catch:{ Exception -> 0x017e }
            java.lang.String r1 = r8.getField_name()     // Catch:{ Exception -> 0x017e }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x017e }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017e }
            goto L_0x01b5
        L_0x017e:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r0 = r0.toString()
            r1.println(r0)
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x019a
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r11.f11989b
            java.lang.String r1 = r8.getField_name()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.put(r1, r2)
            goto L_0x01b5
        L_0x019a:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r11.f11989b
            java.lang.String r1 = r8.getField_name()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
            android.widget.EditText r0 = r12.f11995a
            r1 = -83811004159815(0xffffb3c63ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
            r0.setError(r1)
        L_0x01b5:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r11.f11987a
            java.lang.String r1 = r8.getField_name()
            r0.put(r1, r13)
        L_0x01be:
            android.widget.EditText r13 = r12.f11995a
            com.onedelhi.secure.fa1$a r0 = new com.onedelhi.secure.fa1$a
            r3 = r0
            r4 = r11
            r7 = r12
            r3.<init>(r5, r6, r7, r8)
            r13.addTextChangedListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fa1.mo5728x(com.onedelhi.secure.fa1$b, int):void");
    }

    @mr2
    /* renamed from: N */
    public C2136b mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C2136b(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.form_field, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f11988a.size();
    }
}
