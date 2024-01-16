@author Yannick

import heapq  # Módulo para implementar colas de prioridad (heap)

class Grafo:
    def __init__(self):
        self.vertices = {}

    def agregar_vertice(self, vertice):
        self.vertices[vertice] = []

    def agregar_arista(self, desde, hacia, peso):
        self.vertices[desde].append((hacia, peso))
        self.vertices[hacia].append((desde, peso))  # Si el grafo es no dirigido

    def dijkstra(self, inicio):
        distancia = {vertice: float('infinity') for vertice in self.vertices}
        distancia[inicio] = 0

        cola_prioridad = [(0, inicio)]

        while cola_prioridad:
            distancia_actual, vertice_actual = heapq.heappop(cola_prioridad)

            if distancia_actual > distancia[vertice_actual]:
                continue

            for vecino, peso in self.vertices[vertice_actual]:
                nueva_distancia = distancia_actual + peso

                if nueva_distancia < distancia[vecino]:
                    distancia[vecino] = nueva_distancia
                    heapq.heappush(cola_prioridad, (nueva_distancia, vecino))

        return distancia

# Ejemplo de uso
grafo = Grafo()
grafo.agregar_vertice('A')
grafo.agregar_vertice('B')
grafo.agregar_vertice('C')
grafo.agregar_vertice('D')

grafo.agregar_arista('A', 'B', 1)
grafo.agregar_arista('A', 'C', 4)
grafo.agregar_arista('B', 'C', 2)
grafo.agregar_arista('B', 'D', 5)
grafo.agregar_arista('C', 'D', 1)

inicio = 'A'
distancias = grafo.dijkstra(inicio)

print(f'Distancias más cortas desde el nodo {inicio}: {distancias}')
