
-- 1
SELECT title
FROM books
WHERE title LIKE 'The %';
-- 1.2
SELECT title
FROM books
WHERE title REGEXP '^The ';

-- 2
SELECT replace(title,'The','***')
FROM books
WHERE title REGEXP '^The ';

-- 3
SELECT round(SUM(cost),2)
FROM books;

-- 4
SELECT 	concat_ws(' ',first_name,last_name) as 'Full Name', 
		timestampdiff(DAY,born,died) as 'Days Lived'
FROM authors;

SELECT title
FROM books
WHERE title REGEXP 'Harry Potter';

