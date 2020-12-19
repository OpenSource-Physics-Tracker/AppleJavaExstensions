package com.apple.eawt;

import com.apple.eawt.AppEvent.FullScreenEvent;
import java.util.EventListener;

public interface FullScreenListener extends EventListener {
    void windowEnteringFullScreen(FullScreenEvent var1);

    void windowEnteredFullScreen(FullScreenEvent var1);

    void windowExitingFullScreen(FullScreenEvent var1);

    void windowExitedFullScreen(FullScreenEvent var1);
}
