REM   Script: Activity 1
REM   Session 7 Sql session 1

CREATE TABLE salesname (salesman_id(int),salesname_name(varchar2(20)),salesname_city(varchar220),comission(int));

CREATE TABLE salesname (salesman_id(int),salesname_name(varchar2(20)),salesname_city(varchar2(20)),comission(int));

CREATE TABLE salesname (salesman_id(int),salesname_name(varchar2(32)),salesname_city(varchar2(32)),comission(int));

CREATE TABLE salesname (salesman_id int,salesname_name varchar2(32),salesname_city varchar2(32),comission int);

CREATE TABLE salesname (salesman_id int,salesname_name varchar2(32),salesname_city varchar2(32),comission int);

CREATE TABLE salesname (salesman_id int,salesname_name varchar2(32),salesname_city varchar2(32),comission int);

CREATE TABLE salesname (salesman_id int,salesname_name varchar2(32),salesname_city varchar2(32),comission int);

DESCRIBE TABLE Salesname


DESCRIBE TABLE Salesname


DESCRIBE TABLE salesname


CREATE TABLE salesname (salesman_id int,salesname_name varchar2(32),salesname_city varchar2(32),comission int);

DESCRIBE salesname


INSERT INTO salesname values (5001,James Hoog,New York,15);

INSERT INTO salesname values (5001,'James Hoog','New York',15);

DESCRIBE salesname


SELECT * FROM salesname;

INSERT ALL  
        INTO salesname values (5002,'Nail Knite','Paris',13) 
        INTO salesname values (5005,'Pit Alex','London',11) 
        INTO salesname values (5006,'McLyon','Paris',14) 
        INTO salesname values (5007,'Paul Adam','Rome',13) 
        INTO salesname values (5003,'Lauson Hen','San jose',12);

INSERT ALL  
        INTO salesname values (5002,'Nail Knite','Paris',13) 
        INTO salesname values (5005,'Pit Alex','London',11) 
        INTO salesname values (5006,'McLyon','Paris',14) 
        INTO salesname values (5007,'Paul Adam','Rome',13) 
        INTO salesname values (5003,'Lauson Hen','San jose',12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesname;

SELECT salesman_id,salesname_city from salesname;

SELECT * FROM salesname where salesname_city='Paris';

SELECT salesman_id ,comission FROM salesname WHERE salesname_name='Paul Adam';

