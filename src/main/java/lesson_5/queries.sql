--вывод таблицы
SELECT * FROM jaeger;

-- вывод не уничтоженных роботов
SELECT * FROM jaeger WHERE status != 'Destroyed';

--отображение роботов Mark1 и Mark5( так как mark6 у меня нет )
SELECT * FROM jaeger WHERE mark IN ('Mark-1', 'Mark-5');

--сортировка по столбцу mark по убыванию
SELECT * FROM jaeger ORDER BY mark DESC;

--самый старый робот
SELECT * FROM jaeger WHERE launch = (SELECT MIN(launch) FROM jaeger);

--роботы которые уничтожили больше всех kaiju
SELECT * FROM jaeger WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaeger);

--роботы которые уничтожили меньше всех kaiju
SELECT * FROM jaeger WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jaeger);

--средний вес роботов
SELECT AVG(height) FROM Jaeger;

--увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушенны
UPDATE jaeger SET kaijuKill =  kaijuKill + 1 WHERE status != 'Destroyed';

--удаление уничтоженных роботов
DELETE FROM Jaeger WHERE status = 'Destroyed';