@author Yannick

import heapq

class Vertice:
    def __init__(self, id, heuristica=0):
        self.id = id
        self.heuristica = heuristica
        self.costo_g = float('inf')
        self.costo_f = float('inf')
        self.padre = None
        self.visitado = False

def distancia_euclidiana(v1, v2):
    # Función de heurística: Distancia Euclidiana entre dos vértices
    return ((v1.x - v2.x)**2 + (v1.y - v2.y)**2)**0.5

def a_estrella(inicial, objetivo):
    inicial.costo_g = 0
    inicial.costo_f = inicial.costo_g + inicial.heuristica

    conjunto_abierto = [inicial]

    while conjunto_abierto:
        actual = min(conjunto_abierto, key=lambda v: v.costo_f)

        if actual == objetivo:
            # Reconstruir el camino si hemos llegado al objetivo
            camino = []
            while actual:
                camino.insert(0, actual.id)
                actual = actual.padre
            return camino

        conjunto_abierto.remove(actual)
        actual.visitado = True

        for vecino in obtener_vecinos(actual):  # Implementa tu propia función para obtener vecinos
            if not vecino.visitado:
                nuevo_costo_g = actual.costo_g + distancia_entre(actual, vecino)
                
                if nuevo_costo_g < vecino.costo_g:
                    vecino.padre = actual
                    vecino.costo_g = nuevo_costo_g
                    vecino.costo_f = vecino.costo_g + vecino.heuristica

                    if vecino not in conjunto_abierto:
                        conjunto_abierto.append(vecino)

    return None  # No se encontró un camino

# Ejemplo de uso
if __name__ == "__main__":
    # Crea vértices y establece conexiones entre ellos
    v1 = Vertice(1, heuristica=distancia_euclidiana(v1, objetivo))
    v2 = Vertice(2, heuristica=distancia_euclidiana(v2, objetivo))
    v3 = Vertice(3, heuristica=distancia_euclidiana(v3, objetivo))
    # ...

    # Establece las conexiones entre los vértices (implementa tu propia lógica)
    establecer_conexiones(v1, v2, distancia_entre(v1, v2))
    establecer_conexiones(v2, v3, distancia_entre(v2, v3))
    # ...

    objetivo = v3  # Define el objetivo

    # Encuentra el camino utilizando A*
    camino = a_estrella(v1, objetivo)

    if camino:
        print("Camino encontrado:", camino)
    else:
        print("No se encontró un camino.")
