
-- 1
SELECT * FROM (departments)
ORDER BY department_id;

-- 2
SELECT `name` 
FROM departments
ORDER BY department_id;

-- 3
SELECT first_name,last_name,salary 
FROM employees
ORDER BY employee_id;

-- 4
SELECT first_name,middle_name,last_name 
FROM employees
ORDER BY employee_id;

-- 5
SELECT concat(first_name,'.',last_name,'@softuni.bg')
AS 'full_email_address '
FROM employees
ORDER BY employee_id;

-- 6
SELECT DISTINCT salary
FROM employees;

-- 7
SELECT
	employee_id as id,
    first_name as 'First Name',
    last_name as 'Last Name',
    middle_name as 'Middle Name',
    job_title as 'Job Title',
    department_id as 'Dept ID',
    manager_id	as 'Mngr ID', 
	hire_date  as 'Hire Date',
	salary,
	address_id
FROM employees
WHERE job_title='Sales Representative'
ORDER BY employee_id;

-- 8
SELECT 
	first_name,
    last_name,
    job_title
FROM employees
WHERE salary BETWEEN 20000 and 30000
ORDER BY employee_id;

-- 9
SELECT concat_ws(' ',first_name,middle_name,last_name) as 'Full Name'
FROM employees
WHERE salary IN (25000, 14000, 12500,23600)
ORDER BY employee_id;

-- 10
SELECT
	first_name,last_name
FROM employees
WHERE manager_id is NULL
ORDER BY employee_id;

-- 11
SELECT
	first_name,last_name,salary
FROM employees
WHERE salary>50000
ORDER BY salary DESC;

-- 12
SELECT
	first_name,last_name
FROM employees
ORDER BY salary DESC
LIMIT 5;

-- 13
SELECT
	first_name,last_name
FROM employees
WHERE department_id<>4
ORDER BY employee_id;

--- 14
SELECT
	employee_id as id,
    first_name as 'First Name',
    last_name as 'Last Name',
    middle_name as 'Middle Name',
    job_title as 'Job Title',
    department_id as 'Dept ID',
    manager_id	as 'Mngr ID', 
	hire_date  as 'Hire Date',
	salary,
	address_id
FROM employees
ORDER BY 
	salary DESC,
    first_name,
    last_name DESC,
    middle_name,
    id;

-- 15
CREATE VIEW v_employees_salaries AS
SELECT 
		first_name,
		last_name,
		salary
FROM employees;
SELECT * FROM v_employees_salaries;

-- 16
CREATE VIEW v_employees_job_titles AS
SELECT concat_ws(' ',first_name,middle_name,last_name) as 'Full Name',
		job_title
FROM employees;
SELECT * FROM v_employees_job_titles;

-- 17
SELECT DISTINCT job_title
FROM employees
ORDER BY job_title;

-- 18
SELECT * FROM projects
ORDER BY
	start_date,
    name,
    project_id
LIMIT 10;

-- 19
SELECT
	first_name,
    last_name,
    hire_date
FROM employees
ORDER BY hire_date DESC
LIMIT 7;

-- 20
UPDATE employees
SET salary=salary*1.12
WHERE department_id IN (1,2,4,11);
SELECT salary FROM employees;

-- 20.2
UPDATE employees
SET salary=salary*1.12
WHERE department_id IN (
	SELECT department_id
    FROM departments
    WHERE name in ('Engineering', 'Tool Design', 'Marketing','Information Services') 
);
SELECT salary FROM employees;

-- 21
SELECT peak_name FROM peaks
ORDER BY peak_name;

-- 22
SELECT
	country_name,
    population
FROM countries
WHERE continent_code="EU"
ORDER BY
	population DESC,
    country_name
LIMIT 30;

-- 23
SELECT 
	country_name,
    country_code,
    CASE
		WHEN currency_code='EUR' THEN 'Euro' 
		ELSE 'Not Euro'
	END AS currency
FROM countries
ORDER BY country_name;

-- 23.2
SELECT 
	country_name,
    country_code,
    IF(currency_code='EUR','Euro','Not Euro')
FROM countries
ORDER BY country_name;

-- 24
SELECT name FROM characters
ORDER BY name;




