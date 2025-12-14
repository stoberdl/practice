-- Last updated: 12/14/2025, 5:55:48 PM
-- Write your PostgreSQL query statement below
SELECT DISTINCT ON (player_id) player_id, event_date as first_login  from Activity order by player_id, event_date asc;