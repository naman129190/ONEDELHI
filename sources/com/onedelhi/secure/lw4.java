package com.onedelhi.secure;

import android.media.VolumeProvider;

@sj3(21)
public class lw4 {

    /* renamed from: com.onedelhi.secure.lw4$a */
    public static class C2787a extends VolumeProvider {

        /* renamed from: a */
        public final /* synthetic */ C2788b f15646a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2787a(int i, int i2, int i3, C2788b bVar) {
            super(i, i2, i3);
            this.f15646a = bVar;
        }

        public void onAdjustVolume(int i) {
            this.f15646a.mo19225b(i);
        }

        public void onSetVolumeTo(int i) {
            this.f15646a.mo19224a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.lw4$b */
    public interface C2788b {
        /* renamed from: a */
        void mo19224a(int i);

        /* renamed from: b */
        void mo19225b(int i);
    }

    /* renamed from: a */
    public static Object m21026a(int i, int i2, int i3, C2788b bVar) {
        return new C2787a(i, i2, i3, bVar);
    }

    /* renamed from: b */
    public static void m21027b(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
