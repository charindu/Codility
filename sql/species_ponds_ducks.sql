SELECT
    t.pond_id,
    SUM(t.is_happy)
FROM
    (
        SELECT
            p.id pond_id,
            CASE
                WHEN s.temp_preferences = '-'
                     AND p.temperature <= s.temp_limit THEN
                    1
                WHEN s.temp_preferences = '+'
                     AND p.temperature >= s.temp_limit THEN
                    1
                ELSE
                    0
            END is_happy
        FROM
            ponds     p
            LEFT JOIN ducks     d ON p.id = d.pond_id
            LEFT JOIN species   s ON s.id = d.species_id
    ) t
GROUP BY
    t.pond_id
ORDER BY
    t.pond_id;