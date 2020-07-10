[![Community Project header](https://github.com/newrelic/opensource-website/raw/master/src/images/categories/Community_Project.png)](https://opensource.newrelic.com/oss-category/#community-project)

# newrelic-module-util-java

This project creates a jar that covers calls to [`ClassLoader.getPlatformClassLoader`](https://docs.oracle.com/javase/9/docs/api/java/lang/ClassLoader.html#getPlatformClassLoader--) 
and [`Instrumentation.redefineModule`](https://docs.oracle.com/javase/9/docs/api/java/lang/instrument/Instrumentation.html#redefineModule-java.lang.Module-java.util.Set-java.util.Map-java.util.Map-java.util.Set-java.util.Map-).

:warning: This jar has a very niche use case for the New Relic Java agent. 
It is not intended to be used or modified for any other environment.

## Installation
You can find this jar on [Maven Central](https://search.maven.org/) and include it as you would any other Java dependency.

## Usage

Instantiate the `Impl` classes and call the methods. If running on Java 9 or later, ensure your JVM properly handles multi-release jars.

Java 7 and 8 do not have these methods, so they have implementations that `no-op`.
Java 9 and later require these calls for the agent to start itself. 
To avoid reflecting and catching errors, we provide this module to provide the functionality.

This jar is a [multi-release jar](https://openjdk.java.net/jeps/238). The concrete implementations have two different `classfiles`. The `classfile` in the standard location is for Java 7 and 8. The `classfile` under `META-INF/versions/9` is for Java 9 and higher.


## Building

Ensure your Gradle is running with Java 9 or later. Then, run:

`./gradlew jar`


## Support

New Relic has open-sourced this project. This project is provided AS-IS WITHOUT WARRANTY OR DEDICATED SUPPORT. Report issues and contributions to the project here on GitHub.

We encourage you to bring your experiences and questions to the [Explorers Hub](https://discuss.newrelic.com/) where our community members collaborate on solutions and new ideas.

## Community

New Relic hosts and moderates an online forum where customers can interact with New Relic employees as well as other customers to get help and share best practices. Like all official New Relic open source projects, there's a related Community topic in the New Relic Explorers Hub. You can find this project's topic/threads here:

https://discuss.newrelic.com/c/support-products-agents/java-agent

## Contributing
We encourage your contributions to improve this project! Keep in mind when you submit your pull request, you'll need to sign the CLA via the click-through using CLA-Assistant. You only have to sign the CLA one time per project.
If you have any questions, or to execute our corporate CLA, required if your contribution is on behalf of a company,  please drop us an email at opensource@newrelic.com.

## License
newrelic-module-util-java is licensed under the [Apache 2.0](http://apache.org/licenses/LICENSE-2.0.txt) License.

