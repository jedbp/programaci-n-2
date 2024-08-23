nombre = imput("Escriba su nombre: \n")
apellido = imput("Escriba su apellido: \n")
edad = int(imput("Indique su edad: \n"))
sexo = int(imput("Indique su genero mediante los numeros:\n1 para el masculino. \n2 para el femenino"))

if edad > 0 and edad <= 17:
    print("Es usted menor de edad.")
else:
    print("Es usted mayor de edad.")

if sexo > 0 and sexo <= 2:
    if sexo == 1:
        print("Es usted un Hombre.")
    else:
        print("Es usted una mujer.")
else:
    print("Usted no a indicado su genero")            