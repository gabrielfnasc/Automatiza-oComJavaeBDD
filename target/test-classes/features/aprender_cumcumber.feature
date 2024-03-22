Feature: Login




Scenario: Login com sucesso

Given que estou no site
When clico
Then  logo no site

Scenario:  Incrementar valor do contador

Given que o valor do contador é 15
When eu incrementar 3
Then o valor do contador será 18


Scenario: Deve calcular atraso na entrega

Given que a entrega é dia 06/03/2024
When a entrega atrasar 2 dias
Then a entrega sera efetuada em 08/03/2024 