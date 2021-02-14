package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.join;

public class join4 {
    SELECT a.ANIMAL_ID,a.ANIMAL_TYPE,a.NAME
    from ANIMAL_INS as a
    join ANIMAL_OUTS as b
    on a.ANIMAL_ID = b.ANIMAL_ID
    where a.SEX_UPON_INTAKE in ('Intact Male','Intact Female')
    and b.SEX_UPON_OUTCOME not in ('Intact Male','Intact Female');
}
