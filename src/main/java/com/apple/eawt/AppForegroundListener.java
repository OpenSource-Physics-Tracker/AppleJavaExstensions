package com.apple.eawt;

import com.apple.eawt.AppEvent.AppForegroundEvent;

public interface AppForegroundListener extends AppEventListener {
    void appRaisedToForeground(AppForegroundEvent var1);

    void appMovedToBackground(AppForegroundEvent var1);
}
