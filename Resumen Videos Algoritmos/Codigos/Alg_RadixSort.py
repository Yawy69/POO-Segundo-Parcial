@author Yannick

def radix_sort(lista):
    # Encontrar el número de dígitos del número más grande
    max_num = max(lista)
    num_digits = len(str(max_num))

    # Aplicar el algoritmo Radix Sort
    for i in range(num_digits):
        # Crear listas para cada dígito (0-9)
        buckets = [[] for _ in range(10)]

        # Organizar los elementos en los buckets según el dígito actual
        for num in lista:
            digit = (num // 10**i) % 10
            buckets[digit].append(num)

        # Reconstruir la lista con los elementos ordenados por el dígito actual
        lista = [elemento for bucket in buckets for elemento in bucket]

    return lista

# Ejemplo de uso
numeros_desordenados = [115, 102, 149, 58, 16, 3]
numeros_ordenados = radix_sort(numeros_desordenados)
print("Lista ordenada:", numeros_ordenados)
