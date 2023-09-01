function f(x) {
    return (x**2 + 3) * Math.sin(x / 2); // Use ** for exponentiation
}

function simpson(a, b, n) {
    let h, x = [], sum = 0;
    h = (b - a) / n;

    x[0] = a;

    for (let j = 1; j <= n; j++) {
        x[j] = a + h * j;
    }

    for (let j = 1; j <= n / 2; j++) {
        sum += f(x[2 * j - 2]) + 4 * f(x[2 * j - 1]) + f(x[2 * j]);
    }

    return sum * h / 3;
}

function calculateSimpson() {
    const lowerLimit = parseFloat(document.getElementById("lowerLimit").value);
    const upperLimit = parseFloat(document.getElementById("upperLimit").value);
    const intervalLength = parseInt(document.getElementById("intervalLength").value);

    if (Number.isInteger(intervalLength)) { // Use Number.isInteger to check if it's an integer
        const result = simpson(lowerLimit, upperLimit, intervalLength);
        document.getElementById("result").textContent = `Resultado: ${result}`;
    } else {
        document.getElementById("result").textContent = "n debe ser un valor entero";
    }
}