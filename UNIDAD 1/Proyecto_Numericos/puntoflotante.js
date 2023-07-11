function ejecutarEjercicio() {
    const seleccion = document.getElementById('seleccion').value;
    let resultado = "";

    if (seleccion === "ejercicio9") {
      const valor1 = 10.25;
      const valor2 = 6.75;

      // REPRESENTACION ESTANDAR PUNTO FLOTANTE IEEE 754
      const flotante1 = Float32Array.from([valor1])[0];
      const flotante2 = Float32Array.from([valor2])[0];

      const hexA = flotante1.toString(16);
      const hexB = flotante2.toString(16);

      const binaryA = flotante1.toString(2);
      const binaryB = flotante2.toString(2);

      resultado = `
        <p>Valor 10.25 en IEEE 754 hexadecimal: ${hexA}</p>
        <p>Valor 10.25 en IEEE 754 binario: ${binaryA}</p>
        <p>Valor 6.75 en IEEE 754 hexadecimal: ${hexB}</p>
        <p>Valor 6.75 en IEEE 754 binario: ${binaryB}</p>`;
    } else if (seleccion === "ejercicio10") {
      const bits = 0xBF400000;
      const floatArray = new Uint32Array([bits]);
      const floatView = new Float32Array(floatArray.buffer);
      const value = floatView[0];
      resultado = `<p>Resultado: ${value}</p>`;
    }

    document.getElementById('resultado').innerHTML = resultado;
  }

  function toggleMenu() {
    const seleccion = document.getElementById('seleccion');
    seleccion.size = seleccion.size === 1 ? 2 : 1;
  }