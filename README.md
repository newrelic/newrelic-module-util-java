[![Community Plus header](https://github.com/newrelic/opensource-website/raw/master/src/images/categories/Community_Plus.png)](https://opensource.newrelic.com/oss-category/#community-plus)

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

Should you need assistance with New Relic products, you are in good hands with several support channels.

If the issue has been confirmed as a bug or is a feature request, file a GitHub issue.

**Support Channels**

* [New Relic Community](https://discuss.newrelic.com/c/support-products-agents/java-agent): The best place to engage in troubleshooting questions
* [New Relic Developer](https://developer.newrelic.com/): Resources for building a custom observability applications
* [New Relic University](https://learn.newrelic.com/): A range of online training for New Relic users of every level

## Privacy
At New Relic we take your privacy and the security of your information seriously, and are committed to protecting your information. We must emphasize the importance of not sharing personal data in public forums, and ask all users to scrub logs and diagnostic information for sensitive information, whether personal, proprietary, or otherwise.

We define “Personal Data” as any information relating to an identified or identifiable individual, including, for example, your name, phone number, post code or zip code, Device ID, IP address, and email address.

For more information, review [New Relic’s General Data Privacy Notice](https://newrelic.com/termsandconditions/privacy).

## Contribute
We encourage your contributions to improve this project! Keep in mind when you submit your pull request, you'll need to sign the CLA via the click-through using CLA-Assistant. You only have to sign the CLA one time per project.

If you have any questions, or to execute our corporate CLA, required if your contribution is on behalf of a company,  please drop us an email at opensource@newrelic.com.

**A note about vulnerabilities**

As noted in our [security policy](../../security/policy), New Relic is committed to the privacy and security of our customers and their data. We believe that providing coordinated disclosure by security researchers and engaging with the security community are important means to achieve our security goals.

If you believe you have found a security vulnerability in this project or any of New Relic's products or websites, we welcome and greatly appreciate you reporting it to New Relic through [HackerOne](https://hackerone.com/newrelic).

If you would like to contribute to this project, review [these guidelines](./CONTRIBUTING.md).

To [all contributors](https://github.com/newrelic/newrelic-module-util-java/graphs/contributors), we thank you!  Without your contribution, this project would not be what it is today.  We also host a community project page dedicated to [New Relic Module Util Java](https://opensource.newrelic.com/projects/newrelic/newrelic-module-util-java).

## License
newrelic-module-util-java is licensed under the [Apache 2.0](http://apache.org/licenses/LICENSE-2.0.txt) License.
