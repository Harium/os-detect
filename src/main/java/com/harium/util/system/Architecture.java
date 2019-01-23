package com.harium.util.system;

public enum Architecture {
    X32("i686"), X64("x86_64"), UNKNOWN("");

    private final String folder;

    Architecture(String folder) {
        this.folder = folder;
    }

    public String getFolder() {
        return folder;
    }
}
