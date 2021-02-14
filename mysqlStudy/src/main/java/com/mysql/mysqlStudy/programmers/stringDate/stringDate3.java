package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.stringDate;

public class stringDate3 {
    SELECT ANIMAL_ID,NAME,
    case
    when SEX_UPON_INTAKE like '%Neutered%'
    or SEX_UPON_INTAKE like '%Spayed%' then "O"
            else 'X'
    end as "중성화"
    from ANIMAL_INS;
}
