package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* renamed from: androidx.appcompat.app.f */
public class C0222f implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final ActionBar.C0162d f926a;

    public C0222f(ActionBar.C0162d dVar) {
        this.f926a = dVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ActionBar.C0162d dVar = this.f926a;
        if (dVar != null) {
            dVar.mo773a(i, j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
