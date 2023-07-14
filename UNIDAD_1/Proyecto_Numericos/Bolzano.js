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
  const a = parseFloat(document.getElementById("a").value);
  const b = parseFloat(document.getElementById("b").value);
  const epsilon = parseFloat(document.getElementById("epsilon").value);

  const ceroAproximado = encontrarCeroBolzano(a, b, epsilon);
  const resultadoElement = document.getElementById('Bolzanoresultado');
  if (ceroAproximado !== null) {
    resultadoElement.textContent = "El cero aproximado es: " + ceroAproximado;

    const ctx = document.getElementById('Bolzanografico').getContext('2d');
    new Chart(ctx, {
      type: 'line',
      data: {
        labels: [a, ceroAproximado, b],
        datasets: [{
          label: 'Función de Bolzano',
          data: [functionBolzano(a), 0, functionBolzano(b)],
          fill: false,
          borderColor: 'rgb(75, 192, 192)',
          tension: 0.1
        }]
      },
      options: {
        scales: {
          x: {
            title: {
              display: true,
              text: 'Intervalo'
            }
          },
          y: {
            title: {
              display: true,
              text: 'Valor de la función'
            }
          }
        }
      }
    });
  } else {
    resultadoElement.textContent = "No se puede aplicar el teorema de Bolzano en el intervalo [" + a + ", " + b + "]";
  }
}
