# failsafe_experiments

This demo project can be used to reproduce the bug documented in https://issues.apache.org/jira/browse/SUREFIRE-2106

To see maven failsafe plugin ignoring the `<configuration>` section, run the below command

```
./mvnw clean test-compile help:active-profiles failsafe:integration-test failsafe:verify -P bug
```

But when you run the below command 

```
./mvnw clean test-compile help:active-profiles failsafe:integration-test failsafe:verify -P works-fine
```

you will notice that failsafe plugin runs all the suites that were provided to it.
