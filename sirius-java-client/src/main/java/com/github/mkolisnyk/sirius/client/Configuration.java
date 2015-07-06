package com.github.mkolisnyk.sirius.client;

public class Configuration {
    private static final int DEFAULT_TIMEOUT = 60;
    private int timeout = DEFAULT_TIMEOUT;
    private String pagesPackage;

    public final int getTimeout() {
        return timeout;
    }

    public final void setTimeout(int timeoutValue) {
        this.timeout = timeoutValue;
    }

    public final String getPagesPackage() {
        return pagesPackage;
    }

    public final void setPagesPackage(String pagesPackageValue) {
        this.pagesPackage = pagesPackageValue;
    }
}

