/* Write a PL/SQL block that loops through all customers, checks their age, 
 and if they are above 60, apply a 1% discount to their current loan interest rates. */
 SET AUTOCOMMIT ON;
 SET SERVEROUTPUT ON;

 DECLARE 
    CURSOR customer_cursor IS
        SELECT c.customer_id, l.loan_id, l.interest_rate
        FROM customers c, loans l
        WHERE c.customer_id = l.customer_id
        AND c.age > 60;

    c_id customers.customer_id%TYPE;
    l_id loans.loan_id%TYPE;
    l_interest_rate loans.interest_rate%TYPE;
BEGIN
    OPEN customer_cursor;
    LOOP
        FETCH customer_cursor INTO c_id, l_id, l_interest_rate;

        EXIT WHEN customer_cursor%NOTFOUND;
    
        UPDATE loans
        SET interest_rate = l_interest_rate - 1
        WHERE loan_id = l_id;

        DBMS_OUTPUT.PUT_LINE('Discount applied to loan ID: ' || l_id);
    END LOOP;
    CLOSE customer_cursor;
    COMMIT;
END;
/
