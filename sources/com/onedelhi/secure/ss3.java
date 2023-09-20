package com.onedelhi.secure;

import android.widget.SeekBar;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY})
@ut1({@tt1(attribute = "android:progress", type = SeekBar.class)})
public class ss3 {

    /* renamed from: com.onedelhi.secure.ss3$a */
    public static class C3538a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C3539b f20502a;

        /* renamed from: a */
        public final /* synthetic */ C3540c f20503a;

        /* renamed from: a */
        public final /* synthetic */ C3541d f20504a;

        /* renamed from: a */
        public final /* synthetic */ st1 f20505a;

        public C3538a(C3539b bVar, st1 st1, C3540c cVar, C3541d dVar) {
            this.f20502a = bVar;
            this.f20505a = st1;
            this.f20503a = cVar;
            this.f20504a = dVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C3539b bVar = this.f20502a;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i, z);
            }
            st1 st1 = this.f20505a;
            if (st1 != null) {
                st1.mo24536b();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C3540c cVar = this.f20503a;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C3541d dVar = this.f20504a;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ss3$b */
    public interface C3539b {
        void onProgressChanged(SeekBar seekBar, int i, boolean z);
    }

    /* renamed from: com.onedelhi.secure.ss3$c */
    public interface C3540c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    /* renamed from: com.onedelhi.secure.ss3$d */
    public interface C3541d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @C1717al(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    /* renamed from: a */
    public static void m27829a(SeekBar seekBar, C3540c cVar, C3541d dVar, C3539b bVar, st1 st1) {
        if (cVar == null && dVar == null && bVar == null && st1 == null) {
            seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        } else {
            seekBar.setOnSeekBarChangeListener(new C3538a(bVar, st1, cVar, dVar));
        }
    }

    @C1717al({"android:progress"})
    /* renamed from: b */
    public static void m27830b(SeekBar seekBar, int i) {
        if (i != seekBar.getProgress()) {
            seekBar.setProgress(i);
        }
    }
}
