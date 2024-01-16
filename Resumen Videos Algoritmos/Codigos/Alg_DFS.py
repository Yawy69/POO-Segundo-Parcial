@author Yannick

class Grafo:
    def __init__(self):
        self.vertices = {}
        
    def agrega_vertice(self, vertice):
        self.vertices[vertice] = []

    def agrega_arista(self, vertice1, vertice2):
        self.vertices[vertice1].append(vertice2)
        self.vertices[vertice2].append(vertice1)

    def dfs(self, inicio, visitados=None):
        if visitados is None:
            visitados = set()

        print("Visitando:", inicio)
        visitados.add(inicio)

        for vecino in self.vertices[inicio]:
            if vecino not in visitados:
                self.dfs(vecino, visitados)

# Crear un grafo de ejemplo
grafo = Grafo()
for i in range(1, 7):
    grafo.agrega_vertice(i)
grafo.agrega_arista(1, 2)
grafo.agrega_arista(1, 5)
grafo.agrega_arista(2, 3)
grafo.agrega_arista(2, 5)
grafo.agrega_arista(3, 4)
grafo.agrega_arista(4, 5)
grafo.agrega_arista(4, 6)
# Ejecutar DFS desde el nodo 1
print("Resultado de DFS:")
grafo.dfs(1)
