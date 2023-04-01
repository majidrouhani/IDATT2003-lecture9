
## Dependency injection

Reference:

https://www.digitalocean.com/community/tutorials/java-dependency-injection-design-pattern-example-tutorial


**Example 1 (ex1): An example that do **not** use dependency injection, But above code logic has certain limitations.**
- MyApplication class is responsible to initialize the email service and then use it. This leads to hard-coded dependency. If we want to switch to some other advanced email service in the future, it will require code changes in MyApplication class. This makes our application hard to extend and if email service is used in multiple classes then that would be even harder.
- If we want to extend our application to provide an additional messaging feature, such as SMS or Facebook message then we would need to write another application for that. This will involve code changes in application classes and in client classes too.
- Testing the application will be very difficult since our application is directly creating the email service instance. There is no way we can mock these objects in our test classes.

**Example 2 (ex2): Example 1 is changed to use dependency injection (DI)**

We can remove the email service instance creation from MyApplication class by having a constructor that requires email service as an argument.

But in this case, we are asking client applications or test classes to initializing the email service that is not a good design decision


**Example 3 (ex3): Use of interface to implement different types of message services**

Dependency Injection in java requires at least the following:

1. Service components should be designed with base class or interface. It’s better to prefer interfaces or abstract classes that would define contract for the services.
1. Consumer classes should be written in terms of service interface.
1. Injector classes that will initialize the services and then the consumer classes.


## Read more

https://medium.com/@nisgat97/what-is-dependency-inversion-principle-dip-884955c5659c
