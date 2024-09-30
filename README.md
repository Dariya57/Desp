1. Singleton Pattern: System Configuration
The Singleton Pattern ensures there is only one instance of the CinemaConfig class, which stores important settings for the cinema (like name, number of screens, hours, etc.).
We only need one configuration manager for the whole system so that settings are always the same no matter where they're used.
- Example: 

  CinemaConfig config = CinemaConfig.getInstance();
  config.setCinemaName("Starlight Cinemas");
  System.out.println("Cinema Name: " + config.getCinemaName());
  
In this example, we use getInstance() to make sure we're always using the same config object to set and get the cinema name.

2. Factory Method Pattern: Movie Creation
The Factory Method Pattern is used to create different types of movies (e.g., Regular, IMAX, 3D) without hardcoding the types. 
It allows flexibility in creating different movie types based on user input or other factors.
- How it works: Each type of movie (Regular, IMAX, etc.) has its own class, and a separate factory creates the right movie type based on input.
- Example:
 
  MovieFactory regularFactory = new RegularMovieFactory();
  Movie movie = regularFactory.createMovie("Inception");
  System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());
  
Here, the RegularMovieFactory creates a regular movie, and the system can decide which movie type to create dynamically.

3. Abstract Factory Pattern: User Interface Generation
The Abstract Factory Pattern is used to create user interface elements (like buttons) in different themes (e.g., Dark Theme, Light Theme).

It makes sure that the look and feel of the app’s UI is consistent across different themes.
- How it works: Each theme (Dark or Light) has its own factory that creates themed components like buttons.
- Example:
 
  UIFactory uiFactory = new DarkThemeFactory();
  Button button = uiFactory.createButton();
  button.render();
  
In this example, the DarkThemeFactory creates buttons and other UI components that match the dark theme of the cinema booking system.

4. Builder Pattern: Ticket Booking
The Builder Pattern allows you to create a complex ticket booking by selecting different options like seat number, movie title, and snack combo.
It simplifies the process of creating a booking by letting you choose different options step by step.
- How it works: You set various fields (like movie, seat, snacks) using a builder, and then "build" the booking.
- Example:
 
  TicketBooking booking = new TicketBookingBuilder()
      .setMovieTitle("Inception")
      .setSeatNumber("A1")
      .setSnackCombo("Popcorn and Soda")
      .build();
  
This example shows how to book a ticket by setting the movie, seat, and snacks step by step using the builder pattern.

5. Prototype Pattern: Movie Schedule
The Prototype Pattern is used to easily clone and modify movie schedules (like screening times) without affecting the original schedule.
It allows you to quickly create and adjust schedules based on an existing one without starting from scratch.
- How it works: You create a template schedule (like a standard screening time), and then you can clone it and make adjustments to the new copy without changing the original template.

- Example:
  StandardSchedule template = new StandardSchedule();
  template.setTime("18:00");  // Set the default time for all screenings

  // Clone the template and modify the new copy
  MovieSchedule eveningSchedule = template.clone();
  eveningSchedule.setMovie(movie);  // Set the specific movie for this schedule
  System.out.println("Movie scheduled at: " + eveningSchedule.getTime());
  
In this example, the StandardSchedule is used as a base, and we clone it to create a new schedule for a different movie, allowing changes without modifying the original schedule template.
