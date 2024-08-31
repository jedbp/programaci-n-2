class Persona:
    def __init__(self, nombre: str, apellido: str, direccion: str, telefono: str, edad: int, email: str):
        self._nombre = nombre
        self._apellido = apellido
        self._direccion = direccion
        self._telefono = telefono
        self._edad = edad
        self._email = email

    
    def get_nombre(self):
        return self._nombre

    def get_apellido(self):
        return self._apellido

    def get_direccion(self):
        return self._direccion

    def get_telefono(self):
        return self._telefono

    def get_edad(self):
        return self._edad

    def get_email(self):
        return self._email

    
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_apellido(self, apellido):
        self._apellido = apellido

    def set_direccion(self, direccion):
        self._direccion = direccion

    def set_telefono(self, telefono):
        self._telefono = telefono

    def set_edad(self, edad):
        self._edad = edad

    def set_email(self, email):
        self._email = email


class Empleado(Persona):
    def __init__(self, nombre: str, apellido: str, direccion: str, telefono: str, edad: int, email: str, salario: float, jefe_inmediato: str, años_experiencia: int):
        super().__init__(nombre, apellido, direccion, telefono, edad, email)
        self._salario = salario
        self._jefe_inmediato = jefe_inmediato
        self._años_experiencia = años_experiencia
        self._nombre_cargo = self.calcular_cargo()

    
    def get_salario(self):
        return self._salario

    def get_jefe_inmediato(self):
        return self._jefe_inmediato

    def get_años_experiencia(self):
        return self._años_experiencia

    def get_nombre_cargo(self):
        return self._nombre_cargo

    
    def set_salario(self, salario):
        self._salario = salario
        self._nombre_cargo = self.calcular_cargo()

    def set_jefe_inmediato(self, jefe_inmediato):
        self._jefe_inmediato = jefe_inmediato

    def set_años_experiencia(self, años_experiencia):
        self._años_experiencia = años_experiencia
        self._nombre_cargo = self.calcular_cargo()

    def calcular_cargo(self):
        if self._salario >= 5000000 and self._años_experiencia >= 5 and 25 <= self._edad <= 45:
            return "Senior"
        elif 900000 <= self._salario <= 1200000 and 1 <= self._años_experiencia <= 2 and 18 <= self._edad <= 22:
            return "Junior"
        else:
            return "Sin cargo específico"


def main():
    nombre = input("Ingrese el nombre: ")
    apellido = input("Ingrese el apellido: ")
    direccion = input("Ingrese la dirección: ")
    telefono = input("Ingrese el teléfono: ")
    edad = int(input("Ingrese la edad: "))
    email = input("Ingrese el email: ")
    salario = float(input("Ingrese el salario: "))
    jefe_inmediato = input("Ingrese el jefe inmediato: ")
    años_experiencia = int(input("Ingrese los años de experiencia: "))

    empleado = Empleado(nombre, apellido, direccion, telefono, edad, email, salario, jefe_inmediato, años_experiencia)

    print("\nDetalles del Empleado:")
    print(f"Nombre: {empleado.get_nombre()}")
    print(f"Apellido: {empleado.get_apellido()}")
    print(f"Dirección: {empleado.get_direccion()}")
    print(f"Teléfono: {empleado.get_telefono()}")
    print(f"Edad: {empleado.get_edad()}")
    print(f"Email: {empleado.get_email()}")
    print(f"Salario: {empleado.get_salario()}")
    print(f"Jefe Inmediato: {empleado.get_jefe_inmediato()}")
    print(f"Años de Experiencia: {empleado.get_años_experiencia()}")
    print(f"Cargo: {empleado.get_nombre_cargo()}")

if __name__ == "__main__":
    main()
