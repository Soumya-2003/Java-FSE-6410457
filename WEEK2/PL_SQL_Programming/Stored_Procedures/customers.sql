SET AUTOCOMMIT ON;

CREATE TABLE customers(
    customer_id INT PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    email VARCHAR(30) UNIQUE NOT NULL
);

INSERT INTO customers VALUES(50, 'John Doe', ' johndoe@gmail.com');
INSERT INTO customers VALUES(51, 'Jane Smith', 'smith@outlook.com');
INSERT INTO customers VALUES(52, 'Sachin Johnson', 'sachin@gmail.com');
INSERT INTO customers VALUES(53, 'Rihanna Brown', 'rihana@yahoo.com');

select * from customers;