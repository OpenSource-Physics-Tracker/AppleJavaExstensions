package com.apple.eawt;

import com.apple.eawt.AppEvent.SystemSleepEvent;

public interface SystemSleepListener extends AppEventListener {
    void systemAboutToSleep(SystemSleepEvent var1);

    void systemAwoke(SystemSleepEvent var1);
}
