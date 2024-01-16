@author Yannick

def busqueda_lineal(lista, elemento):
    for item in lista:
        if item == elemento:
            return True
    return False

# Ejemplo de uso
mi_lista = [12, 34, 25, 32]
elemento_buscado = 25

resultado = busqueda_lineal(mi_lista, elemento_buscado)

print(f"¿El elemento {elemento_buscado} está en la lista? {resultado}")
