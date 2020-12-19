package com.apple.eawt;

import java.awt.Image;
import java.awt.Toolkit;
import java.beans.SimpleBeanInfo;

public class ApplicationBeanInfo extends SimpleBeanInfo {
    public ApplicationBeanInfo() {
    }

    public Image getIcon(int var1) {
        return Toolkit.getDefaultToolkit().getImage("NSImage://NSGenericApplication");
    }
}

