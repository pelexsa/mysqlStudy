package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.stringDate;

public class stringDate4 {
    SELECT a.ANIMAL_ID,a.name
    from ANIMAL_INS as a
    right join ANIMAL_OUTS as b
    on a.ANIMAL_ID = b.ANIMAL_ID
    where DATEDIFF(b.DATETIME,a.DATETIME)
    order by DATEDIFF(b.DATETIME,a.DATETIME) desc
    limit 2;
}
