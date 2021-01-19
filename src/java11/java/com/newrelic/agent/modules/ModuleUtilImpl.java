package com.newrelic.agent.modules;

import java.lang.instrument.Instrumentation;
import java.net.http.HttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ModuleUtilImpl implements ModuleUtil {

    @Override
    public void redefineModules(Instrumentation inst, ClassLoader agentClassLoader) {
        Module httpClientModule = HttpClient.class.getModule();
        Module agentModule = agentClassLoader.getUnnamedModule();
        Set<Module> extraReads = Set.of(agentModule);

        inst.redefineModule(
                httpClientModule,
                extraReads,
                Collections.emptyMap(),
                Collections.emptyMap(),
                Collections.emptySet(),
                Collections.emptyMap()
        );
    }
}
