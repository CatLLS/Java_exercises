from notificacao import Notificacao


class NotificacaoEmail(Notificacao):
    def enviar(self, mensagem):
        print(f"[Email] {mensagem}")