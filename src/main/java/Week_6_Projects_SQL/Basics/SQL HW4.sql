SELECT DISTINCT replacement_cost FROM film;

SELECT COUNT(DISTINCT replacement_cost) FROM film;

SELECT COUNT(title) FROM film
WHERE title LIKE 'T%' AND rating ='G';

SELECT COUNT(COUNTRY) FROM country
WHERE LENGTH(country)>5;

SELECT COUNT(country) FROM country
WHERE country ILIKE '%r'


