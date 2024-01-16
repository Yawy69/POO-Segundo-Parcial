@author Yannick

import random

def quick_sort(arr):
    # Caso base: la lista ya está ordenada si tiene 0 o 1 elementos
    if len(arr) <= 1:
        return arr

    # Elegir un pivote de forma aleatoria
    pivot = random.choice(arr)

    # Crear dos sublistas vacías
    left = []
    right = []

    # Recorrer la lista y clasificar los elementos en las sublistas
    for element in arr:
        if element <= pivot:
            left.append(element)
        else:
            right.append(element)

    # Llamada recursiva para ordenar las sublistas
    sorted_left = quick_sort(left)
    sorted_right = quick_sort(right)

    # Combinar las sublistas ordenadas con el pivote
    return sorted_left + [pivot] + sorted_right

# Lista de ejemplo
unsorted_list = [38, 27, 43, 3, 9, 82, 10]

# Imprimir la lista desordenada
print("Lista desordenada:", unsorted_list)

# Llamar a la función quick_sort para ordenar la lista
sorted_list = quick_sort(unsorted_list)

# Imprimir la lista ordenada
print("Lista ordenada:", sorted_list)
