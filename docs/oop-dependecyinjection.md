# Dependency Injection
Reference : http://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial

## Without Dependency Injection

The code logic has certain limitations :
- MyApplication class is responsible to initialize the email service and then use it. This leads to hard-coded dependency. If we want to switch to some other advanced email service in future, it will require code changes in MyApplication class. This makes our application hard to extend and if email service is used in multiple classes then that would be even more harder.
- If we want to extend our application to provide additional messaging feature, such as SMS or Facebook message then we would need to write another application for that. This will involve code changes in application classes and in client classes too.
- Testing the application will be very difficult since our application is directly creating the email service instance. There is no way we can mock these objects in our test classes.

## With Dependency Injection
As you can see that our application classes are responsible only for using the service. Service classes are created in injectors. Also if we have to further extend our application to allow facebook messaging, we will have to write Service classes and injector classes only.
So dependency injection implementation solved the problem with hard-coded dependency and helped us in making our application flexible and easy to extend. Now let’s see how easily we can test our application class by mocking the injector and service classes.
