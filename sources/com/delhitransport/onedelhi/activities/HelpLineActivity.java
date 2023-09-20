package com.delhitransport.onedelhi.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.gl1;
import com.onedelhi.secure.hl1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nl1;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.r70;
import java.util.HashMap;

public class HelpLineActivity extends AppCompatActivity {

    /* renamed from: o */
    public static final int f6533o = 123;

    /* renamed from: a */
    public final Intent f6534a = new Intent(pj0.m61166a(-36785407235911L));

    /* renamed from: a */
    public Boolean f6535a;

    /* renamed from: a */
    public final HashMap<String, String> f6536a = new HashMap<>();

    /* renamed from: e */
    public String f6537e;

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void m7992h1(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m7993i1(nl1 nl1, AdapterView adapterView, View view, int i, long j) {
        if (this.f6535a.booleanValue()) {
            String str = nl1.getItem(i).split(pj0.m61166a(-38477624350535L))[1].split(pj0.m61166a(-38490509252423L))[0];
            this.f6537e = str;
            if (!str.equalsIgnoreCase(pj0.m61166a(-38499099187015L))) {
                Intent intent = this.f6534a;
                intent.setData(Uri.parse(pj0.m61166a(-38503394154311L) + this.f6537e));
            } else {
                Toast.makeText(this, pj0.m61166a(-38524868990791L), 0).show();
            }
            startActivity(this.f6534a);
            return;
        }
        Intent intent2 = this.f6534a;
        intent2.setData(Uri.parse(pj0.m61166a(-38619358271303L) + this.f6537e));
        mo7708g1();
    }

    /* renamed from: g1 */
    public final void mo7708g1() {
        Boolean valueOf = Boolean.valueOf(r70.m26348a(this, pj0.m61166a(-37992293046087L)) == 0);
        this.f6535a = valueOf;
        if (!valueOf.booleanValue()) {
            C3962y2.m31859G(this, new String[]{pj0.m61166a(-38121142064967L)}, 123);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_help_line);
        this.f6536a.put(pj0.m61166a(-36901371352903L), pj0.m61166a(-36982975731527L));
        this.f6536a.put(pj0.m61166a(-37038810306375L), pj0.m61166a(-37141889521479L));
        this.f6536a.put(pj0.m61166a(-37223493900103L), pj0.m61166a(-37317983180615L));
        this.f6536a.put(pj0.m61166a(-37335163049799L), pj0.m61166a(-37356637886279L));
        this.f6536a.put(pj0.m61166a(-37373817755463L), pj0.m61166a(-37451127166791L));
        this.f6536a.put(pj0.m61166a(-37494076839751L), pj0.m61166a(-37614335924039L));
        this.f6536a.put(pj0.m61166a(-37657285596999L), pj0.m61166a(-37721710106439L));
        this.f6536a.put(pj0.m61166a(-37743184942919L), pj0.m61166a(-37833379256135L));
        ListView listView = (ListView) findViewById(C1410R.C1412id.lv_helplines);
        nl1 nl1 = new nl1(this, C1410R.layout.helpline_item, this.f6536a);
        listView.setAdapter(nl1);
        ((ImageView) findViewById(C1410R.C1412id.iv_back)).setOnClickListener(new gl1(this));
        this.f6535a = Boolean.valueOf(r70.m26348a(this, pj0.m61166a(-37863444027207L)) == 0);
        listView.setOnItemClickListener(new hl1(this, nl1));
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-38249991083847L))) {
                    if (iArr[i2] >= 0) {
                        this.f6535a = Boolean.TRUE;
                        z = true;
                    } else {
                        Toast.makeText(this, pj0.m61166a(-38378840102727L), 0).show();
                    }
                }
            }
            if (z) {
                startActivity(this.f6534a);
            }
        }
    }
}
