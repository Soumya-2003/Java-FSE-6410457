/*Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.*/

SET AUTOCOMMIT ON;
SET SERVEROUTPUT ON;

DECLARE
    CURSOR loan_cursor IS
        SELECT l.loan_id, c.name, l.due_date
        FROM loans l, customers c
        WHERE l.customer_id = c.customer_id 
        AND l.DUE_DATE <= SYSDATE + 30;

    l_id loans.loan_id%TYPE;
    c_name customers.name%TYPE;
    l_due_date loans.due_date%TYPE;
BEGIN
    OPEN loan_cursor;
    LOOP
        FETCH loan_cursor INTO l_id, c_name, l_due_date;

        EXIT WHEN loan_cursor%NOTFOUND;

        dbms_output.put_line('Reminder: Loan ID ' || l_id || ' for customer ' || c_name || 
                          ' is due on ' || TO_CHAR(l_due_date, 'DD-MON-YYYY'));
    END LOOP;
    CLOSE loan_cursor;
    COMMIT;
END;
/   