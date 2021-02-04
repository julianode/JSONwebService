# JSONwebService

A web service developed in Java with Spring Boot that handles HTTP requests and responds JSON.

It has a simple GET method handler and answers to no parameters request or with a "name" parameter request.

## How to use the code (with gradle)

#### 1- For Windows users with no developer tools.

The repository already have a distribution format file.
Download the repository, unzip it, and go to build/distributions folder.
There is a .zip file inside it with the application.
Unzip the JSONweService-boot-0.0.1-SNAPTSHOT.zip.

Inside the new extracted folder, go to the bin folder.
Then, execute the JSONwebService.bat.
Let it work for some seconds.
The last line should present "Started JSONwebServiceApplication in XXX seconds".
The application is running.


#### 2 - For developer tools users: with gradle and InteliJ.

To use the source code, download the repository, unzip it.
Then, open InteliJ and import the project (open the project folder).
The first time loading it will take some time if you do not have gradle ready.
As soon as done, type in some commands.

Use in the terminal:

    gradle clean
    gradle assemble

Note: The clean task is just to be rigorous about unwanted files.

Gradle should have downloaded all the dependencies and any other files needed for running.
Then:

    gradle bootrun

Note: Using Spring Boot plugin.

Let it work for some seconds.
The last line should present "Started JSONwebServiceApplication in XXX seconds".
The application is running.


## How to test it

Open your browser and type into the address bar:

    localhost:8080/greetings

Then, a further test would be:

    localhost:8080/greetings?name=YourName

Each request has a response with an ID.
The second response should have the ID = 2.

The format of the response is JSON and should look like:

    {"id":1, "content":"Hello, YourName!"}

At the terminal, hitting "Ctrl+C", like the copy shortcut in Microsoft Word, will terminate the application.
Terminating it as a batch or not will make no difference for such a simple program.

Postman is a good option for testing too.
The results should be 200, OK, and the JSON.