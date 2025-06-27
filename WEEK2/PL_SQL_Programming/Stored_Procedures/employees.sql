SET AUTOCOMMIT ON;

CREATE TABLE employees(
    employee_id NUMBER PRIMARY KEY,
    name VARCHAR(20),
    department VARCHAR(20),
    salary NUMBER(10,2),
    bonus_percentage NUMBER(5,2) DEFAULT 0.00
);

INSERT INTO employees(employee_id, name, department, salary) VALUES(1001, 'Alice Johnson', 'Finance', 50000);
INSERT INTO employees(employee_id, name, department, salary) VALUES(2001, 'Bob Smith', 'HR', 60000);
INSERT INTO employees(employee_id, name, department, salary) VALUES(3012, 'Charlie Brown', 'IT', 70000);
INSERT INTO employees(employee_id, name, department, salary) VALUES(4003, 'Diana Prince', 'Marketing', 80000);

SELECT * FROM employees;