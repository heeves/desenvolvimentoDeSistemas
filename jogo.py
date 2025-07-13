from dado import Dado
class Jogo:
    primeiroDado = Dado()
    segundoDado = Dado()
    resultado = None
    
def jogar(self):
    self.primeiroDado.lancar()
    self.segundoDado.lancar()

    soma = self.primeiroDado.valorDaFace + self.segundoDado.valorDaFace
    if (soma == 7):
        self.resultado = "VENCEU"
    else:
        self.resultado = "PERDEU"
        
def apresentarResultado(self):
    print("Valor do primeiro dado: ", self.primeiroDado.valorDaFace)
    print("Valor do segundo dado: ", self.segundoDado.valorDaFace)
    print("Resultado do jogo: ", self.resultado)
          
