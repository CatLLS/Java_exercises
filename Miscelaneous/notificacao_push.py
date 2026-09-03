from notificacao import Notificacao


class NotificacaoPush(Notificacao):
    def enviar(self, mensagem):
        print(f"[Push] {mensagem}")