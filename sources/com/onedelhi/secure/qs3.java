package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.widget.SearchView;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @C1983dl(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @C1983dl(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@hl3({hl3.C2354a.LIBRARY})
public class qs3 {

    /* renamed from: com.onedelhi.secure.qs3$a */
    public static class C3338a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        public final /* synthetic */ C3340c f19451a;

        /* renamed from: a */
        public final /* synthetic */ C3341d f19452a;

        public C3338a(C3341d dVar, C3340c cVar) {
            this.f19452a = dVar;
            this.f19451a = cVar;
        }

        public boolean onQueryTextChange(String str) {
            C3340c cVar = this.f19451a;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            C3341d dVar = this.f19452a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.qs3$b */
    public static class C3339b implements SearchView.OnSuggestionListener {

        /* renamed from: a */
        public final /* synthetic */ C3342e f19453a;

        /* renamed from: a */
        public final /* synthetic */ C3343f f19454a;

        public C3339b(C3343f fVar, C3342e eVar) {
            this.f19454a = fVar;
            this.f19453a = eVar;
        }

        public boolean onSuggestionClick(int i) {
            C3342e eVar = this.f19453a;
            if (eVar != null) {
                return eVar.onSuggestionClick(i);
            }
            return false;
        }

        public boolean onSuggestionSelect(int i) {
            C3343f fVar = this.f19454a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i);
            }
            return false;
        }
    }

    @TargetApi(11)
    /* renamed from: com.onedelhi.secure.qs3$c */
    public interface C3340c {
        boolean onQueryTextChange(String str);
    }

    @TargetApi(11)
    /* renamed from: com.onedelhi.secure.qs3$d */
    public interface C3341d {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi(11)
    /* renamed from: com.onedelhi.secure.qs3$e */
    public interface C3342e {
        boolean onSuggestionClick(int i);
    }

    @TargetApi(11)
    /* renamed from: com.onedelhi.secure.qs3$f */
    public interface C3343f {
        boolean onSuggestionSelect(int i);
    }

    @C1717al(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    /* renamed from: a */
    public static void m26149a(SearchView searchView, C3341d dVar, C3340c cVar) {
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) null);
        } else {
            searchView.setOnQueryTextListener(new C3338a(dVar, cVar));
        }
    }

    @C1717al(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    /* renamed from: b */
    public static void m26150b(SearchView searchView, C3343f fVar, C3342e eVar) {
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener((SearchView.OnSuggestionListener) null);
        } else {
            searchView.setOnSuggestionListener(new C3339b(fVar, eVar));
        }
    }
}
