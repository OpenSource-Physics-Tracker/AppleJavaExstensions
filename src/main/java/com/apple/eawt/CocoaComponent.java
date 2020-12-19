package com.apple.eawt;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class CocoaComponent extends Canvas {
    public CocoaComponent() {
    }

    public abstract int createNSView();

    public void update(Graphics var1) {
        throw Application.unimplemented();
    }

    public void paint(Graphics var1) {
        throw Application.unimplemented();
    }

    public long createNSViewLong() {
        throw Application.unimplemented();
    }

    public final void sendMessage(int var1, Object var2) {
        throw Application.unimplemented();
    }

    public abstract Dimension getMaximumSize();

    public abstract Dimension getMinimumSize();

    public abstract Dimension getPreferredSize();
}
