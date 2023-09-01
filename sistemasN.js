function convertir() {
  const opcion = document.getElementById('opcion').value;
  const valor = document.getElementById('valor').value;
  let resultado;

  if (opcion === 'binarioDecimal') {
    resultado = parseInt(valor, 2);
    document.getElementById('conversionResultado').innerText = `Resultado: ${valor} (base 2) => ${resultado} (base 10)`;
  } else if (opcion === 'decimalBinario') {
    const decimal = parseFloat(valor);
    resultado = decimal.toString(2);
    document.getElementById('conversionResultado').innerText = `Resultado: ${valor} (base 10) => ${resultado} (base 2)`;
  } else if (opcion === 'octalDecimal') {
    resultado = parseInt(valor, 8);
    document.getElementById('conversionResultado').innerText = `Resultado: ${valor} (base 8) => ${resultado} (base 10)`;
  } else if (opcion === 'decimalHexadecimal') {
    const decimal = parseInt(valor);
    resultado = decimal.toString(16).toUpperCase();
    document.getElementById('conversionResultado').innerText = `Resultado: ${valor} (base 10) => ${resultado} (base 16)`;
  } else if (opcion === 'hexadecimalDecimal') {
    resultado = parseInt(valor, 16);
    document.getElementById('conversionResultado').innerText = `Resultado: ${valor} (base 16) => ${resultado} (base 10)`;
  }
}