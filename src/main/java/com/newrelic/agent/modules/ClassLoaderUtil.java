/*
 * Copyright 2020 New Relic Corporation. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.newrelic.agent.modules;

/**
 * This interface exists to ensure compatibility between the Java < 9
 * and Java >= 9 versions of utilities that operate on classloaders.
 *
 * The Java < 9 implementation is found in this same package.
 * The Java >= 9 implementation is found in the java9 source set.
 *
 * This package is built using Java's <a href="https://openjdk.java.net/jeps/238">Multi-Release Jar</a>
 * functionality introduced in Java 9.
 */
public interface ClassLoaderUtil {
    ClassLoader getPlatformClassLoaderOrNull();
}
