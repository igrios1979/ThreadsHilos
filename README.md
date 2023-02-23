# ThreadsHilos
# Hilos y concurrencia en JAva 
# 257 Intro Hilos
# 258 Creando hilos heredados de Thread
# 259 Creando hilos desde la interface runnable
# 260 Implementacion con funciones lambda y clase ananima 
# 261 Metodo join() vs Sleep 
# 262 usando el Syncronized 
###    wait y notify tiene que estar siempre en un metodo Synchonizado de lo contrario no se
###    pueden usar

# 263 Metodos notify() and wait() Productor y consumidor.
# 264 Metodos notify() and wait() Productor y consumidor.
# 265 Ejemplo de sincronizacion Productor consumidor
# 266 usando Timer y TimerTask para agendar tareas programadas
# 267 Agendando tareas programadas que se repiten cada cierto periodo de tiempo
 ## AtomicInteger -> uso de esta clase y su metodo de obtener y decrementar 
 ## Toolkit beep
# 268 Executor Framework --> Single thread Executor
# 269 Executor Framework --> Future
# 270 Executor Framework --> Fixed Thread Pool
# 271 Executor Framework --> Personalizando parametros del pool con ThreadPoolExecutor
# 272 Executor Framework --> tarea Programada con ScheduledExecutorService
# 273 Executor Framework --> tarea Programada Cada cierto periodo
 
Tarea:-> Hilo alfanumerico

Para la tarea se pide implementar una clase llamada AlfanumericoTarea que implemente la interface Runnable y tenga como atributo un enum llamado Tipo.

El enum Tipo tiene dos elementos NUMERO Y LETRA.

Si el tipo es NUMERO, mostrara los números del 1 al 10, excluyente el último.

Si el tipo es LETRA, mostrar las letras de la 'A' a la 'Z', inclusivo el último.

Crea un par de hilos de diferentes tipos y ejecutarlos


