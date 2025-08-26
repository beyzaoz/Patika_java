
SELECT length FROM film
WHERE length> (
SELECT AVG(length) FROM film
);

SELECT ALL COUNT(rental_rate) FROM film
WHERE rental_rate = (
SELECT MAX(rental_rate) FROM film
);

SELECT ALL * FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
AND replacement_cost= (SELECT MIN(replacement_cost ) FROM film);


SELECT ALL customer_id FROM payment 
WHERE amount = (SELECT MAX(amount) FROM payment)
GROUP BY customer_id;



