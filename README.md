# Proyecto Terminal de Buses
## *Logica
Para gestionar la terminal de transportes cree una estructura basica dividida en las carpetas /controller, /model y /repository.
Estas contienen otras carpetas como models que se encuentra dentro de repository donde estan las distintas clases necesarias
para este aplicacion (Destino, Pasajero, Viaje, BusGrande y BusPequeno).
En las clases con anotacion @Repository se instancian en un principio 3 objetos de tipo Bus usando aplicando polimorfismo para crear Buses Grandes, 6 objetos de tipo Pasajero que se guardan en una lista, 3 objetos de tipo Destino .
Ahora bien la clase mas relevante es la Clase Viaje que nos sirve para registrar los viajes que se realizan. Para esta clase
cuando se desea crear un nuevo viaje se le deben pasar un id del viaje, la fecha y hora, un Objeto Bus con la informacion del bus(placa, empresa, capacidad), un objeto Destino que contiene(id, nombre, distancia) y una lista de pasajeros que se registraron en este viaje(Para este caso el listado de pasajeros sera el instanciado anteriormente en el Repository).

### *Importante:
Para la peticion POST al crear un viaje se le entrega solamente la placa del bus y el id del destino de la siguiente manera
http://localhost:3000/viajes/B1/1  donde B1 es la placa del bus y 1 el id dl destino.
Si el viaje se crea de manera correcta la capacidad del bus se disminuye.

## Servicios Implementados
A continuacion se pueden copiar y probar usando postman los siguientes endpoints:
- Listar los Destinos Disponibles (GET)
  *http://localhost:3000/destinos/list
- Agregar un Nuevo Destino (POST)
  *http://localhost:3000/destinos/crear
  {
  "id": "4",
  "nombre": "Cali",
  "distancia": 210.0
  }
- Listar los Buses Disponibles (GET)
  *http://localhost:3000/buses/list
- Agregar un Nuevo Bus (POST)
  *http://localhost:3000/buses/crear
  {
  "placa": "B4",
  "empresa": "Colectivos del cafe",
  "capacidad": 8
  }
- Listar los Pasajeros  (GET)
  *http://localhost:3000/pasajeros/list
- Agregar un Nuevo Pasajero (POST)
  *http://localhost:3000/pasajeros/crear
  {
  "id": 7,
  "name": "Emiliano"
  }
- Listar los Viajes Que se han Registrado  (GET)
  *http://localhost:3000/viajes/list
- Agregar un Nuevo Viaje (POST)
  *http://localhost:3000/viajes/B1/1  
  B1 es la placa del bus y id hace referencia al id del destino.
  Con la placa del bus verifico que el bus tenga la capacidad de asientos para llevar a los pasajeros que tengo en la lista. Si el bus no cuenta con la capacidad entonces el viaje no se crea.
  Si el viaje se crea de manera correcta se debe visualizar de la siguiente manera en postman:
  

- {
  "id": "881b29ad-e4af-43fe-9b78-943e58770b28",

- "date": "Fri Feb 03 14:06:39 COT 2023",

- "bus": {
 "placa": "B3",
 "empresa": "Velotax",
 "capacidad": 1
 },
- "destino": {
  "id": "1",
  "nombre": "Medellin",
  "distancia": 230.0
  },
-  "pasajeros": [
  {
  "id": 1,
  "name": "Juan"
  },
  {
  "id": 2,
  "name": "Alejandra"
  },
  {
  "id": 3,
  "name": "Julian"
  },
  {
  "id": 4,
  "name": "Mariana"
  },
  {
  "id": 5,
  "name": "Valeria"
  },
  {
  "id": 6,
  "name": "Stiven"
  },
  {
  "id": 7,
  "name": "Emiliano"
  }
  ]
  }