package com.github.mkolisnyk.sirius.client;

public class Configuration {

    private int timeout = 60;
    private String pagesPackage;
    
    public final int getTimeout() {
        return timeout;
    }

    public final void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public final String getPagesPackage() {
        return pagesPackage;
    }

    public final void setPagesPackage(String pagesPackage) {
        this.pagesPackage = pagesPackage;
    }
    
}

