# Failure behaviour

After compiling an application as native image the command line property `--management.endpoints.web.exposure.include="*"` or even the system property `-Dmanagement.endpoints.web.exposure.include="*"` stop working.

# Replay failure

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you reproduce the failure behaviour like this:

```
$ ./target/spring-native-actuator --management.endpoints.web.exposure.include="*"
```

Just exposing one endpoint:

```
2024-02-14T16:06:29.315+01:00  INFO 64940 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 21 ms
2024-02-14T16:06:29.350+01:00  INFO 64940 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2024-02-14T16:06:29.353+01:00  INFO 64940 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
```
