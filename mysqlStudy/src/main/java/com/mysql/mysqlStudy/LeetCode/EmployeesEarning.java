package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class EmployeesEarning {
    SELECT E1.Name as Employee
    FROM EMPLOYEE E1
    LEFT JOIN EMPLOYEE E2 ON (E1.MANAGERID = E2.ID)
    WHERE E1.SALARY > E2.SALARY;
}
