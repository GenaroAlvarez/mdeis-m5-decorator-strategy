# Katas del Patrón Decorador

## Integrante
- Ing. Alvarez Orias Genaro Mauricio - Grupo 3

## Kata 7: Generación de Reportes

### Problema
Crea un sistema para generar reportes con decoradores que agreguen encabezados, pies de página y marcas de agua.

### Instrucciones
1. Crea una interfaz `Report` con un método `generate()`.
2. Implementa una clase `BasicReport`.
3. Crea decoradores como `HeaderDecorator`, `FooterDecorator` y `WatermarkDecorator`.
4. Combina decoradores para generar reportes con múltiples elementos.

### Salida Esperada

```plaintext
Encabezado: Reporte Anual  
Contenido: Datos del reporte  
Pie de página: Página 1  
Marca de agua: Confidencial
```

---

## Kata 9: Decoración de Habitaciones

### Problema
Crea un sistema para decorar habitaciones con elementos como cortinas, alfombras y cuadros.

### Instrucciones
1. Crea una interfaz `Room` con un método `decorate()`.
2. Implementa una clase `BasicRoom`.
3. Crea decoradores como `CurtainsDecorator`, `RugDecorator` y `PaintingDecorator`.
4. Combina decoradores para decorar una habitación con múltiples elementos.

### Salida Esperada

```plaintext
Habitación básica con cortinas, alfombra y cuadros
```