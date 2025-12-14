-- Last updated: 12/14/2025, 5:55:54 PM
-- Write your PostgreSQL query statement below
delete from person where id not in
(select min(id) from person group by email)