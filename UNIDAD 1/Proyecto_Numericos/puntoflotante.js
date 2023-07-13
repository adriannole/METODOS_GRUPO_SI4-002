function ejecutarEjercicio(event) {
  event.preventDefault();
  const seleccion = document.getElementById('seleccion').value;

  let resultado = "";
  if (seleccion === "ejercicio9") {
    const valor = parseFloat(document.getElementById('valor1').value);

    // REPRESENTACION ESTANDAR PUNTO FLOTANTE IEEE 754
    const flotante = Float32Array.from([valor])[0];
    const hex = flotante.toString(16);
    const binary = flotante.toString(2);

    resultado = `
      <p>Valor ${valor} en IEEE 754 hexadecimal: ${hex}</p>
      <p>Valor ${valor} en IEEE 754 binario: ${binary}</p>`;
  } else if (seleccion === "ejercicio10") {
    const hexadecimal = document.getElementById('hexadecimal').value;
    const decimal = parseInt(hexadecimal, 16);

    resultado = `<p>Resultado: ${decimal}</p>`;
  }

  document.getElementById('Flotanteresultado').innerHTML = resultado;
}

function toggleInputs() {
  const seleccion = document.getElementById('seleccion').value;
  const inputsEjercicio9 = document.getElementById('inputs-ejercicio9');
  const inputsEjercicio10 = document.getElementById('inputs-ejercicio10');

  if (seleccion === "ejercicio9") {
    inputsEjercicio9.style.display = "block";
    inputsEjercicio10.style.display = "none";
  } else if (seleccion === "ejercicio10") {
    inputsEjercicio9.style.display = "none";
    inputsEjercicio10.style.display = "block";
  } else {
    inputsEjercicio9.style.display = "none";
    inputsEjercicio10.style.display = "none";
  }
}