# Shuffler
Shuffler is an application to stimulate the Random shuffle and Hand shufflue of a deck.

###Components
Shuffler has modularised components which encourages de coupling and plug and play approach
  1. Models
  2. Persistence
  3. Capability
  4. RestAPI
  
###To Build Jar
Follow below steps to generate jar
  1. Navigate to ```<projectrootdir>/restapi```
  2. RUN ```gradle build```

Valid profiles are
  1. simple
  2. complex

  
###To Run Jar
Follow below steps to generate jar
  1. Navigate to ```<projectrootdir>/restapi```
  2. RUN ```java -Dspring.profiles.active=complex -jar restapi.jar```

Valid profiles are
  1. simple
  2. complex

###Swagger
This service is swagger enabled
  1. Once service starts up
  2. Hit [swager-ui.html](http://loacalhost:8080/swager-ui.html)
