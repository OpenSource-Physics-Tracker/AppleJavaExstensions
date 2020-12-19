package com.apple.eawt;

import com.apple.eawt.AppEvent.AppHiddenEvent;

public interface AppHiddenListener extends AppEventListener {
    void appHidden(AppHiddenEvent var1);

    void appUnhidden(AppHiddenEvent var1);
}
