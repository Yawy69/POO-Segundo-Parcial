@author Yannick

import math

class Grafo:
    def __init__(self, vertices):
        self.vertices = vertices
        self.aristas = []

    def agregar_arista(self, origen, destino, peso):
        self.aristas.append((origen, destino, peso))

    def el_mas_fuerte(self, inicio):
        distancias = {vertice: math.inf for vertice in range(1, self.vertices + 1)}
        predecesores = {vertice: None for vertice in range(1, self.vertices + 1)}
        distancias[inicio] = 0

        for _ in range(self.vertices - 1):
            for origen, destino, peso in self.aristas:
                if distancias[origen] + peso < distancias[destino]:
                    distancias[destino] = distancias[origen] + peso
                    predecesores[destino] = origen

        for origen, destino, peso in self.aristas:
            if distancias[origen] + peso < distancias[destino]:
                print("¡El grafo contiene un ciclo negativo!")
                return None

        return distancias, predecesores

    def camino(self, inicio, fin, predecesores):
        camino_reconstruido = []
        actual = fin

        while actual is not None:
            camino_reconstruido.insert(0, actual)
            actual = predecesores[actual]

        return camino_reconstruido


# Ejemplo de uso
grafo = Grafo(6)
grafo.agregar_arista(1, 2, 5)
grafo.agregar_arista(1, 3, 2)
grafo.agregar_arista(2, 4, 3)
grafo.agregar_arista(3, 5, 1)
grafo.agregar_arista(4, 6, 4)
grafo.agregar_arista(5, 6, 2)

inicio = 1
fin = 6

resultados = grafo.el_mas_fuerte(inicio)

if resultados:
    distancias, predecesores = resultados
    print(f"Distancia más corta desde {inicio} hasta {fin}: {distancias[fin]}")
    print(f"Camino más corto: {grafo.camino(inicio, fin, predecesores)}")
