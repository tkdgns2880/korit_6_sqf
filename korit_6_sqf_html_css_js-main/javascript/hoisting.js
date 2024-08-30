/* 
  console.log(a);
  var a;
  a = 10;

  var a; console.log(a); a = 10; 순대로 실행
*/

console.log(a);

var a;

a = 10;

var b = 10;
console.log(b);

var b = 20;
console.log(b);

let c = 30;
console.log(c);
c = 40;
/* let c = 40;(재선언)은 안되지만 c = 40;(재할당)은 가능하다 */

const d = 50;
console.log(d);
// d = 60;
// console.log(d);