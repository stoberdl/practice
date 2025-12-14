-- Last updated: 12/14/2025, 5:55:58 PM
-- Write your PostgreSQL query statement below
Select email from Person group by email  Having Count(*) > 1;