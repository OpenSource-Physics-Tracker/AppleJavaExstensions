package com.apple.eawt;

import java.util.EventObject;

/** @deprecated */
@Deprecated
public class ApplicationEvent extends EventObject {
    ApplicationEvent(Object var1) {
        super(var1);
        throw Application.unimplemented();
    }

    ApplicationEvent(Object var1, String var2) {
        super(var1);
        throw Application.unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public boolean isHandled() {
        throw Application.unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void setHandled(boolean var1) {
        throw Application.unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public String getFilename() {
        throw Application.unimplemented();
    }
}

