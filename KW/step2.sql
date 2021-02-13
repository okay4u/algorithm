-- Occupations
/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT OCP1
     , OCP2
     , OCP3
     , OCP4
FROM (
    SELECT NAME
         , OCCUPATION
         , RANK() OVER(PARTITION BY OCCUPATION ORDER BY NAME ASC) SEQ
    FROM OCCUPATIONS
) T
PIVOT
(
    MAX(NAME)
    FOR OCCUPATION
    IN ('Doctor'    AS OCP1,
        'Professor' AS OCP2,
        'Singer'    AS OCP3,
        'Actor'     AS OCP4)
)
ORDER BY SEQ;

-- Binary Tree Nodes
/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT N
     , CASE WHEN LEVEL = 1 THEN 'Root'
            WHEN CONNECT_BY_ISLEAF = 1 THEN 'Leaf'
            ELSE 'Inner'
       END
FROM BST
START WITH P IS NULL
CONNECT BY PRIOR N = P
ORDER BY N;