/*
 * Copyright 2020 New Relic Corporation. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.newrelic.agent.modules;

public class ClassLoaderUtilImpl implements ClassLoaderUtil {
    @Override
    public ClassLoader getPlatformClassLoaderOrNull() {
        return ClassLoader.getPlatformClassLoader();
    }
}
