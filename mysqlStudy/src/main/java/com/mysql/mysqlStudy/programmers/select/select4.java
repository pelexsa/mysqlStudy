package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.select;

public class select4 {
    SELECT ANIMAL_ID,NAME
    from ANIMAL_INS
    where INTAKE_CONDITION not in ('Aged')
    order by ANIMAL_ID asc;
}
