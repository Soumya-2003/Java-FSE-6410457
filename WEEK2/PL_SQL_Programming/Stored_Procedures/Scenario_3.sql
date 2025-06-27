/* Write a stored procedure TransferFunds that transfers a specified amount from one account to another, 
checking that the source account has sufficient balance before making the transfer. */

SET AUTOCOMMIT ON;
SET SERVEROUTPUT ON;        

CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account_id NUMBER,
    to_account_id NUMBER,
    transfer_amount NUMBER
) IS
    from_balance NUMBER;
    to_balance NUMBER;
BEGIN
    SELECT balance INTO from_balance
    FROM accounts
    WHERE account_id = from_account_id;

    IF from_balance < transfer_amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
        RETURN;
    END IF;

    UPDATE accounts
    SET balance = balance - transfer_amount
    WHERE account_id = from_account_id;

    UPDATE accounts
    SET balance = balance + transfer_amount
    WHERE account_id = to_account_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transferred ' || transfer_amount || ' from account ' || from_account_id || ' to account ' || to_account_id);
END;
/

BEGIN
    TransferFunds(101, 102, 1000);
END;
    