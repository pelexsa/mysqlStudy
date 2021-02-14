package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.join;

public class join2 {
    SELECT b.ANIMAL_ID,b.name
    from ANIMAL_INS as a
    join ANIMAL_OUTS  as b
    on a.ANIMAL_ID = b.ANIMAL_ID
    where a.DATETIME > b.DATETIME
    order by a.DATETIME;
}
