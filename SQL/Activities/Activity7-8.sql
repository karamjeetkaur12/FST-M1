REM   Script: session 1
REM   activity 7-8

select * from salesman;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

select * from orders;

select order_no, add(purchase_amount) total_purchase from orders order by ORDER_NO;

select order_no, add(purchase_amount), total_purchase from orders order by ORDER_NO;

select order_no, add(purchase_amount) AS "total_purchase" from orders order by ORDER_NO;

select order_no, sum(purchase_amount) AS "total_purchase" from orders order by ORDER_NO;

select order_no, sum(purchase_amount) from orders group by order_no;

select SUM(purchase_amount) AS "Total sum" from orders;

select order_no, sum(purchase_amount) from orders group by order_no;

select order_no, SUM(purchase_amount) from orders group by order_no;

select order_no, SUM(purchase_amount) from orders;

select SUM(purchase_amount) from orders;

select AVG(purchase_amount) from orders;

select AVG(purchase_amount) as "Avergae" from orders;

select MAX(purchase_amount) as "Maximu" from orders;

select MIN(purchase_amount) as "MINIMUM" from orders;

SELECT * FROM ORDERS;

SELECT COUNT(SALESMAN_ID) AS "TOTAL" FROM ORDERS;

SELECT * FROM ORDERS;

select customer_id, max(purchase_amount) from orders GROUP BY customer_id order by customer_id;

select customer_id, max(purchase_amount) from orders GROUP BY customer_id order by customer_id desc;

select customer_id, MAX(purchase_amount) from orders GROUP BY customer_id order by customer_id desc;

SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

select customer_id, MAX(purchase_amount) from orders GROUP BY customer_id order by customer_id desc;

SELECT * FROM ORDERS;

SELECT SALESMAN_ID, MAX(PURCHASE_AMOUNT) from orders where order_date ='2012-08-17' group by salesman_id;

SELECT * FROM ORDERS;

SELECT SALESMAN_ID, MAX(PURCHASE_AMOUNT) from orders where order_date ='17-AUG-12' group by salesman_id;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT SALESMAN_ID, MAX(PURCHASE_AMOUNT) from orders where order_date ='17-AUG-12' group by salesman_id;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

