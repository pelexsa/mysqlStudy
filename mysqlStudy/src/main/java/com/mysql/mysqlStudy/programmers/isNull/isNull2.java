package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.isNull;

public class isNull2 {
    SELECT ANIMAL_ID
    from  ANIMAL_INS
    where name is not null
    order by ANIMAL_ID asc;
}
