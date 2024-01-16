@author Yannick

class HashTable:
    def __init__(self, size):
        self.size = size
        self.table = [[] for _ in range(size)]

    def comcafe_hash(self, cadena):
        # Función hash simple que convierte la cadena en un número
        return hash(cadena) % self.size

    def agregar(self, cadena):
        # Agrega la cadena a la tabla utilizando la función hash
        index = self.comcafe_hash(cadena)
        self.table[index].append(cadena)

    def buscar(self, cadena):
        # Busca la cadena en la tabla utilizando la función hash
        index = self.comcafe_hash(cadena)
        return cadena in self.table[index]

# Ejemplo de uso
tabla_hash = HashTable(19)

# Agregar elementos a la tabla
elementos = ["borrador", "impresora", "plumón", "pizarrón", "pluma", "cuadernos"]
for elemento in elementos:
    tabla_hash.agregar(elemento)

# Imprimir la tabla hash
print("Tabla Hash:", tabla_hash.table)

# Realizar búsquedas
busqueda_pluma = tabla_hash.buscar("pluma")
busqueda_libro = tabla_hash.buscar("libro")

# Mostrar resultados de las búsquedas
print("¿'pluma' está en la tabla? ", busqueda_pluma)
print("¿'libro' está en la tabla? ", busqueda_libro)


