# Exercicios de POO

Cada classe Java e Python esta em um arquivo separado. Para executar:

```bash
javac -d /tmp/java_exercises_check Miscelaneous/*.java
java -cp /tmp/java_exercises_check Main
python3 Miscelaneous/main.py
```

As notificacoes usam uma interface/classe abstrata. Para adicionar `NotificacaoWhatsApp`, basta criar uma nova classe que implemente `enviar`; ela pode ser incluída na lista sem alterar o fluxo que envia a mensagem.