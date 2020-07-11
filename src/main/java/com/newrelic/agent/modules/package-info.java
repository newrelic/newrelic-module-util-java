/*
 * Copyright 2020 New Relic Corporation. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

/**
 * This package contains classes where different functionality is loaded
 * based on the Java version at play. All classes should implement an interface in the {@literal main}
 * sourceSet, so that there is a contract with external code.
 *
 * Java's <a href="https://openjdk.java.net/jeps/238">Multi-Release Jar</a>
 * functionality, introduced in Java 9, is used to build this package.
 *
 * When Java 8 support is finally removed, Java 9 classes should migrate to the {@literal main}
 * sourceSet.
 */
package com.newrelic.agent.modules;