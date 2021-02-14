package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.select;

public class select3 {
    SELECT ANIMAL_ID,NAME
    from ANIMAL_INS
    where INTAKE_CONDITION = 'sick'
    order by ANIMAL_ID asc;
}
