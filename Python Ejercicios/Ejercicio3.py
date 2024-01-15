@author Yannick

class Personaje:
    def __init__(self,nombre,fuerza,velocidad):
        self.nombre=nombre
        self.fuerza=fuerza
        self.velocidad=velocidad
    
    def__repr__(self):
        return f"Personaje({self.nombre}, {self.fuerza}, {self.velocidad})"
    
    def __add__(self,otro_pj):
        nuevo_nombre=self.nombre+"-"+otro_pj.nombre
        nuevo_fuerza=roud(((self.fuerza+otro_pj.fuerza)/2)**1.5)
        nuevo_velocidad=roud(((self.velocidad+"-"+otro_pj.velocidad)/2)**1.5)
        return Personaje(nuevo_fuerza, nuevo_velocidad)
    
gk=Personaje("gk",99,99)
vg=Personaje("gk",100,100)
gh=Personaje("gk",150,150)

ggt=gk+vg
ght=ggt+gh

print(ggt)
print(ght)
print(gk)
print(vg)
print(gh)
