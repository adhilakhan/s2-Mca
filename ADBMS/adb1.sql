use company;
Alter table Department rename to Dept;
Alter table employees modify salary smallint;
Alter table employees add commission int;
select * from employees;
select *from countries;
select * from jobs;
select * from Dept;
select email,phone_number from employees;
select * from employees where last_name="Fay";
select hire_date,employee_id,first_name,last_name from employees where last_name in ("Grant","Whalen");
select * from employees INNER JOIN jobs on employees.job_id = jobs.job_id where jobs.job_title = "Shipping Clerk";
select * from employees where department_id=8;
select * from Dept order by department_name desc;
select * from employees where last_name like 'K%';
select employee_id,first_name,last_name,hire_date from employees where hire_date between '1995-01-01' and '1997-12-31';
select * from jobs where max_salary < 5000;
select lower(email) from employees;
select concat(first_name,last_name) as Name from employees where hire_date between '1995-01-01' and '1995-12-31';
select * from Dept;
INSERT INTO
 employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES
 (207,'Paul','Newton','paul.newton@sqltutorial.org','515.123.9876','1999-06-07',1,8300.00,205,11);
delete from Dept where department_name = "Shipping";
