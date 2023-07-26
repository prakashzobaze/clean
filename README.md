# clean_arch
Android Kotlin Clean MVVM architecture

<b>About the project:</b>

This is a simple MVVM Clean architecture example where we display list of receipes and check details of receipes when you click on it

<b>APIs used:</b>

https://www.themealdb.com/api/json/v1/1/search.php

https://www.themealdb.com/api/json/v1/1/lookup.php

<b>Advantages of Using Clean Architecture</b>

· Your code is even more easily testable than with plain MVVM.

· Your code is further decoupled (the biggest advantage.)

· The package structure is even easier to navigate.

· Your team can add new features even more quickly.

· The project is even easier to maintain.


 ![mvvm_clean](https://github.com/prakashzobaze/clean/assets/140489453/9d6dfa33-cafb-40f7-90a5-da6b93765cf0)


The code is divided into three separate layers:

1. Presentation Layer

2. Domain Layer

3. Data Layer


<b>The Presentation Layer</b>

This includes our Activitys, Fragments, and ViewModels.

 An Activity should be as dumb as possible.

 Never put your business logic in Activitys.

An Activity will talk to a ViewModel and a ViewModel will talk to the domain layer to perform actions.

 A ViewModel never talks to the data layer directly.



<b>Domain Layer</b>

The Domain layer contains the enterprise logic and types.

 This layer should not depend on anything outside of itself.

This contains all the use cases of your application


This will talk to data repository and responsible for fetching data

<b>The Data Layer</b>

This has all the repositories which the domain layer can use.

 This layer exposes a data source API to outside classes

<b>Used Retrofit, Couroutines,Android Navigation,Dagger Hilt<b>



![architecture](https://github.com/prakashzobaze/clean/assets/140489453/a8bb62bf-4c26-4871-b849-3217e320b912)



