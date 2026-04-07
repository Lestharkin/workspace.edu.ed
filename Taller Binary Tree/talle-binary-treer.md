# Taller árboles binarios

A partir de la información contenida en el archivo books.json, desarrolle un programa que implemente un árbol binario para el almacenamiento de los datos bibliográficos. Tras completar la carga de los datos en dicha estructura, proporcione el fragmento de código correspondiente y responda formalmente a las siguientes cuestiones:

## 1. Determine el grado del árbol resultante

```java
  // Su código aquí
```

## 2. Establezca la altura del árbol

```java
  // Su código aquí
```

## 3. Especifique el tamaño del árbol

```java
  // Su código aquí
```

## 4. Calcule la Longitud de Camino Interno (LCI) del árbol

```java
  // Su código aquí
```

## 5. Calcule la Longitud de Camino Interno Media (LCIM) del árbol

```java
  // Su código aquí
```

## 6. ¿Es el árbol de tipo completo?

```java
  // Su código aquí
```

## 7. ¿Es el árbol de tipo lleno?

```java
  // Su código aquí
```

## 8. Indique el número total de niveles del árbol

```java
  // Su código aquí
```

## 9. Indique el número total de niveles del árbol

```java
  // Su código aquí
```

## 10. Presente el resultado del recorrido en profundidad en preOrden

```java
  // Su código aquí
```

## 11. Presente el resultado del recorrido en profundidad en inOrden

```java
  // Su código aquí
```

## 12. Presente el resultado del recorrido en profundidad en postOrden

```java
  // Su código aquí
```

## 13. Presente el resultado del recorrido en anchura

```java
1 public List<E> levelOrder() {
2   List<E> result = (LinkedList<E>) factory.getCollection(CollectionType.SINGLY_LINKED_LIST);
3   Queue<Root<E>> queue = (Queue<Root<E>>) factory.getCollection(CollectionType.LIST_QUEUE);
4   queue.add(root);
5   Root<E> current;
6   while (!queue.isEmpty()) {
7    current = queue.remove();
8    result.add(current.get());
9    if (current.getLeft() != null) {
10      queue.add(current.getLeft());
11    }
12    if (current.getRight() != null) {
13      queue.add(current.getRight());
14    }
15  }
16  return result;
17 }
```

### Recorrido en Anchura

El recorrido en anchura (también conocido como BFS - Breadth-First Search) es una técnica de traversal que explora el árbol nivel por nivel, de izquierda a derecha. Utiliza una cola (queue) para mantener el orden de visita de los nodos. Este método es útil para encontrar el nodo más cercano a la raíz o para recorrer todos los nodos de un nivel antes de pasar al siguiente. En el código proporcionado, se inicia agregando la raíz del árbol a la cola y luego se procesa cada nodo, agregando sus hijos a la cola hasta que se hayan visitado todos los nodos del árbol.

En la función se utilizando dos estructura auxiliares, una lista (línea 2) para almacenar el resultado del recorrido y una cola para gestionar los nodos a visitar. La lista se obtiene a través de una fábrica de colecciones...

...

## 14. Ejecute la búsqueda del título "The Pragmatic Programmer: Your Journey To Mastery" empleando todos los recorridos del árbol. Cuantifique el número de pasos realizados y el tiempo de ejecución requerido para localizar el ejemplar en cada recorrido

```java
  // Su código aquí
```

## 15. Implemente una lista simplemente enlazada para realizar la misma búsqueda. Cuantifique el número de pasos realizados y el tiempo de ejecución requerido para localizar el ejemplar en cada recorrido

```java
  // Su código aquí
```

## 16. Elabore una tabla comparativa que incluya las conclusiones derivadas de los resultados obtenidos

| Estructura    | Recorrido  | Número de pasos | tiempo de ejecución |
| ------------- | ---------- | --------------- | ------------------- |
| Lista         | secuencial | f(x)            | f(t)                |
| Árbol binario | inorden    | f(x)            | f(t)                |
| Árbol binario | preorden   | f(x)            | f(t)                |
| Árbol binario | postorden  | f(x)            | f(t)                |
| Árbol binario | nivel      | f(x)            | f(t)                |
