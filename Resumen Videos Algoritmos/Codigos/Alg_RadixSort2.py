@author Yannick

def radix_sort(lista):
    # Determinar el valor de 'n'
    n = max(len(str(num)) for num in lista)

    # Normalizar dígitos
    lista = [str(num).zfill(n) for num in lista]

    for j in range(n - 1, -1, -1):
        # Crear grupos
        grupos = [[] for _ in range(10)]

        # Asignar números a grupos según el dígito actual
        for num in lista:
            grupos[int(num[j])].append(num)

        # Vaciar y recargar la lista principal
        lista = [num for grupo in grupos for num in grupo]

    # Convertir la lista final a enteros y retornar
    return [int(num) for num in lista]

# Ejemplo de uso
lista_ejemplo = [123, 25, 10, 456, 789, 1, 0, 987, 321, 654]
resultado = radix_sort(lista_ejemplo)

print("Lista original:", lista_ejemplo)
print("Lista ordenada:", resultado)
