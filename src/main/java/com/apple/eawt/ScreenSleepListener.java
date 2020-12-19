package com.apple.eawt;

import com.apple.eawt.AppEvent.ScreenSleepEvent;

public interface ScreenSleepListener extends AppEventListener {
    void screenAboutToSleep(ScreenSleepEvent var1);

    void screenAwoke(ScreenSleepEvent var1);
}
