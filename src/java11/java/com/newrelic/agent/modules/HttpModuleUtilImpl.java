package com.newrelic.agent.modules;

import java.lang.instrument.Instrumentation;
import java.net.http.HttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HttpModuleUtilImpl implements HttpModuleUtil {
    /**
     * Modify the java.net.http module so that it can read from the platform classloader's
     * unnamed module. The agent http client instrumentation utility classes are
     * in this specific unnamed module.
     */
    @Override
    public void addReadHttpModule(Instrumentation inst, ClassLoader agentClassLoader) {
        Module httpClientModule = HttpClient.class.getModule();
        Module agentUnnamedModule = agentClassLoader.getUnnamedModule();
        Set<Module> unnamedModule = Set.of(agentUnnamedModule);

        inst.redefineModule(
                httpClientModule,
                unnamedModule,
                Collections.emptyMap(),
                Collections.emptyMap(),
                Collections.emptySet(),
                Collections.emptyMap()
        );
    }
}
