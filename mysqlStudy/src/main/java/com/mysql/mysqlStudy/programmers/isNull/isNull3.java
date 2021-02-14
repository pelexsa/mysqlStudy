package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.isNull;

public class isNull3 {
    SELECT ANIMAL_TYPE,ifnull(name,'No name') as NAME,SEX_UPON_INTAKE
    from ANIMAL_INS;
}
