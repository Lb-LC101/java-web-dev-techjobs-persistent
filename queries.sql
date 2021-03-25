## Part 1: Test it with SQL
-- list the columns and their data types in the table
SELECT COLUMN_NAME, DATA_TYPE
  FROM INFORMATION_SCHEMA.COLUMNS
  WHERE TABLE_SCHEMA = 'techjobs' AND TABLE_NAME = 'job';
  
## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = 'St. Louis City';

## Part 3: Test it with SQL
DROP TABLE JOB;

## Part 4: Test it with SQL
SELECT DISTINCT skill.name, skill.description
FROM skill
INNER JOIN job_skills ON job_skills.skills_id=skill.id
WHERE job_skills.skills_id IS NOT NULL and skill.id IS NOT NULL

ORDER BY name ASC;