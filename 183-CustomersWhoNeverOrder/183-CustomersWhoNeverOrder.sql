-- Last updated: 12/14/2025, 5:55:57 PM
-- Write your PostgreSQL query statement below
select name as Customers 
from Customers c
left join orders on c.id = orders.customerId
where orders.customerId is null