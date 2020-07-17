package com.github.megatronking.netbare.ssl;

public interface KeyStoreGenerationListener {

    /**
     * Called on KeyStore Generation Success.
     */
    public void keyStoreGenSuccess();

    /**
     * Called on KeyStore Generation Failure.
     */
    public void keyStoreGenFailed(Exception e);
}
