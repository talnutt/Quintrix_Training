1. SELECT * FROM sakila.city ORDER BY city LIMIT 10

2. SELECT * FROM sakila.film WHERE title LIKE 'airplane%'

3. SELECT MAX(amount)  FROM sakila.payment

4. SELECT sum(store_id) FROM sakila.customer WHERE store_id = 1

5.SELECT * FROM sakila.customer WHERE email LIKE 'NANCY.THOMAS%'

6. SELECT * FROM sakila.actor_info WHERE first_name = 'Bob' AND last_name = 'Fawcett'

7. SET @filmId = (SELECT f.film_id 
		FROM film AS f
		WHERE f.title = 'Alien Center')

8. INSERT INTO sakila.store (manager_staff_id, store_id, address_id)
VALUES (03,03,03)

9. START TRANSACTION;

SET SQL_SAFE_UPDATES = 0;

UPDATE store AS s
INNER JOIN address AS a ON a.address_id = s.address_id
SET s.last_update = CURDATE()
WHERE a.address = '110 Main';

SET SQL_SAFE_UPDATES = 1;

ROLLBACK;

10. START TRANSACTION;

SET SQL_SAFE_UPDATES = 0;

DELETE s.*
FROM store AS s
INNER JOIN address AS a ON a.address_id = s.address_id
WHERE a.address = '110 Main';

SET SQL_SAFE_UPDATES = 1;

ROLLBACK;