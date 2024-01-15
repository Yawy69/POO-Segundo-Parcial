@author Yannick

class Persona:
    def__init__(self,nombre,edad):
        self.nombre=nombre
        self.edad=edad
        
    def mostrar(self):
        print(f"Nombre: {self.nombre}"), 
        print(f"edad: {self.edad}")
        
class Estudiante(Persona):
    def__init__(self,nombre,edad,grado):
        super().__init__(nombre,edad)
        self.grado=grado
        
    def mostrar_grado(self):
        print(f"Grado: {self.grado}")
        

estudiante=Estudiante("Juan","24","10mo")
estudiante.mostrar_datos()
estudiante.mostrar_grado()
