SET AUTOCOMMIT ON;

CREATE TABLE customers (
    customer_id  INT PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    age INT,
    balance NUMBER(10,2),
    IsVIP VARCHAR(5) DEFAULT 'No' CHECK (IsVIP IN ('Yes', 'No'))
);


-- Insert sample customers
INSERT INTO customers(customer_id, name, age, balance) VALUES (1, 'John Doe', 65, 12000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (2, 'Jane Smith', 45, 8000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (3, 'Alice Johnson', 70, 15000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (4, 'Bob Brown', 55, 9000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (5, 'Eve White', 62, 11000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (6, 'Mike Davis', 58, 7000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (7, 'Sarah Wilson', 68, 13000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (8, 'Tom Green', 40, 6000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (9, 'Linda Martin', 72, 16000);
INSERT INTO customers(customer_id, name, age, balance) VALUES (10, 'Chris Lee', 50, 9500);
INSERT INTO customers(customer_id, name, age, balance) VALUES (11, 'Karen Adams', 63, 10500);
INSERT INTO customers(customer_id, name, age, balance) VALUES (12, 'David Taylor', 59, 8500);