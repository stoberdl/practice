-- Last updated: 12/14/2025, 5:56:00 PM
-- Write your PostgreSQL query statement below
Select firstName, lastName, city, state
from Person
left join Address on Person.personId = Address.personId