function functionBolzano(x) {
    // Define la función para la cual deseas encontrar el cero
    return x * x - 4;
  }
  
  function encontrarCeroBolzano(a, b, epsilon) {
    if (functionBolzano(a) * functionBolzano(b) > 0) {
      return null;
    }
  
    let c;
    do {
      c = (a + b) / 2; // Calcula el punto medio del intervalo
      if (functionBolzano(c) === 0) {
        break; // Se encontró el cero exacto
      } else if (functionBolzano(a) * functionBolzano(c) < 0) {
        b = c; // El cero se encuentra en el intervalo [a, c]
      } else {
        a = c; // El cero se encuentra en el intervalo [c, b]
      }
    } while (Math.abs(functionBolzano(c)) > epsilon);
  
    return c;
  }
  
  function ejecutarProgramaBolzano() {
    const a = parseFloat(prompt("Ingrese el extremo izquierdo del intervalo:"));
    const b = parseFloat(prompt("Ingrese el extremo derecho del intervalo:"));
    const epsilon = parseFloat(prompt("Ingrese la tolerancia para la aproximación del cero:"));
  
    const ceroAproximado = encontrarCeroBolzano(a, b, epsilon);
    const resultadoElement = document.getElementById('resultado');
    if (ceroAproximado !== null) {
      resultadoElement.textContent = "El cero aproximado es: " + ceroAproximado;
    } else {
      resultadoElement.textContent = "No se puede aplicar el teorema de Bolzano en el intervalo [" + a + ", " + b + "]";
    }
  }