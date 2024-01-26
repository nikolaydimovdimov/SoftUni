

-- 1
CREATE TABLE minions (
    id INT AUTO_INCREMENT,
    `name` VARCHAR(50),
    age INT,
    CONSTRAINT PRIMARY KEY (id)
);

CREATE TABLE towns (
    town_id INT AUTO_INCREMENT,
    `name` VARCHAR(50),
    CONSTRAINT PRIMARY KEY (town_id)
);

-- 2
ALTER TABLE minions
ADD COLUMN town_id INT;

ALTER TABLE minions
ADD CONSTRAINT fk_minions_towns FOREIGN KEY(town_id) REFERENCES towns(town_id);


-- 3
INSERT INTO towns 
VALUES  (1,"Sofia"),
		(2,"Plovdiv"),
		(3,"Varna");

INSERT INTO minions 
VALUES 	(1,"Kevin",22,1),
		(2,"Bob",15,3),
        (3,"Steward",null,2);
        
        
-- 4        
TRUNCATE TABLE minions;

-- 5
DROP TABLE minions;
DROP TABLE towns;

-- 6
CREATE TABLE people(
	id INT AUTO_INCREMENT,
	`name` VARCHAR(200) NOT NULL,
	picture BLOB,
	height  DOUBLE(4,2),
	weight DOUBLE(5,2),
	gender  CHAR(1) NOT NULL,
	birthdate DATE NOT NULL,
	biography TEXT,
	CONSTRAINT PRIMARY KEY (id)
);

INSERT INTO people
VALUES 	(1,"Ivan",null,1.70,84,"m","1990-02-21","aaaaaaa"),
		(2,"Neli",null,1.65,52,"f",'1998-03-17',"bbbbbbb"),
		(3,"Peta",null,1.82,92,"m",'1984-07-23',"vvvvvvvvv"),
		(4,"Galia",null,1.71,58,"f",'1992-08-12',"ggggggggggg"),
		(5,"Kamen",null,1.75,80,"m",'1993-09-5',"ddddddddddd");
        
        
        
-- 7
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT,
    username VARCHAR(30) UNIQUE NOT NULL,
    `password` VARCHAR(26) NOT NULL,
    profile_picture BLOB,
    last_login_time DATETIME,
    is_deleted BOOLEAN,
    CONSTRAINT PRIMARY KEY (id)
);

INSERT INTO users (username, `password`, profile_picture, last_login_time, is_deleted) 
VALUES 	('john_doe', 'hashed_password_1', NULL, '2024-01-14 12:30:00', false),
		('jane_smith', 'hashed_password_2', NULL, '2024-01-15 10:45:00', false),
		('bob_jackson', 'hashed_password_3', NULL, '2024-01-16 15:20:00', false),
		('alice_carter', 'hashed_password_4', NULL, '2024-01-17 08:55:00', false),
		('sam_wilson', 'hashed_password_5', NULL, '2024-01-18 18:10:00', false);
        
		
-- 8
ALTER TABLE users
DROP PRIMARY KEY,
ADD CONSTRAINT pk_user
PRIMARY KEY (id,username);

-- 9
ALTER TABLE users
MODIFY COLUMN last_login_time DATETIME DEFAULT NOW();

-- 10
ALTER TABLE users
DROP PRIMARY KEY,
ADD CONSTRAINT pk_users
PRIMARY KEY (id),
ADD CONSTRAINT UNIQUE (username);

-- 11
CREATE DATABASE Movies;
USE Movies;
CREATE TABLE directors(
	id INT PRIMARY KEY AUTO_INCREMENT,
    director_name VARCHAR(255) NOT NULL,
    notes TEXT
);
CREATE TABLE genres (
	id INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(255) NOT NULL,
    notes TEXT
);
CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(255) NOT NULL,
    notes TEXT
);
CREATE TABLE movies(
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    director_id INT NOT NULL,
    copyright_year INT,
    length DOUBLE(10,2),
    genre_id INT,
    category_id INT,
    rating DOUBLE(10,2),
    notes TEXT,
    FOREIGN KEY (director_id) REFERENCES directors(id),
	FOREIGN KEY(genre_id) REFERENCES genres(id),
    FOREIGN KEY (category_id) REFERENCES categories(id)
);

INSERT INTO directors (director_name, notes) 
VALUES 
('Christopher Nolan', 'Renowned for his work on The Dark Knight trilogy.'),
('Quentin Tarantino', 'Famous for his unique storytelling and nonlinear narratives.'),
('Steven Spielberg', 'One of the most successful directors in the history of cinema.'),
('Greta Gerwig', 'Known for her directorial work in Lady Bird and Little Women.'),
('Hayao Miyazaki', 'Renowned Japanese animator and director of Studio Ghibli.');

INSERT INTO genres (genre_name, notes) 
VALUES 
('Action', 'Movies filled with exciting sequences, typically involving physical feats and combat.'),
('Drama', 'Narratives that explore realistic characters and emotional themes.'),
('Science Fiction', 'Stories often set in the future, with speculative scientific and technological concepts.'),
('Comedy', 'Intended to amuse and entertain, often with exaggerated characters and situations.'),
('Fantasy', 'Involves magical elements, mythical creatures, and imaginary worlds.');

INSERT INTO categories (category_name, notes) 
VALUES 
('Thriller', 'Suspenseful and thrilling narratives that keep the audience on the edge of their seats.'),
('Romance', 'Stories centered around love and romantic relationships.'),
('Horror', 'Designed to evoke fear and suspense, often involving supernatural elements.'),
('Documentary', 'Non-fictional narratives presenting facts and information.'),
('Mystery', 'Involves solving a mysterious event or uncovering secrets.');

INSERT INTO movies (title, director_id, copyright_year, length, genre_id, category_id, rating, notes) 
VALUES 
('Inception', 1, 2010, 148, 1, 1, 9, 'Mind-bending science fiction directed by Christopher Nolan.'),
('Pulp Fiction', 2, 1994, 154, 2, 1, 8, 'Quentin Tarantino\'s iconic and nonlinear crime film.'),
('E.T. the Extra-Terrestrial', 3, 1982, 115, 3, 1, 8, 'Classic family-friendly science fiction directed by Steven Spielberg.'),
('Little Women', 4, 2019, 135, 2, 2, 7, 'Greta Gerwig\'s adaptation of the Louisa May Alcott novel.'),
('Spirited Away', 5, 2001, 125, 5, 1, 9, 'Acclaimed animated fantasy film by Hayao Miyazaki.');

-- 12
CREATE DATABASE car_rental;
USE car_rental;

CREATE TABLE categories(
	id INT PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(255),
    daily_rate DOUBLE(6,2),
    weekly_rate DOUBLE(6,2),
    monthly_rate DOUBLE(6,2),
    weekend_rate DOUBLE(6,2)
);

CREATE TABLE cars(
	id INT PRIMARY KEY AUTO_INCREMENT,
    plate_number VARCHAR(255),
    make VARCHAR(255),
    model VARCHAR(255),
    car_year DATE,
    category_id INT,
    doors INT,
    picture BLOB,
    car_condition TEXT,
    available BOOL,
    FOREIGN KEY (category_id) REFERENCES categories(id) 
);

CREATE TABLE employees(
	id INT  AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    title VARCHAR(255),
    notes TEXT
);

CREATE TABLE customers(
	id INT  AUTO_INCREMENT PRIMARY KEY,
	driver_licence_number INT,
    full_name VARCHAR(255),
    adress VARCHAR(255),
    city VARCHAR(60),
    zip_code INT,
    notes TEXT
);

CREATE TABLE rental_orders(
	id INT  AUTO_INCREMENT PRIMARY KEY,
	employee_id INT,
    customer_id INT,
    car_id INT,
    car_condition VARCHAR(255),
    tank_level INT,
    kilometrage_start INT,
    kilometrage_end INT,
    total_kilometrage INT,
    start_date DATE,
    end_date DATE, 
    total_days INT, 
    rate_applied DOUBLE(6,2), 
    tax_rate DOUBLE(6,2),
    order_status BOOL,
    notes TEXT,
	FOREIGN KEY (employee_id) REFERENCES employees(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (car_id) REFERENCES cars(id)
);

INSERT INTO categories (category, daily_rate, weekly_rate, monthly_rate, weekend_rate) 
VALUES 
		('Economy', 30.00, 180.00, 600.00, 40.00),
		('Compact', 35.00, 210.00, 700.00, 45.00),
		('SUV', 45.00, 270.00, 900.00, 60.00);
        
INSERT INTO cars (plate_number, make, model, car_year, category_id, doors, picture, car_condition, available) 
VALUES 
		('ABC123', 'Toyota', 'Corolla', '2020-10-1', 1, 4, NULL, 'Excellent condition', true),
		('XYZ456', 'Honda', 'Civic', '2019-9-1', 2, 4, NULL, 'Good condition', true),
		('DEF789', 'Ford', 'Escape', '2021-8-1', 3, 5, NULL, 'Like new', true);
        
INSERT INTO employees (first_name, last_name, title, notes) 
VALUES 
('John', 'Doe', 'Manager', 'Experienced manager with a focus on customer service.'),
('Alice', 'Smith', 'Sales Associate', 'Friendly and knowledgeable sales associate.'),
('Bob', 'Johnson', 'Maintenance Technician', 'Skilled technician ensuring vehicle maintenance.');

INSERT INTO customers (driver_licence_number, full_name, adress, city, zip_code, notes) 
VALUES 
(123456789, 'Emma Johnson', '123 Main St', 'Cityville', 12345, 'Frequent customer with excellent rental history.'),
(987654321, 'Michael Brown', '456 Oak St', 'Townsville', 54321, 'First-time customer referred by a friend.'),
(555888777, 'Sophia Davis', '789 Pine St', 'Villagetown', 67890, 'Enjoys renting different car models for special occasions.');

INSERT INTO rental_orders (employee_id, customer_id, car_id, car_condition, tank_level, kilometrage_start, kilometrage_end, total_kilometrage, start_date, end_date, total_days, rate_applied, tax_rate, order_status, notes) 
VALUES 
(1, 1, 1, 'Clean and well-maintained', 75, 5000, 5200, 200, '2024-01-15', '2024-01-18', 3, 40.00, 0.1, true, 'Satisfied customer, regular renter.'),
(2, 2, 2, 'Good condition', 80, 3000, 3100, 100, '2024-01-16', '2024-01-19', 3, 45.00, 0.1, true, 'First-time renter, positive feedback.'),
(3, 3, 3, 'Like new', 90, 8000, 8100, 100, '2024-01-17', '2024-01-20', 3, 60.00, 0.1, true, 'Regular customer, prefers SUVs for family trips.');


-- 13
CREATE DATABASE soft_uni;
USE soft_uni;
CREATE table towns(
	id INT AUTO_INCREMENT,
    `name` VARCHAR(50), 
	CONSTRAINT pk_towns PRIMARY KEY (id)
);

CREATE TABLE addresses(
	id INT AUTO_INCREMENT,
    address_text VARCHAR(200),
    town_id INT,
	CONSTRAINT pk_adresses PRIMARY KEY (id),
    CONSTRAINT fk_adresses_towns FOREIGN KEY (town_id) REFERENCES towns(id)
);

CREATE TABLE departments (
    id INT AUTO_INCREMENT,
    `name` VARCHAR(50),
    CONSTRAINT pk_departments PRIMARY KEY (id)
);

CREATE TABLE employees (
	id INT AUTO_INCREMENT,
    first_name VARCHAR(50),
    middle_name VARCHAR(50),
    last_name VARCHAR(50),
    job_title VARCHAR(50),
    department_id INT,
    hire_date DATE,
    salary DOUBLE(10,2),
    address_id INT,
    CONSTRAINT pk_employees PRIMARY KEY (id),
    CONSTRAINT fk_employees_departments FOREIGN KEY (department_id) REFERENCES departments(id),
    CONSTRAINT fk_employees_addresses FOREIGN KEY (address_id) REFERENCES addresses(id)
);

INSERT INTO towns (name)
VALUES 	('Sofia'),
		('Plovdiv'),
        ('Varna'),
        ('Burgas');
        
INSERT INTO departments (name)
VALUES 	('Engineering'),
		('Sales'),
        ('Marketing'),
        ('Software Development'),
        ('Quality Assurance');

INSERT INTO employees (first_name,middle_name,last_name,job_title,department_id, hire_date,salary)
VALUES ('Ivan','Ivanov','Ivanov','.NET Developer',4,'2013-02-01',3500.00),
		('Petar','Petrov','Petrov','Senior Engineer',1,'2004-03-02',4000.00),
        ('Maria','Petrova','Ivanova','Intern',5,'2016-08-28',525.25),
        ('Georgi','Terziev','Ivanov','CEO',2,'2007-12-09',3000.00),
        ('Peter','Pan','Pan','Intern',3,'2016-08-28',599.88);
        
-- 14
SELECT * FROM towns;
SELECT * FROM departments;
SELECT * FROM employees;

-- 15
SELECT * FROM towns AS t ORDER BY t.`name` ASC;
SELECT * FROM departments as d ORDER BY d.name ASC;
SELECT * FROM employees as e ORDER BY e.salary DESC;

-- 16
SELECT name FROM towns ORDER BY name ASC;
SELECT name FROM departments ORDER BY name ASC ;
SELECT first_name, last_name, job_title, salary FROM employees ORDER BY salary DESC;

-- 17
UPDATE employees
SET salary=salary*1.1;
SELECT salary FROM employees;

