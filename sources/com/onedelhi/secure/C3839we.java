package com.onedelhi.secure;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.onedelhi.secure.we */
public class C3839we extends ArrayAdapter {

    /* renamed from: a */
    public final C3840a f22088a = new C3840a();

    /* renamed from: a */
    public HashMap<List<String>, List<String>> f22089a;

    /* renamed from: b */
    public String f22090b;

    /* renamed from: b */
    public final HashMap<List<String>, List<String>> f22091b;

    /* renamed from: n */
    public final int f22092n;

    /* renamed from: com.onedelhi.secure.we$a */
    public class C3840a extends Filter {

        /* renamed from: a */
        public final Object f22094a = new Object();

        public C3840a() {
        }

        /* renamed from: b */
        public static /* synthetic */ int m30801b(Map.Entry entry, Map.Entry entry2) {
            return ((String) ((List) entry.getKey()).get(0)).length() - ((String) ((List) entry2.getKey()).get(0)).length();
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f22094a) {
                    filterResults.values = C3839we.this.f22091b;
                    filterResults.count = C3839we.this.f22091b.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : C3839we.this.f22091b.entrySet()) {
                    if (((String) ((List) entry.getKey()).get(0)).toLowerCase().contains(lowerCase)) {
                        hashMap.put((List) entry.getKey(), (List) entry.getValue());
                    }
                }
                LinkedList<Map.Entry> linkedList = new LinkedList<>(hashMap.entrySet());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Collections.sort(linkedList, C7044ve.f36496a);
                for (Map.Entry entry2 : linkedList) {
                    linkedHashMap.put((List) entry2.getKey(), (List) entry2.getValue());
                }
                filterResults.values = linkedHashMap;
                filterResults.count = linkedHashMap.size();
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                HashMap unused = C3839we.this.f22089a = (HashMap) obj;
            } else {
                HashMap unused2 = C3839we.this.f22089a = null;
            }
            if (filterResults.count > 0) {
                C3839we.this.notifyDataSetChanged();
            } else {
                C3839we.this.notifyDataSetInvalidated();
            }
        }
    }

    public C3839we(@mr2 Context context, int i, HashMap<List<String>, List<String>> hashMap, String str) {
        super(context, i);
        HashMap<List<String>, List<String>> hashMap2 = new HashMap<>();
        this.f22091b = hashMap2;
        this.f22089a = hashMap;
        this.f22092n = i;
        hashMap2.putAll(hashMap);
        this.f22090b = str;
    }

    @ts2
    /* renamed from: c */
    public List<String> getItem(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f22089a.keySet().toArray()[i].toString());
        arrayList.add(String.valueOf(this.f22089a.values().toArray()[i]));
        return arrayList;
    }

    public int getCount() {
        return this.f22089a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f22088a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0171  */
    @com.onedelhi.secure.mr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, @com.onedelhi.secure.ts2 android.view.View r8, @com.onedelhi.secure.mr2 android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0011
            android.content.Context r8 = r9.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r1 = r6.f22092n
            android.view.View r8 = r8.inflate(r1, r9, r0)
        L_0x0011:
            java.util.List r9 = r6.getItem(r7)
            r1 = 1
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            r2 = -82677132793671(0xffffb4ce3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            java.lang.String[] r9 = r9.split(r2)
            java.util.List r7 = r6.getItem(r7)
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            r2 = -82685722728263(0xffffb4cc3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            java.lang.String[] r7 = r7.split(r2)
            r2 = 2131362817(0x7f0a0401, float:1.8345425E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r7 = r7[r0]
            java.lang.String r7 = r7.substring(r1)
            java.lang.String r3 = r7.toUpperCase()
            r4 = -82694312662855(0xffffb4ca3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x007e
            java.lang.String r7 = r7.toUpperCase()
            r3 = -82711492532039(0xffffb4c63ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r4 = -82728672401223(0xffffb4c23ade68b9, double:NaN)
        L_0x0074:
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            java.lang.String r7 = r7.replace(r3, r4)
            goto L_0x0117
        L_0x007e:
            java.lang.String r3 = r7.toUpperCase()
            r4 = -82732967368519(0xffffb4c13ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00a4
            java.lang.String r7 = r7.toUpperCase()
            r3 = -82758737172295(0xffffb4bb3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r4 = -82784506976071(0xffffb4b53ade68b9, double:NaN)
            goto L_0x0074
        L_0x00a4:
            java.lang.String r3 = r7.toUpperCase()
            r4 = -82788801943367(0xffffb4b43ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00ca
            java.lang.String r7 = r7.toUpperCase()
            r3 = -82801686845255(0xffffb4b13ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r4 = -82814571747143(0xffffb4ae3ade68b9, double:NaN)
            goto L_0x0074
        L_0x00ca:
            java.lang.String r3 = r7.toUpperCase()
            r4 = -82818866714439(0xffffb4ad3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00f0
            java.lang.String r7 = r7.toUpperCase()
            r3 = -82840341550919(0xffffb4a83ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r4 = -82861816387399(0xffffb4a33ade68b9, double:NaN)
            goto L_0x0074
        L_0x00f0:
            java.lang.String r3 = r7.toUpperCase()
            r4 = -82866111354695(0xffffb4a23ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0117
            java.lang.String r7 = r7.toUpperCase()
            r3 = -82878996256583(0xffffb49f3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r4 = -82891881158471(0xffffb49c3ade68b9, double:NaN)
            goto L_0x0074
        L_0x0117:
            r2.setText(r7)
            r7 = 2131362818(0x7f0a0402, float:1.8345427E38)
            android.view.View r7 = r8.findViewById(r7)     // Catch:{ Exception -> 0x012d }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x012d }
            r0 = r9[r0]     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = r0.substring(r1)     // Catch:{ Exception -> 0x012d }
            r7.setText(r0)     // Catch:{ Exception -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0131:
            r7 = 2131362814(0x7f0a03fe, float:1.834542E38)
            android.view.View r7 = r8.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = r9[r1]
            java.lang.String r0 = r0.substring(r1)
            r7.setText(r0)
            r7 = 2131362187(0x7f0a018b, float:1.8344147E38)
            android.view.View r7 = r8.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2
            r2 = r9[r0]
            r9 = r9[r0]
            int r9 = r9.length()
            int r9 = r9 - r1
            java.lang.String r9 = r2.substring(r1, r9)
            r0 = -82896176125767(0xffffb49b3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L_0x0171
            android.content.res.Resources r9 = r8.getResources()
            r0 = 2131231048(0x7f080148, float:1.8078166E38)
            goto L_0x0178
        L_0x0171:
            android.content.res.Resources r9 = r8.getResources()
            r0 = 2131230975(0x7f0800ff, float:1.8078018E38)
        L_0x0178:
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r0)
            r7.setImageDrawable(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3839we.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
