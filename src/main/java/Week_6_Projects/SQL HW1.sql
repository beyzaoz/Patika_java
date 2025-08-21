--SELECT title FROM film;
SELECT title,description FROM film 
ORDER BY title,description ASC;

SELECT * 
FROM film WHERE length>60 AND length<75;

SELECT * FROM film ORDER BY rental_rate =0.99 AND  replacement_cost = 12.99 OR replacement_cost =28.99;

SELECT first_name,last_name FROM customer WHERE first_name='Mary';

SELECT * FROM film WHERE NOT(length>50) AND rental_rate NOT IN(2.99, 4.99);



