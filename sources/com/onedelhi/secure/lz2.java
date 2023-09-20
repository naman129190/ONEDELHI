package com.onedelhi.secure;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lz2 extends ArrayAdapter {

    /* renamed from: a */
    public final Context f15700a;

    /* renamed from: a */
    public final C2793a f15701a = new C2793a();

    /* renamed from: a */
    public HashMap<String, List<String>> f15702a;

    /* renamed from: b */
    public final HashMap<String, List<String>> f15703b;

    /* renamed from: n */
    public final int f15704n;

    /* renamed from: com.onedelhi.secure.lz2$a */
    public class C2793a extends Filter {

        /* renamed from: a */
        public final Object f15706a = new Object();

        public C2793a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f15706a) {
                    filterResults.values = lz2.this.f15703b;
                    filterResults.count = lz2.this.f15703b.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : lz2.this.f15703b.entrySet()) {
                    if (((String) ((List) entry.getValue()).get(1)).toLowerCase().contains(lowerCase)) {
                        hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(1));
                    }
                }
                filterResults.values = hashMap;
                filterResults.count = hashMap.size();
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                HashMap unused = lz2.this.f15702a = (HashMap) obj;
            } else {
                HashMap unused2 = lz2.this.f15702a = null;
            }
            if (filterResults.count > 0) {
                lz2.this.notifyDataSetChanged();
            } else {
                lz2.this.notifyDataSetInvalidated();
            }
        }
    }

    public lz2(@mr2 Context context, int i, HashMap<String, List<String>> hashMap) {
        super(context, i);
        HashMap<String, List<String>> hashMap2 = new HashMap<>();
        this.f15703b = hashMap2;
        this.f15700a = context;
        this.f15702a = hashMap;
        this.f15704n = i;
        hashMap2.putAll(hashMap);
    }

    @ts2
    /* renamed from: c */
    public List<String> getItem(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f15702a.keySet().toArray()[i].toString());
        arrayList.add(String.valueOf(this.f15702a.values().toArray()[i]));
        return arrayList;
    }

    public int getCount() {
        return this.f15702a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f15701a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0144  */
    @com.onedelhi.secure.mr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, @com.onedelhi.secure.ts2 android.view.View r13, @com.onedelhi.secure.mr2 android.view.ViewGroup r14) {
        /*
            r11 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0011
            android.content.Context r13 = r14.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            int r1 = r11.f15704n
            android.view.View r13 = r13.inflate(r1, r14, r0)
        L_0x0011:
            r14 = 2131362187(0x7f0a018b, float:1.8344147E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r1 = 2131362817(0x7f0a0401, float:1.8345425E38)
            android.view.View r1 = r13.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131362818(0x7f0a0402, float:1.8345427E38)
            android.view.View r2 = r13.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131362814(0x7f0a03fe, float:1.834542E38)
            android.view.View r3 = r13.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131362816(0x7f0a0400, float:1.8345423E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.List r12 = r11.getItem(r12)
            r5 = 1
            java.lang.Object r6 = r12.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r7 = -84858976180039(0xffffb2d23ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String[] r6 = r6.split(r7)
            java.lang.Object r7 = r12.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r7.toUpperCase()
            r9 = -84867566114631(0xffffb2d03ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x008b
            java.lang.String r7 = r7.toUpperCase()
            r8 = -84884745983815(0xffffb2cc3ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r8)
            r9 = -84901925852999(0xffffb2c83ade68b9, double:NaN)
        L_0x0081:
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            java.lang.String r7 = r7.replace(r8, r9)
            goto L_0x0124
        L_0x008b:
            java.lang.String r8 = r7.toUpperCase()
            r9 = -84906220820295(0xffffb2c73ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x00b1
            java.lang.String r7 = r7.toUpperCase()
            r8 = -84931990624071(0xffffb2c13ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r8)
            r9 = -84957760427847(0xffffb2bb3ade68b9, double:NaN)
            goto L_0x0081
        L_0x00b1:
            java.lang.String r8 = r7.toUpperCase()
            r9 = -84962055395143(0xffffb2ba3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x00d7
            java.lang.String r7 = r7.toUpperCase()
            r8 = -84974940297031(0xffffb2b73ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r8)
            r9 = -84987825198919(0xffffb2b43ade68b9, double:NaN)
            goto L_0x0081
        L_0x00d7:
            java.lang.String r8 = r7.toUpperCase()
            r9 = -84992120166215(0xffffb2b33ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x00fd
            java.lang.String r7 = r7.toUpperCase()
            r8 = -85013595002695(0xffffb2ae3ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r8)
            r9 = -85035069839175(0xffffb2a93ade68b9, double:NaN)
            goto L_0x0081
        L_0x00fd:
            java.lang.String r8 = r7.toUpperCase()
            r9 = -85039364806471(0xffffb2a83ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x0124
            java.lang.String r7 = r7.toUpperCase()
            r8 = -85052249708359(0xffffb2a53ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r8)
            r9 = -85065134610247(0xffffb2a23ade68b9, double:NaN)
            goto L_0x0081
        L_0x0124:
            r8 = r6[r0]
            java.lang.String r8 = r8.substring(r5)
            r9 = -85069429577543(0xffffb2a13ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            boolean r8 = r8.equalsIgnoreCase(r9)
            r9 = 0
            if (r8 == 0) goto L_0x0144
            android.content.Context r8 = r11.f15700a
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131230975(0x7f0800ff, float:1.8078018E38)
            goto L_0x014d
        L_0x0144:
            android.content.Context r8 = r11.f15700a
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131231048(0x7f080148, float:1.8078166E38)
        L_0x014d:
            android.graphics.drawable.Drawable r8 = com.onedelhi.secure.zk3.m33204g(r8, r10, r9)
            r14.setImageDrawable(r8)
            java.lang.Object r12 = r12.get(r0)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r4.setText(r12)
            r1.setText(r7)
            r12 = r6[r5]
            java.lang.String r12 = r12.substring(r5)
            r2.setText(r12)
            r12 = 2
            r14 = r6[r12]
            r12 = r6[r12]
            int r12 = r12.length()
            int r12 = r12 - r5
            java.lang.String r12 = r14.substring(r5, r12)
            r3.setText(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lz2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
