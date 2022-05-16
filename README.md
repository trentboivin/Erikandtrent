# Erikandtrent

Main project:

FOR NOW JUST SIMPLIFIED. ADD SQL DATABASE LATER ON FOR NOW JUST SIMPLY STORE DATA IN A HASHMAP OR ARRAYS. WE CAN PULL THE DATA WITH ITERATE OR LOOPS.
CUSTOMER DATA CAN ALSO BE STORED USING THE SAME WAY WE STORED USERNAMES AND PASSWORDS.

user can "login" with pre existing or new password and username pre stored in dataset or appended when created.
after logging in user can view "customer data" about themselves. (times "site" was visited by user, products purchased, )


NOTES:

USER CAN ONLY CREATE A PASSWORD WITH CHARS NO NUMBERS OR SPECIAL CHARS (1,5,&,*,!)


DATA TO BE STORED/COLLECTED:

EMPLOYEES USERNAME AND PASSWORD DATASET:

- user names and passwords

STORE STOCK DATASET:
(

  USE THIS DATASET TO STORE THE STORES STOCK EX: product | stock amount | price | size options(potentially) | aisle | date of restock(potentially) |

  )

- Screwdriver
- Glue
- Wrench
- Saw
- Hoses
- Pipes
- wood
- screws
- nuts
- bolts

EMPLOYEEES DATA:

- Hire date
- Wage
- Hours of availability(potentially)
- Hours worked (either weekly, daily, to date, or future)
- Full name/first name/last name or preferred name (depending on storage type)
- department they work in (potentially)
- Position (manager, laborer etc..)
- employee id (random 5 digit number or something)
- employee phone number or email (some form of contact info)




 TODO:

- Create storage for the data
- create user input potentially
- create user input filtering (checking for incorrect character inputs (special chars or numbers)
- error handling for incorrect user input
- verification code block or method for verifying user input against our database to grant login or deny access
- potentially a timeout system for repeatedly incorrect login attempts
- Potentially a simplified randomized verification system of our own when creating an account like most sites have (EX; are you a robot? type these words in etc..) //potentially have some sort of like randomized char generator method up to 5 length that the user has to type in to verify they are not a robot etc..
-



Project Roadmap:

Run login screen EX: "RETAIL STORE NAME OR MANUFACTOR NAME"
program runs initial check required EX: Login or sign up?

VERIFICATION CODE BLOCK INITIATES

1) IF USER SELECTS LOGIN: program automatically uppercases the user input
