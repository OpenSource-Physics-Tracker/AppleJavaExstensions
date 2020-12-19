package com.apple.eawt;


import java.awt.Image;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Window;
import javax.swing.JMenuBar;

public class Application {
    static RuntimeException unimplemented() {
        return new RuntimeException("Unimplemented");
    }

    public static Application getApplication() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public Application() {
        throw unimplemented();
    }

    public void addAppEventListener(AppEventListener var1) {
        throw unimplemented();
    }

    public void removeAppEventListener(AppEventListener var1) {
        throw unimplemented();
    }

    public void setAboutHandler(AboutHandler var1) {
        throw unimplemented();
    }

    public void setPreferencesHandler(PreferencesHandler var1) {
        throw unimplemented();
    }

    public void setOpenFileHandler(OpenFilesHandler var1) {
        throw unimplemented();
    }

    public void setPrintFileHandler(PrintFilesHandler var1) {
        throw unimplemented();
    }

    public void setOpenURIHandler(OpenURIHandler var1) {
        throw unimplemented();
    }

    public void setQuitHandler(QuitHandler var1) {
        throw unimplemented();
    }

    public void setQuitStrategy(QuitStrategy var1) {
        throw unimplemented();
    }

    public void enableSuddenTermination() {
        throw unimplemented();
    }

    public void disableSuddenTermination() {
        throw unimplemented();
    }

    public void requestForeground(boolean var1) {
        throw unimplemented();
    }

    public void requestUserAttention(boolean var1) {
        throw unimplemented();
    }

    public void openHelpViewer() {
        throw unimplemented();
    }

    public void setDockMenu(PopupMenu var1) {
        throw unimplemented();
    }

    public PopupMenu getDockMenu() {
        throw unimplemented();
    }

    public void setDockIconImage(Image var1) {
        throw unimplemented();
    }

    public Image getDockIconImage() {
        throw unimplemented();
    }

    public void setDockIconBadge(String var1) {
        throw unimplemented();
    }

    public void setDefaultMenuBar(JMenuBar var1) {
        throw unimplemented();
    }

    public void requestToggleFullScreen(Window var1) {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void addApplicationListener(ApplicationListener var1) {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void removeApplicationListener(ApplicationListener var1) {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void setEnabledPreferencesMenu(boolean var1) {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void setEnabledAboutMenu(boolean var1) {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public boolean getEnabledPreferencesMenu() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public boolean getEnabledAboutMenu() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public boolean isAboutMenuItemPresent() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void addAboutMenuItem() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void removeAboutMenuItem() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public boolean isPreferencesMenuItemPresent() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void addPreferencesMenuItem() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public void removePreferencesMenuItem() {
        throw unimplemented();
    }

    /** @deprecated */
    @Deprecated
    public static Point getMouseLocationOnScreen() {
        throw unimplemented();
    }
}
