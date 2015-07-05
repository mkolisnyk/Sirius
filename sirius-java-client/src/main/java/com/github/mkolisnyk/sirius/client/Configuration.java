package com.github.mkolisnyk.sirius.client;

public class Configuration {

    private int timeout = 60;

    public final int getTimeout() {
        return timeout;
    }

    public final void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}

