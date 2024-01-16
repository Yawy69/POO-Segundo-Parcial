@author Yannick

from collections import deque

class Grafo:
    def __init__(self):
        self.vertices = {}
        
    def agregar_vertice(self, v, vecinos):
        self.vertices[v] = {'vecinos': vecinos, 'visitado': False, 'nivel': None}

    def bfs(self, r):
        cola = deque([r])
        self.vertices[r]['visitado'] = True
        self.vertices[r]['nivel'] = 0

        while cola:
            actual = cola.popleft()
            print(f"Nodo: {actual}, Nivel: {self.vertices[actual]['nivel']}")

            for vecino in self.vertices[actual]['vecinos']:
                if not self.vertices[vecino]['visitado']:
                    cola.append(vecino)
                    self.vertices[vecino]['visitado'] = True
                    self.vertices[vecino]['nivel'] = self.vertices[actual]['nivel'] + 1

# Crear un grafo de ejemplo
grafo_ejemplo = Grafo()
grafo_ejemplo.agregar_vertice(2, [1, 3])
grafo_ejemplo.agregar_vertice(1, [2, 4])
grafo_ejemplo.agregar_vertice(3, [2, 4, 5])
grafo_ejemplo.agregar_vertice(4, [1, 3, 5])
grafo_ejemplo.agregar_vertice(5, [3, 4])

# Ejecutar BFS desde el nodo 2
grafo_ejemplo.bfs(2)
