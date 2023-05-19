# -CinemaBookingSystemApplication
in this project your team is asked to develop and design cinema booking system. The system should support at least the following key aspects.
1.support and manage different users and user profile and preference (i.e system admin,  manager,staff,customer etc.)
2.support the management of cinema rooms, seats(eg seat capacity and seat map),and the allocation of movie sessions to cinema rooms
3.support the process of purchasing and issuing tickets for a movie session. This process should also include seat selection and allocation. Note that there are different kinds of tickets such as adult,  child, student, senior e.tc.  seat allocation can be automated based on the user preferences . Customer can alsopre-purchase food and drinks
4.suppport the customers to submit their review and ratings based on their experience at the cinema
5.support the management and process of gaining and redeeming loyalty points
6.generate different kind of relevant reports for cinema managers
You must create test data that is sufficiently large enough to stimulate the system(eg 100 words to each datatype)You could write a script to generate these data randomly.in the final product demonstration, you will need to run a live demo of your product with these test data
4 actors : 
•	User Admin 
•	Cinema Owner 
•	Cinema Manager 
•	Customer 

(Create, Read/Retrieve(view), Update, Delete(suspend), Search)

Actor :  User Admin 



•	As a User Admin, I want to be able to login so that I can access and manage user accounts and user profiles.
•	As a User Admin, I want to logout so that I can exit the system.
•	As a User Admin, I want to be able to create user accounts so that the users have certain permission and privileges access according to their roles.
•	As a User Admin, I want to view user accounts so that I can check the details related to the user account.
•	As a User Admin, I want to update user accounts so that I can keep user account information accurate and manage access given to users.
•	As a User Admin, I want to delete user accounts so that I can manage access and security.
•	As a User Admin, I want to create user profiles so that I can manage the user information.
•	As a User Admin, I want to view user profiles so that I can access and manage user information and preferences.
•	As a User Admin, I want to update user profiles so that I can keep user information accurate.
•	As a User Admin, I want to be able to suspend user profiles so that I can remove inactive user accounts.
•	As a User Admin, I want to search user profiles so that I can find and manage user accounts.

Actor :  Cinema Owner (only deals with reports)
•	As a Cinema Owner, I want to be able to login so that I can generate reports.
•	As a Cinema Owner, I want to logout so that I can prevent unauthorized access.
•	As a Cinema Owner, I want to be able to generate an hourly report for cinema operations, so that I can track the performance of my cinema in real-time.
•	As a Cinema Owner, I want to generate a daily report for cinema operations so that I can assess the overall performance of the cinema for the day and make informed decisions.
•	As a Cinema Owner, I want to generate a weekly report for cinema operations, so that I can evaluate the cinema's performance over time and identify trends.
•	As a Cinema Owner, I want to generate an hourly report for sales and customer traffic, so that I can monitor the performance of my F&B operations in real-time.
•	As a Cinema Owner, I want to generate a daily report for sales, so that I can assess the overall performance of the F&B operations for the day and make informed decisions.
•	As a Cinema Owner, I want to generate a weekly report for sales and customer feedback, so that I can evaluate the F&B operations over time and identify areas for improvement.

Actor : Cinema Manager 
•	As a Cinema Manager, I want to be able to log in so that I can manage the cinema rooms.
•	As a Cinema Manager, I want to logout so that I can prevent unauthorized access.
•	As a Cinema Manager, I want to be able to create cinema rooms so that I can view the cinema rooms in the system.
•	As a Cinema Manager, I want to be able to view the cinema rooms so that I can check the availability of each of the cinema rooms.
•	As a Cinema Manager, I want to be able to update cinema rooms so that I can edit the movie sessions allocated.
•	As a Cinema Manager, I want to be able to deactivate cinema rooms so that I can update the unavailable cinema rooms.
•	As a Cinema Manager, I want to be able to search a cinema room so that I can get the information of each cinema room.
•	As a Cinema Manager, I want to be able to view the seats so that I can check the capacity of the cinema room.
•	As a Cinema Manager, I want to be able to update the seat so that I can edit the status of the seat.
•	As a Cinema Manager, I want to be able to deactivate a seat so that I can lock the unavailable seat. 
•	As a Cinema Manager, I want to be able to search for a seat so that I can check the available status of a seat. 
•	As a Cinema Manager, I want to be able to create a movie session so that I can allocate them to a cinema room.
•	As a Cinema Manager, I want to be able to view a movie session so that I can get the information of the movie(allocated cinema room, movie timing).
•	As a Cinema Manager, I want to be able to update a movie session so that I can change the information of the movie (allocated cinema room, movie timing).
•	As a Cinema Manager, I want to be able to cancel a movie session so that I can remove a movie session that does not have any customers. 
•	As a Cinema Manager, I want to be able to search a movie session so that I can check that it is allocated correctly. 
•	As a Cinema Manager, I want to be able to create a movie so that I can add a movie to the system. 
•	As a Cinema Manager, I want to be able to view a movie so that I can get the movie information.
•	As a Cinema Manager, I want to be able to edit a movie so that I can update the movie description.
•	As a Cinema Manager, I want to be able to suspend a movie so that I can remove a movie that is no longer showing.
•	As a Cinema Manager, I want to be able to search for a movie so that I can check that the movie information is correct.
•	As a Cinema Manager, I want to be able to create a ticket and its specific type(adult, child, student, senior) so that I can assign tickets to customers.
•	As a Cinema Manager, I want to be able to view a ticket so I can check the ticket information. 
•	As a Cinema Manager, I want to be able to edit a ticket so that I can change the type of ticket.
•	As a Cinema Manager, I want to be able to remove ticket validity so that I can update the usability of the ticket.
•	As a Cinema Manager, I want to be able to search for a ticket so that I can check the ticket’s validity.
•	As a Cinema Manager, I want to be able to create loyalty points so that I can add the points to a customer’s loyalty card.
•	As a Cinema Manager, I want to be able to view loyalty points so that I can see the points linked to a customer’s loyalty card.
•	As a Cinema Manager, I want to be able to update the loyalty points so that I can subtract points when a customer uses them.
•	As a Cinema Manager, I want to be able to delete loyalty points so that I can remove points that are assigned wrongly. 
•	As a Cinema Manager, I want to be able to search loyalty points so that I can see the history of a customer’s use of loyalty points. 

Actor :  Customer 
•	As a Customer, I want to be able to login so that I can access the system.
•	As a Customer, I want to logout so that I can exit the system.
•	As a Customer, I want to be able to view the seating plan of each movie so that I will know which seats are available.

•	As a Customer, I want to be able to view the ticket types so that I can choose what ticket I want to  purchase.
•	As a Customer, I want to be able to purchase promotional tickets such as student tickets and senior citizen tickets so that I can enjoy the benefits I am entitled to.
•	As a Customer, I want to be able to view the ticket prices for each movie so that I can proceed to make payment.
•	As a Customer, I want to be able to view the movies available and the time slots for each movie so that I can proceed with the booking of tickets
•	As a Customer, I want to be able to view the details of the purchased movie so that I can check the timing and seats chosen.
•	As a Customer, I want to be able to make payment so that I can purchase my seats and F&B.
•	As a Customer, I want to be able to create a new review and rating for a movie so that I can give feedback for the movie.
•	As a Customer, I want to be able to view ratings and reviews for movies that are currently playing so that I can make informed decisions about what to watch.

Customer:


•	As a customer , i want to be able to register so that i will be able to login with my 
•	As a Customer, I want to be able to login so that I can access the system.
•	As a Customer, I want to logout so that I can exit the system.
•	As a Customer, I want to view movies available so that I know which movies I can watch.
•	As a Customer, I want to be able to view the seating plan of each movie so that I will know which seats are available.
•	As a Customer, I want to be able to view movie sessions so that I know what sessions are available for the movie.
•	As a Customer, I want to view tickets so that I can choose what ticket I want to  purchase.
•	As a Customer, I want to be able to make payment for the tickets so that I can secure my slot for the movie.
•	As a Customer, I want to be able to create a new review and rating for a movie so that I can give feedback for the movie.
•	As a Customer, I want to be able to view ratings and reviews for movies that are currently playing so that I can make informed decisions about what to watch.
•	As a customer, I want to be able to view my loyalty points so that I can choose to use it.


Solution
Here are the key aspects of the cinema booking system that you have described:
•	User management: The system should allow for the creation, management, and deletion of user accounts. Users can be assigned different roles, such as system administrator, cinema manager, staff, or customer.
•	Cinema room management: The system should allow for the creation, management, and deletion of cinema rooms. Cinema rooms can be assigned different capacities and seat maps.
•	Movie session management: The system should allow for the creation, management, and deletion of movie sessions. Movie sessions can be assigned to cinema rooms and have different start and end times.
•	Ticket management: The system should allow for the purchase and issuance of tickets for movie sessions. Tickets can be of different types, such as adult, child, student, or senior. Seat selection and allocation can be automated based on user preferences. Customers can also pre-purchase food and drinks.
•	Customer review and rating: The system should allow customers to submit reviews and ratings for movies. Reviews and ratings can be used to help customers make informed decisions about what movies to watch.
•	Loyalty point management: The system should allow for the management of loyalty points. Loyalty points can be earned by customers for watching movies or purchasing food and drinks. Loyalty points can be redeemed for discounts on future purchases.
•	Reporting: The system should allow for the generation of different reports for cinema managers. Reports can be generated on cinema operations, sales, and customer feedback.
Here are some test data that you can use to stimulate the system:
•	Users: 
o	System Administrator
o	Cinema Manager
o	Staff
o	Customer
•	Cinema rooms: 
o	Cinema 1
o	Cinema 2
o	Cinema 3
•	Movie sessions: 
o	Movie 1 (10:00 AM)
o	Movie 2 (12:00 PM)
o	Movie 3 (2:00 PM)
•	Tickets: 
o	Adult ticket
o	Child ticket
o	Student ticket
o	Senior ticket
•	Customer reviews and ratings: 
o	Movie 1 (4 stars)
o	Movie 2 (5 stars)
o	Movie 3 (3 stars)
•	Loyalty points: 
o	Customer 1 (100 points)
o	Customer 2 (200 points)
o	Customer 3 (300 points)
•	Reports: 
o	Cinema operations report
o	Sales report
o	Customer feedback report
You can use this test data to run a live demo of your cinema booking system. This will help you to identify any potential problems with the system and to make sure that it is working properly.
