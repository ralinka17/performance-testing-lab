# performance-testing-lab
Load testing portfolio with JMeter, k6, CI/CD and monitoring

Проект performance-testing-lab
Проект создавался для охвата цикла нагрузочного тестирования, проверки производительности, автоматизации и анализа результатов. Работа проводилась с использованием современных инструментов тестирования. 

Стек: JMeter Apache, k6, GitHub Actions, JavaScript/Python/Java
Реализовано: 
- JMeter с созданием тестовых планов для HTTP/WebSocket протоколов с параметризацей данных (использование входных данных из внешних источников) через CSV-файлы, комплексные сценарии тестирования
- k6 javascript smoketest.js для smoke-тестирования (быстрая проверка) и loadtest.js нагрузочного тестирования (определение пределов производительности), есть гибкая конфигурация тестовых сценариев
- Автоматизация CI/CD (GitHub Actions), конфигурация k6-пайплайнов для регулярного запуска тестов, сборка отчетов
- План тестирования (/docs), анализ метрик (response time, RPS, error rate), отчеты с выводами по тестированию (/results) и рекомендациями

Тестируется сайт: https://jsonplaceholder.typicode.com

Рекомендации по запуску:
# клонирование репозитория
git clone https://github.com/ralinka17/performance-testing-lab
cd performance-testing-lab

# запуск к6 тестов
k6 run k6/smoke-test.js
k6 run k6/load-test.js

# запуск JMeter тестов
jmeter -n -t jmeter/http-test.jmx -l results.jtl
