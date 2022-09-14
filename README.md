JDBC

Install Mysql: ->$sudo apt install mysql-server

Re-start the server:->$sudo systemctl start mysql.service

Enter into musql: ->$sudo mysql

Check the password policy: mysql> SHOW VARIABLES LIKE 'validate_password%';

Change the password level :--> mysql> SET GLOBAL validate_password.policy=LOW;

We can change the password digit count with the help above command by changing variable name and value:

To create new user : ->> mysql> CREATE USER '<username>'@'localhost' IDENTIFIED BY '<userpassword>';

Grant privillege :
mysql> GRANT CREATE, ALTER, DROP, INSERT, UPDATE, DELETE, SELECT, REFERENCES, RELOAD on *.* TO 'general'@'localhost' WITH GRANT OPTION;


To Download jdbc connector use URL:
https://dev.mysql.com/downloads/connector/j/

Choose OS as platform independent.

hit download.
extract the file


Now create a directory in your projrct resources folder as jdbc and save the jdbc.jar file in this directory

Go to project structure -> module -> depencies -> add jar -> select your resources/jdbc directory -> apply and OK





