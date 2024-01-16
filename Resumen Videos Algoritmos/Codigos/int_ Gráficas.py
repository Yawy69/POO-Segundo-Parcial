@author Yannick

class Vertice:
    def __init__(self, nombre):
        self.nombre = nombre
        self.visitado = False
        self.nivel = -1
        self.vecinos = []

    def agrega_vecino(self, v):
        if v not in self.vecinos:
            self.vecinos.append(v)


class Grafica:
    def __init__(self):
        self.vertices = {}

    def agrega_vertice(self, v):
        if v.nombre not in self.vertices:
            self.vertices[v.nombre] = v

    def agrega_arista(self, a, b):
        if a.nombre in self.vertices and b.nombre in self.vertices:
            self.vertices[a.nombre].agrega_vecino(b.nombre)
            self.vertices[b.nombre].agrega_vecino(a.nombre)


def main():
    grafica = Grafica()

    # Agrega vértices
    for i in range(7):
        v = Vertice(i)
        grafica.agrega_vertice(v)

    # Agrega aristas
    aristas = [(2, 0), (0, 6), (6, 3), (0, 5), (6, 5), (0, 1), (6, 4), (1, 4)]
    for a, b in aristas:
        grafica.agrega_arista(grafica.vertices[a], grafica.vertices[b])

    # Imprime información de vértices y vecinos
    for v_nombre, v_objeto in grafica.vertices.items():
        print(f"Vértice {v_nombre} - Vecinos: {v_objeto.vecinos}")


if __name__ == "__main__":
    main()
