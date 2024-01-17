# Ejercicio: Sistema de Café Decorado

Supón que estás desarrollando un sistema para una cafetería que ofrece diferentes tipos de café. Cada tipo de café tiene un costo base, pero los clientes pueden agregar ingredientes adicionales para personalizar su bebida. Implementa el patrón Decorator para permitir la personalización dinámica de las bebidas sin modificar directamente las clases de café existentes.

1. Define una interfaz Cafe que tenga un método para obtener el costo total de la bebida.
2. Crea una clase concreta llamada CafeNormal que implemente la interfaz Cafe. Esta clase representará un café simple sin ingredientes adicionales.
3. Crea clases concretas adicionales para cada tipo de ingrediente adicional, como LecheDecorator, AzucarDecorator, etc., que también implementen la interfaz Cafe.
4. Implementa el patrón Decorator de manera que las clases de ingredientes adicionales puedan envolver objetos Cafe existentes, agregando su costo al total.

Escribe un programa de ejemplo que demuestre cómo se pueden combinar diferentes ingredientes para crear variaciones personalizadas de café con sus respectivos costos.
