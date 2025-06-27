/* A customer can be promoted to VIP status based on their balance.
 Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.*/

SET AUTOCOMMIT ON;
SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT customer_id, balance
        FROM CUSTOMERS
        WHERE balance > 10000;
    
    c_id customers.customer_id%TYPE;
    c_balance customers.balance%TYPE;
BEGIN
    OPEN customer_cursor;
    LOOP
        FETCH customer_cursor INTO c_id, c_balance;

        EXIT WHEN customer_cursor%NOTFOUND;

        UPDATE customers
        SET IsVIP = 'Yes'
        WHERE customer_id = c_id;

        dbms_output.put_line('Customer ID ' || c_id || ' promoted to VIP status.');
    END LOOP;
    CLOSE customer_cursor;
    COMMIT;
END;
/