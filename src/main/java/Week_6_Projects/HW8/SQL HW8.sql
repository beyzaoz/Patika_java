UPDATE employee
SET email = 'tarrahdowton@google.edu'
WHERE name = 'Tarrah Dawton';

UPDATE employee
SET birthday = '2001-01-01'
WHERE  birthday IS NULL;

UPDATE employee
SET email = 'nullemail@null.com'
WHERE email IS NULL;

UPDATE employee 
SET id= 4
WHERE name = '#####';

UPDATE employee
SET name ='Lian Brailsford'
WHERE email = 'lianishere@yahoo.com';

DELETE FROM employee
WHERE email LIKE 'a%'
  OR name ILIKE '%L'
  OR birthday = CAST('2004-07-10' AS DATE)
  OR id =26
  OR email = 'nullemail@null.com'

