/* Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding 
a bonus percentage passed as a parameter.*/

SET AUTOCOMMIT ON;
SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept VARCHAR,
    p_bonus_percentage NUMBER
) IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * p_bonus_percentage / 100)
    WHERE department = dept;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Bonus applied to employees in ' || dept || ' department.');
END;
/


BEGIN
    UpdateEmployeeBonus('IT', 5);
END;
/