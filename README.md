# Фреймворк Spring (семинары)
## Урок 2. Основы Spring. Spring Boot

##№ Описание

- Создание простого Spring Boot приложения.
- Настройка и использование Spring Dependency Injection.
- Создание простого REST контроллера.

## Задание

**Программировать электронную очередь.**

1. Класс TicketNumberGenerator - бин (синглтон), у которого есть метод createNewNumber()
1.1 Метод createNewNumber возвращает строки вида "Ticket #X", где X - UUID (UUID.randomUUID().toString())

```
Пример:
TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
System.out.println(generator.createNewNumber()); // "Ticket #b0b3a25d-2135-4b18-9dec-08d494b96b06"
System.out.println(generator.createNewNumber()); // "Ticket #379c5673-50c3-4daf-a53f-a396a3d34535"
System.out.println(generator.createNewNumber()); // "Ticket #b4cc4e55-69b2-4c49-867f-09735fea292a"

```

2. Создать класс Ticket (не бин!!!) с полями: <br>
2.1. String number - номер тикета <br>
2.2. LocalDateTime createdAt - дата создания <br>
2.3. ... (любые другие поля) <br>

Класс Tablo - бин (синглтон), у которого есть поле ticketNumberGenerator <br>
и метод метод newTicket(), который создает объетк класса Ticket с значениями полей:

3.1 number - результат вызова TicketNumberGenerator#createNewNumber <br>
3.2 createdAt - LocalDateTime.now()
