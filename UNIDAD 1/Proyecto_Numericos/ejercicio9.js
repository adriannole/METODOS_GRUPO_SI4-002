const valor1 = 10.25;
const valor2 = 6.75;

// REPRESENTACION ESTANDAR PUNTO FLOTANTE IEEE 754
const flotante1 = Float32Array.from([valor1])[0];
const flotante2 = Float32Array.from([valor2])[0];

const hexA = flotante1.toString(16);
const hexB = flotante2.toString(16);

const binaryA = flotante1.toString(2);
const binaryB = flotante2.toString(2);

console.log(`Valor 10.25 en IEEE 754 hexadecimal: ${hexA}`);
console.log(`Valor 10.25 en IEEE 754 binario: ${binaryA}`);

console.log(`Valor 6.75 en IEEE 754 hexadecimal: ${hexB}`);
console.log(`Valor 6.75 en IEEE 754 binario: ${binaryB}`);

// SUMA VALORES
const sum = valor1 + valor2;
const floatSum = Float32Array.from([sum])[0];
const sumHexadecimal = floatSum.toString(16);
const sumBinario = floatSum.toString(2);

console.log(`Suma 10.25 + 6.75 en IEEE 754 hexadecimal: ${sumHexadecimal}`);
console.log(`Suma 10.25 + 6.75 en IEEE 754 binario: ${sumBinario}`);