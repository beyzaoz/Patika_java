SELECT title FROM film
WHERE title LIKE '%n' ORDER BY length LIMIT 5;

SELECT title FROM film
WHERE title LIKE '%n' ORDER BY length DESC OFFSET 2 LIMIT 5;

SELECT * FROM customer 
WHERE store_id IN(1)
ORDER BY last_name DESC LIMIT 4