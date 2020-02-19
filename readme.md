# Geb Lambdatest Plugin Sample using Gradle Project

## Description

This is an example of incorporating Geb Lambdatest Plugin into a Gradle build.
The build is setup to work with Firefox Windows combination on Lambdatest Automation Hub. To use it with different capabilities, please have a look at  `src/test/resources/GebConfig.groovy` file.

## Setup

 Add your lambdatest `username` and `accessKey` to the `./build.gradle` in account{} section [For Lambdatest Credentials, Go to Lambdatest Profile Page][account_details]

## Usage

The following commands will launch the tests on lambdatest :
```bash
   $ gradle clean allLambdaTestTests --info
```

Replace `gradle` with `gradlew.bat` in the above examples if you're on Windows.


## Questions and issues

Please ask questions on [Lambdatest Support][lambdatest_support] and raise issues on [Lambdatest Community][lambdatest_community].


[lambdatest_support]: https://www.lambdatest.com/support
[lambdatest_community]: https://community.lambdatest.com
[account_details]: https://accounts.lambdatest.com/detail/profile
