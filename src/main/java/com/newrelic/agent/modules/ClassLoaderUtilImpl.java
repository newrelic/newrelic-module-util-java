/*
 * Copyright 2020 New Relic Corporation. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.newrelic.agent.modules;

public class ClassLoaderUtilImpl implements ClassLoaderUtil {
    /**
     * For Java < 9, the concept of "platform class loader" didn't exist,
     * so we always return null.
     */
    @Override
    public ClassLoader getPlatformClassLoaderOrNull() {
        return null;
    }
}
