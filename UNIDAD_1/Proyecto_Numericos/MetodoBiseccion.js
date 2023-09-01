function ejecutarPrograma() {
    const ecuacion = document.getElementById("ecuacion").value;
    const limiteInferior = parseFloat(document.getElementById("limiteInferior").value);
    const limiteSuperior = parseFloat(document.getElementById("limiteSuperior").value);
    const tolerancia = 0.0001;

    const resultado = valorRaices(ecuacion, limiteInferior, limiteSuperior, tolerancia);
    document.getElementById('Biseccionresultado').textContent = "El resultado es: " + resultado;

    const graficoLabels = generarLabels(limiteInferior, limiteSuperior);
    const graficoData = generarData(ecuacion, graficoLabels);

    mostrarGrafico(graficoLabels, graficoData);
}

function valorRaices(ecuacion, limiteInferior, limiteSuperior, tolerancia) {
    let raiz = 0.0;
    let valorMedio = (limiteInferior + limiteSuperior) / 2;
    let contador = 0; // Agregamos un contador para evitar un ciclo infinito

    while (Math.abs(evaluarEcuacion(ecuacion, valorMedio)) > tolerancia) {
        if (evaluarEcuacion(ecuacion, limiteInferior) * evaluarEcuacion(ecuacion, valorMedio) < 0) {
            limiteSuperior = valorMedio;
        } else {
            limiteInferior = valorMedio;
        }

        valorMedio = (limiteInferior + limiteSuperior) / 2;

        contador++; // Incrementamos el contador en cada iteración

        // Si el contador alcanza un número máximo de iteraciones, salimos del ciclo
        if (contador > 1000) {
            console.log("Error: No se pudo encontrar la raíz en un número razonable de iteraciones.");
            break;
        }
    }

    raiz = valorMedio;
    return raiz;
}
function evaluarEcuacion(ecuacion, x) {
    return eval(ecuacion.replace(/x/g, x)); // Evalúa la ecuación en JavaScript
}

function generarLabels(limiteInferior, limiteSuperior) {
    const labels = [];
    const paso = (limiteSuperior - limiteInferior) / 100; // 100 puntos en el gráfico

    for (let i = 0; i <= 100; i++) {
        const valor = limiteInferior + i * paso;
        labels.push(valor);
    }

    return labels;
}

function generarData(ecuacion, labels) {
    const data = [];

    for (let i = 0; i < labels.length; i++) {
        const valor = evaluarEcuacion(ecuacion, labels[i]);
        data.push(valor);
    }

    return data;
}

function mostrarGrafico(labels, data) {
    const ctx = document.getElementById('Bisecciongrafico').getContext('2d');
    new Chart(ctx, {
        type: 'line',
        data: {
            labels: labels,
            datasets: [{
                label: 'Función',
                data: data,
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
                        text: 'Valor de x'
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
}