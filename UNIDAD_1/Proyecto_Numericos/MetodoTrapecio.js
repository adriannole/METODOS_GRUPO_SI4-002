 document.getElementById('integral-form').addEventListener('submit', function(event) {
            event.preventDefault();
            
            const funcion = document.getElementById('funcion').value;
            const limiteInferior = parseFloat(document.getElementById('limite-inferior').value);
            const limiteSuperior = parseFloat(document.getElementById('limite-superior').value);
            const numTrapecios = parseInt(document.getElementById('num-trapecios').value);
            
            const h = (limiteSuperior - limiteInferior) / numTrapecios;
            let integral = 0.0;
            const expression = math.compile(funcion);
            
            for (let i = 0; i < numTrapecios; i++) {
                const x0 = limiteInferior + i * h;
                const x1 = x0 + h;
                const y0 = expression.evaluate({ x: x0 });
                const y1 = expression.evaluate({ x: x1 });
                integral += (y0 + y1) / 2.0 * h;
            }
            
            document.getElementById('resultado').textContent = `Resultado de la integral: ${integral}`;
        });