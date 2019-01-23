package com.harium.util.system;

public enum OS {
    LINUX("unix"), MAC("mac"), SOLARIS("solaris"), SUN_OS("sun_os"), WINDOWS("windows"), UNKNOWN("");

    private final String name;

    OS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
