-- Last updated: 12/14/2025, 5:55:59 PM
-- Write your PostgreSQL query statement below

Select e.name as Employee
from employee m
inner join employee e on m.id = e.managerId
where e.salary > m.salary


