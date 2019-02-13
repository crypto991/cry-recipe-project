-- USE TO RUN MYSQL DB DOCKER IMAGE, OPTIONAL IF YOUR NOT USING A LOCAL DB
-- DOCKER RUN --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql


-- CONNECT TO MYSQL AND RUN AS ROOT USER
-- CREATE DATABASES

CREATE DATABASE cry_dev;
CREATE DATABASE cry_prod;

--CREATE DATABASE SERVICE ACCOUNT
CREATE USER 'cry_dev_user'@'localhost' IDENTIFIED BY 'crypto';
CREATE USER 'cry_prod_user'@'localhost' IDENTIFIED BY 'crypto';

--DATABASE GRANTS
GRANT SELECT ON cry_dev.* TO 'cry_dev_user'@'localhost';
GRANT INSERT ON cry_dev.* TO 'cry_dev_user'@'localhost';
GRANT DELETE ON cry_dev.* TO 'cry_dev_user'@'localhost';
GRANT UPDATE ON cry_dev.* TO 'cry_dev_user'@'localhost';
GRANT SELECT ON cry_prod.* TO 'cry_prod_user'@'localhost';
GRANT INSERT ON cry_prod.* TO 'cry_prod_user'@'localhost';
GRANT DELETE ON cry_prod.* TO 'cry_prod_user'@'localhost';
GRANT UPDATE ON cry_prod.* TO 'cry_prod_user'@'localhost';