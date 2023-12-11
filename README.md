# myWebApp
Реализовано с целю обучения технологиям Spring в ходе прохождения моей производственной практики

Приложение позволяет работать с информацией о людях (студентах)
Используется база данных students с таблицей students_table, хранящей информацию о студентах
Таблица и сущность студента создаются в базе данных через JPA

Для ускорения и упрощения реализации использовались Lombok и Spring Boot

Реализовано два сервиса:
  - хранящий данные в памяти: простой ArrayList
  - (Primary) работающий с СУБД PostgreSQL через JPA

Имеется контроллер и простейшие обработчики HTTP запросов:
  - POST (/students/new)
  - UPDATE (/students/update/{email})
  - DELETE (/students/delete/{email})
  - GET (/students)