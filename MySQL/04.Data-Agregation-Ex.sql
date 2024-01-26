
-- 1
SELECT COUNT(id) as 'count'
FROM wizzard_deposits;

-- 2
SELECT MAX(magic_wand_size) as 'longest magic wand'
FROM wizzard_deposits;

-- 3
SELECT deposit_group,
		MAX(magic_wand_size) as 'longest_magic_wand'
FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY `longest_magic_wand`,deposit_group;

-- 4
SELECT deposit_group
FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY AVG(magic_wand_size)
LIMIT 1;

-- 5
SELECT deposit_group,
		ROUND(SUM(deposit_amount),2) AS 'total_sum'
FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY `total_sum`;

-- 6
SELECT deposit_group,
		ROUND(SUM(deposit_amount),2) AS 'total_sum'
FROM wizzard_deposits
WHERE magic_wand_creator='Ollivander family'
GROUP BY deposit_group
ORDER BY deposit_group;

-- 7
SELECT deposit_group,
		ROUND(SUM(deposit_amount),2) AS 'total_sum'
FROM wizzard_deposits
WHERE magic_wand_creator='Ollivander family'
GROUP BY deposit_group
HAVING `total_sum`<150000
ORDER BY `total_sum` DESC;

-- 8
SELECT deposit_group, magic_wand_creator, MIN(deposit_charge) AS min_deposit_charge
FROM wizzard_deposits
GROUP BY deposit_group, magic_wand_creator
ORDER BY magic_wand_creator, deposit_group;

-- 9
SELECT
	CASE
		WHEN age<11 THEN '[0-10]'
		WHEN age<21 THEN '[11-20]'
		WHEN age<31 THEN '[21-30]'
		WHEN age<41 THEN '[31-40]'
		WHEN age<51 THEN '[41-50]'
		WHEN age<61 THEN '[51-60]'
		WHEN age>60 THEN '[61+]'
	END AS 'age_group',
    count('age_group') AS 'wizard_count'
FROM wizzard_deposits
GROUP BY `age_group`
ORDER BY `age_group`;

-- 10
SELECT left(first_name,1) AS 'first_letter'
FROM wizzard_deposits
WHERE deposit_group='Troll Chest'
GROUP BY `first_letter`
ORDER BY `first_letter`;

-- 10.1
SELECT DISTINCT left(first_name,1) AS 'first_letter'
FROM wizzard_deposits
WHERE deposit_group='Troll Chest'
-- GROUP BY `first_letter`
ORDER BY `first_letter`;

-- 11
SELECT 	deposit_group,
		is_deposit_expired,
        AVG(deposit_interest) AS 'average_interest'
FROM wizzard_deposits
WHERE deposit_start_date>'1985-01-01'
GROUP BY deposit_group,is_deposit_expired
ORDER BY deposit_group DESC, is_deposit_expired;

-- 12
SELECT 	department_id,
		round(MIN(salary),4) AS 'minimum_salary'
FROM employees
WHERE department_id IN (2,5,7) AND hire_date>'2000-01-01'
GROUP BY department_id
ORDER BY department_id;

-- 13
SELECT department_id, AVG(IF(department_id=1,salary+5000,salary)) as 'avg_salary'
FROM employees
WHERE manager_id<>42 AND salary>30000
GROUP BY department_id
ORDER BY department_id;

-- 14
SELECT department_id, MAX(salary) AS 'max_salary'
FROM employees
GROUP BY department_id
HAVING max_salary NOT BETWEEN 30000 AND 70000
ORDER BY department_id;

-- 15
SELECT COUNT(salary) AS ''
FROM employees
WHERE manager_id IS NULL;

-- 16
SELECT department_id,(SELECT DISTINCT salary 
							FROM employees i 
							WHERE i.department_id=o.department_id
							ORDER BY salary DESC
							LIMIT 1 OFFSET 2) AS 'third_highest_salary'
FROM employees o
GROUP BY department_id
HAVING `third_highest_salary` IS NOT NULL
ORDER BY department_id; 

-- 17
SELECT first_name, last_name, department_id
FROM employees o
WHERE salary>(SELECT AVG(salary)
				FROM employees i
                WHERE i.department_id=o.department_id
                GROUP BY i.department_id)
ORDER BY department_id, employee_id
LIMIT 10;
        
-- 18
SELECT department_id, SUM(salary) AS 'total_salary'
FROM employees
GROUP BY department_id
ORDER BY department_id;



