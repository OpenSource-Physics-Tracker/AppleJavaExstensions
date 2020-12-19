package com.apple.eio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileManager {

    public static final short kOnAppropriateDisk = -32767;
    public static final short kSystemDomain = -32766;
    public static final short kLocalDomain = -32765;
    public static final short kNetworkDomain = -32764;
    public static final short kUserDomain = -32763;

    public FileManager() {
    }

    static RuntimeException unimplemented() {
        return new RuntimeException("Unimplemented");
    }

    public static int OSTypeToInt(String var0) {
        throw unimplemented();
    }

    public static void setFileTypeAndCreator(String var0, int var1, int var2) throws IOException {
        throw unimplemented();
    }

    public static void setFileType(String var0, int var1) throws IOException {
        throw unimplemented();
    }

    public static void setFileCreator(String var0, int var1) throws IOException {
        throw unimplemented();
    }

    public static int getFileType(String var0) throws IOException {
        throw unimplemented();
    }

    public static int getFileCreator(String var0) throws IOException {
        throw unimplemented();
    }

    public static String findFolder(int var0) throws FileNotFoundException {
        throw unimplemented();
    }

    public static String findFolder(short var0, int var1) throws FileNotFoundException {
        throw unimplemented();
    }

    public static String findFolder(short var0, int var1, boolean var2) throws FileNotFoundException {
        throw unimplemented();
    }

    /**
     * @deprecated
     */
    @Deprecated
    public static void openURL(String var0) throws IOException {
        throw unimplemented();
    }

    public static String getResource(String var0) throws FileNotFoundException {
        throw unimplemented();
    }

    public static String getResource(String var0, String var1) throws FileNotFoundException {
        throw unimplemented();
    }

    public static String getResource(String var0, String var1, String var2) throws FileNotFoundException {
        throw unimplemented();
    }

    public static String getPathToApplicationBundle() {
        throw unimplemented();
    }

    public static boolean moveToTrash(File var0) throws FileNotFoundException {
        throw unimplemented();
    }

    public static boolean revealInFinder(File var0) throws FileNotFoundException {
        throw unimplemented();
    }
}