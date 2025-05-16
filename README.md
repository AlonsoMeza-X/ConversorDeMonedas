# 💱 Conversor de Monedas en Java

Este es un proyecto Java que permite consultar tipos de cambio de monedas en tiempo real y realizar conversiones entre distintas divisas utilizando la API de [fastFOREX](https://www.fastforex.io).

## 🚀 Funcionalidades

- ✅ Consulta en tiempo real de tasas de cambio.
- ✅ Conversión de montos entre dos monedas específicas.
- ✅ Listado de monedas disponibles.
- ✅ Interfaz de consola simple y amigable.
- ✅ Uso del patrón Singleton para el escáner de entrada.

## 📦 Estructura del Proyecto

```plaintext
src/
├── controller/
│   └── Menu.java
├── model/
│   └── TipoDeCambio.java
├── repository/
│   └── ConsultaBaseDeDato.java
├── service/
│   └── LogicaTipoDeCambio.java
├── ScannerSingleton/
│   └── ScannerSingleton.java
└── controller/
    └── ApiTipoDeCambio.java
```

## 🛠️ Requisitos

- Java 17 o superior.
- Conexión a internet (para consumir la API).

**Dependencias externas:**

- [Gson](https://github.com/google/gson) (para parsear respuestas JSON).

---

## 🔐 API Key

Debes tener una clave de API válida de [fastforex.io](https://www.fastforex.io).

### Cómo obtenerla:

1. Regístrate en la plataforma.
2. Obtén tu clave gratuita de prueba desde el panel.
3. Reemplaza la constante `API_KEY` en `ConsultaBaseDeDato.java` con tu clave:

```java
private static final String API_KEY = "TU_API_KEY_AQUI";
```

## 🧪 Ejecución

Puedes ejecutar el programa desde tu IDE favorito o por terminal:

```bash
javac controller/ApiTipoDeCambio.java
java controller.ApiTipoDeCambio
```

## 🧮 Ejemplo de Uso

1. Selecciona la opción **1** para ver las monedas disponibles.
2. Selecciona la opción **2** para convertir una cantidad de una moneda a otra.
3. Escribe los códigos de moneda (por ejemplo: `USD`, `CLP`, `EUR`) y el monto.

---

## 📌 Notas

- Asegúrate de ingresar los códigos de moneda en formato de **3 letras**.
- El programa valida que la entrada cumpla este requisito.
- Se usa `ScannerSingleton` para evitar múltiples instancias del escáner de entrada.

---

## 📄 Licencia

Este proyecto es de uso libre para fines educativos o personales.

---

## 👨‍💻 Desarrollado con ❤️ en Java.
