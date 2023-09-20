package com.onedelhi.secure;

import android.view.View;
import android.widget.EditText;
import com.delhitransport.onedelhi.activities.SettingsActivity;

public final /* synthetic */ class tv3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f35806a;

    /* renamed from: a */
    public final /* synthetic */ SettingsActivity f35807a;

    /* renamed from: b */
    public final /* synthetic */ String f35808b;

    public /* synthetic */ tv3(SettingsActivity settingsActivity, EditText editText, String str) {
        this.f35807a = settingsActivity;
        this.f35806a = editText;
        this.f35808b = str;
    }

    public final void onClick(View view) {
        this.f35807a.m8358y1(this.f35806a, this.f35808b, view);
    }
}
