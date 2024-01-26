SELECT department_id,SUM(salary)
FROM employees
GROUP BY department_id;

-- 1
SELECT department_id, count(id) AS 'Number of employees'
FROM employees
GROUP BY department_id,'Number of employees';

-- 2
SELECT department_id, round(AVG(salary),2) AS 'Average Salary'
FROM employees
GROUP BY department_id;

-- 3
SELECT department_id, round(MIN(salary),2) AS 'Min Salary'
FROM employees
GROUP BY department_id
HAVING `Min Salary`>800;

-- 4
SELECT  count(id)
FROM products
WHERE category_id=(
		SELECT id
        FROM categories
        WHERE `name`='appetizers') AND price>8;
        
SELECT category_id,
		format(AVG(price),2) AS 'Average Price',
        format(MIN(price),2) AS 'Cheapest Product',
        format(MAX(price),2) AS 'Most Expensive Product'
FROM products
GROUP BY category_id;
