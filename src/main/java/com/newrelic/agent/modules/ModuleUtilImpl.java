/*
 * Copyright 2020 New Relic Corporation. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.newrelic.agent.modules;

import java.lang.instrument.Instrumentation;

public class ModuleUtilImpl implements ModuleUtil {
    /**
     * There is no need to modify "modules" in Java {@literal <} 9 since they didn't exist,
     * so this is a no-op.
     */
    @Override
    public void redefineModules(Instrumentation inst, ClassLoader agentClassLoader) {
        // no-op in Java < 9.
    }
}
