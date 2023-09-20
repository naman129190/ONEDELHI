package com.onedelhi.secure;

import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.onedelhi.secure.C3892x3;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @C1983dl(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @C1983dl(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @C1983dl(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@hl3({hl3.C2354a.f13185a})
/* renamed from: com.onedelhi.secure.cf */
public class C1904cf {

    /* renamed from: com.onedelhi.secure.cf$a */
    public static class C1905a implements AutoCompleteTextView.Validator {

        /* renamed from: a */
        public final /* synthetic */ C1906b f10232a;

        /* renamed from: a */
        public final /* synthetic */ C1907c f10233a;

        public C1905a(C1907c cVar, C1906b bVar) {
            this.f10233a = cVar;
            this.f10232a = bVar;
        }

        public CharSequence fixText(CharSequence charSequence) {
            C1906b bVar = this.f10232a;
            return bVar != null ? bVar.fixText(charSequence) : charSequence;
        }

        public boolean isValid(CharSequence charSequence) {
            C1907c cVar = this.f10233a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.cf$b */
    public interface C1906b {
        CharSequence fixText(CharSequence charSequence);
    }

    /* renamed from: com.onedelhi.secure.cf$c */
    public interface C1907c {
        boolean isValid(CharSequence charSequence);
    }

    @C1717al(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    /* renamed from: a */
    public static void m12473a(AutoCompleteTextView autoCompleteTextView, C3892x3.C3893a aVar, C3892x3.C3895c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new C3892x3.C3894b(aVar, cVar, (st1) null));
        }
    }

    @C1717al(requireAll = false, value = {"android:fixText", "android:isValid"})
    /* renamed from: b */
    public static void m12474b(AutoCompleteTextView autoCompleteTextView, C1906b bVar, C1907c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator((AutoCompleteTextView.Validator) null);
        } else {
            autoCompleteTextView.setValidator(new C1905a(cVar, bVar));
        }
    }
}
