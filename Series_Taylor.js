 document.getElementById('calculator-form').addEventListener('submit', function(event) {
            event.preventDefault();

            const x = parseFloat(document.getElementById('x').value);
            const n = parseInt(document.getElementById('n').value);

            const result = calculateTaylorSeries(x, n);
            document.getElementById('result').textContent = `El resultado de la serie de Taylor es: ${result}`;
        });

        function calculateTaylorSeries(x, n) {
            let result = 0.0;

            for (let i = 0; i < n; i++) {
                result += power(x, i) / factorial(i);
            }

            return result;
        }

        function power(base, exponent) {
            return Math.pow(base, exponent);
        }

        function factorial(n) {
            if (n === 0 || n === 1) {
                return 1;
            }

            let result = 1;
            for (let i = 2; i <= n; i++) {
                result *= i;
            }

            return result;
        }