/*
 * Copyright 2020 New Relic Corporation. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.newrelic.agent.modules;

import java.lang.instrument.Instrumentation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ModuleUtilImpl implements ModuleUtil {
    /**
     * Modify the java.base module so that reflective/MethodHandle access from agent code
     * can get past the module access controls.
     */
    @Override
    public void redefineModules(Instrumentation inst, ClassLoader agentClassLoader) {
        Module javaBaseModule = Object.class.getModule();
        Module agentModule = agentClassLoader.getUnnamedModule();
        Map<String, Set<Module>> extraOpensAndExports = new HashMap<>();
        extraOpensAndExports.put("jdk.internal.loader", Collections.singleton(agentModule));
        extraOpensAndExports.put("java.lang", Collections.singleton(agentModule));

        inst.redefineModule(
                javaBaseModule,
                Collections.emptySet(),
                extraOpensAndExports,
                extraOpensAndExports,
                Collections.emptySet(),
                Collections.emptyMap()
        );
    }
}
