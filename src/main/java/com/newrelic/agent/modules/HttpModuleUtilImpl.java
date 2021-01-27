package com.newrelic.agent.modules;

import java.lang.instrument.Instrumentation;

public class HttpModuleUtilImpl implements HttpModuleUtil {
    @Override
    public void addReadHttpModule(Instrumentation inst, ClassLoader platformClassLoader) {
        //no-op in Java < 11
    }
}
