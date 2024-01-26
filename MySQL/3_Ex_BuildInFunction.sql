
-- 1
SELECT first_name, last_name
FROM employees
WHERE first_name LIKE 'sa%'
ORDER BY employee_id;

-- 2
SELECT first_name,last_name
FROM employees
WHERE last_name LIKE '%ei%'
ORDER BY employee_id;

-- 3
SELECT first_name
FROM employees
WHERE department_id IN (3,10) AND year(hire_date) BETWEEN 1995 AND 2005
ORDER BY employee_id;

-- 4
SELECT first_name,last_name
FROM employees
WHERE job_title NOT LIKE '%engineer%'
ORDER BY employee_id;

-- 5
SELECT name
FROM towns
WHERE char_length(name) IN (5,6)
ORDER BY name;

-- 6
SELECT  town_id,name
FROM towns
WHERE name REGEXP '^[MmKkBbEe]'
ORDER BY name;

-- 6.1
SELECT  town_id,name
FROM towns
WHERE LEFT(name,1) IN ("M","K","B","E")
ORDER BY name; 

-- 7
SELECT  town_id,name
FROM towns
WHERE name NOT REGEXP '^[RrDdBb]'
ORDER BY name;

-- 8
CREATE VIEW v_employees_hired_after_2000
AS SELECT 	first_name,
			last_name
FROM employees
WHERE year(hire_date)>2000;
SELECT * FROM v_employees_hired_after_2000;

-- 9
SELECT 	first_name,
		last_name
FROM employees
WHERE character_length(last_name)=5;

-- 10
SELECT 	country_name,
		iso_code
FROM countries
WHERE country_name LIKE '%a%a%a%'
ORDER BY iso_code;

-- 11
SELECT peak_name,
		river_name,
       lower(concat(peak_name,substring(river_name,2))) as mix
FROM peaks,rivers
WHERE right(peak_name,1)=lower(left(river_name,1))
ORDER BY mix;




-- 12
SELECT `name`,
	date_format(`start`, '%Y-%m-%d') as 'start'
FROM games
WHERE year(`start`) IN (2011,2012)
ORDER BY `start`,`name`
LIMIT 50;

-- 13
SELECT user_name,
	substring(`email`FROM locate('@',`email`)+1) as 'email provider'
FROM users
ORDER BY `email provider`,user_name;

-- 14
SELECT user_name,
		ip_address
FROM users
WHERE ip_address LIKE '___.1%.%.___'
ORDER BY user_name;

-- 15
SELECT `name`,
	CASE
		WHEN hour(start)<12	THEN 'Morning'
		WHEN hour(start)>=18 THEN 'Evening'
        ELSE 'Afternoon'
	END as 'Part of the Day',
    CASE
		WHEN duration<=3 THEN 'Extra Short'
		WHEN duration>3 AND duration<=6 THEN 'Short'
		WHEN duration>6 AND duration<=10 THEN 'Long'
        ELSE 'Extra Long'
	END as 'Duration'
    FROM games;
    
-- 16
SELECT product_name,
		order_date,
        adddate(order_date, INTERVAL 3 DAY) as 'pay_due',
        adddate(order_date, INTERVAL 1 MONTH) as 'deliver_due'
FROM orders;
        
 