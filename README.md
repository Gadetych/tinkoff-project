# Backend-разработка на Java. Весна 2023 
Написано 2 web-сервиса для отслеживания обновлений контента по ссылкам. В сервисе поддерживаются:
 - Вопросы со StackOverflow
 - Репозитории GitHub

Управление подписками (ссылками) происходит через чат с ботом в Telegram. При новых изменениях в чат отправляется уведомление.

Сервисы общаются между собой как напрямую (по HTTP), так и асинхронно (очередь сообщений). Для хранения данных используется СУБД PostgreSQL.