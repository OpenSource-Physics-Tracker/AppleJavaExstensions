package com.apple.eawt;

import com.apple.eawt.AppEvent.UserSessionEvent;

public interface UserSessionListener extends AppEventListener {
    void userSessionDeactivated(UserSessionEvent var1);

    void userSessionActivated(UserSessionEvent var1);
}
