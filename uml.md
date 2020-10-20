# UML

- [Diagrama de clases](#Diagrama-de-clases)
- [Simbolo Herencia](#Simbolo-Herencia)
- [Simbolo Asociacion](#Simbolo-Asociacion)
- [Simbolo Dependencia](#Simbolo-Dependencia)
- [Simbolo Agregacion](#Simbolo-Agregacion)
- [Simbolo Composicion](#Simbolo-Composicion)

## Diagrama de clases

![Image](./images/diagrama_clases.png)

## Simbolo Herencia

![image](./images/simbolo_herencia.png)

## Simbolo Asociacion

![image](./images/simbolo_asociacion.png)

La clase Empleado conoce a la clase Equipo, pero la clase Equipo desconoce a la clase Empleado. La clase Equipo esta como atributo.

## Simbolo Dependencia

![imagen](./images/simbolo_dependencia.png)

La clase Impresora conoce a la clase Archivo, sin embargo la clase Archivo desconoce la clase Impresora. La clase Archivo se presenta en el metodo no en atributos.

## Simbolo Agregacion

![iamgen](./images/simbolo_agregacion.png)

Si se elimina la clase empresa el cliente sigue existiendo.

## Simbolo Composicion

![imagen](./images/simbolo_composicion.png)

Si borramos la clase Empresa la clase Empleado tambien se elimina.
