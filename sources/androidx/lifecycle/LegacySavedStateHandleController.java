package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.au4;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.dr3;
import com.onedelhi.secure.gu4;
import com.onedelhi.secure.hu4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.wq3;

public class LegacySavedStateHandleController {

    /* renamed from: a */
    public static final String f4027a = "androidx.lifecycle.savedstate.vm.tag";

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    public static final class C0679a implements br3.C1801a {
        /* renamed from: a */
        public void mo4913a(@mr2 dr3 dr3) {
            if (dr3 instanceof hu4) {
                gu4 viewModelStore = ((hu4) dr3).getViewModelStore();
                br3 savedStateRegistry = dr3.getSavedStateRegistry();
                for (String b : viewModelStore.mo16919c()) {
                    LegacySavedStateHandleController.m4724a(viewModelStore.mo16918b(b), savedStateRegistry, dr3.getLifecycle());
                }
                if (!viewModelStore.mo16919c().isEmpty()) {
                    savedStateRegistry.mo13804k(C0679a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    public static void m4724a(au4 au4, br3 br3, C0690e eVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) au4.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo4942j()) {
            savedStateHandleController.mo4940h(br3, eVar);
            m4726c(br3, eVar);
        }
    }

    /* renamed from: b */
    public static SavedStateHandleController m4725b(br3 br3, C0690e eVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, wq3.m31016g(br3.mo13796b(str), bundle));
        savedStateHandleController.mo4940h(br3, eVar);
        m4726c(br3, eVar);
        return savedStateHandleController;
    }

    /* renamed from: c */
    public static void m4726c(final br3 br3, final C0690e eVar) {
        C0690e.C0693c b = eVar.mo4959b();
        if (b == C0690e.C0693c.INITIALIZED || b.mo4962a(C0690e.C0693c.STARTED)) {
            br3.mo13804k(C0679a.class);
        } else {
            eVar.mo4958a(new C0694f() {
                /* renamed from: g */
                public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                    if (bVar == C0690e.C0692b.ON_START) {
                        C0690e.this.mo4960c(this);
                        br3.mo13804k(C0679a.class);
                    }
                }
            });
        }
    }
}
