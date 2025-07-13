from random import randint
class Dado:
    valorDaFace = None

    def lancar(self):
        self.valorDaFace = randint(1,6)
