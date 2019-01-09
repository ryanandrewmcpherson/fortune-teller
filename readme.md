# FortuneTeller

Answer Some Questions, get your fortune! Program will quit any time quit is typed. 

### Questions
What is your name? First? Last?
-program expects strings .. no input validation here because name isn't used in fortune prediction

What is your age?
-expects a positive integer ... will prompt the user to enter a positive integer if they entered something else and will tell them to stop messing around after they've given an invalid input 3 times

What is the number of your birth month?
-expects an integer between 1 and 12... will prompt the user to enter a positive whole number between 1 and 12 if they entered something else and will tell the user to stop messing around after they've given an invalid input 3 times

What is your favorite ROYGBIV color? Type Help for list of colors.
-will print a list of ROYGBIV colors when the user enters help. Will give a different answer for every ROYGBIV color and a standard answer for anything entered that isn't a ROYGBIV color or help...
no input validation used her besides that because everything can be treated as a string 

How many siblings do you have?
-expects an integer greater than or equal to 0....will prompt the user to enter a valid number of siblings if they enter an invalid number ... will tell them the user to stop messing around if they've entered an invalid response more than 3 times

#### Fortune
Years Until Retirement ... computed using the user's age
Bank Balance at Retirement ... computed using the user's birth month
Retirement Home Location ... computed using the user's number of siblings
Transportation ... computed using the user's favorite ROYGBIV color or a special mode of transportation for users who answer something else
