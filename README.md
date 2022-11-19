# Etude11

## Team Members

Hayden Knox

## To compile the program

To compile the program, please run the following commands

`javac VideoClip.java`

`javac VideoManager.java`

`javac VideoManagerApp.java`

## To run the program

Please run the following command to run the application

`java VideoManagerApp`

## What are the challenges with our software design.

We have used a singleton design pattern for our software design. The singleton pattern is a design pattern that restricts the instantiation of a class to one object. 

We have done this by including a private data field varible called videoManager and making it of type VideoManager - our class. We also included a conditional statement that does not allow another instance of Video Manager to be created if videoManager is not NULL.

We have also ensured that our videoManager Class is easy to access from other components of the software framework by creating the one instance of videoManager as a static datafield. This means that we can accesa the videoManager and its corresponding methods, e.g. getVideoClipManager() by referencing the class VideoManager.

Challenges with this system design have been displayed inside the application method (Refer to inline comments). In the main method, it looks as though we have created two instances of VideoManager, manager1 and manager2, however, due to our singleton design, they are references to the same instance of VideoManger. This could cause bugs in the system if someone who is unaware of the singlton design pattern, like someone from the other team, attempts to create another instance of VideoManger and does not relise that it has not worked. This means that with this software design, multithreading is not possible as there is only one instance available to be used.
