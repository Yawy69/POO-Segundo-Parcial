@author Yannick

def binaria(lista, x):
    if len(lista) <= 0:
        return "Número no encontrado"
    
    m = len(lista) // 2
    if lista[m] == x:
        return f"¡Número {x} encontrado en la posición {m}!"
    elif x < lista[m]:
        return binaria(lista[:m], x)
    else:
        return binaria(lista[m+1:], x)

# Ejemplo de uso
mi_lista = [1, 2, 3, 4, 5, 6, 7]
numero_buscado = 2

resultado = binaria(mi_lista, numero_buscado)
print(resultado)

