function calcularErrores(event) {
  event.preventDefault(); // Evita que se envíe el formulario y se recargue la página

  const valorReal = parseFloat(document.getElementById('valorReal').value);
  const valorAproximado = parseFloat(document.getElementById('valorAproximado').value);

  const valorAbsoluto = Math.abs(valorReal - valorAproximado);
  const valorRelativo = valorAbsoluto / valorReal;

  const resultadoElement = document.getElementById('erroresResultado');
  resultadoElement.innerHTML = `
    <p>Valor absoluto: ${valorAbsoluto}</p>
    <p>Valor relativo: ${valorRelativo}</p>`;
}