/* 
  function -> 선언과 정의가 먼저 이뤄지는것
  자바스크립트 오버로딩x
*/
function add(x, y) {
    return x + y;
}
const result = add(10, 20);
console.log(result);

function add(x, y, z) {
    console.log(x);
    console.log(y);
    console.log(z);
}
add(10, 20, 30);
/* 
  정의를 우선적으로 실행
  function add(x, y) {
      return x + y;
  } 정의 (1번)
      
  const result (7번) = add(10, 20); (3번)
  console.log(result); (8번)
  
  function add(x, y, z) {
      console.log(x); (4번 / 10번)
      console.log(y); (5번 / 11번)
      console.log(z); (6번 / 12번)
  } 정의 (2번)
      
  add(10, 20, 30); (9번)
  
  실행 순서 번호
*/

