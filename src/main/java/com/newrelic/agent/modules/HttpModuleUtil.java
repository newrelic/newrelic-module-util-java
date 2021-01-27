package com.newrelic.agent.modules;

import java.lang.instrument.Instrumentation;

public interface HttpModuleUtil {
    /**
     * Expands java.net.http module to expose its inner workings to us. The specifics
     * can be found in the Java {@literal >=} 11 implementation of this class.
     * @param inst The premain {@link Instrumentation} instance
     * @param platformClassLoader The platform classloader
     */
    void addReadHttpModule(Instrumentation inst, ClassLoader platformClassLoader);
}
