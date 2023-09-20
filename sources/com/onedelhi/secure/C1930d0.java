package com.onedelhi.secure;

import android.widget.AbsListView;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @C1983dl(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @C1983dl(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @C1983dl(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@hl3({hl3.C2354a.f13185a})
/* renamed from: com.onedelhi.secure.d0 */
public class C1930d0 {

    /* renamed from: com.onedelhi.secure.d0$a */
    public static class C1931a implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ C1932b f10579a;

        /* renamed from: a */
        public final /* synthetic */ C1933c f10580a;

        public C1931a(C1933c cVar, C1932b bVar) {
            this.f10580a = cVar;
            this.f10579a = bVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            C1932b bVar = this.f10579a;
            if (bVar != null) {
                bVar.onScroll(absListView, i, i2, i3);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            C1933c cVar = this.f10580a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.d0$b */
    public interface C1932b {
        void onScroll(AbsListView absListView, int i, int i2, int i3);
    }

    /* renamed from: com.onedelhi.secure.d0$c */
    public interface C1933c {
        void onScrollStateChanged(AbsListView absListView, int i);
    }

    @C1717al(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    /* renamed from: a */
    public static void m12870a(AbsListView absListView, C1932b bVar, C1933c cVar) {
        absListView.setOnScrollListener(new C1931a(cVar, bVar));
    }
}
