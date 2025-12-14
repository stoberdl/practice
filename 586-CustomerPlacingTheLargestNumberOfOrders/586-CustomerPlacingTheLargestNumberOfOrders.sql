-- Last updated: 12/14/2025, 5:55:49 PM
-- Write your PostgreSQL query statement below
Select customer_number from Orders group by customer_number  order by count(*) desc limit 1;