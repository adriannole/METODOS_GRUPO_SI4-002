function ejecutarPrograma() {
    const ecuacion = prompt("Ingrese la ecuación en función de x para el cálculo por método de Bisección:");
    const limiteInferior = parseFloat(prompt("Ingrese el límite inferior del intervalo:"));
    const limiteSuperior = parseFloat(prompt("Ingrese el límite superior del intervalo:"));
    const tolerancia = 0.0001;

    const resultado = valorRaices(ecuacion, limiteInferior, limiteSuperior, tolerancia);
    document.getElementById('resultado').textContent = "El resultado es: " + resultado;
}

function valorRaices(ecuacion, limiteInferior, limiteSuperior, tolerancia) {
    let raiz = 0.0;
    let valorMedio = (limiteInferior + limiteSuperior) / 2;

    while (Math.abs(evaluarEcuacion(ecuacion, valorMedio)) > tolerancia) {
        if (evaluarEcuacion(ecuacion, limiteInferior) * evaluarEcuacion(ecuacion, valorMedio) < 0) {
            limiteSuperior = valorMedio;
        } else {
            limiteInferior = valorMedio;
        }

        valorMedio = (limiteInferior + limiteSuperior) / 2;
    }

    raiz = valorMedio;
    return raiz;
}

function evaluarEcuacion(ecuacion, x) {
    return 0.0; // Implementa la evaluación de la ecuación en JavaScript
}

document.getElementById('ejecutarBtn').addEventListener('click', ejecutarPrograma);