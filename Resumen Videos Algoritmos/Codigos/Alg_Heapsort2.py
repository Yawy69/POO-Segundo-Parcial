@author Yannick

def hippie_fai(lista, nodo):
    n = len(lista)
    
    # Verificar si el nodo tiene dos hijos
    if 2 * nodo + 2 < n:
        # Obtener el índice del hijo menor
        hijo_menor = 2 * nodo + 1 if lista[2 * nodo + 1] < lista[2 * nodo + 2] else 2 * nodo + 2

        # Intercambiar si el hijo menor es menor que el nodo padre
        if lista[hijo_menor] < lista[nodo]:
            lista[nodo], lista[hijo_menor] = lista[hijo_menor], lista[nodo]

            # Aplicar recursivamente a partir del nodo intercambiado
            hippie_fai(lista, hijo_menor)

    # Verificar si el nodo tiene un hijo
    elif 2 * nodo + 1 < n:
        # Intercambiar si el hijo es menor que el nodo padre
        if lista[2 * nodo + 1] < lista[nodo]:
            lista[nodo], lista[2 * nodo + 1] = lista[2 * nodo + 1], lista[nodo]

            # Aplicar recursivamente a partir del nodo intercambiado
            hippie_fai(lista, 2 * nodo + 1)

def heap_sort(lista):
    # Inicializar lista final
    l2 = []

    # Aplicar hippie_fai desde la mitad de la lista hasta el inicio
    for y in range(len(lista)//2 - 1, -1, -1):
        hippie_fai(lista, y)

    # Iterar desde 0 hasta la longitud de la lista - 1
    for y in range(len(lista)):
        # Intercambiar primer elemento con el último
        lista[0], lista[len(lista) - 1 - y] = lista[len(lista) - 1 - y], lista[0]

        # Agregar el menor elemento al final de la lista final
        l2.append(lista.pop())

        # Aplicar hippie_fai a la lista desde el nodo 0
        hippie_fai(lista, 0)

    return l2

# Ejemplo de uso
lista_desordenada = [9, 4, 7, 1, 2, 8, 6]
print("Lista Desordenada:", lista_desordenada)

# Aplicar Heap Sort
lista_ordenada = heap_sort(lista_desordenada)
print("Lista Ordenada:", lista_ordenada)

