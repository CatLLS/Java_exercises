from notificacao import Notificacao


class NotificacaoSMS(Notificacao):
    def enviar(self, mensagem):
        print(f"[SMS] {mensagem}")