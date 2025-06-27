SET AUTOCOMMIT ON;

CREATE TABLE accounts(
    account_id NUMBER(10) PRIMARY KEY,
    account_type VARCHAR(15) NOT NULL,
    balance NUMBER(10,2),
    customer_id NUMBER(10) REFERENCES customers(customer_id)
);

INSERT INTO accounts VALUES(101, 'Savings', 1500.20, 50);
INSERT INTO accounts VALUES(102, 'Checking', 2500.00, 51);
INSERT INTO accounts VALUES(103, 'Savings', 3000.50, 52);
INSERT INTO accounts VALUES(104, 'Checking', 4000.78, 53);

SELECT * FROM accounts;