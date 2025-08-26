SELECT COUNT(*),rating FROM film 
GROUP BY rating;

SELECT COUNT(*) FROM film
GROUP BY replacement_cost 
HAVING COUNT(*)>50;

SELECT COUNT(customer_id),store_id FROM CUSTOMER
GROUP BY store_id;

SELECT COUNT(city),country_id FROM city
GROUP BY country_id 
ORDER BY Count(city) LIMIT 1



