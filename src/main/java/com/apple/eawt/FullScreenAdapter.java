package com.apple.eawt;

import com.apple.eawt.AppEvent.FullScreenEvent;

public abstract class FullScreenAdapter implements FullScreenListener {
    public FullScreenAdapter() {
    }

    public void windowEnteringFullScreen(FullScreenEvent var1) {
        throw Application.unimplemented();
    }

    public void windowEnteredFullScreen(FullScreenEvent var1) {
        throw Application.unimplemented();
    }

    public void windowExitingFullScreen(FullScreenEvent var1) {
        throw Application.unimplemented();
    }

    public void windowExitedFullScreen(FullScreenEvent var1) {
        throw Application.unimplemented();
    }
}
