## Test task

- **String to Integer:**
  ```
  The function first discards as many whitespace characters as necessary
  until the first non-whitespace character is found. Then, starting from
  this character, takes an optional initial plus or minus sign followed by as
  many numerical digits as possible, and interprets them as a numerical
  value.
  The string can contain additional characters after those that form the
  integral number, which are ignored and have no effect on the behavior
  of this function.
  If the first sequence of non-whitespace characters in str is not a valid
  integral number, or if no such sequence exists because either str is empty
  or it contains only whitespace characters, no conversion is performed.
  If no valid conversion could be performed, a zero value is returned.
  Note:
  (a) Only the space character ’ ’ is considered as whitespace character.
  (b) Assume we are dealing with an environment which could only
  store integers within the 32-bit signed integer range
  Examples:
  (a) Input: "42"; Output: 42
  (b) Input: 42"; Output: -42
  (c) Input: "4193 with words"; Output: 4193
  ```

-  **Spring Boot приложение:**
    ```
    Необходимо написать Spring Boot приложение, которое влючает в
    себя 2 эндпоинта. Первый эндпоинт принимает на входе doc(x) до-
    кумент, удаляет из него все стили и возвращает результат в файле.
    Также необходимо вести аудит вызовов первого эндпоинта и со-
    хранять в виде: время начала обработки файла, время окончания,
    размер файла, имя файла. Второй эндпоинт возвращает аудит с
    возможностью фильтрации по промежутку дат. Опционально (бу-
    дет плюсом) покрыть тестами хотя бы один из эндпоинтов.
    ```
  