package com.apple.eawt;

import java.awt.*;
import java.io.File;
import java.net.URI;
import java.util.EventObject;
import java.util.List;

public abstract class AppEvent extends EventObject {
    AppEvent() {
        super(Application.getApplication());
    }

    public static class FullScreenEvent extends AppEvent {
        FullScreenEvent(Window var1) {
        }

        public Window getWindow() {
            throw Application.unimplemented();
        }
    }

    public static class SystemSleepEvent extends AppEvent {
        SystemSleepEvent() {
        }
    }

    public static class ScreenSleepEvent extends AppEvent {
        ScreenSleepEvent() {
        }
    }

    public static class UserSessionEvent extends AppEvent {
        UserSessionEvent() {
        }
    }

    public static class AppHiddenEvent extends AppEvent {
        AppHiddenEvent() {
        }
    }

    public static class AppForegroundEvent extends AppEvent {
        AppForegroundEvent() {
        }
    }

    public static class AppReOpenedEvent extends AppEvent {
        AppReOpenedEvent() {
        }
    }

    public static class QuitEvent extends AppEvent {
        QuitEvent() {
        }
    }

    public static class PreferencesEvent extends AppEvent {
        PreferencesEvent() {
        }
    }

    public static class AboutEvent extends AppEvent {
        AboutEvent() {
        }
    }

    public static class OpenURIEvent extends AppEvent {
        public OpenURIEvent() {
        }

        public URI getURI() {
            throw Application.unimplemented();
        }
    }

    public static class PrintFilesEvent extends AppEvent.FilesEvent {
        public PrintFilesEvent() {
        }
    }

    public static class OpenFilesEvent extends AppEvent.FilesEvent {
        public OpenFilesEvent() {
        }

        public String getSearchTerm() {
            throw Application.unimplemented();
        }
    }

    public abstract static class FilesEvent extends AppEvent {
        public FilesEvent() {
        }

        public List<File> getFiles() {
            throw Application.unimplemented();
        }
    }
}

