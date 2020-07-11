/*
 * Copyright 2020 New Relic Corporation. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.newrelic.agent.modules;

import java.lang.instrument.Instrumentation;

public interface ModuleUtil {
    /**
     * Expands some modules to expose their inner workings to us. The specifics
     * can be found in the Java >= 9 implementation of this class.
     * @param inst The premain {@link Instrumentation} instance
     * @param agentClassLoader The classloader which is targeted to load
     * agent classes; it is this classloader's unnamed module that will have
     * access to the necessary packages.
     */
    void redefineModules(Instrumentation inst, ClassLoader agentClassLoader);
}
