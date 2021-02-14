package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.groupBy;

public class groupBy1 {
    SELECT ANIMAL_TYPE,count(ANIMAL_TYPE) as count
    from ANIMAL_INS
    group by ANIMAL_TYPE
    order by ANIMAL_TYPE;
}
