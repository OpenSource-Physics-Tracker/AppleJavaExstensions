package com.apple.eawt.event;

public abstract class GestureAdapter implements GesturePhaseListener, MagnificationListener, RotationListener, SwipeListener {
    public GestureAdapter() {
    }

    public void gestureBegan(GesturePhaseEvent var1) {
        GestureUtilities.unimplemented();
    }

    public void gestureEnded(GesturePhaseEvent var1) {
        GestureUtilities.unimplemented();
    }

    public void magnify(MagnificationEvent var1) {
        GestureUtilities.unimplemented();
    }

    public void rotate(RotationEvent var1) {
        GestureUtilities.unimplemented();
    }

    public void swipedDown(SwipeEvent var1) {
        GestureUtilities.unimplemented();
    }

    public void swipedLeft(SwipeEvent var1) {
        GestureUtilities.unimplemented();
    }

    public void swipedRight(SwipeEvent var1) {
        GestureUtilities.unimplemented();
    }

    public void swipedUp(SwipeEvent var1) {
        GestureUtilities.unimplemented();
    }
}
